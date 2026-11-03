package com.aspose.slides.internal.v4;

public class p8 extends u3 {
   private int c8;
   private int t2;

   public p8(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.w2.u9 var2, com.aspose.slides.internal.w2.k5 var3, com.aspose.slides.internal.e5.w1 var4) {
      if (this.k5(78) < 0 && this.k5(77) < 0) {
         this.n5(this.k5, this.s_().t9(), "http://www.w3.org/1999/XSL/Format", this.t9(), "rule.retrieveTableMarkerDescendantOfHeaderOrFooter");
      } else {
         super.n5(var1, var2, var3, var4);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      super.n5(var1);
      this.c8 = var1.u3(209).a6();
      this.t2 = var1.u3(206).a6();
   }

   @Override
   public String z1() {
      return "retrieve-table-marker";
   }

   @Override
   public int z3() {
      return 65;
   }
}
