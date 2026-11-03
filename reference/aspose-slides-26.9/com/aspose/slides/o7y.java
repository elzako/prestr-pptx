package com.aspose.slides;

class o7y extends e1o {
   o7y(w3q var1, f7c var2) {
      super(var1, var2);
      this.u3();
      int var3 = this.h0().k5().getPeriod() & 255;

      for (int var4 = var3 - 1; var4 < this.x8().l6.size(); var4++) {
         double var5 = 0.0;
         int var7 = 0;

         for (int var8 = var4 - var3 + 1; var8 <= var4; var8++) {
            if (!this.x8().l6.get_Item(var8).e2().c8()) {
               var7++;
               var5 += this.x8().l6.get_Item(var8).n3();
            }
         }

         z4d var9 = new z4d();
         this.n5(var9);
         this.n5.addItem(var9);
         if (var7 == 0) {
            var7 = 1;
         }

         var9.l6(var5 / var7);
         var9.n5(this.x8().l6.get_Item(var4).y4());
         if (this.x8().t9().k5.n5().a0()) {
            var9.n5(var9.u3() + 0.5);
         }
      }
   }

   @Override
   protected void n5(double[] var1, double[] var2) {
   }
}
