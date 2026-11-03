package com.aspose.slides.internal.p0s;

import com.aspose.slides.internal.y5s.x8;
import com.aspose.slides.ms.System.q1;

public class k5 extends n5 {
   public k5() {
      super(x8.n5().n5(), x8.l6().n5());
   }

   @Override
   public float[] toRGB(float[] ycck) {
      float var2 = ycck[0];
      float var3 = ycck[1];
      float var4 = ycck[2];
      float var5 = ycck[3];
      float[] var6 = new float[]{
         1.0F - q1.n5(0.0F, q1.l6(1.0F, 1.0F * var2 + 0.0F * var3 + 1.402F * var4 + -0.703749F)),
         1.0F - q1.n5(0.0F, q1.l6(1.0F, 1.0F * var2 + -0.34414F * var3 + -0.71414F * var4 + 0.5312151F)),
         1.0F - q1.n5(0.0F, q1.l6(1.0F, 1.0F * var2 + 1.7718F * var3 + 0.0F * var4 + -0.8894745F)),
         var5
      };
      return super.toRGB(var6);
   }

   @Override
   public float[] fromRGB(float[] rgb) {
      float[] var2 = super.fromRGB(rgb);
      float var3 = var2[0];
      float var4 = var2[1];
      float var5 = var2[2];
      float var6 = var2[3];
      return new float[]{
         1.0F - q1.n5(0.0F, q1.l6(1.0F, 0.299F * var3 + 0.587F * var4 + 0.114F * var5 + 0.0F)),
         1.0F - q1.n5(0.0F, q1.l6(1.0F, -0.16874F * var3 + -0.33126F * var4 + 0.5F * var5 + 0.5019608F)),
         1.0F - q1.n5(0.0F, q1.l6(1.0F, 0.5F * var3 + -0.41869F * var4 + -0.08131F * var5 + 0.5019608F)),
         var2[3]
      };
   }
}
