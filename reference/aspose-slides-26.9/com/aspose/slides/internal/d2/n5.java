package com.aspose.slides.internal.d2;

public abstract class n5 extends s7 {
   private int e2 = 0;
   private int t9 = 0;
   private n5$n5 z1 = null;
   private int t4 = 0;

   public n5() {
   }

   public n5(int var1, int var2, int var3) {
      this.z1 = new n5$n5(var1, var2, var3);
   }

   public final int m1() {
      return this.e2;
   }

   public final void t2(int var1) {
      this.e2 = var1;
   }

   public final int k7() {
      return this.t9;
   }

   public final void s7(int var1) {
      this.t9 = var1;
   }

   public final void x8(int var1) {
      this.z1.n5 = var1;
   }

   @Override
   public boolean n5(double var1, int var3, int var4) {
      if (this.z1 != null) {
         double var5 = 1.0;
         if (var1 < 0.0) {
            if (this.e2 < 0) {
               var5 = (double)this.z1.l6 / this.z1.k5 * ((double)var4 / var3);
            } else {
               var5 = (double)this.z1.k5 / this.z1.l6 * ((double)var3 / var4);
            }
         }

         this.e2 = com.aspose.slides.internal.v6g.k5.u3((this.e2 - this.z1.n5) * var1 * var5, 14) + this.z1.n5;
         this.t9 = com.aspose.slides.internal.v6g.k5.u3(this.t9 * var1, 14);
         int var7 = this.z1.u3;
         this.z1.u3 = com.aspose.slides.internal.v6g.k5.u3(this.z1.u3 * var5 * var1, 14);
         this.n5 = this.n5 + (this.z1.u3 - var7);
      }

      return false;
   }

   public final int m3() {
      return this.t4;
   }

   public final void n3(int var1) {
      this.t4 = var1;
   }

   @Override
   public int z8() {
      return this.w1();
   }

   @Override
   public int j5() {
      return this.e_();
   }
}
