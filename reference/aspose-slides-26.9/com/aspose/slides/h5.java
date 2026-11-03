package com.aspose.slides;

class h5 {
   private final n1g n5;

   public h5(n1g var1) {
      this.n5 = var1;
   }

   final void n5() {
      boolean var1 = ChartTypeCharacterizer.isChartTypeBar(this.n5.n3().getType());
      l5 var2 = this.n5.m1();
      if (var2.c8() != null && var2.c8().isVisible()) {
         if (var1) {
            h1 var3 = new h1(this.n5);
            var3.l6(var2);
         } else {
            n2 var6 = new n2(this.n5);
            var6.n5(var2);
         }
      }

      l5 var7 = this.n5.q0();
      if (var7.c8() != null && var7.c8().isVisible() && !this.n5.n3().hasDataTable()) {
         if (var1) {
            h1 var4 = new h1(this.n5);
            var4.n5(var7);
         } else {
            n2 var8 = new n2(this.n5);
            var8.l6(var7);
         }
      }

      l5 var9 = this.n5.m3();
      if (var9.c8() != null && var9.c8().isVisible()) {
         n2 var5 = new n2(this.n5);
         var5.k5(var9);
      }
   }
}
