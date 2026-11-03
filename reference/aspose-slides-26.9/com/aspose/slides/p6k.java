package com.aspose.slides;

class p6k extends x3 {
   private com.aspose.slides.internal.k4y.x8 n5;
   private ITextFrameFormat l6;
   private long k5;

   p6k(ITextFrameFormat var1) {
      this.l6 = var1;
   }

   final com.aspose.slides.internal.k4y.x8 n5() {
      return this.n5;
   }

   final void n5(com.aspose.slides.internal.k4y.x8 var1) {
      this.n5 = var1;
      this.u3();
   }

   final void n5(p6k var1) {
      if (var1.n5 != null) {
         this.n5 = var1.n5.u3();
      }

      this.u3();
   }

   final boolean l6() {
      return this.n5 != null;
   }

   private void u3() {
      this.k5++;
      if (com.aspose.slides.internal.v6g.k5.l6(this.l6, PVIObject.class)) {
         ((PVIObject)this.l6).k7();
      }
   }

   final long k5() {
      return this.k5;
   }
}
