package com.aspose.slides.internal.v6;

import com.aspose.slides.internal.b9.f4;
import com.aspose.slides.internal.b9.s9;

public abstract class s3 extends com.aspose.slides.internal.r5.a6 {
   protected s3(com.aspose.slides.internal.r5.y4 var1) {
      super(var1);
   }

   @Override
   public void u9(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      f4 var3 = (f4)var1;
      com.aspose.slides.internal.x4g.s7 var4 = new com.aspose.slides.internal.x4g.s7();
      int var5 = (int)var3.l6().n5();
      int var6 = (int)var3.l6().l6();
      if (var5 > var3.n5().u9()) {
         var5 = var3.n5().u9();
      }

      if (var6 > var3.n5().h0()) {
         var6 = var3.n5().h0();
      }

      var4.n5(var3.n5().n5(), var3.n5().l6(), var5, var6, 180.0F, 90.0F);
      var4.l6(var3.n5().n5() + var5 / 2.0F, var3.n5().l6(), var3.n5().k5() - var5 / 2.0F, var3.n5().l6());
      var4.n5(var3.n5().k5() - var5, var3.n5().l6(), var5, var6, -90.0F, 90.0F);
      var4.l6(var3.n5().k5(), var3.n5().l6() + var6 / 2, var3.n5().k5(), var3.n5().u3() - var6 / 2);
      var4.n5(var3.n5().k5() - var5, var3.n5().u3() - var6, var5, var6, 0.0F, 90.0F);
      var4.l6(var3.n5().k5() - var5 / 2.0F, var3.n5().u3(), var3.n5().n5() + var5 / 2.0F, var3.n5().u3());
      var4.n5(var3.n5().n5(), var3.n5().u3() - var6, var5, var6, 90.0F, 90.0F);
      var4.l6(var3.n5().n5(), var3.n5().u3() - var6 / 2, var3.n5().n5(), var3.n5().l6() + var6 / 2);
      var4.n3();
      if (var2.e2()) {
         var2.y4().n5(var4, false);
      } else {
         this.n5(var4, var2);
      }
   }

   @Override
   public boolean h0(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      return !var2.e2();
   }

   protected abstract void n5(com.aspose.slides.internal.x4g.s7 var1, com.aspose.slides.internal.r6.u9 var2);
}
