package com.aspose.slides.internal.o2b;

import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.a0;
import com.aspose.slides.internal.r1x.f0;

public class t9 extends y4 {
   public t9(f0 var1, com.aspose.slides.internal.f2i.n5 var2, y2 var3) {
      super(var1, var2, var3.n3());
   }

   @Override
   public void u9() {
      com.aspose.slides.internal.f2i.n5 var1 = this.t9();
      int var2 = 3;
      if (var1.n5(262)) {
         var2 = var1.y2();
      }

      com.aspose.slides.internal.f2i.n5 var3 = this.n5();
      var3.a6(var2);
      com.aspose.slides.internal.u2w.a6[] var4 = var3.u6();
      com.aspose.slides.internal.u2w.a6[] var5 = a0.n5(com.aspose.slides.internal.u2w.a6.class, com.aspose.slides.ms.System.u3.n5(var4), new z1(this));
      this.t4().addItem(var5[0]);
   }

   @Override
   public void y4() {
      com.aspose.slides.internal.f2i.n5 var1 = this.t9();
      com.aspose.slides.internal.f2i.n5 var2 = this.n5();
      int[] var3 = var1.k7();
      var2.n5(var3 != null && (var3[0] & 65535) == 8 ? com.aspose.slides.internal.r1x.n3.l6() : com.aspose.slides.internal.r1x.n3.n5());
      int[] var4 = var2.z8();
      if (var1.n5(320)) {
         var4 = var1.z8();
      }

      var2.k5(var4);
      com.aspose.slides.internal.u2w.a6[] var5 = var2.u6();
      com.aspose.slides.internal.u2w.a6[] var6 = a0.n5(com.aspose.slides.internal.u2w.a6.class, com.aspose.slides.ms.System.u3.n5(var5), new t4(this));
      this.t4().addItem(var6[0]);
   }
}
