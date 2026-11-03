package com.aspose.slides.internal.p6x;

import com.aspose.slides.internal.c9b.u3;
import com.aspose.slides.internal.t9z.h0;
import com.aspose.slides.internal.x4g.m1;
import java.awt.geom.AffineTransform;

public class l6 {
   private final h0 n5;
   private float l6 = 1.0F;
   private float k5 = 1.0F;
   private boolean u3 = false;
   private float a6 = 1.0F;
   private final float u9;

   public l6(AffineTransform var1, h0 var2, boolean var3) {
      this(var1, var2, var3, 2.0F);
   }

   public l6(AffineTransform var1, h0 var2, boolean var3, float var4) {
      this.n5 = var2;
      this.u9 = var4;
      if (!var3 && var1.getScaleX() != 0.0 && var1.getScaleY() != 0.0) {
         this.l6 = (float)var1.getScaleX();
         this.k5 = (float)var1.getScaleY();
      } else {
         float[] var5 = com.aspose.slides.internal.c9b.u3.l6(m1.n5(var1));
         if (var5.length == 2) {
            this.l6 = Math.abs(var5[0]);
            this.k5 = Math.abs(var5[1]);
         } else {
            this.u3 = true;
            float var6 = com.aspose.slides.internal.c9b.u3.k5(m1.n5(var1));
            if (Math.abs(var6) > 0.0F) {
               this.a6 = var4 / var6;
            }
         }
      }
   }

   public float n5(float var1) {
      float var2 = var1;
      if (var2 <= 0.0F) {
         var2 = 1.0F;
      }

      if (this.u3) {
         var2 *= this.a6;
      } else {
         float var3 = this.n5.k5();
         if (this.l6 != this.k5 && !(this.l6 < this.k5)) {
            var2 = Math.max(var2, this.u9 / (this.k5 * var3));
         } else {
            var2 = Math.max(var2, this.u9 / (this.l6 * var3));
         }
      }

      return var2 * this.u9;
   }
}
