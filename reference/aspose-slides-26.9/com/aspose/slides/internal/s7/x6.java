package com.aspose.slides.internal.s7;

import com.aspose.slides.internal.k5.l6$n5;

public class x6 extends com.aspose.slides.internal.n3.h0 {
   private static final com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> n5 = new com.aspose.slides.internal.u3.c8<>();

   @Override
   public String n5() {
      return "text-emphasis-position";
   }

   @Override
   public int l6() {
      return 251;
   }

   @Override
   public boolean k5() {
      return true;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 u3() {
      return new com.aspose.slides.internal.k5.h0(l6$n5.u6p, l6$n5.b3);
   }

   @Override
   public com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> a6() {
      return n5;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 n5(com.aspose.slides.internal.z8.y4 var1, com.aspose.slides.internal.h0.h0 var2) {
      com.aspose.slides.internal.k5.h0 var3 = new com.aspose.slides.internal.k5.h0();

      for (com.aspose.slides.internal.z8.y4 var4 = var1; var4 != null; var4 = var4.k5()) {
         var3.l6(super.n5(var4, var2));
      }

      return var3;
   }

   static {
      n5.n5("over", l6$n5.u6p);
      n5.n5("under", l6$n5.o8m);
      n5.n5("right", l6$n5.b3);
      n5.n5("left", l6$n5.p8);
   }
}
