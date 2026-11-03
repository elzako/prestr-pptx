package com.aspose.slides.internal.c4z;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.a3p.e2;
import com.aspose.slides.internal.a3p.h0;
import com.aspose.slides.internal.b8u.n3;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.o2b.z8;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.f0;
import com.aspose.slides.internal.r1x.j3;
import com.aspose.slides.internal.r1x.p8;
import com.aspose.slides.internal.r1x.v4;
import com.aspose.slides.internal.r1x.z6;
import com.aspose.slides.internal.t6q.s7;
import com.aspose.slides.internal.u2w.u9;
import com.aspose.slides.internal.u2w.u9$n5;
import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.internal.v6s.a6;

public class l6 extends u9 {
   public l6(com.aspose.slides.internal.f2i.n5 var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   public void n5(byte[] var1) {
      com.aspose.slides.internal.t7q.n5 var2 = new com.aspose.slides.internal.t7q.n5(this.e2());
      var2.n5(var1);
      com.aspose.slides.internal.b8u.u9 var3 = var2.n5(this);
      this.k5(var3);
   }

   @Override
   public v4 y1() {
      switch (this.e5().y2()) {
         case 5:
            return v4.l6();
         default:
            return super.y1();
      }
   }

   public static void l6(f0 var0, a6 var1, boolean var2, com.aspose.slides.internal.f2i.n5 var3, com.aspose.slides.internal.d0c.n5 var4, s7 var5, y2 var6) {
      com.aspose.slides.internal.f2i.n5 var7 = var3;
      synchronized (var7) {
         var3 = new com.aspose.slides.internal.f2i.n5(var7);
      }

      try {
         var3.a5();
         if (var6.k5()) {
            var0.x8().u3(var6);
         }

         var3.k5(var6.t2() & 4294967295L);
         var3.l6(var6.l6() & 4294967295L);
         var3.n5(var3.d2() == 4294967295L ? var6.l6() & 4294967295L : var3.d2());
         if (var3.m3() == 7) {
            var3.n5(var6.l6() & 4294967295L);
            if (var3.y2() == 6) {
               if (!var3.n5(530)) {
                  var3.n5(new int[]{2, 2});
               }
            } else if (!var3.n5(530)) {
               var3.n5(new int[]{1, 1});
            }

            if (!var3.n5(284)) {
               var3.u9(1);
            }
         }

         if (var3.m3() == 6) {
            var3.n5(var6.l6() & 4294967295L);
            h0 var8 = new h0(513);
            var8.n5(new long[]{0L});
            var3.n5(var8);
            h0 var9 = new h0(514);
            var9.n5(new long[]{0L});
            var3.n5(var9);
         }

         if (var3.y2() == 6 && !var3.n5(530)) {
            var3.n5(new int[]{2, 2});
         }

         var3.n5(new long[]{0L});
         var3.l6(new long[]{0L});
         if (!var3.n5(278)) {
            var3.n5(4294967295L);
         }

         com.aspose.slides.internal.t2d.n5 var55 = com.aspose.slides.internal.q4o.l6.n5(var3);
         z8 var56 = com.aspose.slides.internal.q4o.n5.n5(var3, var0, var6.n3());
         com.aspose.slides.internal.k0b.n5 var10 = new com.aspose.slides.internal.k0b.n5(var56, var55, true);
         var10.n5(var3);
         var3.n5((com.aspose.slides.internal.u2w.a6[])var56.n5(false).toArray(new com.aspose.slides.internal.u2w.a6[0]));
         com.aspose.slides.internal.u2w.a6[] var11 = null;
         com.aspose.slides.internal.u2w.a6[] var12 = null;
         if (var4 != null) {
            var11 = var4.l6();
            var12 = var4.k5();
         }

         com.aspose.slides.internal.u2w.a6[] var13 = null;
         if (var5 != null) {
            e2 var14 = new e2(700);
            String var15 = var5.u9();
            byte[] var16 = j5.z3().u3(var15);
            var14.n5(var16);
            var13 = new com.aspose.slides.internal.u2w.a6[]{var14};
         }

         com.aspose.slides.internal.u2w.s7 var57 = new com.aspose.slides.internal.u2w.s7(var3.u6(), var11, var12, var13);
         long var17 = var1.l6();
         long var19 = var57.l6();
         u9$n5 var21 = n5(var3, var17 + var19 & 4294967295L, var1, var6.t2(), var6.l6());

         try {
            y2 var22 = y2.n5(var6.n3(), var0.x8().n3()).n3();
            p8 var23 = new p8(var0, var6.n3(), var21, var0.e2(), true);

            try {
               if (var22.t2() > 0 && var22.l6() > 0) {
                  if (!var0.a0() || !var0.z8() || var3.y2() != 5 || var0.y1() == null || !v4.n5(var0.y1(), v4.k5()) && !v4.n5(var0.y1(), v4.l6())) {
                     if (var0.a0() && var0.z8() && var3.y2() == 2) {
                        z6 var59 = new z6();
                        var59.n5(v4.l6(16));
                        var59.k5(var59.n5().z3() * var0.z1());
                        l6$n5 var61 = new l6$n5(var21, var59);
                        var0.n5(var0.x8().n3(), var59, var61);
                     } else {
                        com.aspose.slides.internal.b8u.x8 var58 = var23;
                        if (var0.d2()) {
                           var58 = new j3(var0.s3().h0(), var0.z3().h0(), var58);
                        }

                        if (var0.d5() && var3.j5() == 0) {
                           var58 = new com.aspose.slides.internal.r1x.n5(var3.e2().h0(), var58);
                        }

                        var0.l6(var22.n3(), var58);
                     }
                  } else {
                     z6 var24 = new z6();
                     var24.n5(v4.l6());
                     var24.k5(var24.n5().z3() * var0.z1());
                     l6$n5 var25 = new l6$n5(var21, var24);
                     var0.n5(var0.x8().n3(), var24, var25);
                  }
               }

               var23.n5();
            } finally {
               if (var23 != null) {
                  var23.dispose();
               }
            }

            var3.n5(var21.l6());
            var3.l6(var21.n5());
            var3.n5(var21.k5().k5());
            List var60 = new List();
            var60.addItem(var3.s7(278));
            var60.addItem(var3.s7(279));
            var60.addItem(var3.s7(273));
            if (var3.m3() == 6) {
               long var27 = var17 + var19 & 4294967295L;
               h0 var29 = com.aspose.slides.internal.v6g.k5.n5(var3.s7(513), h0.class);
               if (var29 != null && var29.y4() != null) {
                  var29.y4()[0] = var27;
               }

               h0 var30 = com.aspose.slides.internal.v6g.k5.n5(var3.s7(514), h0.class);
               if (var30 != null && var30.y4() != null) {
                  var30.y4()[0] = ((var3.f2()[0] & 4294967295L) - (var27 & 4294967295L) & 4294967295L) + (var3.p8()[0] & 4294967295L) & 4294967295L;
               }

               var60.addItem(var29);
               var60.addItem(var30);
            }

            var57.n5((com.aspose.slides.internal.u2w.a6[])var60.toArray(new com.aspose.slides.internal.u2w.a6[0]));
            long var62 = var21.k5().u3();
            synchronized (var1.n5()) {
               var1.n5(var17);
               var57.n5(var1, var62 & 4294967295L, var2);
            }
         } finally {
            if (var21 != null) {
               var21.dispose();
            }
         }
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }
}
