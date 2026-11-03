package com.aspose.slides.internal.v4;

import com.aspose.slides.ms.System.d1;

public class y4 extends com.aspose.slides.internal.e5.t9 implements com.aspose.slides.internal.h2.d5 {
   private com.aspose.slides.internal.h2.c8 u9;

   public y4(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      this.u9 = com.aspose.slides.internal.h2.c8.n5(var1);
   }

   @Override
   public void u9() {
      this.n_().n5(this);
   }

   @Override
   public void c8() {
      if (this.u3 == null) {
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
      return "footnote-body";
   }

   @Override
   public int z3() {
      return 25;
   }

   @Override
   public final com.aspose.slides.internal.h2.c8 i1() {
      return this.u9;
   }
}
