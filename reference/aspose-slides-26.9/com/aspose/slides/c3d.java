package com.aspose.slides;

class c3d extends a4 {
   private com.aspose.slides.internal.k0r.z1n[] n5;
   private com.aspose.slides.ms.System.o5<Integer> l6 = new com.aspose.slides.ms.System.o5<>();
   private ITextFrameFormat k5;

   c3d(ITextFrameFormat var1) {
      this.k5 = var1;
   }

   public final com.aspose.slides.internal.k0r.z1n[] n5() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.internal.k0r.z1n[] var1) {
      this.n5 = var1;
      this.k5();
   }

   public final com.aspose.slides.ms.System.o5<Integer> l6() {
      return this.l6;
   }

   public final void n5(com.aspose.slides.ms.System.o5<Integer> var1) {
      var1.n5(this.l6);
      this.k5();
   }

   private void k5() {
      if (com.aspose.slides.internal.v6g.k5.l6(this.k5, PVIObject.class)) {
         ((PVIObject)this.k5).k7();
      }
   }
}
