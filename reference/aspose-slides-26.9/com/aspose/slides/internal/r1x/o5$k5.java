package com.aspose.slides.internal.r1x;

import com.aspose.slides.Collections.Generic.Dictionary;

class o5$k5 extends o5$n5 {
   private Dictionary<Integer, Integer> l6 = new Dictionary<>();

   public o5$k5(com.aspose.slides.internal.b8u.a6 var1) {
      super(var1);
   }

   @Override
   public int n5(int var1) {
      int var2 = var1 & 16777215;
      int var3 = 0;
      Integer[] var4 = new Integer[]{var3};
      boolean var5 = !this.l6.tryGetValue(var2, var4);
      var3 = var4[0];
      if (var5) {
         var3 = this.n5.n5(var1);
         this.l6.addItem(var2, var3);
      }

      return var3;
   }
}
