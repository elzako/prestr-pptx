package com.aspose.slides;

class m2d<TLayout> implements k8l<TLayout> {
   private final c7n n5 = new c7n();
   private TLayout l6;

   public m2d(TLayout var1, c7n var2) {
      this.n5((TLayout)var1);
      var2.n5(this.n5);
   }

   @Override
   public final TLayout n5() {
      return this.l6;
   }

   private void n5(TLayout var1) {
      this.l6 = (TLayout)var1;
   }

   @Override
   public final void n5(e3 var1, com.aspose.slides.internal.o9b.u3 var2) {
      com.aspose.slides.internal.x4g.s7 var3 = f1m.n5(this.n5.n5, com.aspose.slides.ms.System.u3.n5(this.n5.l6));
      a1v var4 = new a1v(((com.aspose.slides.internal.o9b.i1)var2).h0().o8());
      var1.n5(var3, null, var4);
   }
}
