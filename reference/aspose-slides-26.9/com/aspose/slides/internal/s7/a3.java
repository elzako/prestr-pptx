package com.aspose.slides.internal.s7;

import com.aspose.slides.internal.k5.l6$n5;

public class a3 extends com.aspose.slides.internal.n3.s7 {
   private static final com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> n5 = new com.aspose.slides.internal.u3.c8<>();

   @Override
   public String n5() {
      return "box-shadow";
   }

   @Override
   public int l6() {
      return 67;
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

      while (var1 != null) {
         switch (var1.n5()) {
            case 0:
               var3.l6(l6$n5.r4);
               break;
            case 12:
               return l6$n5.n5;
            case 35:
               String var4 = com.aspose.slides.ms.System.d1.a6(var1.t2());
               com.aspose.slides.internal.k5.u9 var5 = this.a6().n5(var4);
               if (var5 != null) {
                  var3.l6(var5);
               } else {
                  var3.l6(var2.h0(72).n5(var1, var2));
               }
               break;
            default:
               var3.l6(super.n5(var1, var2));
         }

         var1 = var1.k5();
      }

      return var3;
   }

   static {
      n5.n5("none", l6$n5.a0);
      n5.n5("inset", l6$n5.g8);
   }
}
