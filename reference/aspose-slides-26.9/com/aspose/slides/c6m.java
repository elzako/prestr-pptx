package com.aspose.slides;

class c6m extends x3 {
   private boolean n5;
   private com.aspose.slides.internal.k4y.m0l l6;
   private long k5;
   private IParagraphFormat u3;

   public c6m(IParagraphFormat var1) {
      this.u3 = var1;
   }

   public final boolean n5() {
      return this.n5;
   }

   public final void n5(boolean var1) {
      if (!com.aspose.slides.internal.n8e.v4.n5(Boolean.valueOf(this.n5), var1)) {
         this.n5 = var1;
         this.u3();
      }
   }

   public final com.aspose.slides.internal.k4y.m0l l6() {
      return this.l6;
   }

   public final void n5(com.aspose.slides.internal.k4y.m0l var1) {
      this.l6 = var1;
   }

   private void u3() {
      this.k5++;
      if (com.aspose.slides.internal.v6g.k5.l6(this.u3, PVIObject.class)) {
         ((PVIObject)this.u3).k7();
      }
   }

   final long k5() {
      return this.k5;
   }
}
