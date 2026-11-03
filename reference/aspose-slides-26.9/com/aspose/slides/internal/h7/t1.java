package com.aspose.slides.internal.h7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.q1;

public class t1 implements t9 {
   private final com.aspose.slides.internal.t8.l6 n5;

   public t1(com.aspose.slides.internal.t8.l6 var1) {
      this.n5 = var1;
   }

   @Override
   public void n5(m1 var1, List<com.aspose.slides.internal.v2.s7> var2) {
      if (var2 != null && var2.size() == 4) {
         com.aspose.slides.internal.t8.a6 var3 = this.n5.n5();
         com.aspose.slides.internal.g9.h0 var4 = var3.k5();
         var4.n5(com.aspose.slides.internal.g9.c8.n5);
         float[] var5 = new float[4];

         for (int var6 = 0; var6 < var2.size(); var6++) {
            var5[var6] = ((com.aspose.slides.internal.v2.t2)var2.get_Item(var6)).u3();
         }

         float[] var10 = com.aspose.slides.internal.g9.c8.n5.n5(var5);
         int var7 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(var10[0] * 255.0F), 14);
         int var8 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(var10[1] * 255.0F), 14);
         int var9 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(var10[2] * 255.0F), 14);
         var3.l6(com.aspose.slides.internal.o9b.c8.n5(var3.p8().s7() & 255, var7, var8, var9).o8());
         var4.n5(var5);
         var3.n5(var4);
         this.n5.n5(var3);
      }
   }
}
