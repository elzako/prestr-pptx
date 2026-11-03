package com.aspose.slides.internal.i0;

public final class e5 extends k5 {
   private n5 n5;
   private n5 l6;
   private long k5;

   public final n5 n5() {
      return this.n5;
   }

   public final void n5(n5 var1) {
      this.n5 = var1;
   }

   public final n5 l6() {
      return this.l6;
   }

   public final void l6(n5 var1) {
      this.l6 = var1;
   }

   public final long k5() {
      return this.k5;
   }

   public final void n5(long var1) {
      this.k5 = var1;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(
         "BackColor: {0}, ForeColor: {1}, HatchStyle: {2}",
         this.n5,
         this.l6,
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.y4.class, this.k5)
      );
   }

   private boolean n5(e5 var1) {
      return com.aspose.slides.ms.System.j8.n5(this.n5, var1.n5) && com.aspose.slides.ms.System.j8.n5(this.l6, var1.l6) && this.k5 == var1.k5;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj) ? true : com.aspose.slides.internal.v6g.k5.l6(obj, e5.class) && this.n5((e5)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.n5 != null ? this.n5.hashCode() : 0;
      var1 = var1 * 397 ^ (this.l6 != null ? this.l6.hashCode() : 0);
      return var1 * 397 ^ (int)this.k5;
   }

   @Override
   public int u9() {
      return 12;
   }
}
