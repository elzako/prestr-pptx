package com.aspose.slides.internal.v9e;

public final class k7 extends n5 {
   private static k7 n5 = new k7();

   public static k7 n5() {
      return n5;
   }

   @Override
   public void n5(p3 var1, l6 var2) {
      while (var1.e2()) {
         switch (var2.k5()) {
            case 0:
               if (!var2.a6().l6(1)) {
                  var2.s7();
               } else {
                  var2.n5(2);
                  if (var1.n5(3, null, var2.a6().u3(), var2.a6().c8(), false)) {
                     var2.n5(4);
                     break;
                  }
               }

               return;
            case 1:
            case 3:
            default:
               return;
            case 2:
               if (var1.n5(3, null, var2.a6().u3(), var2.a6().c8(), false)) {
                  var2.n5(4);
                  break;
               }

               return;
            case 4:
               if (var1.a6(3)) {
                  var2.n5(5);
                  break;
               }

               return;
            case 5:
               if (!var2.a6().k5(1)) {
                  var2.a6().q0();
                  var2.s7();
                  return;
               }

               var2.n5(2);
         }
      }
   }
}
