package com.aspose.slides;

class g3o extends x3 {
   private c8c k5;
   final com.aspose.slides.internal.v6g.n5<c8c> n5 = new g3o$1(this);
   static final g3o l6 = new g3o(null);
   private boolean u3;
   private float a6;
   private Backdrop3DScene u9;
   private long h0;
   private IThreeDFormat c8;

   public g3o(IThreeDFormat var1) {
      this.c8 = var1;
      this.u9 = new Backdrop3DScene((r0g)var1);
   }

   public final boolean n5() {
      return this.u3;
   }

   public final void n5(boolean var1) {
      if (!com.aspose.slides.internal.n8e.v4.n5(Boolean.valueOf(this.u3), var1)) {
         this.u3 = var1;
         this.a6();
      }
   }

   public final float l6() {
      return this.a6;
   }

   public final void n5(float var1) {
      if (!com.aspose.slides.internal.n8e.v4.n5(this.a6, var1)) {
         this.a6 = var1;
         this.a6();
      }
   }

   public final IBackdrop3DScene k5() {
      return this.u9;
   }

   public final void n5(g3o var1) {
      if (!com.aspose.slides.internal.n8e.v4.n5(this.u9, var1.u9)
         || !com.aspose.slides.internal.n8e.v4.n5(Boolean.valueOf(this.u3), var1.u3)
         || !com.aspose.slides.internal.n8e.v4.n5(this.a6, var1.a6)) {
         this.u3 = var1.u3;
         this.a6 = var1.a6;
         this.u9.n5(var1.u9);
         this.a6();
      }
   }

   private void a6() {
      this.h0++;
      if (com.aspose.slides.internal.v6g.k5.l6(this.c8, PVIObject.class)) {
         ((PVIObject)this.c8).k7();
      }

      c8c var1 = this.k5;
      if (var1 != null && !this.n5.n5()) {
         var1.n5();
      }
   }

   final long u3() {
      return (this.h0 & 4294967295L) + (this.u9.getVersion() & 4294967295L) & 4294967295L;
   }

   // $VF: synthetic method
   static c8c n5(g3o var0, c8c var1) {
      return var0.k5 = var1;
   }
}
