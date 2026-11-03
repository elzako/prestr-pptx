package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.Xml.XmlDocument;

class y2w {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("brightnessContrast");

   static void n5(ISlidesPicture var0, com.aspose.slides.internal.k4y.w7 var1, t5w var2) {
      if (var1 != null) {
         e3e var3 = ((Picture)var0).l6();
         com.aspose.slides.internal.c8m.a2 var4 = var2.k7();
         if (var1.n5() != null && var1.n5().length() > 0) {
            com.aspose.slides.internal.c8m.r7 var5 = var4.n5(var1.n5());
            if (var5 != null) {
               com.aspose.slides.internal.c8m.j8 var6 = var5.l6();
               var0.setImage(var2.n5(var6));
               var3.n5(true);
               if (var0.getImage() == null && var6 != null && !com.aspose.slides.ms.System.d1.k5(com.aspose.slides.ms.System.d1.u9(var6.l6()), ".svg")) {
                  var3.k5(var6.l6());
               }
            }
         }

         if (!com.aspose.slides.ms.System.d1.n5(var1.l6())) {
            ((Picture)var0).n5(var1.l6());

            try {
               com.aspose.slides.ms.System.r8 var8 = new com.aspose.slides.ms.System.r8(var4.n5(var0.getLinkPathLong()).n5());
               ((Picture)var0).n5(var8.c8() ? var8.x8() : var8.l6());
            } catch (RuntimeException var7) {
               ((Picture)var0).n5(var4.n5(var0.getLinkPathLong()).n5());
               com.aspose.slides.internal.n8e.v4.n5(var7);
            }

            if (var3.a6()) {
               IPPImage var9 = var2.n5(var0.getLinkPathLong());
               if (var9 != null && var9 != ((ImageCollection)var0.getPresentation().getImages()).n5()) {
                  var0.setImage(var9);
               }
            }
         }

         n8k.n5(var0.getImageTransform(), var1.k5(), var2);
         var3.n5(var1.u3());
         n5(var0, var1.u3(), var2);
      }
   }

   static void n5(ISlidesPicture var0, com.aspose.slides.internal.k4y.x8 var1, t5w var2) {
      List var3 = new List();
      if (var1 != null) {
         for (com.aspose.slides.internal.k4y.d3 var7 : var1.n5()) {
            XmlDocument var8 = var7.l6();
            if (var8.getChildNodes() != null && var8.getChildNodes().n5() != 0) {
               com.aspose.slides.ms.System.Xml.l0 var9 = var8.getChildNodes().k5(0);
               if (var9.getChildNodes() != null && var9.getChildNodes().n5() != 0 && "imgProps".equals(var9.getChildNodes().k5(0).getLocalName())) {
                  com.aspose.slides.ms.System.Xml.l0 var10 = var9.getChildNodes().k5(0);
                  com.aspose.slides.ms.System.Xml.c7 var11 = com.aspose.slides.ms.System.Xml.c7.n5(new com.aspose.slides.internal.z0k.w1(var10.getInnerXml()));
                  var3.addItem(new com.aspose.slides.internal.k4y.x1(var11));
               }
            }
         }
      }

      com.aspose.slides.internal.k4y.x1 var13 = var3.isEmpty() ? null : (com.aspose.slides.internal.k4y.x1)var3.get_Item(0);
      v0l.n5(var0, var1, var2);
      com.aspose.slides.ms.System.Xml.m8 var14 = n5(var1);
      if (var14 != null && var14.u9("embed", "http://schemas.openxmlformats.org/officeDocument/2006/relationships")) {
         String var15 = var14.u3("embed", "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
         if (!com.aspose.slides.ms.System.d1.n5(var15)) {
            com.aspose.slides.internal.c8m.r7 var12 = var2.k7().n5(var15);
            if (var12 != null && var12.l6() != null) {
               ((Picture)var0).l6().l6(var12.l6().a6());
               var12.l6().n5(true);
            }
         }
      }

      if (var13 != null) {
         for (com.aspose.slides.internal.k4y.m9 var21 : var13.n5().n5()) {
            com.aspose.slides.internal.k4y.g7 var22 = var21.n5();
            if (var22 != null) {
               switch (n5.n5(var22.n5())) {
                  case 0:
                     com.aspose.slides.internal.k4y.r3 var23 = com.aspose.slides.internal.v6g.k5.n5(var22.k5(), com.aspose.slides.internal.k4y.r3.class);
                     var0.getImageTransform().addBrightnessContrastEffect(var23.n5(), var23.l6());
               }
            }
         }
      }

      com.aspose.slides.ms.System.Xml.m8 var17 = l6(var1);
      if (var17 != null && var17.u9("id", "http://schemas.openxmlformats.org/officeDocument/2006/relationships")) {
         String var19 = var17.u3("id", "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
         if (!com.aspose.slides.ms.System.d1.n5(var19)) {
            com.aspose.slides.internal.c8m.r7 var24 = var2.k7().n5(var19);
            if (var24 != null && !com.aspose.slides.ms.System.d1.n5(var24.n5())) {
               ((Picture)var0).l6().l6(var24.n5());
            }
         }
      }
   }

   static void n5(ISlidesPicture var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.w7> var1, g6c var2) {
      if (var0 != null) {
         com.aspose.slides.internal.k4y.w7 var3 = (com.aspose.slides.internal.k4y.w7)var1.invoke();
         n5(var0, var3, var2);
      }
   }

   static void n5(ISlidesPicture var0, com.aspose.slides.internal.k4y.w7 var1, g6c var2) {
      if (var0 != null) {
         e3e var3 = ((Picture)var0).l6();
         if (!com.aspose.slides.ms.System.d1.n5(var0.getLinkPathLong())) {
            var1.k5(var2.u6().n5(com.aspose.slides.internal.c8m.y8.n5.n5(), com.aspose.slides.internal.n8e.v4.n5(var0.getLinkPathLong()), (byte)1).a6());
            if (var3.a6() && var0.getImage() != null) {
               com.aspose.slides.internal.c8m.j8 var4 = var2.l6(var0.getImage());
               var1.l6(var2.u6().l6(var4).a6());
            }
         } else if (var0.getImage() != null) {
            com.aspose.slides.internal.c8m.j8 var5 = var0.getImage().getSvgImage() != null ? var2.n5(var0) : var2.l6(var0.getImage());
            var1.l6(var2.u6().l6(var5).a6());
         } else {
            if (!com.aspose.slides.ms.System.d1.n5(var3.u9())) {
               com.aspose.slides.internal.c8m.j8 var6 = var2.a6().u9(var3.u9());
               if (var6 != null) {
                  var1.l6(var2.u6().l6(var6).a6());
               }
            }

            if (com.aspose.slides.ms.System.d1.n5(var1.n5()) && var2.h0() != 1) {
               var1.l6(var2.u6().l6(var2.n5(((ImageCollection)var0.getPresentation().getImages()).n5())).a6());
            }
         }

         n8k.n5(var0.getImageTransform(), new y2w$1(var1), var2);
         com.aspose.slides.internal.k4y.l8r var7 = new com.aspose.slides.internal.k4y.l8r();
         v0l.n5(var0, ((Picture)var0).l6(), var7, var2);
         n5(var0, ((Picture)var0).l6().n5(), var7, var2);
         if (var7.n5().length > 0) {
            var1.n5(var7);
         }
      }
   }

   static void n5(ISlidesPicture var0, com.aspose.slides.internal.k4y.x8 var1, com.aspose.slides.internal.k4y.l8r var2, g6c var3) {
      com.aspose.slides.ms.System.Xml.m8 var4 = n5(var1);
      if (var4 != null) {
         byte[] var5 = ((Picture)var0).l6().k5();
         if (var5 == null) {
            var4.n5("embed", "http://schemas.openxmlformats.org/officeDocument/2006/relationships", com.aspose.slides.ms.System.d1.n5);
         } else {
            com.aspose.slides.internal.c8m.r1 var6 = new com.aspose.slides.internal.c8m.r1();
            String var7 = null;

            for (com.aspose.slides.internal.c8m.j8 var11 : var3.a6().z3()) {
               if (com.aspose.slides.internal.v6g.k5.l6(var11.y4(), com.aspose.slides.internal.c8m.r1.class) && var11.a6() == var5) {
                  var7 = var11.l6();
                  break;
               }
            }

            if (var7 == null) {
               com.aspose.slides.internal.c8m.j8 var15 = var3.a6().n5("/ppt/media/image{0}.wdp", new y2w$2(var3), var6);
               var15.n5(var5);
               var7 = var15.l6();
            }

            com.aspose.slides.internal.c8m.r7 var16 = var3.u6().n5(var6.l6().n5(), var7);
            var4.n5("embed", "http://schemas.openxmlformats.org/officeDocument/2006/relationships", var16.a6());
         }

         com.aspose.slides.internal.k4y.i8w.n5(var1, var2, "{BEBA8EAE-BF5A-486C-A8C5-ECC9F3942E4B}");
      }

      com.aspose.slides.ms.System.Xml.m8 var12 = l6(var1);
      if (var12 != null) {
         String var13 = ((Picture)var0).l6().u3();
         if (!com.aspose.slides.ms.System.d1.n5(var13)) {
            com.aspose.slides.internal.c8m.r7 var14 = var3.u6()
               .n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships/hyperlink", var13, (byte)1);
            var12.n5("embed", "http://schemas.openxmlformats.org/officeDocument/2006/relationships", var14.a6());
         } else {
            var12.n5("embed", "http://schemas.openxmlformats.org/officeDocument/2006/relationships", com.aspose.slides.ms.System.d1.n5);
         }

         com.aspose.slides.internal.k4y.i8w.n5(var1, var2, "{837473B0-CC2E-450A-ABE3-18F120FF3D39}");
      }

      if (var1 != null) {
         com.aspose.slides.internal.k4y.i8w.n5(var1, var2, "{28A0092B-C50C-407E-A947-70E740481C1C}");
      }
   }

   private static com.aspose.slides.ms.System.Xml.m8 n5(com.aspose.slides.internal.k4y.x8 var0) {
      com.aspose.slides.ms.System.Xml.m8 var1 = n5(
         var0, "imgProps", "{BEBA8EAE-BF5A-486C-A8C5-ECC9F3942E4B}", "http://schemas.microsoft.com/office/drawing/2010/main"
      );
      return var1 == null ? null : (com.aspose.slides.ms.System.Xml.m8)j2z.n5(var1, "imgLayer", "http://schemas.microsoft.com/office/drawing/2010/main");
   }

   private static com.aspose.slides.ms.System.Xml.m8 l6(com.aspose.slides.internal.k4y.x8 var0) {
      return n5(var0, "picAttrSrcUrl", "{837473B0-CC2E-450A-ABE3-18F120FF3D39}", "http://schemas.microsoft.com/office/drawing/2016/11/main");
   }

   private static com.aspose.slides.ms.System.Xml.m8 n5(com.aspose.slides.internal.k4y.x8 var0, String var1, String var2, String var3) {
      if (var0 != null && var0.n5().length != 0) {
         XmlDocument var4 = com.aspose.slides.internal.k4y.i8w.n5(var0, var2);
         return var4 != null && var4.getDocumentElement() != null ? (com.aspose.slides.ms.System.Xml.m8)j2z.n5(var4.getDocumentElement(), var1, var3) : null;
      } else {
         return null;
      }
   }
}
