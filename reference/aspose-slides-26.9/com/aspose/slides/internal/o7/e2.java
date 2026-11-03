package com.aspose.slides.internal.o7;

import com.aspose.slides.internal.o9b.e5;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.ms.System.q1;

public class e2 extends com.aspose.slides.internal.k6.z1 {
   private final com.aspose.slides.internal.k6.n5 n5 = new m3(this);

   @Override
   public com.aspose.slides.internal.k6.n5 n5() {
      return this.n5;
   }

   @Override
   protected void n5(com.aspose.slides.internal.a4.z3 var1, y1 var2, com.aspose.slides.internal.o9b.n3 var3, e5 var4, com.aspose.slides.internal.x3.a6 var5) {
      com.aspose.slides.internal.o9b.z1 var6 = var5.n5();
      if (!(q1.n5(var2.s7()) < 0.001) && !(q1.n5(var2.k5()) < 0.001)) {
         var6.n5(var1.n3(), var3, var5.h0(), var2.y4(), var4);
      } else {
         var6.n5(var1.n3(), var3, var5.h0(), var2.x8(), var2.n3(), var4);
      }
   }
}
