package com.aspose.slides.internal.i1t;

import com.aspose.slides.internal.t9z.k5;
import java.awt.geom.AffineTransform;

public class l6 implements k5 {
   private final k5 n5;
   private final float l6;
   private final float k5;
   private final float u3;
   private final float a6;
   private final float u9;
   private final float h0;

   public l6(k5 var1, AffineTransform var2) {
      this.n5 = var1;
      this.l6 = (float)var2.getScaleX();
      this.k5 = (float)var2.getShearX();
      this.u3 = (float)var2.getShearY();
      this.a6 = (float)var2.getScaleY();
      this.u9 = (float)var2.getTranslateX();
      this.h0 = (float)var2.getTranslateY();
   }

   @Override
   public void n5(float var1, float var2) {
      this.n5.n5(var1 * this.l6 + var2 * this.k5 + this.u9, var1 * this.u3 + var2 * this.a6 + this.h0);
   }

   @Override
   public void l6(float var1, float var2) {
      this.n5.l6(var1 * this.l6 + var2 * this.k5 + this.u9, var1 * this.u3 + var2 * this.a6 + this.h0);
   }

   @Override
   public void n5(float var1, float var2, float var3, float var4) {
      this.n5
         .n5(
            var1 * this.l6 + var2 * this.k5 + this.u9,
            var1 * this.u3 + var2 * this.a6 + this.h0,
            var3 * this.l6 + var4 * this.k5 + this.u9,
            var3 * this.u3 + var4 * this.a6 + this.h0
         );
   }

   @Override
   public void n5(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.n5
         .n5(
            var1 * this.l6 + var2 * this.k5 + this.u9,
            var1 * this.u3 + var2 * this.a6 + this.h0,
            var3 * this.l6 + var4 * this.k5 + this.u9,
            var3 * this.u3 + var4 * this.a6 + this.h0,
            var5 * this.l6 + var6 * this.k5 + this.u9,
            var5 * this.u3 + var6 * this.a6 + this.h0
         );
   }

   @Override
   public void n5() {
      this.n5.n5();
   }

   @Override
   public void l6() {
      this.n5.l6();
   }
}
