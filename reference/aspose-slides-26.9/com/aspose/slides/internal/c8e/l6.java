package com.aspose.slides.internal.c8e;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.ms.System.q1;

public class l6 {
   public static List<Long> n5(w1[] var0, y1 var1, m1 var2) {
      List var3 = new List();
      var2.n5(var0);

      for (int var4 = 0; var4 < var0.length; var4++) {
         var0[var4].n5(var0[var4].l6() - var1.x8());
         var0[var4].l6(var0[var4].k5() - var1.n3());
         var3.addItem(com.aspose.slides.internal.v6g.k5.u9(var0[var4].l6() * 12700.0F, 13));
         var3.addItem(com.aspose.slides.internal.v6g.k5.u9(var0[var4].k5() * 12700.0F, 13));
      }

      return var3;
   }

   public static float n5(w1 var0, w1 var1) {
      return (float)q1.z3((var1.l6() - var0.l6()) * (var1.l6() - var0.l6()) + (var1.k5() - var0.k5()) * (var1.k5() - var0.k5()));
   }

   public static float l6(w1 var0, w1 var1) {
      return (float)q1.u3(var1.k5() - var0.k5(), var1.l6() - var0.l6());
   }

   public static f2 n5(w1 var0, w1 var1, float var2) {
      float var3 = l6(var0.u3(), var1.u3());
      return new f2((float)(var2 * q1.c8(var3 + (Math.PI / 2))), (float)(var2 * q1.h0(var3 + (Math.PI / 2))));
   }
}
