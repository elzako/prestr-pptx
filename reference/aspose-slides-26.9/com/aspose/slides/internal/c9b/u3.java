package com.aspose.slides.internal.c9b;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.x4g.m1;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;

public class u3 {
   public static m1 n5(m1 var0) {
      m1 var1 = var0.u9();
      var1.h0();
      return var1;
   }

   public static Shape n5(m1 var0, Shape var1) {
      if (var1 == null) {
         return null;
      }

      if (var0 == null) {
         var0 = new m1();
      }

      return var0.t2().createTransformedShape(var1);
   }

   public static float[] l6(m1 var0) {
      float[] var1 = var0.n5();
      float[] var2 = n5(new float[]{var1[0], var1[1], var1[2], var1[3]});
      return var2.length == 2 ? var2 : n5(new float[]{var1[0], var1[2], var1[1], var1[3]});
   }

   private static float[] n5(float[] var0) {
      if (var0[1] == 0.0F && var0[2] == 0.0F) {
         return new float[]{var0[0], var0[3]};
      }

      float var1 = (float)Math.sqrt(var0[2] * var0[2] + var0[3] * var0[3]);
      float var2 = (float)Math.sqrt(var0[0] * var0[0] + var0[1] * var0[1]);
      float var3 = Math.signum(var0[0]);
      float var4 = Math.signum(var0[3]);
      if (var3 != 0.0F && var4 != 0.0F && n5(var2 * var3, var1 * var4, var0)) {
         return new float[]{var2 * var3, var1 * var4};
      }

      if (!n5(var2, var1, var0)) {
         if (n5(-var2, var1, var0)) {
            var2 = -var2;
         } else if (n5(var2, -var1, var0)) {
            var1 = -var1;
         } else {
            if (!n5(-var2, -var1, var0)) {
               var2 = var0[0];
               var1 = var0[3];
               return new float[]{var2, var1, 0.0F};
            }

            var2 = -var2;
            var1 = -var1;
         }
      }

      return new float[]{var2, var1};
   }

   private static boolean n5(float var0, float var1, float[] var2) {
      float var3 = (var2[3] == 0.0F ? 0.0F : var2[3]) / var1;
      float var4 = (var2[2] == 0.0F ? 0.0F : var2[2]) / var1;
      float var5 = (var2[0] == 0.0F ? 0.0F : var2[0]) / var0;
      float var6 = (var2[1] == 0.0F ? 0.0F : var2[1]) / var0;
      float var7 = 1.0E-4F;
      return !n5(var3, var5, var7) ? false : n5(var4, -var6, var7) && Math.signum(var4) - Math.signum(var6) != 0.0F;
   }

   private static boolean n5(float var0, float var1, float var2) {
      return var0 >= var1 - var2 && var0 <= var1 + var2;
   }

   public static float k5(m1 var0) {
      float[] var1 = var0.n5();
      t2 var2 = new t2(u3(new m1(var1[0], var1[1], var1[2], var1[3], 0.0F, 0.0F)));
      return (float)var2.n5()[2];
   }

   public static s7 u3(m1 var0) {
      float[] var1 = var0.n5();
      return new s7(new double[][]{{var1[0], var1[1], 0.0}, {var1[2], var1[3], 0.0}, {var1[4], var1[5], 1.0}});
   }

   public static boolean n5(double var0) {
      return var0 >= -1.0E-4F && var0 <= 1.0E-4F;
   }

   public static boolean l6(double var0) {
      return var0 >= 0.9999F && var0 <= 1.0001F;
   }

   public static boolean a6(m1 var0) {
      if (var0 == null) {
         return true;
      }

      float[] var1 = var0.n5();
      return l6(var1[0]) && n5(var1[1]) && n5(var1[2]) && l6(var1[3]) && n5(var1[4]) && n5(var1[5]);
   }

   public static void n5(AffineTransform var0, Point2D[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("Value of 'pts' cannot be null");
      }

      if (var1.length < 1) {
         throw new ArgumentException("Argument 'pts' is invalid");
      }

      Double var2 = new Double();

      for (Point2D var6 : var1) {
         var2.setLocation(var6.getX(), var6.getY());
         var0.transform(var2, var2);
         var6.setLocation(var2.getX(), var2.getY());
      }
   }
}
