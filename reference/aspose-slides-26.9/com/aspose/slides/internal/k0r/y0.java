package com.aspose.slides.internal.k0r;

public class y0 {
   private long n5;

   public final void n5(boolean var1) {
      this.n5(var1 ? (this.k5() & 4294967295L | 4L) & 4294967295L : this.k5() & 4294967291L & 4294967295L);
   }

   public final boolean n5() {
      return 0L != (this.k5() & 4294967295L & 8L & 4294967295L);
   }

   public final void l6(boolean var1) {
      this.n5(var1 ? (this.k5() & 4294967295L | 8L) & 4294967295L : this.k5() & 4294967287L & 4294967295L);
   }

   public final boolean l6() {
      return 0L != (this.k5() & 4294967295L & 16L & 4294967295L);
   }

   public final long k5() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public static y0 n5(com.aspose.slides.internal.z0k.t4 var0) {
      y0 var1 = new y0();
      var1.n5(com.aspose.slides.internal.n8e.y2.l6(var0) & 4294967295L);
      return var1;
   }
}
