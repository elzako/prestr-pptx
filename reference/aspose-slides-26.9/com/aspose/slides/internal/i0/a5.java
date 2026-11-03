package com.aspose.slides.internal.i0;

public final class a5 extends k5 {
   private long n5;
   private n5 l6;
   private h2 k5;
   private g7 u3;
   private int a6;
   private int u9;
   private n5 h0;
   private long c8;

   public final long n5() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final n5 l6() {
      return this.l6;
   }

   public final void n5(n5 var1) {
      this.l6 = var1;
   }

   public final h2 k5() {
      return this.k5;
   }

   public final void n5(h2 var1) {
      this.k5 = var1;
   }

   public final g7 u3() {
      return this.u3;
   }

   public final void n5(g7 var1) {
      this.u3 = var1;
   }

   public final int a6() {
      return this.a6;
   }

   public final void n5(int var1) {
      this.a6 = var1;
   }

   public final int h0() {
      return this.u9;
   }

   public final void l6(int var1) {
      this.u9 = var1;
   }

   public final n5 c8() {
      return this.h0;
   }

   public final void l6(n5 var1) {
      this.h0 = var1;
   }

   public final long t2() {
      return this.c8;
   }

   public final void l6(long var1) {
      this.c8 = var1;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(
         "BrushDataFlags: {0}, EndColor: {1}, OptionalData: {2}, RectF: {3}, Reserved1: {4}, Reserved2: {5}, StartColor: {6}, WrapMode: {7}",
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.l6.class, this.n5),
         this.l6,
         this.k5,
         this.u3,
         this.a6,
         this.u9,
         this.h0,
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.a5.class, this.c8)
      );
   }

   private boolean n5(a5 var1) {
      return this.n5 == var1.n5
         && com.aspose.slides.ms.System.j8.n5(this.l6, var1.l6)
         && com.aspose.slides.ms.System.j8.n5(this.k5, var1.k5)
         && com.aspose.slides.ms.System.j8.n5(this.u3, var1.u3)
         && this.a6 == var1.a6
         && this.u9 == var1.u9
         && com.aspose.slides.ms.System.j8.n5(this.h0, var1.h0)
         && this.c8 == var1.c8;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj) ? true : com.aspose.slides.internal.v6g.k5.l6(obj, a5.class) && this.n5((a5)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = (int)this.n5;
      var1 = var1 * 397 ^ (this.l6 != null ? this.l6.hashCode() : 0);
      var1 = var1 * 397 ^ (this.k5 != null ? this.k5.hashCode() : 0);
      var1 = var1 * 397 ^ (this.u3 != null ? this.u3.hashCode() : 0);
      var1 = var1 * 397 ^ this.a6;
      var1 = var1 * 397 ^ this.u9;
      var1 = var1 * 397 ^ (this.h0 != null ? this.h0.hashCode() : 0);
      return var1 * 397 ^ (int)this.c8;
   }

   @Override
   public int u9() {
      int var1 = 8 + this.u3.u9() + 4 + 4 + 8;
      if (this.k5 != null) {
         var1 += this.k5.u9();
      }

      return var1;
   }
}
