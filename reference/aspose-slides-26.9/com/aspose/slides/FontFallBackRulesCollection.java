package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

public class FontFallBackRulesCollection implements IFontFallBackRulesCollection {
   private FontFallBackRulesCollection$n5 n5 = null;
   private List<IFontFallBackRule> l6 = new List<>();

   @Override
   public final int size() {
      return this.l6.size();
   }

   @Override
   public final void add(IFontFallBackRule sourceRule) {
      if (sourceRule == null) {
         throw new ArgumentNullException("sourceRule", "The FallBack rule for addition wasn't specified!");
      }

      if (this.l6.containsItem(sourceRule)) {
         throw new ArgumentException("sourceRule", "Same rule can't be added twise!");
      }

      this.l6.addItem(sourceRule);
      if (this.n5 != null) {
         ((FontFallBackRule)sourceRule).n5(this);
         this.n5();
      }
   }

   @Override
   public final void remove(IFontFallBackRule targetRule) {
      if (this.l6.containsItem(targetRule)) {
         ((FontFallBackRule)targetRule).l6(this);
         this.l6.removeItem(targetRule);
         this.n5();
      }
   }

   @Override
   public final IFontFallBackRule get_Item(int index) {
      return this.l6.get_Item(index);
   }

   @Override
   public final IGenericEnumerator<IFontFallBackRule> iterator() {
      return this.l6.iterator();
   }

   @Override
   public final IGenericEnumerator<IFontFallBackRule> iteratorJava() {
      return this.l6.iteratorJava();
   }

   @Override
   public final void copyTo(com.aspose.slides.ms.System.u3 array, int index) {
      this.l6.copyTo(array, index);
   }

   @Override
   public final boolean isSynchronized() {
      return false;
   }

   @Override
   public final Object getSyncRoot() {
      return this;
   }

   final void n5() {
      if (this.n5 != null) {
         this.n5.n5();
      }
   }

   final void n5(FontFallBackRulesCollection$n5 var1) {
      this.n5 = var1;
      if (var1 == null) {
         List$Enumerator var2 = this.l6.iterator();

         try {
            while (var2.hasNext()) {
               FontFallBackRule var3 = (FontFallBackRule)var2.next();
               var3.u3();
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }
   }
}
