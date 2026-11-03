package com.aspose.slides;

import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.SortedList;

final class o9q implements IGenericCollection<h0o> {
   private SortedList<String, h0o> n5 = new SortedList<>();

   @Override
   public final int size() {
      return this.n5.size();
   }

   public final h0o n5(String var1) {
      return this.n5.containsKey(var1) ? this.n5.get_Item(var1) : null;
   }

   public final void n5(String var1, byte[] var2, String var3, String var4, com.aspose.slides.internal.c8m.a2 var5) {
      if (!this.n5.containsKey(var1)) {
         this.n5.addItem(var1, new h0o(var1, var2, var3, var4, var5));
      }
   }

   @Override
   public final void copyTo(com.aspose.slides.ms.System.u3 array, int index) {
      ((ICollection)this.n5.getValues()).copyTo(array, index);
   }

   @Override
   public final boolean isSynchronized() {
      return false;
   }

   @Override
   public final Object getSyncRoot() {
      return this;
   }

   @Override
   public final IGenericEnumerator<h0o> iterator() {
      return this.n5.getValues().iterator();
   }

   @Override
   public final IGenericEnumerator<h0o> iteratorJava() {
      return this.n5.iteratorJavaValues();
   }
}
