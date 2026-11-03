package com.aspose.slides.internal.p5k;

public class y1 extends d2 {
   private long n5;

   public y1(l6 var1) {
      super(var1);
   }

   public final void n5() {
      this.n5 = this.u9().l6().n5().getPosition();
      this.u9().n5(new byte[6]);
   }

   public final void n5(int var1) {
      int var2 = (int)(this.u9().l6().n5().getPosition() - this.n5 - 6L);
      this.u9().l6().n5((int)this.n5, 0);
      this.u9().n5(var1, var2);
      this.u9().l6().n5(0, 2);
   }
}
