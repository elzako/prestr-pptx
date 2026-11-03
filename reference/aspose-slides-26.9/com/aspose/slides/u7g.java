package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

class u7g {
   public static void n5(ISlideShowTransition var0, com.aspose.slides.internal.k4y.j1p var1) {
      if (var1 != null) {
         if (!var1.l6() && !var1.k5()) {
            var0.setType(27);
         } else if (!var1.l6() && var1.k5()) {
            var0.setType(28);
         } else if (var1.l6() && !var1.k5()) {
            var0.setType(29);
         } else if (var1.l6() && var1.k5()) {
            var0.setType(30);
         }

         ((SideDirectionTransition)var0.getValue()).setDirection(var1.n5());
      }
   }

   public static void l6(ISlideShowTransition var0, com.aspose.slides.internal.k4y.j1p var1) {
      switch (var0.getType()) {
         case 27:
            var1.n5(false);
            var1.l6(false);
            break;
         case 28:
            var1.n5(false);
            var1.l6(true);
            break;
         case 29:
            var1.n5(true);
            var1.l6(false);
            break;
         case 30:
            var1.n5(true);
            var1.l6(true);
            break;
         default:
            throw new ArgumentOutOfRangeException();
      }

      var1.n5(((SideDirectionTransition)var0.getValue()).getDirection());
   }
}
