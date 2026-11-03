package com.aspose.slides.internal.i0;

public final class g7 extends a6 {
   private float n5;
   private float l6;
   private float k5;
   private float u3;

   public g7() {
   }

   public g7(com.aspose.slides.internal.o9b.y1 var1) {
      this.n5 = var1.x8();
      this.l6 = var1.n3();
      this.k5 = var1.s7();
      this.u3 = var1.k5();
   }

   public final float l6() {
      return this.n5;
   }

   public final void n5(float var1) {
      this.n5 = var1;
   }

   public final float k5() {
      return this.l6;
   }

   public final void l6(float var1) {
      this.l6 = var1;
   }

   public final float u3() {
      return this.k5;
   }

   public final void k5(float var1) {
      this.k5 = var1;
   }

   public final float a6() {
      return this.u3;
   }

   public final void u3(float var1) {
      this.u3 = var1;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("[X: {0}, Y: {1}, Width: {2}, Height: {3}]", this.n5, this.l6, this.k5, this.u3);
   }

   private boolean n5(g7 var1) {
      return com.aspose.slides.ms.System.n1.l6(this.n5, var1.n5)
         && com.aspose.slides.ms.System.n1.l6(this.l6, var1.l6)
         && com.aspose.slides.ms.System.n1.l6(this.k5, var1.k5)
         && com.aspose.slides.ms.System.n1.l6(this.u3, var1.u3);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj) ? true : com.aspose.slides.internal.v6g.k5.l6(obj, g7.class) && this.n5((g7)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = com.aspose.slides.ms.System.n1.n5(this.n5);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.n1.n5(this.l6);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.n1.n5(this.k5);
      return var1 * 397 ^ com.aspose.slides.ms.System.n1.n5(this.u3);
   }

   @Override
   public int u9() {
      return 16;
   }

   @Override
   public com.aspose.slides.internal.o9b.y1 n5() {
      return new com.aspose.slides.internal.o9b.y1(this.n5, this.l6, this.k5, this.u3);
   }
}
