package com.aspose.slides;

final class z1z extends g8<SketchFormat, z1z> implements ISketchFormatEffectiveData {
   long n5 = 1219033472L;
   int l6 = -1;

   final void n5() {
      this.n5 = 1219033472L;
      this.l6 = -1;
   }

   @Override
   public final int getSketchType() {
      return this.l6;
   }

   final void n5(i7b var1) {
      z1z var2 = (z1z)var1;
      this.n5 = var2.n5;
      this.l6 = var2.l6;
   }

   void n5(i7b var1, SketchFormat var2) {
      this.n5(var1);
      this.n5(var2);
   }

   final void n5(SketchFormat var1) {
      if (var1.getSketchType() != -1) {
         this.n5 = var1.u3();
         this.l6 = var1.getSketchType();
      }
   }

   boolean n5(z1z var1) {
      return var1 == null ? false : com.aspose.slides.internal.n8e.v4.n5((float)(this.n5 & 4294967295L), (float)(var1.n5 & 4294967295L)) && this.l6 == var1.l6;
   }

   @Override
   boolean n5(g8 recoveredArg) {
      return this.n5((com.aspose.slides.z1z)recoveredArg);
   }
}
