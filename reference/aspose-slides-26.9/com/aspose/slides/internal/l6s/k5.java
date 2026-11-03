package com.aspose.slides.internal.l6s;

import com.aspose.slides.internal.e3j.a6$n5;
import com.aspose.slides.internal.o9b.w1;
import java.awt.geom.AffineTransform;

public abstract class k5 implements com.aspose.slides.internal.w9n.n5 {
   private final com.aspose.slides.internal.e3j.h0 n5;

   protected k5(float var1, AffineTransform var2) {
      this.n5 = com.aspose.slides.internal.e3j.h0.n5(var1, var2);
   }

   @Override
   public void n5(com.aspose.slides.internal.t9z.k5 var1, com.aspose.slides.internal.z3o.u9 var2, a6$n5 var3) {
      if (this.n5() && var2.n5()) {
         for (com.aspose.slides.internal.z3o.u9 var6 : var2.l6()) {
            this.n5(var1, var6);
         }
      } else {
         this.n5(var1, var2);
      }
   }

   @Override
   public void l6(com.aspose.slides.internal.t9z.k5 var1, com.aspose.slides.internal.z3o.u9 var2, a6$n5 var3) {
      if (this.n5() && var2.n5()) {
         for (com.aspose.slides.internal.z3o.u9 var6 : var2.l6()) {
            this.l6(var1, var6);
         }
      } else {
         this.l6(var1, var2);
      }
   }

   protected boolean n5() {
      return false;
   }

   private void n5(com.aspose.slides.internal.t9z.k5 var1, com.aspose.slides.internal.z3o.u9 var2) {
      this.n5(var1, var2.l6.l6(), var2.l6.k5(), var2.k5.n5, var2.k5.l6, var2.k5.k5, var2.k5.u3, var2.u3.l6(), var2.u3.k5(), false);
   }

   private void l6(com.aspose.slides.internal.t9z.k5 var1, com.aspose.slides.internal.z3o.u9 var2) {
      this.n5(var1, var2.l6.l6(), var2.l6.k5(), var2.k5.n5, var2.k5.l6, var2.k5.k5, var2.k5.u3, var2.u3.l6(), var2.u3.k5(), true);
   }

   protected abstract void n5(
      com.aspose.slides.internal.t9z.k5 var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, boolean var10
   );

   protected w1 n5(float var1, float var2, boolean var3) {
      com.aspose.slides.internal.e3j.u3 var4 = new com.aspose.slides.internal.e3j.u3(new w1(0.0F, 0.0F), new w1(var1, var2));
      w1[] var5 = this.n5.n5(var4);
      w1 var6 = var5[0];
      float var7 = (float)Math.toDegrees(com.aspose.slides.internal.e3j.u9.l6(var6.l6(), var6.k5(), var1, var2));
      boolean var8 = var3 && (-90.0F >= var7 || var7 >= 90.0F) || !var3 && -90.0F < var7 && var7 < 90.0F;
      if (var8) {
         var6 = var5[1];
      }

      return var6;
   }
}
