package com.aspose.slides.internal.g0;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.e1.k7;
import com.aspose.slides.internal.e1.r4;
import com.aspose.slides.internal.e1.t2;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.s5.c8;

public class l6 {
   private final Dictionary<Integer, t2> n5 = new Dictionary<>();

   public final t2 n5(k7 var1, k5 var2, t2[] var3) {
      short var4 = 21600;
      com.aspose.slides.internal.y3.u3 var5 = new com.aspose.slides.internal.y3.u3(var1.u3());
      return this.n5(var1, var2, new f2(21600.0F, 21600.0F), var5.n3().y4(), new y1(w1.n5.u3(), var5.q0().a6()), var3);
   }

   public final t2 n5(k7 var1, k5 var2, f2 var3, y1 var4, y1 var5, t2[] var6) {
      int var7 = c8.n5(var1.u3(), null);
      if (!this.n5.tryGetValue(var7, var6)) {
         com.aspose.slides.internal.y3.u3 var8 = new com.aspose.slides.internal.y3.u3(var1.u3());
         if (var8.u3()) {
            var2.n5(var1.l6().a6());
         }

         var6[0] = com.aspose.slides.internal.g0.n5.n5(var8, var3.a6(), var4.y4(), var2, var5.y4());
         this.n5.set_Item(var7, var6[0]);
      }

      t2 var11 = new t2();
      var11.n5(var6[0]);
      t2 var9 = com.aspose.slides.internal.v6g.k5.n5(var1.y2(), t2.class);
      if (var9 != null) {
         var9.l6(var1);
         var9.n5(var11);
      }

      y1 var10 = new y1(0.0F, 0.0F, var3.l6(), var3.k5());
      if (!c8.n5(var1.h0())) {
         var1.h0().n5(var10.y4()).a6(var10);
         var11.n5(r4.n5(var10.y4()));
      }

      var11.n5(new com.aspose.slides.internal.w0.c8());
      var11.u3().l6(var1.n5().l6(), var1.n5().k5(), 0);
      var11.u3().n5(var1.l6().l6() / var10.s7(), var1.l6().k5() / var10.k5(), 0);
      var11.u3().l6(-var10.x8(), -var10.n3(), 0);
      var11.n5(var1.c8());
      return var11;
   }
}
