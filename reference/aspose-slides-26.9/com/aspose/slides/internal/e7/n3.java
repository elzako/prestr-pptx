package com.aspose.slides.internal.e7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.v2.t9;
import com.aspose.slides.ms.System.IDisposable;

public class n3 {
   private com.aspose.slides.internal.v2.k5 n5;
   private Dictionary<t9, Long> l6;

   public final com.aspose.slides.internal.v2.k5 n5() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.internal.v2.k5 var1) {
      this.n5 = var1;
   }

   public final Dictionary<t9, Long> l6() {
      return this.l6;
   }

   private void n5(Dictionary<t9, Long> var1) {
      this.l6 = var1;
   }

   public n3() {
      this.n5(new Dictionary<>());
   }

   public final void n5(n3 var1) {
      Dictionary$Enumerator var2 = var1.l6().iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            if (!this.l6().containsKey((t9)var3.getKey())) {
               this.l6().addItem((t9)var3.getKey(), (Long)var3.getValue());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }
}
