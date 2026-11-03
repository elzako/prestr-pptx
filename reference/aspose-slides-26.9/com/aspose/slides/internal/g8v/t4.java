package com.aspose.slides.internal.g8v;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class t4 {
   static void n5(String var0) {
      throw new com.aspose.slides.internal.p6w.q0(11001, com.aspose.slides.ms.System.d1.n5("Could not resolve host '{0}'", new Object[]{var0}));
   }

   private static b3 n5(String var0, String var1, String[] var2, String[] var3) {
      b3 var4 = new b3();
      ArrayList var5 = new ArrayList();
      var4.n5(var1);
      var4.n5(var2);

      for (int var6 = 0; var6 < com.aspose.slides.ms.System.u3.n5((Object)(var3)).a6(); var6++) {
         try {
            i1 var7 = i1.n5(var3[var6]);
            if (com.aspose.slides.internal.p6w.h0.a6() && var7.a6() == 23 || com.aspose.slides.internal.p6w.h0.u3() && var7.a6() == 2) {
               var5.addItem(var7);
            }
         } catch (ArgumentNullException var8) {
         }
      }

      if (var5.size() == 0) {
         n5(var0);
      }

      var4.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.ms.System.u3.n5(var5.toArray(com.aspose.slides.internal.v6g.k5.n5(i1.class))), i1[].class));
      return var4;
   }

   static b3 n5(String var0, boolean var1) {
      if (com.aspose.slides.ms.System.d1.a6(var0, "0.0.0.0")) {
         var0 = "127.0.0.1";
         var1 = false;
      }

      if (var1) {
         i1.n5(var0);
      }

      String var2 = null;
      Object var3 = null;
      String[] var4 = null;

      try {
         InetAddress[] var5 = InetAddress.getAllByName(var0);
         if (var5 != null && var5.length > 0) {
            var2 = var5[0].getHostName();
         }

         if (var5 != null && var5.length > 0) {
            var4 = new String[var5.length];

            for (int var6 = 0; var6 < com.aspose.slides.ms.System.u3.n5((Object)(var4)).a6(); var6++) {
               var4[var6] = var5[var6].getHostAddress();
            }
         }
      } catch (UnknownHostException var7) {
         throw new com.aspose.slides.internal.p6w.q0(11001, var7.getMessage());
      }

      return n5(var0, var2, (String[])var3, var4);
   }

   public static b3 l6(String var0) {
      if (var0 == null) {
         throw new ArgumentNullException("hostNameOrAddress");
      }

      a6(var0);
      i1 var1 = null;
      i1[] var2 = new i1[]{var1};
      boolean var3 = var0.length() > 0 && i1.n5(var0, var2);
      var1 = var2[0];
      return var3 ? n5(var1) : u3(var0);
   }

   public static b3 n5(i1 var0) {
      if (var0 == null) {
         throw new ArgumentNullException("address");
      } else {
         return n5(var0.toString(), false);
      }
   }

   public static i1[] k5(String var0) {
      if (var0 == null) {
         throw new ArgumentNullException("hostNameOrAddress");
      }

      a6(var0);
      i1 var1 = null;
      i1[] var2 = new i1[]{var1};
      boolean var3 = var0.length() > 0 && i1.n5(var0, var2);
      var1 = var2[0];
      return var3 ? new i1[]{var1} : l6(var0).n5();
   }

   @Deprecated
   public static b3 u3(String var0) {
      if (var0 == null) {
         throw new ArgumentNullException("hostName");
      }

      if (var0.length() <= 255 && (var0.length() != 255 || var0.charAt(254) == '.')) {
         if (var0.length() == 0) {
            var0 = "localhost";
         }

         try {
            InetAddress[] var1 = InetAddress.getAllByName(var0);
            b3 var2 = new b3();
            if (var1 != null && var1.length > 0) {
               var2.n5(var1[0].getHostName());
               i1[] var3 = new i1[var1.length];

               for (int var4 = 0; var4 < var1.length; var4++) {
                  var3[var4] = i1.n5(var1[var4].getHostAddress());
               }

               var2.n5(var3);
            }

            return var2;
         } catch (UnknownHostException var5) {
            throw new com.aspose.slides.internal.p6w.q0(11001, var5.getMessage());
         }
      } else {
         throw new ArgumentOutOfRangeException("hostName", String.format("The size of hostName is too long. It cannot be longer than %d characters.", 255));
      }
   }

   private static void a6(String var0) {
      if ("0.0.0.0".equals(var0) || "::0".equals(var0)) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "Addresses 0.0.0.0 (IPv4) ", "and ::0 (IPv6) are unspecified addresses. You ", "cannot use them as target address."
            }),
            "hostNameOrAddress"
         );
      }
   }

   static {
      com.aspose.slides.internal.p6w.h0.u9();
   }
}
