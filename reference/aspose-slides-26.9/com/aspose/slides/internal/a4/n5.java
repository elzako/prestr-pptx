package com.aspose.slides.internal.a4;

import com.aspose.slides.ms.System.d1;

public class n5 extends g7 {
   private com.aspose.slides.internal.i0.g7 n5;
   private com.aspose.slides.internal.i0.g7 l6;
   private long k5;

   public n5() {
      this.l6((short)16423);
   }

   public n5(b3 var1) {
      super(var1);
   }

   public final int n5() {
      return this.z3() & 0xFF;
   }

   public final com.aspose.slides.internal.i0.g7 l6() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.internal.i0.g7 var1) {
      this.n5 = var1;
   }

   public final com.aspose.slides.internal.i0.g7 k5() {
      return this.l6;
   }

   public final void l6(com.aspose.slides.internal.i0.g7 var1) {
      this.l6 = var1;
   }

   public final long u3() {
      return this.k5;
   }

   public final void n5(long var1) {
      this.k5 = var1;
   }

   protected final boolean n5(n5 var1) {
      return com.aspose.slides.ms.System.j8.n5(this.l6(), var1.l6()) && com.aspose.slides.ms.System.j8.n5(this.k5(), var1.k5()) && this.u3() == var1.u3();
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((n5)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.l6() != null ? this.l6().hashCode() : 0;
      var1 = var1 * 397 ^ (this.k5() != null ? this.k5().hashCode() : 0);
      return var1 * 397 ^ (int)this.u3();
   }

   @Override
   public String toString() {
      return d1.n5(
         "{0}, PageUnit: {1}, DestRect: {2}, SrcRect: {3}, StackIndex: {4}",
         super.toString(),
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.t1.class, this.n5()),
         this.l6(),
         this.k5(),
         this.u3()
      );
   }

   @Override
   public int u9() {
      return this.l6().u9() + this.k5().u9() + 4;
   }
}
