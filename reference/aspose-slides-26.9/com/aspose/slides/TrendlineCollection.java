package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;

public class TrendlineCollection extends DomObject<ChartSeries> implements ITrendlineCollection {
   private final List<ITrendline> n5 = new List<>();

   @Override
   public final ITrendline get_Item(int index) {
      return this.n5.get_Item(index);
   }

   TrendlineCollection(ChartSeries parentImmediate) {
      super(parentImmediate);
   }

   @Override
   public final ITrendline add(int trendlineType) {
      Trendline var2 = new Trendline(this);
      var2.setTrendlineType(trendlineType);
      this.n5.addItem(var2);
      return var2;
   }

   @Override
   public final void remove(ITrendline value) {
      this.n5.removeItem(value);
   }

   @Override
   public final IGenericEnumerator<ITrendline> iterator() {
      return this.n5.iterator();
   }

   public final IGenericEnumerator<ITrendline> iteratorJava() {
      return this.n5.iteratorJava();
   }

   @Override
   public final int getCount() {
      return this.n5.size();
   }
}
