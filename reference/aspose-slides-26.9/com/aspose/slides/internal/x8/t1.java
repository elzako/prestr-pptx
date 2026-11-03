package com.aspose.slides.internal.x8;

import com.aspose.slides.ms.System.d1;

public class t1 extends i1 {
   public t1() {
      super("invalid");
   }

   @Override
   public boolean n5(com.aspose.slides.internal.j3.z3 var1, String var2) {
      if (!d1.u3("input", var1.a6(), (short)5)) {
         return false;
      }

      if (!var1.t2("pattern")) {
         return false;
      }

      String var3 = var1.u3("pattern");
      if (d1.n5(var3)) {
         return false;
      }

      if (!var1.t2("value")) {
         return false;
      }

      String var4 = var1.u3("value");
      if (d1.n5(var4)) {
         return false;
      }

      try {
         com.aspose.slides.internal.r7c.c8 var5 = new com.aspose.slides.internal.r7c.c8(var3);
         return !var5.l6(var4).u3();
      } catch (RuntimeException var6) {
         return false;
      }
   }
}
