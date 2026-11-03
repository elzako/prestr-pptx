package com.aspose.slides.internal.a4;

import com.aspose.slides.ms.System.d1;

public class d5 extends u9 {
   private long n5;
   private int l6;
   private int k5;
   private com.aspose.slides.internal.i0.i1 u3;

   public d5() {
      this.l6((short)16385);
   }

   public d5(b3 var1) {
      super(var1);
   }

   public final boolean k5() {
      return this.u9(0);
   }

   public final void n5(boolean var1) {
      this.n5(0, var1);
   }

   public final boolean u3() {
      return (this.c8() & 4294967295L & 1L & 4294967295L) > 0L;
   }

   public final void l6(boolean var1) {
      long var2 = 4294967294L;
      this.n5(this.c8() & 4294967294L & 4294967295L);
      if (var1) {
         this.n5((this.c8() & 4294967295L | 1L) & 4294967295L);
      }
   }

   public final long c8() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final int t2() {
      return this.l6;
   }

   public final void k5(int var1) {
      this.l6 = var1;
   }

   public final int s7() {
      return this.k5;
   }

   public final void u3(int var1) {
      this.k5 = var1;
   }

   public final com.aspose.slides.internal.i0.i1 x8() {
      return this.u3;
   }

   public final void n5(com.aspose.slides.internal.i0.i1 var1) {
      this.u3 = var1;
   }

   public final boolean n3() {
      return this.t4() == 16385 && this.h0() == 28 && this.H_() == 16 && this.x8() != null && this.x8().n5() == 900097;
   }

   @Override
   public String toString() {
      return d1.n5(
         "[{0}, DualMode: {1}, VideoDisplay: {2}, EmfPlusFlags: {3}, LogicalDpiX: {4}, LogicalDpiY: {5}, Version: {6}, IsValid: {7}]",
         super.toString(),
         this.k5(),
         this.u3(),
         this.c8(),
         this.t2(),
         this.s7(),
         this.x8(),
         this.n3()
      );
   }

   protected final boolean n5(d5 var1) {
      return this.c8() == var1.c8() && this.t2() == var1.t2() && this.s7() == var1.s7() && com.aspose.slides.ms.System.j8.n5(this.x8(), var1.x8());
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((d5)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = (int)this.c8();
      var1 = var1 * 397 ^ this.t2();
      var1 = var1 * 397 ^ this.s7();
      return var1 * 397 ^ (this.x8() != null ? this.x8().hashCode() : 0);
   }
}
