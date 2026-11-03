package com.aspose.slides.internal.e5;

import com.aspose.slides.internal.h2.a5;
import com.aspose.slides.internal.h2.z8$n5;

class s7$n5 extends z8$n5 {
   private s7 h0;

   public s7$n5(int var1, s7 var2) {
      super(var1);
      this.h0 = var2;
   }

   @Override
   public a5 n5(int var1, w1 var2, boolean var3, boolean var4) {
      a5 var5 = super.n5(var1, var2, var3, var4);
      if (var5 != null) {
         int var6 = var5.a6();
         if (var6 == 73 || var6 == 120) {
            var5 = com.aspose.slides.internal.e5.s7.n5(this.h0, var6, var2.a6(267).a6());
         }
      }

      return var5;
   }
}
