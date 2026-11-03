package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.ms.System.IDisposable;

public class l4o extends f1s {
   private Dictionary<String, a2w> l6 = new Dictionary<>();

   public l4o(long var1) {
      super(var1);
   }

   public final a2w n5(String var1) {
      return this.l6.containsKey(var1) ? this.l6.get_Item(var1) : null;
   }

   @Override
   public void n5(f3c var1) {
      var1.n5(this.n5 & 4294967295L);
      int var2 = var1.n3();
      Dictionary var3 = n5(var2 & 65535, var1);
      Dictionary$Enumerator var4 = var3.iterator();

      try {
         while (var4.hasNext()) {
            KeyValuePair var5 = (KeyValuePair)var4.next();
            this.l6.addItem((String)var5.getKey(), f1s.n5(new a2w((this.n5 & 4294967295L) + (Long)var5.getValue(), (String)var5.getKey()), var1));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.l6.size() != (var2 & 65535)) {
         throw new r7c("incorrect count of script tables");
      }
   }
}
