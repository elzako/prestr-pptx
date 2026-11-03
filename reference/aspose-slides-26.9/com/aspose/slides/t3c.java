package com.aspose.slides;

final class t3c extends b2 implements c1m, l8k {
   private final h3m u3;
   private float a6 = 0.0F;

   public static t3c n5(Shape var0, e9 var1, boolean var2) {
      q2i var3 = new q2i(var0, var1);
      k9k var4 = var1.n5(var0);
      return new t3c(var2, var4, var3);
   }

   public static t3c n5(Paragraph var0, Shape var1, e9 var2, boolean var3) {
      d5g var4 = new d5g(var0, var2);
      g7u var5 = new g7u(var0, var1);
      return new t3c(var3, var5, var4);
   }

   private t3c(boolean var1, j8h var2, h3m var3) {
      super(var2, var1);
      this.u3 = var3;
   }

   @Override
   public final void n5(float var1) {
      this.a6 = this.k5 ? var1 : 1.0F - var1;
      this.u3.n5(this);
   }

   @Override
   public final void n5() {
   }

   @Override
   public final void n5(r1c var1) {
      com.aspose.slides.internal.o9.n5.n5(var1.y1(), this.l6.n3(), new t3c$1(this));
   }

   private int n5(int var1) {
      com.aspose.slides.internal.w0.n5 var2 = com.aspose.slides.internal.w0.n5.n5(var1).k5();
      float var3 = this.a6 * (var2.l6 & 0xFF);
      var2.l6 = com.aspose.slides.internal.v6g.k5.n5((Object)(var3), 13);
      return var2.l6();
   }

   // $VF: synthetic method
   static int n5(t3c var0, int var1) {
      return var0.n5(var1);
   }
}
