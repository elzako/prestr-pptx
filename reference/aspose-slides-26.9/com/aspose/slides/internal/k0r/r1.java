package com.aspose.slides.internal.k0r;

public class r1 extends i9 {
   public r1(long var1) {
      super(703, false, var1);
   }

   public r1() {
      super(703, false, 0L);
   }

   public final boolean l6() {
      return (this.j5() & 524288L & 4294967295L) == 524288L;
   }

   public final void n5(boolean var1) {
      this.n5(var1 ? (this.j5() | 524288L) & 4294967295L : this.j5() & -524289L & 4294967295L);
   }

   public final void l6(boolean var1) {
      this.n5(var1 ? (this.j5() | 262144L) & 4294967295L : this.j5() & -262145L & 4294967295L);
   }

   public final void k5(boolean var1) {
      this.n5(var1 ? (this.j5() | 131072L) & 4294967295L : this.j5() & -131073L & 4294967295L);
   }

   public final boolean k5() {
      return (this.j5() & 8L & 4294967295L) == 8L;
   }

   public final void u3(boolean var1) {
      this.n5(var1 ? (this.j5() | 8L) & 4294967295L : this.j5() & -9L & 4294967295L);
   }

   public final void a6(boolean var1) {
      this.n5(var1 ? (this.j5() | 4L) & 4294967295L : this.j5() & -5L & 4294967295L);
   }

   public final void u9(boolean var1) {
      this.n5(var1 ? (this.j5() | 2L) & 4294967295L : this.j5() & -3L & 4294967295L);
   }
}
