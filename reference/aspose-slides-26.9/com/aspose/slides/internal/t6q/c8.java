package com.aspose.slides.internal.t6q;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public final class c8 implements IGenericEnumerable<h0> {
   private final List<h0> n5 = new List<>();

   public final void n5(h0 var1) {
      this.n5.addItem(var1);
   }

   public final h0[] n5() {
      return this.n5.toArray(new h0[0]);
   }

   public final h0 n5(String var1) {
      List$Enumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            h0 var3 = (h0)var2.next();
            if (d1.u3(var3.u3(), var1, (short)5)) {
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
   public final IGenericEnumerator<h0> iterator() {
      return this.n5.iterator();
   }
}
