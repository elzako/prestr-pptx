package com.aspose.slides.internal.t1;

import com.aspose.slides.internal.o9b.y1;

public abstract class t4 extends m3 {
   protected t4(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      super.n5(var1);
   }

   protected final void n5(y1 var1, com.aspose.slides.internal.v8.n3 var2, com.aspose.slides.internal.f2.u9 var3) {
      int var4 = 0;
      e2 var5 = (e2)this.h0(57);
      if (var5 != null && var5.t1() == 149) {
         var4 = var5.a5().l6(var3);
         float var6 = var1.k5();
         var1.u3(var1.n3() + var4);
         var1.n5(var6);
      }

      n3 var7 = (n3)this.h0(56);
      if (var7 != null && var7.t1() == 149) {
         var4 += var7.a5().l6(var3);
      }

      if (var4 > 0) {
         if (var2 != com.aspose.slides.internal.v8.n3.n5 && var2 != com.aspose.slides.internal.v8.n3.l6) {
            var1.l6(var1.s7() - var4);
         } else {
            var1.n5(var1.k5() - var4);
         }
      }
   }
}
