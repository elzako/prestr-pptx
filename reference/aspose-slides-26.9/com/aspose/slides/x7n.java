package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class x7n {
   private final n1g n5;

   public x7n(n1g var1) {
      this.n5 = var1;
   }

   final void n5() {
      byte var1 = this.n5.n3().getRotation3D().getRotationX();
      if (this.n5.n3().hasDataTable() && var1 >= 0) {
         boolean var2 = ChartTypeCharacterizer.isChartTypeBar(this.n5.n3().getType());
         IRotation3D var3 = this.n5.n3().getRotation3D();
         float var4 = this.n5.e5().c8();
         var4 *= (var3.getDepthPercents() & 65535) / 100.0F;
         float var5 = var4 * ((this.n5.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapDepth() & 65535) / 100.0F);
         float var6 = var4 + var5;
         float var7 = 0.0F;
         List var8 = z7d.n5(true, var2, this.n5.s7().l6(), this.n5);
         this.n5(this.n5, var2, var8, var6);
         this.n5(this.n5, var2, var7, var6);
         this.n5(this.n5, var2, var8, var7, var6);
      }
   }

   private void n5(n1g var1, boolean var2, List<u5l> var3, float var4) {
      DataTable var5 = (DataTable)var1.n3().getChartDataTable();
      if (var5.hasBorderOutline() || var5.hasBorderHorizontal() || var5.hasBorderVertical()) {
         IRotation3D var6 = var1.n3().getRotation3D();
         com.aspose.slides.internal.o9b.p8 var7 = var1.s7().u9().u3();
         int var8 = var1.s7().n5.s7();
         int var9 = var1.s7().n5.x8();
         int var10 = var1.s7().n5.t2();
         int var11 = var7.k5() + var1.s7().c8();
         com.aspose.slides.internal.o9b.y2 var12 = new com.aspose.slides.internal.o9b.y2(var8, var9, var10, var11);
         com.aspose.slides.internal.o9b.y2 var13 = new com.aspose.slides.internal.o9b.y2(var8 - var7.l6(), var9 + var1.s7().c8(), var10 + var7.l6(), var7.k5());
         if (var5.hasBorderOutline()) {
            com.aspose.slides.internal.x4g.s7 var14 = new com.aspose.slides.internal.x4g.s7();

            try {
               if (var1.u3() != null && var1.u3().length > 0 && var1.l6().size() > 0) {
                  var14.l6(var12.u9(), var12.c8(), var12.u3(), var12.c8());
               }

               var14.l6(var12.s7(), var12.x8(), var12.s7(), var12.n5());
               var14.l6(var12.s7(), var12.n5(), var12.u9(), var12.n5());
               var14.l6(var12.u9(), var12.n5(), var12.u9(), var12.x8());
               var14.l6(var13.n3());
               if (!var2 && var6.getRightAngleAxes()) {
                  var1.s7().n5(var14, 0.0F, var4);
               } else {
                  com.aspose.slides.internal.o9b.c8 var15 = var1.s7().n5().o8();
                  w5k.n5(
                     var15.o8(), com.aspose.slides.internal.o9b.c8.u3.o8(), var1, com.aspose.slides.internal.o9b.y1.n5(var12).y4(), (Format)var5.getFormat()
                  );
                  w5k.n5(
                     var15.o8(), com.aspose.slides.internal.o9b.c8.u3.o8(), var1, com.aspose.slides.internal.o9b.y1.n5(var13).y4(), (Format)var5.getFormat()
                  );
               }
            } finally {
               if (var14 != null) {
                  var14.dispose();
               }
            }
         }

         if (var5.hasBorderHorizontal()) {
            float var35 = (float)var1.s7().u9().k5() / var3.size();

            for (int var37 = 1; var37 < var3.size(); var37++) {
               com.aspose.slides.internal.x4g.s7 var16 = new com.aspose.slides.internal.x4g.s7();

               try {
                  float var17 = var13.u3();
                  float var18 = var13.c8() + var35 * var37;
                  float var19 = var13.u9();
                  var16.l6(var17, var18, var19, var18);
                  if (!var2 && var6.getRightAngleAxes()) {
                     var1.s7().n5(var16, 0.0F, var4);
                  } else {
                     com.aspose.slides.internal.o9b.c8 var20 = var1.s7().n5().o8();
                     w5k.n5(var20.o8(), var1, var16, (LineFormat)var5.getFormat().getLine(), null);
                  }
               } finally {
                  if (var16 != null) {
                     var16.dispose();
                  }
               }
            }
         }

         if (var5.hasBorderVertical()) {
            int var36 = n1g.u3(var1.y4());
            float var38 = (float)var10 / var36;

            for (int var39 = 1; var39 < var36; var39++) {
               com.aspose.slides.internal.x4g.s7 var40 = new com.aspose.slides.internal.x4g.s7();

               try {
                  float var41 = var8 + var38 * var39;
                  float var42 = var12.c8();
                  float var43 = var42 + var11;
                  var40.l6(var41, var42, var41, var43);
                  if (!var2 && var6.getRightAngleAxes()) {
                     var1.s7().n5(var40, 0.0F, var4);
                  } else {
                     com.aspose.slides.internal.o9b.c8 var21 = var1.s7().n5().o8();
                     w5k.n5(var21.o8(), var1, var40, (LineFormat)var5.getFormat().getLine(), null);
                  }
               } finally {
                  if (var40 != null) {
                     var40.dispose();
                  }
               }
            }
         }
      }
   }

   private void n5(n1g var1, boolean var2, float var3, float var4) {
      IRotation3D var5 = var1.n3().getRotation3D();
      float var6 = var5.getRotationX();
      com.aspose.slides.internal.o9b.p8 var7 = var1.s7().u9().u3();
      int var8 = var1.s7().n5.s7();
      int var9 = var1.s7().n5.x8();
      int var10 = var1.s7().n5.t2();
      int var11 = var7.k5() + var1.s7().c8();
      com.aspose.slides.internal.o9b.y2 var12 = new com.aspose.slides.internal.o9b.y2(var8, var9, var10, var11);
      com.aspose.slides.internal.o9b.y2 var13 = new com.aspose.slides.internal.o9b.y2(var8 - var7.l6(), var9 + var1.s7().c8(), var10 + var7.l6(), var7.k5());
      boolean var14 = false;
      int var15 = n1g.u3(var1.y4());
      List var16 = var1.l6();
      List[] var17 = var1.u3();
      if (var1.q0().n3() && var16.size() > 0) {
         var14 = true;
      }

      if (var17 != null && var17.length > 0 && var16.size() > 0) {
         var14 = true;
      }

      float var18 = (float)var10 / var15;
      com.aspose.slides.internal.o9b.f2 var19 = com.aspose.slides.internal.o9b.f2.n5.a6();
      int var20 = 0;

      for (int var21 = 0; var21 < var15; var21++) {
         int var22 = var21;
         if (var1.q0().c8().isPlotOrderReversed()) {
            var22 = var15 - var21 - 1;
         }

         String var23 = com.aspose.slides.ms.System.d1.n5;
         if (var22 <= var1.l6().size() - 1) {
            x4 var24 = (x4)var16.get_Item(var22);
            if (!var14) {
               var23 = p4.n5(var24.l6(), var1.q0());
            } else {
               String var25 = var22 < var16.size() ? var24.u9() : com.aspose.slides.ms.System.d1.n5;
               boolean var26 = var22 < var16.size() && var24.a6();
               var23 = t7k.n5(var24.l6(), var25, var26);
            }
         }

         if (!com.aspose.slides.ms.System.d1.n5(var23)) {
            com.aspose.slides.internal.o9b.f2 var30 = v7u.n5(com.aspose.slides.ms.System.t9.q0(var23.charAt(0)), var1.s7()).a6();
            int var34 = com.aspose.slides.internal.v6g.k5.u3(var30.l6() * var1.q0().x8() / 300.0F, 13);
            if (var34 > var20) {
               var20 = var34;
               var30.l6(var19);
            }
         }

         com.aspose.slides.internal.o9b.y1 var31 = new com.aspose.slides.internal.o9b.y1(var8 + var21 * var18, (float)var9 + var20, var18, var1.s7().t2());
         if (!var2 && var5.getRightAngleAxes()) {
            float var35 = var19.l6() * (180.0F - com.aspose.slides.ms.System.q1.n5(var6)) / 180.0F;
            var31 = new com.aspose.slides.internal.o9b.y1(var31.x8() + var35 / 2.0F, var31.n3(), var31.s7() - var35, var31.k5());
            j9e.n5(var31.y4(), var23, 0, var1.s7().k5(), var1.s7().a6().o8(), 1, 2, var1, var4);
         } else {
            h6l.n5(var31.y4(), var23, 0, var1.s7().k5(), var1.s7().a6().o8(), 1, 2, var1);
         }
      }

      if (var17 != null && var17.length > 0 && var1.l6().size() > 0) {
         if (com.aspose.slides.internal.o9b.f2.l6(var19, com.aspose.slides.internal.o9b.f2.n5)) {
            v7u.n5("a", var1.s7()).l6(var19);
            var20 = com.aspose.slides.internal.v6g.k5.u3(var19.l6() * var1.q0().x8() / 300.0F, 13);
         }

         l5 var27 = var1.q0();
         float var28 = var20;
         float var29 = var13.c8();
         float var33;
         if (!var1.q0().c8().isPlotOrderReversed()) {
            var33 = var12.u3();
         } else {
            var33 = var12.u9();
         }

         this.n5(var17, new com.aspose.slides.internal.o9b.w1(var33, var29), var28, var18, 2, var12.n3(), var27, var1, var4);
      }
   }

   final void n5(
      List<x4>[] var1,
      com.aspose.slides.internal.o9b.w1 var2,
      float var3,
      double var4,
      int var6,
      com.aspose.slides.internal.o9b.y2 var7,
      l5 var8,
      n1g var9,
      float var10
   ) {
      byte var11 = 0;
      float var12 = var2.k5();
      a8e var13 = var9.s7();
      com.aspose.slides.internal.o9b.f2 var14 = new com.aspose.slides.internal.o9b.f2((float)var4, var7.l6() / 2.0F);

      for (int var15 = 0; var15 < var1.length; var15++) {
         List var16 = var1[var15];
         com.aspose.slides.internal.o9b.p8 var17 = v7u.n5(var16, var11, var13, var14.a6()).u3();
         float var18 = var2.l6();

         for (int var19 = 0; var19 < var16.size(); var19++) {
            x4 var20 = (x4)var16.get_Item(var19);
            String var21 = t7k.n5(var20.l6(), var20.u9(), var20.a6());
            int var22 = p4.n5(var20);
            float var23 = (float)(var22 * var4);
            float var24;
            if (!var8.c8().isPlotOrderReversed()) {
               var24 = var18 + var23 / 2.0F - var17.l6() / 2.0F;
            } else {
               var24 = var18 - var23 / 2.0F - var17.l6() / 2.0F;
            }

            float var25 = var12 - var17.k5();
            com.aspose.slides.internal.o9b.y1 var26 = new com.aspose.slides.internal.o9b.y1(var24, var25, var17.l6(), var17.k5());
            j9e.n5(
               com.aspose.slides.internal.o9b.y1.n5(com.aspose.slides.internal.o9b.y2.l6(var26.y4())).y4(),
               var21,
               var11,
               var13.k5(),
               var13.a6().o8(),
               1,
               var6,
               var9,
               var10
            );
            if (!var8.c8().isPlotOrderReversed()) {
               var18 += var23;
            } else {
               var18 -= var23;
            }
         }

         var12 -= var3 + var17.k5();
      }
   }

   private void n5(n1g var1, boolean var2, List<u5l> var3, float var4, float var5) {
      if (var3 != null && var3.size() != 0) {
         IRotation3D var6 = var1.n3().getRotation3D();
         com.aspose.slides.internal.o9b.f2 var7 = z7d.n5(var1).a6();
         com.aspose.slides.internal.o9b.p8 var8 = var1.s7().u9().u3();
         float var9 = (float)var8.k5() / var3.size();
         int var10 = var1.s7().n5.s7();
         int var11 = var1.s7().n5.x8();
         int var12 = var1.s7().n5.t2();
         com.aspose.slides.internal.o9b.y2 var13 = new com.aspose.slides.internal.o9b.y2(
            var10 - var8.l6(), var11 + var1.s7().c8(), var12 + var8.l6(), var8.k5()
         );
         com.aspose.slides.internal.o9b.n3 var14 = var1.s7().k5();
         int var15 = n1g.u3(var1.y4());
         float var16 = (float)var12 / var15;

         for (int var17 = 0; var17 < var3.size(); var17++) {
            u5l var18 = (u5l)var3.get_Item(var17);
            g3y var19 = var18.u3();
            float var20 = var13.c8() + var17 * var9;
            float var21 = 0.0F;
            if (var1.n3().getChartDataTable().getShowLegendKey()) {
               com.aspose.slides.internal.o9b.y1 var22 = new com.aspose.slides.internal.o9b.y1(var13.u3() + 4.0F, var20, var7.l6(), var9);
               if (!var2 && var6.getRightAngleAxes()) {
                  this.n5(var1, var22.y4(), var18, var5);
               } else {
                  z7d.n5(var22.y4(), var18, var1);
               }

               var21 = var7.l6() + 4.0F;
            }

            String var30 = var19.k5();
            com.aspose.slides.internal.o9b.f2 var23 = h6l.l6(var30, var1.s7().u3()).a6();
            com.aspose.slides.internal.o9b.w1 var24 = new com.aspose.slides.internal.o9b.w1(var10 - var8.l6() + var21, var20 + var9 / 2.0F - var23.k5() / 2.0F);
            if (!var2 && var6.getRightAngleAxes()) {
               j9e.n5(new com.aspose.slides.internal.o9b.y1(var24.u3(), var23.a6()), var30, 0, var14, var1.s7().a6().o8(), 2, 2, var1, var5);
            } else {
               h6l.n5(new com.aspose.slides.internal.o9b.y1(var24.u3(), var23.a6()), var30, 0, var14, var1.s7().a6().o8(), 1, 2, var1);
            }

            for (int var25 = 0; var25 < var19.c8().size(); var25++) {
               int var26 = var25;
               if (var1.q0().c8().isPlotOrderReversed()) {
                  var26 = var19.c8().size() - var25 - 1;
               }

               t9z var27 = var19.c8().get_Item(var26);
               if (!var27.c8()) {
                  String var28 = var27.u3();
                  boolean var29 = false;
                  var30 = t7k.n5(var27.n5(), var28, var29);
                  h6l.l6(var30, var1.s7().u3()).l6(var23);
                  var24 = new com.aspose.slides.internal.o9b.w1(
                     var10 + var25 * var16 + var16 / 2.0F - var23.l6() / 2.0F, var20 + var9 / 2.0F - var23.k5() / 2.0F
                  );
                  if (!var2 && var6.getRightAngleAxes()) {
                     j9e.n5(new com.aspose.slides.internal.o9b.y1(var24.u3(), var23.a6()), var30, 0, var14, var1.s7().a6().o8(), 1, 2, var1, var5);
                  } else {
                     h6l.n5(new com.aspose.slides.internal.o9b.y1(var24.u3(), var23.a6()), var30, 0, var14, var1.s7().a6().o8(), 1, 2, var1);
                  }
               }
            }
         }
      }
   }

   private void n5(n1g var1, com.aspose.slides.internal.o9b.y1 var2, u5l var3, float var4) {
      if (var3.l6() == 2) {
         com.aspose.slides.internal.o9b.w1 var5 = new com.aspose.slides.internal.o9b.w1(var2.x8(), var2.n3() + var2.k5() / 2.0F);
         com.aspose.slides.internal.o9b.w1 var6 = new com.aspose.slides.internal.o9b.w1(var2.h0(), var2.n3() + var2.k5() / 2.0F);
         com.aspose.slides.internal.x4g.s7 var7 = new com.aspose.slides.internal.x4g.s7();

         try {
            var7.n5(var5.u3(), var6.u3());
            com.aspose.slides.internal.o9b.c8 var8 = var3.k5().l6().o8();
            LineFormat var9 = (LineFormat)var3.k5().k5().getFormat().getLine();
            FillFormat var10 = (FillFormat)var3.k5().k5().getFormat().getFill();
            j9e.n5(var8.o8(), com.aspose.slides.internal.o9b.c8.u3.o8(), var1, var7, var9, var10, 1.0F, var4);
         } finally {
            if (var7 != null) {
               var7.dispose();
            }
         }
      } else if (var3.l6() == 1) {
         g3y var35 = var3.u3();
         g3y var36 = var3.u3();
         if (ChartTypeCharacterizer.isChartTypeBubble(var35.u9().getType())) {
            float var37 = var1.t2().c8();
            com.aspose.slides.internal.o9b.y1 var41 = new com.aspose.slides.internal.o9b.y1(var2.x8(), var2.n3() + (var2.k5() - var37) / 2.0F, var37, var37);
            com.aspose.slides.internal.x4g.s7 var44 = new com.aspose.slides.internal.x4g.s7();

            try {
               var44.n5(var41.y4());
               var35.n5(var44, var4);
               var35.l6(var44, var4);
            } finally {
               if (var44 != null) {
                  var44.dispose();
               }
            }
         } else if (ChartTypeCharacterizer.a6(var35.u9().getType())) {
            if (var35.u9().getFormat().getLine().getFillFormat().getFillType() != 0 || var35.u9().getFormat().getLine().getFillFormat().getFillType() != -1) {
               com.aspose.slides.internal.x4g.s7 var38 = new com.aspose.slides.internal.x4g.s7();

               try {
                  var38.l6(var2.x8(), var2.n3() + var2.k5() / 2.0F, var2.x8() + var2.s7(), var2.n3() + var2.k5() / 2.0F);
                  var35.l6(var38, var4);
               } finally {
                  if (var38 != null) {
                     var38.dispose();
                  }
               }
            }

            if (var36.u9().getMarker().getSymbol() != 4) {
               float var39 = var2.x8() + var2.s7() / 2.0F;
               float var42 = var2.n3() + var2.k5() / 2.0F;
               float var45;
               if (var36.u9().getMarker().getSize() == 0) {
                  var45 = var2.k5() * 0.5F;
               } else if (var36.u9().getMarker().getSize() <= var2.k5() * 0.5F) {
                  var45 = var36.u9().getMarker().getSize();
               } else {
                  var45 = var2.k5() * 0.5F;
               }

               var36.s7().n5(var39, var42, var45);
            }
         } else if (!ChartTypeCharacterizer.isChartTypeStock(var35.u9().getType())) {
            float var40 = var2.s7();
            float var43 = var1.t2().c8();
            com.aspose.slides.internal.o9b.y1 var46 = new com.aspose.slides.internal.o9b.y1(
               var2.x8() - var40 / 2.0F, var2.n3() + var2.k5() / 2.0F - var43 / 2.0F, var40, var43
            );
            com.aspose.slides.internal.x4g.s7 var47 = new com.aspose.slides.internal.x4g.s7();

            try {
               var47.l6(var46.y4());
               var35.n5(var47, var4);
               var35.l6(var47, var4);
            } finally {
               if (var47 != null) {
                  var47.dispose();
               }
            }
         }
      }
   }
}
