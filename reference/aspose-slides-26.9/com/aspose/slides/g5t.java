package com.aspose.slides;

class g5t {
   public static void n5(InkActions var0, com.aspose.slides.internal.k4y.x1s var1, i1x var2) {
      if (var1 != null) {
         String var3 = var1.u3();
         com.aspose.slides.internal.c8m.r7 var4 = var2.n5().k7().n5(var3);
         com.aspose.slides.internal.c8m.j8 var5 = var4.l6();
         s8d var6 = new s8d(var5, var2.n5());
         var6.n5(var0);
         z6a.n5(var0, var1.a6().k5(), var2);
         z6a.n5(var0, var1.a6().n5(), var2);
         var0.setBlackWhiteMode(var1.k5());
         if (var1.u9() != null) {
            e4c var7 = new e4c();
            e4c var8 = new e4c();
            x4t var9 = new x4t();
            e4c[] var10 = new e4c[]{var7};
            e4c[] var11 = new e4c[]{var8};
            x4t[] var12 = new x4t[]{var9};
            z5b.n5(var1.u9(), var10, var11, var12);
            var10[0].l6(var7);
            var11[0].l6(var8);
            var12[0].n5(var9);
            o4f var13 = var0.s3();
            var13.n5(var7.u9());
            var0.k5(var8.u9());
            var13.n5(var9.n5());
         }
      }
   }

   public static void n5(InkActions var0, com.aspose.slides.internal.k4y.e2 var1, n4i var2) {
      com.aspose.slides.internal.k4y.j9u var3 = (com.aspose.slides.internal.k4y.j9u)var1.n5("AlternateContent").l6();
      g6c var4 = var2.n5();
      var3.n5("p14", "http://schemas.microsoft.com/office/powerpoint/2010/main");
      var3.n5("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
      var3.n5("iact", "http://schemas.microsoft.com/office/powerpoint/2014/inkAction");
      com.aspose.slides.internal.k4y.w1j var5 = var3.n5();
      var5.l6("p14 iact");
      com.aspose.slides.internal.k4y.x1s var6 = (com.aspose.slides.internal.k4y.x1s)var5.n5("contentPart").l6();
      n5(var0, var6, var4);
      com.aspose.slides.internal.k4y.k8l var7 = var3.l6();
      if (var2.n5().h0() == 0) {
         n5(var0, var7, var4);
      }
   }

   public static void n5(InkActions var0, com.aspose.slides.internal.k4y.x1s var1, g6c var2) {
      String var3 = var2.c8() ? "drs" : "ppt";
      com.aspose.slides.internal.c8m.j8 var4 = var2.a6()
         .n5(com.aspose.slides.ms.System.d1.n5(new String[]{"/", var3, "/ink/inkAction{0}.xml"}), new g5t$1(var2), new com.aspose.slides.internal.c8m.b5());
      s8d var5 = new s8d(var4, var2);
      var5.n5(var0, var1, var2);
      com.aspose.slides.internal.c8m.r7 var6 = var2.u6().l6(var4);
      var1.n5(var6.a6());
      var1.n5(var0.getBlackWhiteMode());
      com.aspose.slides.internal.k4y.v5b var7 = var1.n5();
      z6a.n5(var0, var7.k5(), var2);
      z6a.n5(var0, var7.n5(), var2);
      z5b.n5(var0.getFrame(), var1.l6());
   }

   private static void n5(InkActions var0, com.aspose.slides.internal.k4y.k8l var1, g6c var2) {
      com.aspose.slides.internal.k4y.n7n var3 = (com.aspose.slides.internal.k4y.n7n)var1.n5("pic").l6();
      com.aspose.slides.internal.k4y.t4 var4 = var3.n5();
      z6a.n5(var0, var4.k5(), var2);
      z6a.n5(var0, var4.n5(), var2);
      PictureFrameLock var5 = new PictureFrameLock();
      var5.setAdjustHandlesLocked(true);
      var5.setArrowheadsLocked(true);
      var5.setAspectRatioLocked(true);
      var5.setEditPointsLocked(true);
      var5.setGroupingLocked(true);
      var5.setPositionLocked(true);
      var5.setRotationLocked(true);
      var5.setSelectLocked(true);
      var5.setShapeTypeLocked(true);
      var5.setSizeLocked(true);
      com.aspose.slides.internal.k4y.s1o var6 = var4.l6();
      z8u.n5(var5, new g5t$2(var6));
      z6a.n5(var0, var3.k5(), var2);
      com.aspose.slides.internal.k4y.r7n var7 = (com.aspose.slides.internal.k4y.r7n)var3.k5().k5("prstGeom").l6();
      var7.n5(5);
      var7.n5();
      PictureFrame var8 = n6s.n5(var0, true);
      k8n.n5((PictureFillFormat)var8.getPictureFormat(), var3.l6(), var2);
   }
}
