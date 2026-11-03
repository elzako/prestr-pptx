package com.aspose.slides.internal.r1x;

import com.aspose.slides.Collections.Generic.Dictionary;

class o5$h0 extends o5$n5 {
   private final Dictionary<Integer, Byte> l6 = new Dictionary<>();

   public o5$h0(com.aspose.slides.internal.b8u.a6 var1) {
      super(var1);
   }

   public static com.aspose.slides.internal.b8u.a6 n5(com.aspose.slides.internal.b8u.a6 var0) {
      try {
         return new o5$h0(var0);
      } catch (OutOfMemoryError var2) {
         return var0;
      }
   }

   @Override
   public int n5(int var1) {
      byte var2 = 0;
      Byte[] var3 = new Byte[]{var2};
      boolean var4 = !this.l6.tryGetValue(var1, var3);
      var2 = var3[0];
      if (var4) {
         var2 = (byte)this.n5.n5(var1);
         this.l6.addItem(var1, var2);
      }

      return var2 & 0xFF;
   }
}
