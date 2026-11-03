package com.aspose.slides.internal.k0r;

public class z0k extends u0b {
   private long l6;
   private long k5;
   private int u3 = 0;

   public z0k() {
      this.w1().n5(1062);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.l6 = var1.c4();
      this.k5 = var1.c4();
      this.u3 = this.w1().a6() - 8;
      if (this.u3 > 0) {
         var1.c8(this.u3);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.l6);
      var1.n5(this.k5);
      if (this.u3 > 0) {
         byte[] var2 = new byte[this.u3];
         var1.n5(var2);
      }
   }

   @Override
   public int n5() {
      return 8 + this.u3;
   }

   public final long l6() {
      return this.l6;
   }

   public final long k5() {
      return this.k5;
   }

   public final boolean n5(z0k var1) {
      return var1 == null ? false : this.l6 == var1.l6() && this.k5 == var1.k5();
   }
}
