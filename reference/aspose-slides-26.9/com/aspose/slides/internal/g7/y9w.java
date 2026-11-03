package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;

public class y9w extends f1s {
   private p6w l6;
   private List<i0e> k5 = new List<>();

   public y9w(long var1, long var3) {
      super(var1, var3);
   }

   @Override
   public void n5(f3c var1) {
      var1.n5(this.n5 & 4294967295L);
      int var2 = var1.n3() & 65535;
      List var3 = l6(var1);
      this.l6 = n5(new p6w(this.n5 & 4294967295L, var2), var1);

      for (int var4 = 0; var4 < var3.size(); var4++) {
         this.k5.addItem(n5(new i0e(this.n5 & 4294967295L, (Integer)var3.get_Item(var4) & 65535), var1));
      }
   }
}
