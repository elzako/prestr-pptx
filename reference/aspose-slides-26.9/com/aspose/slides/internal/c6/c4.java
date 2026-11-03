package com.aspose.slides.internal.c6;

import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.d1;

abstract class c4 extends x8 {
   protected c4() {
   }

   protected c4(String var1) {
      super(var1);
   }

   @Override
   protected void n5(a5 var1) {
      var1.n5(this.n5());
   }

   @Override
   protected void n5(String var1, int var2, int var3) {
      this.n5(d1.l6(var1, var2, var3 - var2));
   }

   protected abstract String n5();

   protected abstract void n5(String var1);
}
