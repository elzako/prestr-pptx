package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.IDisposable;

public class Chart extends GraphicalObject implements IChart {
   private ChartWall l6;
   private ChartWall k5;
   private ChartWall u3;
   private int a6 = 1;
   private boolean u9 = false;
   private final ChartTitle h0;
   private boolean e2 = false;
   private DataTable t9;
   private int z1 = 2;
   private Rotation3D t4;
   private boolean q0 = true;
   private Legend z3;
   private boolean m1 = true;
   private ChartData k7;
   private ChartPlotArea m3;
   int n5;
   private ChartTextFormat z8;
   private final AxesManager j5;
   private final ChartThemeManager w1;
   private GroupShape r4;
   private final z1n c4;
   private boolean y2 = true;
   private m0l y1;
   private q2u a0;
   private boolean d2;
   private static final Object[] d5 = new Object[0];
   private int s3;

   Chart(ShapeCollection parentImmediate, int type) {
      super(parentImmediate, new y8m());
      this.t2 = new LineFormat(this);
      this.k7 = new ChartData(this);
      this.j5 = new AxesManager(this);
      this.setType(type);
      this.w1 = new ChartThemeManager(this);
      this.h0 = new ChartTitle(this);
      this.l6 = new ChartWall(this);
      this.k5 = new ChartWall(this);
      this.u3 = new ChartWall(this);
      this.z3 = new Legend(this);
      this.t9 = new DataTable(this);
      this.t4 = new Rotation3D(this);
      this.m3 = new ChartPlotArea(this);
      this.y1 = new m0l();
      this.c4 = new z1n(this);
      this.a0 = new q2u(this);
      this.n5(new l8r(this));
   }

   final l8r n5() {
      return (l8r)super.e5();
   }

   final y8m l6() {
      return (y8m)super.t4();
   }

   final com.aspose.slides.internal.o9b.c8 n5(IChartTextFormat var1, com.aspose.slides.internal.o9b.c8 var2) {
      com.aspose.slides.internal.o9b.c8 var3 = var2.o8();
      d2n var4 = ((ChartPortionFormat)var1.getPortionFormat()).t4();
      if (var4.getFillFormat().getFillType() == 1) {
         if (com.aspose.slides.internal.o9b.c8.l6(((f6a)var4.getFillFormat()).h0(), com.aspose.slides.internal.o9b.c8.u3)) {
            ((f6a)var4.getFillFormat()).h0().n5(var3);
         }
      } else if (var4.getFillFormat().getFillType() == 2) {
         com.aspose.slides.internal.o9b.c8 var5 = n5(var4.getFillFormat().getGradientFormat()).o8();
         if (com.aspose.slides.internal.o9b.c8.l6(var5, com.aspose.slides.internal.o9b.c8.u3)) {
            var5.n5(var3);
         }
      }

      return var3;
   }

   private static com.aspose.slides.internal.o9b.c8 n5(IGradientFormatEffectiveData var0) {
      return var0 != null && var0.getGradientStops().size() != 0
         ? ((GradientStopEffectiveData)var0.getGradientStops().get_Item(0)).n5()
         : com.aspose.slides.internal.o9b.c8.u3;
   }

   final com.aspose.slides.internal.o9b.c8 n5(com.aspose.slides.internal.o9b.c8 var1, ITextFrame var2) {
      if (var2 == null) {
         return var1;
      }

      if (var2.getParagraphs().getCount() <= 0) {
         return var1;
      }

      IParagraph var3 = var2.getParagraphs().get_Item(0);
      IPortionFormat var4 = var3.getParagraphFormat().getDefaultPortionFormat();
      IPortionFormatEffectiveData var5 = var4.getEffective();
      IFillFormatEffectiveData var6 = var4.getFillFormat() != null && var4.getFillFormat().getFillType() != 0 && var4.getFillFormat().getFillType() != -1
         ? var5.getFillFormat()
         : null;
      if (var3.getPortions().getCount() > 0) {
         IPortionFormat var7 = var3.getPortions().get_Item(0).getPortionFormat();
         IPortionFormatEffectiveData var8 = var7.getEffective();
         if (var7.getFillFormat() != null && var7.getFillFormat().getFillType() != 0 && var7.getFillFormat().getFillType() != -1) {
            var6 = var8.getFillFormat();
         }
      }

      if (var6 == null) {
         return var1;
      } else if (var6.getFillType() == 1) {
         return com.aspose.slides.internal.o9b.c8.n5(((f6a)var6).h0(), com.aspose.slides.internal.o9b.c8.u3) ? var1 : ((f6a)var6).h0();
      } else {
         return var1;
      }
   }

   final com.aspose.slides.internal.o9b.n3 n5(IChartTextFormat var1) {
      d2n var2 = ((ChartPortionFormat)var1.getPortionFormat()).t4();
      int var3 = var2.getFontBold() ? 1 : 0;
      if (var2.getFontItalic()) {
         var3 |= 2;
      }

      return this.n5((FontData)var2.getLatinFont(), var2.h0(), var3, var2.getLanguageId());
   }

   final com.aspose.slides.internal.o9b.n3 n5(IChartTextFormat var1, TextFrame var2) {
      if (var1 == null) {
         throw new ArgumentNullException("textFormatOfAutoText");
      }

      if (var2 == null) {
         throw new ArgumentNullException("textFrameForOverriding");
      }

      d2n var3 = ((ChartPortionFormat)var1.getPortionFormat()).t4();
      int var4 = var3.getFontBold() ? 1 : 0;
      if (var3.getFontItalic()) {
         var4 |= 2;
      }

      float var5 = var3.h0();
      IFontData var6 = var3.getLatinFont();
      if (var2.getParagraphs().getCount() <= 0) {
         return this.n5((FontData)var6, var5, var4, var3.getLanguageId());
      }

      IParagraph var7 = var2.getParagraphs().get_Item(0);
      IPortionFormat var8 = var7.getParagraphFormat().getDefaultPortionFormat();
      IPortionFormatEffectiveData var9 = var8.getEffective();
      float var10 = var8.getFontHeight();
      IFontData var11 = var8.getLatinFont() == null ? null : var9.getLatinFont();
      byte var12 = var8.getFontBold();
      byte var13 = var8.getFontItalic();
      if (var7.getPortions().getCount() > 0) {
         IPortionFormat var14 = var7.getPortions().get_Item(0).getPortionFormat();
         IPortionFormatEffectiveData var15 = var14.getEffective();
         if (!com.aspose.slides.ms.System.n1.k5(var14.getFontHeight())) {
            var10 = var14.getFontHeight();
         }

         if (var14.getLatinFont() != null) {
            var11 = var15.getLatinFont();
         }

         if (var14.getFontBold() != -1) {
            var12 = var14.getFontBold();
         }

         if (var14.getFontItalic() != -1) {
            var13 = var14.getFontItalic();
         }
      }

      if (!com.aspose.slides.ms.System.n1.k5(var10)) {
         var5 = var10;
      }

      if (var11 != null) {
         var6 = var11;
      }

      if (var12 == 1) {
         var4 |= 1;
      } else if (var12 == 0) {
         var4 &= -2;
      }

      if (var13 == 1) {
         var4 |= 2;
      } else if (var13 == 0) {
         var4 &= -3;
      }

      return this.n5((FontData)var6, var5, var4, var3.getLanguageId());
   }

   @Override
   void s7() {
      super.s7();
      this.n5(((Slide)this.j9()).w1().l6(this.getPlaceholder().getIndex()).p8());
   }

   final boolean k5() {
      return this.n5(this.getType());
   }

   final boolean u3() {
      IGenericEnumerator var1 = this.getChartData().getSeries().iterator();

      try {
         while (var1.hasNext()) {
            IChartSeries var2 = (IChartSeries)var1.next();
            if (!this.n5(var2.getType())) {
               return false;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      return true;
   }

   @Override
   public final void validateChartLayout() {
      if (this.k5()) {
         n1g var1 = new n1g(this, null, null);
         u2w var2 = new u2w(var1);
         var2.u9();
      } else {
         throw new NotSupportedException("Calculation of automatic values and chart layout is not supported for this chart type");
      }
   }

   final boolean n5(int var1) {
      switch (var1) {
         case 0:
         case 1:
         case 2:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 26:
         case 28:
         case 29:
         case 31:
         case 32:
         case 34:
         case 35:
         case 47:
         case 48:
         case 49:
         case 53:
         case 54:
         case 55:
         case 56:
         case 57:
         case 66:
         case 67:
            return true;
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 25:
         case 27:
         case 30:
         case 33:
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 44:
         case 45:
         case 46:
         case 50:
         case 51:
         case 52:
         case 62:
         case 63:
         case 64:
         case 65:
         default:
            return false;
         case 58:
         case 59:
         case 60:
         case 61:
            return true;
         case 68:
         case 69:
            return true;
         case 70:
         case 71:
         case 72:
            return true;
         case 73:
            return this.u3();
         case 74:
         case 75:
            return true;
         case 76:
         case 77:
            return true;
         case 78:
            return true;
         case 79:
            return true;
         case 80:
            return true;
      }
   }

   final com.aspose.slides.internal.o9b.c8[] a6() {
      return k3o.n5(this, this.getStyle() + 1);
   }

   final com.aspose.slides.internal.o9b.c8 n5(byte var1) {
      int var2 = m0l.n5.k5(var1);
      if (var2 == 13) {
         var2 = 1;
      }

      if (var2 == 15) {
         var2 = 3;
      }

      if (this.y4().n5()) {
         var1 = this.y4().n5(var2);
         if (this.getThemeManager().isOverrideThemeEnabled()) {
            IColorScheme var3 = this.getThemeManager().getOverrideTheme().getColorScheme();
            if (var3 != null) {
               return ((ColorFormat)var3.getByColorSchemeIndex(var1)).u3();
            }
         }
      }

      if (com.aspose.slides.internal.v6g.k5.l6(this.getSlide(), MasterSlide.class)) {
         return com.aspose.slides.internal.v6g.k5.n5(this.getSlide(), MasterSlide.class).n5(var2).u3();
      } else if (com.aspose.slides.internal.v6g.k5.l6(this.getSlide(), LayoutSlide.class)) {
         return com.aspose.slides.internal.v6g.k5.n5(
               com.aspose.slides.internal.v6g.k5.n5(this.getSlide(), LayoutSlide.class).getMasterSlide(), MasterSlide.class
            )
            .n5(var2)
            .u3();
      } else {
         return com.aspose.slides.internal.v6g.k5.n5(this.getSlide(), Slide.class).r4() != null
            ? com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.v6g.k5.n5(this.getSlide(), Slide.class).r4(), MasterSlide.class).n5(var2).u3()
            : com.aspose.slides.internal.o9b.c8.u3;
      }
   }

   final int u9() {
      return this.s3;
   }

   final void l6(int var1) {
      this.s3 = var1;
   }

   @Override
   public final boolean getPlotVisibleCellsOnly() {
      return this.m1;
   }

   @Override
   public final void setPlotVisibleCellsOnly(boolean value) {
      this.m1 = value;
   }

   @Override
   public final int getDisplayBlanksAs() {
      return this.z1;
   }

   @Override
   public final void setDisplayBlanksAs(int value) {
      this.z1 = value;
   }

   @Override
   public final IChartData getChartData() {
      return this.k7;
   }

   @Override
   public final boolean hasTitle() {
      return this.u9;
   }

   @Override
   public final void setTitle(boolean value) {
      this.u9 = value;
   }

   @Override
   public final IChartTitle getChartTitle() {
      return this.h0;
   }

   @Override
   public final boolean hasDataTable() {
      return this.e2;
   }

   @Override
   public final void setDataTable(boolean value) {
      this.e2 = value;
   }

   @Override
   public final boolean hasLegend() {
      return this.q0;
   }

   @Override
   public final void setLegend(boolean value) {
      this.q0 = value;
   }

   @Override
   public final ILegend getLegend() {
      return this.z3;
   }

   @Override
   public final IDataTable getChartDataTable() {
      return this.t9;
   }

   @Override
   public final int getStyle() {
      return this.a6;
   }

   @Override
   public final void setStyle(int value) {
      this.a6 = value;
   }

   @Override
   public final int getType() {
      this.x8();
      return this.n5;
   }

   @Override
   public final void setType(int value) {
      if (value == 73) {
         throw new InvalidOperationException("It's meaningless to assign ChartType.SeriesOfMixedTypes value to Chart.Type.");
      }

      this.n5 = value;
      IGenericEnumerator var2 = this.getChartData().getSeries().iterator();

      try {
         while (var2.hasNext()) {
            ChartSeries var3 = (ChartSeries)var2.next();
            var3.setType(value);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      this.j5.k5();
   }

   private int k5(int var1) {
      switch (var1) {
         case 30:
            return 27;
         default:
            return var1;
      }
   }

   final void x8() {
      IChartSeriesCollection var1 = this.getChartData().getSeries();
      boolean var2 = false;
      int var3 = 0;
      int var4 = 0;
      IGenericEnumerator var5 = var1.iterator();

      try {
         while (var5.hasNext()) {
            ChartSeries var6 = (ChartSeries)var5.next();
            int var7 = this.k5(var6.getType());
            if (!var2) {
               var2 = true;
               var3 = var6.getType();
               var4 = var7;
            } else if (var7 != var4) {
               this.n5 = 73;
               return;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      if (var2) {
         this.n5 = var3;
      }
   }

   @Override
   public final IChartPlotArea getPlotArea() {
      return this.m3;
   }

   @Override
   public final IRotation3D getRotation3D() {
      return this.t4;
   }

   @Override
   public final IChartWall getBackWall() {
      return this.l6;
   }

   @Override
   public final IChartWall getSideWall() {
      return this.k5;
   }

   @Override
   public final IChartWall getFloor() {
      return this.u3;
   }

   @Override
   public final IChartTextFormat getTextFormat() {
      if (ChartTypeCharacterizer.u3(this.getType())) {
         return null;
      }

      if (this.z8 == null) {
         this.z8 = new ChartTextFormat(this);
      }

      return this.z8;
   }

   @Override
   public final IThemeEffectiveData createThemeEffective() {
      return this.getThemeManager().createThemeEffective();
   }

   @Override
   public final IOverrideThemeManager getThemeManager() {
      return this.w1;
   }

   final m0l y4() {
      return this.y1;
   }

   @Override
   public final IGroupShape getUserShapes() {
      if (this.r4 == null) {
         this.r4 = new GroupShape(this);
      }

      this.n5().l6();
      return this.r4;
   }

   final GroupShape e2() {
      return this.r4;
   }

   @Override
   public final IAxesManager getAxes() {
      return this.j5;
   }

   final z1n t9() {
      return this.c4;
   }

   @Override
   public final boolean getShowDataLabelsOverMaximum() {
      return this.y2;
   }

   @Override
   public final void setShowDataLabelsOverMaximum(boolean value) {
      this.y2 = value;
   }

   @Override
   public final boolean hasRoundedCorners() {
      return this.d2;
   }

   @Override
   public final void setRoundedCorners(boolean value) {
      this.d2 = value;
   }

   final q2u z1() {
      return this.a0;
   }

   @Override
   public final IChart getChart() {
      return this;
   }

   private com.aspose.slides.internal.o9b.n3 n5(FontData var1, float var2, int var3, String var4) {
      if (var1 == null) {
         throw new ArgumentNullException("fontData");
      }

      com.aspose.slides.internal.o9b.n3 var5 = ((Presentation)this.getPresentation()).t9().n5(var1.getFontName(), var2, var3);
      c4y var6 = ((Presentation)this.getPresentation()).t9().l6(var1.getFontName());
      if (var6 == null && !com.aspose.slides.ms.System.d1.l6(var5.h0(), var1.getFontName())) {
         String[] var7 = b8s.n5(var1.n5(), var1.l6() & 255, var1.k5(), var4);

         for (String var11 : var7) {
            com.aspose.slides.internal.o9b.n3 var12 = ((Presentation)this.getPresentation()).t9().n5(var11, var2, var3);
            if (com.aspose.slides.ms.System.d1.l6(var12.l6().a6(), var11)) {
               return var12;
            }
         }

         return var5;
      } else {
         return var5;
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   y8m t4() {
      return this.l6();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   y8m h0() {
      return this.l6();
   }

}
