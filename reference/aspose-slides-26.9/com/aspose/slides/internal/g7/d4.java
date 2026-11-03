package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;

public class d4 {
   public int n5 = 0;
   public List<o2> l6;

   public d4(int var1) {
      this.l6 = new List<>(var1);
   }

   public final void n5(int var1, int var2) {
      if (var1 - var2 > 1) {
         this.l6.get_Item(this.n5).n5 = var1;
         this.l6.get_Item(this.n5).l6 = var2;
         this.n5++;
      }
   }
}
