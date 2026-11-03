package com.aspose.slides.internal.t1;

import com.aspose.slides.internal.o9b.y1;

public abstract class y4 extends m3 {
   private int h0;

   protected y4(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      super.n5(var1);
      this.h0 = var1.a6(194).a6();
   }

   public final int t1() {
      return this.h0;
   }

   protected final void n5(y1 var1, com.aspose.slides.internal.v8.n3 var2, com.aspose.slides.internal.f2.u9 var3) {
      int var4 = 0;
      q0 var5 = (q0)this.h0(61);
      if (var5 != null) {
         var4 = var5.a5().l6(var3);
         float var6 = var1.s7();
         var1.k5(var1.x8() + var4);
         var1.l6(var6);
      }

      z1 var7 = (z1)this.h0(59);
      if (var7 != null) {
         var4 += var7.a5().l6(var3);
      }

      if (var4 > 0) {
         if (var2 != com.aspose.slides.internal.v8.n3.n5 && var2 != com.aspose.slides.internal.v8.n3.l6) {
            var1.n5(var1.k5() - var4);
         } else {
            var1.l6(var1.s7() - var4);
         }
      }
   }
}
