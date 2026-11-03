package com.aspose.slides.internal.b5j;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.d1;

public class s7 {
   public static List<Float> n5(String var0) {
      if (d1.u3("none", var0, (short)3)) {
         return new List<>();
      }

      List var1 = new List();
      n5 var2 = new n5(var0);

      for (float var3 = var2.k5(); !var2.n5(); var3 = var2.k5()) {
         var1.addItem(var3);
      }

      return var1;
   }
}
