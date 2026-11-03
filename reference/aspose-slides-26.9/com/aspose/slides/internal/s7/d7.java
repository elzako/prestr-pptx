package com.aspose.slides.internal.s7;

import com.aspose.slides.internal.k5.l6$n5;

public class d7 extends com.aspose.slides.internal.n3.t9 {
   private static final com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> n5 = new com.aspose.slides.internal.u3.c8<>();

   @Override
   public String n5() {
      return "quotes";
   }

   @Override
   public int l6() {
      return 216;
   }

   @Override
   public boolean k5() {
      return true;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 u3() {
      return l6$n5.a0;
   }

   @Override
   public com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> a6() {
      return n5;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 n5(com.aspose.slides.internal.z8.y4 var1, com.aspose.slides.internal.h0.h0 var2) {
      switch (var1.n5()) {
         case 12:
            return l6$n5.n5;
         case 35:
            com.aspose.slides.internal.k5.u9 var3 = this.a6().n5(var1.t2());
            if (var3 == null) {
               throw this.n5(var1.t2());
            }

            return var3;
         case 36:
            com.aspose.slides.internal.k5.h0 var4 = new com.aspose.slides.internal.k5.h0();

            while (var1 != null) {
               var4.l6(com.aspose.slides.internal.y4.t9.l6(var1.t2()));
               var1 = var1.k5();
               if (var1 != null && var1.n5() != 36) {
                  throw this.n5(var1.n5());
               }
            }

            if (var4.n5() % 2 == 1) {
               throw this.l6(var4.n5(var4.n5() - 1).u9());
            }

            return var4;
         default:
            throw this.n5(var1.n5());
      }
   }

   static {
      n5.n5("none", l6$n5.a0);
   }
}
