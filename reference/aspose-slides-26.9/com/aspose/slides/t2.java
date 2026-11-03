package com.aspose.slides;

final class t2 extends e8s {
   private final w1g n5 = new w1g();
   private k8l<g6h> l6;
   private float k5;

   public t2(MathAccent var1, c0e var2, w1g var3) {
      super(var1, var2);
      var3.n5(this.n5);
      this.n5(var1.getBase(), var3.n5());
   }

   public final MathAccent n5() {
      return (MathAccent)super.t2;
   }

   @Override
   public void n5(v1l var1) {
      com.aspose.slides.internal.o9b.u3 var2 = null;
      com.aspose.slides.internal.o9b.u3[] var3 = new com.aspose.slides.internal.o9b.u3[]{var2};
      boolean var4 = !this.a6().n5(this.n5(), this.h0.get_Item(0), var3);
      var2 = var3[0];
      if (var4) {
         var2 = var1.l6;
      }

      c6v var5 = new c6v(var1.n5);

      try {
         var1.n5.n5(this.k5, 0.0F);
         this.l6.n5(var1.n5, var2);
      } finally {
         if (var5 != null) {
            var5.dispose();
         }
      }

      super.n5(var1.n5());
   }

   @Override
   protected y1m n5(d2k var1) {
      e8s var2 = this.h0.get_Item(0);
      y1m var3 = var2.u9().n5();
      this.l6 = this.a6().n5().n5(this.n5().getCharacter(), this.n5.a6, var3.n5);
      g6h var4 = this.l6.n5().n5();
      float var5 = com.aspose.slides.ms.System.q1.n5((float)(var3.n5), (float)(var4.n5));
      this.k5 = (var5 - var4.n5) / 2.0F;
      float var6 = var4.k5;
      var2.l6(0.0F, var6);
      y1m var7 = var3.n5();
      var7.l6.n5 += var6;
      var7.n5 = var5;
      return var7;
   }
}
