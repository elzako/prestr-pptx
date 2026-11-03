package com.aspose.slides.internal.k4y;

public abstract class x8 extends b3 {
   public abstract d3[] n5();

   public abstract d3 l6();

   protected abstract x8 k5();

   public final x8 u3() {
      x8 var1 = this.k5();
      var1.n5(this);
      return var1;
   }

   private void n5(x8 var1) {
      for (d3 var5 : var1.n5()) {
         this.l6().n5(var5.n5());
      }
   }
}
