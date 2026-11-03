package com.aspose.slides.internal.w2k;

import com.aspose.slides.internal.o9b.m3;
import com.aspose.slides.internal.o9b.w1;

public class u9 extends h0 {
   public u9(m3 var1) {
      super(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.k3w.a6 var1, com.aspose.slides.internal.k3w.h0 var2, w1 var3, com.aspose.slides.internal.z3o.a6 var4, boolean var5) {
      if (!this.n5(var1, var1.h0(), var2, var3, var4, var5)) {
         super.n5(var1, var2, var3, var4, var5);
      }
   }

   private boolean n5(
      com.aspose.slides.internal.k3w.a6 var1,
      com.aspose.slides.internal.k3w.u9 var2,
      com.aspose.slides.internal.k3w.h0 var3,
      w1 var4,
      com.aspose.slides.internal.z3o.a6 var5,
      boolean var6
   ) {
      float var7 = var2.u9.l6();
      float var8 = var2.u9.k5();
      float var9 = var4.l6();
      float var10 = var4.k5();
      float var11 = var2.a6.l6();
      float var12 = var2.a6.k5();
      com.aspose.slides.internal.z3o.a6 var13 = var3.u3;
      if (this.n5(var1, var3, var6)) {
         return this.l6(var11, var12, var7, var8, var9, var10, var13.n5, var13.l6, var5.n5, var5.l6, this.n5);
      } else {
         return this.l6(var1, var3, var6) ? this.l6(var11, var12, var7, var8, var9, var10, var13.k5, var13.u3, var5.k5, var5.u3, this.n5) : false;
      }
   }

   private boolean l6(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11) {
      w1 var12 = this.n5(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
      if (!com.aspose.slides.internal.e3j.u9.n5(var12)) {
         return true;
      }

      w1 var13 = new w1(var1, var2);
      float var14 = (float)com.aspose.slides.internal.e3j.u9.n5(var13, var12);
      return var11 < var14;
   }
}
