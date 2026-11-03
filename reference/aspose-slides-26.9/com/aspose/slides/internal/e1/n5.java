package com.aspose.slides.internal.e1;

import com.aspose.slides.ms.System.q1;

public class n5 {
   private com.aspose.slides.internal.o9b.w1 n5;
   private com.aspose.slides.internal.o9b.f2 l6;
   private double k5;
   private double u3;

   public n5() {
      this.n5 = com.aspose.slides.internal.o9b.w1.n5.u3();
      this.l6 = com.aspose.slides.internal.o9b.f2.n5.a6();
   }

   public n5(com.aspose.slides.internal.o9b.y1 var1, double var2, double var4) {
      this.n5 = com.aspose.slides.internal.o9b.w1.n5.u3();
      this.l6 = com.aspose.slides.internal.o9b.f2.n5.a6();
      var1.u9().n5(this.n5);
      var1.c8().l6(this.l6);
      this.k5 = var2;
      this.u3 = var4;
   }

   public n5(com.aspose.slides.internal.o9b.y1 var1) {
      this(var1.y4(), 0.0, 360.0);
   }

   public final com.aspose.slides.internal.o9b.w1 n5() {
      return this.n5(com.aspose.slides.internal.c8e.k5.n5(this.a6()));
   }

   public final u3[] l6() {
      int var1 = com.aspose.slides.internal.v6g.k5.u3(q1.n5(this.u9()) / 45.0, 14);
      if (this.u9() % 45.0 != 0.0) {
         var1++;
      }

      var1 = q1.l6(var1, com.aspose.slides.internal.v6g.k5.u3(8.0, 14));
      u3[] var2 = (u3[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(u3.class), var1));
      double var3 = this.a6();
      double var5 = q1.u9(this.u9());

      for (int var7 = 0; var7 < var1; var7++) {
         double var8 = q1.k5(45.0, q1.n5(this.a6() + this.u9() - var3));
         var8 *= var5;
         this.n5(var3, var8).n5(var2[var7]);
         var3 += var8;
      }

      return var2;
   }

   private u3 n5(double var1, double var3) {
      var1 = com.aspose.slides.internal.c8e.k5.n5(var1);
      var3 = com.aspose.slides.internal.c8e.k5.n5(var3);
      double var5 = this.l6(var1);
      double var7 = this.l6(var1 + var3);
      double var9 = var7 - var5;
      double var11 = var9 / 2.0;
      double var13 = q1.h0(var9) * (q1.z3(4.0 + 3.0 * q1.a6(q1.t2(var11), 2.0)) - 1.0) / 3.0;
      u3 var15 = new u3();
      var15.n5(this.n5(var1).u3());
      var15.u3(this.n5(var1 + var3).u3());
      var15.l6(
         new com.aspose.slides.internal.o9b.w1(
            (float)(var15.n5().l6() - var13 * this.h0().l6() * q1.h0(var5)), (float)(var15.n5().k5() + var13 * this.h0().k5() * q1.c8(var5))
         )
      );
      var15.k5(
         new com.aspose.slides.internal.o9b.w1(
            (float)(var15.u3().l6() + var13 * this.h0().l6() * q1.h0(var7)), (float)(var15.u3().k5() - var13 * this.h0().k5() * q1.c8(var7))
         )
      );
      return var15;
   }

   private com.aspose.slides.internal.o9b.w1 n5(double var1) {
      double var3 = this.l6(var1);
      return new com.aspose.slides.internal.o9b.w1(
         (float)(this.c8().l6() + this.h0().l6() * q1.c8(var3)), (float)(this.c8().k5() + this.h0().k5() * q1.h0(var3))
      );
   }

   private double l6(double var1) {
      return q1.u3(1.0 / this.h0().k5() * q1.h0(var1), 1.0 / this.h0().l6() * q1.c8(var1));
   }

   public final com.aspose.slides.internal.o9b.w1 k5() {
      return this.n5;
   }

   public final com.aspose.slides.internal.o9b.f2 u3() {
      return this.l6;
   }

   public final double a6() {
      return this.k5;
   }

   public final double u9() {
      return this.u3;
   }

   public final com.aspose.slides.internal.o9b.f2 h0() {
      return new com.aspose.slides.internal.o9b.f2(this.u3().l6() / 2.0F, this.u3().k5() / 2.0F);
   }

   public final com.aspose.slides.internal.o9b.w1 c8() {
      return new com.aspose.slides.internal.o9b.w1(this.k5().l6() + this.h0().l6(), this.k5().k5() + this.h0().k5());
   }
}
