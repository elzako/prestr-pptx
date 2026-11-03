package com.aspose.slides.internal.t1;

import com.aspose.slides.ms.System.d1;

public class w1 extends a6 {
   public w1(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   public void u9() {
      if (d1.n5(this.i1())) {
         this.k5("flow-name");
      }

      this.n_().n5(this);
   }

   @Override
   public void c8() {
      if (this.u3 == null && this.q_().z1()) {
         this.l6("(%block;)+");
      }

      this.n_().l6(this);
   }

   @Override
   public void n5(com.aspose.slides.internal.w2.u9 var1, String var2, String var3) {
      if (d1.a6("http://www.w3.org/1999/XSL/Format", var2) && !this.l6(var2, var3)) {
         this.k5(var1, var2, var3);
      }
   }

   @Override
   public String z1() {
      return "static-content";
   }

   @Override
   public int z3() {
      return 70;
   }
}
