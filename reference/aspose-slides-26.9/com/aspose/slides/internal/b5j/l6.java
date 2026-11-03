package com.aspose.slides.internal.b5j;

import com.aspose.slides.exceptions.UriFormatException;
import com.aspose.slides.internal.k5.t1;
import com.aspose.slides.internal.k5.u6;
import com.aspose.slides.internal.n2d.t4;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.r8;
import com.aspose.slides.ms.System.z3;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class l6 implements u3 {
   private static byte[] n5(String var0) {
      if (d1.l6(d1.u3(var0, ' ', '\t'), "data:")) {
         com.aspose.slides.internal.r7c.c8 var1 = new com.aspose.slides.internal.r7c.c8("data:(.*);\\s*(.*);*\\s*base64\\s*,\\s*(.*)", 66);
         com.aspose.slides.internal.r7c.u3 var2 = var1.l6(var0);
         if (var2.u3()) {
            return z3.s7(var2.a6().n5(3).k5());
         }
      }

      r8 var5;
      try {
         var5 = new r8(var0);
      } catch (UriFormatException var4) {
         return null;
      }

      if (!var5.c8() && var5.z3()) {
         try {
            com.aspose.slides.internal.z0k.e2 var6 = n5(var5);
            return var6 != null ? var6.toArray() : null;
         } catch (Exception var3) {
            return null;
         }
      } else {
         return t4.n5(var5.z3() ? var5.x8() : var5.m1());
      }
   }

   private static com.aspose.slides.internal.z0k.e2 n5(r8 var0) {
      try {
         HttpURLConnection var1 = (HttpURLConnection)new URL(var0.l6()).openConnection();
         boolean var2 = false;
         int var3 = var1.getResponseCode();
         if (var3 != 200 && (var3 == 302 || var3 == 301 || var3 == 303)) {
            var2 = true;
         }

         if (var2) {
            String var4 = var1.getHeaderField("Location");
            String var5 = var1.getHeaderField("Set-Cookie");
            var1 = (HttpURLConnection)new URL(var4).openConnection();
            var1.setRequestProperty("Cookie", var5);
         }

         try {
            com.aspose.slides.internal.z0k.t4 var24 = com.aspose.slides.internal.z0k.t4.fromJava(var1.getInputStream());

            try {
               byte[] var25;
               if (var24 instanceof com.aspose.slides.internal.v2c.n5) {
                  var25 = ((com.aspose.slides.internal.v2c.n5)var24).toArray();
               } else {
                  var25 = n5(var24);
               }

               return new com.aspose.slides.internal.z0k.e2(var25);
            } finally {
               if (var24 != null) {
                  var24.dispose();
               }
            }
         } finally {
            if (var1.getInputStream() != null) {
               var1.getInputStream().close();
            }

            if (var1 != null) {
               var1.disconnect();
            }
         }
      } catch (MalformedURLException var21) {
         return null;
      } catch (IOException var22) {
         return null;
      } catch (RuntimeException var23) {
         return null;
      }
   }

   private static byte[] n5(com.aspose.slides.internal.z0k.t4 var0) {
      byte[] var1 = new byte[4096];

      while (true) {
         int var2 = var0.read(var1, 0, var1.length);
         if (var2 == 0) {
            return var1;
         }

         var0.write(var1, 0, var2);
      }
   }

   @Override
   public final t1 n5(Object var1, u6 var2) {
      return d1.n5(var2.n5()) ? new t1(null) : new t1(n5(var2.n5()));
   }
}
