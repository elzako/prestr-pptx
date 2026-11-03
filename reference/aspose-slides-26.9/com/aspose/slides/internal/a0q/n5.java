package com.aspose.slides.internal.a0q;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.g4d.l6;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.p6;

public class n5 extends l6 {
   private final String l6;
   private final String k5;
   protected final Dictionary<String, Object> n5;

   public n5(String var1, String var2) {
      if (d1.n5(var1)) {
         throw new ArgumentNullException("prefix");
      }

      if (d1.n5(var2)) {
         throw new ArgumentNullException("namespaceUri");
      }

      this.l6 = var1;
      this.k5 = var2;
      this.n5 = new Dictionary<>(p6.u3());
   }

   public final String l6() {
      return this.l6;
   }

   public final String k5() {
      return this.k5;
   }

   public final void n5(String var1, Object var2) {
      if (!this.n5.containsKey(var1)) {
         this.n5.addItem(var1, var2);
      } else {
         this.n5.set_Item(var1, var2);
      }
   }

   @Override
   public String n5() {
      a5 var1 = new a5();
      Dictionary$Enumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            if (var3.getValue() != null) {
               var1.n5("<{0}>{1}</{0}>{2}", var3.getKey(), var3.getValue(), '\n');
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1.toString();
   }
}
