package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;

public abstract class r1q {
   private final Dictionary<String, int[]> n5 = new Dictionary<>();
   private final Dictionary<Integer, List<String>> l6 = new Dictionary<>();

   public int l6(String var1) {
      return this.n5.containsKey(var1) ? this.n5.get_Item(var1)[0] : 0;
   }

   public String[] n5(int var1) {
      return this.l6.containsKey(var1) ? this.l6.get_Item(var1).toArray(new String[0]) : new String[]{".notdef"};
   }

   public final void n5(String var1, int... var2) {
      this.n5.set_Item(var1, var2);

      for (int var6 : var2) {
         if (!this.l6.containsKey(var6)) {
            this.l6.addItem(var6, new List<>());
         }

         this.l6.get_Item(var6).addItem(var1);
      }
   }
}
