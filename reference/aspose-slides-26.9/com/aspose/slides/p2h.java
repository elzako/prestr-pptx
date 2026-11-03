package com.aspose.slides;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

class p2h {
   static final p2h n5 = new p2h();

   public final String n5(String var1, String var2) {
      try {
         return com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.d1.l6(var2), "data:", (short)3) ? var2 : null;
      } catch (UnsupportedOperationException var4) {
         return null;
      }
   }

   public final com.aspose.slides.internal.z0k.t4 n5(String var1) {
      boolean var2 = false;
      int var3 = "data:".length();
      int var4 = var3;

      while (var4 < var1.length() && var1.charAt(var4) != ',' && var1.charAt(var4) != ';') {
         var4++;
      }

      while (var4 < var1.length() && var1.charAt(var4) == ';') {
         var4++;

         while (var4 < var1.length() && var1.charAt(var4) <= ' ') {
            var4++;
         }

         var3 = var4;

         while (var4 < var1.length() && var1.charAt(var4) != ',' && var1.charAt(var4) != ';') {
            var4++;
         }

         int var5 = var4;

         while (var3 < var5 && var1.charAt(var5 - 1) <= ' ') {
            var5--;
         }

         if ("base64".equals(com.aspose.slides.ms.System.d1.u9(com.aspose.slides.ms.System.d1.l6(var1, var3, var5 - var3)))) {
            var2 = true;
         }
      }

      if (var4 < var1.length() && var1.charAt(var4) == ',') {
         var4++;
         if (var2) {
            return new com.aspose.slides.internal.z0k.e2(com.aspose.slides.ms.System.z3.s7(com.aspose.slides.ms.System.d1.k5(var1, var4)));
         }

         try {
            return new com.aspose.slides.internal.z0k.e2(URLDecoder.decode(com.aspose.slides.ms.System.d1.k5(var1, var4), "UTF-8").getBytes());
         } catch (UnsupportedEncodingException var6) {
            throw new RuntimeException(var6);
         }
      } else {
         return null;
      }
   }
}
