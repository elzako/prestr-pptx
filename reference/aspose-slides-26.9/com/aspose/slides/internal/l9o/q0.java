package com.aspose.slides.internal.l9o;

import com.aspose.slides.internal.p4t.l6$n5;
import java.awt.image.WritableRaster;

class q0 implements l6$n5 {
   // $VF: synthetic field
   final WritableRaster n5;
   // $VF: synthetic field
   final t4 l6;

   q0(t4 var1, WritableRaster var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public void n5(int var1, int var2, int var3, int var4, com.aspose.slides.internal.p4t.u3 var5) {
      byte var6 = var5.n5();
      this.n5.setSample(var3, var4, 0, var6);
   }
}
