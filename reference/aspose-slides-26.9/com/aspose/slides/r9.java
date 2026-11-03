package com.aspose.slides;

class r9 {
   public static void n5(IGroupShapeLock var0, com.aspose.slides.internal.k4y.h3r var1) {
      if (var1 != null) {
         n5(var0, var1.c8());
         var0.setAspectRatioLocked(var1.a6());
         var0.setGroupingLocked(var1.n5());
         var0.setPositionLocked(var1.u9());
         var0.setRotationLocked(var1.u3());
         var0.setSelectLocked(var1.k5());
         var0.setSizeLocked(var1.h0());
         var0.setUngroupingLocked(var1.l6());
      }
   }

   public static void n5(IAutoShapeLock var0, com.aspose.slides.internal.k4y.y5s var1) {
      if (var1 != null) {
         n5(var0, var1.n3());
         var0.setAdjustHandlesLocked(var1.c8());
         var0.setArrowheadsLocked(var1.t2());
         var0.setAspectRatioLocked(var1.u3());
         var0.setShapeTypeLocked(var1.s7());
         var0.setEditPointsLocked(var1.h0());
         var0.setGroupingLocked(var1.n5());
         var0.setPositionLocked(var1.a6());
         var0.setSizeLocked(var1.u9());
         var0.setRotateLocked(var1.k5());
         var0.setSelectLocked(var1.l6());
         var0.setTextLocked(var1.x8());
      }
   }

   public static void n5(IPictureFrameLock var0, com.aspose.slides.internal.k4y.g2x var1) {
      if (var1 != null) {
         n5(var0, var1.n3());
         var0.setAdjustHandlesLocked(var1.c8());
         var0.setArrowheadsLocked(var1.t2());
         var0.setAspectRatioLocked(var1.u3());
         var0.setCropLocked(var1.x8());
         var0.setEditPointsLocked(var1.h0());
         var0.setGroupingLocked(var1.n5());
         var0.setPositionLocked(var1.a6());
         var0.setRotationLocked(var1.k5());
         var0.setSelectLocked(var1.l6());
         var0.setShapeTypeLocked(var1.s7());
         var0.setSizeLocked(var1.u9());
      }
   }

   public static void n5(IGraphicalObjectLock var0, com.aspose.slides.internal.k4y.r7c var1) {
      if (var1 != null) {
         n5(var0, var1.h0());
         var0.setAspectRatioLocked(var1.u3());
         var0.setDrilldownLocked(var1.l6());
         var0.setGroupingLocked(var1.n5());
         var0.setPositionLocked(var1.a6());
         var0.setSelectLocked(var1.k5());
         var0.setSizeLocked(var1.u9());
      }
   }

   public static void n5(IConnectorLock var0, com.aspose.slides.internal.k4y.y9w var1) {
      if (var1 != null) {
         n5(var0, var1.x8());
         var0.setAdjustHandlesLocked(var1.c8());
         var0.setArrowheadsLocked(var1.t2());
         var0.setAspectRatioLocked(var1.u3());
         var0.setEditPointsLocked(var1.h0());
         var0.setGroupingLocked(var1.n5());
         var0.setPositionMove(var1.a6());
         var0.setRotateLocked(var1.k5());
         var0.setSelectLocked(var1.l6());
         var0.setShapeTypeLocked(var1.s7());
         var0.setSizeLocked(var1.u9());
      }
   }

   private static void n5(IBaseShapeLock var0, com.aspose.slides.internal.k4y.x8 var1) {
      c7 var2 = ((BaseShapeLock)var0).n5();
      var2.n5(var1);
   }

   public static void n5(GroupShapeLock var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.h3r> var1) {
      if (var0 != null) {
         com.aspose.slides.internal.k4y.x8 var2 = var0.n5().n5();
         if (!var0.getNoLocks() || var2 != null) {
            com.aspose.slides.internal.k4y.h3r var3 = (com.aspose.slides.internal.k4y.h3r)var1.invoke();
            if (!var0.getNoLocks()) {
               var3.a6(var0.getAspectRatioLocked());
               var3.n5(var0.getGroupingLocked());
               var3.u9(var0.getPositionLocked());
               var3.u3(var0.getRotationLocked());
               var3.k5(var0.getSelectLocked());
               var3.h0(var0.getSizeLocked());
               var3.l6(var0.getUngroupingLocked());
            }

            var3.n5(var2);
         }
      }
   }

   public static void n5(AutoShapeLock var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.y5s> var1) {
      if (var0 != null) {
         com.aspose.slides.internal.k4y.x8 var2 = var0.n5().n5();
         if (!var0.getNoLocks() || var2 != null) {
            com.aspose.slides.internal.k4y.y5s var3 = (com.aspose.slides.internal.k4y.y5s)var1.invoke();
            if (!var0.getNoLocks()) {
               var3.c8(var0.getAdjustHandlesLocked());
               var3.t2(var0.getArrowheadsLocked());
               var3.u3(var0.getAspectRatioLocked());
               var3.s7(var0.getShapeTypeLocked());
               var3.h0(var0.getEditPointsLocked());
               var3.n5(var0.getGroupingLocked());
               var3.a6(var0.getPositionLocked());
               var3.u9(var0.getSizeLocked());
               var3.k5(var0.getRotateLocked());
               var3.l6(var0.getSelectLocked());
               var3.x8(var0.getTextLocked());
            }

            var3.n5(var2);
         }
      }
   }

   public static void n5(GraphicalObjectLock var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.r7c> var1) {
      if (var0 != null) {
         com.aspose.slides.internal.k4y.x8 var2 = var0.n5().n5();
         if (!var0.getNoLocks() || var2 != null) {
            com.aspose.slides.internal.k4y.r7c var3 = (com.aspose.slides.internal.k4y.r7c)var1.invoke();
            if (!var0.getNoLocks()) {
               var3.u3(var0.getAspectRatioLocked());
               var3.l6(var0.getDrilldownLocked());
               var3.n5(var0.getGroupingLocked());
               var3.a6(var0.getPositionLocked());
               var3.k5(var0.getSelectLocked());
               var3.u9(var0.getSizeLocked());
            }

            var3.n5(var2);
         }
      }
   }

   public static void n5(ConnectorLock var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.y9w> var1) {
      if (var0 != null) {
         com.aspose.slides.internal.k4y.x8 var2 = var0.n5().n5();
         if (!var0.getNoLocks() || var2 != null) {
            com.aspose.slides.internal.k4y.y9w var3 = (com.aspose.slides.internal.k4y.y9w)var1.invoke();
            if (!var0.getNoLocks()) {
               var3.c8(var0.getAdjustHandlesLocked());
               var3.t2(var0.getArrowheadsLocked());
               var3.u3(var0.getAspectRatioLocked());
               var3.h0(var0.getEditPointsLocked());
               var3.n5(var0.getGroupingLocked());
               var3.a6(var0.getPositionMove());
               var3.k5(var0.getRotateLocked());
               var3.l6(var0.getSelectLocked());
               var3.s7(var0.getShapeTypeLocked());
               var3.u9(var0.getSizeLocked());
            }

            var3.n5(var2);
         }
      }
   }

   public static void n5(PictureFrameLock var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.g2x> var1) {
      if (var0 != null) {
         com.aspose.slides.internal.k4y.x8 var2 = var0.n5().n5();
         if (!var0.getNoLocks() || var2 != null) {
            com.aspose.slides.internal.k4y.g2x var3 = (com.aspose.slides.internal.k4y.g2x)var1.invoke();
            if (!var0.getNoLocks()) {
               var3.c8(var0.getAdjustHandlesLocked());
               var3.t2(var0.getArrowheadsLocked());
               var3.u3(var0.getAspectRatioLocked());
               var3.x8(var0.getCropLocked());
               var3.h0(var0.getEditPointsLocked());
               var3.n5(var0.getGroupingLocked());
               var3.a6(var0.getPositionLocked());
               var3.k5(var0.getRotationLocked());
               var3.l6(var0.getSelectLocked());
               var3.s7(var0.getShapeTypeLocked());
               var3.u9(var0.getSizeLocked());
            }

            var3.n5(var2);
         }
      }
   }
}
