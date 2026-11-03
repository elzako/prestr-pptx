package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class r1m {
   private final List<com.aspose.slides.internal.o9b.w1> n5;
   private final List<Integer> l6;
   private boolean k5 = false;

   r1m() {
      this.n5 = new List<>();
      this.l6 = new List<>();
   }

   boolean n5() {
      return this.k5;
   }

   void n5(boolean var1) {
      this.k5 = var1;
   }

   int[] l6() {
      int[] var1 = new int[this.l6.size()];

      for (int var2 = 0; var2 < this.l6.size(); var2++) {
         var1[var2] = this.l6.get_Item(var2);
      }

      return var1;
   }

   com.aspose.slides.internal.o9b.w1[] k5() {
      com.aspose.slides.internal.o9b.w1[] var1 = new com.aspose.slides.internal.o9b.w1[this.n5.size()];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = this.n5.get_Item(var2);
      }

      return var1;
   }

   void n5(com.aspose.slides.internal.o9b.w1 var1, int var2) {
      this.n5.addItem(var1.u3());
      this.l6.addItem(var2);
   }
}
