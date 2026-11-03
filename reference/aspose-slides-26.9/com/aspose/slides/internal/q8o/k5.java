package com.aspose.slides.internal.q8o;

import com.aspose.slides.internal.y4g.i1;
import com.aspose.slides.internal.y4g.v8;
import com.aspose.slides.internal.y4g.x9;

public class k5 extends com.aspose.slides.internal.n4m.n5 {
   private static byte[] n5 = new byte[]{67, 76, 78, 84};

   public k5(v8 var1) {
      super(var1, (byte)20);
   }

   @Override
   public void c8() {
      super.c8();
      this.a6();
   }

   @Override
   protected void t2() {
      i1 var1 = new i1(this.x8().w1());
      byte[] var2 = this.x8().q0().u9();
      var1.n5(var2, 0, var2.length, var2, 0);
      var1.n5(n5, 0, n5.length, n5, 0);
      var1.n5(x9.n5, 0, 0);
      this.n5(var1.n3());
   }

   @Override
   protected void s7() {
      com.aspose.slides.internal.x8w.a6 var1 = new com.aspose.slides.internal.x8w.a6();
      byte[] var2 = this.x8().q0().u9();
      byte[] var3 = var1.k5(var2, 0, var2.length);
      this.n5(this.x8().i1().n5().n5(this.x8().w1(), "client finished", var3, 12));
   }
}
