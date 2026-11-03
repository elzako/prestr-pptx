package com.aspose.slides.internal.b7;

import com.aspose.slides.Collections.Generic.List;

class l8r extends o3i {
   private double n5;
   private com.aspose.slides.internal.o9b.w1[] l6;
   private double[] k5;

   @Override
   public double n5() {
      return this.n5;
   }

   @Override
   public o3i l6() {
      return new l8r(this.n5, this.l6, this.k5);
   }

   @Override
   public o3i n5(double var1) {
      com.aspose.slides.internal.o9b.w1[] var3 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), this.l6.length)
      );
      double[] var4 = new double[this.l6.length];
      com.aspose.slides.internal.o9b.w1 var5 = this.l6[0].u3();

      for (int var6 = 0; var6 < this.l6.length; var6++) {
         com.aspose.slides.internal.o9b.w1 var7 = this.l6[var6].u3();
         com.aspose.slides.internal.o9b.w1 var8 = (var6 == 0 ? this.l6[var6 + 1] : var7).u3();
         v2 var9 = new v2(var5.l6() - var8.l6(), var5.k5() - var8.k5());
         var9.u3().k5(var9);
         var3[var6] = new com.aspose.slides.internal.o9b.w1((float)(var7.l6() - var9.l6() * var1), (float)(var7.k5() + var9.n5() * var1));
         (var6 == 0 ? var5 : var8).n5(var5);
      }

      double var10 = 0.0;

      for (int var12 = 1; var12 < this.l6.length; var12++) {
         var4[var12] = this.n5(var3[var12 - 1].u3(), var3[var12].u3());
         var10 += var4[var12];
      }

      return new l8r(var10, var3, var4);
   }

   @Override
   public k0 l6(double var1) {
      double var3 = 0.0;
      com.aspose.slides.internal.o9b.w1 var5 = new com.aspose.slides.internal.o9b.w1();
      com.aspose.slides.internal.o9b.w1 var6 = new com.aspose.slides.internal.o9b.w1();
      com.aspose.slides.internal.o9b.w1[] var7 = new com.aspose.slides.internal.o9b.w1[]{var5};
      com.aspose.slides.internal.o9b.w1[] var8 = new com.aspose.slides.internal.o9b.w1[]{var6};
      double[] var9 = new double[]{0.0};
      this.n5(var1, var7, var8, var9);
      var7[0].n5(var5);
      var8[0].n5(var6);
      var3 = var9[0];
      return new k0(var5.l6() + (var6.l6() - var5.l6()) * var3, var5.k5() + (var6.k5() - var5.k5()) * var3);
   }

   @Override
   public v2 n5(double var1, double var3, boolean var5) {
      double var6 = 0.0;
      com.aspose.slides.internal.o9b.w1 var8 = new com.aspose.slides.internal.o9b.w1();
      com.aspose.slides.internal.o9b.w1 var9 = new com.aspose.slides.internal.o9b.w1();
      com.aspose.slides.internal.o9b.w1[] var10 = new com.aspose.slides.internal.o9b.w1[]{var8};
      com.aspose.slides.internal.o9b.w1[] var11 = new com.aspose.slides.internal.o9b.w1[]{var9};
      double[] var12 = new double[]{0.0};
      this.n5(var1, var10, var11, var12);
      var10[0].n5(var8);
      var11[0].n5(var9);
      var6 = var12[0];
      v2 var13 = k0.n5(new k0(var8.l6(), var8.k5()), new k0(var9.l6(), var9.k5())).u9();
      var13.u3().k5(var13);
      return var5 ? new v2(-var13.l6() * var3, var13.n5() * var3) : new v2(var13.l6() * var3, -var13.n5() * var3);
   }

   public final l8r n5(l8r var1) {
      com.aspose.slides.internal.o9b.w1[] var2 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), this.l6.length + var1.l6.length - 1)
      );
      double[] var3 = new double[this.k5.length + var1.l6.length - 1];
      System.arraycopy(this.l6, 0, var2, 0, this.l6.length);
      System.arraycopy(var1.l6, 1, var2, this.l6.length, var1.l6.length - 1);
      System.arraycopy(this.k5, 0, var3, 0, this.k5.length);
      System.arraycopy(var1.k5, 1, var3, this.k5.length, var1.k5.length - 1);
      return new l8r(this.n5() + var1.n5(), var2, var3);
   }

   public l8r(k0 var1, k0 var2, k0 var3, k0 var4) {
      this.n5 = this.n5(var1.u3(), var2.u3(), var3.u3(), var4.u3());
   }

   private l8r(double var1, com.aspose.slides.internal.o9b.w1[] var3, double[] var4) {
      this.n5 = var1;
      this.l6 = var3;
      this.k5 = var4;
   }

   private void n5(double var1, com.aspose.slides.internal.o9b.w1[] var3, com.aspose.slides.internal.o9b.w1[] var4, double[] var5) {
      double var6 = 0.0;
      double var8 = var1 * this.n5;
      this.l6[0].n5(var3[0]);

      for (int var10 = 1; var10 < this.l6.length; var10++) {
         this.l6[var10].n5(var4[0]);
         double var11 = this.k5[var10];
         var6 += var11;
         if (var8 <= var6) {
            var5[0] = var11 != 0.0 ? (var11 - (var6 - var8)) / var11 : 0.0;
            return;
         }

         var4[0].n5(var3[0]);
      }

      int var14 = this.l6.length - 1;
      double var15 = this.k5[var14];
      this.l6[var14 - 1].n5(var3[0]);
      this.l6[var14].n5(var4[0]);
      var6 = this.n5 - var15;
      var5[0] = var15 != 0.0 ? (var15 - (var6 - var8)) / var15 : 0.0;
   }

   private double n5(k0 var1, k0 var2, k0 var3, k0 var4) {
      List var5 = new List();
      i1 var6 = new i1();
      List[] var7 = new List[]{var5};
      var6.n5(var1.k5().u3(), var2.k5().u3(), var3.k5().u3(), var4.k5().u3(), var7);
      var5 = var7[0];
      this.l6 = (com.aspose.slides.internal.o9b.w1[])var5.toArray(new com.aspose.slides.internal.o9b.w1[0]);
      this.k5 = new double[var5.size()];
      double var8 = 0.0;

      for (int var10 = 1; var10 < this.l6.length; var10++) {
         this.k5[var10] = this.n5(this.l6[var10 - 1].u3(), this.l6[var10].u3());
         var8 += this.k5[var10];
      }

      return var8;
   }

   private double n5(com.aspose.slides.internal.o9b.w1 var1, com.aspose.slides.internal.o9b.w1 var2) {
      float var3 = var1.l6() - var2.l6();
      float var4 = var1.k5() - var2.k5();
      return com.aspose.slides.ms.System.q1.z3(var3 * var3 + var4 * var4);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public o3i cloneT() {
      return this.l6();
   }

}
