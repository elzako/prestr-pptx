package com.aspose.slides;

final class m0i extends e8s {
   private MathPhantom n5() {
      return (MathPhantom)this.t2;
   }

   public m0i(MathPhantom var1, c0e var2, w1g var3) {
      super(var1, var2);
      this.n5(var1.getBase(), var3.n5());
   }

   @Override
   protected y1m n5(d2k var1) {
      if (this.h0.size() == 0) {
         return new y1m();
      }

      e8s var2 = this.h0.get_Item(0);
      var2.k5(var1.u3());
      n3y var3 = new n3y();
      var3.n5 = this.n5().getZeroAsc() ? 0.0F : var2.u9().l6.n5;
      var3.l6 = this.n5().getZeroDesc() ? 0.0F : var2.u9().l6.l6;
      y1m var4 = new y1m();
      var4.l6 = var3;
      var4.n5 = this.n5().getZeroWidth() ? 0.0F : var2.u9().n5;
      return var4;
   }

   @Override
   public void n5(v1l var1) {
      if (this.n5().getShow()) {
         super.n5(var1.n5());
      }
   }
}
