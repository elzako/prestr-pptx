package com.aspose.slides.internal.v7;

import com.aspose.slides.Collections.Generic.Dictionary;

public class l6 {
   private static final Dictionary<Integer, k5> n5 = new Dictionary<>();
   private static final u3 l6 = new u3();

   public static k5 n5(int var0) {
      k5 var1 = l6;
      if (n5.containsKey(var0)) {
         var1 = n5.get_Item(var0);
      }

      return var1;
   }

   static {
      n5.addItem(15, new n5());
   }
}
