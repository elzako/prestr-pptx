package com.aspose.slides.internal.j6e;

import com.aspose.slides.internal.b8u.m1;
import com.aspose.slides.ms.System.q1;

class l6$n5 implements m1, com.aspose.slides.internal.b8u.n5 {
   private final l6$l6 n5;
   private int l6;
   private int k5;
   private int u3;
   private final int a6;
   private final int u9;

   public l6$n5(l6$l6 var1, int var2, int var3) {
      this.a6 = var3;
      this.n5 = var1;
      this.u9 = var2;
      this.n5();
   }

   @Override
   public final void a6() {
      this.n5(this.l6);
   }

   @Override
   public final void n5(int var1) {
      this.u3 -= var1;
      if (this.u3 == 0) {
         int var2 = q1.l6(this.l6, this.k5);
         this.n5.n5(var2);
         this.k5 -= var2;
         if (this.k5 > 0) {
            this.u3 = q1.l6(this.l6, this.k5);
            this.n5.n5();
         }
      }
   }

   @Override
   public final void n5(byte[] var1, int var2) {
      this.n5.n5(var1, var2);
   }

   @Override
   public final void n5() {
      this.l6 = this.a6;
      this.k5 = this.u9;
      this.u3 = this.l6;
      this.n5.n5();
   }
}
