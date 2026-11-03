package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.IDisposable;

final class d2n extends m4<ChartPortionFormat, d2n> implements r3n {
   boolean u6;
   private Chart t1;
   private r0g a5;
   private static final d2n h2 = t2();

   d2n(ChartPortionFormat var1) {
      super(var1);
      this.u6 = false;
   }

   d2n(ChartPortionFormat var1, d2n var2) {
      super(var1);
      // Original descriptor is n5(i7b): copy state, not n5(m4): compare state.
      super.n5((i7b)var2);
      this.u6 = var2.u6;
   }

   d2n() {
      this.u6 = false;
   }

   static d2n n5(ChartPortionFormat var0) {
      IPresentationComponent var1 = var0.getParent_IPresentationComponent();
      if (var1 == null) {
         return h2;
      }

      if (!com.aspose.slides.internal.v6g.k5.l6(var1, IChartComponent.class)) {
         throw new NotImplementedException();
      }

      IChartComponent var2 = com.aspose.slides.internal.v6g.k5.n5(var1, IChartComponent.class);
      if (ChartTypeCharacterizer.u3(((Chart)var2.getChart()).getChartData().getSeries().get_Item(0).getType()) && ((Chart)var2.getChart()).t9().k5()) {
         Chart var3 = (Chart)var2.getChart();
         if (com.aspose.slides.internal.v6g.k5.l6(var2, ChartTitle.class)) {
            if (var2.getChart().getChartTitle() == var2) {
               return ((ChartPortionFormat)var3.t9().y1().k5().getPortionFormat()).t4();
            }

            return ((ChartPortionFormat)var3.t9().a6().k5().getPortionFormat()).t4();
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var1, LegendEntryProperties.class)) {
            return ((ChartPortionFormat)((Legend)var2.getChart().getLegend()).getTextFormat().getPortionFormat()).t4();
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var2, Legend.class)) {
            return ((ChartPortionFormat)var3.t9().j5().k5().getPortionFormat()).t4();
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var2, DataTable.class)) {
            return ((ChartPortionFormat)var3.t9().t9().k5().getPortionFormat()).t4();
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var2, Trendline.class)) {
            return ((ChartPortionFormat)var3.t9().d2().k5().getPortionFormat()).t4();
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var1, DataLabel.class) || com.aspose.slides.internal.v6g.k5.l6(var1, DataLabelFormat.class)) {
            return ((ChartPortionFormat)var3.t9().t2().k5().getPortionFormat()).t4();
         }
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var2, Axis.class)) {
         return n5(var2);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var2, Legend.class)
         || com.aspose.slides.internal.v6g.k5.l6(var2, DataTable.class)
         || com.aspose.slides.internal.v6g.k5.l6(var2, ChartTitle.class)
         || com.aspose.slides.internal.v6g.k5.l6(var2, Trendline.class)) {
         return ((ChartPortionFormat)((Chart)var2.getChart()).getTextFormat().getPortionFormat()).t4();
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var1, LegendEntryProperties.class)) {
         return ((ChartPortionFormat)((Legend)var2.getChart().getLegend()).getTextFormat().getPortionFormat()).t4();
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var2, p9w.class)) {
         return ((ChartPortionFormat)((p9w)var2).u3().getTextFormat().getPortionFormat()).t4();
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var2, DataLabelFormat.class)) {
         DataLabelFormat var4 = com.aspose.slides.internal.v6g.k5.n5(var2, DataLabelFormat.class);
         if (com.aspose.slides.internal.v6g.k5.l6(var4.c8(), DataLabelCollection.class)) {
            return ((ChartPortionFormat)((Chart)var4.c8().getChart()).getTextFormat().getPortionFormat()).t4();
         } else if (com.aspose.slides.internal.v6g.k5.l6(var4.c8(), DataLabel.class)) {
            return ((ChartPortionFormat)((DataLabelFormat)((DataLabel)var4.c8()).c8().getLabels().getDefaultDataLabelFormat())
                  .getTextFormat()
                  .getPortionFormat())
               .t4();
         } else {
            throw new NotImplementedException();
         }
      } else if (com.aspose.slides.internal.v6g.k5.l6(var2, Chart.class)) {
         return h2;
      } else {
         throw new NotImplementedException();
      }
   }

   private static d2n n5(IChartComponent var0) {
      Chart var1 = (Chart)var0.getChart();
      boolean var2 = ((Chart)var0.getChart()).t9().k5();
      ChartPortionFormat var3 = null;
      if (var0.getChart().getTextFormat() != null) {
         var3 = (ChartPortionFormat)((Chart)var0.getChart()).getTextFormat().getPortionFormat();
      }

      if (var2) {
         d2n var4 = null;
         switch (ChartTypeCharacterizer.n5(var0.getChart().getChartData().getSeries().get_Item(0).getType())) {
            case 1:
               var4 = ((ChartPortionFormat)var1.t9().h0().k5().getPortionFormat()).t4();
               break;
            case 2:
            case 7:
            case 8:
               if (var0 != var0.getChart().getAxes().getHorizontalAxis() && var0 != var0.getChart().getAxes().getSecondaryHorizontalAxis()) {
                  var4 = ((ChartPortionFormat)var1.t9().s3().k5().getPortionFormat()).t4();
                  break;
               }

               var4 = ((ChartPortionFormat)var1.t9().h0().k5().getPortionFormat()).t4();
               break;
            case 3:
               var4 = ((ChartPortionFormat)var1.t9().s3().k5().getPortionFormat()).t4();
               break;
            case 4:
               if (var0 != var0.getChart().getAxes().getHorizontalAxis() && var0 != var0.getChart().getAxes().getSecondaryHorizontalAxis()) {
                  var4 = ((ChartPortionFormat)var1.t9().h0().k5().getPortionFormat()).t4();
                  break;
               }

               var4 = ((ChartPortionFormat)var1.t9().s3().k5().getPortionFormat()).t4();
               break;
            case 5:
               var4 = ((ChartPortionFormat)var1.t9().s3().k5().getPortionFormat()).t4();
            case 6:
         }

         if (var4 != null) {
            if (var3 != null) {
               var4.l6(var3);
            }

            return var4;
         }
      }

      if (var3 == null) {
         throw new ArgumentException("Chart Portion Format cannot be null.");
      } else {
         return var3.t4();
      }
   }

   private static d2n t2() {
      d2n var0 = new d2n();
      var0.u3 = f6a.t9();
      var0.t2 = f6a.t9();
      var0.k7 = 10.0F;
      var0.d2 = 8.0F;
      return var0;
   }

   void n5(i7b var1, ChartPortionFormat var2) {
      super.n5(var1);
      d2n var3 = (d2n)var1;
      this.u6 = var3.u6;
      this.l6(var2);
      if (var2.z1() != null) {
         ITextFrame var4 = null;
         if (com.aspose.slides.internal.v6g.k5.l6(var2.z1(), ChartTitle.class)) {
            if (com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.v6g.k5.n5(var2.z1(), ChartTitle.class).getChart(), Chart.class).t9().k5()) {
               this.u6 = true;
            }

            if (com.aspose.slides.internal.v6g.k5.l6(com.aspose.slides.internal.v6g.k5.n5(var2.z1(), r0g.class).getParent_Immediate(), Chart.class)) {
               if (this.e5) {
                  this.k7 = 18.0F;
               } else if (!this.u6) {
                  float var5 = this.k7 * 1.2F;
                  if (!com.aspose.slides.ms.System.j8.n5(var5, Float.NaN)) {
                     this.k7 = var5;
                  }

                  this.u6 = true;
                  this.e5 = false;
               }
            }

            if (ChartTypeCharacterizer.u3(
               com.aspose.slides.internal.v6g.k5.n5(var2.z1(), ChartTitle.class).getChart().getChartData().getSeries().get_Item(0).getType()
            )) {
               this.b3 = false;
            }

            if (this.b3) {
               this.s7 = 1;
            }

            var4 = com.aspose.slides.internal.v6g.k5.n5(var2.z1(), ChartTitle.class).getTextFrameForOverriding();
         } else if (com.aspose.slides.internal.v6g.k5.l6(var2.z1(), Trendline.class)) {
            var4 = com.aspose.slides.internal.v6g.k5.n5(var2.z1(), Trendline.class).getTextFrameForOverriding();
         } else if (com.aspose.slides.internal.v6g.k5.l6(var2.z1(), DataLabelFormat.class)
            && com.aspose.slides.internal.v6g.k5.l6(((DataLabelFormat)var2.z1()).getParent_Immediate(), DataLabel.class)) {
            var4 = com.aspose.slides.internal.v6g.k5.n5(((DataLabelFormat)var2.z1()).getParent_Immediate(), DataLabel.class).getTextFrameForOverriding();
         } else if (com.aspose.slides.internal.v6g.k5.l6(var2.z1(), p9w.class)) {
            var4 = ((p9w)var2.z1()).getTextFrameForOverriding();
         }

         if (var4 != null && var4.getParagraphs().getCount() != 0) {
            float var16 = Float.NaN;
            IFontData var6 = null;
            byte var7 = -1;
            IFillFormat var8 = null;
            byte var9 = -1;
            IGenericEnumerator var10 = var4.getParagraphs().iterator();

            try {
               while (var10.hasNext()) {
                  IParagraph var11 = (IParagraph)var10.next();
                  IPortionFormat var12 = var11.getParagraphFormat().getDefaultPortionFormat();
                  var16 = com.aspose.slides.ms.System.n1.k5(var16) ? var12.getFontHeight() : var16;
                  var6 = var6 == null ? var12.getLatinFont() : var6;
                  var7 = var7 == -1 ? var12.getFontBold() : var7;
                  var8 = var8 == null ? var12.getFillFormat() : var8;
                  var9 = var9 == -1 ? var12.getFontItalic() : var9;
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
                  var10.dispose();
               }
            }

            if (!com.aspose.slides.ms.System.n1.k5(var16)) {
               this.k7 = var16;
               this.e5 = false;
            }

            if (var6 != null) {
               this.m3 = (FontData)var6;
               this.i1 = false;
            }

            if (var7 != -1) {
               this.s7 = var7;
               this.b3 = false;
            }

            if (var9 != -1) {
               this.x8 = var9;
            }

            if (var8 != null && var8.getFillType() != -1) {
               this.u3.n5((FillFormat)var8);
            }
         }
      }
   }

   final void l6(ChartPortionFormat var1) {
      if (!var1.q0()) {
         super.n5(var1);
         if (com.aspose.slides.internal.v6g.k5.l6(var1.z1(), ChartTitle.class) && !com.aspose.slides.ms.System.n1.k5(var1.getFontHeight())) {
            this.u6 = true;
         }
      }
   }

   static boolean k5(ChartPortionFormat var0) {
      if (var0.z1() != null) {
         ITextFrame var1 = null;
         if (com.aspose.slides.internal.v6g.k5.l6(var0.z1(), ChartTitle.class)) {
            boolean var2 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.v6g.k5.n5(var0.z1(), ChartTitle.class).getChart(), Chart.class)
               .t9()
               .k5();
            if (com.aspose.slides.internal.v6g.k5.l6(com.aspose.slides.internal.v6g.k5.n5(var0.z1(), r0g.class).getParent_Immediate(), Chart.class) && !var2) {
               return true;
            }

            var1 = com.aspose.slides.internal.v6g.k5.n5(var0.z1(), ChartTitle.class).getTextFrameForOverriding();
         } else if (com.aspose.slides.internal.v6g.k5.l6(var0.z1(), Trendline.class)) {
            var1 = com.aspose.slides.internal.v6g.k5.n5(var0.z1(), Trendline.class).getTextFrameForOverriding();
         } else if (com.aspose.slides.internal.v6g.k5.l6(var0.z1(), DataLabelFormat.class)
            && com.aspose.slides.internal.v6g.k5.l6(((DataLabelFormat)var0.z1()).getParent_Immediate(), DataLabel.class)) {
            var1 = com.aspose.slides.internal.v6g.k5.n5(((DataLabelFormat)var0.z1()).getParent_Immediate(), DataLabel.class).getTextFrameForOverriding();
         } else if (com.aspose.slides.internal.v6g.k5.l6(var0.z1(), p9w.class)) {
            var1 = ((p9w)var0.z1()).getTextFrameForOverriding();
         }

         if (var1 != null && var1.getParagraphs().getCount() > 0) {
            IGenericEnumerator var8 = var1.getParagraphs().iterator();

            try {
               while (var8.hasNext()) {
                  IParagraph var3 = (IParagraph)var8.next();
                  if (n5(var3.getParagraphFormat().getDefaultPortionFormat())) {
                     return true;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
                  var8.dispose();
               }
            }
         }
      }

      return false;
   }

   @Override
   void n5(IBaseSlide var1) {
      IFontData var2 = null;
      if (var1 != null) {
         this.a5 = this.W_();
         Chart[] var3 = new Chart[]{this.t1};
         d0u.n5(Chart.class, this.a5, var3);
         this.t1 = var3[0];
         IThemeEffectiveData var4 = this.t1.createThemeEffective();
         IFontSchemeEffectiveData var5 = var4.getFontScheme();
         if (this.i1) {
            var2 = var5.getMinor().getLatinFont();
         } else {
            var2 = n5(this.m3, var5);
         }
      }

      this.n5(var1, var2);
   }

   boolean n5(d2n var1) {
      return com.aspose.slides.ms.System.j8.l6(this, var1) ? true : super.n5(var1);
   }

   static d2n u3(ChartPortionFormat var0) {
      return var0.z1() != null && com.aspose.slides.internal.v6g.k5.l6(var0.z1(), ChartTitle.class) ? null : n5(d2n.class, var0, new d2n$1());
   }

   static IFontData n5(IFontData var0, IFontSchemeEffectiveData var1) {
      String var2 = var0.getFontName();
      if (var2.charAt(0) == '+') {
         if (com.aspose.slides.ms.System.d1.l6(var2, "+mn")) {
            return var1.getMinor().getLatinFont();
         }

         if (com.aspose.slides.ms.System.d1.l6(var2, "+mj")) {
            return var1.getMajor().getLatinFont();
         }
      }

      return var0;
   }

   private static d2n l6(ChartPortionFormat var0, d2n var1) {
      return new d2n(var0, var1);
   }

   private static boolean n5(IPortionFormat var0) {
      if (var0 == null) {
         throw new ArgumentNullException("portionFormat");
      } else if (!com.aspose.slides.ms.System.n1.k5(var0.getFontHeight())) {
         return true;
      } else if (var0.getLatinFont() != null) {
         return true;
      } else if (var0.getFontBold() != -1) {
         return true;
      } else {
         return var0.getFillFormat().getFillType() != -1 ? true : var0.getFontItalic() != -1;
      }
   }

   // $VF: synthetic method
   static d2n n5(ChartPortionFormat var0, d2n var1) {
      return l6(var0, var1);
   }

   @Override
   boolean n5(g8 recoveredArg) {
      return this.n5((com.aspose.slides.d2n)recoveredArg);
   }
}
