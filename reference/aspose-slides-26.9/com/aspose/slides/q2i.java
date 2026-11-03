package com.aspose.slides;

final class q2i implements h3m {
   private final IShape n5;
   private final e9 l6;

   public q2i(IShape var1, e9 var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public final void n5(c1m var1) {
      this.l6.n5(this.n5, var1);
   }

   public final s4s n5() {
      IShapeFrame var1 = this.n5.getFrame();
      return new s4s(var1.getX(), var1.getY(), var1.getWidth(), var1.getHeight());
   }
}
