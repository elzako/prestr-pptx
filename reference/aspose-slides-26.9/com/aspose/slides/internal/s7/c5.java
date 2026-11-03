package com.aspose.slides.internal.s7;

import com.aspose.slides.internal.k5.l6$n5;

public class c5 extends com.aspose.slides.internal.n3.y4 {
   private static final com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> n5 = new com.aspose.slides.internal.u3.c8<>();

   @Override
   public String n5() {
      return "image-resolution";
   }

   @Override
   public int l6() {
      return 146;
   }

   @Override
   public boolean k5() {
      return true;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 u3() {
      return new com.aspose.slides.internal.k5.h0(l6$n5.j5);
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
      n5.n5("from-image", l6$n5.x0);
      n5.n5("snap", l6$n5.o2);
   }
}
