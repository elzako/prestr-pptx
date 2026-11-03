package com.aspose.slides.internal.k6;

import com.aspose.slides.internal.a4.b3;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.ms.System.q1;

public abstract class n5 {
   protected final n5$n5 n5;

   protected n5(l6 var1) {
      this.n5 = new n5$1(this, var1);
   }

   public abstract void n5(b3 var1, com.aspose.slides.internal.x3.a6 var2);

   public abstract void n5(
      com.aspose.slides.internal.o9b.t4 var1, w1[] var2, y1 var3, int var4, com.aspose.slides.internal.j9e.t2 var5, com.aspose.slides.internal.x3.a6 var6
   );

   public abstract void n5(
      com.aspose.slides.internal.y6.l6 var1, w1[] var2, com.aspose.slides.internal.x4g.m1 var3, y1 var4, com.aspose.slides.internal.x3.a6 var5
   );

   public abstract void n5(y1 var1, com.aspose.slides.internal.x4g.m1 var2, int var3, com.aspose.slides.internal.x3.a6 var4);

   public final void n5(com.aspose.slides.internal.a4.e2 var1, com.aspose.slides.internal.x3.a6 var2) {
      com.aspose.slides.internal.j9e.t2 var3 = null;
      if ((var1.s7() & 4294967295L) != 4294967295L) {
         var2.u9((int)var1.s7());
         var3 = var2.y4();
      }

      com.aspose.slides.internal.l5.c8 var4 = var2.e2();
      w1[] var5 = com.aspose.slides.internal.x3.k5.n5(var1.e2());
      y1 var6 = var1.n3().n5().y4();
      if (com.aspose.slides.internal.v6g.k5.l6(var4, com.aspose.slides.internal.l5.u3.class)) {
         com.aspose.slides.internal.o9b.t4 var7 = ((com.aspose.slides.internal.l5.u3)var4).n5();
         this.n5(var7, var5, var6.y4(), var1.x8(), var3, var2);
      } else {
         com.aspose.slides.internal.x4g.m1 var20 = new com.aspose.slides.internal.x4g.m1(var6.y4(), var5);
         com.aspose.slides.internal.y6.l6 var8 = (com.aspose.slides.internal.y6.l6)var4;
         if (var8.l6() == 3 && ((com.aspose.slides.internal.d9.n5)var8).c8() < 96.0F && ((com.aspose.slides.internal.d9.n5)var8).t2() < 96.0F) {
            com.aspose.slides.internal.d9.n5 var9 = (com.aspose.slides.internal.d9.n5)var8;
            com.aspose.slides.internal.t5.t2 var10 = var9.x8().n5();
            double var11 = (float)(var10.z1().n5() & 4294967295L) / (float)(var10.t4().n5() & 4294967295L);
            double var13 = (float)(var10.z1().l6() & 4294967295L) / (float)(var10.t4().l6() & 4294967295L);
            float var15 = (float)(var10.u9().u9() / 100.0F * var11);
            float var16 = (float)(var10.u9().h0() / 100.0F * var13);
            float var17 = var9.u9() / var15;
            float var18 = var9.h0() / var16;
            com.aspose.slides.internal.x4g.m1 var19 = new com.aspose.slides.internal.x4g.m1();
            var19.n5(var17, var18);
            var20.l6(var19);
         }

         y1 var21 = this.n5(var5).y4();
         this.n5(var21.y4(), var20, 1, var2);
         this.n5(var8, var5, var20, var6.y4(), var2);
      }
   }

   private y1 n5(w1[] var1) {
      int var2 = var1.length;
      if (var2 == 0) {
         return y1.n5;
      }

      float var3 = var1[0].l6();
      float var4 = var1[0].k5();
      float var5 = var1[0].l6();
      float var6 = var1[0].k5();

      for (int var7 = 1; var7 < var2; var7++) {
         w1 var8 = var1[var7].u3();
         var3 = q1.l6(var3, var8.l6());
         var4 = q1.l6(var4, var8.k5());
         var5 = q1.n5(var5, var8.l6());
         var6 = q1.n5(var6, var8.k5());
      }

      return new y1(var3, var4, var5 - var3, var6 - var4);
   }
}
