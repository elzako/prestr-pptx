package com.aspose.slides.internal.s7;

import com.aspose.slides.internal.k5.l6$n5;

public class i3 extends com.aspose.slides.internal.n3.s7 {
   private static final com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> n5 = new com.aspose.slides.internal.u3.c8<>();

   @Override
   public String n5() {
      return "size";
   }

   @Override
   public int l6() {
      return 229;
   }

   @Override
   public boolean k5() {
      return true;
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
      com.aspose.slides.internal.k5.h0 var3 = new com.aspose.slides.internal.k5.h0();

      while (var1 != null) {
         var3.l6(super.n5(var1, var2));
         var1 = var1.k5();
      }

      return var3;
   }

   static {
      n5.n5("auto", l6$n5.y1);
      n5.n5("landscape", l6$n5.k3h);
      n5.n5("portrait", l6$n5.u4k);
      n5.n5("a5", l6$n5.g1p);
      n5.n5("a4", l6$n5.c4t);
      n5.n5("a3", l6$n5.z1n);
      n5.n5("b5", l6$n5.k2p);
      n5.n5("b4", l6$n5.u7f);
      n5.n5("letter", l6$n5.s1o);
      n5.n5("legal", l6$n5.n2z);
      n5.n5("ledger", l6$n5.w8d);
   }
}
