package com.aspose.slides;

class v4b extends e1o {
   v4b(w3q var1, f7c var2) {
      super(var1, var2);
      this.u3();

      for (int var3 = 0; var3 < this.x8().l6.size(); var3++) {
         z4d var4 = new z4d();
         this.n5(var4);
         this.n5.addItem(var4);
         var4.l6(this.t2()[1] * com.aspose.slides.ms.System.q1.a6(Math.E, this.t2()[0] * this.x8().l6.get_Item(var3).y4()));
         var4.n5(this.x8().l6.get_Item(var3).y4());
         if (this.x8().t9().k5.n5().a0()) {
            var4.n5(var4.u3() + 0.5);
         }
      }
   }

   @Override
   protected void n5(double[] var1, double[] var2) {
      for (int var3 = 0; var3 < var2.length; var3++) {
         double var4 = com.aspose.slides.ms.System.q1.t4(var2[var3]);
         var2[var3] = var4;
      }

      if (this.n3()) {
         this.l6(com.aspose.slides.ms.System.q1.t4(this.y4()));
      }

      super.n5(var1, var2);
      if (this.n3()) {
         this.t2()[1] = this.h0().k5().getIntercept();
      } else {
         this.t2()[1] = com.aspose.slides.ms.System.q1.z1(this.t2()[1]);
      }
   }
}
