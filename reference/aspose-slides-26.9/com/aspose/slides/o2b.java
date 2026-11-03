package com.aspose.slides;

import com.aspose.slides.internal.k4y.g7$n5;

class o2b {
   public static void n5(ICommandEffect var0, com.aspose.slides.internal.k4y.s1z var1, w3j var2) {
      q4o var3 = ((CommandEffect)var0).l6();
      var0.setCommandString(var1.l6());
      var0.setType(var1.n5());
      var3.n5(o5.n5(var1.k5().u9().s7()));
      var3.l6(var1.k5().u9().q0());
      var0.setShapeTarget(e0p.n5(var2, var1.k5().h0()));
   }

   public static void n5(ICommandEffect var0, g7$n5 var1, com.aspose.slides.internal.k4y.u2q[] var2) {
      com.aspose.slides.internal.k4y.s1z var3 = (com.aspose.slides.internal.k4y.s1z)var1.n5("cmd").l6();
      var2[0] = var3.k5();
      q4o var4 = ((CommandEffect)var0).l6();
      var3.n5(var0.getType());
      var3.n5(var0.getCommandString());
   }
}
