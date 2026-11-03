package com.aspose.slides.internal.s7;

import com.aspose.slides.internal.k5.l6$n5;

public class p6 extends com.aspose.slides.internal.n3.s7 {
   private static final com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> n5 = new com.aspose.slides.internal.u3.c8<>();

   @Override
   public String n5() {
      return "counter-increment";
   }

   @Override
   public int l6() {
      return 84;
   }

   @Override
   public boolean k5() {
      return false;
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
      com.aspose.slides.internal.k5.h0 var3 = new com.aspose.slides.internal.k5.h0();

      while (var1 != null) {
         switch (var1.n5()) {
            case 12:
               return l6$n5.n5;
            case 13:
               var3.l6(new com.aspose.slides.internal.y4.n3(var1.a6(), (short)1));
               break;
            case 35:
               com.aspose.slides.internal.k5.u9 var4 = this.a6().n5(var1.t2());
               if (var4 != null) {
                  return l6$n5.a0;
               }

               var3.l6(com.aspose.slides.internal.y4.t9.k5(var1.t2()));
               break;
            default:
               throw com.aspose.slides.internal.z8.u9.n5(var1.n5());
         }

         var1 = var1.k5();
      }

      return var3;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 n5(
      com.aspose.slides.internal.k5.k7 var1,
      com.aspose.slides.internal.h0.h0 var2,
      String var3,
      com.aspose.slides.internal.y4.z1 var4,
      com.aspose.slides.internal.k5.u9 var5,
      int var6
   ) {
      return super.n5(var1, var2, var3, var4, var5, var6);
   }

   static {
      n5.n5("none", l6$n5.a0);
   }
}
