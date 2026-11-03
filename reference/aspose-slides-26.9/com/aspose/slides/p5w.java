package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class p5w implements IGenericEnumerable<w2v> {
   private List<w2v> n5 = new List<>();

   public final w2v n5(k6a var1, int var2) {
      List$Enumerator var3 = this.n5.iterator();

      try {
         while (var3.hasNext()) {
            w2v var4 = (w2v)var3.next();
            if (var4.n5() == var1 && var4.l6() == var2) {
               return var4;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      w2v var9 = new w2v(var1, var2, var1.u3(var2), var1.a6(var2));
      this.n5.addItem(var9);
      return var9;
   }

   @Override
   public final IGenericEnumerator<w2v> iterator() {
      return this.n5.iterator();
   }
}
