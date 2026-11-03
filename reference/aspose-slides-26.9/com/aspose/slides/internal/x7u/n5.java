package com.aspose.slides.internal.x7u;

import java.util.List;

public abstract class n5 implements u9 {
   // $VF: synthetic field
   static final boolean n5 = !n5.class.desiredAssertionStatus();

   @Override
   public boolean n5() {
      return false;
   }

   @Override
   public List<u9> l6() {
      throw new UnsupportedOperationException("Not composite PathAlignment does not support CompoundAlignments");
   }

   @Override
   public boolean k5() {
      return false;
   }

   @Override
   public com.aspose.slides.internal.z3o.a6 n5(float var1, float var2) {
      com.aspose.slides.internal.z3o.a6 var3 = this.l6(var1, var2);
      var3.l6();
      return var3;
   }

   @Override
   public com.aspose.slides.internal.z3o.t2 n5(float[] var1, int var2) {
      float var3 = var1[var2 + 0];
      float var4 = var1[var2 + 1];
      float var5 = var1[var2 + 2];
      float var6 = var1[var2 + 3];
      float var7 = var1[var2 + 4];
      float var8 = var1[var2 + 5];
      float var9 = var7 - var5;
      float var10 = var8 - var6;
      float var11 = var5 - var3;
      float var12 = var6 - var4;
      com.aspose.slides.internal.z3o.a6 var13 = this.l6(var11, var12);
      com.aspose.slides.internal.z3o.a6 var14 = this.l6(var9, var10);
      float[] var15 = new float[6];
      float[] var16 = new float[6];
      var15[0] = var3 + var13.n5;
      var15[1] = var4 + var13.l6;
      var15[4] = var7 + var14.n5;
      var15[5] = var8 + var14.l6;
      var16[0] = var3 + var13.k5;
      var16[1] = var4 + var13.u3;
      var16[4] = var7 + var14.k5;
      var16[5] = var8 + var14.u3;
      float var17 = var15[0];
      float var18 = var15[1];
      float var19 = var15[4];
      float var20 = var15[5];
      com.aspose.slides.internal.k3w.l6.n5(var17, var18, var17 + var11, var18 + var12, var19, var20, var19 - var9, var20 - var10, var15, 2);
      float var21 = var15[2];
      float var22 = var15[3];
      if (n5(var21) && n5(var22)) {
         var16[2] = 2.0F * var5 - var21;
         var16[3] = 2.0F * var6 - var22;
         return new com.aspose.slides.internal.z3o.t2(com.aspose.slides.internal.z3o.c8.l6, var15, var16);
      } else {
         var17 = var16[0];
         var18 = var16[1];
         var19 = var16[4];
         var20 = var16[5];
         com.aspose.slides.internal.k3w.l6.n5(var17, var18, var17 + var11, var18 + var12, var19, var20, var19 - var9, var20 - var10, var16, 2);
         var21 = var16[2];
         var22 = var16[3];
         if (n5(var21) && n5(var22)) {
            var15[2] = 2.0F * var5 - var21;
            var15[3] = 2.0F * var6 - var22;
            return new com.aspose.slides.internal.z3o.t2(com.aspose.slides.internal.z3o.c8.l6, var15, var16);
         } else {
            this.n5(var3, var4, var7, var8, var15, var16);
            return new com.aspose.slides.internal.z3o.t2(com.aspose.slides.internal.z3o.c8.n5, var15, var16);
         }
      }
   }

   @Override
   public com.aspose.slides.internal.z3o.l6 l6(float[] var1, int var2) {
      float var3 = var1[var2 + 0];
      float var4 = var1[var2 + 1];
      float var5 = var1[var2 + 2];
      float var6 = var1[var2 + 3];
      float var7 = var1[var2 + 4];
      float var8 = var1[var2 + 5];
      float var9 = var1[var2 + 6];
      float var10 = var1[var2 + 7];
      float var11 = var9 - var7;
      float var12 = var10 - var8;
      float var13 = var5 - var3;
      float var14 = var6 - var4;
      float[] var15 = new float[8];
      float[] var16 = new float[8];
      boolean var17 = n5(var3, var4, var5, var6, 6.0F * Math.ulp(var6));
      boolean var18 = n5(var7, var8, var9, var10, 6.0F * Math.ulp(var10));
      if (var17 && var18) {
         this.n5(var3, var4, var9, var10, var15, var16);
         return new com.aspose.slides.internal.z3o.l6(com.aspose.slides.internal.z3o.c8.n5, var15, var16);
      }

      if (var17) {
         var13 = var7 - var3;
         var14 = var8 - var4;
      } else if (var18) {
         var11 = var9 - var5;
         var12 = var10 - var6;
      }

      float var19 = var13 * var11 + var14 * var12;
      var19 *= var19;
      float var20 = var13 * var13 + var14 * var14;
      float var21 = var11 * var11 + var12 * var12;
      if (com.aspose.slides.internal.k3w.l6.n5(var19, var20 * var21, 4.0F * Math.ulp(var19))) {
         this.n5(var3, var4, var9, var10, var15, var16);
         return new com.aspose.slides.internal.z3o.l6(com.aspose.slides.internal.z3o.c8.n5, var15, var16);
      } else {
         float var22 = (var3 + 3.0F * (var5 + var7) + var9) / 8.0F;
         float var23 = (var4 + 3.0F * (var6 + var8) + var10) / 8.0F;
         float var24 = var7 + var9 - var3 - var5;
         float var25 = var8 + var10 - var4 - var6;
         com.aspose.slides.internal.z3o.a6 var26 = this.l6(var13, var14);
         com.aspose.slides.internal.z3o.a6 var27 = this.l6(var24, var25);
         com.aspose.slides.internal.z3o.a6 var28 = this.l6(var11, var12);
         float var29 = var3 + var26.n5;
         float var30 = var4 + var26.l6;
         float var31 = var22 + var27.n5;
         float var32 = var23 + var27.l6;
         float var33 = var9 + var28.n5;
         float var34 = var10 + var28.l6;
         float var35 = 4.0F / (3.0F * (var13 * var12 - var14 * var11));
         float var36 = 2.0F * var31 - var29 - var33;
         float var37 = 2.0F * var32 - var30 - var34;
         float var38 = var35 * (var12 * var36 - var11 * var37);
         float var39 = var35 * (var13 * var37 - var14 * var36);
         float var40 = var29 + var38 * var13;
         float var41 = var30 + var38 * var14;
         float var42 = var33 + var39 * var11;
         float var43 = var34 + var39 * var12;
         var15[0] = var29;
         var15[1] = var30;
         var15[2] = var40;
         var15[3] = var41;
         var15[4] = var42;
         var15[5] = var43;
         var15[6] = var33;
         var15[7] = var34;
         var29 = var3 + var26.k5;
         var30 = var4 + var26.u3;
         var31 = var22 + var27.k5;
         var32 = var23 + var27.u3;
         var33 = var9 + var28.k5;
         var34 = var10 + var28.u3;
         var36 = 2.0F * var31 - var29 - var33;
         var37 = 2.0F * var32 - var30 - var34;
         var38 = var35 * (var12 * var36 - var11 * var37);
         var39 = var35 * (var13 * var37 - var14 * var36);
         var40 = var29 + var38 * var13;
         var41 = var30 + var38 * var14;
         var42 = var33 + var39 * var11;
         var43 = var34 + var39 * var12;
         var16[0] = var29;
         var16[1] = var30;
         var16[2] = var40;
         var16[3] = var41;
         var16[4] = var42;
         var16[5] = var43;
         var16[6] = var33;
         var16[7] = var34;
         return new com.aspose.slides.internal.z3o.l6(com.aspose.slides.internal.z3o.c8.k5, var15, var16);
      }
   }

   private void n5(float var1, float var2, float var3, float var4, float[] var5, float[] var6) {
      com.aspose.slides.internal.z3o.a6 var7 = this.l6(var3 - var1, var4 - var2);
      var5[0] = var1 + var7.n5;
      var5[1] = var2 + var7.l6;
      var5[2] = var3 + var7.n5;
      var5[3] = var4 + var7.l6;
      var6[0] = var1 + var7.k5;
      var6[1] = var2 + var7.u3;
      var6[2] = var3 + var7.k5;
      var6[3] = var4 + var7.u3;
   }

   private static boolean n5(float var0) {
      return Float.NEGATIVE_INFINITY < var0 && var0 < Float.POSITIVE_INFINITY;
   }

   private static boolean n5(float var0, float var1, float var2, float var3, float var4) {
      assert var4 > 0.0F : "";
      return com.aspose.slides.internal.k3w.l6.n5(var0, var2, var4) && com.aspose.slides.internal.k3w.l6.n5(var1, var3, var4);
   }
}
