package com.aspose.slides.internal.i0;

public class o5 extends y8 {
   private long n5;
   private int l6;
   private float k5;
   private j8 u3;

   public final long n5() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final int l6() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.l6 = var1;
   }

   public final float k5() {
      return this.k5;
   }

   public final void n5(float var1) {
      this.k5 = var1;
   }

   public final j8 u3() {
      return this.u3;
   }

   public final void n5(j8 var1) {
      this.u3 = var1;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(
         "PenDataFlags: {0}, PenUnit: {1}, PenWidth: {2}, OptionalData: {3}",
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.d2.class, this.n5),
         com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.t1.class, this.l6),
         this.k5,
         this.u3
      );
   }

   protected final boolean n5(o5 var1) {
      return this.n5 == var1.n5
         && this.l6 == var1.l6
         && com.aspose.slides.ms.System.j8.n5(this.u3, var1.u3)
         && com.aspose.slides.ms.System.n1.l6(this.k5, var1.k5);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((o5)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = (int)this.n5;
      var1 = var1 * 397 ^ this.l6;
      var1 = var1 * 397 ^ (this.u3 != null ? this.u3.hashCode() : 0);
      return var1 * 397 ^ com.aspose.slides.ms.System.n1.n5(this.k5);
   }

   @Override
   public int u9() {
      return 12 + this.u3().k5(this.n5());
   }
}
