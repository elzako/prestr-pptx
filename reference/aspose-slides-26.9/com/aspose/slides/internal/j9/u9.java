package com.aspose.slides.internal.j9;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.h2.b3;
import com.aspose.slides.internal.p3.t1;
import com.aspose.slides.internal.u6.m3;
import com.aspose.slides.internal.u6.y1;
import com.aspose.slides.ms.System.q1;

public class u9 {
   private static final com.aspose.slides.internal.v8.u9 n5 = com.aspose.slides.internal.v8.u9.n5(0, 0, Integer.MAX_VALUE);
   private final com.aspose.slides.internal.u6.a6[] l6;
   private final y4 k5;
   private final e2 u3;

   public u9(y4 var1, com.aspose.slides.internal.u6.a6[] var2, e2 var3) {
      this.k5 = var1;
      this.l6 = var2;
      this.u3 = var3;
   }

   public final List<com.aspose.slides.internal.r4.u9> n5(t1 var1, int var2, int var3) {
      List var4 = new List();
      this.n5(var1, var2, var3, var4);
      var1.l6(this.l6[0].h0());
      var1.n5(this.l6[this.l6.length - 1].c8());
      int var5 = 9;
      y1 var6 = this.l6[0].k5();
      if (var6 != null) {
         var5 = var6.t1();
      }

      var1.t2(com.aspose.slides.internal.v3.n5.n5(var5, this.l6[0].s7()));
      int var7 = 9;
      y1 var8 = this.l6[this.l6.length - 1].k5();
      if (var8 != null) {
         var7 = var8.u6();
      }

      var1.s7(com.aspose.slides.internal.v3.n5.n5(var7, this.l6[this.l6.length - 1].x8()));
      return var4;
   }

   private void n5(t1 var1, int var2, int var3, List<com.aspose.slides.internal.r4.u9> var4) {
      for (int var5 = 0; var5 < this.l6.length; var5++) {
         com.aspose.slides.internal.u6.a6 var6 = this.l6[var5];
         com.aspose.slides.internal.r4.u3 var7 = new com.aspose.slides.internal.r4.u3<>(var6.u9());

         while (var7.l6()) {
            com.aspose.slides.internal.u6.c8 var8 = (com.aspose.slides.internal.u6.c8)var7.k5();
            if (var8.k5()) {
               com.aspose.slides.internal.u6.y4 var9 = var8.l6();
               var9.z8();
               var9.e2().n5(this.k5);
               int var10 = 0;
               com.aspose.slides.internal.r4.u3 var11 = new com.aspose.slides.internal.r4.u3<>(this.k5.y1().z7(), var9.m1());
               int var12 = 0;

               for (int var13 = var9.u9().z7(); var12 < var13; var12++) {
                  var10 += ((m3)var11.k5()).i1().l6(this.k5);
               }

               t1 var15 = new t1(0);
               var15.n5(var1.q0());
               var15.l6(var10);
               List var16 = var9.e2().n5(var15, var2);
               var9.n5(var16);
            }
         }
      }

      this.n5();
      List var14 = this.u3.n5(var1, this.l6, var3);
      var4.addRange(var14);
   }

   private void n5() {
      com.aspose.slides.internal.v8.u9[] var1 = new com.aspose.slides.internal.v8.u9[this.l6.length];

      for (int var2 = 0; var2 < this.l6.length; var2++) {
         com.aspose.slides.internal.u6.a6 var3 = this.l6[var2];
         y1 var4 = this.l6[var2].k5();
         com.aspose.slides.internal.v8.u9 var5;
         if (var4 == null) {
            var1[var2] = n5;
            var5 = n5;
         } else {
            b3 var6 = var4.a5();
            var1[var2] = var6.n5(this.k5);
            var5 = var6.n5(this.k5);
         }

         com.aspose.slides.internal.r4.u3 var16 = new com.aspose.slides.internal.r4.u3<>(var3.u9());

         while (var16.l6()) {
            com.aspose.slides.internal.u6.c8 var7 = (com.aspose.slides.internal.u6.c8)var16.k5();
            if (!var7.c8() && var7.s7() == 0 && var7.a6()) {
               com.aspose.slides.internal.u6.y4 var8 = var7.l6();
               int var9 = 0;
               b3 var10 = var8.u9().u6();
               if (!var10.l6(this.k5).t4()) {
                  var9 = var10.l6(this.k5).c8().l6(this.k5);
               }

               if (!var10.u3(this.k5).t4()) {
                  var9 = var10.u3(this.k5).c8().l6(this.k5);
               }

               if (var7.t2() == 0) {
                  var9 = q1.n5(var9, var5.l6());
               }

               var9 = q1.n5(var9, var8.t4());
               int var11 = var8.z1();
               int var12 = 0;
               com.aspose.slides.internal.h2.t2 var13 = var8.u9().x9();
               var12 += var13.k5(false, var8.e2());
               var12 += var13.u3(false, var8.e2());
               int var14 = var9 + var12 + var11;

               for (int var15 = var2 - 1; var15 >= var2 - var7.t2(); var15--) {
                  var14 -= var1[var15].l6();
               }

               if (var14 > var1[var2].n5()) {
                  var1[var2] = var1[var2].u9(var14);
               }
            }
         }

         var3.n5(var1[var2]);
         var3.l6(var5);
      }
   }
}
