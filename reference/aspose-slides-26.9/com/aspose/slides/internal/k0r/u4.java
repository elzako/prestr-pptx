package com.aspose.slides.internal.k0r;

public class u4 extends i9 {
   public u4(long var1) {
      super(575, false, var1);
   }

   public u4() {
      super(575, false, 0L);
   }

   public final boolean l6() {
      return (this.j5() & 131072L & 4294967295L) == 131072L;
   }

   public final void n5(boolean var1) {
      this.n5(var1 ? (this.j5() | 131072L) & 4294967295L : this.j5() & -131073L & 4294967295L);
   }

   public final void l6(boolean var1) {
      this.n5(var1 ? (this.j5() | 65536L) & 4294967295L : this.j5() & -65537L & 4294967295L);
   }

   public final boolean k5() {
      return (this.j5() & 2L & 4294967295L) == 2L;
   }

   public final void k5(boolean var1) {
      this.n5(var1 ? (this.j5() | 2L) & 4294967295L : this.j5() & -3L & 4294967295L);
   }
}
