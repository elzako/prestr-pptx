package com.aspose.slides;

final class j2 extends g8<Camera, j2> implements ICameraEffectiveData {
   private int n5;
   private float l6 = Float.NaN;
   private float k5 = Float.NaN;
   private float[] u3;

   j2() {
      this.n5 = -1;
      this.u3 = new float[]{0.0F, 0.0F, 0.0F};
   }

   final void n5() {
      this.l6 = Float.NaN;
      this.k5 = Float.NaN;
      this.n5 = -1;
      if (this.u3 != null) {
         this.u3[0] = 0.0F;
         this.u3[1] = 0.0F;
         this.u3[2] = 0.0F;
      }
   }

   @Override
   public final int getCameraType() {
      return this.n5;
   }

   @Override
   public final float getFieldOfViewAngle() {
      return this.l6;
   }

   @Override
   public final float getZoom() {
      return this.k5;
   }

   @Override
   public final float[] getRotation() {
      return this.u3 != null ? com.aspose.slides.internal.v6g.k5.k5(com.aspose.slides.ms.System.u3.n5((Object)(this.u3)).deepClone(), float[].class) : null;
   }

   final void n5(i7b var1) {
      j2 var2 = (j2)var1;
      this.n5 = var2.n5;
      this.l6 = var2.l6;
      this.k5 = var2.k5;
      this.u3 = var2.u3;
   }

   void n5(i7b var1, Camera var2) {
      this.n5(var1);
      this.n5(var2);
   }

   final void n5(Camera var1) {
      if (var1.getCameraType() != -1) {
         this.n5 = var1.getCameraType();
         if (!com.aspose.slides.ms.System.j8.n5(var1.getFieldOfViewAngle(), Float.NaN)) {
            this.l6 = var1.getFieldOfViewAngle();
         }

         if (!com.aspose.slides.ms.System.j8.n5(var1.getZoom(), Float.NaN)) {
            this.k5 = var1.getZoom();
         }

         this.u3 = var1.getRotation();
      }
   }

   boolean n5(j2 var1) {
      return var1 == null
         ? false
         : com.aspose.slides.internal.n8e.v4.n5(this.u3, var1.u3)
            && this.n5 == var1.n5
            && com.aspose.slides.internal.n8e.v4.n5(this.l6, var1.l6)
            && com.aspose.slides.internal.n8e.v4.n5(this.k5, var1.k5);
   }

   @Override
   boolean n5(g8 recoveredArg) {
      return this.n5((com.aspose.slides.j2)recoveredArg);
   }
}
