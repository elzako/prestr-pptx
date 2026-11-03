package com.aspose.slides.internal.r1x;

import com.aspose.slides.Collections.Generic.Dictionary;

class o5$a6 extends o5$n5 {
   private Dictionary<Integer, Short> l6 = new Dictionary<>();

   public o5$a6(com.aspose.slides.internal.b8u.a6 var1) {
      super(var1);
   }

   public static com.aspose.slides.internal.b8u.a6 n5(com.aspose.slides.internal.b8u.a6 var0) {
      try {
         return new o5$a6(var0);
      } catch (OutOfMemoryError var2) {
         return var0;
      }
   }

   @Override
   public int n5(int var1) {
      short var2 = 0;
      Short[] var3 = new Short[]{var2};
      boolean var4 = !this.l6.tryGetValue(var1, var3);
      var2 = var3[0];
      if (var4) {
         var2 = (short)this.n5.n5(var1);
         this.l6.addItem(var1, var2);
      }

      return var2;
   }
}
