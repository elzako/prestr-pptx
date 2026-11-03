package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;

class k7n {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "fallOver", "drape", "curtains", "wind", "prestige", "fracture", "crush", "peelOff", "pageCurlDouble", "pageCurlSingle", "airplane", "origami"
   );

   public static void n5(ISlideShowTransition var0, com.aspose.slides.internal.k4y.n4i var1) {
      if (var1 != null) {
         switch (n5.n5(var1.n5())) {
            case 0:
               var0.setType(44);
               ((LeftRightDirectionTransition)var0.getValue()).setDirection(var1.l6() ? 1 : 0);
               break;
            case 1:
               var0.setType(45);
               ((LeftRightDirectionTransition)var0.getValue()).setDirection(var1.l6() ? 1 : 0);
               break;
            case 2:
               var0.setType(46);
               break;
            case 3:
               var0.setType(47);
               ((LeftRightDirectionTransition)var0.getValue()).setDirection(var1.l6() ? 0 : 1);
               break;
            case 4:
               var0.setType(48);
               break;
            case 5:
               var0.setType(49);
               break;
            case 6:
               var0.setType(50);
               break;
            case 7:
               var0.setType(51);
               ((LeftRightDirectionTransition)var0.getValue()).setDirection(var1.l6() ? 1 : 0);
               break;
            case 8:
               var0.setType(52);
               ((LeftRightDirectionTransition)var0.getValue()).setDirection(var1.l6() ? 1 : 0);
               break;
            case 9:
               var0.setType(53);
               ((LeftRightDirectionTransition)var0.getValue()).setDirection(var1.l6() ? 1 : 0);
               break;
            case 10:
               var0.setType(54);
               ((LeftRightDirectionTransition)var0.getValue()).setDirection(var1.l6() ? 0 : 1);
               break;
            case 11:
               var0.setType(55);
               ((LeftRightDirectionTransition)var0.getValue()).setDirection(var1.l6() ? 0 : 1);
               break;
            default:
               throw new ArgumentException(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown preset \"", var1.n5(), "\""}));
         }
      }
   }

   public static void l6(ISlideShowTransition var0, com.aspose.slides.internal.k4y.n4i var1) {
      switch (var0.getType()) {
         case 44:
            var1.n5("fallOver");
            var1.n5(((LeftRightDirectionTransition)var0.getValue()).getDirection() == 1);
            break;
         case 45:
            var1.n5("drape");
            var1.n5(((LeftRightDirectionTransition)var0.getValue()).getDirection() == 1);
            break;
         case 46:
            var1.n5("curtains");
            break;
         case 47:
            var1.n5("wind");
            var1.n5(((LeftRightDirectionTransition)var0.getValue()).getDirection() == 0);
            break;
         case 48:
            var1.n5("prestige");
            break;
         case 49:
            var1.n5("fracture");
            break;
         case 50:
            var1.n5("crush");
            break;
         case 51:
            var1.n5("peelOff");
            var1.n5(((LeftRightDirectionTransition)var0.getValue()).getDirection() == 1);
            break;
         case 52:
            var1.n5("pageCurlDouble");
            var1.n5(((LeftRightDirectionTransition)var0.getValue()).getDirection() == 1);
            break;
         case 53:
            var1.n5("pageCurlSingle");
            var1.n5(((LeftRightDirectionTransition)var0.getValue()).getDirection() == 1);
            break;
         case 54:
            var1.n5("airplane");
            var1.n5(((LeftRightDirectionTransition)var0.getValue()).getDirection() == 0);
            break;
         case 55:
            var1.n5("origami");
            var1.n5(((LeftRightDirectionTransition)var0.getValue()).getDirection() == 0);
            break;
         default:
            throw new ArgumentException(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown preset transition type \"", var1.n5(), "\""}));
      }
   }
}
