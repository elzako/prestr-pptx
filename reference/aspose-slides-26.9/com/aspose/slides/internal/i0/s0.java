package com.aspose.slides.internal.i0;

public final class s0 extends u3 {
   private float n5;
   private float l6;

   public s0() {
   }

   public s0(com.aspose.slides.internal.o9b.w1 var1) {
      this.n5 = var1.l6();
      this.l6 = var1.k5();
   }

   public final float l6() {
      return this.l6;
   }

   public final void n5(float var1) {
      this.l6 = var1;
   }

   public final float k5() {
      return this.n5;
   }

   public final void l6(float var1) {
      this.n5 = var1;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("X: {0}, Y: {1}", this.n5, this.l6);
   }

   private boolean n5(s0 var1) {
      return com.aspose.slides.ms.System.n1.l6(this.n5, var1.n5) && com.aspose.slides.ms.System.n1.l6(this.l6, var1.l6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj) ? true : com.aspose.slides.internal.v6g.k5.l6(obj, s0.class) && this.n5((s0)obj);
      }
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.ms.System.n1.n5(this.n5) * 397 ^ com.aspose.slides.ms.System.n1.n5(this.l6);
   }

   @Override
   public com.aspose.slides.internal.o9b.w1 n5() {
      return new com.aspose.slides.internal.o9b.w1(this.n5, this.l6);
   }

   @Override
   public int u9() {
      return 8;
   }
}
