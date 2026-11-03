package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.k4y.g7$n5;

class r9x {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("noFill", "solidFill", "gradFill", "pattFill");

   public static void n5(ILineFillFormat var0, com.aspose.slides.internal.k4y.g7 var1) {
      if (var1 != null) {
         var0.setFillType((byte)-1);
         switch (n5.n5(var1.n5())) {
            case 0:
               var0.setFillType((byte)0);
               break;
            case 1:
               com.aspose.slides.internal.k4y.e2l var2 = (com.aspose.slides.internal.k4y.e2l)var1.l6();
               var0.setFillType((byte)1);
               c4i.n5(var0.getSolidFillColor(), var2.n5());
               break;
            case 2:
               com.aspose.slides.internal.k4y.j2p var3 = (com.aspose.slides.internal.k4y.j2p)var1.l6();
               var0.setFillType((byte)2);
               var0.setRotateWithShape(var3.u3());
               z3s.n5(var0.getGradientFormat(), var3);
               break;
            case 3:
               com.aspose.slides.internal.k4y.n9q var4 = (com.aspose.slides.internal.k4y.n9q)var1.l6();
               var0.setFillType((byte)3);
               g3d.n5(var0.getPatternFormat(), var4);
               break;
            default:
               throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var1.n5(), "\""}));
         }
      }
   }

   public static void n5(ILineFillFormat var0, g7$n5 var1) {
      if (var0.getFillType() != -1) {
         switch (var0.getFillType()) {
            case 0:
               var1.n5("noFill");
               break;
            case 1:
               com.aspose.slides.internal.k4y.e2l var3 = (com.aspose.slides.internal.k4y.e2l)var1.n5("solidFill").l6();
               c4i.n5(var0.getSolidFillColor(), new r9x$1(var3));
               break;
            case 2:
               com.aspose.slides.internal.k4y.j2p var4 = (com.aspose.slides.internal.k4y.j2p)var1.n5("gradFill").l6();
               z3s.l6(var0.getGradientFormat(), var4);
               var4.n5(var0.getRotateWithShape());
               break;
            case 3:
               com.aspose.slides.internal.k4y.n9q var2 = (com.aspose.slides.internal.k4y.n9q)var1.n5("pattFill").l6();
               g3d.l6(var0.getPatternFormat(), var2);
               break;
            default:
               throw new Exception();
         }
      }
   }
}
