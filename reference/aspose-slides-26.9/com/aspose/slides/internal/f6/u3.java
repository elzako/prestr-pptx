package com.aspose.slides.internal.f6;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.e1.x8;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.internal.z4.j5;
import com.aspose.slides.internal.z4.s3;
import com.aspose.slides.internal.z4.t4;

public class u3 extends l6 {
   private final int k5;
   private final List<String> u3;
   private u9 a6;
   private final com.aspose.slides.internal.p1s.l6 u9;
   private final com.aspose.slides.internal.p1s.n5 h0 = com.aspose.slides.internal.p1s.n5.c8;

   public u3(j5 var1, x8 var2) {
      super(var1, var2);
      this.k5 = var2.k5();
      this.u3 = var2.l6();
      this.u9 = var2.n5();
      this.u9();
      this.t9();
   }

   @Override
   protected int n5() {
      return 2;
   }

   @Override
   protected int l6() {
      int var1 = 131072;
      return 131072 | super.l6();
   }

   @Override
   protected void l6(t4 var1) {
      var1.n5("/Opt [");

      for (int var2 = 0; var2 < this.u3.size(); var2++) {
         var1.u3(this.u3.get_Item(var2));
         var1.u9();
      }

      var1.n5("]");
      var1.u3("/V", this.u3.get_Item(this.k5));
      var1.n5("/DA", this.n5(this.u9, this.h0), false);
      var1.n5("/AP");
      var1.c8();
      var1.l6("/N");
      var1.n5(this.a6.t2());
      var1.t2();
   }

   @Override
   protected void k5(t4 var1) {
      this.a6.n5(var1);
   }

   private void u9() {
      float var1 = this.u3().h0() + 10.0F;
      float var2 = this.u3().l6() + 2.0F;
      if (var2 > this.n5.u9()) {
         var2 = this.n5.u9();
      }

      if (var1 > this.n5.a6()) {
         var1 = this.n5.a6();
      }

      this.n5(y1.n5(this.u3().a6(), this.u3().t2(), var1, var2).y4());
   }

   private void t9() {
      this.a6 = new u9(this.l6);
      this.a6.n5(new y1(0.0F, 0.0F, this.u3().s7(), this.u3().k5()));
      this.a6.n5(this.z1());
   }

   private e2 z1() {
      e2 var1 = new e2();
      s3 var2 = new s3(var1);
      n5(var2, this.a6.n5().y4());
      n5(var2);
      n5(var2, this.h0);
      com.aspose.slides.internal.c0.l6 var3 = this.n5(var2, this.u9);
      n5(var2, this.u3().k5() - this.u9.c8() - 1.0F);
      n5(var2, 0.0F, 0.0F);
      n5(var2, this.u3.get_Item(this.k5), (com.aspose.slides.internal.c0.l6)var3);
      l6(var2);
      return var1;
   }
}
