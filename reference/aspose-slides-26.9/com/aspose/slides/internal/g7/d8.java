package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.Dictionary;

public class d8 extends Dictionary<Integer, Dictionary<Integer, u0>> {
   public final void n5(int var1, u0 var2) {
      if (!super.containsKey(var1)) {
         super.set_Item(var1, new Dictionary());
      }

      Dictionary var3 = (Dictionary)super.get_Item(var1);
      if (!var3.containsKey(var2.n5)) {
         var3.addItem(var2.n5, var2);
      }
   }
}
