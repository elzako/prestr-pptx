package com.aspose.slides;

abstract class h9p extends v6g {
   private x2k n5;
   private n4c l6;
   private LegendEntryProperties k5;
   private boolean u3;

   public final LegendEntryProperties u3() {
      return this.k5;
   }

   public final void n5(boolean var1) {
      this.u3 = var1;
   }

   public final n4c h0() {
      return this.l6;
   }

   protected final void n5(n4c var1) {
      this.l6 = var1;
   }

   public final x2k c8() {
      return this.n5;
   }

   protected final void n5(x2k var1) {
      this.n5 = var1;
   }

   @Override
   public boolean T_() {
      return !this.k5.getHide() && !this.u3;
   }

   public h9p(LegendEntryProperties var1) {
      this.k5 = var1;
   }

   @Override
   protected void n5(z5 var1) {
      if (this.t2().t2() == 0) {
         this.n5.n3(new z5(this.t2().x8(), this.t2().x8()));
         this.l6.n3(new z5(var1.n5() - this.s7() * 2.0F - this.n5.d2(), var1.l6()));
      } else {
         this.n5.n3(new z5(n5(this.t2().t2()), this.t2().x8()));
         this.l6.n3(new z5(var1.n5() - this.n5.d2(), var1.l6()));
      }
   }

   @Override
   protected void l6(z5 var1) {
      com.aspose.slides.internal.o9b.y1[] var2 = this.l6.t9();
      if (var2.length > 0) {
         this.n5.u9(var2[0].k5() / 2.0F - this.n5.d5() / 2.0F);
         this.l6.u9(0.0F);
         this.n5.a6(this.s7());
         this.l6.a6(this.s7() + this.n5.d2() + this.s7());
      }

      this.n5.t1();
      this.l6.t1();
   }

   private float s7() {
      return n5(this.t2().t2(), this.t2().s7());
   }

   static float n5(int var0, float var1) {
      switch (var0) {
         case 1:
            return 2.16F;
         case 2:
            return 2.16F;
         default:
            return var1 * 0.12F;
      }
   }

   @Override
   protected void u3(z5 var1) {
      if (this.l6.d2() + this.l6.b3() > var1.n5()) {
         this.k5(var1.n5());
      } else {
         this.k5(this.l6.d2() + this.l6.b3());
      }

      this.u3(com.aspose.slides.ms.System.q1.n5((float)(this.n5.d5()), (float)(this.l6.o0() + this.l6.d5())));
   }

   static float n5(int var0) {
      return var0 == 2 ? 25.2F : 18.5F;
   }

   final c5w t2() {
      return (c5w)this.y1();
   }
}
