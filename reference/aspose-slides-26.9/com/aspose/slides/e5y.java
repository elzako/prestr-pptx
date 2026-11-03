package com.aspose.slides;

class e5y extends e1o {
   e5y(w3q var1, f7c var2) {
      super(var1, var2);
      this.u3();

      for (int var3 = 0; var3 < this.x8().l6.size(); var3++) {
         z4d var4 = new z4d();
         this.n5(var4);
         this.n5.addItem(var4);
         var4.l6(this.t2()[1] * com.aspose.slides.ms.System.q1.a6(this.x8().l6.get_Item(var3).y4(), this.t2()[0]));
         var4.n5(this.x8().l6.get_Item(var3).y4());
         if (this.x8().t9().k5.n5().a0()) {
            var4.n5(var4.u3() + 0.5);
         }
      }
   }

   @Override
   protected void n5(double[] var1, double[] var2) {
      for (int var3 = 0; var3 < var2.length; var3++) {
         var1[var3] = com.aspose.slides.ms.System.q1.t4(var1[var3]);
         var2[var3] = com.aspose.slides.ms.System.q1.t4(var2[var3]);
      }

      super.n5(var1, var2);
      this.t2()[1] = com.aspose.slides.ms.System.q1.z1(this.t2()[1]);
   }
}
