package com.aspose.slides;

final class d7n extends g8<LightRig, d7n> implements ILightRigEffectiveData {
   int n5 = 1;
   int l6 = 25;
   float[] k5 = new float[]{0.0F, 0.0F, 0.0F};

   final void n5() {
      this.n5 = 1;
      this.l6 = 25;
      if (this.k5 != null) {
         this.k5[0] = 0.0F;
         this.k5[1] = 0.0F;
         this.k5[2] = 0.0F;
      }
   }

   @Override
   public final int getDirection() {
      return this.n5;
   }

   @Override
   public final int getLightType() {
      return this.l6;
   }

   @Override
   public final float[] getRotation() {
      return this.k5 != null ? com.aspose.slides.internal.v6g.k5.k5(com.aspose.slides.ms.System.u3.n5((Object)(this.k5)).deepClone(), float[].class) : null;
   }

   final void n5(i7b var1) {
      d7n var2 = (d7n)var1;
      this.n5 = var2.n5;
      this.l6 = var2.l6;
      this.k5 = var2.k5;
   }

   void n5(i7b var1, LightRig var2) {
      this.n5(var1);
      this.n5(var2);
   }

   final void n5(LightRig var1) {
      if (var1.getDirection() != -1 || var1.getLightType() != -1 || var1.a6() != null) {
         if (var1.getDirection() != -1) {
            this.n5 = var1.getDirection();
         }

         if (var1.getLightType() != -1) {
            this.l6 = var1.getLightType();
         }

         this.k5 = var1.getRotation();
      }
   }

   boolean n5(d7n var1) {
      return var1 == null ? false : this.n5 == var1.n5 && this.l6 == var1.l6 && com.aspose.slides.internal.n8e.v4.n5(this.k5, var1.k5);
   }

   @Override
   boolean n5(g8 recoveredArg) {
      return this.n5((com.aspose.slides.d7n)recoveredArg);
   }
}
