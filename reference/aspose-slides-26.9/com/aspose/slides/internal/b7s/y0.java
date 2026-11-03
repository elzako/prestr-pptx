package com.aspose.slides.internal.b7s;

import com.aspose.slides.internal.r1x.v3;

public class y0 extends v3 {
   public y0(com.aspose.slides.internal.z0k.t4 var1) {
      super(var1);
   }

   public y0(com.aspose.slides.internal.z0k.t4 var1, boolean var2) {
      super(var1, var2);
   }

   public final void n5(int var1) {
      this.s7();
      this.k5().writeByte((byte)((var1 & 65535) >> 8));
      this.k5().writeByte((byte)(0xFF & var1 & 65535));
   }
}
