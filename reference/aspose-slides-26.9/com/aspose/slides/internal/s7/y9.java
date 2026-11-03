package com.aspose.slides.internal.s7;

import com.aspose.slides.internal.k5.l6$n5;

public class y9 extends com.aspose.slides.internal.n3.h0 {
   private static final com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> n5 = new com.aspose.slides.internal.u3.c8<>();

   @Override
   public String n5() {
      return "font-style";
   }

   @Override
   public int l6() {
      return 119;
   }

   @Override
   public boolean k5() {
      return true;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 u3() {
      return l6$n5.d2;
   }

   @Override
   public com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> a6() {
      return n5;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 n5(com.aspose.slides.internal.z8.y4 var1, com.aspose.slides.internal.h0.h0 var2) {
      com.aspose.slides.internal.k5.u9 var3 = super.n5(var1, var2);
      return var3 == l6$n5.y8 ? this.u3() : var3;
   }

   static {
      n5.n5("normal", l6$n5.d2);
      n5.n5("italic", l6$n5.y3);
      n5.n5("oblique", l6$n5.u7);
   }
}
