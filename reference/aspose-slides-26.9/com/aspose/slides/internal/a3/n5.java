package com.aspose.slides.internal.a3;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;

public class n5 extends List<Object> {
   public static n5 n5(String var0) {
      n5 var1 = new n5();
      String[] var2 = d1.n5(var0, ',');
      if (var2.length > 1) {
         for (String var6 : var2) {
            n5 var7 = n5(var6);
            var1.addRange(var7);
         }
      } else {
         String var9 = d1.l6(var2[0]);
         Object var10 = null;

         try {
            var10 = a3.n5(var9);
         } catch (RuntimeException var8) {
            if (com.aspose.slides.internal.v6g.k5.l6(var8, FormatException.class)) {
               var10 = a6.n5(var9);
               if (var10 == null) {
                  var10 = var9;
               }
            }
         }

         if (var10 != null) {
            var1.addItem(var10);
         }
      }

      return var1;
   }
}
