package com.aspose.slides.internal.q8o;

import com.aspose.slides.internal.o8m.s0;
import com.aspose.slides.internal.o8m.z6;
import com.aspose.slides.internal.y4g.v8;

public class a6 extends com.aspose.slides.internal.n4m.n5 {
   public a6(v8 var1) {
      super(var1, (byte)16);
   }

   @Override
   protected void t2() {
      this.n5(false);
   }

   @Override
   protected void s7() {
      this.n5(true);
   }

   public void n5(boolean var1) {
      byte[] var2 = this.x8().p8().n5().z3();
      z6 var3 = null;
      if (this.x8().x8().n5()) {
         var3 = new com.aspose.slides.internal.x8w.u9();
         var3.n5(this.x8().x8().u3().n5());
      } else {
         var3 = this.x8().x8().k5();
      }

      s0 var4 = new s0(var3);
      byte[] var5 = var4.n5(var2);
      if (var1) {
         this.n5(com.aspose.slides.internal.v6g.k5.l6(var5.length, 9));
      }

      this.n5(var5);
      this.x8().p8().n5().n5(var2);
      this.x8().p8().n5().n5();
      var3.l6();
   }
}
