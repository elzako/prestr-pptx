package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;

public class FontSubstRuleCollection implements IFontSubstRuleCollection {
   private final List<IFontSubstRule> n5 = new List<>();

   @Override
   public final int size() {
      return this.n5.size();
   }

   @Override
   public final void add(IFontSubstRule value) {
      this.n5.addItem(value);
   }

   @Override
   public final void remove(IFontSubstRule value) {
      if (this.n5.containsItem(value)) {
         this.n5.removeItem(value);
      }
   }

   @Override
   public final IFontSubstRule get_Item(int index) {
      return this.n5.get_Item(index);
   }

   @Override
   public final IGenericEnumerator<IFontSubstRule> iterator() {
      return this.n5.iterator();
   }

   @Override
   public final IGenericEnumerator<IFontSubstRule> iteratorJava() {
      return this.n5.iteratorJava();
   }

   @Override
   public final void copyTo(com.aspose.slides.ms.System.u3 array, int index) {
      this.n5.copyTo(array, index);
   }

   @Override
   public final boolean isSynchronized() {
      return false;
   }

   @Override
   public final Object getSyncRoot() {
      return this;
   }
}
