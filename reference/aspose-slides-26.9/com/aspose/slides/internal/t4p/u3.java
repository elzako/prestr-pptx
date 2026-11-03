package com.aspose.slides.internal.t4p;

import com.aspose.slides.internal.z3o.a6;

class u3 implements com.aspose.slides.internal.k3w.k5, com.aspose.slides.internal.t9z.k5 {
   private final l6 n5;
   private boolean l6 = true;
   private float k5;
   private float u3;
   private float a6;
   private float u9;

   u3(l6 var1) {
      this.n5 = var1;
   }

   @Override
   public void n5(float var1, float var2) {
      this.k5 = this.a6 = var1;
      this.u3 = this.u9 = var2;
   }

   @Override
   public void l6(float var1, float var2) {
      if (this.n5.n3 == null) {
         float[] var3 = this.n5.s7.n5(this.a6, this.u9, var1, var2);
         a6 var4 = this.n5.x8.l6(var3[0], var3[1]);
         this.n5.n3 = var4.n5(this.a6, this.u9, var3[0], var3[1]);
      }

      this.a6 = var1;
      this.u9 = var2;
   }

   @Override
   public void n5(float var1, float var2, float var3, float var4) {
      this.a6 = var3;
      this.u9 = var4;
   }

   @Override
   public void n5(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.a6 = var5;
      this.u9 = var6;
   }

   @Override
   public void n5() {
   }

   @Override
   public void l6() {
   }

   @Override
   public void n5(com.aspose.slides.internal.k3w.u3 var1, boolean var2) {
      if (this.l6) {
         if (this.k5()) {
            this.a6();
         }

         this.l6 = false;
      }

      if (var2 && this.u3()) {
         this.u9();
      }
   }

   private boolean k5() {
      return (this.n5.k5 & 240) != 0 ? true : this.n5.a6 != null && this.n5.a6.l6.l6() == this.k5 && this.n5.a6.l6.k5() == this.u3;
   }

   private boolean u3() {
      return (this.n5.u3 & 240) != 0 ? true : this.n5.u9 != null && this.n5.u9.l6.l6() == this.a6 && this.n5.u9.l6.k5() == this.u9;
   }

   private void a6() {
      com.aspose.slides.internal.w9n.n5 var1 = com.aspose.slides.internal.w9n.l6.n5(this.n5.n5, this.n5.l6, true);
      if (var1 != null && this.n5.a6 != null) {
         var1.n5(this.n5.h0, this.n5.a6, this.n5.n3);
      }
   }

   private void u9() {
      com.aspose.slides.internal.w9n.n5 var1 = com.aspose.slides.internal.w9n.l6.n5(this.n5.n5, this.n5.l6, false);
      if (var1 != null && this.n5.u9 != null) {
         var1.l6(this.n5.c8, this.n5.u9, this.n5.n3);
      }
   }
}
