package com.aspose.slides.internal.u6;

import com.aspose.slides.Collections.Generic.List;

public class d2 extends e2 {
   private List<d2$a6> l6 = new List<>();

   public d2(z1 var1) {
      super(var1);
   }

   @Override
   public void n5(m1 var1) {
      this.l6.addItem(new d2$n5(var1));
   }

   @Override
   public void n5(y1 var1) {
      this.l6.addItem(new d2$h0(var1));
   }

   @Override
   public void n5() {
      this.l6.addItem(new d2$u3());
   }

   @Override
   public void n5(y2 var1) {
      this.l6.addItem(new d2$l6(var1));
   }

   @Override
   public void l6(y2 var1) {
      this.l6.addItem(new d2$u9(var1));
   }

   @Override
   public void l6() {
      this.l6.addItem(new d2$k5());
   }

   @Override
   public void k5() {
      h0 var1 = new h0(this.n5);
      com.aspose.slides.internal.r4.u3 var2 = new com.aspose.slides.internal.r4.u3<>(this.l6);

      while (var2.l6()) {
         ((d2$a6)var2.k5()).n5(var1);
      }

      var1.k5();
   }
}
