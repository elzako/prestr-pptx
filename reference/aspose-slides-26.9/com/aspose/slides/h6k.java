package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class h6k {
   private final IPortion n5;
   private String l6;

   public final String n5() {
      return this.l6;
   }

   public final IPortion l6() {
      return this.n5;
   }

   public h6k(IPortion var1, char var2) {
      if (var1 == null) {
         throw new ArgumentNullException("portion");
      }

      this.n5 = var1;
      this.l6 = com.aspose.slides.ms.System.t9.q0(var2);
   }

   public final void n5(h6k var1) {
      if (var1 == null) {
         throw new ArgumentNullException("replacement");
      }

      this.l6 = com.aspose.slides.ms.System.d1.n5(this.l6, var1.l6);
   }

   public final Portion k5() {
      Portion var1 = new Portion((Portion)this.n5);
      var1.setText(this.l6);
      return var1;
   }
}
