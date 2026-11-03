package com.aspose.slides.internal.t1;

import com.aspose.slides.ms.System.d1;

public class l6 extends com.aspose.slides.internal.e5.t9 {
   private String u9;
   private String h0;
   private int c8;

   public l6(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      this.u9 = var1.u3(232).j_();
      this.h0 = var1.u3(73).j_();
      this.c8 = var1.u3(204).a6();
   }

   @Override
   public void n5(com.aspose.slides.internal.w2.u9 var1, String var2, String var3) {
      if (d1.a6("http://www.w3.org/1999/XSL/Format", var2)) {
         this.k5(var1, var2, var3);
      }
   }

   public final String i1() {
      return this.h0;
   }

   @Override
   public String z1() {
      return "color-profile";
   }

   @Override
   public int z3() {
      return 11;
   }

   public final String e5() {
      return this.u9;
   }
}
