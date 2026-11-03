package com.aspose.slides.internal.k0r;

public class w2 extends i9 {
   public w2(long var1) {
      super(319, false, var1);
   }

   public w2() {
      super(319, false, 0L);
   }

   public final void n5(boolean var1) {
      this.n5(var1 ? (this.j5() | 262144L) & 4294967295L : this.j5() & -262145L & 4294967295L);
   }

   public final void l6(boolean var1) {
      this.n5(var1 ? (this.j5() | 131072L) & 4294967295L : this.j5() & -131073L & 4294967295L);
   }

   public final void k5(boolean var1) {
      this.n5(var1 ? (this.j5() | 65536L) & 4294967295L : this.j5() & -65537L & 4294967295L);
   }

   public final void u3(boolean var1) {
      this.n5(var1 ? (this.j5() | 4L) & 4294967295L : this.j5() & -5L & 4294967295L);
   }

   public final void a6(boolean var1) {
      this.n5(var1 ? (this.j5() | 2L) & 4294967295L : this.j5() & -3L & 4294967295L);
   }

   public final void u9(boolean var1) {
      this.n5(true);
      this.u3(var1);
   }

   public final void h0(boolean var1) {
      this.l6(true);
      this.a6(var1);
   }
}
