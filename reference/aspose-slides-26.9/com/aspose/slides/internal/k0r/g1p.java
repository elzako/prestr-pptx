package com.aspose.slides.internal.k0r;

public class g1p {
   private int n5;
   private short l6;

   public g1p() {
      this.n5 = 0;
      this.l6 = 1;
   }

   public g1p(int var1, short var2) {
      this.n5 = var1;
      this.l6 = var2 > 0 ? var2 : 1;
   }

   public g1p(byte var1, short var2) {
      this.n5 = var1 != -1 ? var1 : 0;
      this.l6 = var2 > 0 ? var2 : 1;
   }

   public final int n5() {
      return this.n5;
   }

   public final short l6() {
      return this.l6;
   }

   final void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.k7();
      this.l6 = var1.k7();
   }

   final void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5((short)this.n5);
      var1.n5(this.l6);
   }

   final int k5() {
      return 4;
   }

   final boolean n5(g1p var1) {
      return this.n5 != var1.n5 ? false : this.l6 == var1.l6;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(
         "[ Scheme: {0} / StartNum: {1} ]",new Object[]{ com.aspose.slides.ms.System.d5.getName(com.aspose.slides.internal.v6g.k5.n5(c4t.class), this.n5), this.l6
      });
   }
}
