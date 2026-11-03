package com.aspose.slides.internal.l9o;

import com.aspose.slides.internal.p4t.n5$n5;

class m3 implements n5$n5 {
   // $VF: synthetic field
   final k7 n5;

   m3(k7 var1) {
      this.n5 = var1;
   }

   @Override
   public void n5(com.aspose.slides.internal.p4t.k5 var1, com.aspose.slides.internal.p4t.u3 var2) {
      int var3 = var2.n5() & 255;
      int var4 = var2.n5() & 255;
      int var5 = var2.n5() & 255;
      int var6 = var2.n5() & 255;
      var1.n5(var6 << 24 | var5 << 16 | var4 << 8 | var3);
   }
}
