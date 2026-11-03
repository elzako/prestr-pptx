package com.aspose.slides.internal.x7u;

public class x8 extends n5 {
   private final com.aspose.slides.internal.e3j.h0 l6;

   public x8(com.aspose.slides.internal.e3j.h0 var1) {
      this.l6 = var1;
   }

   @Override
   public com.aspose.slides.internal.z3o.a6 l6(float var1, float var2) {
      com.aspose.slides.internal.z3o.a6 var3 = new com.aspose.slides.internal.z3o.a6();
      float var4 = var1 * var1 + var2 * var2;
      if (var4 == 0.0F) {
         var3.n5 = 0.0F;
         var3.l6 = 0.0F;
      } else {
         float[] var5 = this.l6.n5(var1, var2);
         var3.n5 = var5[0];
         var3.l6 = var5[1];
      }

      var3.k5 = -var3.n5;
      var3.u3 = -var3.l6;
      return var3;
   }
}
