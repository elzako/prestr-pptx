package com.aspose.slides.internal.c2;

import com.aspose.slides.internal.f5.e2;
import com.aspose.slides.internal.f5.z1;
import com.aspose.slides.internal.w5.a6;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.t9;

public class k5 extends com.aspose.slides.internal.w5.k5 {
   public k5(e2 var1, z1 var2) {
      super(var1, var2);
   }

   @Override
   public void n5(a6 var1) {
      boolean var2 = false;
      if (!this.t2("xmlns")) {
         var2 = true;
         this.n5("xmlns", "http://www.w3.org/2000/svg");
      }

      int var3 = this.u9().n5();

      for (int var4 = 0; var4 < var3; var4++) {
         com.aspose.slides.internal.f5.n5 var5 = (com.aspose.slides.internal.f5.n5)this.u9().n5(var4);
         String var6 = var5.t2();
         if (!t9.u9(var6.charAt(0))) {
            this.u9().l6(var5);
            var4--;
            var3--;
         }
      }

      com.aspose.slides.internal.j3.k5 var7 = this.u9().l6("xmlns");
      if (d1.n5(var7.k5()) || !d1.u3("http://www.w3.org/2000/svg", var7.k5(), (short)5)) {
         var7.n5("http://www.w3.org/2000/svg");
      }

      var1.n5(this);
      if (var2) {
         this.a6("xmlns");
      }
   }
}
