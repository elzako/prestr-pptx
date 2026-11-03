package com.aspose.slides.internal.v9e;

public final class m3 extends n5 {
   private static m3 n5 = new m3();

   public static m3 n5() {
      return n5;
   }

   @Override
   public void n5(p3 var1, l6 var2) {
      while (var1.e2()) {
         switch (var2.k5()) {
            case 0:
               if (var2.l6(var1)) {
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
               int var3 = var2.a6().k5();
               if (var3 != 1 && var3 != 0) {
                  if (l6(var1, var2.a6())) {
                     var2.n5(7);
                     break;
                  }
               } else {
                  var1.n5(k7.n5(), var2.u9());
                  var2.n5(4);
               }

               return;
            case 4:
               var1.n5(z3.n5(), var2.u9());
               var2.n5(5);
               return;
            case 5:
               if (var2.a6().m1()) {
                  var1.n5(n5(), var2.a6().u9(9));
                  var2.n5(6);
               } else {
                  var2.n5(7);
                  if (k5(var1, var2.a6())) {
                     var2.n5(0);
                     break;
                  }
               }

               return;
            case 6:
               var2.n5(7);
               break;
            case 7:
               if (!k5(var1, var2.a6())) {
                  return;
               }

               var2.n5(0);
         }
      }
   }

   private static boolean n5(p3 var0, com.aspose.slides.internal.x6s.a6 var1) {
      return var0.n5(var1, var1.s7());
   }

   private static boolean l6(p3 var0, com.aspose.slides.internal.x6s.a6 var1) {
      return var0.l6(var1);
   }

   private static boolean k5(p3 var0, com.aspose.slides.internal.x6s.a6 var1) {
      return var0.k5(var1);
   }
}
