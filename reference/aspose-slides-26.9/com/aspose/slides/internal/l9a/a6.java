package com.aspose.slides.internal.l9a;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.b7s.d5;
import com.aspose.slides.internal.b7s.e5;
import com.aspose.slides.internal.b7s.m1;
import com.aspose.slides.internal.b7s.q0;
import com.aspose.slides.internal.b7s.t2;
import com.aspose.slides.internal.b7s.y0;
import com.aspose.slides.internal.b8u.n3;
import com.aspose.slides.internal.b8u.t9;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.f0;
import com.aspose.slides.internal.r1x.i1;
import com.aspose.slides.internal.r1x.i9;
import com.aspose.slides.internal.r1x.j3;
import com.aspose.slides.internal.r1x.j4;
import com.aspose.slides.internal.r1x.k7;
import com.aspose.slides.internal.r1x.p8;
import com.aspose.slides.internal.r1x.v4;
import com.aspose.slides.internal.r1x.z6;
import com.aspose.slides.internal.t6q.s7;
import com.aspose.slides.internal.u2w.c8;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.d1;

public class a6 {
   public static void n5(f0 var0, t4 var1, t2 var2, com.aspose.slides.internal.d0c.l6 var3, s7 var4, com.aspose.slides.internal.g7e.n5 var5, y2 var6) {
      y0 var7 = new y0(var1);

      try {
         q0.k5(var7);
         if (var5.u3() != null) {
            if (var3 != null) {
               var3.n5(new c8(com.aspose.slides.internal.v6g.k5.a6(var5.u3().n5(), 14), 1L));
               var3.l6(new c8(com.aspose.slides.internal.v6g.k5.a6(var5.u3().l6(), 14), 1L));
               var3.n5(2);
            } else {
               if (var2 == null) {
                  var2 = new t2();
               }

               var2.l6(com.aspose.slides.internal.v6g.k5.l6(var5.u3().n5(), 14));
               var2.k5(com.aspose.slides.internal.v6g.k5.l6(var5.u3().l6(), 14));
            }
         }

         if (var2 != null) {
            t2.n5(var2, var7);
         }

         q0.n5(var7, var3);
         q0.n5(var7, var4);
         if (var5 != null && !d1.n5(var5.y4())) {
            q0.n5(var7, var5.y4());
         }

         if (var5.z1() == 2) {
         }

         if (var5.z1() == 3) {
            t4 var24 = var5.k7() != null ? var5.k7().n5() : k7.n5().n5();
            j4 var9 = i9.n5().n5(var24);

            try {
               synchronized (var9.n5()) {
                  if (var5.k7() != null) {
                     var24 = var5.k7().n5();
                  } else {
                     q0 var11 = com.aspose.slides.internal.v6g.k5.n5(var0, q0.class);
                     var24 = var11 != null && var11.u6() != null ? var11.u6().n5() : k7.n5().n5();
                  }

                  com.aspose.slides.internal.b7s.c8.n5(var24, var1);
                  com.aspose.slides.internal.b7s.n5 var26 = new com.aspose.slides.internal.b7s.n5();
                  var26.k5(100);
                  var26.n5(0);
                  var26.l6(0);
                  var26.n5((byte)2);
                  com.aspose.slides.internal.b7s.n5.n5(var1, var26);
                  var5.l6(new com.aspose.slides.internal.l0u.n5(var24));
                  if (var5.m1() == null) {
                     var5.n5(k7.l6());
                  }
               }
            } finally {
               i9.n5().n5(var9);
            }
         } else if (var5.z1() == 4) {
            com.aspose.slides.internal.b7s.n5 var8 = new com.aspose.slides.internal.b7s.n5();
            var8.k5(100);
            var8.n5(0);
            var8.l6(0);
            var8.n5((byte)0);
            com.aspose.slides.internal.b7s.n5.n5(var1, var8);
         }

         switch (var5.t9()) {
            case 0:
            case 1:
               n5(var0, var5, var7, var6.n3());
               break;
            case 2:
               l6(var0, var5, var7, var6.n3());
               break;
            case 3:
               k5(var0, var5, var7, var6.n3());
               break;
            default:
               throw new ArgumentException();
         }

         q0.n5(var7);
      } finally {
         com.aspose.slides.internal.n6h.a6.n5(var7);
      }
   }

   private static void n5(f0 var0, com.aspose.slides.internal.g7e.n5 var1, y0 var2, y2 var3) {
      z6 var4 = new z6();
      v4 var5 = q0.l6(var1.z1(), var1.t4() & 255);
      y2 var6 = new y2(0, 0, var3.t2(), var3.l6());
      List var7 = null;
      com.aspose.slides.internal.e8b.k5 var8 = null;
      int var9 = 2;
      com.aspose.slides.internal.h5r.u3 var10 = null;
      boolean var11 = true;

      try {
         while (var11) {
            com.aspose.slides.internal.l3e.k5 var12 = new com.aspose.slides.internal.l3e.k5(var6.n3(), var1, var2, var5, var9, var7);
            com.aspose.slides.internal.l3e.k5 var13 = var12;

            try {
               com.aspose.slides.internal.b7s.f0 var14 = new com.aspose.slides.internal.b7s.f0(var2, var1, var6.n3(), var5, var13, var9, var8);
               var4.n5(var5);
               y2 var15 = y2.n5(var0.x8().n3(), var3.n3()).n3();
               if (var15.t2() > 0 && var15.l6() > 0) {
                  if (var0.a0() && var4.n5().q0() == var0.y1().q0()) {
                     var4.n5((com.aspose.slides.internal.b8u.a6)null);
                     var4.n5(var0.c4());
                     var4.l6(var0.y2());
                     var4.n5(var0.r4());
                     var4.k5(var3.t2() * var4.n5().z3());
                     i1 var43 = new i1(var0, var4, var3.n3(), var14);

                     try {
                        var0.n5(var15.n3(), var15.n3(), var4, var43);
                     } finally {
                        if (var43 != null) {
                           var43.dispose();
                        }
                     }
                  } else {
                     if (var10 == null) {
                        var10 = n5(var14, var0, var1);
                     } else {
                        var10.n5(var14);
                     }

                     p8 var16 = new p8(var0, var3.n3(), var10, var0.e2());

                     try {
                        com.aspose.slides.internal.b8u.x8 var17 = var16;
                        if (var0.d2()) {
                           var17 = new j3(var0.s3().h0(), var0.z3().h0(), var17);
                        }

                        if (var0.d5() && var1.y2()) {
                           var17 = new com.aspose.slides.internal.r1x.n5(com.aspose.slides.internal.o9b.c8.w4().h0(), var17);
                        }

                        var0.l6(var15.n3(), var17);
                     } finally {
                        if (var16 != null) {
                           var16.dispose();
                        }
                     }
                  }
               }

               if (var14 != null) {
                  var14.n5(true);
                  var9 = var14.l6();
               }

               if (var9 == 2) {
                  var8 = var14.n5();
                  boolean var44 = com.aspose.slides.internal.l3e.k5.n5(var1);
                  var9 = var44 ? 0 : 1;
               } else if (var9 == 0) {
                  var7 = var13.n5();
                  var9 = 1;
               } else if (var9 == 1) {
                  var11 = false;
               }
            } finally {
               if (var13 != null) {
                  var13.dispose();
               }
            }

            var12 = null;
            Object var42 = null;
         }
      } finally {
         if (var10 != null) {
            var10.n5();
         }
      }
   }

   private static void l6(f0 var0, com.aspose.slides.internal.g7e.n5 var1, y0 var2, y2 var3) {
      z6 var4 = new z6();
      v4 var5 = q0.n5(var1.z1(), var1.t4());
      y2 var6 = new y2(0, 0, var3.t2(), var3.l6());
      com.aspose.slides.internal.l3e.a6 var7 = new com.aspose.slides.internal.l3e.a6(var6.n3(), var1, var2);

      try {
         m1 var8 = new m1(var2, var5, var7);
         var4.n5(var5);
         y2 var9 = y2.n5(var0.x8().n3(), var3.n3()).n3();
         if (var9.t2() > 0 && var9.l6() > 0) {
            if (var0.a0() && var4.n5().q0() == var0.y1().q0()) {
               var4.n5((com.aspose.slides.internal.b8u.a6)null);
               var4.n5(var0.c4());
               var4.l6(var0.y2());
               var4.n5(var0.r4());
               var4.k5(var3.t2() * var4.n5().z3());
               i1 var27 = new i1(var0, var4, var3.n3(), var8);

               try {
                  var0.n5(var9.n3(), var9.n3(), var4, var27);
               } finally {
                  if (var27 != null) {
                     var27.dispose();
                  }
               }
            } else {
               com.aspose.slides.internal.h5r.u3 var10 = n5(var8, var0, var1);
               p8 var11 = new p8(var0, var3.n3(), var10, var0.e2());

               try {
                  com.aspose.slides.internal.b8u.x8 var12 = var11;
                  if (var0.d2() && var0.q0()) {
                     var12 = new j3(var0.s3().h0(), var0.z3().h0(), var12);
                  }

                  if (var0.d5() && var1.y2()) {
                     var12 = new com.aspose.slides.internal.r1x.n5(com.aspose.slides.internal.o9b.c8.w4().h0(), var12);
                  }

                  var0.l6(var9.n3(), var12);
               } finally {
                  if (var11 != null) {
                     var11.dispose();
                  }

                  if (var10 != null) {
                     var10.n5();
                  }
               }
            }
         }
      } finally {
         if (var7 != null) {
            var7.dispose();
         }
      }
   }

   private static void k5(f0 var0, com.aspose.slides.internal.g7e.n5 var1, y0 var2, y2 var3) {
      v4 var4 = q0.l6(var1.z1(), var1.t4());
      y2 var5 = y2.n5(var0.x8().n3(), var3.n3()).n3();
      d5 var6 = new d5();
      var6.n5(var5.t2());
      var6.l6(var5.l6());
      var6.u9(var1.m3());
      var6.h0(var1.z8());
      var6.n5(var1.j5());
      var6.k5(var1.t4() & 255);
      var6.a6(var4.z3());
      byte[] var7 = var1.w1();
      byte[] var8 = var1.r4();
      byte[] var9 = new byte[var6.a6()];
      byte[] var10 = new byte[var6.a6()];

      for (int var11 = 0; var11 < var6.a6(); var11++) {
         var9[var11] = var7 == null ? 1 : var7[var11];
         var10[var11] = var8 == null ? 1 : var8[var11];
      }

      var6.n5(var9);
      var6.l6(var10);
      var6.z1();
      e5 var23 = new e5(var2, var6);
      z6 var12 = new z6();
      var12.n5(var4);
      if (var5.t2() > 0 && var5.l6() > 0) {
         if (var0.a0() && var12.n5().q0() == var0.y1().q0()) {
            var12.n5((com.aspose.slides.internal.b8u.a6)null);
            var12.n5(var0.c4());
            var12.l6(var0.y2());
            var12.n5(var0.r4());
            var12.k5(var3.t2() * var12.n5().z3());
            i1 var24 = new i1(var0, var12, var3.n3(), var23);

            try {
               var0.n5(var5.n3(), var5.n3(), var12, var24);
            } finally {
               if (var24 != null) {
                  var24.dispose();
               }
            }
         } else {
            com.aspose.slides.internal.h5r.u3 var13 = n5(var23, var0, var1);
            p8 var14 = new p8(var0, var3.n3(), var13, var0.e2());

            try {
               com.aspose.slides.internal.b8u.x8 var15 = var14;
               if (var0.d2() && var0.q0()) {
                  var15 = new j3(var0.s3().h0(), var0.z3().h0(), var15);
               }

               if (var0.d5() && var1.y2()) {
                  var15 = new com.aspose.slides.internal.r1x.n5(com.aspose.slides.internal.o9b.c8.w4().h0(), var15);
               }

               var0.l6(var5.n3(), var15);
            } finally {
               if (var14 != null) {
                  var14.dispose();
               }

               if (var13 != null) {
                  var13.n5();
               }
            }
         }
      }
   }

   private static com.aspose.slides.internal.h5r.u3 n5(t9 var0, f0 var1, com.aspose.slides.internal.g7e.n5 var2) {
      if (n5(((q0)var1).e5())) {
         return new com.aspose.slides.internal.h5r.n5(var0, v4.l6());
      } else {
         return l6(((q0)var1).e5()) ? new com.aspose.slides.internal.h5r.n5(var0, v4.y4()) : com.aspose.slides.internal.h5r.u3.n5(var0, var2);
      }
   }

   public static boolean n5(com.aspose.slides.internal.g7e.n5 var0) {
      return com.aspose.slides.internal.t5g.u3.a6() && var0.z1() == 2;
   }

   public static boolean l6(com.aspose.slides.internal.g7e.n5 var0) {
      return com.aspose.slides.internal.t5g.u3.a6() && var0.z1() == 3;
   }
}
