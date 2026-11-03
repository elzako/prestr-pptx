package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;

public class e4w extends f1s {
   private int l6;
   private List<p6w> k5 = new List<>();

   public e4w(long var1, long var3) {
      super(var1, var3);
   }

   public final p6w[] l6() {
      return this.k5.toArray(new p6w[0]);
   }

   @Override
   public void n5(f3c var1) {
      var1.n5(this.n5 & 4294967295L);
      int var2 = var1.n3() & 65535;
      if (var2 != 1) {
         throw new r7c(com.aspose.slides.ms.System.d1.n5("Incorrect format idenrifier = {0} for MarkGlyphSets table", new Object[]{var2}));
      }

      this.l6 = var1.n3() & 65535;
      List var3 = new List();

      for (int var4 = 0; var4 < this.l6; var4++) {
         var3.addItem(com.aspose.slides.internal.v6g.k5.h0(var1.y4(), 10));
      }

      for (int var5 = 0; var5 < this.l6; var5++) {
         this.k5.addItem(n5(new p6w((Long)var3.get_Item(var5)), var1));
      }
   }
}
