package com.aspose.slides.internal.k0r;

public class h5 extends i9 {
   public h5(long var1) {
      super(767, false, var1);
   }

   public h5() {
      super(767, false, 0L);
   }

   public final boolean l6() {
      return (this.j5() & 1048576L & 4294967295L) == 1048576L;
   }

   public final boolean k5() {
      return (this.j5() & 262144L & 4294967295L) == 262144L;
   }

   public final void n5(boolean var1) {
      this.n5(var1 ? (this.j5() | 262144L) & 4294967295L : this.j5() & -262145L & 4294967295L);
   }

   public final boolean u3() {
      return (this.j5() & 131072L & 4294967295L) == 131072L;
   }

   public final void l6(boolean var1) {
      this.n5(var1 ? (this.j5() | 131072L) & 4294967295L : this.j5() & -131073L & 4294967295L);
   }

   public final boolean a6() {
      return (this.j5() & 65536L & 4294967295L) == 65536L;
   }

   public final void k5(boolean var1) {
      this.n5(var1 ? (this.j5() | 65536L) & 4294967295L : this.j5() & -65537L & 4294967295L);
   }

   public final boolean u9() {
      return (this.j5() & 16L & 4294967295L) == 16L;
   }

   public final boolean h0() {
      return (this.j5() & 4L & 4294967295L) == 4L;
   }

   public final void u3(boolean var1) {
      this.n5(var1 ? (this.j5() | 4L) & 4294967295L : this.j5() & -5L & 4294967295L);
   }

   public final boolean c8() {
      return (this.j5() & 2L & 4294967295L) == 2L;
   }

   public final void a6(boolean var1) {
      this.n5(var1 ? (this.j5() | 2L) & 4294967295L : this.j5() & -3L & 4294967295L);
   }

   public final boolean t2() {
      return (this.j5() & 1L & 4294967295L) == 1L;
   }

   public final void u9(boolean var1) {
      this.n5(var1 ? (this.j5() | 1L) & 4294967295L : this.j5() & -2L & 4294967295L);
   }

   public final boolean s7() {
      return !this.l6() || this.u9();
   }

   public final boolean x8() {
      return !this.k5() || this.h0();
   }

   public final void h0(boolean var1) {
      this.n5(true);
      this.u3(var1);
   }

   public final boolean n3() {
      return !this.u3() || this.c8();
   }

   public final void c8(boolean var1) {
      this.l6(true);
      this.a6(var1);
   }

   public final boolean t9() {
      return this.a6() && this.t2();
   }

   public final void t2(boolean var1) {
      this.k5(true);
      this.u9(var1);
   }
}
