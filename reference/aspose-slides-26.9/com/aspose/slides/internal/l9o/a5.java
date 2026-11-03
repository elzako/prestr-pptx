package com.aspose.slides.internal.l9o;

import com.aspose.slides.internal.p4t.n5$n5;

public abstract class a5 extends p8 {
   protected a5(com.aspose.slides.internal.o9b.l6 var1, com.aspose.slides.internal.g3x.k5 var2, com.aspose.slides.internal.j9e.n5 var3) {
      super(var1, var2, var3);
   }

   @Override
   protected n5$n5 t2() {
      return new h2(this);
   }

   protected int n5(int var1, int var2) {
      int var3 = var2 * 255 + var1;
      return var3 >> 5 > 255 ? com.aspose.slides.internal.t5g.u3.n5(var3) & 0xFF : var3 >> 5 & 0xFF;
   }
}
