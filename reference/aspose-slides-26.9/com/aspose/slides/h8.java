package com.aspose.slides;

class h8 extends a4 {
   private i5 l6;
   final com.aspose.slides.internal.v6g.n5<i5> n5 = new h8$1(this);
   private boolean k5;
   private boolean u3;
   private long a6;
   private ICamera u9;

   public h8(ICamera var1) {
      this.u9 = var1;
   }

   public final boolean n5() {
      return this.k5;
   }

   public final void n5(boolean var1) {
      this.k5 = var1;
      this.k5();
   }

   final boolean l6() {
      return this.u3;
   }

   final void l6(boolean var1) {
      this.u3 = var1;
      this.k5();
   }

   private void k5() {
      this.a6++;
      if (com.aspose.slides.internal.v6g.k5.l6(this.u9, PVIObject.class)) {
         ((PVIObject)this.u9).k7();
      }

      i5 var1 = this.l6;
      if (var1 != null && !this.n5.n5()) {
         var1.n5();
      }
   }

   // $VF: synthetic method
   static i5 n5(h8 var0, i5 var1) {
      return var0.l6 = var1;
   }
}
