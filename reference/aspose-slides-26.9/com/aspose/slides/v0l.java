package com.aspose.slides;

import com.aspose.slides.ms.System.Xml.XmlDocument;

class v0l {
   public static void n5(ISlidesPicture var0, com.aspose.slides.internal.k4y.x8 var1, t5w var2) {
      com.aspose.slides.ms.System.Xml.m8 var3 = n5(var1);
      if (var3 != null) {
         if (var3.u9("embed", "http://schemas.openxmlformats.org/officeDocument/2006/relationships")) {
            String var4 = var3.u3("embed", "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
            if (var4 != null && var4.length() > 0) {
               com.aspose.slides.internal.c8m.r7 var5 = var2.k7().n5(var4);
               if (var5 != null && var5.l6() != null && ("image/svg+xml".equals(var5.l6().y4().n5()) || "image/svg".equals(var5.l6().y4().n5()))) {
                  ((Picture)var0).l6().n5(var5.l6().a6());
                  SvgImage var6 = new SvgImage(var5.l6().a6());
                  n5((Picture)var0, var6);
                  var5.l6().n5(true);
               }
            }
         } else if (var3.u9("link", "http://schemas.openxmlformats.org/officeDocument/2006/relationships")) {
            String var7 = var3.u3("link", "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
            if (!com.aspose.slides.ms.System.d1.n5(var7)) {
               com.aspose.slides.internal.c8m.r7 var8 = var2.k7().n5(var7);
               if (var8 != null && !com.aspose.slides.ms.System.d1.n5(var8.n5())) {
                  ((Picture)var0).l6().n5(var8.n5());
               }
            }
         }
      }
   }

   private static void n5(Picture var0, SvgImage var1) {
      PictureFrame var2 = com.aspose.slides.internal.v6g.k5.n5(var0.getParent_IPresentationComponent(), PictureFrame.class);
      ImageCollection var3 = (ImageCollection)var0.getPresentation().getImages();
      SvgImage var4 = var0.getImage() == null ? null : com.aspose.slides.internal.v6g.k5.n5(var0.getImage().getSvgImage(), SvgImage.class);
      if (var0.getImage() == null || var4 != null && (var1.l6() & 4294967295L) != (var4.l6() & 4294967295L)) {
         if (var2 != null && var1.k5()) {
            ISvgImage var5 = var1.n5(var2);
            var0.setImage(var3.n5(var5));
         } else {
            var0.setImage(var3.n5((ISvgImage)var1));
         }
      } else {
         var0.getImage().setSvgImage(var1);
      }
   }

   public static void n5(ISlidesPicture var0, e3e var1, com.aspose.slides.internal.k4y.x8 var2, g6c var3) {
      if (var0.getImage() != null && var0.getImage().getSvgImage() != null) {
         String var4 = null;

         for (com.aspose.slides.internal.c8m.j8 var8 : var3.a6().z3()) {
            if (com.aspose.slides.internal.v6g.k5.l6(var8.y4(), com.aspose.slides.internal.c8m.i6.class)
               && com.aspose.slides.internal.n2d.n5.n5(var8.a6(), var0.getImage().getSvgImage().getSvgData())) {
               var4 = var8.l6();
               break;
            }
         }

         if (var4 == null) {
            com.aspose.slides.internal.c8m.j8 var12 = var3.a6().n5("/ppt/media/image{0}.svg", new v0l$1(var3), new com.aspose.slides.internal.c8m.i6());
            var12.n5(var0.getImage().getSvgImage().getSvgData());
            var4 = var12.l6();
         }

         com.aspose.slides.internal.c8m.r7 var13 = var3.u6().n5(com.aspose.slides.internal.c8m.y8.n5.n5(), var4);
         if (var1.n5() == null) {
            var1.n5(new com.aspose.slides.internal.k4y.l8r());
         }

         com.aspose.slides.ms.System.Xml.m8 var14 = n5(var1.n5());
         if (var14 == null) {
            com.aspose.slides.internal.k4y.w8d var15 = com.aspose.slides.internal.k4y.x1f.l6(var2, "{96DAC541-7B7A-43D3-8B79-37D633B846F1}");
            XmlDocument var17 = new XmlDocument();
            var17.setXmlResolver(null);
            com.aspose.slides.ms.System.Xml.t5 var9 = var17.createDocumentFragment();
            var9.setInnerXml(var15.n5());
            com.aspose.slides.ms.System.Xml.m8 var10 = var9.getChildNodes()
               .k5(0)
               .getOwnerDocument()
               .createElement("asvg", "svgBlip", "http://schemas.microsoft.com/office/drawing/2016/SVG/main");
            com.aspose.slides.ms.System.Xml.u8 var11 = var17.createAttribute(
               "r", "embed", "http://schemas.openxmlformats.org/officeDocument/2006/relationships"
            );
            var11.setValue(var13.a6());
            var10.getAttributes().l6(var11);
            var9.getChildNodes().k5(0).appendChild(var10);
            var15.n5(var9.getOuterXml());
         } else {
            if (var14.u9("embed", "http://schemas.openxmlformats.org/officeDocument/2006/relationships")) {
               var14.n5("embed", "http://schemas.openxmlformats.org/officeDocument/2006/relationships", var13.a6());
            }

            if (!com.aspose.slides.ms.System.d1.n5(((Picture)var0).l6().l6())) {
               com.aspose.slides.internal.c8m.r7 var16 = var3.u6()
                  .n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", ((Picture)var0).l6().l6(), (byte)1);
               var14.n5("link", "http://schemas.openxmlformats.org/officeDocument/2006/relationships", var16.a6());
            }

            com.aspose.slides.internal.k4y.i8w.n5(var1.n5(), var2, "{96DAC541-7B7A-43D3-8B79-37D633B846F1}");
         }
      }
   }

   private static com.aspose.slides.ms.System.Xml.m8 n5(com.aspose.slides.internal.k4y.x8 var0) {
      if (var0 != null && var0.n5().length != 0) {
         XmlDocument var1 = com.aspose.slides.internal.k4y.i8w.n5(var0, "{96DAC541-7B7A-43D3-8B79-37D633B846F1}");
         return var1 != null && var1.getDocumentElement() != null
            ? (com.aspose.slides.ms.System.Xml.m8)j2z.n5(var1.getDocumentElement(), "svgBlip", "http://schemas.microsoft.com/office/drawing/2016/SVG/main")
            : null;
      } else {
         return null;
      }
   }
}
