package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;

public class e8p extends f1s {
   private List<y4k> l6 = new List<>();

   public e8p(long var1) {
      super(var1);
   }

   public final int l6() {
      return this.l6.size();
   }

   public final y4k n5(int var1) {
      return this.l6.get_Item(var1);
   }

   @Override
   public void n5(f3c var1) {
      var1.n5(this.n5 & 4294967295L);
      int var2 = var1.n3();
      List var3 = new List();

      for (int var4 = 0; var4 < (var2 & 65535); var4++) {
         int var5 = var1.n3();
         int var6 = var1.n3();
         var3.addItem(new e8p$n5(var5, var6));
      }

      for (int var7 = 0; var7 < var3.size(); var7++) {
         this.l6
            .addItem(
               new y4k(
                  ((e8p$n5)var3.get_Item(var7)).n5 & 65535,
                  f1s.n5(new p5k((this.n5 & 4294967295L) + (((e8p$n5)var3.get_Item(var7)).l6 & 65535) & 4294967295L), var1)
               )
            );
      }
   }
}
