package com.aspose.slides.internal.p1;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.e1.r4;
import com.aspose.slides.internal.i0.c3;
import com.aspose.slides.internal.i0.d1;
import com.aspose.slides.internal.i0.e5;
import com.aspose.slides.internal.i0.l4;
import com.aspose.slides.internal.i0.s3;
import com.aspose.slides.internal.i0.x9;
import com.aspose.slides.internal.i0.z1;
import com.aspose.slides.internal.j9e.x8;
import com.aspose.slides.internal.o9b.i1;
import com.aspose.slides.internal.o9b.j5;
import com.aspose.slides.internal.o9b.m3;
import com.aspose.slides.internal.o9b.u6;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.internal.w0.a6;
import com.aspose.slides.internal.w0.c8;
import com.aspose.slides.internal.w0.h0;
import com.aspose.slides.internal.w0.n3;
import com.aspose.slides.internal.w0.t2;
import com.aspose.slides.internal.w0.u9;
import com.aspose.slides.internal.w0.y4;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.x4g.s7;
import com.aspose.slides.internal.x4g.z3;
import com.aspose.slides.internal.x4g.z8;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.ms.System.d5;
import com.aspose.slides.ms.System.q1;
import com.aspose.slides.ms.System.u3;

public class n5 {
   public static w1[] n5(j5[] var0) {
      w1[] var1 = (w1[])u3.n5(u3.n5(k5.n5(w1.class), var0.length));

      for (int var2 = 0; var2 < var0.length; var2++) {
         j5.n5(var0[var2]).n5(var1[var2]);
      }

      return var1;
   }

   public static w1[] n5(com.aspose.slides.internal.i0.u3[] var0) {
      w1[] var1 = (w1[])u3.n5(u3.n5(k5.n5(w1.class), var0.length));

      for (int var2 = 0; var2 < var0.length; var2++) {
         var0[var2].n5().n5(var1[var2]);
      }

      return var1;
   }

   public static y2 n5(y1 var0) {
      return new y2(k5.u3(var0.x8(), 13), k5.u3(var0.n3(), 13), k5.u3(var0.s7(), 13), k5.u3(var0.k5(), 13));
   }

   public static y1 n5(y2 var0) {
      return new y1(var0.s7(), var0.x8(), var0.t2(), var0.l6());
   }

   public static m1 n5(c8 var0) {
      return new m1(var0.u3(), var0.a6(), var0.u9(), var0.h0(), var0.c8(), var0.t2());
   }

   public static c8 n5(m1 var0) {
      return new c8(var0.n5()[0], var0.n5()[1], var0.n5()[2], var0.n5()[3], var0.n5()[4], var0.n5()[5]);
   }

   public static com.aspose.slides.internal.w0.l6 n5(com.aspose.slides.internal.o9b.u3 var0) {
      if (k5.l6(var0, i1.class)) {
         i1 var10 = (i1)var0;
         return new n3(com.aspose.slides.internal.p1s.n5.n5(var10.h0().o8()));
      }

      if (k5.l6(var0, com.aspose.slides.internal.x4g.n3.class)) {
         com.aspose.slides.internal.x4g.n3 var9 = (com.aspose.slides.internal.x4g.n3)var0;
         return new a6(var9.t2(), com.aspose.slides.internal.p1s.n5.n5(var9.c8().o8()), com.aspose.slides.internal.p1s.n5.n5(var9.h0().o8()));
      }

      if (k5.l6(var0, u6.class)) {
         u6 var8 = (u6)var0;
         e2 var11 = new e2();

         try {
            var8.h0().n5(var11, var8.h0().x8());
            y4 var3 = new y4(var11.toArray(), var8.t2());
            var3.n5(n5(var8.c8()));
            return var3;
         } finally {
            if (var11 != null) {
               var11.dispose();
            }
         }
      } else if (k5.l6(var0, z3.class)) {
         z3 var1 = (z3)var0;
         com.aspose.slides.internal.o9b.c8[] var2 = var1.s7();
         return new h0(var1.x8().y4(), com.aspose.slides.internal.p1s.n5.n5(var2[0].o8()), com.aspose.slides.internal.p1s.n5.n5(var2[1].o8()));
      } else {
         throw new NotSupportedException();
      }
   }

   public static com.aspose.slides.internal.w0.l6 n5(z1 var0) {
      return n5(var0, null);
   }

   public static com.aspose.slides.internal.w0.l6 n5(z1 var0, c8 var1) {
      switch ((int)var0.l6()) {
         case 0:
            d1 var2 = (d1)var0.n5();
            return new n3(com.aspose.slides.internal.p1s.n5.n5(var2.n5().a6().o8()));
         case 1:
            e5 var3 = (e5)var0.n5();
            return new a6((int)var3.k5(), com.aspose.slides.internal.p1s.n5.n5(var3.l6().a6().o8()), com.aspose.slides.internal.p1s.n5.n5(var3.n5().a6().o8()));
         case 2:
            c3 var4 = (c3)var0.n5();
            l4 var5 = var4.k5();
            c8 var6 = new c8();
            if ((var4.n5() & 2L) > 0L) {
               var6 = n5(var5.n5().c8());
            }

            y4 var7 = new y4(var5.l6().n5().k5(), (int)var4.l6());
            var7.n5(var6);
            return var7;
         case 3:
            x9 var8 = (x9)var0.n5();
            com.aspose.slides.internal.i0.n3 var9 = var8.c8();
            y1 var10 = y1.n5.y4();
            r4 var13;
            if (k5.l6(var9, com.aspose.slides.internal.i0.y4.class)) {
               com.aspose.slides.internal.i0.y4 var11 = k5.n5(var9, com.aspose.slides.internal.i0.y4.class);
               s7 var12 = var11.n5().c8();
               if (var1 != null) {
                  var12.n5(n5(var1)).a6(var10);
               }

               var13 = com.aspose.slides.internal.g0.u3.n5(var12, true);
            } else {
               com.aspose.slides.internal.i0.e2 var38 = k5.n5(var9, com.aspose.slides.internal.i0.e2.class);
               w1[] var40 = (w1[])u3.n5(u3.n5(k5.n5(w1.class), var38.n5()));

               for (int var42 = 0; var42 < var40.length; var42++) {
                  var38.l6()[var42].n5().n5(var40[var42]);
               }

               var13 = r4.n5(var40, true);
            }

            w1 var39 = var8.u3().n5().u3();
            if (var1 != null && !var1.n5()) {
               var13.l6(var1);
               var1.n5(var39.u3()).n5(var39);
            }

            t2 var41 = new t2(var13, var39.u3());
            var41.n5(var10.y4());
            var41.n5(com.aspose.slides.internal.p1s.n5.n5(var8.k5().a6().o8()));
            if ((var8.a6() & 4294967295L) > 0L) {
               com.aspose.slides.internal.i0.n5[] var43 = var8.h0();
               com.aspose.slides.internal.p1s.n5[] var47 = new com.aspose.slides.internal.p1s.n5[var43.length];

               for (int var50 = 0; var50 < var43.length; var50++) {
                  var47[var50] = com.aspose.slides.internal.p1s.n5.n5(var43[var50].a6().o8());
               }

               var41.n5(var47);
            }

            if ((var8.n5() & 2L) > 0L) {
               var41.n5(n5(var8.t2().n5().c8()));
            }

            if ((var8.n5() & 4L) > 0L) {
               com.aspose.slides.internal.i0.t2 var44 = (com.aspose.slides.internal.i0.t2)var8.t2().l6();
               u9[] var48 = new u9[(int)var44.l6()];

               for (int var51 = 0; var51 < (var44.l6() & 4294967295L); var51++) {
                  var48[var51] = new u9(com.aspose.slides.internal.p1s.n5.n5(var44.k5()[var51].a6().o8()), var44.n5()[var51]);
               }

               var41.n5(var48);
            }

            if ((var8.n5() & 8L) > 0L) {
               com.aspose.slides.internal.i0.s7 var45 = (com.aspose.slides.internal.i0.s7)var8.t2().l6();
               var41.l6(new float[(int)var45.l6()]);
               var41.n5(new float[(int)var45.l6()]);

               for (int var49 = 0; var49 < (var45.l6() & 4294967295L); var49++) {
                  var41.u3()[var49] = var45.k5()[var49];
                  var41.k5()[var49] = var45.n5()[var49];
               }
            }

            if ((var8.n5() & 64L) > 0L) {
               s3 var46 = var8.t2().k5();
               var41.l6(new w1(var46.n5(), var46.l6()));
            }

            return var41;
         case 4:
            z3 var14 = (z3)var0.k5();
            y1 var15 = var14.x8().y4();
            float var16 = 1.0F;
            if (var15.s7() * var15.k5() > 262144.0F) {
               var16 = (float)q1.z3(262144.0F / var15.s7() / var15.k5());
            }

            com.aspose.slides.internal.o9b.l6 var17 = new com.aspose.slides.internal.o9b.l6(
               k5.u3(var15.s7() * var16 + 0.5F, 13), k5.u3(var15.k5() * var16 + 0.5F, 13)
            );

            try {
               com.aspose.slides.internal.o9b.z1 var18 = com.aspose.slides.internal.o9b.z1.n5(var17);

               try {
                  e2 var19 = new e2();

                  try {
                     c8 var20 = com.aspose.slides.internal.j7.c8.n5(var14.n3());
                     var14.k5(new m1());
                     var14.k5(var16, var16);
                     var14.a6(-var15.x8(), -var15.n3());
                     var18.n5(var14, 0, 0, var17.e2(), var17.h0());
                     var17.n5(var19, x8.s7());
                     y4 var21 = new y4(var19.toArray());
                     var20.n5(1.0F / var16, 1.0F / var16, 1);
                     var20.l6(var15.x8(), var15.n3(), 0);
                     if (var1 != null && !var1.n5()) {
                        var20.n5(var1, 1);
                     }

                     var21.n5(var20);
                     return var21;
                  } finally {
                     if (var19 != null) {
                        var19.dispose();
                     }
                  }
               } finally {
                  if (var18 != null) {
                     var18.dispose();
                  }
               }
            } finally {
               if (var17 != null) {
                  var17.dispose();
               }
            }
         default:
            throw new ArgumentOutOfRangeException();
      }
   }

   public static com.aspose.slides.internal.w0.s7 n5(m3 var0) {
      com.aspose.slides.internal.w0.s7 var1;
      if (var0.z1() != 2 && var0.z1() != 1) {
         var1 = new com.aspose.slides.internal.w0.s7(com.aspose.slides.internal.p1s.n5.n5(var0.k5().o8()), var0.q0());
      } else {
         var1 = new com.aspose.slides.internal.w0.s7(n5(var0.l6()), var0.q0());
      }

      var1.l6(var0.a6());
      var1.k5(var0.t2());
      var1.a6(var0.c8());
      var1.n5(n5(var0.n5()));
      var1.u9(var0.x8());
      var1.k5(var0.y4());
      var1.u3(var0.e2());
      var1.l6(var0.t9());
      var1.l6(var0.n3());
      if (var0.x8() != 0) {
         var1.n5(var0.s7());
      }

      return var1;
   }

   public static int n5(int var0) {
      switch (var0) {
         case 0:
            return 0;
         case 1:
            return 1;
         case 2:
            return 2;
         case 3:
            return 3;
         case 4:
            return 4;
         default:
            throw new ArgumentOutOfRangeException(d5.getName(z8.class, var0), var0, null);
      }
   }

   public static int[] n5(s7 var0) {
      int[] var2;
      if (com.aspose.slides.internal.r5w.n5.n5(var0)) {
         byte[] var1 = var0.u9();
         var2 = new int[var1.length];

         for (int var3 = 0; var3 < var2.length; var3++) {
            var2[var3] = var1[var3] & 255;
         }
      } else {
         var2 = new int[0];
      }

      return var2;
   }
}
