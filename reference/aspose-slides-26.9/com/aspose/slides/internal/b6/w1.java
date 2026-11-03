package com.aspose.slides.internal.b6;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Queue;
import com.aspose.slides.ms.System.q1;

public class w1 extends z1 {
   @Override
   public void l6(com.aspose.slides.internal.i3.v4 var1, com.aspose.slides.internal.o9b.z1 var2, com.aspose.slides.internal.g1.u9 var3) {
      com.aspose.slides.internal.i3.z8 var4 = (com.aspose.slides.internal.i3.z8)var1;
      int var5 = 0;
      com.aspose.slides.internal.o9b.i1 var6 = com.aspose.slides.internal.v6g.k5.n5(var3.c8(), com.aspose.slides.internal.o9b.i1.class);
      if (var6 != null) {
         var5 = var6.h0().h0();
         int var7 = var4.n5().u9().h0();
         com.aspose.slides.internal.o9b.w1[] var8 = new com.aspose.slides.internal.o9b.w1[]{new com.aspose.slides.internal.o9b.w1(var4.k5(), var4.l6())};
         var2.m1().n5(var8);
         int var9 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(var8[0].l6()), 14);
         int var10 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(var8[0].k5()), 14);
         com.aspose.slides.internal.o9b.y2 var11 = new com.aspose.slides.internal.o9b.y2(0, 0, var3.z3().e2(), var3.z3().h0());
         com.aspose.slides.internal.j9e.n5 var12 = var3.z3().n5(var11.n3(), 3, 2498570);
         int[] var13 = new int[var12.a6() / 4 * var12.n5()];
         com.aspose.slides.internal.e3m.n5.n5(var12.u3(), var13, 0, var13.length);
         int var14 = var13[var9 + var10 * var12.a6() / 4];
         if (var14 != var7) {
            List var15 = new List();
            Queue var16 = new Queue();
            var16.enqueue(new com.aspose.slides.internal.o9b.j5(var9, var10));

            while (var16.size() > 0) {
               com.aspose.slides.internal.o9b.j5 var17 = ((com.aspose.slides.internal.o9b.j5)var16.dequeue()).k5();
               if (var7 != var13[var17.n5() + var17.l6() * var12.a6() / 4]) {
                  var13[var17.n5() + var17.l6() * var12.a6() / 4] = var5;
                  var15.addItem(var17.k5());
                  com.aspose.slides.internal.o9b.j5 var18 = new com.aspose.slides.internal.o9b.j5(var17.n5() - 1, var17.l6());
                  com.aspose.slides.internal.o9b.j5 var19 = new com.aspose.slides.internal.o9b.j5(var17.n5() + 1, var17.l6());
                  com.aspose.slides.internal.o9b.j5 var20 = new com.aspose.slides.internal.o9b.j5(var17.n5(), var17.l6() - 1);
                  com.aspose.slides.internal.o9b.j5 var21 = new com.aspose.slides.internal.o9b.j5(var17.n5(), var17.l6() + 1);
                  n5(var18.k5(), var11.n3(), var16, var15);
                  n5(var19.k5(), var11.n3(), var16, var15);
                  n5(var20.k5(), var11.n3(), var16, var15);
                  n5(var21.k5(), var11.n3(), var16, var15);
               }
            }

            com.aspose.slides.internal.e3m.n5.n5(var13, 0, var12.u3(), var13.length);
         }

         var3.z3().n5(var12);
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
