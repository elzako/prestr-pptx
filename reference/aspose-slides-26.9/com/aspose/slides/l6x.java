package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;

final class l6x implements IGenericEnumerable<z6i> {
   private final List<z6i> n5;

   l6x() {
      this.n5 = new List<>();
   }

   l6x(l6x var1) {
      this.n5 = new List<>(var1.n5);
   }

   public final int n5() {
      return this.n5.size();
   }

   public final z6i n5(int var1) {
      return this.n5.get_Item(var1);
   }

   public final void n5(String var1, int var2) {
      this.n5.addItem(new z6i(var1, false, var2));
   }

   public final void l6(String var1, int var2) {
      try {
         this.n5.addItem(new z6i(var1, true, var2));
      } catch (ArgumentException var4) {
         throw new PptException("Can't create Regex-based FontHandlingRule", var4);
      }
   }

   public final void l6() {
      this.n5.clear();
   }

   public final int n5(String var1) {
      for (int var2 = this.n5() - 1; var2 >= 0; var2--) {
         z6i var3 = this.n5(var2);
         if (var3.n5(var1)) {
            return var3.n5();
         }
      }

      return 0;
   }

   @Override
   public final IGenericEnumerator<z6i> iterator() {
      return this.n5.iterator();
   }
}
