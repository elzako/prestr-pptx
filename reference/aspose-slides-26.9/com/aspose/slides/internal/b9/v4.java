package com.aspose.slides.internal.b9;

public class v4 extends t2 {
   private long n5;
   private long l6;
   private com.aspose.slides.internal.t5.m1 k5;

   public v4(s9 var1) {
      super(var1);
   }

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

   public final com.aspose.slides.internal.t5.m1 k5() {
      return this.k5;
   }

   public final void n5(com.aspose.slides.internal.t5.m1 var1) {
      this.k5 = var1;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(
         "{0}, RgnDataSize: {1}, RegionMode: {2}, RgnData: {3}",
         super.toString(),
         this.n5(),
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.c5.t9.class, this.l6()),
         this.k5()
      );
   }

   protected final boolean n5(v4 var1) {
      return super.n5(var1) && this.n5 == var1.n5 && this.l6 == var1.l6 && com.aspose.slides.ms.System.j8.n5(this.k5, var1.k5);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((v4)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      var1 = var1 * 397 ^ (int)this.n5;
      var1 = var1 * 397 ^ (int)this.l6;
      return var1 * 397 ^ (this.k5 != null ? this.k5.hashCode() : 0);
   }
}
