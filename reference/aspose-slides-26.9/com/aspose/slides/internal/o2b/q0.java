package com.aspose.slides.internal.o2b;

import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.a0;
import com.aspose.slides.internal.r1x.f0;

public class q0 extends y4 {
   private static int[] n5 = new int[]{8, 8, 8};

   public q0(f0 var1, com.aspose.slides.internal.f2i.n5 var2, y2 var3) {
      super(var1, var2, var3.n3());
      this.n5(new com.aspose.slides.internal.f2i.n5(14));
   }

   @Override
   public void u3() {
      com.aspose.slides.internal.f2i.n5 var1 = this.t9();
      com.aspose.slides.internal.f2i.n5 var2 = this.l6(var1);
      com.aspose.slides.internal.u2w.a6[] var3 = var2.u6();
      com.aspose.slides.internal.u2w.a6[] var4 = a0.n5(com.aspose.slides.internal.u2w.a6.class, com.aspose.slides.ms.System.u3.n5(var3), new z3(this));
      this.t4().addItem(var4[0]);
   }

   @Override
   public void u9() {
      com.aspose.slides.internal.f2i.n5 var1 = this.t9();
      int var2 = 2;
      if (var1.n5(262)) {
         var2 = var1.y2();
      }

      com.aspose.slides.internal.f2i.n5 var3 = this.n5();
      var3.a6(var2);
      com.aspose.slides.internal.u2w.a6[] var4 = var3.u6();
      com.aspose.slides.internal.u2w.a6[] var5 = a0.n5(com.aspose.slides.internal.u2w.a6.class, com.aspose.slides.ms.System.u3.n5(var4), new m1(this));
      this.t4().addItem(var5[0]);
   }

   @Override
   public void e2() {
      com.aspose.slides.internal.f2i.n5 var1 = this.t9();
      com.aspose.slides.internal.f2i.n5 var2 = this.l6(var1);
      com.aspose.slides.internal.u2w.a6[] var3 = var2.u6();
      com.aspose.slides.internal.u2w.a6[] var4 = a0.n5(com.aspose.slides.internal.u2w.a6.class, com.aspose.slides.ms.System.u3.n5(var3), new k7(this));
      this.t4().addItem(var4[0]);
   }

   private com.aspose.slides.internal.f2i.n5 l6(com.aspose.slides.internal.f2i.n5 var1) {
      int[] var2 = n5;
      if (var1.n5(258)) {
         var2 = var1.k7();
      }

      com.aspose.slides.internal.f2i.n5 var3 = this.n5();
      var3.l6(var2);
      return var3;
   }
}
