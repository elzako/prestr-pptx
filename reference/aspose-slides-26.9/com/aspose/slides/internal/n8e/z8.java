package com.aspose.slides.internal.n8e;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;

public class z8 {
   private final List<m3> n5;
   private final List<String> l6;
   private final Dictionary<String, Object> k5;

   public z8(List<m3> var1) {
      this.n5 = var1;
      this.k5 = new Dictionary<>(var1.size());
      this.l6 = new List<>(var1.size());

      for (int var2 = 0; var2 < var1.size(); var2++) {
         m3 var3 = (m3)var1.get_Item(var2);
         this.l6.addItem(var3.l6());
         this.k5.addItem(var3.l6(), null);
      }
   }

   public final boolean n5(String var1) {
      return var1 == null ? false : this.k5.containsKey(var1);
   }

   public final int n5() {
      return this.n5.size();
   }

   public final m3 n5(int var1) {
      return this.n5.get_Item(var1);
   }
}
