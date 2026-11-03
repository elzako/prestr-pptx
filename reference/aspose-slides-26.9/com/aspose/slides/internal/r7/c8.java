package com.aspose.slides.internal.r7;

import com.aspose.slides.internal.b9.b4;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.o9b.j5;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.x4g.x8;
import com.aspose.slides.ms.System.q1;
import com.aspose.slides.ms.System.x9;

public class c8 extends com.aspose.slides.internal.h9.t2 {
   public c8(com.aspose.slides.internal.h9.n5 var1) {
      super(var1);
   }

   @Override
   protected void n5(b4 var1, com.aspose.slides.internal.r6.u9 var2) {
      z1 var3 = var2.n5();
      y2 var4 = var1.n5().c8().n3();
      y2 var5 = new y2(var1.c8(), var1.t2(), var1.t4(), var1.q0());
      y2 var6 = new y2(var1.l6(), var1.k5(), var1.u3(), var1.u9());
      com.aspose.slides.internal.o9b.c8 var7 = var1.h0().u9().o8();
      m1 var8 = var1.s7().c8();
      a0 var9 = new a0(var5.n3());
      var9.l6(var8);
      y2.l6(var9.n5(var3).y4()).u3(var5);
      com.aspose.slides.internal.o9b.c8 var10 = var1.x8().u9().o8();
      com.aspose.slides.internal.o9b.l6 var11 = var1.z3().l6(var2.x8());
      if (var11.s7() == 2498570) {
         a0 var12 = var2.v0().l6();
         var12.l6(var2.x9());
         y1 var13 = this.n5.n5(var6.n3(), var2).y4();
         com.aspose.slides.internal.j9e.n5 var14 = var2.z7().n5(new y2(0, 0, var2.z7().e2(), var2.z7().h0()), 3, 2498570);
         com.aspose.slides.internal.j9e.n5 var15 = var11.n5(new y2(0, 0, var11.e2(), var11.h0()), 1, 2498570);
         x9 var16 = var14.u3();
         x9 var17 = var15.u3();
         int[] var18 = new int[var14.l6() * var14.n5()];
         int[] var19 = new int[var15.l6() * var15.n5()];
         com.aspose.slides.internal.e3m.n5.n5(var16, var18, 0, var18.length);
         com.aspose.slides.internal.e3m.n5.n5(var17, var19, 0, var19.length);
         m1 var20 = new m1(var13.s7() / var15.l6(), 0.0F, 0.0F, var13.k5() / var15.n5(), var13.u9().l6(), var13.u9().k5());
         m1 var21 = var20.u9();
         var21.h0();

         for (int var22 = 0; var22 < q1.n5((float)(var13.k5()), (float)(var15.n5())); var22++) {
            int var23;
            int var24;
            if (var13.k5() > var15.n5()) {
               if (var22 >= var2.z7().h0()) {
                  continue;
               }

               var23 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(var22 + var13.n3()), 14);
               var24 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(n5(j5.n5(new j5(0, var23)).u3(), var21).k5()), 14);
            } else {
               if (var22 >= var11.h0()) {
                  continue;
               }

               var24 = var22;
               var23 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(n5(j5.n5(new j5(0, var24)).u3(), var20).k5()), 14);
            }

            for (int var25 = 0; var25 < q1.n5((float)(var13.s7()), (float)(var15.l6())); var25++) {
               int var26;
               int var27;
               if (var13.s7() > var15.l6()) {
                  if (var25 >= var2.z7().e2()) {
                     continue;
                  }

                  var26 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(var25 + var13.x8()), 14);
                  var27 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(n5(j5.n5(new j5(var26, 0)).u3(), var21).l6()), 14);
               } else {
                  if (var25 >= var11.e2()) {
                     continue;
                  }

                  var27 = var25;
                  var26 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(n5(j5.n5(new j5(var27, 0)).u3(), var20).l6()), 14);
               }

               if (var12.n5(var26, var23)) {
                  var27 = q1.l6(var27, var15.l6() - 1);
                  var24 = q1.l6(var24, var15.n5() - 1);
                  var26 = com.aspose.slides.internal.v6g.k5.u3(q1.l6(var26, var13.h0() - 1.0F), 13);
                  var23 = com.aspose.slides.internal.v6g.k5.u3(q1.l6(var23, var13.l6() - 1.0F), 13);
                  int var28 = var24 * var15.l6() + var27;
                  int var29 = var23 * var14.l6() + var26;
                  if (var29 < var18.length && var29 >= 0) {
                     var18[var29] = (int)(var18[var29] & 16777215 | var19[var28] & 4278190080L);
                     com.aspose.slides.internal.e3m.n5.n5(var18, 0, var16, var18.length);
                     var2.z7().n5(var14);
                     var11.n5(var15);
                  }
               }
            }
         }
      } else {
         var11.n5(var7.o8());
         x8 var33 = var3.l6();
         var3.n5(var2.x9(), 0);
         var3.n5(var2.v0(), 0);
         com.aspose.slides.internal.g1.h0.n5(var5.n3(), new y2(0, 0, var11.e2(), var11.h0())).u3(var5);
         com.aspose.slides.internal.j9e.t2 var34 = new com.aspose.slides.internal.j9e.t2();

         try {
            var34.l6(3);
            var3.a6(2);
            var3.k5(7);
            var3.n5(var11, var6.n3(), var5.s7(), var5.x8(), var5.t2(), var5.l6(), 2, var34);
         } finally {
            if (var34 != null) {
               var34.dispose();
            }
         }

         var3.n5(var33);
      }
   }
}
