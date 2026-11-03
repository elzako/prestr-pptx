package com.aspose.slides.internal.x1j;

import java.awt.geom.AffineTransform;

final class x8 {
   public static h0 n5(h0 var0, AffineTransform var1) {
      if (var1 == null) {
         return var0;
      }

      float var2 = (float)var1.getScaleX();
      float var3 = (float)var1.getShearX();
      float var4 = (float)var1.getTranslateX();
      float var5 = (float)var1.getShearY();
      float var6 = (float)var1.getScaleY();
      float var7 = (float)var1.getTranslateY();
      if (var3 == 0.0F && var5 == 0.0F) {
         if (var2 == 1.0F && var6 == 1.0F) {
            return var4 == 0.0F && var7 == 0.0F ? var0 : new x8$a6(var0, var4, var7);
         } else {
            return var4 == 0.0F && var7 == 0.0F ? new x8$n5(var0, var2, var6) : new x8$k5(var0, var2, var6, var4, var7);
         }
      } else {
         return var4 == 0.0F && var7 == 0.0F ? new x8$l6(var0, var2, var3, var5, var6) : new x8$u3(var0, var2, var3, var4, var5, var6, var7);
      }
   }

   public static h0 l6(h0 var0, AffineTransform var1) {
      if (var1 == null) {
         return var0;
      } else {
         float var2 = (float)var1.getScaleX();
         float var3 = (float)var1.getShearX();
         float var4 = (float)var1.getShearY();
         float var5 = (float)var1.getScaleY();
         if (var3 != 0.0F || var4 != 0.0F) {
            return new x8$l6(var0, var2, var3, var4, var5);
         } else {
            return var2 == 1.0F && var5 == 1.0F ? var0 : new x8$n5(var0, var2, var5);
         }
      }
   }

   public static h0 k5(h0 var0, AffineTransform var1) {
      if (var1 == null) {
         return var0;
      } else {
         float var2 = (float)var1.getScaleX();
         float var3 = (float)var1.getShearX();
         float var4 = (float)var1.getShearY();
         float var5 = (float)var1.getScaleY();
         if (var3 != 0.0F || var4 != 0.0F) {
            float var6 = var2 * var5 - var3 * var4;
            return new x8$l6(var0, var5 / var6, -var3 / var6, -var4 / var6, var2 / var6);
         } else {
            return var2 == 1.0F && var5 == 1.0F ? var0 : new x8$n5(var0, 1.0F / var2, 1.0F / var5);
         }
      }
   }
}
