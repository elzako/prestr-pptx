package com.aspose.slides.internal.y4u;

import com.aspose.slides.exceptions.ArgumentNullException;

public class y4 extends s7 {
   @Override
   protected void n5() {
      if (this.k7 == null) {
         throw new ArgumentNullException("customColorConverter");
      }
   }

   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8) {
      this.k7.n5(this.n3, var1, var2, var3, var4, var5, this.u3, var6, var7);
   }
}
