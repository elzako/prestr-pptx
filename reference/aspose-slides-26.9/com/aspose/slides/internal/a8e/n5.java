package com.aspose.slides.internal.a8e;

import com.aspose.slides.internal.e3j.a6$n5;
import com.aspose.slides.internal.t9z.h0;
import com.aspose.slides.internal.z3o.u9;

public abstract class n5 implements com.aspose.slides.internal.w9n.n5 {
   protected final h0 n5;

   protected n5(h0 var1) {
      this.n5 = var1;
   }

   @Override
   public void n5(com.aspose.slides.internal.t9z.k5 var1, u9 var2, a6$n5 var3) {
      com.aspose.slides.internal.x4g.u9 var4 = this.n5.n5().h0();
      this.n5(var1, var4, var2.l6.l6(), var2.l6.k5(), -var2.k5.n5, -var2.k5.l6);
   }

   @Override
   public void l6(com.aspose.slides.internal.t9z.k5 var1, u9 var2, a6$n5 var3) {
      com.aspose.slides.internal.x4g.u9 var4 = this.n5.n5().u9();
      this.n5(var1, var4, var2.l6.l6(), var2.l6.k5(), var2.k5.n5, var2.k5.l6);
   }

   protected abstract void n5(com.aspose.slides.internal.t9z.k5 var1, com.aspose.slides.internal.x4g.u9 var2, float var3, float var4, float var5, float var6);

   protected float n5(float var1, float var2, float var3, float var4, float var5) {
      return var1 + var4 * var2 - var5 * var3;
   }

   protected float l6(float var1, float var2, float var3, float var4, float var5) {
      return var1 + var4 * var3 + var5 * var2;
   }
}
