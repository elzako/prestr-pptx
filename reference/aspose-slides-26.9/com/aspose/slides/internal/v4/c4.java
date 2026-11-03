package com.aspose.slides.internal.v4;

import com.aspose.slides.ms.System.d1;

public class c4 extends com.aspose.slides.internal.e5.t9 {
   private static boolean u9 = false;

   public c4(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
      if (!u9) {
         this.y4().u9(this, this.t9(), this.t9(), this.m_());
         u9 = true;
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      super.n5(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.w2.u9 var1, String var2, String var3) {
      if (d1.a6("http://www.w3.org/1999/XSL/Format", var2)) {
         this.k5(var1, var2, var3);
      }
   }

   @Override
   public String z1() {
      return "multi-property-set";
   }

   @Override
   public int z3() {
      return 47;
   }
}
