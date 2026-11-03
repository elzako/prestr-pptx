package com.aspose.slides.internal.s7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.k5.l6$n5;

public class r0 extends com.aspose.slides.internal.n3.q0 {
   private static final com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> n5 = new com.aspose.slides.internal.u3.c8<>();

   @Override
   public String n5() {
      return "play-during";
   }

   @Override
   public int l6() {
      return 214;
   }

   @Override
   public boolean k5() {
      return false;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 u3() {
      return new com.aspose.slides.internal.k5.h0(l6$n5.y1);
   }

   @Override
   public com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> a6() {
      return n5;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 n5(com.aspose.slides.internal.z8.y4 var1, com.aspose.slides.internal.h0.h0 var2) {
      List var3 = new List();

      do {
         var3.addItem(super.n5(var1, var2));
         var1 = var1.k5();
      } while (var1 != null);

      return new com.aspose.slides.internal.k5.h0(var3);
   }

   static {
      n5.n5("mix", l6$n5.r6);
      n5.n5("repeat", l6$n5.j9);
      n5.n5("auto", l6$n5.y1);
      n5.n5("none", l6$n5.a0);
   }
}
