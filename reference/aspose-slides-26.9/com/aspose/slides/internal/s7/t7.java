package com.aspose.slides.internal.s7;

public class t7 extends com.aspose.slides.internal.n3.m1 {
   @Override
   public String n5() {
      return "src";
   }

   @Override
   public int l6() {
      return 298;
   }

   @Override
   public boolean k5() {
      return false;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 n5(com.aspose.slides.internal.z8.y4 var1, com.aspose.slides.internal.h0.h0 var2) {
      com.aspose.slides.internal.k5.h0 var3 = new com.aspose.slides.internal.k5.h0();

      while (var1 != null) {
         switch (var1.n5()) {
            case 0:
               var3.l6(new com.aspose.slides.internal.y4.u9(var1));
               break;
            case 24:
            case 36:
               var3.l6(new com.aspose.slides.internal.y4.t4(var1.t2()));
               break;
            case 41:
               com.aspose.slides.internal.y4.t9 var4 = null;
               if (var1.c8() != null) {
                  String var5 = com.aspose.slides.ms.System.d1.n5;

                  for (com.aspose.slides.internal.z8.y4 var6 = var1.c8(); var6 != null; var6 = var6.k5()) {
                     switch (var6.n5()) {
                        case 35:
                        case 36:
                           if (var5.length() != 0) {
                              var5 = com.aspose.slides.ms.System.d1.n5(var5, " ");
                           }

                           var5 = com.aspose.slides.ms.System.d1.n5(var5, var6.t2());
                           break;
                        default:
                           throw com.aspose.slides.internal.z8.u9.n5(var1.n5());
                     }
                  }

                  var4 = new com.aspose.slides.internal.y4.t9(var5);
               }

               String var7 = var1.h0();
               if (var4 != null) {
                  var3.l6(new com.aspose.slides.internal.y4.t2(com.aspose.slides.ms.System.d1.l6(var7, 0, var7.length() - 1), var4));
               } else {
                  var3.l6(new com.aspose.slides.internal.y4.t2(com.aspose.slides.ms.System.d1.l6(var7, 0, var7.length() - 1)));
               }
               break;
            default:
               throw com.aspose.slides.internal.z8.u9.n5(var1.n5());
         }

         var1 = var1.k5();
      }

      return var3;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 u3() {
      return new com.aspose.slides.internal.k5.h0();
   }
}
