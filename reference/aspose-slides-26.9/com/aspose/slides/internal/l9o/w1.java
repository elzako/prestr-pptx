package com.aspose.slides.internal.l9o;

import com.aspose.slides.internal.p4t.n5$n5;

public class w1 extends p8 {
   public w1(com.aspose.slides.internal.o9b.l6 var1, com.aspose.slides.internal.g3x.k5 var2, com.aspose.slides.internal.j9e.n5 var3) {
      super(var1, var2, var3);
   }

   @Override
   protected n5$n5 t2() {
      return new r4(this);
   }

   @Override
   protected int n5(com.aspose.slides.internal.p4t.u3 var1) {
      int var2 = var1.n5() & 255;
      int var3 = var1.n5() & 255;
      int var4 = var1.n5() & 255;
      int var5 = var1.n5() & 255;
      int var6 = var1.n5() & 255;
      int var7 = var1.n5() & 255;
      int var8 = com.aspose.slides.internal.t5g.u3.n5(var3 << 8 | var2) & 255;
      int var9 = com.aspose.slides.internal.t5g.u3.n5(var5 << 8 | var4) & 255;
      int var10 = com.aspose.slides.internal.t5g.u3.n5(var7 << 8 | var6) & 255;
      return 0xFF000000 | var10 << 16 | var9 << 8 | var8;
   }
}
