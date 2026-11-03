package com.aspose.slides.internal.b6;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Queue;
import com.aspose.slides.ms.System.q1;

public class m3 extends z1 {
   @Override
   public void l6(com.aspose.slides.internal.i3.v4 var1, com.aspose.slides.internal.o9b.z1 var2, com.aspose.slides.internal.g1.u9 var3) {
      com.aspose.slides.internal.i3.m1 var4 = (com.aspose.slides.internal.i3.m1)var1;
      int var5 = var4.n5();
      int var6 = 0;
      com.aspose.slides.internal.o9b.i1 var7 = com.aspose.slides.internal.v6g.k5.n5(var3.c8(), com.aspose.slides.internal.o9b.i1.class);
      if (var7 != null) {
         var6 = var7.h0().h0();
         int var8 = var4.l6().u9().h0();
         com.aspose.slides.internal.o9b.w1[] var9 = new com.aspose.slides.internal.o9b.w1[]{new com.aspose.slides.internal.o9b.w1(var4.u3(), var4.k5())};
         var2.m1().n5(var9);
         int var10 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(var9[0].l6()), 14);
         int var11 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(var9[0].k5()), 14);
         com.aspose.slides.internal.o9b.y2 var12 = new com.aspose.slides.internal.o9b.y2(0, 0, var3.z3().e2(), var3.z3().h0());
         com.aspose.slides.internal.j9e.n5 var13 = var3.z3().n5(var12.n3(), 3, 2498570);
         int[] var14 = new int[var13.a6() / 4 * var13.n5()];
         com.aspose.slides.internal.e3m.n5.n5(var13.u3(), var14, 0, var14.length);
         int var15 = var14[var10 + var11 * var13.a6() / 4];
         if (var5 == 0 && var15 != var8 || var5 == 1 && var15 == var8) {
            List var16 = new List();
            Queue var17 = new Queue();
            var17.enqueue(new com.aspose.slides.internal.o9b.j5(var10, var11));

            while (var17.size() > 0) {
               com.aspose.slides.internal.o9b.j5 var18 = ((com.aspose.slides.internal.o9b.j5)var17.dequeue()).k5();
               if (var5 == 0 && var8 != var14[var18.n5() + var18.l6() * var13.a6() / 4] || var5 == 1 && var14[var18.n5() + var18.l6() * var13.a6() / 4] == var8
                  )
                {
                  var14[var18.n5() + var18.l6() * var13.a6() / 4] = var6;
                  var16.addItem(var18.k5());
                  com.aspose.slides.internal.o9b.j5 var19 = new com.aspose.slides.internal.o9b.j5(var18.n5() - 1, var18.l6());
                  com.aspose.slides.internal.o9b.j5 var20 = new com.aspose.slides.internal.o9b.j5(var18.n5() + 1, var18.l6());
                  com.aspose.slides.internal.o9b.j5 var21 = new com.aspose.slides.internal.o9b.j5(var18.n5(), var18.l6() - 1);
                  com.aspose.slides.internal.o9b.j5 var22 = new com.aspose.slides.internal.o9b.j5(var18.n5(), var18.l6() + 1);
                  n5(var19.k5(), var12.n3(), var17, var16);
                  n5(var20.k5(), var12.n3(), var17, var16);
                  n5(var21.k5(), var12.n3(), var17, var16);
                  n5(var22.k5(), var12.n3(), var17, var16);
               }
            }

            com.aspose.slides.internal.e3m.n5.n5(var14, 0, var13.u3(), var14.length);
         }

         var3.z3().n5(var13);
      }
   }

   private static void n5(
      com.aspose.slides.internal.o9b.j5 var0,
      com.aspose.slides.internal.o9b.y2 var1,
      Queue<com.aspose.slides.internal.o9b.j5> var2,
      List<com.aspose.slides.internal.o9b.j5> var3
   ) {
      if (var1.l6(var0.k5()) && !var2.contains(var0.k5()) && !var3.containsItem(var0.k5())) {
         var2.enqueue(var0.k5());
      }
   }
}
