package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;

public class w3k extends s0i {
   private int l6;
   private List<y9r> k5 = new List<>();
   private List<Integer> u3 = new List<>();

   public final int l6() {
      return this.l6;
   }

   public final int k5() {
      return this.k5.size();
   }

   public final y9r n5(int var1) {
      return this.k5.get_Item(var1);
   }

   public final int[] u3() {
      return t2.l6(this.u3);
   }

   @Override
   public void n5(f3c var1) {
      var1.n5(this.n5 & 4294967295L);
      this.l6 = var1.n3() & 65535;
      int var2 = var1.n3() & 65535;

      for (int var3 = 0; var3 < this.l6 - 1; var3++) {
         this.u3.addItem(var1.n3());
      }

      for (int var6 = 0; var6 < var2; var6++) {
         int var4 = var1.n3();
         int var5 = var1.n3();
         this.k5.addItem(new y9r(var4, var5));
      }

      n5(this.k5, this.l6);
   }
}
