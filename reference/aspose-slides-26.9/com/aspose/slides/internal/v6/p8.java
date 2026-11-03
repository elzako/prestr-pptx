package com.aspose.slides.internal.v6;

import com.aspose.slides.internal.b9.n9;
import com.aspose.slides.internal.b9.s9;

public abstract class p8 extends com.aspose.slides.internal.r5.a6 {
   protected p8(com.aspose.slides.internal.r5.y4 var1) {
      super(var1);
   }

   @Override
   public void u9(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      n9 var3 = (n9)var1;
      com.aspose.slides.internal.x4g.m1 var4 = this.n5(var2);
      com.aspose.slides.internal.o9b.w1[] var5 = new com.aspose.slides.internal.o9b.w1[]{var3.n5().u3()};
      var4.n5(var5);
      var2.z7().n5(com.aspose.slides.internal.v6g.k5.u3(var5[0].l6(), 13), com.aspose.slides.internal.v6g.k5.u3(var5[0].k5(), 13), var3.l6().u9().o8());
   }

   @Override
   public boolean h0(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      return false;
   }

   public abstract com.aspose.slides.internal.x4g.m1 n5(com.aspose.slides.internal.r6.u9 var1);
}
