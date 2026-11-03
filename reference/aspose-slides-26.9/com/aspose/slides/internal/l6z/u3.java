package com.aspose.slides.internal.l6z;

class u3 extends n1 {
   private u9 n5;
   private a6 l6;

   @Override
   void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = new u9();
      this.n5.n5(var1);
      this.l6 = new a6((this.n5.n5() & 4294967295L) + 3L & 4294967295L, (this.n5.l6() & 255) == 1);
      this.l6.n5(var1);
   }

   @Override
   void n5(com.aspose.slides.internal.z0k.l6 var1) {
      this.n5.n5(var1);
      this.l6.n5(var1);
   }

   public final u9 n5() {
      return this.n5;
   }

   public final void n5(u9 var1) {
      this.n5 = var1;
   }

   public final a6 l6() {
      return this.l6;
   }

   public final void n5(a6 var1) {
      this.l6 = var1;
   }
}
