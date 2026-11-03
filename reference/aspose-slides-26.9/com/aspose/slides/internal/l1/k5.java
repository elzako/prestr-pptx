package com.aspose.slides.internal.l1;

import com.aspose.slides.internal.i7.c8;
import com.aspose.slides.internal.i7.u3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.nio.charset.StandardCharsets;

public abstract class k5 {
   protected abstract HttpURLConnection n5(com.aspose.slides.internal.i7.n5 var1);

   public com.aspose.slides.internal.i7.l6 n5(com.aspose.slides.internal.i7.n5 var1, HttpURLConnection var2) {
      try {
         var2 = this.n5(var1);
         var2.setDoOutput(true);
         var2.connect();
         String var3 = var1.l6();
         OutputStream var4 = var2.getOutputStream();
         var4.write(var3.getBytes("UTF-8"));
         var4.flush();
         var4.close();
         int var5 = var2.getResponseCode();
         StringBuilder var6 = new StringBuilder();
         BufferedReader var7 = new BufferedReader(
            new InputStreamReader(var5 >= 200 && var5 < 300 ? var2.getInputStream() : var2.getErrorStream(), StandardCharsets.UTF_8)
         );

         String var8;
         try {
            while ((var8 = var7.readLine()) != null) {
               var6.append(var8.trim());
            }
         } finally {
            var7.close();
         }

         return this.n5(var5, var6.toString());
      } catch (Exception var18) {
         throw new c8(var18.toString());
      } finally {
         if (var2 != null) {
            var2.disconnect();
         }
      }
   }

   private com.aspose.slides.internal.i7.l6 n5(int var1, String var2) {
      if (var1 < 200 || var1 >= 300) {
         try {
            u3 var6 = u3.n5(var2);
            if (var6 != null && var6.n5() != null) {
               throw new c8(var1, var6.n5().n5());
            }
         } catch (Exception var5) {
         }

         throw new c8(var1, var2);
      } else if (var2 != null && !var2.trim().isEmpty()) {
         try {
            com.aspose.slides.internal.i7.l6 var3 = com.aspose.slides.internal.i7.l6.n5(var2);
            if (var3 == null) {
               throw new c8(var1, "Unable to deserialize AI response.");
            } else {
               return var3;
            }
         } catch (Exception var4) {
            throw new c8(var1, "Unable to deserialize AI response: " + var4.getMessage());
         }
      } else {
         throw new c8(var1, "Unable to deserialize AI response.");
      }
   }
}
