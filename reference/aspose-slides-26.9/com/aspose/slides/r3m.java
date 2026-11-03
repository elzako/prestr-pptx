package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

class r3m {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "AlternateContent",
      "sp",
      "grpSp",
      "graphicFrame",
      "cxnSp",
      "pic",
      "contentPart",
      "http://schemas.microsoft.com/office/powerpoint/2016/slidezoom",
      "http://schemas.microsoft.com/office/powerpoint/2016/summaryzoom",
      "http://schemas.microsoft.com/office/powerpoint/2016/sectionzoom",
      "http://schemas.openxmlformats.org/drawingml/2006/table",
      "http://schemas.openxmlformats.org/presentationml/2006/ole",
      "http://schemas.openxmlformats.org/drawingml/2006/chart",
      "http://schemas.microsoft.com/office/drawing/2014/chartex",
      "http://schemas.microsoft.com/office/drawing/2015/9/8/chartex",
      "http://schemas.microsoft.com/office/drawing/2015/10/21/chartex",
      "http://schemas.microsoft.com/office/drawing/2016/5/10/chartex",
      "http://schemas.openxmlformats.org/drawingml/2006/diagram",
      "http://schemas.openxmlformats.org/drawingml/2006/compatibility",
      "audioCd",
      "wavAudioFile",
      "audioFile",
      "videoFile",
      "quickTimeFile"
   );

   public static void n5(IGroupShape var0, com.aspose.slides.internal.k4y.e2 var1, i1x var2) {
      if (var1 != null) {
         var2.n5().z1().throwIfInterruptionRequested();
         c9u var3 = ((GroupShape)var0).n5();
         com.aspose.slides.internal.k4y.n5u var4 = var1.l6();
         x9f.n5(var0.getFillFormat(), var4.u3(), var2.n5());
         w5i.n5(new r3m$1(var0), var4.a6(), var2.n5());
         r6k.n5(new r3m$2(var0), var4.u9(), null, null);
         com.aspose.slides.internal.k4y.t9 var5 = var1.n5();
         z6a.n5(var0, var5.k5(), var2);
         z6a.n5(var0, var5.n5(), var2);
         com.aspose.slides.internal.k4y.u7f var6 = var5.l6();
         d8p.n5(var0.getGroupShapeLock(), var6.l6());
         var3.l6(var6.k5());
         var3.n5(var1.u3());
         ((ShapeCollection)var0.getShapes()).clear();
         List$Enumerator var7 = var1.k5().iterator();

         try {
            while (var7.hasNext()) {
               com.aspose.slides.internal.k4y.g7 var8 = (com.aspose.slides.internal.k4y.g7)var7.next();
               n5(var8, var0, var2);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
               var7.dispose();
            }
         }

         m4f.n5((GroupShape)var0, var1);
      }
   }

   static IShape n5(com.aspose.slides.internal.k4y.g7 var0, IGroupShape var1, i1x var2) {
      ShapeCollection var3 = (ShapeCollection)var1.getShapes();
      switch (n5.n5(var0.n5())) {
         case 0:
            com.aspose.slides.internal.k4y.j9u var4 = (com.aspose.slides.internal.k4y.j9u)var0.l6();
            return v4.n5(var4, var1, var2);
         case 1:
            com.aspose.slides.internal.k4y.q0 var5 = (com.aspose.slides.internal.k4y.q0)var0.l6();
            AutoShape var6 = var3.y4();
            u4.n5(var6, var5, var2);
            return var6;
         case 2:
            com.aspose.slides.internal.k4y.e2 var7 = (com.aspose.slides.internal.k4y.e2)var0.l6();
            GroupShape var8 = var3.e2();
            n5(var8, var7, var2);
            return var8;
         case 3:
            com.aspose.slides.internal.k4y.s1k var9 = (com.aspose.slides.internal.k4y.s1k)var0.l6();
            switch (n5.n5(var2.l6().t9().n5(var9.k5().n5().x8()))) {
               case 7:
                  ZoomFrame var19 = var3.u9();
                  i1v.n5(var19, var9, var2);
                  return var19;
               case 8:
                  SummaryZoomFrame var20 = var3.c8();
                  p3h.n5(var20, var9, var2);
                  return var20;
               case 9:
                  SectionZoomFrame var21 = var3.h0();
                  u9x.n5(var21, var9, var2);
                  return var21;
               case 10:
                  return y7r.n5(var3, var9, var2);
               case 11:
                  OleObjectFrame var23 = var3.a6();
                  r6z.n5(var23, var9, var2);
                  return var23;
               case 12:
                  return o5k.n5(var3, var9, var2, false);
               case 13:
               case 14:
               case 15:
               case 16:
                  return o5k.n5(var3, var9, var2, true);
               case 17:
                  return f2a.n5(var3, var9, var2);
               case 18:
                  return h4i.n5(var3, var9, var2);
               default:
                  return n5(var9, var1, var2);
            }
         case 4:
            com.aspose.slides.internal.k4y.t2 var10 = (com.aspose.slides.internal.k4y.t2)var0.l6();
            Connector var11 = var3.t4();
            u7q.n5(var11, var10, var2);
            return var11;
         case 5:
            com.aspose.slides.internal.k4y.z1 var12;
            if (com.aspose.slides.internal.v6g.k5.l6(var0.l6(), com.aspose.slides.internal.k4y.a6.class)) {
               var12 = ((com.aspose.slides.internal.k4y.a6)var0.l6()).l6();
            } else {
               var12 = (com.aspose.slides.internal.k4y.z1)var0.l6();
            }

            IPictureFrame var13 = null;
            if (var12.n5().k5() != null && var12.n5().k5().u9() != null) {
               switch (n5.n5(var12.n5().k5().u9().n5())) {
                  case 19:
                     com.aspose.slides.internal.k4y.e1 var24 = (com.aspose.slides.internal.k4y.e1)var12.n5().k5().u9().l6();
                     var13 = r8.n5(var1, var24);
                     break;
                  case 20:
                     com.aspose.slides.internal.k4y.x7n var25 = (com.aspose.slides.internal.k4y.x7n)var12.n5().k5().u9().l6();
                     var13 = r8.n5(var1, var25, var2.n5());
                     break;
                  case 21:
                     com.aspose.slides.internal.k4y.g0 var26 = (com.aspose.slides.internal.k4y.g0)var12.n5().k5().u9().l6();
                     var13 = r8.n5(var1, var12, var26, var2.n5());
                     break;
                  case 22:
                     com.aspose.slides.internal.k4y.z8m var28 = (com.aspose.slides.internal.k4y.z8m)var12.n5().k5().u9().l6();
                     var13 = m0y.n5((ShapeCollection)var1.getShapes(), var12, var28, var2.n5());
                     break;
                  case 23:
                     com.aspose.slides.internal.k4y.m4d var18 = (com.aspose.slides.internal.k4y.m4d)var12.n5().k5().u9().l6();
                     var13 = var3.q0();
                     var13.getPictureFormat().getPicture().setImage(((ImageCollection)var2.n5().t9().getImages()).n5());
                     var2.n5().n5("Loading of the quickTimeFile media type is not implemented yet.", 1);
                     break;
                  default:
                     throw new ArgumentOutOfRangeException();
               }
            } else {
               var13 = var3.q0();
            }

            if (var13 != null) {
               o3g.n5(var13, var12, var2);
            }

            return var13;
         case 6:
            com.aspose.slides.internal.k4y.x1s var14 = (com.aspose.slides.internal.k4y.x1s)var0.l6();
            if (var14 == null) {
               return null;
            } else {
               String var15 = var14.u3();
               com.aspose.slides.internal.c8m.r7 var16 = var2.n5().k7().n5(var15);
               if ("inkAction".equals(var16.u3())) {
                  InkActions var27 = var3.k5();
                  g5t.n5(var27, var14, var2);
                  return var27;
               }

               Ink var17 = var3.l6();
               y6j.n5(var17, var14, var2);
               return var17;
            }
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var0.n5(), "\""}));
      }
   }

   private static IShape n5(com.aspose.slides.internal.k4y.s1k var0, IGroupShape var1, i1x var2) {
      GraphicalObject var3 = ((ShapeCollection)var1.getShapes()).z1();
      l5u.n5(var3, var0, var2);
      var3.t4().n5(var0.k5());
      if (var0.k5().n5() != null) {
         com.aspose.slides.internal.k4y.t4t var4 = var0.k5().n5().m1();
         if (var4 == null) {
            return var3;
         }

         String var5 = var4.n5();
         if (!com.aspose.slides.ms.System.d1.n5(var5)) {
            com.aspose.slides.internal.c8m.r7 var6 = var2.n5().k7().n5(var5);
            if (var6 != null && var6.l6() != null) {
               var3.t4().n5(var6.l6().a6());
               var6.l6().n5(true);
            }
         }
      }

      return var3;
   }

   public static void n5(IGroupShape var0, com.aspose.slides.internal.k4y.e2 var1, n4i var2, j8m var3) {
      if (var0 != null) {
         var2.n5().o0().throwIfInterruptionRequested();
         com.aspose.slides.internal.k4y.n5u var4 = var1.l6();
         c9u var5 = ((GroupShape)var0).n5();
         g6c var6 = var2.n5();
         if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.t4z.class)) {
            var1.n5(var5.n5());
         } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.c3u.class)) {
            var1.n5(var5.n5());
         } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k4y.u7q.class)) {
         }

         x9f.n5(var0.getFillFormat(), new r3m$3(var4), var6);
         w5i.n5(var0.getEffectFormat(), new r3m$4(var4), var6);
         r6k.n5(var0.getThreeDFormat(), new r3m$5(var4), null, null);
         m4f.n5((GroupShape)var0, new r3m$6(var1));
         com.aspose.slides.internal.k4y.t9 var7 = var1.n5();
         z6a.n5(var0, var7.k5(), var6);
         z6a.n5(var0, var7.n5(), var6);
         com.aspose.slides.internal.k4y.u7f var8 = var7.l6();
         var8.n5(var5.l6());
         if (var0.getGroupShapeLock() != null) {
            r9.n5((GroupShapeLock)var0.getGroupShapeLock(), new r3m$7(var8));
         }

         List var9 = new List();

         for (int var10 = 0; var10 < var0.getShapes().size(); var10++) {
            var2.n5().o0().throwIfInterruptionRequested();
            IShape var11 = var0.getShapes().get_Item(var10);
            if (!((Shape)var11).d2()) {
               if (var2.n5().a6().h0() != 0 && com.aspose.slides.internal.v6g.k5.l6(var11, LegacyDiagram.class)) {
                  LegacyDiagram var12 = com.aspose.slides.internal.v6g.k5.n5(var0.getShapes().get_Item(var10), LegacyDiagram.class);
                  var11 = var12.convertToSmartArt();
                  var9.addItem(var11);
                  ((Shape)var11).k5(true);
               }

               n5(var11, var1, var2, var3);
            }
         }

         List$Enumerator var16 = var9.iterator();

         try {
            while (var16.hasNext()) {
               IShape var17 = (IShape)var16.next();
               var0.getShapes().remove(var17);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var16, IDisposable.class)) {
               var16.dispose();
            }
         }
      }
   }

   static void n5(IShape var0, com.aspose.slides.internal.k4y.e2 var1, n4i var2, j8m var3) {
      g6c var4 = var2.n5();
      if (com.aspose.slides.internal.v6g.k5.l6(var0, AutoShape.class)) {
         AutoShape var5 = (AutoShape)var0;
         if (var5.y4()) {
            com.aspose.slides.internal.k4y.j9u var6 = (com.aspose.slides.internal.k4y.j9u)var1.n5("AlternateContent").l6();
            v4.n5(var5, var6, var2, var3);
         } else {
            com.aspose.slides.internal.k4y.q0 var17 = (com.aspose.slides.internal.k4y.q0)var1.n5("sp").l6();
            u4.n5(var5, var17, var2, var3);
         }
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, Connector.class)) {
         com.aspose.slides.internal.k4y.t2 var7 = (com.aspose.slides.internal.k4y.t2)var1.n5("cxnSp").l6();
         u7q.n5((Connector)var0, var7, var4);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, AudioFrame.class)) {
         com.aspose.slides.internal.k4y.a6 var8 = (com.aspose.slides.internal.k4y.a6)var1.n5("pic").l6();
         com.aspose.slides.internal.k4y.n7n var18 = var8.n5();
         r8.n5((AudioFrame)var0, var18, var4);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, VideoFrame.class)) {
         com.aspose.slides.internal.k4y.a6 var9 = (com.aspose.slides.internal.k4y.a6)var1.n5("pic").l6();
         com.aspose.slides.internal.k4y.n7n var19 = var9.n5();
         m0y.n5((VideoFrame)var0, var19, var4);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, IChart.class)) {
         l6(var0, var1, var2, var3);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, SmartArt.class)) {
         com.aspose.slides.internal.k4y.s1k var10 = (com.aspose.slides.internal.k4y.s1k)var1.n5("graphicFrame").l6();
         var10.k5().n5().n5("http://schemas.openxmlformats.org/drawingml/2006/diagram");
         f2a.n5((SmartArt)var0, var10, var2);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, OleObjectFrame.class)) {
         com.aspose.slides.internal.k4y.s1k var11 = (com.aspose.slides.internal.k4y.s1k)var1.n5("graphicFrame").l6();
         var11.k5().n5().n5("http://schemas.openxmlformats.org/presentationml/2006/ole");
         r6z.n5((OleObjectFrame)var0, var11, var2);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, Table.class)) {
         com.aspose.slides.internal.k4y.s1k var12 = (com.aspose.slides.internal.k4y.s1k)var1.n5("graphicFrame").l6();
         var12.k5().n5().n5("http://schemas.openxmlformats.org/drawingml/2006/table");
         y7r.n5((Table)var0, var12, var4);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, GroupShape.class)) {
         com.aspose.slides.internal.k4y.e2 var13 = (com.aspose.slides.internal.k4y.e2)var1.n5("grpSp").l6();
         n5((IGroupShape)var0, var13, var2, var3);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, PictureFrame.class)) {
         com.aspose.slides.internal.k4y.b3 var20 = var1.n5("pic").l6();
         com.aspose.slides.internal.k4y.z1 var14;
         if (com.aspose.slides.internal.v6g.k5.l6(var20, com.aspose.slides.internal.k4y.a6.class)) {
            var14 = ((com.aspose.slides.internal.k4y.a6)var20).n5();
         } else {
            var14 = (com.aspose.slides.internal.k4y.z1)var20;
         }

         o3g.n5((PictureFrame)var0, var14, var4);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, LegacyDiagram.class)) {
         com.aspose.slides.internal.k4y.n3 var15 = (com.aspose.slides.internal.k4y.n3)var1.n5("graphicFrame").l6();
         var15.k5().n5().n5("http://schemas.openxmlformats.org/drawingml/2006/compatibility");
         h4i.n5((LegacyDiagram)var0, var15, var2);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, Ink.class)) {
         com.aspose.slides.internal.k4y.x1s var16 = (com.aspose.slides.internal.k4y.x1s)var1.n5("contentPart").l6();
         y6j.n5((Ink)var0, var16, var4);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, InkActions.class)) {
         if (var2.n5().h0() != 2) {
            g5t.n5((InkActions)var0, var1, var2);
         }
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, SummaryZoomFrame.class)) {
         if (var2.n5().h0() != 2) {
            p3h.n5((SummaryZoomFrame)var0, var1, var2);
         }
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, SectionZoomFrame.class)) {
         if (var2.n5().h0() != 2) {
            u9x.n5((SectionZoomFrame)var0, var1, var2);
         }
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, ZoomFrame.class)) {
         if (var2.n5().h0() != 2) {
            i1v.n5((ZoomFrame)var0, var1, var2);
         }
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, GraphicalObject.class)) {
         n5((GraphicalObject)var0, var1, var2);
      }
   }

   private static void l6(IShape var0, com.aspose.slides.internal.k4y.e2 var1, n4i var2, j8m var3) {
      Chart var4 = (Chart)var0;
      boolean var5 = false;
      IGenericEnumerator var6 = var4.getChartData().getSeries().iterator();

      try {
         while (var6.hasNext()) {
            IChartSeries var7 = (IChartSeries)var6.next();
            if (ChartTypeCharacterizer.u3(var7.getType())) {
               var5 = true;
               break;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      boolean var15 = false;
      com.aspose.slides.internal.k4y.s1k var8 = null;
      if (var4.getType() == 81) {
         if (var4.w1() != null) {
            com.aspose.slides.internal.k4y.j9u var9 = (com.aspose.slides.internal.k4y.j9u)var1.n5("AlternateContent").l6();
            var9.n5("cx4", "http://schemas.microsoft.com/office/drawing/2016/5/10/chartex");
            com.aspose.slides.internal.k4y.w1j var10 = var9.n5();
            var10.l6("cx4");
            var8 = (com.aspose.slides.internal.k4y.s1k)var10.n5("graphicFrame").l6();
            com.aspose.slides.internal.k4y.n7n var11 = (com.aspose.slides.internal.k4y.n7n)var9.l6().n5("pic").l6();
            PictureFrame var12 = (PictureFrame)var4.w1();
            var12.l6(var4.x9());
            o3g.n5(var12, var11, var2.n5());
            var12.l6((r0g)null);
         }

         if (var2.n5().h0() == 2 && !var4.getThemeManager().isOverrideThemeEnabled()) {
            var4.getThemeManager().getOverrideTheme().initColorSchemeFromInherited();
            var4.getThemeManager().getOverrideTheme().initFontSchemeFromInherited();
            var15 = true;
         }
      }

      if (var8 == null) {
         var8 = (com.aspose.slides.internal.k4y.s1k)var1.n5("graphicFrame").l6();
      }

      if (var5) {
         var8.k5().n5().n5("http://schemas.microsoft.com/office/drawing/2014/chartex");
      } else {
         var8.k5().n5().n5("http://schemas.openxmlformats.org/drawingml/2006/chart");
      }

      o5k.n5(var4, var8, var2);
      if (var15) {
         var4.getThemeManager().getOverrideTheme().clear();
      }
   }

   private static void n5(GraphicalObject var0, com.aspose.slides.internal.k4y.e2 var1, n4i var2) {
      com.aspose.slides.internal.k4y.l7h var3 = var0.t4().t4();
      if (var3 != null && var0.w1() != null && com.aspose.slides.ms.System.d1.a6("http://schemas.microsoft.com/office/drawing/2017/model3d", var3.n5().x8())) {
         com.aspose.slides.internal.k4y.j9u var20 = (com.aspose.slides.internal.k4y.j9u)var1.n5("AlternateContent").l6();
         var20.n5("am3d", "http://schemas.microsoft.com/office/drawing/2017/model3d");
         com.aspose.slides.internal.k4y.w1j var21 = var20.n5();
         var21.l6("am3d");
         com.aspose.slides.internal.k4y.s1k var22 = (com.aspose.slides.internal.k4y.s1k)var21.n5("graphicFrame").l6();
         l5u.n5(var0, var22, var2.n5());
         var22.k5().n5().n5("http://schemas.microsoft.com/office/drawing/2017/model3d");
         var22.k5().n5().n5(var3.n5().m1());
         com.aspose.slides.internal.k4y.t4t var23 = var22.k5().n5().m1();
         var23.l6().u9().n5(var22.l6().h0());
         com.aspose.slides.internal.k4y.l8k var24 = com.aspose.slides.internal.v6g.k5.n5(var23.u3().k5(), com.aspose.slides.internal.k4y.l8k.class);
         if (var24 != null) {
            double var9 = 1.0;
            if (var0.getWidth() < var0.getHeight()) {
               var9 = var0.getWidth() / var0.w1().getWidth();
            } else {
               var9 = var0.getHeight() / var0.w1().getHeight();
            }

            var24.n5(var24.n5() * var9);
         }

         com.aspose.slides.internal.k4y.k8l var26 = var20.l6();
         com.aspose.slides.internal.k4y.n7n var12 = (com.aspose.slides.internal.k4y.n7n)var26.n5("pic").l6();
         PictureFrame var13 = (PictureFrame)var0.w1();
         var13.l6(var0.x9());
         var13.n5(var0.p8());
         o3g.n5(var13, var12, var2.n5());
         var13.l6((r0g)null);
         byte[] var14 = var0.t4().q0();
         if (var14 != null) {
            com.aspose.slides.internal.c8m.o7 var15 = new com.aspose.slides.internal.c8m.o7();
            com.aspose.slides.internal.c8m.j8 var16 = var2.n5().a6().n5("/ppt/media/model3d{0}.glb", new r3m$8(var2), var15);
            var16.n5(var14);
            com.aspose.slides.internal.k4y.q1v var17 = var23.k5();
            if (var17 != null && var12.l6().a6() != null && !com.aspose.slides.ms.System.d1.n5(var12.l6().a6().n5())) {
               var17.n5(var12.l6().a6());
            }

            com.aspose.slides.internal.c8m.r7 var18 = var2.n5().u6().n5(var15.l6().n5(), var16.l6());
            var23.n5(var18.a6());
         }
      } else if (var3 != null
         && com.aspose.slides.internal.v6g.k5.l6(var0.w1(), PictureFrame.class)
         && com.aspose.slides.ms.System.d1.a6("http://schemas.microsoft.com/office/webextensions/webextension/2010/11", var3.n5().x8())) {
         com.aspose.slides.internal.k4y.j9u var19 = (com.aspose.slides.internal.k4y.j9u)var1.n5("AlternateContent").l6();
         var19.n5("we", "http://schemas.microsoft.com/office/webextensions/webextension/2010/11");
         var19.n5("pca", "http://schemas.microsoft.com/office/powerpoint/2013/contentapp");
         com.aspose.slides.internal.k4y.w1j var5 = var19.n5();
         var5.l6("we pca");
         com.aspose.slides.internal.k4y.s1k var6 = (com.aspose.slides.internal.k4y.s1k)var5.n5("graphicFrame").l6();
         l5u.n5(var0, var6, var2.n5());
         var6.k5().n5().n5(var3.n5().x8());
         var6.k5().n5().n5(var3.n5().s7());
         com.aspose.slides.internal.k4y.k8l var7 = var19.l6();
         com.aspose.slides.internal.k4y.n7n var8 = (com.aspose.slides.internal.k4y.n7n)var7.n5("pic").l6();
         PictureFrame var11 = (PictureFrame)var0.w1();
         var11.l6(var0.x9());
         var11.n5(var0.p8());
         o3g.n5(var11, var8, var2.n5());
         var11.l6((r0g)null);
      } else {
         com.aspose.slides.internal.k4y.n3 var4 = (com.aspose.slides.internal.k4y.n3)var1.n5("graphicFrame").l6();
         l5u.n5(var0, var4, var2.n5());
         if (var3 != null) {
            var4.k5().n5().n5(var3.n5().x8());
            var4.k5().n5().n5(var3.n5().s7());
         }
      }
   }
}
