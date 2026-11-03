package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.IDisposable;

class m4w {
   public static <T> String n5(IPPImage var0, TemplateContext<T> var1) {
      String var2 = "";
      if (!var1.getGlobal().<Boolean>get("embedImages")) {
         String var3 = var1.getOutput().getResourcePath(var0);
         String var4 = var1.getGlobal().get("slidesPath");
         var2 = o6c.n5(var3, var4);
      } else {
         byte[] var17 = var0.getBinaryData();
         byte[] var18 = k5(var0, var1);
         boolean var5 = var18 != null;
         if (var5) {
            var17 = var18;
         }

         if (var5 || !"image/x-emf".equals(var0.getContentType()) && !"image/x-wmf".equals(var0.getContentType())) {
            if (!var5 && "image/tiff".equals(var0.getContentType())) {
               com.aspose.slides.internal.z0k.e2 var6 = new com.aspose.slides.internal.z0k.e2();

               try {
                  IImage var7 = var0.getImage();

                  try {
                     ((u4i)var7).n5(var6, 6);
                  } finally {
                     var7.dispose();
                  }

                  var6.flush();
                  var17 = var6.toArray();
               } finally {
                  if (var6 != null) {
                     var6.dispose();
                  }
               }
            }
         } else {
            var17 = p3p.n5(var0);
         }

         var2 = com.aspose.slides.ms.System.d1.n5(new String[]{"data:image/png;base64, ", com.aspose.slides.ms.System.z3.n5(var17)});
      }

      return var2;
   }

   public static <T> String n5(IPPImage var0, TemplateContext<T> var1, float var2, float var3, float var4, float var5) {
      if (var2 == 0.0F && var3 == 0.0F && var4 == 0.0F && var5 == 0.0F) {
         return n5(var0, var1);
      }

      com.aspose.slides.internal.o9b.t4 var6 = com.aspose.slides.internal.o9b.t4.n5(new com.aspose.slides.internal.z0k.e2(var0.getBinaryData()));
      com.aspose.slides.internal.o9b.y2 var7 = new com.aspose.slides.internal.o9b.y2(
         com.aspose.slides.internal.v6g.k5.u3(var6.e2() * var2 / 100.0F, 13),
         com.aspose.slides.internal.v6g.k5.u3(var6.h0() * var3 / 100.0F, 13),
         com.aspose.slides.internal.v6g.k5.u3(var6.e2() * (100.0F - var2 - var4) / 100.0F, 13),
         com.aspose.slides.internal.v6g.k5.u3(var6.h0() * (100.0F - var3 - var5) / 100.0F, 13)
      );
      com.aspose.slides.internal.o9b.y2 var8 = new com.aspose.slides.internal.o9b.y2(0, 0, var7.t2(), var7.l6());
      com.aspose.slides.internal.o9b.l6 var9 = new com.aspose.slides.internal.o9b.l6(var8.t2(), var8.l6());
      com.aspose.slides.internal.o9b.z1 var10 = com.aspose.slides.internal.o9b.z1.n5(var9);

      try {
         var10.k5(7);
         var10.u9(4);
         var10.n5(var6, var8.n3(), var7.n3(), 2);
         var10.k5();
      } finally {
         if (var10 != null) {
            var10.dispose();
         }
      }

      String var11 = var1.getGlobal().get("slidesPath");
      String var12 = com.aspose.slides.ms.System.d1.n5(
         n5(var0, var1),
         ".png",
         com.aspose.slides.ms.System.d1.n5("cr{0}.png", new Object[]{com.aspose.slides.internal.v6g.k5.n5(var1.getObject(), PictureFrame.class).getUniqueId()})
      );
      String var13 = com.aspose.slides.internal.z0k.z1.l6(var11, var12);
      String var14 = com.aspose.slides.internal.z0k.z1.u9(var13);
      if (!com.aspose.slides.internal.z0k.u3.k5(var14)) {
         com.aspose.slides.internal.z0k.u3.n5(var14);
      }

      var9.n5(var13, com.aspose.slides.internal.j9e.x8.s7());
      return var12;
   }

   public static String n5(String var0, float var1, float var2, float var3, float var4) {
      String var5 = "data:image/png;base64, ";
      if (var1 == 0.0F && var2 == 0.0F && var3 == 0.0F && var4 == 0.0F) {
         return var0;
      }

      if (com.aspose.slides.ms.System.d1.l6(var0, "data:image/png;base64, ")) {
         byte[] var6 = com.aspose.slides.ms.System.z3.s7(com.aspose.slides.ms.System.d1.k5(var0, "data:image/png;base64, ".length()));
         com.aspose.slides.internal.o9b.t4 var7 = com.aspose.slides.internal.o9b.t4.n5(new com.aspose.slides.internal.z0k.e2(var6));
         com.aspose.slides.internal.o9b.y2 var8 = new com.aspose.slides.internal.o9b.y2(
            com.aspose.slides.internal.v6g.k5.u3(var7.e2() * var1 / 100.0F, 13),
            com.aspose.slides.internal.v6g.k5.u3(var7.h0() * var2 / 100.0F, 13),
            com.aspose.slides.internal.v6g.k5.u3(var7.e2() * (100.0F - var1 - var3) / 100.0F, 13),
            com.aspose.slides.internal.v6g.k5.u3(var7.h0() * (100.0F - var2 - var4) / 100.0F, 13)
         );
         com.aspose.slides.internal.o9b.y2 var9 = new com.aspose.slides.internal.o9b.y2(0, 0, var8.t2(), var8.l6());
         com.aspose.slides.internal.o9b.l6 var10 = new com.aspose.slides.internal.o9b.l6(var9.t2(), var9.l6());
         com.aspose.slides.internal.o9b.z1 var11 = com.aspose.slides.internal.o9b.z1.n5(var10);

         try {
            var11.k5(7);
            var11.u9(4);
            var11.n5(var7, var9.n3(), var8.n3(), 2);
            var11.k5();
         } finally {
            if (var11 != null) {
               var11.dispose();
            }
         }

         com.aspose.slides.internal.z0k.e2 var12 = new com.aspose.slides.internal.z0k.e2();
         var10.n5(var12, com.aspose.slides.internal.j9e.x8.s7());
         return com.aspose.slides.ms.System.d1.n5("{1}{0}",new Object[]{ com.aspose.slides.ms.System.z3.n5(var12.toArray()), "data:image/png;base64, "});
      } else {
         throw new NotImplementedException();
      }
   }

   public static <T> void l6(IPPImage var0, TemplateContext<T> var1) {
      if ("image/tiff".equals(var0.getContentType())) {
         String var2 = var1.getGlobal().get("slidesPath");
         String var3 = com.aspose.slides.ms.System.d1.n5(new String[]{n5(var0, var1), ".png"});
         String var4 = com.aspose.slides.internal.z0k.z1.l6(var2, var3);
         String var5 = com.aspose.slides.internal.z0k.z1.u9(var4);
         if (!com.aspose.slides.internal.z0k.u3.k5(var5)) {
            com.aspose.slides.internal.z0k.u3.n5(var5);
         }

         com.aspose.slides.internal.z0k.e2 var6 = new com.aspose.slides.internal.z0k.e2(var0.getBinaryData());

         try {
            com.aspose.slides.internal.o9b.t4 var7 = com.aspose.slides.internal.o9b.t4.n5(var6);

            try {
               var7.n5(var4, com.aspose.slides.internal.j9e.x8.s7());
            } finally {
               if (var7 != null) {
                  var7.dispose();
               }
            }
         } finally {
            if (var6 != null) {
               var6.dispose();
            }
         }
      }
   }

   public static IImage n5(Shape var0, IFillFormatEffectiveData var1) {
      AutoShape var2 = com.aspose.slides.internal.v6g.k5.n5(var0, AutoShape.class);
      if (var2 == null) {
         return null;
      }

      List var3 = new List();
      IGenericEnumerator var4 = var2.getTextFrame().getParagraphs().iterator();

      try {
         while (var4.hasNext()) {
            IParagraph var5 = (IParagraph)var4.next();
            var3.addItem(new List());
            IGenericEnumerator var6 = var5.getPortions().iterator();

            try {
               while (var6.hasNext()) {
                  IPortion var7 = (IPortion)var6.next();
                  ((List)var3.get_Item(var3.size() - 1)).addItem(var7.getText());
                  var7.setText("");
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                  var6.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      IImage var16 = var2.getImage();

      for (int var17 = 0; var17 < var3.size(); var17++) {
         for (int var18 = 0; var18 < ((List)var3.get_Item(var17)).size(); var18++) {
            var2.getTextFrame().getParagraphs().get_Item(var17).getPortions().get_Item(var18).setText((String)((List)var3.get_Item(var17)).get_Item(var18));
         }
      }

      return var16;
   }

   public static String n5(PictureFrame var0, com.aspose.slides.internal.o9b.j5 var1) {
      String var2 = "";
      if (com.aspose.slides.internal.v6g.k5.u3(var0.getRotation(), 13) != 0) {
         var2 = com.aspose.slides.ms.System.d1.n5(
            var2, com.aspose.slides.ms.System.d1.n5(" rotate({0}deg)", new Object[]{com.aspose.slides.internal.v6g.k5.u3(var0.getRotation(), 13)})
         );
      }

      if (var0.getFrame().getFlipH() == 1) {
         var2 = com.aspose.slides.ms.System.d1.n5(var2, " scaleX(-1)");
      }

      if (var0.getFrame().getFlipV() == 1) {
         var2 = com.aspose.slides.ms.System.d1.n5(var2, " scaleY(-1)");
      }

      if (!com.aspose.slides.ms.System.d1.n5(var2)) {
         var2 = com.aspose.slides.ms.System.d1.n5("transform:{0};", new Object[]{var2});
      }

      return com.aspose.slides.ms.System.d1.n5(
         "left: {0}px; top: {1}px; width: {2}px; height: {3}px;{4}",new Object[]{
         com.aspose.slides.internal.v6g.k5.u3(var0.getX(), 13),
         com.aspose.slides.internal.v6g.k5.u3(var0.getY(), 13),
         com.aspose.slides.internal.v6g.k5.u3(var0.getWidth(), 13),
         com.aspose.slides.internal.v6g.k5.u3(var0.getHeight(), 13),
         var2
      });
   }

   public static String n5(PictureFrame var0) {
      IOuterShadow var1 = var0.getEffectFormat().getOuterShadowEffect();
      if (var1 != null) {
         IOuterShadowEffectiveData var2 = var1.getEffective();
         double var3 = com.aspose.slides.ms.System.q1.c8((Math.PI * 2) * var2.getDirection() / 360.0) * var2.getDistance();
         double var5 = com.aspose.slides.ms.System.q1.h0((Math.PI * 2) * var2.getDirection() / 360.0) * var2.getDistance();
         double var7 = var2.getBlurRadius();
         byte var9 = 0;
         String var10 = e2o.n5(((k0p)var2).l6().o8());
         return com.aspose.slides.ms.System.d1.n5(
            "box-shadow: {0}px {1}px {2}px {3}px {4};",new Object[]{ f7i.n5(var3, 1, true), f7i.n5(var5, 1, true), f7i.n5(var7, 1, true), Integer.valueOf(var9), var10
         });
      } else {
         return "";
      }
   }

   public static String n5(PictureFrame var0, String var1) {
      String var2 = "";
      IGenericEnumerator var3 = var0.getPictureFormat().getPicture().getImageTransform().iterator();

      try {
         while (var3.hasNext()) {
            IImageTransformOperation var4 = (IImageTransformOperation)var3.next();
            if (com.aspose.slides.ms.System.j8.n5(var4) == com.aspose.slides.internal.v6g.k5.n5(ColorChange.class)) {
               ColorChange var5 = (ColorChange)var4;
               String var6 = "";
               String var7 = "";
               String var8 = "";

               for (int var9 = 0; var9 < 256; var9++) {
                  var6 = com.aspose.slides.ms.System.d1.n5(var6, var9 == (var5.getFromColor().getR() & 255) ? "1 " : "0 ");
                  var7 = com.aspose.slides.ms.System.d1.n5(var7, var9 == (var5.getFromColor().getG() & 255) ? "1 " : "0 ");
                  var8 = com.aspose.slides.ms.System.d1.n5(var8, var9 == (var5.getFromColor().getB() & 255) ? "1 " : "0 ");
               }

               var6 = com.aspose.slides.ms.System.d1.l6(var6);
               var7 = com.aspose.slides.ms.System.d1.l6(var7);
               var8 = com.aspose.slides.ms.System.d1.l6(var8);
               String var16 = com.aspose.slides.ms.System.d1.n5(
                  "#{0:X2}{1:X2}{2:X2}", var5.getToColor().getR(), var5.getToColor().getG(), var5.getToColor().getB()
               );
               var2 = com.aspose.slides.ms.System.d1.n5(
                  com.aspose.slides.ms.System.d1.n5(
                     "<svg width=\"{3}\" height=\"{4}\" viewBox=\"0 0 {3} {4}\">",
                     "<defs>",
                     "<filter id=\"{5}\" color-interpolation-filters=\"sRGB\">",
                     "<feComponentTransfer>",
                     "<feFuncR type=\"discrete\" tableValues=\"{0}\"></feFuncR>",
                     "<feFuncG type=\"discrete\" tableValues=\"{1}\"></feFuncG>",
                     "<feFuncB type=\"discrete\" tableValues=\"{2}\"></feFuncB>",
                     "</feComponentTransfer>",
                     "<feColorMatrix type=\"matrix\" values=\"1 0 0 0 0 0 1 0 0 0 0 0 1 0 0 1 1 1 1 -3\" result=\"selectedColor\"></feColorMatrix>",
                     "<feComposite operator=\"out\" in=\"SourceGraphic\" result=\"notSelectedColor\"></feComposite>",
                     "<feFlood flood-color=\"{6}\" flood-opacity=\"{7}\"></feFlood>",
                     "<feComposite operator=\"in\" in2=\"selectedColor\"></feComposite>",
                     "<feComposite operator=\"over\" in2=\"notSelectedColor\"></feComposite>",
                     "</filter>",
                     "</defs>",
                     "</svg>"
                  ),
                  var6,
                  var7,
                  var8,
                  com.aspose.slides.internal.v6g.k5.u3(var0.getWidth(), 13),
                  com.aspose.slides.internal.v6g.k5.u3(var0.getHeight(), 13),
                  var1,
                  var16,
                  com.aspose.slides.ms.System.n1.n5((((ColorFormat)var5.getToColor()).u3().s7() & 0xFF) / 255.0F, "0.0", com.aspose.slides.internal.x7n.l6.k5())
               );
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var2;
   }

   public static String n5(String var0, TemplateContext<PictureFrame> var1, int var2) {
      if (var1.getGlobal().containsKey("picturesCompression")) {
         return var0;
      }

      String var3 = "data:image/png;base64, ";
      short var4;
      switch (var2) {
         case 0:
            var4 = 330;
            break;
         case 1:
            var4 = 220;
            break;
         case 2:
            var4 = 150;
            break;
         case 3:
            var4 = 96;
            break;
         case 4:
            var4 = 72;
            break;
         default:
            return var0;
      }

      return com.aspose.slides.ms.System.d1.l6(var0, "data:image/png;base64, ") ? k5(var0, var1, var4) : l6(var0, var1, var4);
   }

   private static String l6(String var0, TemplateContext<PictureFrame> var1, int var2) {
      com.aspose.slides.internal.o9b.t4 var3 = n5(var1, var2);

      try {
         String var4 = var1.getGlobal().get("slidesPath");
         String var5 = com.aspose.slides.ms.System.d1.n5(
            n5(((PictureFrame)var1.getObject()).getPictureFormat().getPicture().getImage(), var1),
            ".png",
            com.aspose.slides.ms.System.d1.n5("red{0}.png", new Object[]{((PictureFrame)var1.getObject()).getUniqueId()})
         );
         String var6 = com.aspose.slides.internal.z0k.z1.l6(var4, var5);
         String var7 = com.aspose.slides.internal.z0k.z1.u9(var6);
         if (!com.aspose.slides.internal.z0k.u3.k5(var7)) {
            com.aspose.slides.internal.z0k.u3.n5(var7);
         }

         var3.n5(var6, com.aspose.slides.internal.j9e.x8.s7());
         return var5;
      } finally {
         var3.dispose();
      }
   }

   private static String k5(String var0, TemplateContext<PictureFrame> var1, int var2) {
      com.aspose.slides.internal.o9b.t4 var3 = n5(var1, var2);

      try {
         com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2();

         try {
            var3.n5(var4, com.aspose.slides.internal.j9e.x8.s7());
            var4.setPosition(0L);
            return com.aspose.slides.ms.System.d1.n5(new String[]{"data:image/png;base64, ", com.aspose.slides.ms.System.z3.n5(var4.toArray())});
         } finally {
            var4.dispose();
         }
      } finally {
         var3.dispose();
      }
   }

   private static com.aspose.slides.internal.o9b.t4 n5(TemplateContext<PictureFrame> var0, int var1) {
      PictureFrame var2 = (PictureFrame)var0.getObject();
      com.aspose.slides.internal.o9b.y1 var3 = ((ShapeFrame)var2.getFrame()).n5().y4();
      com.aspose.slides.internal.o9b.t4 var4 = com.aspose.slides.internal.o9b.t4.n5(
         new com.aspose.slides.internal.z0k.e2(((PictureFrame)var0.getObject()).getPictureFormat().getPicture().getImage().getBinaryData())
      );
      com.aspose.slides.internal.o9b.f2 var5 = n5(com.aspose.slides.internal.o9b.p8.n5(var4.n3()).a6(), var1, var3.c8().a6(), var3.y4()).a6();
      return n5(var4, var5.a6(), var4.s7(), new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, var4.e2(), var4.h0()));
   }

   private static <T> byte[] k5(IPPImage var0, TemplateContext<T> var1) {
      if (!var1.getGlobal().containsKey("picturesCompression")) {
         return null;
      }

      ISlideComponent var2 = com.aspose.slides.internal.v6g.k5.n5(var1.getObject(), ISlideComponent.class);
      return h5s.n5(var2.getPresentation(), var0, var1.getGlobal().<Integer>get("picturesCompression"));
   }

   public static com.aspose.slides.internal.o9b.f2 n5(
      com.aspose.slides.internal.o9b.f2 var0, int var1, com.aspose.slides.internal.o9b.f2 var2, com.aspose.slides.internal.o9b.y1 var3
   ) {
      com.aspose.slides.internal.o9b.f2 var4 = new com.aspose.slides.internal.o9b.f2();
      if (var1 == 72) {
         var4 = new com.aspose.slides.internal.o9b.f2(var3.s7(), var3.k5());
      } else if (var1 == 0) {
         var0.l6(var4);
      } else {
         n5(var1, var2.a6()).l6(var4);
      }

      if (var0.l6() <= var4.l6() && var0.k5() <= var4.k5()) {
         var0.l6(var4);
      }

      return var4;
   }

   private static com.aspose.slides.internal.o9b.f2 n5(int var0, com.aspose.slides.internal.o9b.f2 var1) {
      if (var0 < 0) {
         throw new ArgumentException("dpi");
      } else if (var0 != 0 && var0 != 72) {
         float var2 = var0 / 72.0F;
         return new com.aspose.slides.internal.o9b.f2(var1.l6() * var2, var1.k5() * var2);
      } else {
         return var1;
      }
   }

   public static com.aspose.slides.internal.o9b.t4 n5(
      com.aspose.slides.internal.o9b.t4 var0, com.aspose.slides.internal.o9b.f2 var1, int var2, com.aspose.slides.internal.o9b.y1 var3
   ) {
      com.aspose.slides.internal.o9b.l6 var4 = new com.aspose.slides.internal.o9b.l6(
         com.aspose.slides.internal.v6g.k5.u3(var1.l6(), 13), com.aspose.slides.internal.v6g.k5.u3(var1.k5(), 13), var2
      );
      com.aspose.slides.internal.o9b.z1 var5 = com.aspose.slides.internal.o9b.z1.n5(var4);

      try {
         com.aspose.slides.internal.o9b.y1 var6 = new com.aspose.slides.internal.o9b.y1(
            0.0F, 0.0F, com.aspose.slides.internal.v6g.k5.u3(var1.l6(), 13), com.aspose.slides.internal.v6g.k5.u3(var1.k5(), 13)
         );
         var5.k5(7);
         var5.n5(var0, var6.y4(), var3.y4(), 2);
      } finally {
         if (var5 != null) {
            var5.dispose();
         }
      }

      return var4;
   }
}
