package com.aspose.slides.internal.l9o;

import com.aspose.slides.internal.p4t.n5$n5;

public class k7 extends p8 {
   public k7(com.aspose.slides.internal.o9b.l6 var1, com.aspose.slides.internal.g3x.k5 var2, com.aspose.slides.internal.j9e.n5 var3) {
      super(var1, var2, var3);
   }

   @Override
   protected n5$n5 t2() {
      return new m3(this);
   }

   @Override
   protected int n5(com.aspose.slides.internal.p4t.u3 var1) {
      int var2 = var1.n5() & 255;
      int var3 = var1.n5() & 255;
      int var4 = var1.n5() & 255;
      int var5 = var1.n5() & 255;
      if (this.u9() == 139273) {
         var5 = 255;
      }

      return var5 << 24 | var4 << 16 | var3 << 8 | var2;
   }
}
