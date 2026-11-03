package com.aspose.slides.internal.k0r;

import com.aspose.slides.Collections.Generic.List;

public class k7 extends e6r {
   private List<Long> n5 = new List<>();

   public k7() {
      this.n5.addItem(16777215L);
      this.n5.addItem(0L);
      this.n5.addItem(8421504L);
      this.n5.addItem(0L);
      this.n5.addItem(14934203L);
      this.n5.addItem(10040115L);
      this.n5.addItem(10066176L);
      this.n5.addItem(52377L);
      this.w1().n5((short)1);
      this.w1().n5(2032);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5.clear();

      for (int var2 = 0; var2 < 8; var2++) {
         this.n5.addItem(var1.c4());
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      for (int var2 = 0; var2 < 8; var2++) {
         var1.l6(this.n5.get_Item(var2).intValue());
      }
   }

   @Override
   public int n5() {
      return 32;
   }

   public final List<Long> l6() {
      return this.n5;
   }

   public final void n5(k7 var1) {
      if (var1 != null) {
         this.n5.clear();
         this.n5.addRange(var1.l6());
      }
   }
}
