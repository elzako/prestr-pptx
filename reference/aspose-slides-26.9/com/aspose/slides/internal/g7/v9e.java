package com.aspose.slides.internal.g7;

class v9e implements q7 {
   private m5l n5;
   private p6r l6;

   v9e(m5l var1, p6r var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public final boolean n5(g2x var1, int[] var2) {
      if (!this.n5.l6().l6(var1.n5(var2[0]).n5())) {
         return false;
      }

      if (com.aspose.slides.internal.v6g.k5.k5(this.n5.u3(), 8) == 0) {
         return false;
      }

      j3b.n5(this.n5.k5(), var1.n5(var2[0]).l6(), var1);
      var2[0]++;
      return true;
   }
}
