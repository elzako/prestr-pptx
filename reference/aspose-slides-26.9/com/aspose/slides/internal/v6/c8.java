package com.aspose.slides.internal.v6;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Queue;
import com.aspose.slides.internal.b9.s9;
import com.aspose.slides.internal.b9.z7;
import com.aspose.slides.ms.System.q1;

public abstract class c8 extends com.aspose.slides.internal.r5.a6 {
   protected c8(com.aspose.slides.internal.r5.y4 var1) {
      super(var1);
   }

   @Override
   public void u9(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      z7 var3 = (z7)var1;
      long var4 = var3.k5();
      int var6 = 0;
      com.aspose.slides.internal.o9b.i1 var7 = com.aspose.slides.internal.v6g.k5.n5(var2.t2(), com.aspose.slides.internal.o9b.i1.class);
      if (var7 != null) {
         var6 = var7.h0().h0();
         int var8 = var3.l6().u9().h0();
         com.aspose.slides.internal.o9b.w1[] var9 = new com.aspose.slides.internal.o9b.w1[]{var3.n5().u3()};
         this.n5(var9, var2);
         int var10 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(var9[0].l6()), 14);
         int var11 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(var9[0].k5()), 14);
         com.aspose.slides.internal.o9b.y2 var12 = new com.aspose.slides.internal.o9b.y2(0, 0, var2.z7().e2(), var2.z7().h0());
         com.aspose.slides.internal.j9e.n5 var13 = var2.z7().n5(var12.n3(), 3, 2498570);
         int[] var14 = new int[var13.a6() / 4 * var13.n5()];
         com.aspose.slides.internal.e3m.n5.n5(var13.u3(), var14, 0, var14.length);
         int var15 = var14[var10 + var11 * var13.a6() / 4];
         if (var4 == 0L && var15 != var8 || var4 == 1L && var15 == var8) {
            List var16 = new List();
            Queue var17 = new Queue();
            var17.enqueue(new com.aspose.slides.internal.o9b.j5(var10, var11));

            while (var17.size() > 0) {
               com.aspose.slides.internal.o9b.j5 var18 = ((com.aspose.slides.internal.o9b.j5)var17.dequeue()).k5();
               if (var4 == 0L && var8 != var14[var18.n5() + var18.l6() * var13.a6() / 4]
                  || var4 == 1L && var14[var18.n5() + var18.l6() * var13.a6() / 4] == var8) {
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

         var2.z7().n5(var13);
      }
   }

   @Override
   public boolean h0(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      return false;
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

   protected abstract void n5(com.aspose.slides.internal.o9b.w1[] var1, com.aspose.slides.internal.r6.u9 var2);
}
