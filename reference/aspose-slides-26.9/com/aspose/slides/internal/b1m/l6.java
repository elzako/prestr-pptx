package com.aspose.slides.internal.b1m;

public class l6 extends n5 {
   public l6(com.aspose.slides.internal.o6x.u3 var1, com.aspose.slides.internal.o6x.k5 var2) {
      super(var1, var2);
   }

   @Override
   public void n5() {
      int var1 = this.n5.n5.indexOf(this.n5.t2, this.n5.s7);
      this.n5.x8 = var1 == -1 ? this.n5.n5.length() : var1 + 1;
      if (!this.k5() && !this.l6()) {
         int var2 = this.n5(this.n5);
         int var3 = Math.min(var2, this.n5.x8);
         this.n5.n5(this.n5.s7, var3, 0.0F);
      } else {
         this.n5.n5(this.n5.s7, this.n5.x8, 0.0F);
      }
   }

   @Override
   protected int l6(com.aspose.slides.internal.o6x.k5 var1) {
      return this.k5(var1);
   }
}
