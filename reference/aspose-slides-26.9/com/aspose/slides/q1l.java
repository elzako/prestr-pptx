package com.aspose.slides;

final class q1l extends b2 implements c1m, l8k {
   private final h3m u3;
   private final c2l a6;
   private final boolean u9;

   public static q1l n5(Shape var0, e9 var1, boolean var2, boolean var3) {
      k9k var4 = var1.n5(var0);
      q2i var5 = new q2i(var0, var1);
      return new q1l(var4, var2, var5, var3, var1);
   }

   public static q1l n5(Paragraph var0, Shape var1, e9 var2, boolean var3, boolean var4) {
      g7u var5 = new g7u(var0, var1);
      d5g var6 = new d5g(var0, var2);
      return new q1l(var5, var3, var6, var4, var2);
   }

   private q1l(j8h var1, boolean var2, h3m var3, boolean var4, e9 var5) {
      super(var1, var4);
      this.u3 = var3;
      this.u9 = var2;
      int var6 = var2 ? this.l6.l6() : this.l6.t2();
      this.a6 = new c2l(var6, var5.k5());
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
      com.aspose.slides.internal.o9.n5.n5(var1.y1(), this.l6.n3(), new q1l$1(this));
   }

   private int n5(com.aspose.slides.internal.w0.t4 var1, int var2) {
      float[] var3 = this.a6.n5();
      float var4 = this.u9 ? var3[var1.u3] : var3[var1.k5];
      com.aspose.slides.internal.w0.n5 var5 = com.aspose.slides.internal.w0.n5.n5(var2).k5();
      var5.l6 = com.aspose.slides.internal.v6g.k5.n5((Object)(var4 * (var5.l6 & 0xFF)), 13);
      return var5.l6();
   }

   // $VF: synthetic method
   static int n5(q1l var0, com.aspose.slides.internal.w0.t4 var1, int var2) {
      return var0.n5(var1, var2);
   }
}
