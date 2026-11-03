package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class k5l implements c1k {
   private final d9r n5;
   private List<IShape> l6;
   private float k5;
   private float u3;
   private float a6;
   private float u9;

   public final List<IShape> k5() {
      return this.l6;
   }

   private void n5(List<IShape> var1) {
      this.l6 = var1;
   }

   public k5l(d9r var1, IShape var2) {
      this.n5 = var1;
      this.n5(new List<>());
      this.k5().addItem(var2);
      this.l6(var2.getX());
      this.u3(var2.getY());
      float var3 = var2.getX() + var2.getWidth();
      this.k5(var3);
      float var4 = var2.getY() + var2.getHeight();
      this.n5(var4);
   }

   public final float u3() {
      return this.k5;
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

   public final float a6() {
      return this.a6;
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
      this.u9();
      String var2 = n2q.n5(this, this.n5.n5, this.n5.l6);
      var1.n5(com.aspose.slides.ms.System.d1.n5("{0}{1}",new Object[]{ this.n5.l6.k5(), var2}));
      return var2;
   }

   public final void n5(IShape var1) {
      this.k5().addItem(var1);
   }

   private void u9() {
      List var1 = new List<>(this.k5());

      for (int var2 = 0; var2 < this.k5().size() - 1; var2++) {
         for (int var3 = var2 + 1; var3 < this.k5().size(); var3++) {
            if (this.k5().get_Item(var2).getZOrderPosition() > this.k5().get_Item(var3).getZOrderPosition()) {
               IShape var4 = (IShape)var1.get_Item(var3);
               var1.set_Item(var3, var1.get_Item(var2));
               var1.set_Item(var2, var4);
            }
         }
      }

      this.n5(var1);
   }
}
