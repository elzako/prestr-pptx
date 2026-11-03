package com.aspose.slides.internal.o9n;

import com.aspose.slides.internal.o9b.j5;
import com.aspose.slides.internal.o9b.y2;

class k5$l6$n5 implements com.aspose.slides.internal.b8u.x8 {
   private final j5 n5 = new j5();
   private final com.aspose.slides.internal.b8u.x8 l6;
   private y2 k5 = new y2();

   public k5$l6$n5(j5 var1, y2 var2, com.aspose.slides.internal.b8u.x8 var3) {
      var1.k5(this.n5);
      this.l6 = var3;
      var2.u3(this.k5);
   }

   @Override
   public final void n5(y2 var1, int[] var2, j5 var3, j5 var4) {
      this.k5.k5(this.k5.s7() + this.n5.n5());
      this.k5.u3(this.k5.x8() + this.n5.l6());
      this.l6.n5(this.k5.n3(), var2, this.n5.k5(), new j5(this.n5.n5() + this.k5.t2(), this.n5.l6() + this.k5.l6()));
   }
}
