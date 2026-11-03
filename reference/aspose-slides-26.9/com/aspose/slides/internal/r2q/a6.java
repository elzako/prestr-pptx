package com.aspose.slides.internal.r2q;

abstract class a6 {
   protected int n5;
   protected int l6;
   protected long k5;

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.k5 = (this.k5 & 4294967295L) >> var1 & 4294967295L;
      this.n5 -= var1;
   }

   public final void l6() {
      int var1 = this.n5 - (this.n5 & -8);
      this.n5(var1);
   }

   public final int l6(int var1) {
      return (int)(this.k5 & 4294967295L & (1 << var1) - 1 & 4294967295L);
   }

   protected final void k5() {
      this.n5 = 0;
      this.l6 = 0;
      this.k5 = 0L;
   }
}
