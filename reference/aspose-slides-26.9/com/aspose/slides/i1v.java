package com.aspose.slides;

import com.aspose.slides.internal.k4y.d7b;
import com.aspose.slides.internal.k4y.h4h;

class i1v {
   public static void n5(ZoomFrame var0, com.aspose.slides.internal.k4y.s1k var1, i1x var2) {
      if (var1 != null) {
         h4h var3 = var1.k5().n5().t4();
         z6a.n5(var0, var3.n5().k5().h0(), var2.n5());
         l5u.n5(var0, var1, var2);
         var0.l6(var3.n5().k5().n5().k5());
         var0.n5(var3.n5().l6());
         var0.l6(var3.n5().n5());
         var0.n5(var3.n5().k5().k5());
         var0.setReturnToParent(var3.n5().k5().l6());
         var0.n5(var3.n5().k5().a6());
         var0.setTransitionDuration(o5.n5(var3.n5().k5().u3()));
         k8n.n5(var0.z8(), var3.n5().k5().u9(), var2.n5());
      }
   }

   public static void n5(ZoomFrame var0, com.aspose.slides.internal.k4y.e2 var1, n4i var2) {
      com.aspose.slides.internal.k4y.j9u var3 = (com.aspose.slides.internal.k4y.j9u)var1.n5("AlternateContent").l6();
      var3.n5("pslz", "http://schemas.microsoft.com/office/powerpoint/2016/slidezoom");
      var3.n5("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
      com.aspose.slides.internal.k4y.w1j var4 = var3.n5();
      var4.l6("pslz");
      com.aspose.slides.internal.k4y.s1k var5 = (com.aspose.slides.internal.k4y.s1k)var4.n5("graphicFrame").l6();
      var5.k5().n5().n5("http://schemas.microsoft.com/office/powerpoint/2016/slidezoom");
      n5(var0, var5, var2);
      com.aspose.slides.internal.k4y.k8l var6 = var3.l6();
      if (var2.n5().h0() == 0) {
         n5(var0, var6, var2);
      }
   }

   private static void n5(ZoomFrame var0, com.aspose.slides.internal.k4y.s1k var1, n4i var2) {
      g6c var3 = var2.n5();
      h4h var4 = var1.k5().n5().u9();
      d7b var5 = var4.n5();
      var5.n5(var0.m3());
      if ((var0.z1() & 4294967295L) != 0L) {
         var5.l6(var0.z1());
      }

      var5.k5().n5(var0.e2().k5());
      var5.k5().n5(var0.getReturnToParent());
      var5.k5().l6(var0.z6());
      if (com.aspose.slides.ms.System.n1.k5(var0.getTransitionDuration())) {
         var0.setTransitionDuration(1.0F);
      }

      var5.k5().n5(o5.n5(var0.getTransitionDuration()));
      var5.k5().n5(var0.e9());
      com.aspose.slides.internal.c8m.j8 var6 = var3.l6(var0.z8().getPicture().getImage());
      com.aspose.slides.internal.k4y.w7 var7 = var5.k5().u9().n5();
      var7.l6(var3.u6().l6(var6).a6());
      var5.k5().u9().n5(var0.z8().getDpi() == 96 ? 4294967295L : var0.z8().getDpi() & 4294967295L);
      com.aspose.slides.internal.k4y.y9r var8 = (com.aspose.slides.internal.k4y.y9r)var5.k5().u9().n5("stretch").l6();
      c8a.n5(var0.z8().h0().n5().l6(), new i1v$1(var8));
      z6a.n5(var0, var5.k5().h0(), var3);
      com.aspose.slides.internal.k4y.r7n var9 = (com.aspose.slides.internal.k4y.r7n)var5.k5().h0().k5("prstGeom").l6();
      var9.n5(5);
      var9.n5();
      l5u.n5(var0, var1, var3);
   }

   private static void n5(ZoomFrame var0, com.aspose.slides.internal.k4y.k8l var1, n4i var2) {
      g6c var3 = var2.n5();
      com.aspose.slides.internal.k4y.n7n var4 = (com.aspose.slides.internal.k4y.n7n)var1.n5("pic").l6();
      com.aspose.slides.internal.k4y.t4 var5 = var4.n5();
      z6a.n5(var0, var5.k5(), var3);
      z6a.n5(var0, var5.n5(), var3);
      if (var0.getTargetSlide() != null) {
         com.aspose.slides.internal.k4y.x6s var6 = var5.n5().n5();
         var6.n5(var3.u6().n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships/slide", var3.l6().get_Item(var0.j5()), (byte)0).a6());
         var6.k5(com.aspose.slides.ms.System.d1.n5(new String[]{"ppaction://hlinksldjump?num=", com.aspose.slides.ms.System.a3.l6(((Slide)var0.j5()).z8() + 1)}));
      }

      PictureFrameLock var9 = new PictureFrameLock();
      var9.setAdjustHandlesLocked(true);
      var9.setArrowheadsLocked(true);
      var9.setAspectRatioLocked(true);
      var9.setEditPointsLocked(true);
      var9.setGroupingLocked(true);
      var9.setPositionLocked(true);
      var9.setRotationLocked(true);
      var9.setSelectLocked(true);
      var9.setShapeTypeLocked(true);
      var9.setSizeLocked(true);
      com.aspose.slides.internal.k4y.s1o var7 = var5.l6();
      z8u.n5(var9, new i1v$2(var7));
      z6a.n5(var0, var4.k5(), var3);
      com.aspose.slides.internal.k4y.r7n var8 = (com.aspose.slides.internal.k4y.r7n)var4.k5().k5("prstGeom").l6();
      var8.n5(5);
      var8.n5();
      k8n.n5(var0.z8(), var4.l6(), var3);
   }
}
