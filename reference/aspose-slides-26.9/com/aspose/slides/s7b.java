package com.aspose.slides;

final class s7b extends e8s {
   public final w1g n5 = new w1g();

   public s7b(MathFunction var1, c0e var2, w1g var3) {
      super(var1, var2);
      var3.n5(this.n5);

      for (IMathElement var7 : var1.getChildren()) {
         this.n5(var7, var3.n5());
      }
   }

   @Override
   protected y1m n5(d2k var1) {
      y1m var2 = t7e.n5(this.h0, this.n5.n5()).n5();
      float var3 = 15.0F * this.n5.a6 / 96.0F;
      e8s var4 = this.h0.get_Item(1);
      d2k var5 = var4.h0().u3();
      var5.n5 += var3;
      var4.l6(var5.u3());
      var2.n5 += var3;
      return var2;
   }
}
