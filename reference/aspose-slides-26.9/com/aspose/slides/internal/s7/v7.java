package com.aspose.slides.internal.s7;

import com.aspose.slides.internal.k5.l6$n5;

public class v7 extends com.aspose.slides.internal.n3.s7 {
   private static final com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> n5 = new com.aspose.slides.internal.u3.c8<>();

   @Override
   public String n5() {
      return "speech-rate";
   }

   @Override
   public int l6() {
      return 235;
   }

   @Override
   public boolean k5() {
      return false;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 u3() {
      return l6$n5.w2;
   }

   @Override
   public com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> a6() {
      return n5;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 n5(com.aspose.slides.internal.z8.y4 var1, com.aspose.slides.internal.h0.h0 var2) {
      com.aspose.slides.internal.k5.u9 var3 = super.n5(var1, var2);
      if (com.aspose.slides.internal.v6g.k5.l6(var3, com.aspose.slides.internal.y4.c8.class) && ((com.aspose.slides.internal.k5.u3)var3).n5() != 1) {
         throw com.aspose.slides.internal.z8.u9.n5(var1.n5());
      } else {
         return var3;
      }
   }

   static {
      n5.n5("x-slow", l6$n5.f4);
      n5.n5("slow", l6$n5.y9);
      n5.n5("medium", l6$n5.w2);
      n5.n5("fast", l6$n5.a1);
      n5.n5("x-fast", l6$n5.w3);
      n5.n5("faster", l6$n5.i4);
      n5.n5("slower", l6$n5.q3);
   }
}
