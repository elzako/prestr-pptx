package com.aspose.slides.internal.b5j;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class h0 {
   private Dictionary<String, String> n5 = new Dictionary<>();

   public final Dictionary<String, String> n5() {
      return this.n5;
   }

   public final void n5(String var1) {
      String[] var2 = d1.u9(var1, '}');

      for (String var6 : var2) {
         String[] var7 = d1.u9(var6, '{');
         if (var7.length > 1 && !this.n5.containsKey(d1.l6(var7[0]))) {
            this.n5.addItem(d1.l6(var7[0]), d1.l6(var7[1]));
         }
      }
   }

   public final String l6(String var1) {
      Dictionary$Enumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            String var4 = ((String)var3.getKey()).toString();
            if (d1.l6(var4, ".") && d1.a6(var1, d1.n5(var4, 0, 1))) {
               return ((String)var3.getValue()).toString();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return d1.n5;
   }
}
