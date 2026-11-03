package com.aspose.slides.internal.q9;

import com.aspose.slides.Collections.Generic.IGenericCollection;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.ms.System.IDisposable;

public class n5 implements l6 {
   private List<Object> n5 = new List<>();
   private int l6 = -1;

   public n5(IGenericCollection var1) {
      IGenericEnumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            Object var3 = var2.next();
            this.n5.addItem(var3);
         }
      } finally {
         if (k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   @Override
   public final boolean n5() {
      return this.n5.size() == 0 ? false : this.l6 + 1 < this.n5.size();
   }

   @Override
   public final Object l6() {
      if (this.n5()) {
         return this.n5.get_Item(++this.l6);
      } else {
         throw new InvalidOperationException();
      }
   }
}
