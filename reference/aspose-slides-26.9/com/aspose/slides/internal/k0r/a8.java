package com.aspose.slides.internal.k0r;

public class a8 extends i9 {
   public a8(long var1) {
      super(191, var1);
   }

   public a8() {
      super(191, 0L);
   }

   public final void n5(boolean var1) {
      this.n5(131072, var1);
   }

   public final void l6(boolean var1) {
      this.n5(2, var1);
   }

   public final void k5(boolean var1) {
      this.n5(true);
      this.l6(var1);
   }

   private void n5(int var1, boolean var2) {
      this.n5(var2 ? (this.j5() | var1 & 4294967295L) & 4294967295L : this.j5() & ~(var1 & 4294967295L) & 4294967295L);
   }
}
