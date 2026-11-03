package com.aspose.slides.internal.v6;

import com.aspose.slides.internal.b9.j3;
import com.aspose.slides.internal.b9.s9;

public abstract class e2 extends com.aspose.slides.internal.r5.a6 {
   protected e2(com.aspose.slides.internal.r5.y4 var1) {
      super(var1);
   }

   @Override
   public void u9(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      j3 var3 = (j3)var1;
      com.aspose.slides.internal.o9b.y2 var4 = var3.n5().c8().n3();
      com.aspose.slides.internal.o9b.a0 var5 = var2.v0().l6();
      var5.l6(var4.n3());
      if (!this.n5(var5, var2)) {
         com.aspose.slides.internal.o9b.u3 var6 = var2.t2();
         if (var6 != null) {
            com.aspose.slides.internal.o9b.a0 var7 = var3.k5().k5();
            this.n5(var6, var7, var2);
         }
      }
   }

   @Override
   public boolean h0(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      return true;
   }

   protected abstract boolean n5(com.aspose.slides.internal.o9b.a0 var1, com.aspose.slides.internal.r6.u9 var2);

   protected abstract void n5(com.aspose.slides.internal.o9b.u3 var1, com.aspose.slides.internal.o9b.a0 var2, com.aspose.slides.internal.r6.u9 var3);
}
