package com.aspose.slides.internal.d3v;

import com.aspose.slides.internal.b8u.m1;
import com.aspose.slides.internal.f9d.n3;
import com.aspose.slides.ms.System.q1;

class a6$n5 implements m1, com.aspose.slides.internal.b8u.n5 {
   private final n3 n5;
   private int l6;
   private int k5;
   private int u3;
   private final int a6;
   private final int u9;

   public a6$n5(n3 var1, int var2, int var3) {
      this.a6 = var3;
      this.n5 = var1;
      this.u9 = var2;
      this.n5();
   }

   @Override
   public final void a6() {
      this.n5(1);
   }

   @Override
   public final void n5(int var1) {
      this.u3 -= var1;
      if (this.u3 == 0) {
         this.n5.k5(q1.l6(this.l6, this.k5));
         this.k5 = this.k5 - this.l6;
         if (this.k5 > 0) {
            this.u3 = q1.l6(this.l6, this.k5);
            this.n5.n3();
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
      this.n5.n3();
   }
}
