package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class e0 extends g2l {
   private i2[] k5;
   private final u5w[] u3;
   private final a6y[] a6;

   public e0(t9z[] var1) {
      this.k5 = new i2[var1.length];
      double var2 = n5(com.aspose.slides.ms.System.u3.n5(var1));
      if (var2 > 0.0) {
         for (int var4 = 0; var4 < this.k5.length; var4++) {
            t9z var5 = var1[var4];
            this.k5[var4] = new i2(var5, com.aspose.slides.ms.System.q1.n5(var5.n5()) / var2);
         }

         this.l6(var2);
         List var11 = new List();
         List var15 = new List();

         for (int var6 = 0; var6 < var1.length; var6++) {
            t9z var7 = var1[var6];
            i2 var8 = this.k5[var6];
            if (var7.t9() != null && var7.t9().y4() && var8.t2() > 0.0) {
               u5w var9 = new u5w(var8, var7);
               var11.addItem(var9);
               a6y var10 = new a6y(var7);
               var15.addItem(var10);
            }
         }

         this.u3 = (u5w[])var11.toArray(new u5w[0]);
         this.a6 = (a6y[])var15.toArray(new a6y[0]);
      } else {
         this.u3 = new u5w[0];
         this.k5 = new i2[0];
         this.a6 = new a6y[0];
      }

      for (i2 var22 : this.k5) {
         this.n5(var22);
      }

      for (a6y var23 : this.a6) {
         this.n5(var23);
      }

      for (u5w var24 : this.u3) {
         this.n5(var24);
      }
   }

   @Override
   protected f6d[] k5() {
      return this.k5;
   }

   @Override
   protected void n5(z5 var1) {
      a9v var2 = (a9v)var1;
      float var3 = var2.a6();

      for (i2 var7 : this.k5) {
         double var8 = com.aspose.slides.ms.System.q1.n5(var7.s7()) / this.h0();
         a9v var10 = new a9v(var2.n5(), var2.l6() * (float)var8, var2.u3(), var3);
         var7.n3(var10);
         var3 += var7.d5();
      }

      for (u5w var17 : this.u3) {
         var17.n3(var17.e2());
      }

      for (a6y var18 : this.a6) {
         var18.n3(var1);
      }
   }

   @Override
   protected void l6(z5 var1) {
      float var2 = 0.0F;

      for (i2 var6 : this.k5) {
         var6.u9(var2);
         var2 += var6.d5();
         var6.t1();
      }

      this.n5((a9v)var1);
      this.u3();
   }

   private void n5(a9v var1) {
      com.aspose.slides.internal.o9b.y1 var2 = new com.aspose.slides.internal.o9b.y1(-var1.u3(), -var1.a6(), this.y2().d2(), this.y2().d5());

      for (int var3 = 0; var3 < this.u3.length; var3++) {
         u5w var4 = this.u3[var3];
         i2 var5 = var4.m1();
         com.aspose.slides.internal.o9b.w1 var6 = new com.aspose.slides.internal.o9b.w1();
         float var7 = 3.0F;
         switch (var4.c8()) {
            case -1:
            case 0:
            case 1:
            case 3:
            case 5:
            case 6:
            default:
               var6 = new com.aspose.slides.internal.o9b.w1(var5.p8() + var5.d2() + 3.0F + var4.d2() / 2.0F, var5.i1().k5());
               break;
            case 2:
               var5.i1().n5(var6);
               break;
            case 4:
               var6 = new com.aspose.slides.internal.o9b.w1(var5.i1().l6(), var5.f2() + 3.0F + var4.d5() / 2.0F);
         }

         com.aspose.slides.internal.o9b.w1 var8 = var4.n5(var6.u3(), var2.y4()).u3();
         var4.a6(var8.l6());
         var4.u9(var8.k5());
         var4.t1();
         this.a6[var3].n5(var4.t2() != 0.0F || var4.s7() != 0.0F);
      }
   }

   private void u3() {
      for (int var1 = 0; var1 < this.a6.length; var1++) {
         a6y var2 = this.a6[var1];
         if (var2.u3()) {
            u5w var3 = this.u3[var1];
            i2 var4 = var3.m1();
            com.aspose.slides.internal.o9b.w1[] var5 = new com.aspose.slides.internal.o9b.w1[]{
               new com.aspose.slides.internal.o9b.w1(var4.p8(), var4.i1().k5()), new com.aspose.slides.internal.o9b.w1(var4.p8() + var4.d2(), var4.i1().k5())
            };
            var2.n5(var2.n5(var3.e5().y4(), var5, var3.t4()));
         }

         var2.t1();
      }
   }

   @Override
   protected void n5(double var1, f6d[] var3) {
      this.l6 = var1;
      this.n5(0.0);

      for (int var4 = 0; var4 < var3.length; var4++) {
         f6d var5 = var3[var4];
         double var6 = com.aspose.slides.ms.System.q1.n5(var5.s7());
         this.n5(this.h0() + var6);
         var5.n5(var6 / var1);
      }
   }

   @Override
   protected void l6() {
      for (v6g var4 : this.a0()) {
         var4.U_();
      }
   }
}
