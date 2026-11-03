package com.aspose.slides.internal.k0r;

public class s4 extends z5 {
   public s4(long var1) {
      super(927, false, var1);
   }

   public s4() {
      super(927, false, 0L);
      this.n5(false);
      this.l6(false);
      this.k5(false);
   }

   public boolean l6() {
      return (this.j5() & 4294967295L & 1L) == 1L;
   }

   public void n5(boolean var1) {
      this.n5(var1 ? this.j5() & 4294967295L | 1L : this.j5() & 4294967295L & -2L);
   }

   public void l6(boolean var1) {
      this.n5(var1 ? this.j5() & 4294967295L | 2L : this.j5() & 4294967295L & -3L);
   }

   public void k5(boolean var1) {
      this.n5(var1 ? this.j5() & 4294967295L | 4L : this.j5() & 4294967295L & -5L);
   }
}
