package com.aspose.slides.internal.r7;

import com.aspose.slides.internal.n2d.y4;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.ms.System.q1;
import com.aspose.slides.ms.System.x9;

public class n5 extends com.aspose.slides.internal.h9.l6 {
   public n5(com.aspose.slides.internal.h9.n5 var1) {
      super(var1);
   }

   @Override
   protected void n5(com.aspose.slides.internal.b9.n5 var1, com.aspose.slides.internal.r6.u9 var2) {
      z1 var3 = var2.n5();
      y2 var4 = var1.n5().c8().n3();
      y2 var5 = new y2(var1.c8(), var1.t2(), var1.t4(), var1.q0());
      y2 var6 = new y2(var1.l6(), var1.k5(), var1.u3(), var1.u9());
      com.aspose.slides.internal.b9.h0 var7 = var1.h0();
      m1 var8 = var1.s7().c8();
      a0 var9 = new a0(var5.n3());
      var9.l6(var8);
      y2.l6(var9.n5(var3).y4()).u3(var5);
      com.aspose.slides.internal.o9b.c8 var10 = var1.x8().u9().o8();
      int[] var11 = var1.z3().k5(var2.x8());
      a0 var12 = var3.u9();
      var12.l6(var3.m1());
      m1 var13 = y4.n5(var12, var3);
      var12.l6(var13);
      y1 var14 = this.n5.n5(var6.n3(), var2).y4();
      y1 var15 = y1.n5(var14.y4(), new y1(0.0F, 0.0F, var2.z7().e2(), var2.z7().h0())).y4();
      com.aspose.slides.internal.j9e.n5 var16 = var2.z7().n5(new y2(0, 0, var2.z7().e2(), var2.z7().h0()), 3, 2498570);
      x9 var17 = var16.u3();
      int[] var18 = new int[var16.l6() * var16.n5()];
      com.aspose.slides.internal.e3m.n5.n5(var17, var18, 0, var18.length);
      m1 var19 = new m1(var14.s7() / var5.t2(), 0.0F, 0.0F, var14.k5() / var5.l6(), var14.u9().l6(), var14.u9().k5());
      m1 var20 = var19.u9();
      var20.h0();
      float[] var21 = var19.n5();
      float[] var22 = var20.n5();
      a0 var23 = new a0(var15.y4());
      var23.l6(var20);
      y1 var24 = var23.n5(var3).y4();
      float var25 = var15.n3();
      float var26 = var15.x8();
      float var27 = var24.k5();
      float var28 = var24.s7();
      float var29 = var24.t2();
      float var30 = var24.l6();
      float var31 = var24.a6();
      float var32 = var24.h0();
      float var33 = var15.k5();
      float var34 = var15.s7();
      float var35 = var15.h0();
      float var36 = var15.l6();
      int var37 = var2.z7().h0();
      int var38 = var2.z7().e2();
      int var39 = var1.z3().l6();

      for (int var40 = 0; var40 < q1.n5(var33, var27); var40++) {
         int var41;
         int var42;
         if (var33 > var27) {
            if (var40 >= var37) {
               continue;
            }

            var41 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(var40 + var25), 14);
            var42 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(n5(0.0F, var41, var22)[1]), 14);
         } else {
            if (var40 >= var27) {
               continue;
            }

            var42 = var40 + com.aspose.slides.internal.v6g.k5.u3(q1.u3(var29), 14);
            var41 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(n5(0.0F, var42, var21)[1]), 14);
         }

         for (int var43 = 0; var43 < q1.n5(var34, var28); var43++) {
            int var44;
            int var45;
            if (var34 > var28) {
               if (var43 >= var38) {
                  continue;
               }

               var44 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(var43 + var26), 14);
               var45 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(n5(var44, 0.0F, var22)[0]), 14);
            } else {
               if (var43 >= var28) {
                  continue;
               }

               var45 = var43 + com.aspose.slides.internal.v6g.k5.u3(q1.u3(var31), 14);
               var44 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(n5(var45, 0.0F, var21)[0]), 14);
            }

            if (var12.n5(var44 * var13.n5()[0], var41 * var13.n5()[3])) {
               var45 = com.aspose.slides.internal.v6g.k5.u3(q1.l6(var45, var32 - 1.0F), 13);
               var42 = com.aspose.slides.internal.v6g.k5.u3(q1.l6(var42, var30 - 1.0F), 13);
               var44 = com.aspose.slides.internal.v6g.k5.u3(q1.l6(var44, var35 - 1.0F), 13);
               var41 = com.aspose.slides.internal.v6g.k5.u3(q1.l6(var41, var36 - 1.0F), 13);
               int var46 = var42 * var39 + var45;
               int var47 = var41 * var38 + var44;
               long var48 = 0L;
               var48 = var11[var46] & 4294967295L;
               long var50 = var18[var47] & 4294967295L & 4294967295L & 4294967295L;
               if (var47 < var18.length && var47 >= 0) {
                  var18[var47] = (int)this.n5(var48, var50, var7, true);
               }
            }
         }
      }

      com.aspose.slides.internal.e3m.n5.n5(var18, 0, var17, var18.length);
      var2.z7().n5(var16);
   }
}
