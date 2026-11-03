package com.aspose.slides.internal.x8;

import com.aspose.slides.ms.System.d1;

public class m1 extends u3 {
   private g7 n5;

   public m1(g7 var1) {
      super("not(");
      this.n5 = var1;
   }

   @Override
   public boolean n5(com.aspose.slides.internal.j3.z3 var1, String var2) {
      return !this.n5.n5(var1, var2);
   }

   @Override
   public String a6() {
      return d1.n5(":{0}{1})",new Object[]{ "not(", this.n5.u9()});
   }

   @Override
   public void n5(com.aspose.slides.internal.h0.n5 var1) {
      this.n5.n5(var1);
      super.n5(var1);
   }
}
