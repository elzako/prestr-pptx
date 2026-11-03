package com.aspose.slides;

class n7w extends a4 {
   private boolean n5;
   private boolean l6;
   private IParagraphFormat k5;

   public n7w(IParagraphFormat var1) {
      this.k5 = var1;
   }

   public final boolean n5() {
      return this.n5;
   }

   public final void n5(boolean var1) {
      if (!com.aspose.slides.internal.n8e.v4.n5(Boolean.valueOf(this.n5), var1)) {
         this.n5 = var1;
         this.k5();
      }
   }

   final boolean l6() {
      return this.l6;
   }

   final void l6(boolean var1) {
      if (!com.aspose.slides.internal.n8e.v4.n5(Boolean.valueOf(this.l6), var1)) {
         this.l6 = var1;
         this.k5();
      }
   }

   private void k5() {
      if (com.aspose.slides.internal.v6g.k5.l6(this.k5, PVIObject.class)) {
         ((PVIObject)this.k5).k7();
      }
   }
}
