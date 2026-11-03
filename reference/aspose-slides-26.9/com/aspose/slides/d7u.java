package com.aspose.slides;

final class d7u implements c1m, l8k {
   private final h3m n5;
   private final com.aspose.slides.internal.f3.k5<s4s> l6;
   private final s7k k5;
   private final boolean u3;
   private boolean a6;
   private float u9 = 0.0F;

   public static d7u n5(IShape var0, e9 var1, FilterEffect var2) {
      q2i var3 = new q2i(var0, var1);
      return new d7u(var2, var3, new d7u$1(var3));
   }

   public static d7u n5(Paragraph var0, Shape var1, e9 var2, FilterEffect var3) {
      d5g var4 = new d5g(var0, var2);
      g7u var5 = new g7u(var0, var1);
      return new d7u(var3, var4, new d7u$2(var5));
   }

   private d7u(FilterEffect var1, h3m var2, com.aspose.slides.internal.f3.k5<s4s> var3) {
      this.n5 = var2;
      this.l6 = var3;
      this.u3 = var1.getSubtype() == 14;
      byte var4 = 0;
      switch (var1.getType()) {
         case 3:
            var4 = 2;
            break;
         case 6:
            var4 = 1;
            break;
         case 11:
            var4 = 3;
      }

      this.k5 = new s7k(var4);
      this.a6 = var1.getSubtype() == 14;
      if (var1.getReveal() == 2) {
         this.a6 = !this.a6;
      }
   }

   @Override
   public final void n5(float var1) {
      if (!this.u3) {
         var1 = 1.0F - var1;
      }

      this.u9 = var1;
      this.n5.n5(this);
   }

   @Override
   public final void n5() {
   }

   @Override
   public final void n5(r1c var1) {
      s4s var2 = this.l6.invoke().l6();
      this.k5.n5(d2k.n5(var2.n5, d2k.n5(var2.l6, 2)).u3(), var2.l6.u3());
      this.k5.n5(this.u9);
      com.aspose.slides.internal.o9b.z1 var3 = var1.a0();
      com.aspose.slides.internal.x4g.s7 var4 = this.k5.n5;
      if (this.a6) {
         var3.n5(var4, 4);
      } else {
         var3.n5(var4, 0);
      }

      var3.n5(com.aspose.slides.internal.o9b.c8.e2().o8());
      var3.u3();
   }
}
