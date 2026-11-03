package com.aspose.slides.internal.p4;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.d6.l6;
import com.aspose.slides.internal.i4.u4;
import com.aspose.slides.internal.i4.x8;
import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.ms.System.y8;

public abstract class n5 {
   private static Dictionary<y8, n5> n5;
   private static Object l6 = new Object();

   public abstract String n5(int var1);

   public static n5 n5(y8 var0) {
      if (n5().containsKey(var0)) {
         return n5().get_Item(var0);
      } else {
         throw new InvalidOperationException();
      }
   }

   private static Dictionary<y8, n5> n5() {
      if (n5 == null) {
         synchronized (l6) {
            if (n5 == null) {
               Dictionary var1 = new Dictionary();
               var1.addItem(k5.n5(u4.class), new l6());
               var1.addItem(k5.n5(x8.class), new com.aspose.slides.internal.d6.n5());
               n5 = var1;
            }
         }
      }

      return n5;
   }
}
