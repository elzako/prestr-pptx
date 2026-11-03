package com.aspose.slides;

class k0w {
   private a8 n5;

   public k0w(c9v var1, u2w var2) {
      switch (ChartTypeCharacterizer.n5(var2.u3().n3().getChartData().getSeries().get_Item(0).getType())) {
         case 2:
            this.n5 = new h3(var1, var2);
            break;
         case 4:
            this.n5 = new n0h(var1, var2);
            break;
         default:
            this.n5 = new s8n(var1, var2);
      }
   }

   public final void n5(z5 var1) {
      this.n5.n5(var1);
   }

   final void n5(com.aspose.slides.internal.o9b.w1[] var1, com.aspose.slides.internal.o9b.f2[] var2) {
      this.n5.n5(var1, var2);
   }
}
