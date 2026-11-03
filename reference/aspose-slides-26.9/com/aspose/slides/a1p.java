package com.aspose.slides;

class a1p extends x2k {
   private w3q n5;

   public a1p(w3q var1) {
      this.n5 = var1;
   }

   @Override
   protected LineFormat h0() {
      return (LineFormat)this.n5.k5().getFormat().getLine();
   }

   @Override
   protected boolean c8() {
      return false;
   }

   @Override
   public int u3() {
      return this.x8() ? 2 : 1;
   }

   @Override
   protected void n5(com.aspose.slides.internal.x4g.s7 var1) {
      this.n5.n5(false);
      this.n5((LineFormat)this.n5.k5().getFormat().getLine(), this.n5.n5().t2(), this.n5.l6().o8(), this.s7(), new com.aspose.slides.ms.System.o5<>());
      this.n5.n5(true);
   }
}
