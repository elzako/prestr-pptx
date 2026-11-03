package com.aspose.slides.internal.l9o;

import com.aspose.slides.internal.p4t.n5$n5;

abstract class u6 extends p8 {
   protected u6(com.aspose.slides.internal.o9b.l6 var1, com.aspose.slides.internal.g3x.k5 var2, com.aspose.slides.internal.j9e.n5 var3) {
      super(var1, var2, var3);
   }

   @Override
   protected n5$n5 t2() {
      return new t1(this);
   }

   @Override
   protected int n5(com.aspose.slides.internal.p4t.u3 var1) {
      byte var2 = var1.n5();
      byte var3 = var1.n5();
      return (var3 & 0xFF) << 8 | var2 & 0xFF;
   }
}
