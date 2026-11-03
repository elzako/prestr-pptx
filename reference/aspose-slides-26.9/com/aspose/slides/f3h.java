package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class f3h {
   com.aspose.slides.internal.o9b.w1 n5;
   com.aspose.slides.internal.o9b.w1 l6;
   n2z k5;
   n1g u3;
   private com.aspose.slides.internal.o9b.n3 a6;
   private com.aspose.slides.internal.o9b.c8 u9;
   private float h0;
   private DataLabel c8;
   private com.aspose.slides.internal.o9b.n3 t2;
   private com.aspose.slides.internal.o9b.c8 s7;

   public f3h(DataLabel var1, n1g var2) {
      this.n5 = com.aspose.slides.internal.o9b.w1.n5.u3();
      this.l6 = com.aspose.slides.internal.o9b.w1.n5.u3();
      this.u9 = new com.aspose.slides.internal.o9b.c8();
      this.s7 = new com.aspose.slides.internal.o9b.c8();
      Chart var3 = var2.n3();
      this.c8 = var1;
      this.u3 = var2;
      TextFrame var4 = (TextFrame)var1.getTextFrameForOverriding();
      DataLabelFormat var5 = (DataLabelFormat)var1.c8().getLabels().getDefaultDataLabelFormat();
      DataLabelFormat var6 = (DataLabelFormat)var1.getDataLabelFormat();
      this.a6 = var3.n5(var6.getTextFormat());
      if (((ChartPortionFormat)var6.getTextFormat().getPortionFormat()).q0() && !((ChartPortionFormat)var5.getTextFormat().getPortionFormat()).q0()) {
         this.a6 = var3.n5(var5.getTextFormat());
      }

      if (var4 != null) {
         this.t2 = var3.n5(var6.getTextFormat(), var4);
      }

      float var7 = var5.getTextFormat().getTextBlockFormat().getRotationAngle();
      switch (var5.getTextFormat().getTextBlockFormat().getTextVerticalType()) {
         case 1:
            var7 = com.aspose.slides.ms.System.n1.k5(var7) ? 90.0F : var7 + 90.0F;
            break;
         case 2:
            var7 = com.aspose.slides.ms.System.n1.k5(var7) ? 270.0F : var7 + 270.0F;
      }

      this.h0 = ((TextFrameFormat)var1.getTextFormat().getTextBlockFormat()).getRotationAngle();
      switch (((TextFrameFormat)var1.getTextFormat().getTextBlockFormat()).getTextVerticalType()) {
         case 1:
            this.h0 = com.aspose.slides.ms.System.n1.k5(this.h0) ? 90.0F : this.h0 + 90.0F;
            break;
         case 2:
            this.h0 = com.aspose.slides.ms.System.n1.k5(this.h0) ? 270.0F : this.h0 + 270.0F;
      }

      if (com.aspose.slides.ms.System.n1.k5(this.h0) && var4 != null) {
         this.h0 = ((TextFrameFormat)var4.getTextFrameFormat()).getRotationAngle();
         switch (((TextFrameFormat)var4.getTextFrameFormat()).getTextVerticalType()) {
            case 1:
               this.h0 = com.aspose.slides.ms.System.n1.k5(this.h0) ? 90.0F : this.h0 + 90.0F;
               break;
            case 2:
               this.h0 = com.aspose.slides.ms.System.n1.k5(this.h0) ? 270.0F : this.h0 + 270.0F;
         }
      }

      if (com.aspose.slides.ms.System.n1.k5(this.h0) && !com.aspose.slides.ms.System.n1.k5(var7)) {
         this.h0 = var7;
      }

      this.h0 = com.aspose.slides.ms.System.n1.k5(this.h0) ? 0.0F : this.h0 * -1.0F;
      var3.n5((byte)(var3.getStyle() + 1 > 40 ? 1 : 0)).n5(this.u9);
      if ((var1.c8().getType() == 80 || var1.c8().getType() == 75 || var1.c8().getType() == 76)
         && (
            var1.getDataLabelFormat().getPosition() == 2
               || var1.getDataLabelFormat().getPosition() == 3
               || var1.getDataLabelFormat().getPosition() == 4
               || var1.getDataLabelFormat().getPosition() == -1
         )) {
         com.aspose.slides.internal.o9b.c8 var8 = new com.aspose.slides.internal.o9b.c8();
         if (com.aspose.slides.internal.v6g.k5.l6(com.aspose.slides.internal.v6g.k5.n5(var1, r0g.class).getParent_Immediate(), ChartDataPointLevel.class)) {
            ChartDataPointLevel var9 = com.aspose.slides.internal.v6g.k5.n5(
               com.aspose.slides.internal.v6g.k5.n5(var1, r0g.class).getParent_Immediate(), ChartDataPointLevel.class
            );
            ((ColorFormat)var9.k5().getSolidFillColor()).u3().n5(var8);
         } else {
            ChartDataPoint var11 = com.aspose.slides.internal.v6g.k5.n5(
               com.aspose.slides.internal.v6g.k5.n5(var1, r0g.class).getParent_Immediate(), ChartDataPoint.class
            );
            if (var11 != null) {
               if (var11.getFormat().getFill().getFillType() == 1) {
                  ((ColorFormat)var11.getFormat().getFill().getSolidFillColor()).u3().n5(var8);
               } else {
                  var11.a6().n5(var8);
               }
            } else {
               a0 var10 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.v6g.k5.n5(var1, r0g.class).getParent_Immediate(), a0.class);
               var10.s7().k5().c8().n5(var8);
            }
         }

         float var12 = ((var8.x8() & 255) * 299 + (var8.n3() & 255) * 587 + (var8.y4() & 255) * 114) / 1000.0F;
         if (var12 < 190.0F) {
            var3.n5((byte)1).n5(this.u9);
         }

         if (((DataLabelFormat)var1.getDataLabelFormat()).getTextFormat().getPortionFormat().getFillFormat().getFillType() != -1) {
            var3.n5(((DataLabelFormat)var1.getDataLabelFormat()).getTextFormat(), this.u9.o8()).n5(this.u9);
         }
      } else if (var3.getType() == 74) {
         var3.n5((byte)1).n5(this.u9);
         if (((DataLabelFormat)var1.getDataLabelFormat()).getTextFormat().getPortionFormat().getFillFormat().getFillType() != -1) {
            var3.n5(((DataLabelFormat)var1.getDataLabelFormat()).getTextFormat(), this.u9.o8()).n5(this.u9);
         }
      } else {
         var3.n5(((DataLabelFormat)var1.c8().getLabels().getDefaultDataLabelFormat()).getTextFormat(), this.u9.o8()).n5(this.u9);
         var3.n5(((DataLabelFormat)var1.getDataLabelFormat()).getTextFormat(), this.u9.o8()).n5(this.u9);
      }

      this.k5 = new n2z((Format)var1.getDataLabelFormat().getFormat(), var2, var1);
      var3.n5(this.u9.o8(), var1.getTextFrameForOverriding()).n5(this.s7);
   }

   public final n1g n5() {
      return this.u3;
   }

   public final DataLabel l6() {
      return this.c8;
   }

   public final TextFrame k5() {
      ChartData var1 = (ChartData)this.c8.c8().getChart().getChartData();
      boolean var2 = var1.l6().k5() != 2;
      TextFrame var3 = new TextFrame(this.l6());
      TextFrame var4 = (TextFrame)this.c8.getTextFrameForOverriding();
      if (var4 != null && !"".equals(var4.getText())) {
         var3.l6(this.c8.getTextFrameForOverriding());

         for (int var5 = 0; var5 < var3.getParagraphs().getCount(); var5++) {
            for (int var6 = 0; var6 < var3.getParagraphs().get_Item(var5).getPortions().getCount(); var6++) {
               Portion var7 = (Portion)var3.getParagraphs().get_Item(var5).getPortions().get_Item(var6);
               if (var7.getField() != null) {
                  String var8 = var7.getField().getType().getInternalString();
                  if ("SERIESNAME".equals(var8)) {
                     var7.setText(var2 ? this.c8.c8().x8() : this.c8.c8().getName().toString());
                  }

                  if ("CATEGORYNAME".equals(var8)) {
                     List var9 = this.c8.c8().getPlotOnSecondAxis() ? this.u3.k5() : this.u3.l6();
                     int var10 = this.c8.c8().getLabels().indexOf(this.c8);
                     if (this.c8.c8().getLabels().indexOf(this.c8) < var9.size()) {
                        x4 var11 = (x4)var9.get_Item(var10);
                        var7.setText(var11.l6().toString());
                     } else {
                        var7.setText(com.aspose.slides.ms.System.a3.l6(var10 + 1));
                     }
                  }

                  if ("PERCENTAGE".equals(var8)) {
                     var7.setText(this.c8.u9());
                  }

                  if ("[CELLRANGE]".equals(var7.u9())) {
                     var7.setText(!com.aspose.slides.ms.System.d1.n5(this.c8.n5()) ? this.c8.n5() : "");
                  }

                  if ("[BUBBLE SIZE]".equals(var7.u9())) {
                     String var19 = this.c8.u3();
                     var7.setText(!com.aspose.slides.ms.System.d1.n5(var19) ? var19 : "");
                  }

                  if ("CELLREF".equals(var8) && this.c8.l6().k5() != null) {
                     var7.setText("");
                     Field var20 = (Field)this.c8.getTextFrameForOverriding().getParagraphs().get_Item(var5).getPortions().get_Item(var6).getField();

                     for (com.aspose.slides.internal.k4y.n9a var13 : this.c8.l6().k5().n5()) {
                        com.aspose.slides.ms.System.o0 var14 = new com.aspose.slides.ms.System.o0(var13.n5());
                        if (!com.aspose.slides.ms.System.o0.l6(var14, var20.l6())) {
                           for (com.aspose.slides.internal.k4y.l6j var18 : var13.k5().u3()) {
                              var7.setText(com.aspose.slides.ms.System.d1.n5(new String[]{var7.getText(), var18.l6()}));
                           }
                        }
                     }
                  }

                  if ("VALUE".equals(var8) || "YVALUE".equals(var8)) {
                     var7.setText(this.c8.a6());
                  }
               }
            }
         }
      }

      return var3;
   }

   public final com.aspose.slides.internal.o9b.n3 u3() {
      return this.a6;
   }

   public final com.aspose.slides.internal.o9b.n3 a6() {
      com.aspose.slides.internal.o9b.n3 var1 = this.t2();
      float var2 = var1.c8() * 0.75F / w5k.n5();
      return com.aspose.slides.internal.o9b.n3.n5(var1.l6(), var2, var1.x8());
   }

   public final com.aspose.slides.internal.o9b.c8 u9() {
      return this.u9;
   }

   public final float h0() {
      return this.h0;
   }

   public final int c8() {
      return this.c8.getDataLabelFormat().getPosition() == -1 && !ChartTypeCharacterizer.is3DChart(this.n5().n3().getType())
         ? t7k.n5(this.c8.c8().getType())
         : this.c8.getDataLabelFormat().getPosition();
   }

   final com.aspose.slides.internal.o9b.n3 t2() {
      com.aspose.slides.internal.o9b.n3 var1 = this.t2;
      if (var1 == null) {
         var1 = this.u3();
      }

      return var1;
   }

   final com.aspose.slides.internal.o9b.c8 s7() {
      return this.s7;
   }

   final float x8() {
      return this.t2().a6();
   }

   public final boolean n3() {
      return com.aspose.slides.ms.System.n1.k5(this.l6().getX()) && com.aspose.slides.ms.System.n1.k5(this.l6().getY());
   }

   public final boolean y4() {
      return this.l6().isVisible() || !com.aspose.slides.ms.System.d1.n5(this.k5().getText());
   }

   public final FillFormat e2() {
      IDataLabelFormat var1 = this.c8.getDataLabelFormat();
      IDataLabelFormat var2 = this.c8.c8().getLabels().getDefaultDataLabelFormat();
      return var1.getFormat().getFill().getFillType() == -1 ? (FillFormat)var2.getFormat().getFill() : (FillFormat)var1.getFormat().getFill();
   }

   public final LineFormat t9() {
      IDataLabelFormat var1 = this.c8.getDataLabelFormat();
      IDataLabelFormat var2 = this.c8.c8().getLabels().getDefaultDataLabelFormat();
      return var1.getFormat().getLine().isFormatNotDefined() ? (LineFormat)var2.getFormat().getLine() : (LineFormat)var1.getFormat().getLine();
   }

   public final IEffectFormat z1() {
      IDataLabelFormat var1 = this.c8.getDataLabelFormat();
      IDataLabelFormat var2 = this.c8.c8().getLabels().getDefaultDataLabelFormat();
      return var1.getFormat().getEffect().isNoEffects() ? var2.getFormat().getEffect() : var1.getFormat().getEffect();
   }

   public final boolean t4() {
      byte var1 = this.l6().c8().getLabels().getDefaultDataLabelFormat().getTextFormat().getTextBlockFormat().getWrapText();
      byte var2 = this.l6().getDataLabelFormat().getTextFormat().getTextBlockFormat().getWrapText();
      return var2 == -1 ? var1 != 0 : var2 != 0;
   }
}
