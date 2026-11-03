package com.aspose.slides.internal.d9r;

import com.aspose.slides.Collections.Generic.List;

class c8 implements a6 {
   @Override
   public byte[] n5(int var1) {
      return new byte[var1];
   }

   @Override
   public final boolean n5(long var1) {
      boolean var3 = false;
      List var4 = new List();

      try {
         while (var1 > 0L) {
            long var5 = var1;
            if (var5 > 2147483646L) {
               var5 = com.aspose.slides.internal.v6g.k5.h0(2147483646, 9);
            }

            var1 -= var5;
            byte[] var7 = new byte[(int)var5];
            var4.addItem(var7);
         }

         var3 = true;
      } catch (OutOfMemoryError var13) {
      } finally {
         for (int var10 = var4.size() - 1; var10 >= 0; var10--) {
            var4.set_Item(var10, null);
         }
      }

      return var3;
   }
}
