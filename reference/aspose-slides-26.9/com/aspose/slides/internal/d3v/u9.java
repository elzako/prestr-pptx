package com.aspose.slides.internal.d3v;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.z6;

public class u9 extends l6 {
   private u9$n5 u9;
   private l6$q0 h0;

   public u9(com.aspose.slides.internal.f2i.n5 var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   public void n5(int[] var1, y2 var2, com.aspose.slides.internal.b8u.n5 var3) {
      if (this.h0 == null) {
         int var4 = this.s7();
         this.h0 = com.aspose.slides.internal.d3v.l6.n5(this.c8(), this.u9(), this.h0(), var4);
         u9$l6 var5 = new u9$l6(var3, var4, this.c8().t1(), this.u9());
         var5.n5();
         this.u9 = new u9$n5(var5, this.h0(), var4);
      }

      this.h0.n5(var1, this.u9);
   }

   @Override
   public void n5(byte[] var1, y2 var2, com.aspose.slides.internal.b8u.n5 var3, z6 var4) {
      throw new NotImplementedException();
   }
}
