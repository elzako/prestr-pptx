package com.aspose.slides.internal.u6;

import com.aspose.slides.internal.h2.a5;
import com.aspose.slides.internal.h2.h2;
import com.aspose.slides.internal.h2.v4;
import com.aspose.slides.ms.System.q1;

public class w1$n5 extends h2 implements Cloneable {
   public w1$n5(int var1) {
      super(var1);
   }

   @Override
   public a5 n5(com.aspose.slides.internal.e5.w1 var1) {
      com.aspose.slides.internal.e5.t9 var2 = var1.n5();
      return v4.l6(((s7)var2.s_()).n5().n5());
   }

   @Override
   public a5 n5(com.aspose.slides.internal.e5.w1 var1, String var2, com.aspose.slides.internal.e5.t9 var3) {
      a5 var4 = super.n5(var1, var2, var3);
      int var5 = var4.u9().u3();
      int var6 = var1.u3(165).u9().u3();
      int var7 = var1.n5().z3();
      if (var7 == 76 || var7 == 75) {
         s7 var8 = (s7)var1.l6();
         k5 var9 = var8.n5();
         int var10 = var5 - 1 + var6;

         for (int var11 = var5; var11 <= var10; var11++) {
            if (var9.n5(var11)) {
               x8 var12 = j5.n5(var3.q_().m1());
               var12.l6(this, var1.n5().t9(), var11, var1.n5().m_());
            }
         }
      }

      return var4;
   }

   @Override
   public a5 l6(a5 var1, com.aspose.slides.internal.e5.w1 var2, com.aspose.slides.internal.e5.t9 var3) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.h2.z8.class)) {
         return com.aspose.slides.internal.h2.m3.n5(var1);
      }

      Object var4 = var1.h0();
      if (var4 != null) {
         int var5 = com.aspose.slides.internal.v6g.k5.u3(
            q1.u3(
               com.aspose.slides.internal.v6g.k5.l6(var4, Float.class)
                  ? com.aspose.slides.internal.v6g.k5.u3(var4, float.class).floatValue()
                  : ((Integer)var4).intValue()
            ),
            14
         );
         int var6 = var2.n5().z3();
         if (var5 <= 0) {
            if (var6 != 75 && var6 != 76) {
               var5 = 1;
            } else {
               s7 var7 = (s7)var2.l6();
               k5 var8 = var7.n5();
               var5 = var8.n5();
            }

            x8 var9 = j5.n5(var3.q_().m1());
            var9.n5(this, var2.n5().t9(), var4, var5, var2.n5().m_());
         }

         return v4.l6(var5);
      } else {
         return this.n5(var1, var2, var3);
      }
   }
}
