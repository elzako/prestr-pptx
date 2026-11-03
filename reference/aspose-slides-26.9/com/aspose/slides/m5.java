package com.aspose.slides;

class m5 extends a4 {
   private com.aspose.slides.ms.System.o5<Byte> n5 = new com.aspose.slides.ms.System.o5<>();
   private IBulletFormat l6;

   public m5(IBulletFormat var1) {
      this.l6 = var1;
   }

   public final com.aspose.slides.ms.System.o5<Byte> n5() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.ms.System.o5<Byte> var1) {
      if (!com.aspose.slides.internal.n8e.v4.n5(this.n5.k5(), var1.k5())) {
         var1.n5(this.n5);
         this.l6();
      }
   }

   private void l6() {
      if (com.aspose.slides.internal.v6g.k5.l6(this.l6, PVIObject.class)) {
         ((PVIObject)this.l6).k7();
      }
   }
}
