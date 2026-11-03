package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class t1n implements IDisposable {
   private y1i n5 = null;
   private List<y1i> l6 = null;

   t1n(y1i var1, y1i var2) {
      this.n5 = var1;
      this.l6 = new List<>();
      this.n5(var2);
   }

   final void n5(y1i var1) {
      this.n5(var1, true);
   }

   final void n5(y1i var1, boolean var2) {
      if (var1 != null) {
         if (var2) {
            int var3 = this.l6.size();

            while (var3 > 0) {
               y1i var4 = this.l6.get_Item(--var3);
               if (var1 == var4) {
                  this.l6.removeAt(var3);
                  break;
               }
            }
         }

         this.l6.addItem(var1);
      }
   }

   final void n5(t1n var1, boolean var2) {
      if (var1 != null) {
         List$Enumerator var3 = var1.l6.iterator();

         try {
            while (var3.hasNext()) {
               y1i var4 = (y1i)var3.next();
               this.n5(var4, var2);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }
   }

   @Override
   public final void dispose() {
      this.l6.clear();
      this.l6 = null;
   }

   public final String n5() {
      return this.n5.n5();
   }

   final List<y1i> l6() {
      return this.l6;
   }
}
