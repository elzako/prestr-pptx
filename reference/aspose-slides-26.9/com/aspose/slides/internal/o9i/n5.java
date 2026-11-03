package com.aspose.slides.internal.o9i;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.e2l.a6;
import com.aspose.slides.internal.e2l.c8;
import com.aspose.slides.internal.e2l.h0;
import com.aspose.slides.internal.e2l.u3;
import com.aspose.slides.internal.v2x.k5;
import com.aspose.slides.internal.v2x.u9;
import com.aspose.slides.internal.y5s.a0;
import com.aspose.slides.internal.y5s.e2;
import com.aspose.slides.internal.y5s.n3;

public class n5 {
   public n3 n5(a0 var1, e2 var2) {
      u3 var3 = u3.n5(var1, false);
      com.aspose.slides.internal.j3b.u3 var4 = null;
      if (var3.u3()) {
         var4 = a6.n5(var1, var3.a6());
      }

      List var5 = new List();
      boolean var6 = false;
      k5 var7 = null;

      while (var1.n5() < var1.k5()) {
         if (var1.n5() == var1.k5() - 1L) {
            var6 = var1.u3() == 59;
         } else {
            c8 var8 = com.aspose.slides.internal.e2l.l6.n5(var1.l6());
            if (var8 == null) {
               byte[] var12 = new byte[2];
               if (var1.l6(var12) != 2 || com.aspose.slides.internal.v6g.k5.u3(var12[0], 6) != com.aspose.slides.internal.v6g.k5.u3((byte)33, 6)) {
                  break;
               }

               byte[] var10 = a6.n5(var1);
               u9 var11 = new u9(var12[1], var10);
               var5.addItem(var11);
            } else {
               h0 var9 = var8.n5(var1, var4);
               if (com.aspose.slides.internal.v6g.k5.l6(var9, k5.class) && var7 == null) {
                  var7 = com.aspose.slides.internal.v6g.k5.n5(var9, k5.class);
               }

               var5.addItem(var9);
            }
         }
      }

      return new com.aspose.slides.internal.e2l.u9(var3, (h0[])var5.toArray(new h0[0]), var4, var6, var7);
   }
}
