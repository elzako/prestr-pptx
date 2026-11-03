package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;

public class ShapeUtil {
   static IGeometryPath n5(com.aspose.slides.internal.x4g.s7 var0) {
      GeometryPath var1 = new GeometryPath();
      if (var0 == null) {
         throw new ArgumentException("Parameter graphicsPath is null");
      }

      if (var0.h0() == 0) {
         throw new ArgumentException("Graphics path is empty");
      }

      for (int var2 = 0; var2 < var0.u9().length; var2++) {
         int var3 = var0.u9()[var2] & 255 & 7;
         if (var3 == 0) {
            var1.l6(var0.a6()[var2].u3());
         }

         if (var3 == 1) {
            var1.n5(var0.a6()[var2].u3());
         }

         if (var3 == 3) {
            var1.n5(var0.a6()[var2].u3(), var0.a6()[var2 + 1].u3(), var0.a6()[var2 + 2].u3());
            var2 += 2;
         }

         if ((var0.u9()[var2] & 255 & 128) != 0) {
            var1.closeFigure();
         }
      }

      return var1;
   }

   static com.aspose.slides.internal.x4g.s7 n5(IGeometryPath var0) {
      com.aspose.slides.internal.x4g.s7 var1 = new com.aspose.slides.internal.x4g.s7();
      float var2 = 0.0F;
      float var3 = 0.0F;

      for (IPathSegment var7 : var0.getPathData()) {
         switch (var7.getPathCommand()) {
            case 0:
               var1.n3();
               break;
            case 1:
               var1.t9();
               var2 = var7.getSegmentData()[0];
               var3 = var7.getSegmentData()[1];
               break;
            case 2:
               float var29 = var7.getSegmentData()[0];
               float var32 = var7.getSegmentData()[1];
               var1.l6(var2, var3, var29, var32);
               var2 = var29;
               var3 = var32;
               break;
            case 3:
               float var10 = var7.getSegmentData()[0];
               float var11 = var7.getSegmentData()[1];
               float var12 = var7.getSegmentData()[2];
               float var13 = var7.getSegmentData()[3];
               if (!(com.aspose.slides.ms.System.q1.n5(var10) + com.aspose.slides.ms.System.q1.n5(var11) < 0.005)) {
                  var11 = var11 == 0.0F ? 1.0E-5F : var11;
                  var10 = var10 == 0.0F ? 1.0E-5F : var10;
                  double var14 = var12 / 180.0F * Math.PI;
                  double var16 = com.aspose.slides.ms.System.q1.c8(var14);
                  double var18 = com.aspose.slides.ms.System.q1.h0(var14);
                  double var20 = com.aspose.slides.ms.System.q1.z3(1.0 / (var16 * var16 / var10 / var10 + var18 * var18 / var11 / var11));
                  float var28 = (float)(var2 - var16 * var20);
                  float var31 = (float)(var3 - var18 * var20);
                  var1.n5(var28 - var10, var31 - var11, var10 * 2.0F, var11 * 2.0F, var12, var13);
                  if (var1.h0() < 2) {
                     var3 = 0.0F;
                     var2 = 0.0F;
                  } else {
                     com.aspose.slides.internal.o9b.w1 var22 = var1.a6()[var1.h0() - 1].u3();
                     var2 = var22.l6();
                     var3 = var22.k5();
                  }
               }
               break;
            case 4:
               float var27 = var7.getSegmentData()[0];
               float var30 = var7.getSegmentData()[1];
               float var35 = var7.getSegmentData()[2];
               float var36 = var7.getSegmentData()[3];
               var1.n5(
                  var2,
                  var3,
                  var2 + (var27 - var2) * 2.0F / 3.0F,
                  var3 + (var30 - var3) * 2.0F / 3.0F,
                  var35 + (var27 - var35) * 2.0F / 3.0F,
                  var36 + (var30 - var36) * 2.0F / 3.0F,
                  var35,
                  var36
               );
               var2 = var35;
               var3 = var36;
               break;
            case 5:
               float var8 = var7.getSegmentData()[0];
               float var9 = var7.getSegmentData()[1];
               float var23 = var7.getSegmentData()[2];
               float var24 = var7.getSegmentData()[3];
               float var25 = var7.getSegmentData()[4];
               float var26 = var7.getSegmentData()[5];
               var1.n5(var2, var3, var8, var9, var23, var24, var25, var26);
               var2 = var25;
               var3 = var26;
         }
      }

      return var1;
   }
}
