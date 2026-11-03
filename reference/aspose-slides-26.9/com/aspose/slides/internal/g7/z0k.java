package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;

public class z0k extends f1s {
   private List<x7n> l6 = new List<>();

   public z0k(long var1) {
      super(var1);
   }

   public final x7n[] l6() {
      return this.l6.toArray(new x7n[0]);
   }

   @Override
   public void n5(f3c var1) {
      var1.n5(this.n5 & 4294967295L);
      List var2 = l6(var1);

      for (int var3 = 0; var3 < var2.size(); var3++) {
         this.l6.addItem(f1s.n5(new x7n((this.n5 & 4294967295L) + ((Integer)var2.get_Item(var3) & 65535) & 4294967295L), var1));
      }
   }
}
