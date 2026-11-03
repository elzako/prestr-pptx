package com.aspose.slides;

class o4f {
   private e4c n5 = new e4c(Double.NaN, Double.NaN);
   private e4c l6 = new e4c(Double.NaN, Double.NaN);
   private float k5 = Float.NaN;
   private byte u3 = -1;
   private byte a6 = -1;

   public final e4c n5() {
      return this.n5;
   }

   public final e4c l6() {
      return this.l6;
   }

   public final float k5() {
      return this.k5;
   }

   public final void n5(float var1) {
      this.k5 = var1;
   }

   public final byte u3() {
      return this.u3;
   }

   public final void n5(byte var1) {
      this.u3 = var1;
   }

   public final byte a6() {
      return this.a6;
   }

   public final void l6(byte var1) {
      this.a6 = var1;
   }

   public final void n5(x4t var1) {
      int var2 = var1.u3 ? 1 : 0;
      int var3 = var1.k5 ? 1 : 0;
      this.n5(var1.l6, (byte)var2, (byte)var3);
   }

   public final void n5(float var1, byte var2, byte var3) {
      this.k5 = var1;
      this.u3 = var2;
      this.a6 = var3;
   }

   public final void n5(e4c var1) {
      var1.l6(this.n5);
   }

   public void l6(e4c var1) {
      var1.l6(this.l6);
   }

   final boolean u9() {
      return com.aspose.slides.ms.System.d2.k5(this.n5.n5)
         && com.aspose.slides.ms.System.d2.k5(this.n5.l6)
         && com.aspose.slides.ms.System.d2.k5(this.l6.n5)
         && com.aspose.slides.ms.System.d2.k5(this.l6.l6)
         && com.aspose.slides.ms.System.d2.k5(this.k5)
         && this.u3 == -1
         && this.a6 == -1;
   }
}
