package com.aspose.slides;

public class ColorOperation implements IColorOperation {
   private int n5;
   private float l6;
   private static final float[][] k5 = new float[][]{
      {0.0F, 1.0F},
      {0.0F, 1.0F},
      {0.0F, 0.0F},
      {0.0F, 0.0F},
      {0.0F, 0.0F},
      {0.0F, 1.0F},
      {-1.0F, 1.0F},
      {0.0F, 2147483.8F},
      {0.0F, 360.0F},
      {-360.0F, 360.0F},
      {0.0F, 2147483.8F},
      {0.0F, 1.0F},
      {-1.0F, 1.0F},
      {0.0F, 2147483.8F},
      {0.0F, 1.0F},
      {-1.0F, 1.0F},
      {0.0F, 2147483.8F},
      {0.0F, 1.0F},
      {-1.0F, 1.0F},
      {0.0F, 2147483.8F},
      {0.0F, 1.0F},
      {-1.0F, 1.0F},
      {0.0F, 2147483.8F},
      {0.0F, 1.0F},
      {-1.0F, 1.0F},
      {0.0F, 2147483.8F},
      {0.0F, 0.0F},
      {0.0F, 0.0F}
   };

   public ColorOperation(int op) {
      this.n5(op, 0.0F);
   }

   public ColorOperation(int op, float parameter) {
      this.n5(op, parameter);
   }

   private void n5(int var1, float var2) {
      this.n5 = var1;
      float var3 = 0.0F;
      float var4 = 0.0F;
      if (this.n5 >= 0 && this.n5 < com.aspose.slides.ms.System.u3.n5(k5, 2).a6(0)) {
         var3 = k5[this.n5][0];
         var4 = k5[this.n5][1];
      }

      if (var2 < var3) {
         var2 = var3;
      }

      if (var2 > var4) {
         var2 = var4;
      }

      this.l6 = var2;
   }

   @Override
   public final int getOperationType() {
      return this.n5;
   }

   @Override
   public final float getParameter() {
      return this.l6;
   }

   final void n5(r0s var1) {
      switch (this.n5) {
         case 0:
            float var36 = 1.0F - this.l6;
            var1.l6 = l6(n5(var1.l6) * this.l6 + var36);
            var1.k5 = l6(n5(var1.k5) * this.l6 + var36);
            var1.u3 = l6(n5(var1.u3) * this.l6 + var36);
            break;
         case 1:
            var1.l6 = l6(n5(var1.l6) * this.l6);
            var1.k5 = l6(n5(var1.k5) * this.l6);
            var1.u3 = l6(n5(var1.u3) * this.l6);
            break;
         case 2:
            float[] var35 = new float[]{var1.l6};
            float[] var60 = new float[]{var1.k5};
            float[] var84 = new float[]{var1.u3};
            n5(var35, var60, var84);
            var1.l6 = var35[0];
            var1.k5 = var60[0];
            var1.u3 = var84[0];
            break;
         case 3:
            float[] var34 = new float[]{var1.l6};
            float[] var59 = new float[]{var1.k5};
            float[] var83 = new float[]{var1.u3};
            l6(var34, var59, var83);
            var1.l6 = var34[0];
            var1.k5 = var59[0];
            var1.u3 = var83[0];
            break;
         case 4:
            float var33 = (var1.l6 * 163.0F + var1.k5 * 547.0F + var1.u3 * 54.0F) / 765.0F;
            var1.l6 = var33;
            var1.k5 = var33;
            var1.u3 = var33;
            break;
         case 5:
            var1.n5 = this.l6;
            break;
         case 6:
            var1.n5 = r0s.k5(var1.n5 + this.l6, 0.0F, 1.0F);
            break;
         case 7:
            var1.n5 = r0s.k5(var1.n5 * this.l6, 0.0F, 1.0F);
            break;
         case 8:
            float var30 = 0.0F;
            float var57 = 0.0F;
            float var81 = 0.0F;
            float[] var92 = new float[]{0.0F};
            float[] var100 = new float[]{0.0F};
            float[] var108 = new float[]{0.0F};
            ColorFormat.n5(var1.l6, var1.k5, var1.u3, var92, var100, var108);
            var30 = var92[0];
            var57 = var100[0];
            var81 = var108[0];
            var30 = this.l6;
            var1.n5(var30, var57, var81);
            break;
         case 9:
            float var26 = 0.0F;
            float var55 = 0.0F;
            float var79 = 0.0F;
            float[] var91 = new float[]{0.0F};
            float[] var99 = new float[]{0.0F};
            float[] var107 = new float[]{0.0F};
            ColorFormat.n5(var1.l6, var1.k5, var1.u3, var91, var99, var107);
            var26 = var91[0];
            var55 = var99[0];
            var79 = var107[0];
            var26 += this.l6;
            var26 %= 360.0F;
            if (var26 < 0.0F) {
               var26 += 360.0F;
            }

            var1.n5(var26, var55, var79);
            break;
         case 10:
            float var22 = 0.0F;
            float var53 = 0.0F;
            float var77 = 0.0F;
            float[] var90 = new float[]{0.0F};
            float[] var98 = new float[]{0.0F};
            float[] var106 = new float[]{0.0F};
            ColorFormat.n5(var1.l6, var1.k5, var1.u3, var90, var98, var106);
            var22 = var90[0];
            var53 = var98[0];
            var77 = var106[0];
            var22 *= this.l6;
            var22 %= 360.0F;
            if (var22 < 0.0F) {
               var22 += 360.0F;
            }

            var1.n5(var22, var53, var77);
            break;
         case 11:
            float var20 = 0.0F;
            float var50 = 0.0F;
            float var75 = 0.0F;
            float[] var89 = new float[]{0.0F};
            float[] var97 = new float[]{0.0F};
            float[] var105 = new float[]{0.0F};
            ColorFormat.n5(var1.l6, var1.k5, var1.u3, var89, var97, var105);
            var20 = var89[0];
            var50 = var97[0];
            var75 = var105[0];
            var50 = this.l6;
            var1.n5(var20, var50, var75);
            break;
         case 12:
            float var18 = 0.0F;
            float var47 = 0.0F;
            float var73 = 0.0F;
            boolean var88 = var1.l6 > 0.0F && var1.l6 < 1.0F && var1.l6 == var1.k5 && var1.l6 == var1.u3;
            float[] var96 = new float[]{0.0F};
            float[] var104 = new float[]{0.0F};
            float[] var8 = new float[]{0.0F};
            ColorFormat.n5(var1.l6, var1.k5, var1.u3, var96, var104, var8);
            var18 = var96[0];
            var47 = var104[0];
            var73 = var8[0];
            var47 += this.l6;
            var1.n5(var18, var47, var73);
            if (this.l6 != 0.0F && var88) {
               var1.u3 = 0.0F;
            }
            break;
         case 13:
            float var16 = 0.0F;
            float var44 = 0.0F;
            float var71 = 0.0F;
            float[] var87 = new float[]{0.0F};
            float[] var95 = new float[]{0.0F};
            float[] var103 = new float[]{0.0F};
            ColorFormat.n5(var1.l6, var1.k5, var1.u3, var87, var95, var103);
            var16 = var87[0];
            var44 = var95[0];
            var71 = var103[0];
            var44 *= this.l6;
            var1.n5(var16, var44, var71);
            break;
         case 14:
            float var14 = 0.0F;
            float var42 = 0.0F;
            float var68 = 0.0F;
            float[] var86 = new float[]{0.0F};
            float[] var94 = new float[]{0.0F};
            float[] var102 = new float[]{0.0F};
            ColorFormat.n5(var1.l6, var1.k5, var1.u3, var86, var94, var102);
            var14 = var86[0];
            var42 = var94[0];
            var68 = var102[0];
            var68 = this.l6;
            var1.n5(var14, var42, var68);
            break;
         case 15:
            float var12 = 0.0F;
            float var40 = 0.0F;
            float var65 = 0.0F;
            float[] var85 = new float[]{0.0F};
            float[] var93 = new float[]{0.0F};
            float[] var101 = new float[]{0.0F};
            ColorFormat.n5(var1.l6, var1.k5, var1.u3, var85, var93, var101);
            var12 = var85[0];
            var40 = var93[0];
            var65 = var101[0];
            var65 += this.l6;
            var1.n5(var12, var40, var65);
            break;
         case 16:
            float var10 = 0.0F;
            float var38 = 0.0F;
            float var62 = 0.0F;
            float[] var5 = new float[]{0.0F};
            float[] var6 = new float[]{0.0F};
            float[] var7 = new float[]{0.0F};
            ColorFormat.n5(var1.l6, var1.k5, var1.u3, var5, var6, var7);
            var10 = var5[0];
            var38 = var6[0];
            var62 = var7[0];
            var62 *= this.l6;
            var1.n5(var10, var38, var62);
            break;
         case 17:
            var1.l6 = this.l6;
            break;
         case 18:
            var1.l6 = r0s.k5(var1.l6 + this.l6, 0.0F, 1.0F);
            break;
         case 19:
            var1.l6 = r0s.k5(var1.l6 * this.l6, 0.0F, 1.0F);
            break;
         case 20:
            var1.k5 = this.l6;
            break;
         case 21:
            var1.k5 = r0s.k5(var1.k5 + this.l6, 0.0F, 1.0F);
            break;
         case 22:
            var1.k5 = r0s.k5(var1.k5 * this.l6, 0.0F, 1.0F);
            break;
         case 23:
            var1.u3 = this.l6;
            break;
         case 24:
            var1.u3 = r0s.k5(var1.u3 + this.l6, 0.0F, 1.0F);
            break;
         case 25:
            var1.u3 = r0s.k5(var1.u3 * this.l6, 0.0F, 1.0F);
            break;
         case 26:
            float[] var9 = new float[]{var1.l6};
            float[] var37 = new float[]{var1.k5};
            float[] var61 = new float[]{var1.u3};
            com.aspose.slides.internal.n8e.c8.n5(var9, var37, var61);
            var1.l6 = var9[0];
            var1.k5 = var37[0];
            var1.u3 = var61[0];
            break;
         case 27:
            float[] var2 = new float[]{var1.l6};
            float[] var3 = new float[]{var1.k5};
            float[] var4 = new float[]{var1.u3};
            com.aspose.slides.internal.n8e.c8.l6(var2, var3, var4);
            var1.l6 = var2[0];
            var1.k5 = var3[0];
            var1.u3 = var4[0];
      }
   }

   static void n5(float[] var0, float[] var1, float[] var2) {
      float var3 = com.aspose.slides.ms.System.q1.n5((float)(var0[0]), (float)(com.aspose.slides.ms.System.q1.n5((float)(var1[0]), (float)(var2[0]))));
      var0[0] = var3 - var0[0];
      var1[0] = var3 - var1[0];
      var2[0] = var3 - var2[0];
   }

   static void l6(float[] var0, float[] var1, float[] var2) {
      var0[0] = 1.0F - var0[0];
      var1[0] = 1.0F - var1[0];
      var2[0] = 1.0F - var2[0];
   }

   static float n5(float var0) {
      return var0 <= 0.04045F ? var0 / 12.92F : (float)com.aspose.slides.ms.System.q1.a6((var0 + 0.055) / 1.055, 2.4);
   }

   static float l6(float var0) {
      return var0 <= 0.0031308 ? var0 / 12.92F : (float)(com.aspose.slides.ms.System.q1.a6(var0, 0.4166666666666667) * 1.055 - 0.055);
   }

   @Override
   public boolean equals(Object obj) {
      ColorOperation var2 = com.aspose.slides.internal.v6g.k5.n5(obj, ColorOperation.class);
      return var2 == null
         ? super.equals(obj)
         : this.getOperationType() == var2.getOperationType() && (!this.l6() || this.getParameter() == var2.getParameter());
   }

   @Override
   public int hashCode() {
      int var1 = 17;
      var1 = var1 * 31 + com.aspose.slides.ms.System.s3.n5(this.getOperationType());
      return var1 * 31 + com.aspose.slides.ms.System.n3.n5(this.l6());
   }

   private boolean l6() {
      float var1 = 0.0F;
      float var2 = 0.0F;
      if (this.n5 >= 0 && this.n5 < com.aspose.slides.ms.System.u3.n5(k5, 2).a6(0)) {
         var1 = k5[this.n5][0];
         var2 = k5[this.n5][1];
      }

      return var1 != var2;
   }

   final boolean n5() {
      return this.n5 >= 5 && this.n5 <= 7;
   }
}
