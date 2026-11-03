package com.aspose.slides.internal.b1m;

public class k5 extends l6 {
   public k5(com.aspose.slides.internal.o6x.u3 var1, com.aspose.slides.internal.o6x.k5 var2) {
      super(var1, var2);
   }

   @Override
   public void n5() {
      int var1 = this.n5.n5.indexOf(this.n5.t2, this.n5.s7);
      if (var1 == -1) {
         var1 = this.n5.n5.length();
      }

      int var2 = this.n5.n5.indexOf("\t", this.n5.s7);
      if (var2 > var1) {
         super.n5();
      } else {
         this.n5.x8 = Math.min(var1 + 1, this.n5.n5.length());
         if (!this.k5() && !this.l6()) {
            int var3 = this.n5(this.n5);
            int var4 = Math.min(var3, this.n5.x8);
            this.n5(var4);
         } else {
            this.n5(this.n5.x8);
         }
      }
   }

   @Override
   protected int l6(com.aspose.slides.internal.o6x.k5 var1) {
      return this.u3(var1);
   }
}
