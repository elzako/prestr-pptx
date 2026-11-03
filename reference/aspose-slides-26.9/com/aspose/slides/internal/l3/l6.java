package com.aspose.slides.internal.l3;

import com.aspose.slides.internal.z0k.t4;

public class l6 extends n5 {
   private final int l6;
   private final float k5;
   private final int u3;

   public l6(t4 var1, int var2, float var3, int var4) {
      super(var1);
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
   }

   @Override
   public void write(byte[] srcBuffer, int srcOffset, int srcCount) {
      com.aspose.slides.internal.s5.k5 var4 = new com.aspose.slides.internal.s5.k5();
      var4.n5(1);
      var4.n5(false);
      var4.l6(false);
      var4.n5(srcBuffer, this.l6, this.k5, this.u3, super.n5);
   }
}
