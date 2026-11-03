package com.aspose.slides.internal.e1x;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.ms.System.IDisposable;

public class d5 extends Dictionary<Long, Dictionary<Long, s3>> {
   public final void n5(long var1, s3 var3) {
      if (!super.containsKey(var1)) {
         super.set_Item(var1, new Dictionary());
      }

      Dictionary var4 = (Dictionary)super.get_Item(var1);
      if (!var4.containsKey(var3.n5())) {
         var4.addItem(var3.n5(), var3);
      }
   }

   public final void n5(d5 var1) {
      if (var1 != null) {
         for (KeyValuePair<Long, Dictionary<Long, s3>> var3 : var1) {
            if (!super.containsKey(var3.getKey())) {
               super.addItem(var3.getKey(), var3.getValue());
            } else {
               Dictionary$Enumerator var4 = ((Dictionary)var3.getValue()).iterator();

               try {
                  while (var4.hasNext()) {
                     KeyValuePair var5 = (KeyValuePair)var4.next();
                     this.n5((Long)var3.getKey(), (s3)var5.getValue());
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                     var4.dispose();
                  }
               }
            }
         }
      }
   }
}
