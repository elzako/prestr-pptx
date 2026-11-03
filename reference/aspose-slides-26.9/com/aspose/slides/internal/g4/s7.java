package com.aspose.slides.internal.g4;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.ms.System.IDisposable;

public class s7 {
   private final List<y4> n5 = new List<>();

   public final y4[] n5() {
      return this.n5.toArray(new y4[0]);
   }

   public final String l6() {
      a5 var1 = new a5();
      List$Enumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            y4 var3 = (y4)var2.next();
            var1.n5(var3.n5());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1.toString();
   }

   public final y1 k5() {
      y1 var1 = y1.n5.y4();
      List$Enumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            y4 var3 = (y4)var2.next();
            y1 var4 = var3.n3().y4();
            (y1.k5(var1, y1.n5) ? var4 : y1.l6(var1.y4(), var4.y4())).a6(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }

   public final float u3() {
      return this.n5.size() == 0 ? 0.0F : this.n5.get_Item(0).y4();
   }

   public final void n5(y4 var1) {
      this.n5.addItem(var1);
   }
}
