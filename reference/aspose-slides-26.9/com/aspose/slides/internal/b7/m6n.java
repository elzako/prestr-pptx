package com.aspose.slides.internal.b7;

import com.aspose.slides.Collections.Generic.List;

abstract class m6n extends k1d {
   private final List<k1d> n5 = new List<>();

   protected m6n() {
   }

   public k1d[] u9() {
      return this.n5.toArray(new k1d[0]);
   }

   protected int h0() {
      return this.n5.size();
   }

   protected void n5(k1d var1) {
      this.n5.addItem(var1);
   }
}
