package com.aspose.slides.internal.h3;

import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.internal.z4.t2;
import com.aspose.slides.ms.System.d1;

public class k5 extends l6 {
   private final String l6;

   public k5(String var1) {
      this.l6 = var1;
   }

   @Override
   public void n5(IGenericDictionary<String, t2> var1) {
      if (var1.containsKey(this.l6)) {
         this.n5 = (t2)var1.get_Item(this.l6);
      } else if (var1.containsKey(d1.n5('#', this.l6))) {
         this.n5 = (t2)var1.get_Item(d1.n5('#', this.l6));
      }
   }
}
