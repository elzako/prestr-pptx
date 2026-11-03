package com.aspose.slides;

final class x0 extends e8s {
   private final w1g n5 = new w1g();
   private com.aspose.slides.internal.o9b.y1 l6 = new com.aspose.slides.internal.o9b.y1();

   public x0(MathBar var1, c0e var2, w1g var3) {
      super(var1, var2);
      var3.n5(this.n5);
      this.n5(var1.getBase(), var3.n5());
   }

   public final MathBar n5() {
      return (MathBar)super.t2;
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

      var1.n5.n5(this.l6.y4(), null, new a1v(((com.aspose.slides.internal.o9b.i1)var2).h0().o8()));
      super.n5(var1.n5());
   }

   @Override
   protected y1m n5(d2k var1) {
      e8s var2 = this.h0.get_Item(0);
      y1m var3 = var2.u9().n5();
      float var4 = this.n5.a6 / 96.0F;
      float var5 = 7.0F * var4;
      float var6 = 16.0F * var4;
      if (this.n5().getPosition() == 2) {
         float var9 = var3.l6.n5() + var6;
         this.l6 = new com.aspose.slides.internal.o9b.y1(0.0F, var9, var3.n5, var5);
         y1m var10 = var3.n5();
         var10.l6.l6 = var9 + var5 - var10.l6.n5;
         return var10;
      } else {
         this.l6 = new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, var3.n5, var5);
         float var7 = var5 + var6;
         var2.l6(0.0F, var7);
         y1m var8 = var3.n5();
         var8.l6.n5 += var7;
         return var8;
      }
   }
}
