package com.aspose.slides;

class i2 extends f6d {
   private final t9z n5;

   public i2(t9z var1, double var2) {
      super(var2, var1.n5());
      this.n5 = var1;
   }

   @Override
   protected void l6() {
      com.aspose.slides.internal.o9b.y1 var1 = this.e5().y4();
      boolean var2 = this.n5.k5(var1.y4());
      if (!var2) {
         this.n5.l6(var1.y4());
         this.n5.n5(var1.y4());
      }
   }

   @Override
   void U_() {
      if (this.T_()) {
         com.aspose.slides.internal.o9b.y1 var1 = this.e5().y4();
         this.n5.u3(var1.y4());
      }
   }
}
