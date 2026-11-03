package com.aspose.slides;

class r4 {
   public static float n5(float var0, float var1, float var2, float var3) {
      float var4 = var1;
      float var5 = var2;
      if (var0 < var5) {
         while (true) {
            float var6 = var4;
            var4 /= var3;
            var5 /= 2.0F;
            if (!(var5 > var0)) {
               float var7 = (var0 - var5) * ((var6 - var4) / var5);
               var4 += var7;
               break;
            }
         }
      } else if (var0 > var5) {
         float var9;
         float var10;
         do {
            var9 = var4;
            var10 = var5;
            var4 *= var3;
            var5 *= 2.0F;
         } while (var5 < var0);

         float var8 = (var0 - var10) * ((var4 - var9) / (var5 - var10));
         var4 = var9 + var8;
      }

      return var4;
   }

   public static float n5(float var0, float var1) {
      float var2 = 0.0F;
      float var3 = 1.6F;
      if (var0 < 24.0F) {
         var3 = 1.7F;
      } else if (var0 >= 24.0F && var0 <= 48.0F) {
         var3 = 1.6F;
      } else if (var0 > 48.0F && var0 <= 96.0F) {
         var3 = 1.55F;
      }

      float var4 = 0.27F;
      float var5 = 48.0F;
      float var6 = n5(var0, var4, var5, var3);
      return var6 * var1;
   }
}
