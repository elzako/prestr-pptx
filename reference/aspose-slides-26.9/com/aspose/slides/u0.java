package com.aspose.slides;

class u0 extends v6g {
   private IChartDataPoint n5;
   private l1z l6;

   u0(g3y var1, IChartDataPoint var2) {
      this.n5 = var2;
      Marker var3 = new Marker(null, var1.u9());
      var3.setSymbol(0);
      var3.n5 = 4;
      com.aspose.slides.internal.o9b.c8 var4 = d8.n5(var1).o8();
      var3.getFormat().getLine().getFillFormat().setFillType((byte)1);
      ((ColorFormat)var3.getFormat().getLine().getFillFormat().getSolidFillColor()).n5(var4.o8());
      com.aspose.slides.internal.o9b.c8 var5 = (((Format)var1.u9().getFormat()).z3() ? var1.u9().c8() : d8.l6(var1)).o8();
      com.aspose.slides.internal.o9b.c8.n5(255, var5.o8()).n5(var4);
      var3.getFormat().getFill().setFillType((byte)1);
      ((ColorFormat)var3.getFormat().getFill().getSolidFillColor()).n5(var4.o8());
      this.l6 = new l1z(var3, var1);
      this.n5(this.l6);
   }

   @Override
   protected void n5(z5 var1) {
      this.k5(0.0F);
      this.u3(0.0F);
      this.l6.n3(new z5(100.0F, 100.0F));
   }

   @Override
   protected void l6(z5 var1) {
      this.l6.a6(-this.l6.d2() / 2.0F);
      this.l6.u9(-this.l6.d5() / 2.0F);
      this.l6.t1();
   }

   final IChartDataPoint u3() {
      return this.n5;
   }
}
