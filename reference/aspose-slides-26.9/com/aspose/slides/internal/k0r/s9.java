package com.aspose.slides.internal.k0r;

public class s9 extends i9 {
   public s9(long var1) {
      super(831, false, var1);
   }

   public s9() {
      super(831, false, 0L);
   }

   public final void n5(boolean var1) {
      this.n5(65536, var1);
   }

   public final void l6(boolean var1) {
      this.n5(1, var1);
   }

   private void n5(int var1, boolean var2) {
      this.n5(var2 ? (this.j5() | var1 & 4294967295L) & 4294967295L : this.j5() & ~(var1 & 4294967295L) & 4294967295L);
   }
}
