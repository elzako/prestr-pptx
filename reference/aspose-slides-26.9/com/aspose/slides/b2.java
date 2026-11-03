package com.aspose.slides;

import com.aspose.slides.ms.System.IDisposable;

abstract class b2 implements IDisposable {
   protected final j8h n5;
   protected com.aspose.slides.internal.o9b.y2 l6 = new com.aspose.slides.internal.o9b.y2();
   protected final boolean k5;

   protected b2(j8h var1, boolean var2) {
      this.n5 = var1;
      this.k5 = var2;
      this.n5();
      this.n5.l6.l6(new b2$1(this));
   }

   @Override
   public void dispose() {
      this.n5.l6.n5(new b2$2(this));
      if (com.aspose.slides.internal.v6g.k5.l6(this.n5, k9k.class)) {
         ((k9k)this.n5).u3();
      }
   }

   private void n5() {
      boolean var1 = true;
      this.l6 = new com.aspose.slides.internal.o9b.y2(
         com.aspose.slides.internal.v6g.k5.u3(this.n5.n5().n5, 13) - 1,
         com.aspose.slides.internal.v6g.k5.u3(this.n5.n5().l6, 13) - 1,
         com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.n5.l6().n5), 14) + 2,
         com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.n5.l6().l6), 14) + 2
      );
   }

   private void n5(j8h var1) {
      this.n5();
   }

   // $VF: synthetic method
   static void n5(b2 var0, j8h var1) {
      var0.n5(var1);
   }
}
