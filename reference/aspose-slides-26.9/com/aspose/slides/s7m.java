package com.aspose.slides;

class s7m {
   private com.aspose.slides.internal.o9b.c8 n5 = new com.aspose.slides.internal.o9b.c8();
   private t9z l6;
   private com.aspose.slides.internal.o9b.w1 k5 = new com.aspose.slides.internal.o9b.w1();
   private IErrorBarsFormat u3;

   s7m(boolean var1, t9z var2) {
      this.u3 = var1 ? var2.y4().u9().getErrorBarsYFormat() : var2.y4().u9().getErrorBarsXFormat();
      this.l6 = var2;
      n1g var3 = var2.y4().t2();
      var3.n3().n5((byte)(var3.n3().getStyle() + 1 > 40 ? 1 : 0)).n5(this.n5);
   }

   public final IErrorBarsFormat n5() {
      return this.u3;
   }

   public final void n5(com.aspose.slides.internal.o9b.w1 var1, com.aspose.slides.internal.o9b.w1 var2) {
      this.n5(var1.l6(), var1.k5(), var2.l6(), var2.k5());
   }

   public final void n5(float var1, float var2, float var3, float var4) {
      n1g var5 = this.l6.y4().t2();
      l6v var6 = w5k.l6(this.n5.o8(), (LineFormat)this.n5().getFormat().getLine(), var5, 1.0F);
      var6.k5((byte)2);
      com.aspose.slides.internal.x4g.s7 var7 = new com.aspose.slides.internal.x4g.s7();

      try {
         var7.n5(new com.aspose.slides.internal.o9b.w1(var1, var2), new com.aspose.slides.internal.o9b.w1(var3, var4));
         com.aspose.slides.internal.x4g.s7 var8 = (com.aspose.slides.internal.x4g.s7)var7.deepClone();
         var5.d2().n5(var8, var6, new a1v(com.aspose.slides.internal.o9b.c8.u3.o8()));
      } finally {
         if (var7 != null) {
            var7.dispose();
         }
      }
   }
}
