package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.k4y.g7$n5;
import com.aspose.slides.ms.System.IDisposable;

class k5a {
   public static void n5(IShape var0, g7$n5 var1, x0a var2) {
      SmartArtShape var3 = com.aspose.slides.internal.v6g.k5.n5(var0, SmartArtShape.class);
      if (com.aspose.slides.internal.v6g.k5.l6(var0, AutoShape.class) || var3 != null) {
         GeometryShape var15 = var3;
         if (var15 == null) {
            var15 = (GeometryShape)var0;
         }

         GeometryShape var18 = var15;
         if (var18.getShapeType() == 5 && u3(var18) == null && var0.getPlaceholder() == null) {
            n5(var18, (com.aspose.slides.internal.k4y.e6x)var1.n5("rect").l6(), var2);
         } else if (var18.getShapeType() == 35) {
            n5(var18, (com.aspose.slides.internal.k4y.d2z)var1.n5("ellipse").l6(), var2);
         } else if (!n5(var18) || var0.getPlaceholder() == null && var18.getFillFormat().getFillType() == 2) {
            if (var18.getShapeType() == 1) {
               n5(var18, (com.aspose.slides.internal.k4y.j6v)var1.n5("line").l6(), var2);
            } else if (var18.getShapeType() == 0) {
               n5(var18, (com.aspose.slides.internal.k4y.g3c)var1.n5("custom-shape").l6(), var2, true);
            } else {
               n5(var18, var1, var2);
            }
         } else {
            n5(var18, l6(var0, var1, var2), var2);
         }
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, Connector.class)) {
         n5((Connector)var0, (com.aspose.slides.internal.k4y.l3d)var1.n5("connector").l6(), var2);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, IPictureFrame.class)) {
         com.aspose.slides.internal.k4y.b4f var4 = (com.aspose.slides.internal.k4y.b4f)var1.n5("frame").l6();
         var4.a6(var0.getName());
         var4.x8(var0.getAlternativeText());
         var4.l6("standard");
         IAudioFrame var5 = com.aspose.slides.internal.v6g.k5.n5(var0, IAudioFrame.class);
         if (var5 != null) {
            x2d.n5(var5, var4, var2.l6());
         } else {
            IVideoFrame var6 = com.aspose.slides.internal.v6g.k5.n5(var0, IVideoFrame.class);
            if (var6 != null) {
               x2d.n5(var6, var4, var2.l6());
            } else {
               n5((PictureFrame)var0, var4, var2);
            }
         }
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, Table.class)) {
         com.aspose.slides.internal.k4y.b4f var11 = l6(var0, var1, var2);
         n5((Table)var0, (com.aspose.slides.internal.k4y.y7e)var11.n5("table").l6(), var2);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, OleObjectFrame.class)) {
         com.aspose.slides.internal.k4y.b4f var12 = l6(var0, var1, var2);
         l6(com.aspose.slides.internal.v6g.k5.n5(var0, GeometryShape.class), var12, var2);
         p0j.n5((OleObjectFrame)var0, var12, var2.l6());
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, Chart.class)
         || com.aspose.slides.internal.v6g.k5.l6(var0, Ink.class)
         || com.aspose.slides.internal.v6g.k5.l6(var0, InkActions.class)) {
         String var14 = w6n.n5((Shape)var0);
         SvgImage var17 = new SvgImage(var14);
         PPImage var19 = (PPImage)((ImageCollection)var0.getPresentation().getImages()).l6(var17);

         try {
            PictureFrame var7 = new PictureFrame((r0g)var0.getSlide().getShapes());
            var7.getPictureFormat().setPictureFillMode(1);
            var7.e2().l6(5);
            var7.setFrame(new ShapeFrame(var0.getX(), var0.getY(), var0.getWidth(), var0.getHeight(), (byte)0, (byte)0, 0.0F));
            var7.getPictureFormat().getPicture().setImage(var19);
            n5(var7, (com.aspose.slides.internal.k4y.b4f)var1.n5("frame").l6(), var2);
         } finally {
            if (var19 != null) {
               var19.dispose();
            }
         }
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, GroupShape.class) || com.aspose.slides.internal.v6g.k5.l6(var0, SmartArt.class)) {
         SmartArt var13 = com.aspose.slides.internal.v6g.k5.n5(var0, SmartArt.class);
         GroupShape var16 = var13 != null ? var13.y4().k5() : (GroupShape)var0;
         if (var16.getShapes() != null) {
            n5(var16, (com.aspose.slides.internal.k4y.c4f)var1.n5("g").l6(), var2);
         }
      }
   }

   public static void n5(Shape var0, com.aspose.slides.internal.k4y.p3w var1, x0a var2) {
      l6(var0, var1, var2);
      k5(var0, var1, var2);
      u3(var0, var1, var2);
   }

   private static void l6(Shape var0, com.aspose.slides.internal.k4y.p3w var1, x0a var2) {
      IFillFormatEffectiveData var3 = n5(var0);
      j2k.n5(var3, new i4v(var1), var2.l6());
   }

   private static IFillFormatEffectiveData n5(Shape var0) {
      IFillFormatEffectiveData var1 = null;
      AutoShape var2 = com.aspose.slides.internal.v6g.k5.n5(var0, AutoShape.class);
      if (var2 != null && var2.getUseBackgroundFill() && var2.getFillFormat().getFillType() == -1) {
         Slide var3 = com.aspose.slides.internal.v6g.k5.n5(var2.getSlide(), Slide.class);
         if (var3 != null) {
            var1 = ((Background)var3.getBackground()).getEffective().getFillFormat();
         }
      }

      if (var1 == null) {
         var1 = ((FillFormat)var0.getFillFormat()).getEffective();
      }

      return var1;
   }

   private static void k5(Shape var0, com.aspose.slides.internal.k4y.p3w var1, x0a var2) {
      ILineFormatEffectiveData var3 = var0.getLineFormat().getEffective();
      g4c.n5(var3, var1, var2);
   }

   private static void u3(Shape var0, com.aspose.slides.internal.k4y.p3w var1, x0a var2) {
      IEffectFormatEffectiveData var3 = var0.getEffectFormat().getEffective();
      k7d.n5(var3, var1, var2.l6());
   }

   public static void n5(GeometryShape var0, com.aspose.slides.internal.k4y.e6x var1, x0a var2) {
      var1.c8(var0.getName());
      var1.t2(var0.getAlternativeText());
      com.aspose.slides.internal.k4y.y2i var3 = var2.n5("gr", 9);
      var1.u9(var3.n5());
      j4k.n5(var0, var1);
      com.aspose.slides.internal.k4y.p3w var4 = t2f.n5(com.aspose.slides.internal.k4y.p3w.class, "graphic-properties", var3.u3(), new k5a$1(var3));
      n5(var0, var4, var2);
      TextFrame var5 = u3(var0);
      if (var5 != null) {
         b3e.n5(var5, new k5a$6(var1), var1.h0(), var2);
      }
   }

   public static void n5(Table var0, com.aspose.slides.internal.k4y.y7e var1, x0a var2) {
      p2j.n5(var0, var1, var2);
   }

   public static void n5(GeometryShape var0, com.aspose.slides.internal.k4y.d2z var1, x0a var2) {
      var1.c8(var0.getName());
      var1.t2(var0.getAlternativeText());
      com.aspose.slides.internal.k4y.y2i var3 = var2.n5("gr", 9);
      var1.u9(var3.n5());
      j4k.n5(var0, var1);
      com.aspose.slides.internal.k4y.p3w var4 = t2f.n5(com.aspose.slides.internal.k4y.p3w.class, "graphic-properties", var3.u3(), new k5a$7(var3));
      n5(var0, var4, var2);
      TextFrame var5 = u3(var0);
      if (var5 != null) {
         b3e.n5(var5, new k5a$8(var1), var1.h0(), var2);
      }
   }

   public static void n5(GeometryShape var0, com.aspose.slides.internal.k4y.b4f var1, x0a var2) {
      TextFrame var3 = u3(var0);
      com.aspose.slides.internal.k4y.o2e var4 = (com.aspose.slides.internal.k4y.o2e)var1.n5("text-box").l6();
      if (var3 == null) {
         throw new NullReferenceException("TextFrame can't be null here.");
      }

      if (!com.aspose.slides.ms.System.d1.n5(var3.t2())) {
         b3e.n5(var3, var4, var1, var2);
      }

      l6(var0, var1, var2);
      if (var1.k5() != null) {
         com.aspose.slides.internal.k4y.y2i var5 = var2.k5().get_Item(var1.k5());
         com.aspose.slides.internal.k4y.p3w var6 = t2f.n5(com.aspose.slides.internal.k4y.p3w.class, "graphic-properties", var5.u3(), new k5a$9(var5));
         if (var0.getPlaceholder() != null) {
            if (com.aspose.slides.internal.v6g.k5.l6(var0.getSlide(), Slide.class)) {
               var1.n5((byte)0);
               var1.l6((byte)1);
            }

            var1.n5(q9k.h0.get_Item(var0.getPlaceholder().getType()));
         } else if (var6 != null) {
            var6.n5(1);
            var6.u9(1);
         }

         if (var6 != null) {
            var6.l6((byte)0);
            var6.n5((byte)0);
         }
      }
   }

   private static void l6(GeometryShape var0, com.aspose.slides.internal.k4y.b4f var1, x0a var2) {
      if (var0 != null) {
         com.aspose.slides.internal.k4y.y2i var3;
         if (t2f.k5(var1.u3())) {
            var3 = var2.k5().get_Item(var1.u3());
         } else {
            var3 = var2.n5("pr", 10);
            var1.k5(var3.n5());
         }

         com.aspose.slides.internal.k4y.p3w var4 = t2f.n5(com.aspose.slides.internal.k4y.p3w.class, "graphic-properties", var3.u3(), new k5a$10(var3));
         n5(var0, var4, var2);
      }
   }

   public static void n5(GeometryShape var0, com.aspose.slides.internal.k4y.j6v var1, x0a var2) {
      var1.h0(var0.getName());
      var1.c8(var0.getAlternativeText());
      com.aspose.slides.internal.k4y.y2i var3 = var2.n5("gr", 9);
      var1.u9(var3.n5());
      var1.l6(t2f.n5(var0.getX()));
      var1.k5(t2f.n5(var0.getY()));
      var1.u3(t2f.n5(var0.getX() + var0.getWidth()));
      var1.a6(t2f.n5(var0.getY() + var0.getHeight()));
      com.aspose.slides.internal.k4y.p3w var4 = t2f.n5(com.aspose.slides.internal.k4y.p3w.class, "graphic-properties", var3.u3(), new k5a$11(var3));
      n5(var0, var4, var2);
      TextFrame var5 = u3(var0);
      if (var5 != null) {
         b3e.n5(var5, new k5a$12(var1), var1.h0(), var2);
      }
   }

   public static void n5(GeometryShape var0, g7$n5 var1, x0a var2) {
      com.aspose.slides.internal.k4y.y1z var3 = d6q.n5(var0.getShapeType());
      if (var3 != null) {
         com.aspose.slides.internal.k4y.g3c var4 = (com.aspose.slides.internal.k4y.g3c)var1.n5("custom-shape").l6();
         n5(var0, var4, var2, false);
         String var5 = com.aspose.slides.ms.System.d1.n5;
         if (var0.e2().l6() != null) {
            int[] var6 = s1f.n5(var0.e2().l6(), var0.getShapeType(), var0.getRawFrame().getWidth(), var0.getRawFrame().getHeight());

            for (int var10 : var6) {
               var5 = com.aspose.slides.ms.System.d1.n5(var5, com.aspose.slides.ms.System.d1.n5(new String[]{" ", com.aspose.slides.ms.System.Xml.f4.n5(var10)}));
            }
         }

         var5 = com.aspose.slides.ms.System.d1.l6(var5);
         var3.u3(com.aspose.slides.ms.System.d1.n5(var5) ? null : var5);
         var4.n5(var3);
      } else if (var0.e2().u9() != null && var0.e2().u9().length > 0) {
         n5(var0, (com.aspose.slides.internal.k4y.g3c)var1.n5("custom-shape").l6(), var2, true);
      } else if (var0.e2().x8() != -1) {
         int var13 = var0.e2().x8();
         IGeometryPath[] var15 = var0.getGeometryPaths();

         for (int var16 = 0; var16 < var15.length; var16++) {
            IGeometryPath var17 = var15[var16];

            for (IPathSegment var11 : var17.getPathData()) {
               if (var11.getPathCommand() == 3) {
                  com.aspose.slides.internal.x4g.s7 var12 = ShapeUtil.n5(var17);
                  var15[var16] = ShapeUtil.n5(var12);
               }
            }
         }

         var0.setGeometryPaths(var15);
         n5(var0, (com.aspose.slides.internal.k4y.g3c)var1.n5("custom-shape").l6(), var2, true);
         var0.e2().n5(var13);
      }
   }

   public static void n5(PictureFrame var0, com.aspose.slides.internal.k4y.b4f var1, x0a var2) {
      var1.a6(var0.getName());
      var1.x8(var0.getAlternativeText());
      com.aspose.slides.internal.k4y.y2i var3 = var2.n5("gr", 9);
      var1.l6(var3.n5());
      j4k.n5(var0, var1);
      com.aspose.slides.internal.k4y.p3w var4 = t2f.n5(com.aspose.slides.internal.k4y.p3w.class, "graphic-properties", var3.u3(), new k5a$13(var3));
      n5(var0, var4, var2);
      ISlidesPicture var5 = var0.getPictureFormat().getPicture();
      com.aspose.slides.internal.k4y.s3o var6 = (com.aspose.slides.internal.k4y.s3o)var1.n5("image").l6();
      PPImage var7 = (PPImage)var5.getImage();
      ImageCollection var8 = (ImageCollection)var5.getPresentation().getImages();
      if (!com.aspose.slides.ms.System.d1.n5(var5.getLinkPathLong()) && var7 == null) {
         var5.setImage(var8.n5(var5.getLinkPathLong(), null));
      }

      if (var7 != null
         && !k8s.n5(var5.getImageTransform())
         && (var5.getImageTransform().size() > 1 || !com.aspose.slides.internal.v6g.k5.l6(var5.getImageTransform().get_Item(0), AlphaModulateFixed.class))) {
         FillFormat var16 = new FillFormat(var0);
         var16.setFillType((byte)4);
         ((PictureFillFormat)var16.getPictureFillFormat()).n5((PictureFillFormat)var0.getPictureFormat());
         IPictureFillFormatEffectiveData var17 = var16.c8().getPictureFillFormat();
         com.aspose.slides.internal.k9.h0 var11 = null;
         com.aspose.slides.internal.k9.h0[] var12 = new com.aspose.slides.internal.k9.h0[]{var11};
         com.aspose.slides.internal.k9.u9 var13 = ((m4a)var17.getPicture()).n5(null, var12);
         var11 = var12[0];
         byte[] var14 = var13.a6();
         if (!var2.l6().n3()) {
            var6.n5(1);
            var6.l6(1);
            var6.n5(var2.l6().n5(PPImage.n5(var14), PPImage.l6(var14).n5(), var14, null));
         } else {
            var6.l6(com.aspose.slides.ms.System.z3.n5(var14));
         }
      } else if (var2.l6().n3()) {
         if (!com.aspose.slides.ms.System.d1.n5(var5.getLinkPathLong()) && var5.getImage() == null) {
            var5.setImage(var8.n5(var5.getLinkPathLong(), null));
         }

         if (var7 != null) {
            var6.l6(com.aspose.slides.ms.System.z3.n5(var7.getBinaryData()));
         } else {
            var6.l6(com.aspose.slides.ms.System.z3.n5(var8.n5().getBinaryData()));
         }
      } else {
         var6.n5(1);
         var6.l6(1);
         if (var7 != null) {
            var6.n5(var2.l6().n5(var7));
         } else if (!com.aspose.slides.ms.System.d1.n5(var5.getLinkPathLong())) {
            String var9 = var5.getLinkPathLong();

            try {
               com.aspose.slides.ms.System.r8 var10 = new com.aspose.slides.ms.System.r8(var9);
               var9 = var10.l6();
            } catch (RuntimeException var15) {
               com.aspose.slides.internal.n8e.v4.n5(var15);
            }

            var6.n5(var9);
         } else {
            var6.n5(var2.l6().n5((PPImage)var8.n5()));
         }
      }

      n5(var4, var0);
   }

   public static void n5(com.aspose.slides.internal.k4y.p3w var0, PictureFrame var1) {
      PictureFillFormat var2 = (PictureFillFormat)var1.getPictureFormat();
      PPImage var3 = (PPImage)var2.getPicture().getImage();
      c0u var4 = c0u.l6(var2.u3().n5(), 100.0).l6();
      if (var3 != null && c0u.l6(var4, c0u.n5)) {
         float var5 = var3.getWidth() / var3.t2().l6() * 2.54F;
         double var6 = var3.getHeight() / var3.t2().k5() * 2.54F;
         String var8 = com.aspose.slides.ms.System.d1.n5(
            com.aspose.slides.internal.x7n.l6.k5(), "rect({0}cm, {1}cm, {2}cm, {3}cm)",new Object[]{ var6 * var4.k5, var5 * var4.u3, var6 * var4.a6, var5 * var4.l6
         });
         var0.w1(var8);
      }

      AlphaModulateFixed var14 = null;
      IGenericEnumerator var9 = var2.getPicture().getImageTransform().iterator();

      try {
         while (var9.hasNext()) {
            IImageTransformOperation var10 = (IImageTransformOperation)var9.next();
            if (com.aspose.slides.internal.v6g.k5.l6(var10, AlphaModulateFixed.class)) {
               var14 = (AlphaModulateFixed)var10;
               break;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
            var9.dispose();
         }
      }

      if (var14 != null) {
         var0.t2(com.aspose.slides.ms.System.d1.n5("{0}%", new Object[]{var14.getAmount()}));
      }

      String var15 = "";
      if (var1.getFrame().getFlipH() == 1) {
         var15 = com.aspose.slides.ms.System.d1.n5(var15, "horizontal");
      }

      if (var1.getFrame().getFlipV() == 1) {
         var15 = com.aspose.slides.ms.System.d1.n5(var15, com.aspose.slides.ms.System.d1.n5(new String[]{" ", "vertical"}));
      }

      if (!com.aspose.slides.ms.System.d1.n5(var15)) {
         var0.j5(com.aspose.slides.ms.System.d1.l6(var15));
      }
   }

   public static void n5(GeometryShape var0, com.aspose.slides.internal.k4y.g3c var1, x0a var2, boolean var3) {
      var1.c8(var0.getName());
      var1.t2(var0.getAlternativeText());
      com.aspose.slides.internal.k4y.y2i var4 = var2.n5("gr", 9);
      var1.u9(var4.n5());
      j4k.n5(var0, var1);
      com.aspose.slides.internal.k4y.p3w var5 = t2f.n5(com.aspose.slides.internal.k4y.p3w.class, "graphic-properties", var4.u3(), new k5a$2(var4));
      n5(var0, var5, var2);
      TextFrame var6 = u3(var0);
      if (var6 != null) {
         b3e.n5(var6, new k5a$3(var1), var1.c8(), var2);
      }

      if (var3 && var0.e2().u9() != null && var0.e2().u9().length > 0) {
         com.aspose.slides.internal.k4y.y1z var7 = var1.n5();
         d6q.n5(var0, var7, var2);
      }

      var5.l6((byte)0);
   }

   public static void n5(Connector var0, com.aspose.slides.internal.k4y.l3d var1, x0a var2) {
      var1.u9(var0.getName());
      var1.h0(var0.getAlternativeText());
      com.aspose.slides.internal.k4y.y2i var3 = var2.n5("gr", 9);
      var1.a6(var3.n5());
      com.aspose.slides.internal.k4y.p3w var4 = t2f.n5(com.aspose.slides.internal.k4y.p3w.class, "graphic-properties", var3.u3(), new k5a$4(var3));
      switch (var0.getShapeType()) {
         case 1:
         case 96:
            var1.n5(3);
            break;
         case 97:
         case 98:
         case 99:
         case 100:
            var1.n5(1);
            break;
         case 101:
         case 102:
         case 103:
         case 104:
            var1.n5(4);
      }

      IShapeFrame var5 = var0.getFrame();
      com.aspose.slides.internal.w0.c8 var6 = new com.aspose.slides.internal.w0.c8(
         var5.getFlipH() == 1 ? -1.0F : 1.0F,
         0.0F,
         0.0F,
         var5.getFlipV() == 1 ? -1.0F : 1.0F,
         var5.getFlipH() == 1 ? var5.getCenterX() * 2.0F : 0.0F,
         var5.getFlipV() == 1 ? var5.getCenterY() * 2.0F : 0.0F
      );
      if (!com.aspose.slides.ms.System.n1.k5(var5.getRotation())) {
         var6.n5(
            var5.getFlipH() == 1 ^ var5.getFlipV() == 1 ? -var5.getRotation() : var5.getRotation(),
            new com.aspose.slides.internal.o9b.w1(var5.getCenterX(), var5.getCenterY()),
            0
         );
      }

      com.aspose.slides.internal.w0.c8 var7 = var6;
      com.aspose.slides.internal.x4g.m1 var8 = com.aspose.slides.internal.n8e.n1.l6(var7);
      com.aspose.slides.internal.o9b.w1[] var9 = new com.aspose.slides.internal.o9b.w1[]{
         new com.aspose.slides.internal.o9b.w1(var0.getX(), var0.getY()),
         new com.aspose.slides.internal.o9b.w1(var0.getX() + var0.getWidth(), var0.getY() + var0.getHeight())
      };
      var8.n5(var9);
      var1.n5(t2f.n5(var9[0].l6()));
      var1.l6(t2f.n5(var9[0].k5()));
      var1.k5(t2f.n5(var9[1].l6()));
      var1.u3(t2f.n5(var9[1].k5()));
      n5(var0, var4, var2);
   }

   public static void n5(GroupShape var0, com.aspose.slides.internal.k4y.c4f var1, x0a var2) {
      var1.l6(var0.getName());
      var1.k5(var0.getAlternativeText());
      IGenericEnumerator var3 = var0.getShapes().iterator();

      try {
         while (var3.hasNext()) {
            IShape var4 = (IShape)var3.next();
            n5(var4, new k5a$5(var1), var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   static com.aspose.slides.internal.k4y.b4f l6(IShape var0, g7$n5 var1, x0a var2) {
      com.aspose.slides.internal.k4y.b4f var3 = (com.aspose.slides.internal.k4y.b4f)var1.n5("frame").l6();
      var3.a6(var0.getName());
      var3.x8(var0.getAlternativeText());
      com.aspose.slides.internal.k4y.y2i var4 = var2.n5("gr", 9);
      var3.l6(var4.n5());
      j4k.n5(var0, var3);
      return var3;
   }

   private static boolean n5(GeometryShape var0) {
      return l6(var0) || k5(var0);
   }

   private static boolean l6(GeometryShape var0) {
      return var0.getShapeType() == 5 && (var0.getPlaceholder() != null || u3(var0) != null);
   }

   private static boolean k5(GeometryShape var0) {
      if (var0.getShapeType() > -1) {
         return false;
      }

      TextFrame var1 = u3(var0);
      return var1 != null && !"".equals(var1.t2());
   }

   private static TextFrame u3(GeometryShape var0) {
      AutoShape var1 = com.aspose.slides.internal.v6g.k5.n5(var0, AutoShape.class);
      if (var1 != null) {
         return var1.l6();
      }

      SmartArtShape var2 = com.aspose.slides.internal.v6g.k5.n5(var0, SmartArtShape.class);
      return var2 != null ? (TextFrame)var2.getTextFrame() : null;
   }
}
