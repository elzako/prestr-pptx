package com.aspose.slides.internal.k0r;

public class j4 extends i9 {
   public j4(long var1) {
      super(447, false, var1);
   }

   public j4() {
      super(447, false, 0L);
   }

   public final boolean l6() {
      return (this.j5() & 4194304L & 4294967295L) == 4194304L;
   }

   public final void n5(boolean var1) {
      this.n5(var1 ? (this.j5() | 2097152L) & 4294967295L : this.j5() & -2097153L & 4294967295L);
   }

   public final void l6(boolean var1) {
      this.n5(var1 ? (this.j5() | 1048576L) & 4294967295L : this.j5() & -1048577L & 4294967295L);
   }

   public final void k5(boolean var1) {
      this.n5(var1 ? (this.j5() | 262144L) & 4294967295L : this.j5() & -262145L & 4294967295L);
   }

   public final void u3(boolean var1) {
      this.n5(var1 ? (this.j5() | 131072L) & 4294967295L : this.j5() & -131073L & 4294967295L);
   }

   public final void a6(boolean var1) {
      this.n5(var1 ? (this.j5() | 65536L) & 4294967295L : this.j5() & -65537L & 4294967295L);
   }

   public final boolean k5() {
      return (this.j5() & 64L & 4294967295L) == 64L;
   }

   public final void u9(boolean var1) {
      this.n5(var1 ? (this.j5() | 32L) & 4294967295L : this.j5() & -33L & 4294967295L);
   }

   public final void h0(boolean var1) {
      this.n5(var1 ? (this.j5() | 16L) & 4294967295L : this.j5() & -17L & 4294967295L);
   }

   public final void c8(boolean var1) {
      this.n5(var1 ? (this.j5() | 4L) & 4294967295L : this.j5() & -5L & 4294967295L);
   }

   public final void t2(boolean var1) {
      this.n5(var1 ? (this.j5() | 2L) & 4294967295L : this.j5() & -3L & 4294967295L);
   }

   public final void s7(boolean var1) {
      this.n5(var1 ? (this.j5() | 1L) & 4294967295L : this.j5() & -2L & 4294967295L);
   }

   public final boolean u3() {
      return this.l6() && this.k5();
   }

   public final void x8(boolean var1) {
      this.n5(true);
      this.u9(var1);
   }

   public final void n3(boolean var1) {
      this.l6(true);
      this.h0(var1);
   }

   public final void y4(boolean var1) {
      this.k5(true);
      this.c8(var1);
   }

   public final void e2(boolean var1) {
      this.u3(true);
      this.t2(var1);
   }

   public final void t9(boolean var1) {
      this.a6(true);
      this.s7(var1);
   }
}
