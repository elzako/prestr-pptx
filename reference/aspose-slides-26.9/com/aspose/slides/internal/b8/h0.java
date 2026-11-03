package com.aspose.slides.internal.b8;

import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.ms.System.IDisposable;

public class h0 {
   public static <TKey, TValue> void n5(IGenericDictionary<TKey, TValue> var0, IGenericDictionary<TKey, TValue> var1, IGenericDictionary<TValue, TKey> var2) {
      IGenericEnumerator var3 = var0.iterator();

      try {
         while (var3.hasNext()) {
            KeyValuePair<TKey, TValue> var4 = (KeyValuePair<TKey, TValue>)var3.next();
            var1.addItem(var4.getKey(), var4.getValue());
            if (var2 != null) {
               var2.addItem(var4.getValue(), var4.getKey());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   public static <TKey, TValue> TValue n5(IGenericDictionary<TKey, TValue> var0, TKey var1) {
      if (var1 == null) {
         return null;
      }

      Object var2 = null;
      Object[] var3 = new Object[]{var2};
      var0.tryGetValue(var1, var3);
      return (TValue)var3[0];
   }

   public static boolean n5(int var0, int var1) {
      return (var0 & var1) == var1;
   }
}
