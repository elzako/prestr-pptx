package com.aspose.slides.internal.v9e;

public class x8 extends n5 {
   @Override
   public void n5(p3 var1, l6 var2) {
      switch (var2.k5()) {
         case 0:
            String var3 = var1.n5(var2.u9().k5());
            if (var1.n5(var3, false)) {
               var2.s7();
            } else {
               var2.n5(var3);
               var2.n5(2);
            }
            break;
         case 2:
            var1.k5(var2.l6());
            var2.s7();
            break;
         default:
            com.aspose.slides.internal.f8y.n5.n5("Invalid BuiltInRuleTextAction execution state");
      }
   }
}
