package com.aspose.slides;

class f2f extends g3c {
   private boolean n5;
   private int l6;

   public final int k5() {
      return this.l6;
   }

   public final boolean u3() {
      return this.n5;
   }

   public final boolean a6() {
      return this.x8().u3();
   }

   public final double u9() {
      return this.x8().n5();
   }

   public final int c8() {
      return this.x8().k5();
   }

   public final boolean t2() {
      return this.x8().a6();
   }

   public final com.aspose.slides.internal.k4y.w6u[] s7() {
      return this.x8().u9() != null ? this.x8().u9().n5() : null;
   }

   public f2f(com.aspose.slides.internal.k4y.r6v var1) {
      if ("conn".equals(var1.l6())) {
         this.n5 = true;
         this.l6 = -1;
      } else {
         this.l6 = "none".equals(var1.l6()) ? -1 : com.aspose.slides.internal.k4y.b9.n5(var1.l6());
      }
   }

   private com.aspose.slides.internal.k4y.r6v x8() {
      return (com.aspose.slides.internal.k4y.r6v)this.q0();
   }
}
