package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class p3h {
   public static void n5(SummaryZoomFrame var0, com.aspose.slides.internal.k4y.s1k var1, i1x var2) {
      if (var1 != null) {
         l5u.n5(var0, var1, var2);
         com.aspose.slides.internal.k4y.q7o var3 = var1.k5().n5().q0();
         var0.n5(com.aspose.slides.internal.v6g.k5.l6(var3.k5().k5(), com.aspose.slides.internal.k4y.b3u.class) ? 0 : 1);

         for (com.aspose.slides.internal.k4y.k8w var7 : var3.l6()) {
            SummaryZoomSection var8 = new SummaryZoomSection(var0);
            var8.n5(var7.u3());
            var8.u3(var7.a6());
            var8.a6(var7.u9());
            var8.u9(var7.h0());
            var8.setDescription(var7.k5());
            var8.setTitle(var7.l6());
            var8.l6(var7.c8().n5().k5());
            var8.n5(var7.n5().k5());
            var8.n5(var7.c8().k5());
            var8.setReturnToParent(var7.c8().l6());
            var8.n5(var7.c8().a6());
            var8.setTransitionDuration(o5.n5(var7.c8().u3()));
            k8n.n5(var8.z8(), var7.c8().u9(), var2.n5());
            com.aspose.slides.internal.k4y.b9y var9 = var7.c8().h0();
            z6a.n5(var8, var9, var2.n5());
            ((SummaryZoomSectionCollection)var0.getSummaryZoomCollection()).n5(var8);
         }
      }
   }

   public static void n5(SummaryZoomFrame var0, com.aspose.slides.internal.k4y.e2 var1, n4i var2) {
      com.aspose.slides.internal.k4y.j9u var3 = (com.aspose.slides.internal.k4y.j9u)var1.n5("AlternateContent").l6();
      var3.n5("psuz", "http://schemas.microsoft.com/office/powerpoint/2016/summaryzoom");
      var3.n5("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
      com.aspose.slides.internal.k4y.w1j var4 = var3.n5();
      var4.l6("psuz");
      com.aspose.slides.internal.k4y.s1k var5 = (com.aspose.slides.internal.k4y.s1k)var4.n5("graphicFrame").l6();
      var5.k5().n5().n5("http://schemas.microsoft.com/office/powerpoint/2016/summaryzoom");
      n5(var0, var5, var2);
      com.aspose.slides.internal.k4y.k8l var6 = var3.l6();
      if (var2.n5().h0() == 0) {
         n5(var0, var6, var2);
      }
   }

   private static void n5(SummaryZoomFrame var0, com.aspose.slides.internal.k4y.s1k var1, n4i var2) {
      g6c var3 = var2.n5();
      com.aspose.slides.internal.k4y.q7o var4 = var1.k5().n5().c8();
      if (var0.getLayout() == 0) {
         var4.n5("gridLayout");
      } else {
         var4.n5("fixedLayout");
      }

      IGenericEnumerator var5 = var0.getSummaryZoomCollection().iterator();

      try {
         while (var5.hasNext()) {
            ISummaryZoomSection var6 = (ISummaryZoomSection)var5.next();
            com.aspose.slides.internal.k4y.k8w var7 = var4.n5();
            SummaryZoomSection var8 = (SummaryZoomSection)var6;
            var7.n5(var8.k5());
            var7.l6(var8.u9());
            var7.k5(var8.x8());
            var7.u3(var8.y4());
            var7.l6(var8.getDescription());
            var7.n5(var8.getTitle());
            var7.n5(var8.n5().k5());
            var7.c8().n5(var8.e2().k5());
            var7.c8().n5(var8.getReturnToParent());
            var7.c8().l6(var8.z6());
            if (com.aspose.slides.ms.System.n1.k5(var8.getTransitionDuration())) {
               var8.setTransitionDuration(1.0F);
            }

            var7.c8().n5(o5.n5(var8.getTransitionDuration()));
            var7.c8().n5(var8.e9());
            com.aspose.slides.internal.c8m.j8 var9 = var3.l6(var8.z8().getPicture().getImage());
            com.aspose.slides.internal.k4y.w7 var10 = var7.c8().u9().n5();
            var10.l6(var3.u6().l6(var9).a6());
            var7.c8().u9().n5(var8.z8().getDpi() == 96 ? 4294967295L : var8.z8().getDpi() & 4294967295L);
            com.aspose.slides.internal.k4y.y9r var11 = (com.aspose.slides.internal.k4y.y9r)var7.c8().u9().n5("stretch").l6();
            c8a.n5(var8.z8().h0().n5().l6(), new p3h$1(var11));
            z6a.n5(var8, var7.c8().h0(), var3);
            com.aspose.slides.internal.k4y.r7n var12 = (com.aspose.slides.internal.k4y.r7n)var7.c8().h0().k5("prstGeom").l6();
            var12.n5(5);
            var12.n5();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      l5u.n5(var0, var1, var3);
   }

   private static void n5(SummaryZoomFrame var0, com.aspose.slides.internal.k4y.k8l var1, n4i var2) {
      g6c var3 = var2.n5();
      com.aspose.slides.internal.k4y.t4z var4 = (com.aspose.slides.internal.k4y.t4z)var1.n5("grpSp").l6();
      com.aspose.slides.internal.k4y.t9 var5 = var4.n5();
      var5.n5().l6(var0.getAlternativeText());
      var5.n5().k5(var0.getAlternativeTextTitle());
      var5.n5().n5(var0.getName());
      var5.n5().n5(var0.v4());
      com.aspose.slides.internal.k4y.h3r var6 = var5.l6().n5();
      var6.n5(true);
      var6.l6(true);
      var6.u3(true);
      var6.a6(true);
      var6.u9(true);
      var6.h0(true);
      com.aspose.slides.internal.k4y.n5u var7 = var4.l6();
      com.aspose.slides.internal.k4y.b8c var8 = var7.n5();
      IShapeFrame var9 = var0.getFrame();
      com.aspose.slides.internal.k4y.s2b var10 = var8.n5();
      var10.n5(com.aspose.slides.ms.System.d2.k5(var9.getX()) ? 0.0 : var9.getX());
      var10.l6(com.aspose.slides.ms.System.d2.k5(var9.getY()) ? 0.0 : var9.getY());
      com.aspose.slides.internal.k4y.q8g var11 = var8.l6();
      var11.n5(com.aspose.slides.ms.System.d2.k5(var9.getWidth()) ? 0.0 : var9.getWidth());
      var11.l6(com.aspose.slides.ms.System.d2.k5(var9.getHeight()) ? 0.0 : var9.getHeight());
      var8.n5(com.aspose.slides.ms.System.n1.k5(var9.getRotation()) ? 0.0F : var9.getRotation());
      var8.n5(var9.getFlipH() == 1);
      var8.l6(var9.getFlipV() == 1);
      IGenericEnumerator var12 = var0.getSummaryZoomCollection().iterator();

      try {
         while (var12.hasNext()) {
            ISummaryZoomSection var13 = (ISummaryZoomSection)var12.next();
            SummaryZoomSection var14 = (SummaryZoomSection)var13;
            com.aspose.slides.internal.k4y.b3 var15 = var4.n5("pic").l6();
            com.aspose.slides.internal.k4y.z1 var16;
            if (com.aspose.slides.internal.v6g.k5.l6(var15, com.aspose.slides.internal.k4y.a6.class)) {
               var16 = ((com.aspose.slides.internal.k4y.a6)var15).n5();
            } else {
               var16 = (com.aspose.slides.internal.k4y.z1)var15;
            }

            com.aspose.slides.internal.k4y.t4 var17 = var16.n5();
            z6a.n5(var14, var17.k5(), var3);
            z6a.n5(var14, var17.n5(), var3);
            if (var14.j5() != null) {
               com.aspose.slides.internal.k4y.x6s var18 = var17.n5().n5();
               var18.n5(var3.u6().n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships/slide", var3.l6().get_Item(var14.j5()), (byte)0).a6());
               var18.k5(com.aspose.slides.ms.System.d1.n5(new String[]{"ppaction://hlinksldjump?num=", com.aspose.slides.ms.System.a3.l6(((Slide)var14.j5()).z8() + 1)}));
            }

            PictureFrameLock var24 = new PictureFrameLock();
            var24.setAdjustHandlesLocked(true);
            var24.setArrowheadsLocked(true);
            var24.setAspectRatioLocked(true);
            var24.setEditPointsLocked(true);
            var24.setGroupingLocked(true);
            var24.setPositionLocked(true);
            var24.setRotationLocked(true);
            var24.setSelectLocked(true);
            var24.setShapeTypeLocked(true);
            var24.setSizeLocked(true);
            com.aspose.slides.internal.k4y.s1o var19 = var17.l6();
            z8u.n5(var24, new p3h$2(var19));
            z6a.n5(var14, var16.k5(), var3);
            com.aspose.slides.internal.k4y.r7n var20 = (com.aspose.slides.internal.k4y.r7n)var16.k5().k5("prstGeom").l6();
            var20.n5(5);
            var20.n5();
            k8n.n5(var14.z8(), var16.l6(), var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
            var12.dispose();
         }
      }
   }
}
