package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;

class c8t {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("bottom", "middle");

   public static void n5(AutoShape var0, com.aspose.slides.internal.k4y.m1 var1, t5w var2) {
      com.aspose.slides.internal.k4y.b3e var3 = (com.aspose.slides.internal.k4y.b3e)var1.n5("textdata");
      if (var3 != null) {
         com.aspose.slides.internal.c8m.r7 var4 = var2.k7().n5(var3.n5());
         if (var4 != null) {
            com.aspose.slides.internal.z0k.e2 var5 = new com.aspose.slides.internal.z0k.e2(var4.l6().a6());

            try {
               com.aspose.slides.internal.z0k.n5 var6 = new com.aspose.slides.internal.z0k.n5(var5);
               com.aspose.slides.internal.k0r.d3 var7 = new com.aspose.slides.internal.k0r.d3();
               var7.w1().n5(4130);
               var7.k5(var6);
               if (var7.l6().u9()) {
                  p3f var8 = new p3f(new TextFrame(var0), var7);
                  d5f var9 = n5((Presentation)var0.getPresentation());
                  var8.n5(var9);
                  g5x.k5(var8);
                  var8.n5(var0);
                  n5(var0.l6(), var1);
               }
            } finally {
               if (var5 != null) {
                  var5.dispose();
               }
            }
         }
      }
   }

   private static void n5(TextFrame var0, com.aspose.slides.internal.k4y.m1 var1) {
      Dictionary var2 = n9s.l6(var1.l6());
      ITextFrameFormat var3 = var0.getTextFrameFormat();
      if (var2.containsKey("mso-wrap-style")) {
         var3.setWrapText((byte)("none".equals(var2.get_Item("mso-wrap-style")) ? 0 : 1));
      }

      if (var2.containsKey("mso-rotate")) {
         var3.setRotationAngle(com.aspose.slides.ms.System.a3.n5((String)var2.get_Item("mso-rotate")));
      }

      if (var2.containsKey("v-text-anchor")) {
         switch (n5.n5((String)var2.get_Item("v-text-anchor"))) {
            case 0:
               var3.setAnchoringType((byte)2);
               break;
            case 1:
               var3.setAnchoringType((byte)1);
               break;
            default:
               var3.setAnchoringType((byte)0);
         }
      }
   }

   private static d5f n5(Presentation var0) {
      com.aspose.slides.internal.k0r.e3 var1 = new com.aspose.slides.internal.k0r.e3();
      d5f var2 = new d5f(var1, var0, InterruptionToken.getNone());
      com.aspose.slides.internal.k0r.o6t var3 = new com.aspose.slides.internal.k0r.o6t();
      TextStyle var4 = (TextStyle)var0.getDefaultTextStyle();
      s3f var5 = new s3f(var3, var2);
      var5.n5(var4);
      return var2;
   }
}
