package com.aspose.slides.internal.i0;

public final class s3 extends y8 {
   private float n5;
   private float l6;
   private long k5;

   public final float n5() {
      return this.n5;
   }

   public final void n5(float var1) {
      this.n5 = var1;
   }

   public final float l6() {
      return this.l6;
   }

   public final void l6(float var1) {
      this.l6 = var1;
   }

   public final long k5() {
      return this.k5;
   }

   public final void n5(long var1) {
      this.k5 = var1;
   }

   private boolean n5(s3 var1) {
      return com.aspose.slides.ms.System.n1.l6(this.n5, var1.n5) && com.aspose.slides.ms.System.n1.l6(this.l6, var1.l6) && this.k5 == var1.k5;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj) ? true : com.aspose.slides.internal.v6g.k5.l6(obj, s3.class) && this.n5((s3)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = com.aspose.slides.ms.System.n1.n5(this.n5);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.n1.n5(this.l6);
      return var1 * 397 ^ (int)this.k5;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("FocusScaleX: {0}, FocusScaleY: {1}, FocusScaleCount: {2}", this.n5, this.l6, this.k5);
   }

   @Override
   public int u9() {
      return 12;
   }
}
