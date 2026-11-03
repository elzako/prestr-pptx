package com.aspose.slides.internal.x7u;

public class c8 extends n5 {
   private final float l6;
   private final float k5;
   private final float u3;

   public c8(float var1, float var2, float var3) {
      this.l6 = var1;
      this.k5 = var2;
      this.u3 = var3;
   }

   @Override
   public com.aspose.slides.internal.z3o.a6 l6(float var1, float var2) {
      com.aspose.slides.internal.z3o.a6 var3 = new com.aspose.slides.internal.z3o.a6();
      float var4 = var1 * var1 + var2 * var2;
      if (var4 == 0.0F) {
         var3.n5 = 0.0F;
         var3.l6 = 0.0F;
      } else {
         var4 = (float)Math.sqrt(var4);
         var3.n5 = var2 * this.l6 * this.k5 / var4;
         var3.l6 = -(var1 * this.l6 * this.u3) / var4;
      }

      var3.k5 = -var3.n5;
      var3.u3 = -var3.l6;
      return var3;
   }
}
