package com.aspose.slides.internal.a6;

import com.aspose.slides.exceptions.ArgumentException;

public abstract class y0 implements com.aspose.slides.internal.u3.u3 {
   @Override
   public abstract boolean n5(String var1, int[] var2);

   @Override
   public final int n5(String var1) {
      int var2 = 0;
      int[] var3 = new int[]{0};
      boolean var4 = !this.n5(var1, var3);
      var2 = var3[0];
      if (var4) {
         throw new ArgumentException("value");
      } else {
         return var2;
      }
   }
}
