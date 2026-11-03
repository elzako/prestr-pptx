package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;

class j2x {
   private static final com.aspose.slides.internal.n8e.k8<Byte, Byte> l6 = new com.aspose.slides.internal.n8e.k8<>();
   public static final c4[] n5 = new c4[0];
   private u3k k5 = new u3k();
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("xl", "xt", "xr", "xb", "yl", "yt", "yr", "yb");

   public j2x(GeometryShape var1) {
      var1.u9().n5(this.n5());
   }

   public j2x() {
      this.l6(-1);
   }

   public j2x(u3k var1) {
      this.k5 = var1;
   }

   final u3k n5() {
      return this.k5;
   }

   final y2[] l6() {
      return this.n5().n5();
   }

   final void n5(y2[] var1) {
      this.n5().n5(var1);
   }

   final i4w[] k5() {
      return this.n5().l6();
   }

   final void n5(i4w[] var1) {
      this.n5().n5(var1);
   }

   final c4[] u3() {
      return this.n5().k5();
   }

   final void n5(c4[] var1) {
      this.n5().n5(var1);
   }

   final r8e[] a6() {
      return this.n5().u3();
   }

   final void n5(r8e[] var1) {
      this.n5().n5(var1);
   }

   final q7g[] u9() {
      return this.n5().a6();
   }

   final void n5(q7g[] var1) {
      this.n5().n5(var1);
   }

   final y1[] h0() {
      return this.n5().u9();
   }

   final void n5(y1[] var1) {
      this.n5().n5(var1);
   }

   final y1[] c8() {
      return this.n5().h0();
   }

   final void l6(y1[] var1) {
      this.n5().l6(var1);
   }

   final int t2() {
      return this.n5().c8();
   }

   final void n5(int var1) {
      this.n5().n5(var1);
   }

   final u3k s7() {
      return this.n5().t2();
   }

   final void n5(u3k var1) {
      this.n5().n5(var1);
   }

   final int x8() {
      return this.t2();
   }

   final void l6(int var1) {
      if (this.t2() != var1 && var1 != 0) {
         if (this.t2() == 0) {
            this.n5((y2[])null);
            this.n5((i4w[])null);
            this.n5(n5);
            this.n5((r8e[])null);
            this.n5((q7g[])null);
            this.n5((y1[])null);
            this.l6((y1[])null);
         }

         this.n5(var1);
         this.n5(c3u.n5(this.t2()));
         if (this.s7() != null) {
            this.n5(l6(this.s7().n5()));
         }
      }
   }

   final GeometryPath[] n5(float var1, float var2, float var3, float var4) {
      u3k var5 = this.n5();
      if (this.t2() != 0) {
         var5 = this.s7();
      }

      if (var5 == null) {
         throw new NotImplementedException("Shape template not found");
      }

      q7g[] var6 = var5.a6();
      byte[] var7 = null;
      double[] var8 = null;
      byte[][] var9 = new byte[][]{var7};
      double[][] var10 = new double[][]{var8};
      this.n5(var3 * 12700.0F, var4 * 12700.0F, var9, var10);
      var7 = var9[0];
      var8 = var10[0];
      GeometryPath[] var11 = new GeometryPath[var6.length];

      for (int var12 = 0; var12 < var6.length; var12++) {
         var11[var12] = var6[var12].n5(this.n5(), var8, var7, var1 * 12700.0F, var2 * 12700.0F, var3 * 12700.0F, var4 * 12700.0F);
      }

      return var11;
   }

   final ShapeElement[] n5(Shape var1, float var2, float var3, float var4, float var5) {
      u3k var6 = this.n5();
      if (this.t2() != 0) {
         var6 = this.s7();
      }

      if (var6 == null) {
         com.aspose.slides.internal.x4g.s7 var14 = new com.aspose.slides.internal.x4g.s7();
         var14.l6(new com.aspose.slides.internal.o9b.y1(var2, var3, var4, var5));
         var14.t9();
         var14.l6(var2, var3, var2 + var4, var3 + var5);
         var14.t9();
         var14.l6(var2, var3 + var5, var2 + var4, var3);
         return new ShapeElement[]{new ShapeElement(var1, var14, 0, false, (byte)0, (byte)0, null)};
      }

      q7g[] var7 = var6.a6();
      ShapeElement[] var8 = new ShapeElement[var7.length];
      byte[] var9 = null;
      double[] var10 = null;
      byte[][] var11 = new byte[][]{var9};
      double[][] var12 = new double[][]{var10};
      this.n5(var4 * 12700.0F, var5 * 12700.0F, var11, var12);
      var9 = var11[0];
      var10 = var12[0];

      for (int var13 = 0; var13 < var7.length; var13++) {
         var8[var13] = new ShapeElement(
            var1,
            var7[var13].l6(this.n5(), var10, var9, var2 * 12700.0F, var3 * 12700.0F, var4 * 12700.0F, var5 * 12700.0F),
            0,
            !var7[var13].u3(),
            l6.l6(var7[var13].a6()),
            (byte)(var7[var13].u9() ? 1 : 0),
            null
         );
      }

      return var8;
   }

   final com.aspose.slides.internal.o9b.y1 n5(d2k var1, d2k var2) {
      u3k var3 = this.n5();
      if (this.t2() != 0) {
         var3 = this.s7();
      }

      if (var3 == null) {
         return new com.aspose.slides.internal.o9b.y1(var1.n5, var1.l6, var2.n5, var2.l6);
      }

      byte[] var4 = null;
      double[] var5 = null;
      double var6 = 12700.0;
      byte[][] var8 = new byte[][]{var4};
      double[][] var9 = new double[][]{var5};
      this.n5((float)(var2.n5 * var6), (float)(var2.l6 * var6), var8, var9);
      var4 = var8[0];
      var5 = var9[0];
      double var10 = var1.n5;
      double var12 = var1.n5 + var2.n5;
      double var14 = var1.l6;
      double var16 = var1.l6 + var2.l6;
      if (var3.u9() != null) {
         var10 = (var3.n5(var5, var4, var3.u9()[0].n5()) + var1.n5 * var6) / var6;
         var14 = (var3.n5(var5, var4, var3.u9()[0].l6()) + var1.l6 * var6) / var6;
      }

      if (var3.h0() != null) {
         var12 = (var3.n5(var5, var4, var3.h0()[0].n5()) + var1.n5 * var6) / var6;
         var16 = (var3.n5(var5, var4, var3.h0()[0].l6()) + var1.l6 * var6) / var6;
      }

      return new com.aspose.slides.internal.o9b.y1((float)var10, (float)var14, (float)(var12 - var10), (float)(var16 - var14));
   }

   final com.aspose.slides.internal.o9b.w1[] l6(float var1, float var2, float var3, float var4) {
      u3k var5 = this.n5();
      if (this.t2() != 0) {
         var5 = this.s7();
      }

      com.aspose.slides.internal.o9b.w1[] var6 = null;
      if (var5 != null) {
         byte[] var7 = null;
         double[] var8 = null;
         byte[][] var9 = new byte[][]{var7};
         double[][] var10 = new double[][]{var8};
         this.n5(var3 * 12700.0F, var4 * 12700.0F, var9, var10);
         var7 = var9[0];
         var8 = var10[0];
         i4w[] var11 = var5.l6();
         if (var11 != null) {
            var6 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
               com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), var11.length)
            );

            for (int var12 = 0; var12 < var6.length; var12++) {
               i4w var13 = var11[var12];
               float var14 = var5.n5(var8, var7, var13.n5().n5()) / 12700.0F + var1;
               float var15 = var5.n5(var8, var7, var13.n5().l6()) / 12700.0F + var2;
               var6[var12] = new com.aspose.slides.internal.o9b.w1(var14, var15);
            }
         }
      }

      return var6;
   }

   final float[] n5(float var1, float var2) {
      u3k var3 = this.n5();
      if (this.t2() != 0) {
         var3 = this.s7();
      }

      float[] var4 = null;
      if (var3 != null) {
         byte[] var5 = null;
         double[] var6 = null;
         byte[][] var7 = new byte[][]{var5};
         double[][] var8 = new double[][]{var6};
         this.n5(var1 * 12700.0F, var2 * 12700.0F, var7, var8);
         var5 = var7[0];
         var6 = var8[0];
         i4w[] var9 = var3.l6();
         if (var9 != null) {
            var4 = new float[var9.length];

            for (int var10 = 0; var10 < var4.length; var10++) {
               i4w var11 = var9[var10];
               var4[var10] = var3.l6(var6, var5, var11.l6());
            }
         }
      }

      return var4;
   }

   final void n5(float var1, float var2, byte[][] var3, double[][] var4) {
      u3k var5 = this.n5();
      if (this.t2() != 0) {
         var5 = this.s7();
      }

      this.n5(var1, var2, var5.u3(), var3, var4);
   }

   final void n5(float var1, float var2, r8e[] var3, byte[][] var4, double[][] var5) {
      int var6 = var3 == null ? 0 : var3.length + 11;
      var5[0] = new double[var6];
      var4[0] = new byte[var6];
      if (var6 != 0) {
         var4[0][7] = 1;
         var4[0][8] = 4;
         var4[0][9] = 2;
         var4[0][10] = 8;
         int var7 = 0;
         int var8 = -1;

         for (int var9 = 0; var9 < 11; var9++) {
            var4[0][var9] = (byte)(var4[0][var9] | 16);
         }

         var5[0][0] = 2.16E7;
         var5[0][1] = var1;
         var5[0][2] = var2;
         var5[0][3] = var1 > var2 ? var2 : var1;
         var5[0][4] = var1 > var2 ? var1 : var2;
         var5[0][5] = var1 / 2.0F;
         var5[0][6] = var2 / 2.0F;
         var5[0][7] = 0.0;
         var5[0][8] = 0.0;
         var5[0][9] = var1;
         var5[0][10] = var2;
         int var29 = 10;
         int var10 = -1;
         int var11 = -1;
         int var12 = -1;
         int var13 = -1;

         while (var29 > 0 && var7 < var5[0].length) {
            var8 = var7;
            var7 = var5[0].length;
            var29 = 0;

            for (int var14 = com.aspose.slides.ms.System.q1.n5(var8, 11); var14 < var5[0].length; var14++) {
               if ((var4[0][var14] & 16) != 16) {
                  r8e var15 = var3[var14 - 11];
                  byte var16 = 0;
                  byte var17 = 0;
                  byte var18 = 0;
                  byte[] var19 = new byte[]{0};
                  double var20 = this.n5(var5[0], var4[0], var15.k5(), var19);
                  var16 = var19[0];
                  byte[] var22 = new byte[]{0};
                  double var23 = this.n5(var5[0], var4[0], var15.u3(), var22);
                  var17 = var22[0];
                  byte[] var25 = new byte[]{0};
                  double var26 = this.n5(var5[0], var4[0], var15.a6(), var25);
                  var18 = var25[0];
                  if (!com.aspose.slides.ms.System.d2.k5(var20) && !com.aspose.slides.ms.System.d2.k5(var23) && !com.aspose.slides.ms.System.d2.k5(var26)) {
                     switch (var15.u9()) {
                        case 0:
                           var5[0][var14] = var20 * var23 / var26;
                           break;
                        case 1:
                           var5[0][var14] = var20 + var23 - var26;
                           break;
                        case 2:
                           var5[0][var14] = (var20 + var23) / var26;
                           break;
                        case 3:
                           var5[0][var14] = var20 > 0.0 ? var23 : var26;
                           break;
                        case 4:
                           var5[0][var14] = com.aspose.slides.ms.System.q1.n5(var20);
                           break;
                        case 5:
                           var5[0][var14] = com.aspose.slides.ms.System.q1.u3(var23, var20) / 2.9088820866572157E-7;
                           break;
                        case 6:
                           var5[0][var14] = var20 * com.aspose.slides.ms.System.q1.c8(com.aspose.slides.ms.System.q1.u3(var26, var23));
                           break;
                        case 7:
                           var5[0][var14] = var20 * com.aspose.slides.ms.System.q1.c8(var23 * 2.9088820866572157E-7);
                           break;
                        case 8:
                           var5[0][var14] = com.aspose.slides.ms.System.q1.l6(var20, var23);
                           break;
                        case 9:
                           var5[0][var14] = com.aspose.slides.ms.System.q1.k5(var20, var23);
                           break;
                        case 10:
                           var5[0][var14] = com.aspose.slides.ms.System.q1.z3(var20 * var20 + var23 * var23 + var26 * var26);
                           break;
                        case 11:
                           var5[0][var14] = var20 > var23 ? var20 : (var23 > var26 ? var26 : var23);
                           break;
                        case 12:
                           var5[0][var14] = var20 * com.aspose.slides.ms.System.q1.h0(com.aspose.slides.ms.System.q1.u3(var26, var23));
                           break;
                        case 13:
                           var5[0][var14] = var20 * com.aspose.slides.ms.System.q1.h0(var23 * 2.9088820866572157E-7);
                           break;
                        case 14:
                           var5[0][var14] = com.aspose.slides.ms.System.q1.z3(var20);
                           break;
                        case 15:
                           var5[0][var14] = var20 * com.aspose.slides.ms.System.q1.t2(var23 * 2.9088820866572157E-7);
                           break;
                        case 16:
                           var5[0][var14] = var20;
                     }

                     switch (u3.n5(var15.n5())) {
                        case 0:
                           if (var5[0][var14] > var5[0][7] && var5[0][var14] < var5[0][9]) {
                              var10 = var14;
                           }
                           break;
                        case 1:
                           if (var5[0][var14] > var5[0][7] && var5[0][var14] < var5[0][9]) {
                              var11 = var14;
                           }
                           break;
                        case 2:
                           if (var5[0][var14] > var5[0][7] && var5[0][var14] < var5[0][9]) {
                              var12 = var14;
                           }
                           break;
                        case 3:
                           if (var5[0][var14] > var5[0][7] && var5[0][var14] < var5[0][9]) {
                              var13 = var14;
                           }
                           break;
                        case 4:
                           if (var10 > -1 && var5[0][var14] > var5[0][8] && var5[0][var14] < var5[0][10]) {
                              var5[0][var10] = var5[0][7];
                           }
                           break;
                        case 5:
                           if (var11 > -1 && var5[0][var14] > var5[0][8] && var5[0][var14] < var5[0][10]) {
                              var5[0][var14] = var5[0][8];
                           }
                           break;
                        case 6:
                           if (var12 > -1 && var5[0][var14] > var5[0][8] && var5[0][var14] < var5[0][10]) {
                              var5[0][var12] = var5[0][9];
                           }
                           break;
                        case 7:
                           if (var13 > -1 && var5[0][var14] > var5[0][8] && var5[0][var14] < var5[0][10]) {
                              var5[0][var14] = var5[0][10];
                           }
                     }

                     var4[0][var14] = (byte)(var16 | var17 | var18 | 16);
                     var29++;
                  } else if (var14 < var7) {
                     var7 = var14;
                  }
               }
            }
         }
      }
   }

   private double n5(double[] var1, byte[] var2, long var3, byte[] var5) {
      var5[0] = 0;
      if (var3 > 27273042316900L) {
         return this.l6()[(int)(var3 - 27273042316900L - 1L)].n5();
      }

      if (var3 < -27273042329600L) {
         int var6 = (int)(-27273042329600L - var3 - 1L);
         if ((var2[var6] & 16) == 16) {
            var5[0] = var2[var6];
            return var1[var6];
         } else {
            return Double.NaN;
         }
      } else {
         return var3;
      }
   }

   static y2[] l6(y2[] var0) {
      y2[] var1 = new y2[var0.length];

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1[var2] = new y2(var0[var2]);
      }

      return var1;
   }

   static j2x n5(j2x var0) {
      u3k var1 = new u3k(
         var0.l6(), var0.a6(), var0.k5(), var0.u3(), var0.u9(), var0.h0() == null ? null : var0.h0()[0], var0.c8() == null ? null : var0.c8()[0]
      );
      j2x var2 = new j2x(var1);
      var2.n5().n5(var0.t2());
      var2.n5().n5(c3u.n5(var0.t2()));
      return var2;
   }

   static {
      l6.n5((byte)0, (byte)0);
      l6.n5((byte)1, (byte)1);
      l6.n5((byte)2, (byte)2);
      l6.n5((byte)3, (byte)3);
      l6.n5((byte)4, (byte)4);
      l6.n5((byte)5, (byte)5);
   }
}
