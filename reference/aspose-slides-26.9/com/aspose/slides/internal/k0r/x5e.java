package com.aspose.slides.internal.k0r;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

public class x5e extends List<com.aspose.slides.internal.e5a.y2> {
   private j1 n5;
   private com.aspose.slides.internal.e5a.d2 l6;

   public x5e(j1 var1) {
      this.n5 = var1;
      this.n5();
   }

   public final void n5() {
      this.clear();
      com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2(this.n5.u3());
      this.l6 = com.aspose.slides.internal.e5a.d2.n5(var1);
      IGenericEnumerator var2 = this.l6.iterator();

      try {
         while (var2.hasNext()) {
            com.aspose.slides.internal.e5a.y2 var3 = (com.aspose.slides.internal.e5a.y2)var2.next();
            if (!var3.n3()) {
               this.addItem(var3);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }
}
