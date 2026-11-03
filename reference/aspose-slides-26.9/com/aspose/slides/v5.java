package com.aspose.slides;

class v5 extends x3 {
   private short n5 = -1;
   private String l6 = com.aspose.slides.ms.System.d1.n5;
   private IBulletFormat k5;

   public v5(IBulletFormat var1) {
      this.k5 = var1;
   }

   public final short n5() {
      return this.n5;
   }

   public final void n5(short var1) {
      if (!com.aspose.slides.internal.n8e.v4.n5((float)(this.n5), (float)(var1))) {
         this.n5 = var1;
         this.l6 = com.aspose.slides.ms.System.d1.n5(new char[]{(char)this.n5});
         this.k5();
      }
   }

   public final String l6() {
      return this.l6;
   }

   public final void n5(String var1) {
      if (!com.aspose.slides.internal.n8e.v4.n5(this.l6, var1)) {
         this.l6 = var1;
         this.k5();
      }
   }

   private void k5() {
      if (com.aspose.slides.internal.v6g.k5.l6(this.k5, PVIObject.class)) {
         ((PVIObject)this.k5).k7();
      }
   }
}
