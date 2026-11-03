package com.aspose.slides.internal.y5s;

import java.util.HashMap;
import java.util.Map;

class c4$u3 extends c4$n5 {
   private final Map<Integer, Integer> l6 = new HashMap<>();

   public c4$u3(com.aspose.slides.internal.j3b.u3 var1) {
      super(var1);
   }

   @Override
   public int n5(int var1) {
      Integer var2 = this.l6.get(var1);
      if (var2 == null) {
         var2 = this.n5.n5(var1);
         this.l6.put(var1, var2);
      }

      return var2;
   }
}
