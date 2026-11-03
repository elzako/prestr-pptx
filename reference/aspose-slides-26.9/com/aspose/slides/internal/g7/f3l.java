package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;

public class f3l extends f1s {
   private List<p2i> l6 = new List<>();

   public f3l(long var1, long var3) {
      super(var1, var3);
   }

   public final p2i[] l6() {
      return this.l6.toArray(new p2i[0]);
   }

   @Override
   public void n5(f3c var1) {
      var1.n5(this.n5 & 4294967295L);
      List var2 = l6(var1);

      for (int var3 = 0; var3 < var2.size(); var3++) {
         this.l6.addItem(f1s.n5(new p2i(this.n5 & 4294967295L, (Integer)var2.get_Item(var3) & 65535), var1));
      }
   }
}
