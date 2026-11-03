package com.aspose.slides.internal.t1;

import com.aspose.slides.ms.System.d1;

public class a6 extends com.aspose.slides.internal.e5.t9 {
   private String u9;
   private boolean h0 = false;

   public a6(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      super.n5(var1);
      this.u9 = var1.u3(98).j_();
   }

   @Override
   public void u9() {
      if (d1.n5(this.u9)) {
         this.k5("flow-name");
      }

      this.n_().n5(this);
   }

   @Override
   public void c8() {
      if (!this.h0) {
         this.l6("marker* (%block;)+");
      }

      this.n_().l6(this);
   }

   @Override
   public void n5(com.aspose.slides.internal.w2.u9 var1, String var2, String var3) {
      if (d1.a6("http://www.w3.org/1999/XSL/Format", var2)) {
         if (d1.a6(var3, "marker")) {
            if (this.h0) {
               this.l6(var1, "fo:marker", "(%block;)");
            }
         } else if (!this.l6(var2, var3)) {
            this.k5(var1, var2, var3);
         } else {
            this.h0 = true;
         }
      }
   }

   @Override
   public boolean j5() {
      return true;
   }

   public final String i1() {
      return this.u9;
   }

   @Override
   public String z1() {
      return "flow";
   }

   @Override
   public int z3() {
      return 16;
   }
}
