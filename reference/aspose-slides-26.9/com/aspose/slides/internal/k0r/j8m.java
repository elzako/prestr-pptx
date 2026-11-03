package com.aspose.slides.internal.k0r;

import com.aspose.slides.Collections.Generic.List;

public class j8m extends t9p {
   private int l6 = 65535;
   private final List<p7x> k5 = new List<>();

   public final List<p7x> k5() {
      return this.k5;
   }

   public j8m() {
      this.w1().n5(4013);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.l6 = var1.r4();
      this.k5().clear();

      for (int var2 = 0; var2 < (this.l6 & 65535); var2++) {
         p7x var3 = new p7x();
         var3.n5(var1);
         this.k5.addItem(var3);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      int var2 = this.k5.size();
      var1.n5((short)var2);

      for (int var3 = 0; var3 < var2; var3++) {
         this.k5.get_Item(var3).n5(var1);
      }
   }

   @Override
   public int n5() {
      int var1 = 2;

      for (int var2 = 0; var2 < this.k5.size(); var2++) {
         var1 += this.k5.get_Item(var2).l6();
      }

      return var1;
   }
}
