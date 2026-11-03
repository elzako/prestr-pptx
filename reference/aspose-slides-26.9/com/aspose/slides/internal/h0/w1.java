package com.aspose.slides.internal.h0;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.k5.d5;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class w1 implements IGenericEnumerable<com.aspose.slides.internal.c8.l6>, d5 {
   private List<String> n5 = new List<>();
   private List<com.aspose.slides.internal.c8.l6> l6 = new List<>();

   public final String n5() {
      if (this.l6() == 0L) {
         return d1.n5;
      }

      a5 var1 = new a5();
      var1.n5(this.l6.get_Item(0).n5());

      for (int var2 = 1; var2 < this.l6(); var2++) {
         var1.n5(", ");
         var1.n5(this.l6.get_Item(var2).n5());
      }

      return var1.toString();
   }

   public final long l6() {
      return this.n5.size();
   }

   public final void n5(com.aspose.slides.internal.c8.l6 var1) {
      this.l6.addItem(var1);
      this.n5.addItem(var1.n5());
   }

   public final boolean n5(com.aspose.slides.internal.u3.l6 var1) {
      List$Enumerator var2 = this.l6.iterator();

      try {
         while (var2.hasNext()) {
            com.aspose.slides.internal.c8.l6 var3 = (com.aspose.slides.internal.c8.l6)var2.next();
            if (var3.n5(var1)) {
               return true;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return false;
   }

   @Override
   public IGenericEnumerator<com.aspose.slides.internal.c8.l6> iterator() {
      return this.l6.iterator();
   }
}
