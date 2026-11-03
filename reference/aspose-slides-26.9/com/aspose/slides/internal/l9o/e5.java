package com.aspose.slides.internal.l9o;

import com.aspose.slides.internal.p4t.n5$n5;

public abstract class e5 extends s3 {
   protected e5(com.aspose.slides.internal.o9b.l6 var1, com.aspose.slides.internal.g3x.k5 var2) {
      super(var1, var2);
   }

   @Override
   protected n5$n5 t2() {
      return new b3(this);
   }

   @Override
   protected void n5(int var1, com.aspose.slides.internal.p4t.u3 var2) {
      var2.n5((byte)(var1 >> 0 & 0xFF));
      var2.n5((byte)(var1 >> 8 & 0xFF));
   }

   @Override
   protected abstract int k5(int var1);
}
