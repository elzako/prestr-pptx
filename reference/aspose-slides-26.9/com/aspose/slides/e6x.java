package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;

class e6x {
   public static void n5(IChart var0, com.aspose.slides.internal.k4y.m3e var1, t5w var2) {
      if (var1 == null) {
         var0.setLegend(false);
      } else {
         var0.setLegend(true);
         s1b var3 = ((Legend)var0.getLegend()).n5();
         ILegend var4 = var0.getLegend();
         var4.setOverlay(var1.a6());
         switch (var1.k5()) {
            case 1:
               var4.setPosition(1);
               break;
            case 2:
               var4.setPosition(3);
               break;
            case 3:
               if (var1.u3() == 1) {
                  var4.setPosition(4);
               } else {
                  var4.setPosition(2);
               }
               break;
            case 4:
               var4.setPosition(0);
               break;
            default:
               throw new NotImplementedException();
         }

         k5r.n5(var4.getFormat(), var1.u9(), var2);
         y4k.n5(var4.getTextFormat(), var1.h0(), var2);
         var3.n5(var1.u3());
         var3.n5(var1.c8());
      }
   }

   public static void n5(IChart var0, com.aspose.slides.internal.k4y.m3e var1, g6c var2) {
      s1b var3 = ((Legend)var0.getLegend()).n5();
      ILegend var4 = var0.getLegend();
      k5r.n5(var4.getFormat(), new e6x$1(var1), var2, null, false);
      y4k.n5(var4.getTextFormat(), new e6x$2(var1), var2);
      var1.l6(var3.l6());
      var1.n5(var4.getOverlay());
      switch (var4.getPosition()) {
         case 0:
            var1.n5(4);
            break;
         case 1:
            var1.n5(1);
            break;
         case 2:
            var1.n5(3);
            break;
         case 3:
            var1.n5(2);
            break;
         case 4:
            var1.n5(3);
            var1.l6(1);
      }

      var1.n5(var3.n5());
   }
}
