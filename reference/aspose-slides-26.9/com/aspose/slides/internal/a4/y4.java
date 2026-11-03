package com.aspose.slides.internal.a4;

import com.aspose.slides.ms.System.d1;

public class y4 extends m1 {
   private long n5;
   private com.aspose.slides.internal.i0.a6 l6;
   private com.aspose.slides.internal.i0.g7 k5;
   private int u3;

   public y4(b3 var1) {
      super(var1);
   }

   public final boolean k5() {
      return this.u9(14);
   }

   public final byte u3() {
      return this.m3();
   }

   public final long c8() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final com.aspose.slides.internal.i0.a6 t2() {
      return this.l6;
   }

   public final void n5(com.aspose.slides.internal.i0.a6 var1) {
      this.l6 = var1;
   }

   public final com.aspose.slides.internal.i0.g7 s7() {
      return this.k5;
   }

   public final void n5(com.aspose.slides.internal.i0.g7 var1) {
      this.k5 = var1;
   }

   public final int x8() {
      return this.u3;
   }

   public final void k5(int var1) {
      this.u3 = var1;
   }

   @Override
   public String toString() {
      return d1.n5(
         "{0}, Compressed: {1}, ObjectId: {2}, ImageAttributesId: {3}, RectData: {4}, SrcRect: {5}, SrcUnit: {6}",
         super.toString(),
         this.k5(),
         this.u3(),
         this.c8(),
         this.t2(),
         this.s7(),
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.t1.class, this.x8())
      );
   }

   protected final boolean n5(y4 var1) {
      return this.n5 == var1.n5
         && com.aspose.slides.ms.System.j8.n5(this.l6, var1.l6)
         && com.aspose.slides.ms.System.j8.n5(this.k5, var1.k5)
         && this.u3 == var1.u3;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((y4)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = (int)this.n5;
      var1 = var1 * 397 ^ (this.l6 != null ? this.l6.hashCode() : 0);
      var1 = var1 * 397 ^ (this.k5 != null ? this.k5.hashCode() : 0);
      return var1 * 397 ^ this.u3;
   }
}
