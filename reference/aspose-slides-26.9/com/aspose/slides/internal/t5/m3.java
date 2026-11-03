package com.aspose.slides.internal.t5;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.s3;

public class m3 extends q0 {
   private com.aspose.slides.internal.k1.q0 n5;
   private long l6;
   private long k5;
   private long u3;
   private com.aspose.slides.internal.k1.k7 a6;
   private long u9;
   private byte[] h0;
   private long[] c8;
   private boolean t2 = false;
   private String s7;
   private com.aspose.slides.internal.l7h.j5 x8 = com.aspose.slides.internal.l7h.j5.u3(0);

   public final com.aspose.slides.internal.k1.q0 n5() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.internal.k1.q0 var1) {
      this.n5 = var1;
   }

   public final long l6() {
      return this.l6;
   }

   public final void n5(long var1) {
      this.l6 = var1;
   }

   public final long k5() {
      return this.k5;
   }

   public final void l6(long var1) {
      this.k5 = var1;
   }

   public final long u3() {
      return this.u3;
   }

   public final void k5(long var1) {
      this.u3 = var1;
   }

   public final com.aspose.slides.internal.k1.k7 u9() {
      return this.a6;
   }

   public final void n5(com.aspose.slides.internal.k1.k7 var1) {
      this.a6 = var1;
   }

   public final long h0() {
      return this.u9;
   }

   public final void u3(long var1) {
      this.u9 = var1;
   }

   public final byte[] c8() {
      return this.h0;
   }

   public final void n5(byte[] var1) {
      this.t2 = false;
      this.h0 = var1;
   }

   public final String t2() {
      if (!this.t2) {
         this.s7 = this.x8.l6(this.h0);
         this.t2 = true;
      }

      return this.s7;
   }

   public final int s7() {
      return this.x8.t9();
   }

   public final void n5(int var1) {
      if (var1 != this.x8.t9()) {
         this.x8 = com.aspose.slides.internal.l7h.j5.u3(var1);
         this.t2 = false;
      }
   }

   public final com.aspose.slides.internal.l7h.j5 x8() {
      return this.x8;
   }

   public final long[] n3() {
      return this.c8;
   }

   public final void n5(long[] var1) {
      this.c8 = var1;
   }

   @Override
   public String toString() {
      return d1.n5(
         "[Reference: {0}, Chars: {1}, OffString: {2}, Options: {3}, Rectangle: {4}, OffDx: {5}, StringBuffer: {6}, DxBuffer: {7}]",
         this.n5(),
         this.l6(),
         this.k5(),
         s3.n5(com.aspose.slides.internal.c5.u3.class, this.u3()),
         this.u9(),
         this.h0(),
         this.t2(),
         this.n3()
      );
   }

   protected final boolean n5(m3 var1) {
      return j8.n5(this.n5, var1.n5)
         && this.l6 == var1.l6
         && this.k5 == var1.k5
         && this.u3 == var1.u3
         && j8.n5(this.a6, var1.a6)
         && this.u9 == var1.u9
         && d1.a6(this.t2(), var1.t2())
         && com.aspose.slides.internal.y6.c8.n5(this.c8, var1.c8);
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != j8.n5(this) ? false : this.n5((m3)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.n5 != null ? this.n5.hashCode() : 0;
      var1 = var1 * 397 ^ (int)this.l6;
      var1 = var1 * 397 ^ (int)this.k5;
      var1 = var1 * 397 ^ (int)this.u3;
      var1 = var1 * 397 ^ (this.a6 != null ? this.a6.hashCode() : 0);
      var1 = var1 * 397 ^ (int)this.u9;
      var1 = var1 * 397 ^ (this.h0 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.h0)).hashCode() : 0);
      return var1 * 397 ^ (this.c8 != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.c8)).hashCode() : 0);
   }
}
