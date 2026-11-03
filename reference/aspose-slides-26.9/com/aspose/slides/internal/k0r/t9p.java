package com.aspose.slides.internal.k0r;

import com.aspose.slides.Collections.Generic.List;

public class t9p extends e6r {
   List<v9e> n5 = new List<>();

   public t9p() {
      this.w1().n5(4012);
   }

   public final List<v9e> l6() {
      return this.n5;
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      int var2 = this.w1().a6();
      this.n5.clear();

      while (var2 > 0) {
         v9e var3 = new v9e();
         var3.n5(var1);
         this.n5.addItem(var3);
         var2 -= var3.u3();
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      for (int var2 = 0; var2 < this.n5.size(); var2++) {
         this.n5.get_Item(var2).n5(var1);
      }
   }

   @Override
   public int n5() {
      int var1 = 0;

      for (int var2 = 0; var2 < this.n5.size(); var2++) {
         var1 += this.n5.get_Item(var2).u3();
      }

      return var1;
   }

   public final int n5(v9e var1) {
      if (var1 == null) {
         return -1;
      }

      if (this.n5.size() == 0) {
         this.n5.addItem(new v9e());
      }

      int var2 = this.n5.size();
      if (this.n5.get_Item(var2 - 1).n5(var1)) {
         return var2 - 1;
      }

      this.n5.addItem(var1);
      return var2;
   }
}
