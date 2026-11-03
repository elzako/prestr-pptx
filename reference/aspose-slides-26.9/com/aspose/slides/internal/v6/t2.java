package com.aspose.slides.internal.v6;

import com.aspose.slides.internal.b9.a5;
import com.aspose.slides.internal.b9.s9;

public abstract class t2 extends com.aspose.slides.internal.r5.a6 {
   protected t2(com.aspose.slides.internal.r5.y4 var1) {
      super(var1);
   }

   @Override
   public void u9(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      a5 var3 = (a5)var1;
      com.aspose.slides.internal.x4g.s7 var4 = var2.t9();
      if (var4 != null && var2.t2() != null) {
         var4.x8();
         var4.n5(var2.w1() == 1L ? 0 : 1);
         this.n5(var4, var2);
      }
   }

   @Override
   public boolean h0(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      return true;
   }

   protected abstract void n5(com.aspose.slides.internal.x4g.s7 var1, com.aspose.slides.internal.r6.u9 var2);
}
