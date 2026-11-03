package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.InvalidOperationException;

public final class Storage {
   private final Dictionary<String, Object> n5 = new Dictionary<>();

   public final <TValue> void put(String key, TValue value) {
      this.n5.set_Item(key, value);
   }

   public final <TValue> TValue get(String key) {
      if (!this.n5.containsKey(key)) {
         throw new InvalidOperationException(com.aspose.slides.ms.System.d1.n5("{0} not found", new Object[]{key}));
      } else {
         return (TValue)this.n5.get_Item(key);
      }
   }

   public final boolean containsKey(String key) {
      return this.n5.containsKey(key);
   }
}
