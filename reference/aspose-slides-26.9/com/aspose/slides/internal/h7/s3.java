package com.aspose.slides.internal.h7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.q1;

public class s3 implements t9 {
   private final com.aspose.slides.internal.t8.l6 n5;

   public s3(com.aspose.slides.internal.t8.l6 var1) {
      this.n5 = var1;
   }

   @Override
   public void n5(m1 var1, List<com.aspose.slides.internal.v2.s7> var2) {
      if (var2 != null && var2.size() == 4) {
         com.aspose.slides.internal.g9.c8 var3 = com.aspose.slides.internal.g9.c8.n5;
         com.aspose.slides.internal.t8.a6 var4 = this.n5.n5();
         com.aspose.slides.internal.g9.h0 var5 = var4.u3();
         var5.n5(var3);
         float[] var6 = new float[4];

         for (int var7 = 0; var7 < var2.size(); var7++) {
            var6[var7] = ((com.aspose.slides.internal.v2.t2)var2.get_Item(var7)).u3();
         }

         var5.n5(var6);
         float[] var11 = com.aspose.slides.internal.g9.c8.n5.n5(var6);
         int var8 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(var11[0] * 255.0F), 14);
         int var9 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(var11[1] * 255.0F), 14);
         int var10 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(var11[2] * 255.0F), 14);
         var4.n5(com.aspose.slides.internal.o9b.c8.n5(var4.a0().s7() & 255, var8, var9, var10).o8());
         var4.l6(var5);
         this.n5.n5(var4);
      }
   }
}
