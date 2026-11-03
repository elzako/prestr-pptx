package com.aspose.slides.internal.x7u;

public class a6 extends n5 {
   private final float l6;
   private final boolean k5;

   public a6(float var1, boolean var2) {
      this.l6 = var1;
      this.k5 = var2;
   }

   @Override
   public boolean k5() {
      return true;
   }

   @Override
   public com.aspose.slides.internal.z3o.a6 l6(float var1, float var2) {
      com.aspose.slides.internal.z3o.a6 var3 = new com.aspose.slides.internal.z3o.a6();
      float var4 = var1 * var1 + var2 * var2;
      if (var4 == 0.0F) {
         var3.n5 = 0.0F;
         var3.l6 = 0.0F;
         var3.k5 = 0.0F;
         var3.u3 = 0.0F;
      } else {
         var4 = (float)Math.sqrt(var4);
         var3.n5 = 0.0F;
         var3.l6 = 0.0F;
         var3.k5 = 2.0F * var2 * this.l6 / var4;
         var3.u3 = -(2.0F * var1 * this.l6) / var4;
         if (!this.k5) {
            var3.k5 = -var3.k5;
            var3.u3 = -var3.u3;
         }
      }

      return var3;
   }
}
