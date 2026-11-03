package com.aspose.slides.internal.f6;

import com.aspose.slides.internal.e1.s7;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.internal.z4.j5;
import com.aspose.slides.internal.z4.s3;
import com.aspose.slides.internal.z4.t4;

public class k5 extends l6 {
   private boolean k5 = false;
   private u9 u3;
   private u9 a6;

   public k5(j5 var1, s7 var2) {
      super(var1, var2);
      this.k5 = var2.n5();
      this.u9();
   }

   @Override
   protected int n5() {
      return 0;
   }

   @Override
   protected void l6(t4 var1) {
      if (this.k5) {
         var1.k5("/DV", this.k5 ? "/On" : "/Off");
      }

      var1.n5("/AP");
      var1.c8();
      var1.n5("/N");
      var1.c8();
      var1.l6("/Off");
      var1.l6(this.a6.t2());
      var1.l6("/On");
      var1.l6(this.u3.t2());
      var1.t2();
      var1.t2();
      var1.k5("/AS", this.k5 ? "/On" : "/Off");
   }

   @Override
   protected void k5(t4 var1) {
      this.u3.n5(var1);
      this.a6.n5(var1);
   }

   private void u9() {
      y1 var1 = new y1(0.0F, 0.0F, this.u3().s7(), this.u3().k5());
      this.a6 = new u9(this.l6);
      this.a6.n5(var1.y4());
      this.a6.n5(new e2());
      s3 var2 = new s3(this.a6.l6());
      n5(var2, this.a6.n5().y4());
      this.u3 = new u9(this.l6);
      this.u3.n5(var1.y4());
      this.u3.n5(new e2());
      s3 var3 = new s3(this.u3.l6());
      n5(var3, var1.y4());
      l6(var3, var1.y4());
   }

   private static void l6(s3 var0, y1 var1) {
      var0.n5("0 G ");
      var0.n5(var1.a6());
      var0.u9();
      var0.n5(var1.t2());
      var0.n5(" m ");
      var0.n5(var1.h0());
      var0.u9();
      var0.n5(var1.l6());
      var0.n5(" l s ");
      var0.n5(var1.a6());
      var0.u9();
      var0.n5(var1.l6());
      var0.n5(" m ");
      var0.n5(var1.h0());
      var0.u9();
      var0.n5(var1.t2());
      var0.n5(" l s ");
   }
}
