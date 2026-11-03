package com.aspose.slides.internal.s7;

import com.aspose.slides.internal.k5.l6$n5;

public class p9 extends com.aspose.slides.internal.n3.h0 {
   private static final com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> n5 = new com.aspose.slides.internal.u3.c8<>();

   @Override
   public String n5() {
      return "move-to";
   }

   @Override
   public int l6() {
      return 177;
   }

   @Override
   public boolean k5() {
      return false;
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
      switch (var1.n5()) {
         case 35:
            com.aspose.slides.internal.k5.u9 var3 = this.a6().n5(com.aspose.slides.ms.System.d1.a6(var1.t2()));
            if (var3 != null) {
               return var3;
            }

            return com.aspose.slides.internal.y4.t9.k5(var1.t2());
         default:
            throw this.n5(var1.n5());
      }
   }

   static {
      n5.n5("normal", l6$n5.d2);
      n5.n5("here", l6$n5.n7);
   }
}
