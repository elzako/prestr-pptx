package com.aspose.slides.internal.l9o;

import com.aspose.slides.internal.p4t.n5$n5;

public abstract class s3 extends n5 {
   protected s3(com.aspose.slides.internal.o9b.l6 var1, com.aspose.slides.internal.g3x.k5 var2) {
      super(var1, var2);
   }

   @Override
   protected void k5(byte[] var1) {
      com.aspose.slides.internal.p4t.k5 var2 = new com.aspose.slides.internal.p4t.k5(this.a6, this.u9, this.h0, this.c8, this.l6());
      com.aspose.slides.internal.p4t.u3 var3 = this.l6(var1);
      com.aspose.slides.internal.p4t.n5 var4 = new com.aspose.slides.internal.p4t.n5(this.a6, this.u9, this.h0, this.c8, var2, var3);
      var4.n5(this.t2());
   }

   protected abstract n5$n5 t2();
}
