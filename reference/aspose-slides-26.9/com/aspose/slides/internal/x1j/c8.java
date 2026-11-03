package com.aspose.slides.internal.x1j;

import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.PathIterator;
import java.util.Arrays;

class c8 {
   public static void n5(PathIterator var0, h0 var1) {
      float[] var2 = new float[6];

      while (!var0.isDone()) {
         switch (var0.currentSegment(var2)) {
            case 0:
               var1.n5(var2[0], var2[1]);
               break;
            case 1:
               var1.l6(var2[0], var2[1]);
               break;
            case 2:
               var1.n5(var2[0], var2[1], var2[2], var2[3]);
               break;
            case 3:
               var1.n5(var2[0], var2[1], var2[2], var2[3], var2[4], var2[5]);
               break;
            case 4:
               var1.n5();
         }

         var0.next();
      }
   }

   public Shape n5(Shape var1, AffineTransform var2, float var3, int var4, int var5, int var6, float var7, float[] var8, float var9, int var10) {
      GeneralPath var11 = new GeneralPath();
      this.n5(var1, var2, var3, c8$n5.n5, var4, var5, var6, var7, var8, var9, var10, new t2(this, var11));
      return var11;
   }

   void n5(Shape var1, AffineTransform var2, float var3, c8$n5 var4, int var5, int var6, int var7, float var8, float[] var9, float var10, int var11, h0 var12) {
      AffineTransform var13 = null;
      Object var14 = null;
      PathIterator var15 = null;
      if (var2 != null && !var2.isIdentity()) {
         double var16 = var2.getScaleX();
         double var18 = var2.getShearX();
         double var20 = var2.getShearY();
         double var22 = var2.getScaleY();
         double var24 = var16 * var22 - var20 * var18;
         if (Math.abs(var24) <= 3.0E-45F) {
            var12.n5(0.0F, 0.0F);
            var12.l6();
            return;
         }

         if (n5(var16 * var18 + var20 * var22, 2) && n5(var16 * var16 + var20 * var20 - (var18 * var18 + var22 * var22), 2)) {
            double var26 = Math.sqrt(var16 * var16 + var20 * var20);
            if (var9 != null) {
               var9 = Arrays.copyOf(var9, var9.length);

               for (int var28 = 0; var28 < var9.length; var28++) {
                  var9[var28] = (float)(var26 * var9[var28]);
               }

               var10 = (float)(var26 * var10);
            }

            var3 = (float)(var26 * var3);
            var15 = var1.getPathIterator(null);
            if (var4 != c8$n5.n5) {
               var15 = new c8$l6(var15, var4);
            }
         } else if (var4 != c8$n5.n5) {
            var13 = var2;
            var15 = var1.getPathIterator(var2);
            var15 = new c8$l6(var15, var4);
         } else {
            var13 = var2;
            var15 = var1.getPathIterator(null);
         }
      } else {
         var13 = var2;
         var15 = var1.getPathIterator(null);
         if (var4 != c8$n5.n5) {
            var15 = new c8$l6(var15, var4);
         }
      }

      var12 = x8.n5(var12, (AffineTransform)var14);
      var12 = x8.l6(var12, var13);
      var12 = new u9(var12, var3, var5, var6, var7, var8, var11);
      if (var9 != null) {
         var12 = new l6(var12, var9, var10);
      }

      var12 = x8.k5(var12, var13);
      l6(var15, var12);
   }

   private static boolean n5(double var0, int var2) {
      return Math.abs(var0) < var2 * a6.n5(var0);
   }

   static void l6(PathIterator var0, h0 var1) {
      n5(var0, var1);
      var1.l6();
   }
}
