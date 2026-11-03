package com.aspose.slides;

final class c5 extends g8<Backdrop3DScene, c5> {
   private float[] n5;
   private float[] l6;
   private float[] k5;

   final void n5() {
      this.n5 = null;
      this.k5 = null;
      this.l6 = null;
   }

   public final float[] l6() {
      return this.n5 != null ? com.aspose.slides.internal.v6g.k5.k5(com.aspose.slides.ms.System.u3.n5((Object)(this.n5)).deepClone(), float[].class) : null;
   }

   public final float[] k5() {
      return this.l6 != null ? com.aspose.slides.internal.v6g.k5.k5(com.aspose.slides.ms.System.u3.n5((Object)(this.l6)).deepClone(), float[].class) : null;
   }

   public final float[] u3() {
      return this.k5 != null ? com.aspose.slides.internal.v6g.k5.k5(com.aspose.slides.ms.System.u3.n5((Object)(this.k5)).deepClone(), float[].class) : null;
   }

   final void n5(i7b var1) {
      c5 var2 = (c5)var1;
      this.n5 = var2.n5;
      this.l6 = var2.l6;
      this.k5 = var2.k5;
   }

   void n5(i7b var1, Backdrop3DScene var2) {
      this.n5(var1);
      this.n5(var2);
   }

   final void n5(Backdrop3DScene var1) {
      this.n5 = (float[])var1.getNormalVector().clone();
      this.l6 = (float[])var1.getAnchorPoint().clone();
      this.k5 = (float[])var1.getUpVector().clone();
   }

   boolean n5(c5 var1) {
      return var1 == null
         ? false
         : com.aspose.slides.internal.n8e.v4.n5(this.n5, var1.n5)
            && com.aspose.slides.internal.n8e.v4.n5(this.l6, var1.l6)
            && com.aspose.slides.internal.n8e.v4.n5(this.k5, var1.k5);
   }

   @Override
   boolean n5(g8 recoveredArg) {
      return this.n5((com.aspose.slides.c5)recoveredArg);
   }
}
