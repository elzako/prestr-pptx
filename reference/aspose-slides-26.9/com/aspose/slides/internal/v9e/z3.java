package com.aspose.slides.internal.v9e;

public final class z3 extends n5 {
   private static z3 n5 = new z3();

   public static z3 n5() {
      return n5;
   }

   @Override
   public void n5(p3 var1, l6 var2) {
      while (var1.e2()) {
         switch (var2.k5()) {
            case 0:
               if (var2.a6().y4() && var2.a6().e2()) {
                  var2.n5(2);
                  if (n5(var1, var2.a6())) {
                     var2.n5(3);
                     break;
                  }
               } else {
                  var2.s7();
               }

               return;
            case 1:
            default:
               return;
            case 2:
               if (n5(var1, var2.a6())) {
                  var2.n5(3);
                  break;
               }

               return;
            case 3:
               if (l6(var1, var2.a6())) {
                  var2.n5(4);
                  break;
               }

               return;
            case 4:
               if (k5(var1, var2.a6())) {
                  var2.n5(5);
                  break;
               }

               return;
            case 5:
               if (!var2.a6().t9()) {
                  var2.a6().q0();
                  var2.s7();
                  return;
               }

               var2.n5(2);
         }
      }
   }

   private static boolean n5(p3 var0, com.aspose.slides.internal.x6s.a6 var1) {
      return var0.n5(2, var1.h0(), var1.u3(), var1.a6(), false);
   }

   private static boolean l6(p3 var0, com.aspose.slides.internal.x6s.a6 var1) {
      return var0.k5(var1.c8());
   }

   private static boolean k5(p3 var0, com.aspose.slides.internal.x6s.a6 var1) {
      return var0.a6(2);
   }
}
