package com.aspose.slides;

final class s6 extends b2 implements c1m, l8k {
   private final h3m u3;
   private final x1 a6;
   private final boolean u9;

   static l8k n5(Shape var0, e9 var1, FilterEffect var2) {
      k9k var3 = var1.n5(var0);
      q2i var4 = new q2i(var0, var1);
      return new s6(var3, var4, var2, var1);
   }

   static l8k n5(Paragraph var0, Shape var1, e9 var2, FilterEffect var3) {
      g7u var4 = new g7u(var0, var1);
      d5g var5 = new d5g(var0, var2);
      return new s6(var4, var5, var3, var2);
   }

   private s6(j8h var1, h3m var2, FilterEffect var3, e9 var4) {
      super(var1, var3.getReveal() == 1);
      this.u3 = var2;
      this.u9 = var3.getSubtype() == 9;
      int var5 = this.u9 ? this.l6.l6() : this.l6.t2();
      this.a6 = new x1(var5, 6, -0.25F, 1.0F);
   }

   @Override
   public final void n5(float var1) {
      this.a6.n5(this.k5 ? var1 : 1.0F - var1);
      this.u3.n5(this);
   }

   @Override
   public final void n5() {
      this.n5(1.0F);
   }

   @Override
   public final void n5(r1c var1) {
      com.aspose.slides.internal.o9.n5.n5(var1.y1(), this.l6.n3(), new s6$1(this));
   }

   private int n5(com.aspose.slides.internal.w0.t4 var1, int var2) {
      float[] var3 = this.a6.n5();
      float var4 = this.u9 ? var3[var1.u3 % var3.length] : var3[var1.k5 % var3.length];
      com.aspose.slides.internal.w0.n5 var5 = com.aspose.slides.internal.w0.n5.n5(var2).k5();
      var5.l6 = com.aspose.slides.internal.v6g.k5.n5((Object)(var4 * (var5.l6 & 0xFF)), 13);
      return var5.l6();
   }

   // $VF: synthetic method
   static int n5(s6 var0, com.aspose.slides.internal.w0.t4 var1, int var2) {
      return var0.n5(var1, var2);
   }
}
