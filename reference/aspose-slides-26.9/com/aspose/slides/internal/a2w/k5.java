package com.aspose.slides.internal.a2w;

import com.aspose.slides.internal.z0k.e2;

public class k5 extends s7 {
   private byte[] n5;

   public void n5(byte[] var1) {
      this.n5 = var1;
   }

   @Override
   protected byte[] l6() {
      byte[] var1 = new byte[4];
      com.aspose.slides.internal.y5s.l6.n5(1229209940L, var1, 0);
      e2 var2 = new e2();
      var2.write(var1, 0, var1.length);
      var2.write(this.n5, 0, this.n5.length);
      return var2.toArray();
   }
}
