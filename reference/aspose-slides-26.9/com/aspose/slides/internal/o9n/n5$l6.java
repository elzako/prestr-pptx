package com.aspose.slides.internal.o9n;

import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.internal.o9b.y2;

class n5$l6 extends n5$n5 implements com.aspose.slides.internal.y7w.n5 {
   private final n5 k5;

   public n5$l6(n5 var1, com.aspose.slides.internal.v6s.u3 var2, com.aspose.slides.internal.b8u.x8 var3, y2 var4) {
      super(var1, var2, var3, var4.n3());
      this.k5 = var1;
   }

   @Override
   public void n5(y2 var1) {
      int var2 = var1.t2() * var1.l6();
      if (com.aspose.slides.internal.o9n.n5.x8() > 0 && var2 > com.aspose.slides.internal.o9n.n5.x8()) {
         throw new OutOfMemoryException();
      }

      com.aspose.slides.internal.y7w.l6 var3 = new com.aspose.slides.internal.y7w.l6(
         this.k5.u9(), com.aspose.slides.internal.o9n.n5.u9(this.k5), com.aspose.slides.internal.o9n.n5.h0(this.k5), this.n5
      );
      var3.n5(var1.n3(), this);
   }

   @Override
   public final int[] n5(int var1, int var2, int var3, y2 var4) {
      this.l6.n5(new com.aspose.slides.internal.r2q.u3(var4.n3(), com.aspose.slides.internal.o9n.n5.c8(this.k5), 0, this.k5.c8().y2() == 0));
      this.l6.n5(var1);
      return this.l6.n5(var4.n3());
   }
}
