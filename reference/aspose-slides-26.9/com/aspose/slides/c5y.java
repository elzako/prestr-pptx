package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

class c5y {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "par", "seq", "anim", "animClr", "animEffect", "animMotion", "animRot", "animScale", "set", "cmd", "audio", "video"
   );

   public static void n5(com.aspose.slides.internal.k4y.h7e var0, com.aspose.slides.internal.k0r.t6[] var1, boolean var2, t2s var3) {
      if (var1 != null) {
         for (com.aspose.slides.internal.k0r.t6 var7 : var1) {
            switch (n5(var7.l6(), var3.a6())) {
               case 0:
                  com.aspose.slides.internal.k4y.o2n var8 = (com.aspose.slides.internal.k4y.o2n)var0.n5("par").l6();
                  var8.n5().n5(var3.k5());
                  w7n.n5(var8.n5(), new c5y$1(var8), new c5y$2(var8), var7, var3);
                  if (var2 && var0.n5().size() == 1 && var8.n5().w1() != 8) {
                     var8.n5().h0((byte)8);
                  }
                  break;
               case 1:
                  com.aspose.slides.internal.k4y.q3a var9 = (com.aspose.slides.internal.k4y.q3a)var0.n5("seq").l6();
                  var9.u9().n5(var3.k5());
                  w7n.n5(var9.u9(), new c5y$3(var9), new c5y$4(var9), var7, var3);
                  break;
               case 2:
               default:
                  throw new InvalidOperationException();
               case 3:
                  n5(var0, var7, var3);
                  break;
               case 4:
                  q5j.n5(var0, var7, var3);
            }
         }
      }
   }

   public static void n5(com.aspose.slides.internal.k4y.h7e var0, com.aspose.slides.internal.k0r.c9b[] var1, t2s var2) {
      if (var1 != null && var1.length != 0) {
         for (com.aspose.slides.internal.k0r.c9b var6 : var1) {
            switch (n5(var6.l6(), var2.a6())) {
               case 0:
                  com.aspose.slides.internal.k4y.o2n var7 = (com.aspose.slides.internal.k4y.o2n)var0.n5("par").l6();
                  w7n.n5(var7.n5(), new c5y$5(var7), new c5y$6(var7), var6, var2);
                  break;
               case 1:
                  com.aspose.slides.internal.k4y.q3a var8 = (com.aspose.slides.internal.k4y.q3a)var0.n5("seq").l6();
                  w7n.n5(var8.u9(), new c5y$7(var8), new c5y$8(var8), var6, var2);
                  break;
               case 2:
               default:
                  throw new InvalidOperationException();
               case 3:
                  n5(var0, var6, var2);
                  break;
               case 4:
                  q5j.n5(var0, var6, var2);
            }
         }
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.h7e var0, com.aspose.slides.internal.k0r.t6 var1, t2s var2) {
      if (var1.t9() != null) {
         com.aspose.slides.internal.k4y.a4w var3 = (com.aspose.slides.internal.k4y.a4w)var0.n5("anim").l6();
         u8j.n5(var3, var1, var2);
      }

      if (var1.a6() != null) {
         com.aspose.slides.internal.k4y.s5v var4 = (com.aspose.slides.internal.k4y.s5v)var0.n5("animClr").l6();
         p6u.n5(var4, var1, var2);
      }

      if (var1.z1() != null) {
         com.aspose.slides.internal.k4y.n3m var5 = (com.aspose.slides.internal.k4y.n3m)var0.n5("animEffect").l6();
         b5s.n5(var5, var1, var2);
      }

      if (var1.t4() != null) {
         com.aspose.slides.internal.k4y.h7g var6 = (com.aspose.slides.internal.k4y.h7g)var0.n5("animMotion").l6();
         m1k.n5(var6, var1, var2);
      }

      if (var1.q0() != null) {
         com.aspose.slides.internal.k4y.c3t var7 = (com.aspose.slides.internal.k4y.c3t)var0.n5("animRot").l6();
         b1n.n5(var7, var1, var2);
      }

      if (var1.z3() != null) {
         com.aspose.slides.internal.k4y.q6i var8 = (com.aspose.slides.internal.k4y.q6i)var0.n5("animScale").l6();
         k1v.n5(var8, var1, var2);
      }

      if (var1.u9() != null) {
         com.aspose.slides.internal.k4y.p2j var9 = (com.aspose.slides.internal.k4y.p2j)var0.n5("set").l6();
         z5n.n5(var9, var1, var2);
      }

      if (var1.h0() != null) {
         com.aspose.slides.internal.k4y.s1z var10 = (com.aspose.slides.internal.k4y.s1z)var0.n5("cmd").l6();
         l0k.n5(var10, var1, var2);
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.h7e var0, com.aspose.slides.internal.k0r.c9b var1, t2s var2) {
      if (var1.a6() != null) {
         com.aspose.slides.internal.k4y.s5v var3 = (com.aspose.slides.internal.k4y.s5v)var0.n5("animClr").l6();
         p6u.n5(var3, var1, var2);
      }

      if (var1.u9() != null) {
         com.aspose.slides.internal.k4y.p2j var4 = (com.aspose.slides.internal.k4y.p2j)var0.n5("set").l6();
         z5n.n5(var4, var1, var2);
      }

      if (var1.h0() != null) {
         com.aspose.slides.internal.k4y.s1z var5 = (com.aspose.slides.internal.k4y.s1z)var0.n5("cmd").l6();
         l0k.n5(var5, var1, var2);
      }
   }

   private static int n5(com.aspose.slides.internal.k0r.a2w var0, d5f var1) {
      if (var0 == null) {
         var1.n5("TimeNodeAtom is not exists.", 0);
         return 0;
      } else {
         return !var0.c8() && var0.k5() != 4 ? 0 : var0.k5();
      }
   }

   public static void n5(com.aspose.slides.internal.k4y.h7e var0, com.aspose.slides.internal.k0r.t6 var1, d5t var2) {
      n5(var0, var1, var2, null, false);
   }

   public static void n5(com.aspose.slides.internal.k4y.h7e var0, com.aspose.slides.internal.k0r.a6 var1, d5t var2, c5y$n5 var3, boolean var4) {
      if (var0 != null) {
         List$Enumerator var5 = var0.n5().iterator();

         try {
            while (var5.hasNext()) {
               com.aspose.slides.internal.k4y.g7 var6 = (com.aspose.slides.internal.k4y.g7)var5.next();
               com.aspose.slides.internal.k0r.a6 var7;
               if (var4) {
                  var7 = new com.aspose.slides.internal.k0r.c9b();
               } else {
                  var7 = new com.aspose.slides.internal.k0r.t6();
               }

               var1.e2().addItem(var7);
               switch (n5.n5(var6.n5())) {
                  case 0:
                     com.aspose.slides.internal.k4y.o2n var8 = (com.aspose.slides.internal.k4y.o2n)var6.l6();
                     w7n.n5(var8.n5(), var7, 0);
                     w7n.n5(var8.n5(), var7);
                     if (var3 != null) {
                        var3.n5(var7.u3());
                     }

                     w7n.l6(var8.n5(), var7);
                     j5d.n5(var8.n5().c4(), var7, 1, var2);
                     j5d.n5(var8.n5().y2(), var7, 2, var2);
                     w7n.k5(var8.n5(), var7);
                     if (var8.n5().d5() != null) {
                        n5(var8.n5().d5(), var7, var2, null, true);
                     }

                     if (com.aspose.slides.internal.v6g.k5.l6(var7, com.aspose.slides.internal.k0r.t6.class)) {
                        n5(var8.n5().d2(), (com.aspose.slides.internal.k0r.t6)var7, var2);
                     }
                     break;
                  case 1:
                     com.aspose.slides.internal.k4y.q3a var9 = (com.aspose.slides.internal.k4y.q3a)var6.l6();
                     w7n.n5(var9.u9(), var7, 1);
                     var7.l6().k5(true);
                     w7n.n5(var9.u9(), var7);
                     w7n.n5(var9, var7);
                     j5d.n5(var9.c8(), var7, 3, var2);
                     j5d.n5(var9.h0(), var7, 4, var2);
                     j5d.n5(var9.u9().c4(), var7, 1, var2);
                     n1s.n5(var9.u9().y1(), var7, 5, var2);
                     w7n.k5(var9.u9(), var7);
                     if (com.aspose.slides.internal.v6g.k5.l6(var7, com.aspose.slides.internal.k0r.t6.class)) {
                        n5(var9.u9().d2(), (com.aspose.slides.internal.k0r.t6)var7, var2);
                     }
                     break;
                  case 2:
                     com.aspose.slides.internal.k4y.a4w var10 = (com.aspose.slides.internal.k4y.a4w)var6.l6();
                     w7n.n5(var10.h0().u9(), var7, 3);
                     w7n.n5(var10.h0().u9(), var7);
                     u8j.n5(var10, var7, var2);
                     j5d.n5(var10.h0().u9().c4(), var7, 1, var2);
                     j5d.n5(var10.h0().u9().y2(), var7, 2, var2);
                     w7n.k5(var10.h0().u9(), var7);
                     break;
                  case 3:
                     com.aspose.slides.internal.k4y.s5v var11 = (com.aspose.slides.internal.k4y.s5v)var6.l6();
                     w7n.n5(var11.u9().u9(), var7, 3);
                     w7n.n5(var11.u9().u9(), var7);
                     p6u.n5(var11, var7, var2);
                     j5d.n5(var11.u9().u9().c4(), var7, 1, var2);
                     j5d.n5(var11.u9().u9().y2(), var7, 2, var2);
                     w7n.k5(var11.u9().u9(), var7);
                     break;
                  case 4:
                     com.aspose.slides.internal.k4y.n3m var12 = (com.aspose.slides.internal.k4y.n3m)var6.l6();
                     w7n.n5(var12.u3().u9(), var7, 3);
                     w7n.n5(var12.u3().u9(), var7);
                     b5s.n5(var12, var7, var2);
                     j5d.n5(var12.u3().u9().c4(), var7, 1, var2);
                     j5d.n5(var12.u3().u9().y2(), var7, 2, var2);
                     w7n.k5(var12.u3().u9(), var7);
                     break;
                  case 5:
                     com.aspose.slides.internal.k4y.h7g var13 = (com.aspose.slides.internal.k4y.h7g)var6.l6();
                     w7n.n5(var13.s7().u9(), var7, 3);
                     w7n.n5(var13.s7().u9(), var7);
                     m1k.n5(var13, var7, var2);
                     j5d.n5(var13.s7().u9().c4(), var7, 1, var2);
                     j5d.n5(var13.s7().u9().y2(), var7, 2, var2);
                     w7n.k5(var13.s7().u9(), var7);
                     break;
                  case 6:
                     com.aspose.slides.internal.k4y.c3t var14 = (com.aspose.slides.internal.k4y.c3t)var6.l6();
                     w7n.n5(var14.u3().u9(), var7, 3);
                     w7n.n5(var14.u3().u9(), var7);
                     b1n.n5(var14, var7, var2);
                     j5d.n5(var14.u3().u9().c4(), var7, 1, var2);
                     j5d.n5(var14.u3().u9().y2(), var7, 2, var2);
                     w7n.k5(var14.u3().u9(), var7);
                     break;
                  case 7:
                     com.aspose.slides.internal.k4y.q6i var15 = (com.aspose.slides.internal.k4y.q6i)var6.l6();
                     w7n.n5(var15.a6().u9(), var7, 3);
                     w7n.n5(var15.a6().u9(), var7);
                     k1v.n5(var15, var7, var2);
                     j5d.n5(var15.a6().u9().c4(), var7, 1, var2);
                     j5d.n5(var15.a6().u9().y2(), var7, 2, var2);
                     w7n.k5(var15.a6().u9(), var7);
                     break;
                  case 8:
                     com.aspose.slides.internal.k4y.p2j var16 = (com.aspose.slides.internal.k4y.p2j)var6.l6();
                     w7n.n5(var16.l6().u9(), var7, 3);
                     w7n.n5(var16.l6().u9(), var7);
                     z5n.n5(var16, var7, var2);
                     j5d.n5(var16.l6().u9().c4(), var7, 1, var2);
                     j5d.n5(var16.l6().u9().y2(), var7, 2, var2);
                     w7n.k5(var16.l6().u9(), var7);
                     break;
                  case 9:
                     com.aspose.slides.internal.k4y.s1z var17 = (com.aspose.slides.internal.k4y.s1z)var6.l6();
                     w7n.n5(var17.k5().u9(), var7, 3);
                     w7n.n5(var17.k5().u9(), var7);
                     l0k.n5(var17, var7, var2);
                     j5d.n5(var17.k5().u9().c4(), var7, 1, var2);
                     j5d.n5(var17.k5().u9().y2(), var7, 2, var2);
                     w7n.k5(var17.k5().u9(), var7);
                     break;
                  case 10:
                     com.aspose.slides.internal.k4y.e3b var18 = (com.aspose.slides.internal.k4y.e3b)var6.l6();
                     w7n.n5(var18.l6().a6(), var7, 4);
                     w7n.n5(var18.l6().a6(), var7);
                     q5j.n5(var18.l6(), var7.u3());
                     y1t.n5(var18.l6().u9(), var7, var2);
                     j5d.n5(var18.l6().a6().c4(), var7, 1, var2);
                     j5d.n5(var18.l6().a6().y2(), var7, 2, var2);
                     w7n.k5(var18.l6().a6(), var7);
                     break;
                  case 11:
                     com.aspose.slides.internal.k0r.a2w var19 = new com.aspose.slides.internal.k0r.a2w();
                     var19.n5(4);
                     var7.e2().addItem(var19);
                     break;
                  default:
                     throw new InvalidOperationException();
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }
      }
   }
}
