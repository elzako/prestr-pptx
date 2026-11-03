package com.aspose.slides.internal.r1x;

class w2$l6 {
   private final w2$n5 n5;
   private int l6;
   private int k5;

   public w2$l6(int var1, int var2, w2$n5 var3) {
      this.n5 = var3;
      this.l6 = var1;
      this.k5 = var2;
   }

   public final w2$n5 n5() {
      return this.n5;
   }

   public final int l6() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.l6 = var1;
   }

   public final int k5() {
      return this.k5;
   }

   public final void l6(int var1) {
      if (var1 < this.l6) {
         this.l6 = var1;
      }

      this.k5 = var1;
   }
}
