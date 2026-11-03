package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.IDisposable;

public final class DataLabelFormat extends PVIObject implements IDataLabelFormat {
   private boolean n5;
   private IChartSeries l6;
   private DataLabelCollection k5;
   private Format u3;
   private ChartTextFormat a6;

   DataLabelFormat(r0g parentImmediate) {
      super(parentImmediate);
      if (com.aspose.slides.internal.v6g.k5.l6(parentImmediate, DataLabelCollection.class)) {
         this.l6 = ((DataLabelCollection)parentImmediate).getParentSeries();
      } else {
         if (!com.aspose.slides.internal.v6g.k5.l6(parentImmediate, DataLabel.class)) {
            throw new NotImplementedException("Unknown parent type for DataLabelFormat.");
         }

         this.l6 = ((DataLabel)parentImmediate).c8();
      }

      this.k5 = com.aspose.slides.internal.v6g.k5.n5(parentImmediate, DataLabelCollection.class);
   }

   @Override
   void N_() {
      this.u3 = new Format(this);
      this.a6 = new ChartTextFormat(this);
   }

   @Override
   Object M_() {
      return new m9a(this.getParent_Immediate(), this.u3, this.a6);
   }

   final m9a l6() {
      return (m9a)this.m1();
   }

   @Override
   public long getVersion() {
      return !this.z3() ? 1L : this.l6().t9();
   }

   @Override
   public final boolean isNumberFormatLinkedToSource() {
      return this.z3() ? this.l6().n5() : true;
   }

   @Override
   public final void setNumberFormatLinkedToSource(boolean value) {
      this.n5(Boolean.valueOf(true), value);
      if (this.z3()) {
         this.l6().n5(value);
      }

      if (this.k5 != null) {
         IGenericEnumerator var2 = this.k5.iterator();

         try {
            while (var2.hasNext()) {
               IDataLabel var3 = (IDataLabel)var2.next();
               var3.getDataLabelFormat().setNumberFormatLinkedToSource(value);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }
   }

   @Override
   public final String getNumberFormat() {
      return this.z3() ? this.l6().l6() : "";
   }

   @Override
   public final void setNumberFormat(String value) {
      this.n5("", value);
      if (this.z3()) {
         this.l6().n5(value);
      }

      this.n5(false);
      if (this.k5 != null) {
         IGenericEnumerator var2 = this.k5.iterator();

         try {
            while (var2.hasNext()) {
               IDataLabel var3 = (IDataLabel)var2.next();
               var3.getDataLabelFormat().setNumberFormat(value);
               ((DataLabelFormat)var3.getDataLabelFormat()).n5(true);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }
   }

   final boolean u3() {
      return this.n5;
   }

   final void n5(boolean var1) {
      this.n5 = var1;
   }

   @Override
   public final IFormat getFormat() {
      this.m3();
      return this.u3;
   }

   @Override
   public final int getPosition() {
      return this.z3() ? this.l6().k5() : -1;
   }

   @Override
   public final void setPosition(int value) {
      String var2 = DataLabel.n5(this.l6, value);
      if ("".equals(var2)) {
         this.n5(-1, value);
         if (this.z3()) {
            this.l6().n5(value);
         }

         if (this.k5 != null) {
            IGenericEnumerator var3 = this.k5.iterator();

            try {
               while (var3.hasNext()) {
                  IDataLabel var4 = (IDataLabel)var3.next();
                  var4.getDataLabelFormat().setPosition(value);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
                  var3.dispose();
               }
            }
         }
      } else {
         throw new InvalidOperationException(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong label position for this type of series. Possible values: ", var2}));
      }
   }

   final int a6() {
      return this.z3() ? this.l6().k5() : -1;
   }

   final void n5(int var1) {
      String var2 = DataLabel.n5(this.l6, var1);
      if ("".equals(var2)) {
         this.n5(-1, var1);
         if (this.z3()) {
            this.l6().n5(var1);
         }

         if (this.k5 != null) {
            IGenericEnumerator var3 = this.k5.iterator();

            try {
               while (var3.hasNext()) {
                  IDataLabel var4 = (IDataLabel)var3.next();
                  var4.getDataLabelFormat().setPosition(var1);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
                  var3.dispose();
               }
            }
         }
      }
   }

   @Override
   public final boolean getShowLegendKey() {
      return this.z3() ? this.l6().u3() : false;
   }

   @Override
   public final void setShowLegendKey(boolean value) {
      this.n5(Boolean.valueOf(false), value);
      if (this.z3()) {
         this.l6().l6(value);
      }

      if (this.k5 != null) {
         IGenericEnumerator var2 = this.k5.iterator();

         try {
            while (var2.hasNext()) {
               IDataLabel var3 = (IDataLabel)var2.next();
               var3.getDataLabelFormat().setShowLegendKey(value);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }
   }

   @Override
   public final boolean getShowValue() {
      return this.z3() ? this.l6().a6() : false;
   }

   @Override
   public final void setShowValue(boolean value) {
      this.n5(Boolean.valueOf(false), value);
      if (this.z3()) {
         this.l6().k5(value);
      }

      if (this.k5 != null) {
         IGenericEnumerator var2 = this.k5.iterator();

         try {
            while (var2.hasNext()) {
               IDataLabel var3 = (IDataLabel)var2.next();
               var3.getDataLabelFormat().setShowValue(value);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }

         if (ChartTypeCharacterizer.e2(this.k5.getParentSeries().getType()) && ((ChartSeries)this.k5.getParentSeries()).s7() != null) {
            IGenericEnumerator var12 = ((ChartSeries)this.k5.getParentSeries()).s7().iterator();

            try {
               while (var12.hasNext()) {
                  a0 var4 = (a0)var12.next();
                  var4.h0().getDataLabelFormat().setShowValue(value);
                  var4.a6().getDataLabelFormat().setShowValue(value);
                  var4.n5().getDataLabelFormat().setShowValue(value);
                  var4.k5().getDataLabelFormat().setShowValue(value);
                  var4.n5().getDataLabelFormat().setShowValue(value);
                  var4.l6().getDataLabelFormat().setShowValue(value);
                  var4.u3().getDataLabelFormat().setShowValue(value);
                  var4.u9().getDataLabelFormat().setShowValue(value);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
                  var12.dispose();
               }
            }
         }
      }
   }

   @Override
   public final boolean getShowCategoryName() {
      return this.z3() ? this.l6().u9() : false;
   }

   @Override
   public final void setShowCategoryName(boolean value) {
      this.n5(Boolean.valueOf(false), value);
      if (this.z3()) {
         this.l6().u3(value);
      }

      if (this.k5 != null) {
         IGenericEnumerator var2 = this.k5.iterator();

         try {
            while (var2.hasNext()) {
               IDataLabel var3 = (IDataLabel)var2.next();
               var3.getDataLabelFormat().setShowCategoryName(value);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }

         if (ChartTypeCharacterizer.e2(this.k5.getParentSeries().getType()) && ((ChartSeries)this.k5.getParentSeries()).s7() != null) {
            IGenericEnumerator var12 = ((ChartSeries)this.k5.getParentSeries()).s7().iterator();

            try {
               while (var12.hasNext()) {
                  a0 var4 = (a0)var12.next();
                  var4.h0().getDataLabelFormat().setShowCategoryName(value);
                  var4.a6().getDataLabelFormat().setShowCategoryName(value);
                  var4.n5().getDataLabelFormat().setShowCategoryName(value);
                  var4.k5().getDataLabelFormat().setShowCategoryName(value);
                  var4.n5().getDataLabelFormat().setShowCategoryName(value);
                  var4.l6().getDataLabelFormat().setShowCategoryName(value);
                  var4.u3().getDataLabelFormat().setShowCategoryName(value);
                  var4.u9().getDataLabelFormat().setShowCategoryName(value);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
                  var12.dispose();
               }
            }
         }
      }
   }

   @Override
   public final boolean getShowSeriesName() {
      return this.z3() ? this.l6().h0() : false;
   }

   @Override
   public final void setShowSeriesName(boolean value) {
      this.n5(Boolean.valueOf(false), value);
      if (this.z3()) {
         this.l6().a6(value);
      }

      if (this.k5 != null) {
         IGenericEnumerator var2 = this.k5.iterator();

         try {
            while (var2.hasNext()) {
               IDataLabel var3 = (IDataLabel)var2.next();
               var3.getDataLabelFormat().setShowSeriesName(value);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }

         if (ChartTypeCharacterizer.e2(this.k5.getParentSeries().getType()) && ((ChartSeries)this.k5.getParentSeries()).s7() != null) {
            IGenericEnumerator var12 = ((ChartSeries)this.k5.getParentSeries()).s7().iterator();

            try {
               while (var12.hasNext()) {
                  a0 var4 = (a0)var12.next();
                  var4.h0().getDataLabelFormat().setShowSeriesName(value);
                  var4.a6().getDataLabelFormat().setShowSeriesName(value);
                  var4.n5().getDataLabelFormat().setShowSeriesName(value);
                  var4.k5().getDataLabelFormat().setShowSeriesName(value);
                  var4.n5().getDataLabelFormat().setShowSeriesName(value);
                  var4.l6().getDataLabelFormat().setShowSeriesName(value);
                  var4.u3().getDataLabelFormat().setShowSeriesName(value);
                  var4.u9().getDataLabelFormat().setShowSeriesName(value);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
                  var12.dispose();
               }
            }
         }
      }
   }

   @Override
   public final boolean getShowPercentage() {
      return this.z3() ? this.l6().c8() : false;
   }

   @Override
   public final void setShowPercentage(boolean value) {
      this.n5(Boolean.valueOf(false), value);
      if (this.z3()) {
         this.l6().u9(value);
      }

      if (this.k5 != null) {
         IGenericEnumerator var2 = this.k5.iterator();

         try {
            while (var2.hasNext()) {
               IDataLabel var3 = (IDataLabel)var2.next();
               var3.getDataLabelFormat().setShowPercentage(value);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }
   }

   @Override
   public final boolean getShowBubbleSize() {
      return this.z3() ? this.l6().t2() : false;
   }

   @Override
   public final void setShowBubbleSize(boolean value) {
      this.n5(Boolean.valueOf(false), value);
      if (this.z3()) {
         this.l6().h0(value);
      }

      if (this.k5 != null) {
         IGenericEnumerator var2 = this.k5.iterator();

         try {
            while (var2.hasNext()) {
               IDataLabel var3 = (IDataLabel)var2.next();
               var3.getDataLabelFormat().setShowBubbleSize(value);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }
   }

   @Override
   public final boolean getShowLeaderLines() {
      return this.z3() ? this.l6().s7() : false;
   }

   @Override
   public final void setShowLeaderLines(boolean value) {
      this.n5(Boolean.valueOf(false), value);
      if (this.z3()) {
         this.l6().c8(value);
      }

      if (this.k5 != null) {
         IGenericEnumerator var2 = this.k5.iterator();

         try {
            while (var2.hasNext()) {
               IDataLabel var3 = (IDataLabel)var2.next();
               var3.getDataLabelFormat().setShowLeaderLines(value);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }
   }

   @Override
   public final boolean getShowLabelValueFromCell() {
      return this.z3() ? this.l6().y4() : false;
   }

   @Override
   public final void setShowLabelValueFromCell(boolean value) {
      this.n5(Boolean.valueOf(false), value);
      if (this.z3()) {
         this.l6().s7(value);
      }

      if (this.k5 != null) {
         IGenericEnumerator var2 = this.k5.iterator();

         try {
            while (var2.hasNext()) {
               IDataLabel var3 = (IDataLabel)var2.next();
               var3.getDataLabelFormat().setShowLabelValueFromCell(value);
               this.n5(value, var3);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      } else {
         this.n5(value, com.aspose.slides.internal.v6g.k5.n5(this.c8(), DataLabel.class));
      }
   }

   private void n5(boolean var1, IDataLabel var2) {
      IPortion var3 = this.n5(var2.getTextFrameForOverriding());
      if (var3 != null) {
         if (!var1) {
            var2.getTextFrameForOverriding().getParagraphs().get_Item(0).getPortions().remove(var3);
         } else {
            var3.setText("[CELLRANGE]");
         }
      }
   }

   private IPortion n5(ITextFrame var1) {
      if (var1.getParagraphs().getCount() == 0) {
         return null;
      }

      IGenericEnumerator var2 = var1.getParagraphs().get_Item(0).getPortions().iterator();

      try {
         while (var2.hasNext()) {
            IPortion var3 = (IPortion)var2.next();
            if (var3.getField() != null && "CELLRANGE".equals(var3.getField().getType().getInternalString())) {
               return var3;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return null;
   }

   @Override
   public final boolean getShowLabelAsDataCallout() {
      return this.z3() ? this.l6().n3() : false;
   }

   @Override
   public final void setShowLabelAsDataCallout(boolean value) {
      this.n5(Boolean.valueOf(false), value);
      if (this.z3()) {
         this.l6().t2(value);
      }

      if (this.k5 != null) {
         IGenericEnumerator var2 = this.k5.iterator();

         try {
            while (var2.hasNext()) {
               IDataLabel var3 = (IDataLabel)var2.next();
               var3.getDataLabelFormat().setShowLabelAsDataCallout(value);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }
   }

   @Override
   public final String getSeparator() {
      return this.z3() ? this.l6().x8() : "";
   }

   @Override
   public final void setSeparator(String value) {
      this.n5("", value);
      if (this.z3()) {
         this.l6().l6(value);
      }

      if (this.k5 != null) {
         IGenericEnumerator var2 = this.k5.iterator();

         try {
            while (var2.hasNext()) {
               IDataLabel var3 = (IDataLabel)var2.next();
               var3.getDataLabelFormat().setSeparator(value);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }
   }

   final void n5(DataLabelFormat var1) {
      if (this.z3() || var1.z3()) {
         this.k7();
         this.l6().n5(var1);
      }
   }

   @Override
   public final IChartTextFormat getTextFormat() {
      this.m3();
      return this.a6;
   }

   final IChartTextFormat u9() {
      return this.a6;
   }

   @Override
   public final IChart getChart() {
      return ((IChartComponent)this.getParent_Immediate()).getChart();
   }

   final boolean h0() {
      return this.z3() ? this.l6().e2() : false;
   }

   final void l6(boolean var1) {
      this.n5(Boolean.valueOf(false), var1);
      if (this.z3()) {
         this.l6().x8(var1);
      }
   }

   final IChartComponent c8() {
      return (IChartComponent)this.getParent_Immediate();
   }
}
