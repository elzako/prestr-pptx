package com.aspose.slides.internal.h3;

import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.internal.z4.t2;
import com.aspose.slides.ms.System.a3;

public class n5 extends l6 {
   private final int l6;

   public n5(int var1) {
      this.l6 = var1;
   }

   @Override
   public void n5(IGenericDictionary<String, t2> var1) {
      String var2 = a3.n5(this.l6, com.aspose.slides.internal.x7n.l6.k5());
      if (var1.containsKey(var2)) {
         this.n5 = (t2)var1.get_Item(var2);
      }
   }
}
