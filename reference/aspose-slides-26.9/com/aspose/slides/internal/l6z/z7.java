package com.aspose.slides.internal.l6z;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class z7 extends n1 {
   private final int n5;
   private List<o5> l6 = new List<>();

   z7(int var1) {
      this.n5 = var1;
   }

   @Override
   void n5(com.aspose.slides.internal.z0k.n5 var1) {
      while ((com.aspose.slides.internal.l6z.n5.n5(var1) & 65535) != 15) {
         o5 var2 = new o5(this.n5);
         var2.n5(var1);
         this.l6.addItem(var2);
      }
   }

   @Override
   void n5(com.aspose.slides.internal.z0k.l6 var1) {
      List$Enumerator var2 = this.l6.iterator();

      try {
         while (var2.hasNext()) {
            o5 var3 = (o5)var2.next();
            var3.n5(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   public final List<o5> n5() {
      return this.l6;
   }
}
