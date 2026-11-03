package com.aspose.slides;

class h1t implements c1k {
   private final d9r n5;
   private final IShape l6;
   private float k5;
   private float u3;
   private float a6;
   private float u9;

   public h1t(IShape var1, d9r var2) {
      this.l6 = var1;
      this.n5 = var2;
      this.u3(var1.getY());
      this.l6(var1.getX());
      this.n5(var1.getY() + var1.getHeight());
      this.k5(var1.getX() + var1.getWidth());
   }

   public final void n5(float var1) {
      this.k5 = var1;
   }

   @Override
   public final float n5() {
      return this.u3;
   }

   public final void l6(float var1) {
      this.u3 = var1;
   }

   public final void k5(float var1) {
      this.a6 = var1;
   }

   @Override
   public final float l6() {
      return this.u9;
   }

   public final void u3(float var1) {
      this.u9 = var1;
   }

   @Override
   public final String n5(j9u var1) {
      String var2 = e4u.n5(this.l6, this.n5);
      var1.n5(var2);
      return var2;
   }
}
