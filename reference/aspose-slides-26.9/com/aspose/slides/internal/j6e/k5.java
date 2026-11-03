package com.aspose.slides.internal.j6e;

import com.aspose.slides.internal.d3v.l6$q0;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.z6;

public class k5 extends com.aspose.slides.internal.d3v.l6 {
   private k5$n5 u9;
   private l6$q0 h0;

   public k5(com.aspose.slides.internal.f2i.n5 var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   public void n5(int[] var1, y2 var2, com.aspose.slides.internal.b8u.n5 var3) {
      if (var1 != null) {
         this.u9 = new k5$n5(var3);
         if (this.h0 == null) {
            this.h0 = n5(this.c8(), this.u9(), this.h0(), this.s7());
         }

         this.h0.n5(var1, this.u9);
      }
   }

   @Override
   public void n5(byte[] var1, y2 var2, com.aspose.slides.internal.b8u.n5 var3, z6 var4) {
      this.u9 = new k5$n5(var3);
      if (this.h0 == null) {
         this.h0 = n5(this.c8(), this.u9(), this.h0(), this.s7(), var4);
      }

      this.h0.n5(var1, this.u9);
   }
}
