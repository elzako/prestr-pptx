package com.aspose.slides.internal.t6;

import com.aspose.slides.internal.b9.o5;
import com.aspose.slides.internal.b9.s9;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r5.u3;
import com.aspose.slides.internal.r6.u9;
import com.aspose.slides.internal.t5.t2;

public class l6 extends u3 {
   @Override
   protected void u3(s9 var1, u9 var2) {
      o5 var3 = (o5)var1;
      t2 var4 = var3.n5();
      var2.n5(new y2(0, 0, (int)var4.z1().n5(), (int)var4.z1().l6()));
      var2.l6(var2.a0().n3());
      var2.l6((float)(var4.z1().n5() & 4294967295L) / (float)(var4.t4().n5() & 4294967295L));
      var2.k5((float)(var4.z1().l6() & 4294967295L) / (float)(var4.t4().l6() & 4294967295L));
      var2.n5(var4.z1().k5().u3());
      var2.l6(var4.t4().k5().u3());
      if (var1.r4().l6() == 4 || var1.r4().l6() == 5) {
         var2.v4().n5(var1.r4().n3().n5().u3());
         var2.v4().l6((float)var1.r4().n3().n5().t2());
         var2.v4().k5((float)var1.r4().n3().n5().s7());
      }
   }
}
