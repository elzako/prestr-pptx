package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.k4y.g7$n5;

class x9f {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "noFill", "solidFill", "gradFill", "blipFill", "pattFill", "grpFill"
   );

   public static void n5(IFillFormat var0, com.aspose.slides.internal.k4y.g7 var1, t5w var2) {
      if (var1 != null) {
         switch (n5.n5(var1.n5())) {
            case 0:
               var0.setFillType((byte)0);
               break;
            case 1:
               com.aspose.slides.internal.k4y.e2l var3 = (com.aspose.slides.internal.k4y.e2l)var1.l6();
               var0.setFillType((byte)1);
               c4i.n5(var0.getSolidFillColor(), var3.n5());
               break;
            case 2:
               com.aspose.slides.internal.k4y.j2p var4 = (com.aspose.slides.internal.k4y.j2p)var1.l6();
               var0.setFillType((byte)2);
               var0.setRotateWithShape(var4.u3());
               z3s.n5(var0.getGradientFormat(), var4);
               break;
            case 3:
               com.aspose.slides.internal.k4y.e3 var5 = (com.aspose.slides.internal.k4y.e3)var1.l6();
               var0.setFillType((byte)4);
               var0.setRotateWithShape(var5.u3());
               k8n.n5((PictureFillFormat)var0.getPictureFillFormat(), var5, var2);
               break;
            case 4:
               com.aspose.slides.internal.k4y.n9q var6 = (com.aspose.slides.internal.k4y.n9q)var1.l6();
               var0.setFillType((byte)3);
               g3d.n5(var0.getPatternFormat(), var6);
               break;
            case 5:
               var0.setFillType((byte)5);
               break;
            default:
               throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var1.n5(), "\""}));
         }
      }
   }

   public static void n5(IFillFormat var0, g7$n5 var1, g6c var2) {
      n5(var0, var1, false, var2);
   }

   public static void n5(IFillFormat var0, g7$n5 var1, boolean var2, g6c var3) {
      if (var0 != null) {
         switch (var0.getFillType()) {
            case -1:
            default:
               if (var2) {
                  var1.n5("noFill");
               }
               break;
            case 0:
               var1.n5("noFill");
               break;
            case 1:
               com.aspose.slides.internal.k4y.e2l var5 = (com.aspose.slides.internal.k4y.e2l)var1.n5("solidFill").l6();
               c4i.n5(var0.getSolidFillColor(), new x9f$1(var5));
               break;
            case 2:
               com.aspose.slides.internal.k4y.j2p var6 = (com.aspose.slides.internal.k4y.j2p)var1.n5("gradFill").l6();
               var6.n5(var0.getRotateWithShape());
               z3s.l6(var0.getGradientFormat(), var6);
               break;
            case 3:
               com.aspose.slides.internal.k4y.n9q var4 = (com.aspose.slides.internal.k4y.n9q)var1.n5("pattFill").l6();
               g3d.l6(var0.getPatternFormat(), var4);
               break;
            case 4:
               com.aspose.slides.internal.k4y.e3 var7 = (com.aspose.slides.internal.k4y.e3)var1.n5("blipFill").l6();
               var7.n5(var0.getRotateWithShape());
               k8n.n5((PictureFillFormat)var0.getPictureFillFormat(), var7, var3);
               break;
            case 5:
               var1.n5("grpFill");
         }
      }
   }
}
