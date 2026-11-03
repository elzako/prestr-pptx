package com.aspose.slides.internal.p3;

public class j9$n5 extends t4$n5 {
   private s0[] n5 = new s0[4];
   private s0[] l6 = new s0[4];
   private j9 k5;

   public j9$n5(j9 var1) {
      this.k5 = var1;
   }

   @Override
   public void n5(double var1, t4$k5 var3, double var4, int var6, int var7, int var8, int var9) {
      super.n5(var1, var3, var4, var6, var7, var8, var9);
      this.n5[var9] = j9.n5(this.k5).l6().l6();
      this.l6[var9] = j9.l6(this.k5).l6().l6();
   }

   public final s0 c8(int var1) {
      return this.n5[var1];
   }

   public final s0 t2(int var1) {
      return this.l6[var1];
   }
}
