package com.aspose.slides.internal.z5p;

import com.aspose.slides.internal.o9b.w1;

public class u3 extends n5 {
   public u3(com.aspose.slides.internal.k3w.a6 var1) {
      super(var1);
   }

   @Override
   public void n5(float var1, float var2) {
      this.n5(false);
      super.n5(var1, var2);
   }

   @Override
   public void n5() {
      if (!com.aspose.slides.internal.e3j.u9.n5(this.k5.a6, this.k5.k5, 1.0E-6F)) {
         this.l6(this.k5.k5.l6(), this.k5.k5.k5());
      }

      for (com.aspose.slides.internal.k3w.h0 var2 : this.u3) {
         this.l6(var2);
      }
   }

   private void l6(com.aspose.slides.internal.k3w.h0 var1) {
      var1.t2 = null;
      var1.s7 = null;
      var1.x8 = null;
      var1.n3 = null;
      this.n5(var1, this.k5.u3, var1.k5);
      this.k5(var1);
      this.a6(var1);
   }

   private void k5(com.aspose.slides.internal.k3w.h0 var1) {
      if (com.aspose.slides.internal.e3j.u9.n5(var1.t2)) {
         this.l6.k5(var1, var1.t2);
         this.l6.n5(var1, var1.s7);
         if (com.aspose.slides.internal.e3j.u9.n5(var1.t2, var1.s7, 0.0F)) {
            var1.a6.a6();
         }
      } else {
         this.u3(var1);
      }

      this.n5(var1);
   }

   private void u3(com.aspose.slides.internal.k3w.h0 var1) {
      com.aspose.slides.internal.v9l.l6 var2 = var1.a6.k5();
      var2.n5(4);
      com.aspose.slides.internal.v9l.l6 var3 = var1.a6.a6();
      var3.n5(2);
      var1.a6.n5(var3);
   }

   private void a6(com.aspose.slides.internal.k3w.h0 var1) {
      if (com.aspose.slides.internal.e3j.u9.n5(var1.x8)) {
         this.l6.u3(var1, var1.x8);
         this.l6.l6(var1, var1.n3);
         this.n5(var1, var1.x8.l6(), var1.x8.k5(), 0.0F, 0.0F);
      } else {
         this.u9(var1);
      }
   }

   private void u9(com.aspose.slides.internal.k3w.h0 var1) {
      com.aspose.slides.internal.v9l.l6 var2 = var1.u9.a6();
      var1.u9.n5(var2);
      var1.u9.u3().n5(2);
   }

   @Override
   protected void n5(com.aspose.slides.internal.k3w.h0 var1, w1 var2, com.aspose.slides.internal.z3o.a6 var3) {
      if (var1.a6.n5() == 0) {
         this.l6(var1, var2, var3);
      }

      boolean var4 = com.aspose.slides.internal.e3j.u9.n5(this.k5.u9.l6(), this.k5.u9.k5(), var2.l6(), var2.k5());
      var1.l6.n5(this.l6, var1, var2, var3, var4);
   }
}
