package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.ms.System.IDisposable;

class p5g {
   public static <TKey, TValue> void n5(Dictionary<TKey, TValue> var0, Dictionary<TKey, TValue> var1) {
      if (var0 == null) {
         String var7 = com.aspose.slides.ms.System.d1.n5(
            "You should to set  in the '{0}' class a required parameter '{1}'!",new Object[]{ "DictionaryExtension", "dictionaryToAdd"
         });
         throw new t1c(var7);
      }

      Dictionary$Enumerator var2 = var0.iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair<TKey, TValue> var3 = (KeyValuePair<TKey, TValue>)var2.next();
            var1.addItem(var3.getKey(), var3.getValue());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }
}
