package com.aspose.slides;

final class MovePlayer extends w4 implements l8k {
   public final e9 l6;
   public final MovePlayer$GetPointHandler k5;

   public MovePlayer(e9 rc, IShape shape, MovePlayer$GetPointHandler getPoint) {
      super(shape);
      this.l6 = rc;
      this.k5 = getPoint;
   }

   @Override
   public final void n5(float var1) {
      d2k var2 = this.k5.invoke(var1).u3();
      this.l6.l6(this.n5, var2.u3());
   }

   @Override
   public final void n5() {
      this.n5(1.0F);
   }
}
