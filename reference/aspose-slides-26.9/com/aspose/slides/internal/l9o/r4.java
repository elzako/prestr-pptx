package com.aspose.slides.internal.l9o;

import com.aspose.slides.internal.p4t.n5$n5;

class r4 implements n5$n5 {
   // $VF: synthetic field
   final w1 n5;

   r4(w1 var1) {
      this.n5 = var1;
   }

   @Override
   public void n5(com.aspose.slides.internal.p4t.k5 var1, com.aspose.slides.internal.p4t.u3 var2) {
      int var3 = var2.n5() & 255;
      int var4 = var2.n5() & 255;
      int var5 = var2.n5() & 255;
      int var6 = var2.n5() & 255;
      int var7 = var2.n5() & 255;
      int var8 = var2.n5() & 255;
      int var9 = var4 << 8 | var3;
      int var10 = var6 << 8 | var5;
      int var11 = var8 << 8 | var7;
      var1.n5(var11);
      var1.n5(var10);
      var1.n5(var9);
   }
}
