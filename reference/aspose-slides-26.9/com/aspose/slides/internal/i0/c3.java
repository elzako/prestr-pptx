package com.aspose.slides.internal.i0;

public final class c3 extends k5 {
   private long n5;
   private long l6;
   private l4 k5;

   public final long n5() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final long l6() {
      return this.l6;
   }

   public final void l6(long var1) {
      this.l6 = var1;
   }

   public final l4 k5() {
      return this.k5;
   }

   public final void n5(l4 var1) {
      this.k5 = var1;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(
         "BrushDataFlags: {0}, WrapMode: {1}, OptionalData: [{2}]",
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.l6.class, this.n5),
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.a5.class, this.l6),
         this.k5
      );
   }

   private boolean n5(c3 var1) {
      return this.n5 == var1.n5 && this.l6 == var1.l6 && com.aspose.slides.ms.System.j8.n5(this.k5, var1.k5);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj) ? true : com.aspose.slides.internal.v6g.k5.l6(obj, c3.class) && this.n5((c3)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = (int)this.n5;
      var1 = var1 * 397 ^ (int)this.l6;
      return var1 * 397 ^ (this.k5 != null ? this.k5.hashCode() : 0);
   }

   @Override
   public int u9() {
      return 8 + this.k5.u9();
   }
}
