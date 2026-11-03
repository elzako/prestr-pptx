package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class d0$n5 implements ICollection {
   private List<d0$k5> n5;
   private int l6;

   public d0$n5(List<d0$k5> var1, int var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public final int size() {
      return this.l6;
   }

   @Override
   public final Object getSyncRoot() {
      return this.n5.getSyncRoot();
   }

   @Override
   public final boolean isSynchronized() {
      return this.n5.isSynchronized();
   }

   @Override
   public final void copyTo(com.aspose.slides.ms.System.u3 array, int arrayIndex) {
      if (array == null) {
         throw new ArgumentNullException("array");
      }

      if (arrayIndex < 0) {
         throw new ArgumentOutOfRangeException("arrayIndex");
      }

      for (int var3 = 0; var3 < this.l6; var3++) {
         array.k5(this.n5.get_Item(var3).l6, arrayIndex++);
      }
   }

   @Override
   public final IEnumerator iterator() {
      return new d0$l6(this.n5, this.l6, 1);
   }
}
