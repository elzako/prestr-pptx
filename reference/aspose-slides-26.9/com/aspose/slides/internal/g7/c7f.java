package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;

public class c7f extends c5q {
   private p6w l6;
   private List<e6r> k5 = new List<>();

   public c7f(long var1, int var3) {
      super(var1, var3);
   }

   public final p6w l6() {
      return this.l6;
   }

   public final e6r n5(int var1) {
      return this.k5.size() > var1 ? this.k5.get_Item(var1) : null;
   }

   @Override
   public void n5(f3c var1) {
      if (var1.n5() != ((this.n5 & 4294967295L) + 2L & 4294967295L)) {
         var1.n5((this.n5 & 4294967295L) + 2L & 4294967295L);
      }

      int var2 = var1.n3() & 65535;
      List var3 = l6(var1);
      this.l6 = n5(new p6w(this.n5 & 4294967295L, var2), var1);

      for (int var4 = 0; var4 < var3.size(); var4++) {
         this.k5.addItem(n5(new e6r(this.n5 & 4294967295L, (Integer)var3.get_Item(var4) & 65535), var1));
      }
   }
}
