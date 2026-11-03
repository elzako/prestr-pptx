package com.aspose.slides;

class g2n extends e1o {
   g2n(w3q var1, f7c var2) {
      super(var1, var2);
      this.u3();

      for (int var3 = 0; var3 < this.x8().l6.size(); var3++) {
         if (!this.x8().l6.get_Item(var3).e2().c8()) {
            z4d var4 = new z4d();
            this.n5(var4);
            this.n5.addItem(var4);
            var4.l6(this.t2()[0] * this.x8().l6.get_Item(var3).y4() + this.t2()[1]);
            var4.n5(this.x8().l6.get_Item(var3).y4());
            if (this.x8().t9().k5.n5().a0() && !com.aspose.slides.internal.v6g.k5.l6(this.x8().t9().k5, o8r.class)) {
               var4.n5(var4.u3() + 0.5);
            }
         }
      }
   }
}
