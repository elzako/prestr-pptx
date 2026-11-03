package com.aspose.slides.internal.w4c;

import com.aspose.slides.internal.e3j.u3;
import com.aspose.slides.internal.e3j.u9;
import com.aspose.slides.internal.o9b.c8;
import com.aspose.slides.internal.o9b.w1;

public class k5 implements l6 {
   public w1 n5;
   public w1 l6;
   public w1 k5;
   public c8 u3;
   public c8 a6;
   public u3 u9;
   public u3 h0;
   public u3 c8;
   public double t2;
   public double s7;
   public double x8;
   public u3 n3;
   public u3 y4;
   public u3 e2;
   public double t9;
   public double z1;
   public double t4;
   public double q0;
   public double z3;
   public double m1;
   public double k7;

   public k5(w1 var1, w1 var2, w1 var3, c8 var4, c8 var5) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
      this.a6 = var5;
      this.u9 = new u3(this.n5, com.aspose.slides.internal.e3j.u9.l6(this.l6, this.k5));
      this.h0 = new u3(this.l6, com.aspose.slides.internal.e3j.u9.l6(this.n5, this.k5));
      this.c8 = new u3(this.k5, com.aspose.slides.internal.e3j.u9.l6(this.n5, this.l6));
      this.t2 = com.aspose.slides.internal.e3j.u9.n5(this.n5, com.aspose.slides.internal.e3j.u9.l6(this.l6, this.k5));
      this.s7 = com.aspose.slides.internal.e3j.u9.n5(this.l6, com.aspose.slides.internal.e3j.u9.l6(this.n5, this.k5));
      this.x8 = com.aspose.slides.internal.e3j.u9.n5(this.k5, com.aspose.slides.internal.e3j.u9.l6(this.n5, this.l6));
      this.n3 = new u3(this.n5, this.l6);
      this.y4 = new u3(this.n5, this.k5);
      this.e2 = new u3(this.l6, this.k5);
      this.t9 = var2.k5() - var3.k5();
      this.z1 = var3.l6() - var2.l6();
      this.t4 = var3.k5() - var1.k5();
      this.q0 = var1.l6() - var3.l6();
      this.z3 = this.t9 * this.q0 - this.z1 * this.t4;
      this.m1 = Math.min(this.z3, 0.0);
      this.k7 = Math.max(this.z3, 0.0);
   }

   @Override
   public boolean n5(double var1, double var3) {
      return com.aspose.slides.internal.e3j.u9.n5(this.t9, this.z1, this.t4, this.q0, this.z3, this.m1, this.k7, this.k5, var1, var3);
   }

   @Override
   public boolean l6(double var1, double var3) {
      float var5 = 0.5F;
      if (com.aspose.slides.internal.e3j.u9.n5(this.t9, this.z1, this.t4, this.q0, this.z3, this.m1, this.k7, this.k5, var1 - 0.5, var3 - 0.5)) {
         return true;
      } else if (com.aspose.slides.internal.e3j.u9.n5(this.t9, this.z1, this.t4, this.q0, this.z3, this.m1, this.k7, this.k5, var1 + 0.5, var3 - 0.5)) {
         return true;
      } else {
         return com.aspose.slides.internal.e3j.u9.n5(this.t9, this.z1, this.t4, this.q0, this.z3, this.m1, this.k7, this.k5, var1 + 0.5, var3 + 0.5)
            ? true
            : com.aspose.slides.internal.e3j.u9.n5(this.t9, this.z1, this.t4, this.q0, this.z3, this.m1, this.k7, this.k5, var1 - 0.5, var3 + 0.5);
      }
   }
}
