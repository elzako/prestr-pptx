package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class a9j {
   private String n5;
   private List<q8v> l6 = new List<>();
   private List<q8v> k5 = new List<>();

   public final String n5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final List<q8v> l6() {
      return this.l6;
   }

   public final List<q8v> k5() {
      return this.k5;
   }

   final q8v l6(String var1) {
      if (var1 != null) {
         List$Enumerator var2 = this.l6().iterator();

         try {
            while (var2.hasNext()) {
               q8v var3 = (q8v)var2.next();
               if (com.aspose.slides.ms.System.d1.a6(var1, var3.l6())) {
                  return var3;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }

      return null;
   }
}
