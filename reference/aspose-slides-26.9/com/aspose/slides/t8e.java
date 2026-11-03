package com.aspose.slides;

final class t8e {
   private double n5;
   private double l6;
   private int k5;
   private boolean u3;
   private long a6;

   t8e(boolean var1) {
      this.u3 = var1;
      this.n5 = Double.NaN;
      this.l6 = Double.NaN;
      this.k5 = -1;
   }

   public final double n5() {
      return this.n5;
   }

   public final void n5(double var1) {
      this.n5 = var1;
      this.u9();
   }

   public final double l6() {
      return this.l6;
   }

   public final void l6(double var1) {
      this.l6 = var1;
      this.u9();
   }

   public final int k5() {
      return this.k5;
   }

   public final void n5(int var1) {
      this.k5 = var1;
      this.u9();
   }

   final void n5(ShapeBevel var1) {
      this.n5 = var1.getWidth();
      this.l6 = var1.getHeight();
      this.k5 = var1.getBevelType();
      this.u3 = var1.u3();
   }

   final void n5(f6g var1) {
      this.n5 = var1.getWidth();
      this.l6 = var1.getHeight();
      this.k5 = var1.getBevelType();
      this.u3 = var1.n5;
   }

   final boolean u3() {
      return this.u3;
   }

   final long a6() {
      return this.a6;
   }

   private void u9() {
      this.a6++;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else {
         return o != null && ShapeBevel.class == o.getClass() ? this.l6((ShapeBevel)o) : false;
      }
   }

   public final boolean l6(ShapeBevel var1) {
      if (var1 == null) {
         return false;
      }

      boolean var2 = var1.u3();
      return this.n5 == var1.getWidth() && this.l6 == var1.getHeight() && this.k5 == var1.getBevelType() && this.u3 == var2;
   }

   @Override
   public int hashCode() {
      int var1 = 17;
      var1 = var1 * 31 + com.aspose.slides.ms.System.d2.n5(this.n5);
      var1 = var1 * 31 + com.aspose.slides.ms.System.d2.n5(this.l6);
      var1 = var1 * 31 + com.aspose.slides.ms.System.s3.n5(this.k5);
      return var1 * 31 + com.aspose.slides.ms.System.n3.n5(this.u3);
   }
}
