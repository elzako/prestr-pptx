package com.aspose.slides.internal.h7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.d1;

public class w1 implements t9 {
   private final com.aspose.slides.internal.t8.l6 n5;
   private final Stack<com.aspose.slides.internal.e7.t2> l6;

   public w1(com.aspose.slides.internal.t8.l6 var1, Stack<com.aspose.slides.internal.e7.t2> var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public final void n5(m1 var1, List<com.aspose.slides.internal.v2.s7> var2) {
      if (var2 != null && var2.size() >= 1) {
         com.aspose.slides.internal.t8.a6 var11 = this.n5.n5();
         com.aspose.slides.internal.v2.s7 var4 = (com.aspose.slides.internal.v2.s7)var2.get_Item(0);
         if (com.aspose.slides.internal.v6g.k5.l6(var4, com.aspose.slides.internal.v2.c8.class)) {
            String var5 = ((com.aspose.slides.internal.v2.c8)var4).n5();
            com.aspose.slides.internal.e7.t2 var6 = this.l6.peek();
            com.aspose.slides.internal.e7.u3 var7 = var6.k5().get_Item(var5);
            com.aspose.slides.internal.v2.k5 var8 = var7.n5();
            if (var8.n5(com.aspose.slides.internal.v2.c8.k9)) {
               var11.l6(var7.l6());
            }

            if (var8.n5(com.aspose.slides.internal.v2.c8.q5)) {
               int var9 = var7.k5();
               var11.n5(com.aspose.slides.internal.g4.c8.n5(var9));
            }

            if (var8.n5(com.aspose.slides.internal.v2.c8.f7)) {
               int var12 = var7.u3();
               var11.l6(com.aspose.slides.internal.g4.c8.l6(var12));
            }

            if (var8.n5(com.aspose.slides.internal.v2.c8.m5)) {
               var11.k5(var7.a6());
            }

            if (var8.n5(com.aspose.slides.internal.v2.c8.f3c)) {
               String var13 = var7.u9();
               int var10 = (int)com.aspose.slides.ms.System.d5.parse(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.v5.l6.class), var13);
               var11.k5(var10);
            }

            if (var8.n5(com.aspose.slides.internal.v2.c8.f9)) {
               var11.n5((double)var7.h0());
            }

            if (var8.n5(com.aspose.slides.internal.v2.c8.w7)) {
               var11.k5(var7.c8());
            }

            if (var8.n5(com.aspose.slides.internal.v2.c8.e3)) {
               var11.u3(var7.s7());
            }

            if (var8.n5(com.aspose.slides.internal.v2.c8.c7)) {
            }

            if (var8.n5(com.aspose.slides.internal.v2.c8.k6)) {
               var11.l6((double)var7.x8());
            }

            if (var8.n5(com.aspose.slides.internal.v2.c8.s5g)) {
               var11.k5((double)var7.n3());
            }

            if (var8.n5(com.aspose.slides.internal.v2.c8.r6i)) {
               var11.n5(var7.y4());
            }

            if (var8.n5(com.aspose.slides.internal.v2.c8.u8)) {
               var11.n5((float)var7.z3().n5());
               var11.n5(com.aspose.slides.internal.g4.c8.n5(var7.z3(), var7.l6()));
            }

            if (var8.n5(com.aspose.slides.internal.v2.c8.v0)) {
               float var14 = var7.m1();
               int var17 = com.aspose.slides.internal.v6g.k5.u3(var14 * 255.0F, 13);
               var11.l6(com.aspose.slides.internal.o9b.c8.n5(var17, var11.p8().x8() & 255, var11.p8().n3() & 255, var11.p8().y4() & 255).o8());
               var11.u3(var17);
            }

            if (var8.n5(com.aspose.slides.internal.v2.c8.f0)) {
               float var15 = var7.k7();
               int var18 = com.aspose.slides.internal.v6g.k5.u3(var15 * 255.0F, 13);
               var11.n5(com.aspose.slides.internal.o9b.c8.n5(var18, var11.a0().x8() & 255, var11.a0().n3() & 255, var11.a0().y4() & 255).o8());
               var11.a6(var18);
            }

            if (var8.n5(com.aspose.slides.internal.v2.c8.a6)) {
               var11.l6(var7.e2());
            }

            if (var8.n5(com.aspose.slides.internal.v2.c8.g4u)) {
            }

            if (var8.n5(com.aspose.slides.internal.v2.c8.k4s)) {
               com.aspose.slides.internal.v5.n5 var16 = var7.t9();
               if (var16 != null) {
                  var16.n5(var11.n5().u9());
               }

               var11.n5(var16);
            }

            if (var8.n5(com.aspose.slides.internal.v2.c8.p8)) {
               var11.n5(var7.z1());
            }

            if (var8.n5(com.aspose.slides.internal.v2.c8.y8m) && !var7.n5().n5(com.aspose.slides.internal.v2.c8.c7f)) {
               var11.n5(var7.t4());
            }

            if (var8.n5(com.aspose.slides.internal.v2.c8.c7f)) {
               var11.n5(var7.q0());
            }

            this.n5.n5(var11);
         }
      } else {
         String var3 = d1.n5("Operand missing for operator '{0}'", new Object[]{var1.n5});
         throw new ArgumentNullException(var3);
      }
   }
}
