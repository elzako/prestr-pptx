package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$KeyCollection$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class a6k extends x3 {
   private final Dictionary<String, String> n5 = new Dictionary<>(com.aspose.slides.ms.System.p6.l6());
   private com.aspose.slides.internal.k4y.x8 l6;

   public final Dictionary<String, String> n5() {
      return this.n5;
   }

   public final com.aspose.slides.internal.k4y.x8 l6() {
      return this.l6;
   }

   public final void n5(com.aspose.slides.internal.k4y.x8 var1) {
      this.l6 = var1;
   }

   public final void n5(a6k var1) {
      if (var1.l6 != null) {
         this.l6 = var1.l6.u3();
      } else {
         this.l6 = null;
      }

      this.n5.clear();
      Dictionary$KeyCollection$Enumerator var2 = var1.n5().getKeys().iterator();

      try {
         while (var2.hasNext()) {
            String var3 = (String)var2.next();
            this.n5.addItem(var3, var1.n5().get_Item(var3));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   public final void n5(String var1, String var2) {
      if (this.n5.containsKey(var1)) {
         this.n5.set_Item(var1, var2);
      } else {
         this.n5.addItem(var1, var2);
      }
   }
}
