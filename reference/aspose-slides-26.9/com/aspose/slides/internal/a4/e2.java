package com.aspose.slides.internal.a4;

import com.aspose.slides.ms.System.d1;

public class e2 extends m1 {
   private long n5;
   private int l6;
   private com.aspose.slides.internal.i0.g7 k5;
   private long u3;
   private com.aspose.slides.internal.i0.u3[] a6;

   public e2() {
      this.l6((short)16411);
   }

   public e2(b3 var1) {
      super(var1);
   }

   public final boolean k5() {
      return this.u9(14);
   }

   public final void n5(boolean var1) {
      this.n5(14, var1);
   }

   public final byte u3() {
      return this.m3();
   }

   public final void n5(byte var1) {
      this.u3(var1);
   }

   public final boolean c8() {
      return this.u9(13);
   }

   public final void l6(boolean var1) {
      this.n5(13, var1);
   }

   public final boolean t2() {
      return this.u9(11);
   }

   public final void k5(boolean var1) {
      this.n5(11, var1);
   }

   public final long s7() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final int x8() {
      return this.l6;
   }

   public final void k5(int var1) {
      this.l6 = var1;
   }

   public final com.aspose.slides.internal.i0.g7 n3() {
      return this.k5;
   }

   public final void n5(com.aspose.slides.internal.i0.g7 var1) {
      this.k5 = var1;
   }

   public final long y4() {
      return this.u3;
   }

   public final void l6(long var1) {
      this.u3 = var1;
   }

   public final com.aspose.slides.internal.i0.u3[] e2() {
      return this.a6;
   }

   public final void n5(com.aspose.slides.internal.i0.u3[] var1) {
      this.a6 = var1;
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      var1.n5("[");

      for (com.aspose.slides.internal.i0.u3 var5 : this.e2()) {
         var1.n5(var5);
         var1.n5(", ");
      }

      var1.n5("]");
      return d1.n5(
         "{0}, Compressed: {1}, ObjectId: {2}, ApplyingAnEffect: {3}, Relative: {4}, ImageAttributesId: {5}, SrcUnit: {6}, SrcRect: {7}, Count: {8}, PointData: {9}",
         super.toString(),
         this.k5(),
         this.u3(),
         this.c8(),
         this.t2(),
         this.s7(),
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.t1.class, this.x8()),
         this.n3(),
         this.y4(),
         var1
      );
   }

   protected final boolean n5(e2 var1) {
      return this.s7() == var1.s7()
         && this.x8() == var1.x8()
         && com.aspose.slides.ms.System.j8.n5(this.n3(), var1.n3())
         && this.y4() == var1.y4()
         && com.aspose.slides.internal.y6.c8.n5(this.e2(), var1.e2());
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((e2)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = (int)this.s7();
      var1 = var1 * 397 ^ this.x8();
      var1 = var1 * 397 ^ (this.n3() != null ? this.n3().hashCode() : 0);
      var1 = var1 * 397 ^ (int)this.y4();
      return var1 * 397 ^ (this.e2() != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.e2())).hashCode() : 0);
   }

   @Override
   public int u9() {
      int var1 = 8 + this.n3().u9() + 4;
      if (this.e2() != null) {
         for (com.aspose.slides.internal.i0.u3 var5 : this.e2()) {
            var1 += var5.u9();
         }
      }

      return var1;
   }
}
