package com.aspose.slides.internal.o9b;

import java.awt.Stroke;
import java.awt.geom.AffineTransform;

final class z7 {
   static z7$k5 n5;

   private static boolean l6(int var0) {
      return var0 == 20 || var0 == 19 || var0 == 18 || var0 == 17 || var0 == 3 || var0 == 1 || var0 == 2;
   }

   public static Stroke n5(
      float var0, int var1, int var2, int var3, float var4, float[] var5, float var6, int var7, AffineTransform var8, AffineTransform var9, int var10, z1 var11
   ) {
      return n5.n5(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   public static Stroke n5(float var0, int var1, int var2, int var3, float var4, float[] var5, float var6, AffineTransform var7, AffineTransform var8, int var9) {
      return n5.n5(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   // $VF: synthetic method
   static boolean n5(int var0) {
      return l6(var0);
   }

   static {
      try {
         Class<com.aspose.slides.internal.x1j.n5> var0 = com.aspose.slides.internal.x1j.n5.class;
         var0.newInstance();
         n5 = new z7$n5();
      } catch (Exception var1) {
         n5 = new z7$l6();
      }
   }
}
