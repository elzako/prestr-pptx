package com.aspose.slides.internal.r3;

import com.aspose.slides.internal.q7.n5$n5;
import com.aspose.slides.internal.z0k.e2;

class n5$1 extends n5$n5 {
   // $VF: synthetic field
   final e2[] n5;
   // $VF: synthetic field
   final long l6;
   // $VF: synthetic field
   final n5 k5;

   n5$1(n5 var1, e2[] var2, long var3) {
      this.k5 = var1;
      this.n5 = var2;
      this.l6 = var3;
   }

   @Override
   public boolean n5(byte[] var1, int var2) {
      if (var2 == 0) {
         return true;
      }

      this.n5[0].write(var1, 0, var2);
      return com.aspose.slides.internal.v6g.k5.h0(this.n5[0].getLength(), 11) <= this.l6;
   }
}
