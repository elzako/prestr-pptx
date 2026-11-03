package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;

class m9b {
   public static FontData n5(com.aspose.slides.internal.k4y.q5v var0) {
      if (var0 == null) {
         return new FontData((String)null);
      }

      String var1 = var0.l6();
      byte[] var2 = null;
      if (var1 != null && !"".equals(var1)) {
         var2 = new byte[10];

         for (int var3 = 0; var3 < var2.length; var3++) {
            int var4 = var3 * 2;
            byte var5 = n5(var1.charAt(var4));
            byte var6 = n5(var1.charAt(var4 + 1));
            var2[var3] = (byte)(((var5 & 255) << 4) + (var6 & 255));
         }
      }

      return new FontData(var0.n5(), var0.u3(), var0.k5(), 0, var2);
   }

   private static byte n5(char var0) {
      if (var0 <= '9') {
         if (var0 >= '0') {
            return (byte)(var0 - '0');
         } else {
            throw new Exception("Not hex value.");
         }
      } else if (var0 <= 'F') {
         if (var0 >= 'A') {
            return (byte)(var0 - 'A' + 10);
         } else {
            throw new Exception("Not hex value.");
         }
      } else if (var0 >= 'a' && var0 <= 'f') {
         return (byte)(var0 - 'a' + 10);
      } else {
         throw new Exception("Not hex value.");
      }
   }

   public static void n5(IFontData var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.q5v> var1) {
      if (var0 != null) {
         n5(var0, (com.aspose.slides.internal.k4y.q5v)var1.invoke());
      }
   }

   public static void n5(IFontData var0, com.aspose.slides.internal.k4y.q5v var1) {
      if (var0 == null) {
         var1.n5("");
      } else {
         String var2 = var0.getFontName();
         if (var2 == null) {
            var2 = "";
         }

         var1.n5(var2);
         n5((FontData)var0, var1);
      }
   }

   private static void n5(FontData var0, com.aspose.slides.internal.k4y.q5v var1) {
      byte[] var2 = var0.k5();
      if (var2 != null) {
         String var3 = com.aspose.slides.ms.System.d1.n5(
            "{0:x2}{1:x2}{2:x2}{3:x2}{4:x2}{5:x2}{6:x2}{7:x2}{8:x2}{9:x2}",
            var2[0],
            var2[1],
            var2[2],
            var2[3],
            var2[4],
            var2[5],
            var2[6],
            var2[7],
            var2[8],
            var2[9]
         );
         var1.l6(var3);
      }

      var1.n5(var0.l6());
      var1.l6(var0.n5());
   }
}
