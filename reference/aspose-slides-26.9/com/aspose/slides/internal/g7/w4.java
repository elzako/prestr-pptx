package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;

public class w4 implements IGenericEnumerable<Integer> {
   private boolean n5;
   private final Dictionary<Integer, Integer> l6 = new Dictionary<>();

   public final void n5(int var1) {
      this.l6.addItem(var1, var1);
   }

   public final boolean l6(int var1) {
      return this.l6.containsKey(var1);
   }

   public final void n5() {
      this.l6.clear();
   }

   @Override
   public final IGenericEnumerator<Integer> iterator() {
      return this.l6.getKeys().iterator();
   }

   public final void l6() {
      this.n5 = false;
   }

   public final void k5() {
      this.n5 = true;
   }
}
