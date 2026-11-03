package com.aspose.slides.internal.h9;

import com.aspose.slides.internal.b9.l0;
import com.aspose.slides.internal.b9.s9;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.ms.System.q1;

public abstract class c8 extends com.aspose.slides.internal.r5.n5 {
   protected c8(n5 var1) {
      super(var1);
   }

   @Override
   public void u9(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      l0 var3 = (l0)var1;
      this.n5(var3, var2);
   }

   protected abstract void n5(l0 var1, com.aspose.slides.internal.r6.u9 var2);

   protected final y2 n5(int var1, int var2, int var3, int var4) {
      if (var3 < 0) {
         var1 += var3;
         var3 = q1.n5(var3);
      }

      if (var4 < 0) {
         var2 += var4;
         var4 = q1.n5(var4);
      }

      return new y2(var1, var2, var3, var4);
   }
}
