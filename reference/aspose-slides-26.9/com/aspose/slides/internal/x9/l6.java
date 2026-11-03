package com.aspose.slides.internal.x9;

import com.aspose.slides.internal.p3.j8;
import com.aspose.slides.internal.p3.p6;
import com.aspose.slides.internal.p3.t1;

public abstract class l6 extends y1 {
   protected com.aspose.slides.internal.v4.k5 t2;
   protected com.aspose.slides.internal.v0.u3 s7;
   protected boolean x8 = false;

   public l6(com.aspose.slides.internal.v4.k5 var1) {
      super(var1);
      this.t2 = var1;
   }

   @Override
   public void t4() {
      com.aspose.slides.internal.v0.h0 var1 = this.t2.n_().c_();
      com.aspose.slides.internal.v0.s7[] var2 = this.t2.e5().n5(var1);
      this.s7 = var1.n5(var2[0], this.t2.e5().n5.l6(this), var2[0].a6());
      this.n5(this.t2.h2());
   }

   @Override
   protected k5 n5(t1 var1) {
      return new k5(this.s7, this.t2.v0().u3(this).c8().l6(this), this.t2.v4(), this.t2.u6(), this.t2.t1(), this.t2.a5(), var1.j5());
   }

   @Override
   public void n5(com.aspose.slides.internal.r4.y4<j8> var1, t1 var2) {
      super.n5(var1, var2);
      if (!this.x8) {
         this.z8().n5(this.t2.f0(), (com.aspose.slides.internal.a0.m1)this.n3);
      }
   }

   protected final void n5(com.aspose.slides.internal.d2.t9 var1) {
      p6.n5(var1, this.t2.y1());
      var1.k5(this.s7.a6() - this.s7.u9());
      var1.n3(this.s7.a6());
      p6.n5(var1, this.s7);
      var1.n5(7, this.t2.b3().o8());
      p6.n5(var1, this.t2.z7());
      p6.n5(var1, this.t2.o0());
   }

   protected final int n5(String var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < var1.length(); var3++) {
         var2 += this.s7.l6(var1.charAt(var3));
      }

      return var2;
   }

   protected final int y1() {
      return this.t2.d2();
   }
}
