package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;

class o7 {
   public static void n5(v5s var0) {
      BaseShapeLock var1 = com.aspose.slides.internal.v6g.k5.n5(((IShape)var0.a6().m1()).getShapeLock(), BaseShapeLock.class);
      com.aspose.slides.internal.k0r.r3 var2 = var0.k5().a6();
      if (var2 != null && var2.l6().l6(127)) {
         com.aspose.slides.internal.k0r.t3 var3 = (com.aspose.slides.internal.k0r.t3)var2.l6().n5(127);
         var1.l6().n5(var3);
         var1.n5((byte)5, false);
         var1.n5((byte)1, var3.u9() ? var3.q0() : false);
         var1.n5((byte)4, var3.a6() ? var3.t4() : false);
         var1.n5((byte)0, var3.x8() ? var3.z8() : false);
         IGroupShapeLock var4 = com.aspose.slides.internal.v6g.k5.n5(var1, IGroupShapeLock.class);
         if (var4 != null) {
            var4.setAspectRatioLocked(var3.u3() ? var3.z1() : false);
            var4.setRotationLocked(var3.k5() ? var3.t9() : false);
            var4.setUngroupingLocked(var3.l6() ? var3.n3() : false);
         } else {
            IAutoShapeLock var5 = com.aspose.slides.internal.v6g.k5.n5(var1, IAutoShapeLock.class);
            if (var5 != null) {
               var5.setAdjustHandlesLocked(var3.s7() ? var3.m3() : false);
               var5.setArrowheadsLocked(false);
               var5.setAspectRatioLocked(var3.u3() ? var3.z1() : false);
               var5.setShapeTypeLocked(false);
               var5.setEditPointsLocked(var3.c8() ? var3.m1() : false);
               var5.setRotateLocked(var3.k5() ? var3.t9() : false);
               var5.setTextLocked(var3.t2() ? var3.k7() : false);
            } else {
               IPictureFrameLock var6 = com.aspose.slides.internal.v6g.k5.n5(var1, IPictureFrameLock.class);
               if (var6 != null) {
                  var6.setAdjustHandlesLocked(var3.s7() ? var3.m3() : false);
                  var6.setArrowheadsLocked(false);
                  var6.setAspectRatioLocked(var3.u3() ? var3.z1() : false);
                  var6.setCropLocked(var3.h0() ? var3.z3() : false);
                  var6.setEditPointsLocked(var3.c8() ? var3.m1() : false);
                  var6.setRotationLocked(var3.k5() ? var3.t9() : false);
                  var6.setShapeTypeLocked(false);
               } else {
                  IGraphicalObjectLock var7 = com.aspose.slides.internal.v6g.k5.n5(var1, IGraphicalObjectLock.class);
                  if (var7 != null) {
                     var7.setAspectRatioLocked(var3.u3() ? var3.z1() : false);
                     var7.setDrilldownLocked(false);
                  } else {
                     IConnectorLock var8 = com.aspose.slides.internal.v6g.k5.n5(var1, IConnectorLock.class);
                     if (var8 != null) {
                        var8.setAdjustHandlesLocked(var3.s7() ? var3.m3() : false);
                        var8.setArrowheadsLocked(false);
                        var8.setAspectRatioLocked(var3.u3() ? var3.z1() : false);
                        var8.setEditPointsLocked(var3.c8() ? var3.m1() : false);
                        var8.setRotateLocked(var3.k5() ? var3.t9() : false);
                        var8.setShapeTypeLocked(false);
                     }
                  }
               }
            }
         }
      }
   }

   public static void n5(k1z var0) {
      Shape var1 = var0.s7();
      com.aspose.slides.internal.k0r.r3 var2 = var0.z8();
      if (com.aspose.slides.internal.v6g.k5.l6(var1, IGroupShape.class)) {
         n5(((IGroupShape)var1).getShapeLock(), var2);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, IAutoShape.class)) {
         n5(((IAutoShape)var1).getShapeLock(), var2);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, IPictureFrame.class)) {
         n5(((IPictureFrame)var1).getShapeLock(), var2);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, IGraphicalObject.class)) {
         n5(((IGraphicalObject)var1).getShapeLock(), var2);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, IConnector.class)) {
         n5(((IConnector)var1).getShapeLock(), var2);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, ISmartArt.class)) {
         com.aspose.slides.internal.k0r.t3 var3 = n5(((IGraphicalObject)var1).getShapeLock(), var2);
         if (var3 == null) {
            var3 = new com.aspose.slides.internal.k0r.t3();
            var2.l6().l6(var3);
         }

         var3.l6(true);
         var3.k5(true);
         var3.u3(true);
         var3.a6(true);
         var3.u9(true);
         var3.h0(true);
         var3.c8(true);
         var3.t2(true);
         var3.s7(true);
      }
   }

   public static com.aspose.slides.internal.k0r.t3 n5(IBaseShapeLock var0, com.aspose.slides.internal.k0r.r3 var1) {
      if (var0 == null) {
         return null;
      }

      com.aspose.slides.internal.k0r.t3 var2 = ((BaseShapeLock)var0).l6().n5();
      if (var2 == null) {
         var2 = new com.aspose.slides.internal.k0r.t3();
      }

      if (var0.getNoLocks() && (var2.j5() & 4294967295L) == 0L) {
         return null;
      }

      var1.l6().l6(var2);
      if (com.aspose.slides.internal.v6g.k5.l6(var0, IGroupShapeLock.class)) {
         IGroupShapeLock var3 = (IGroupShapeLock)var0;
         var2.k5(true);
         var2.y4(var3.getAspectRatioLocked());
         var2.s7(true);
         var2.m1(var3.getGroupingLocked());
         var2.u3(true);
         var2.e2(var3.getPositionLocked());
         var2.l6(true);
         var2.n3(var3.getRotationLocked());
         var2.a6(true);
         var2.t9(var3.getSelectLocked());
         var2.n5(true);
         var2.x8(var3.getUngroupingLocked());
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, IAutoShapeLock.class)) {
         IAutoShapeLock var4 = (IAutoShapeLock)var0;
         var2.t2(true);
         var2.z3(var4.getAdjustHandlesLocked());
         var2.k5(true);
         var2.y4(var4.getAspectRatioLocked());
         var2.h0(true);
         var2.t4(var4.getEditPointsLocked());
         var2.s7(true);
         var2.m1(var4.getGroupingLocked());
         var2.u3(true);
         var2.e2(var4.getPositionLocked());
         var2.l6(true);
         var2.n3(var4.getRotateLocked());
         var2.a6(true);
         var2.t9(var4.getSelectLocked());
         var2.c8(true);
         var2.q0(var4.getTextLocked());
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, IPictureFrameLock.class)) {
         IPictureFrameLock var5 = (IPictureFrameLock)var0;
         var2.t2(true);
         var2.z3(var5.getAdjustHandlesLocked());
         var2.k5(true);
         var2.y4(var5.getAspectRatioLocked());
         var2.u9(true);
         var2.z1(var5.getCropLocked());
         var2.h0(true);
         var2.t4(var5.getEditPointsLocked());
         var2.s7(true);
         var2.m1(var5.getGroupingLocked());
         var2.u3(true);
         var2.e2(var5.getPositionLocked());
         var2.l6(true);
         var2.n3(var5.getRotationLocked());
         var2.a6(true);
         var2.t9(var5.getSelectLocked());
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, IGraphicalObjectLock.class)) {
         IGraphicalObjectLock var6 = (IGraphicalObjectLock)var0;
         var2.k5(true);
         var2.y4(var6.getAspectRatioLocked());
         var2.s7(true);
         var2.m1(var6.getGroupingLocked());
         var2.u3(true);
         var2.e2(var6.getPositionLocked());
         var2.a6(true);
         var2.t9(var6.getSelectLocked());
      } else {
         if (!com.aspose.slides.internal.v6g.k5.l6(var0, IConnectorLock.class)) {
            throw new Exception();
         }

         IConnectorLock var7 = (IConnectorLock)var0;
         var2.t2(true);
         var2.z3(var7.getAdjustHandlesLocked());
         var2.k5(true);
         var2.y4(var7.getAspectRatioLocked());
         var2.h0(true);
         var2.t4(var7.getEditPointsLocked());
         var2.s7(true);
         var2.m1(var7.getGroupingLocked());
         var2.u3(true);
         var2.e2(var7.getPositionMove());
         var2.l6(true);
         var2.n3(var7.getRotateLocked());
         var2.a6(true);
         var2.t9(var7.getSelectLocked());
      }

      return var2;
   }
}
