package com.aspose.slides.internal.k6;

import com.aspose.slides.internal.a4.b3;

public abstract class c8 extends l6 {
   @Override
   public void k5(b3 var1, com.aspose.slides.internal.x3.a6 var2) {
      com.aspose.slides.internal.a4.x8 var3 = (com.aspose.slides.internal.a4.x8)var1;
      var2.u3(var3.k5() & 255);
      var2.n5(var3.u3(), var3.y4());
      this.n5(var3, var2);
   }

   protected abstract void n5(com.aspose.slides.internal.a4.x8 var1, com.aspose.slides.internal.x3.a6 var2);

   protected final float n5(com.aspose.slides.internal.o9b.n3 var1) {
      com.aspose.slides.internal.o9b.y4 var2 = var1.l6();
      return var2.k5(var1.x8()) * var1.c8() / var2.u9(var1.x8());
   }
}
