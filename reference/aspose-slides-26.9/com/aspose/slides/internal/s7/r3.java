package com.aspose.slides.internal.s7;

import com.aspose.slides.internal.k5.l6$n5;

public class r3 extends com.aspose.slides.internal.n3.h0 {
   private static final com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> n5 = new com.aspose.slides.internal.u3.c8<>();

   @Override
   public String n5() {
      return "text-decoration-line";
   }

   @Override
   public int l6() {
      return 246;
   }

   @Override
   public boolean k5() {
      return false;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 u3() {
      return new com.aspose.slides.internal.k5.h0(l6$n5.a0);
   }

   @Override
   public com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> a6() {
      return n5;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 n5(com.aspose.slides.internal.z8.y4 var1, com.aspose.slides.internal.h0.h0 var2) {
      com.aspose.slides.internal.k5.h0 var3 = new com.aspose.slides.internal.k5.h0();

      do {
         var3.l6(super.n5(var1, var2));
         var1 = var1.k5();
      } while (var1 != null);

      return var3;
   }

   static {
      n5.n5("none", l6$n5.a0);
      n5.n5("underline", l6$n5.u0);
      n5.n5("overline", l6$n5.d8);
      n5.n5("line-through", l6$n5.q4);
      n5.n5("blink", l6$n5.f7);
   }
}
