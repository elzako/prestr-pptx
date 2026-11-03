package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotImplementedException;

class w7n {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("tmAbs", "tmPct");

   public static void n5(
      com.aspose.slides.internal.k4y.n0d var0,
      com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.z2x> var1,
      com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.z2x> var2,
      com.aspose.slides.internal.k0r.a6 var3,
      t2s var4
   ) {
      if (var0 != null) {
         n5(var0, var3.l6(), var4.a6());
         n5(var0, var3.u3(), var4.a6());
         j5d.n5(var1, var3.s7(), var4);
         j5d.n5(var2, var3.x8(), var4);
         n5(var0, var3.t2());
         com.aspose.slides.internal.k0r.t6 var5 = com.aspose.slides.internal.v6g.k5.n5(var3, com.aspose.slides.internal.k0r.t6.class);
         if (var5 != null) {
            if (var5.k7() != null) {
               com.aspose.slides.internal.k4y.d1x var6 = var0.k5();
               n1s.n5(var6, var5.k7(), var4);
            }

            com.aspose.slides.internal.k0r.x2y var10 = var5.m1();
            if (var10 != null) {
               com.aspose.slides.internal.k4y.b6z var7 = var0.u3();
               switch ((int)var10.a6()) {
                  case 0:
                     com.aspose.slides.internal.k4y.q4e var8 = (com.aspose.slides.internal.k4y.q4e)var7.n5("tmAbs").l6();
                     var8.n5(l6(com.aspose.slides.ms.System.x8.c8(com.aspose.slides.ms.System.x8.n5(var10.l6()), 0)));
                     break;
                  case 1:
                     com.aspose.slides.internal.k4y.u6e var9 = (com.aspose.slides.internal.k4y.u6e)var7.n5("tmPct").l6();
                     var9.n5(com.aspose.slides.ms.System.x8.c8(com.aspose.slides.ms.System.x8.n5(var10.l6()), 0));
               }

               var7.n5(l6(var10.k5()));
               var7.n5((var10.u3() & 4294967295L) == 0L);
            }

            if (var5.z8() != null && var5.z8().length > 0) {
               com.aspose.slides.internal.k4y.h7e var11 = var0.a6();
               c5y.n5(var11, var5.z8(), false, var4);
            }

            if (var5.m3() != null && var5.m3().length > 0) {
               com.aspose.slides.internal.k4y.h7e var12 = new com.aspose.slides.internal.k4y.h7e();
               c5y.n5(var12, var5.m3(), var4);
               if (var12.n5().size() > 0) {
                  var0.n5(var12);
               }
            }
         }
      }
   }

   public static void n5(com.aspose.slides.internal.k4y.n0d var0, com.aspose.slides.internal.k0r.y2o var1, d5f var2) {
      var0.n5(c8(var1, var2));
      long var3 = n5(var1, var2) + -2147483648L;
      switch (var0.c8()) {
         case 0:
         case 1:
            if (var3 == 32L || var3 == 33L || var3 == 44L || var3 == 46L || var3 == 57L) {
               var3 = 0L;
            }
            break;
         case 2:
            if (var3 > 10L && var3 < 14L || var3 == 17L || var3 == 29L) {
               var3 = 0L;
            }
      }

      var0.n5(var3);
      var0.l6(l6(var1, var2) + -2147483648L);
      var0.u3(k5(var1, var2));
      var0.a6(u3(var1, var2));
      var0.u3(h0(var1, var2));
      var0.k5(n5(var1, 19, var2) & 4294967295L);
      var0.u9(u9(var1, var2));
      var0.h0(s7(var1, var2));
      var0.c8(a6(var1, var2));
      var0.a6(t2(var1, var2));
   }

   static boolean n5(com.aspose.slides.internal.k0r.y2o var0) {
      if (var0 == null) {
         return false;
      }

      com.aspose.slides.internal.k0r.j3z var1 = com.aspose.slides.internal.v6g.k5.n5(var0.n5(18), com.aspose.slides.internal.k0r.j3z.class);
      return var1 == null ? false : var1.a6();
   }

   static float l6(com.aspose.slides.internal.k0r.y2o var0) {
      if (var0 == null) {
         return 0.8F;
      }

      com.aspose.slides.internal.k0r.f4l var1 = com.aspose.slides.internal.v6g.k5.n5(var0.n5(22), com.aspose.slides.internal.k0r.f4l.class);
      return var1 == null ? 0.8F : var1.a6();
   }

   static boolean k5(com.aspose.slides.internal.k0r.y2o var0) {
      if (var0 == null) {
         return false;
      }

      com.aspose.slides.internal.k0r.j3z var1 = com.aspose.slides.internal.v6g.k5.n5(var0.n5(23), com.aspose.slides.internal.k0r.j3z.class);
      return var1 == null ? false : var1.a6();
   }

   static boolean u3(com.aspose.slides.internal.k0r.y2o var0) {
      if (var0 == null) {
         return false;
      }

      com.aspose.slides.internal.k0r.j3z var1 = com.aspose.slides.internal.v6g.k5.n5(var0.n5(26), com.aspose.slides.internal.k0r.j3z.class);
      return var1 == null ? false : var1.a6();
   }

   static int a6(com.aspose.slides.internal.k0r.y2o var0) {
      if (var0 == null) {
         return 1;
      }

      com.aspose.slides.internal.k0r.s5r var1 = com.aspose.slides.internal.v6g.k5.n5(var0.n5(15), com.aspose.slides.internal.k0r.s5r.class);
      return var1 == null ? 1 : var1.a6();
   }

   private static long n5(com.aspose.slides.internal.k0r.y2o var0, d5f var1) {
      long var2 = n5(var0, 9, var1);
      return var2 == -1L ? var2 : var2 - -2147483648L;
   }

   private static long l6(com.aspose.slides.internal.k0r.y2o var0, d5f var1) {
      long var2 = n5(var0, 10, var1);
      return var2 == -1L ? var2 : var2 - -2147483648L;
   }

   private static String k5(com.aspose.slides.internal.k0r.y2o var0, d5f var1) {
      if (var0 == null) {
         var1.n5("TimePropertyList4TimeNodeContainer is not exists.", 0);
         return null;
      } else {
         com.aspose.slides.internal.k0r.g5d var2 = com.aspose.slides.internal.v6g.k5.n5(var0.n5(16), com.aspose.slides.internal.k0r.g5d.class);
         return var2 == null ? null : var2.a6();
      }
   }

   private static String u3(com.aspose.slides.internal.k0r.y2o var0, d5f var1) {
      if (var0 == null) {
         var1.n5("TimePropertyList4TimeNodeContainer is not exists.", 0);
         return null;
      } else {
         com.aspose.slides.internal.k0r.g5d var2 = com.aspose.slides.internal.v6g.k5.n5(var0.n5(17), com.aspose.slides.internal.k0r.g5d.class);
         return var2 == null ? null : var2.a6();
      }
   }

   private static byte a6(com.aspose.slides.internal.k0r.y2o var0, d5f var1) {
      if (var0 == null) {
         var1.n5("TimePropertyList4TimeNodeContainer is not exists.", 0);
         return -1;
      } else {
         com.aspose.slides.internal.k0r.j3z var2 = com.aspose.slides.internal.v6g.k5.n5(var0.n5(21), com.aspose.slides.internal.k0r.j3z.class);
         if (var2 == null) {
            return -1;
         } else {
            return (byte)(var2.a6() ? 1 : 0);
         }
      }
   }

   private static byte u9(com.aspose.slides.internal.k0r.y2o var0, d5f var1) {
      if (var0 == null) {
         var1.n5("TimePropertyList4TimeNodeContainer is not exists.", 0);
         return -1;
      } else {
         com.aspose.slides.internal.k0r.j3z var2 = com.aspose.slides.internal.v6g.k5.n5(var0.n5(13), com.aspose.slides.internal.k0r.j3z.class);
         if (var2 == null) {
            return -1;
         } else {
            return (byte)(var2.a6() ? 1 : 0);
         }
      }
   }

   private static byte h0(com.aspose.slides.internal.k0r.y2o var0, d5f var1) {
      if (var0 == null) {
         var1.n5("TimePropertyList4TimeNodeContainer is not exists.", 0);
         return -1;
      } else {
         com.aspose.slides.internal.k0r.s5r var2 = com.aspose.slides.internal.v6g.k5.n5(var0.n5(2), com.aspose.slides.internal.k0r.s5r.class);
         if (var2 == null) {
            return -1;
         } else {
            return (byte)(var2.a6() == 0 ? 1 : 0);
         }
      }
   }

   private static byte c8(com.aspose.slides.internal.k0r.y2o var0, d5f var1) {
      int var2 = n5(var0, 11, var1);
      switch (var2) {
         case 1:
            return 0;
         case 2:
            return 1;
         case 3:
            return 2;
         case 4:
            return 3;
         case 5:
            return 4;
         case 6:
            return 5;
         default:
            return -1;
      }
   }

   private static int l6(byte var0) {
      switch (var0) {
         case 0:
            return 1;
         case 1:
            return 2;
         case 2:
            return 3;
         case 3:
            return 4;
         case 4:
            return 5;
         case 5:
            return 6;
         default:
            throw new NotImplementedException();
      }
   }

   private static byte t2(com.aspose.slides.internal.k0r.y2o var0, d5f var1) {
      if (var0 == null) {
         var1.n5("TimePropertyList4TimeNodeContainer is not exists.", 0);
         return -1;
      }

      com.aspose.slides.internal.k0r.s5r var2 = com.aspose.slides.internal.v6g.k5.n5(var0.n5(5), com.aspose.slides.internal.k0r.s5r.class);
      if (var2 == null) {
         return -1;
      }

      switch (var2.a6()) {
         case 0:
            return 0;
         case 2:
            return 2;
         default:
            return -1;
      }
   }

   private static int n5(com.aspose.slides.internal.k0r.y2o var0, int var1, d5f var2) {
      if (var0 == null) {
         var2.n5("TimePropertyList4TimeNodeContainer is not exists.", 0);
         return -1;
      } else {
         com.aspose.slides.internal.k0r.s5r var3 = com.aspose.slides.internal.v6g.k5.n5(var0.n5(var1), com.aspose.slides.internal.k0r.s5r.class);
         return var3 == null ? -1 : var3.a6();
      }
   }

   private static byte s7(com.aspose.slides.internal.k0r.y2o var0, d5f var1) {
      int var2 = n5(var0, 20, var1);
      switch (var2) {
         case 1:
            return 0;
         case 2:
            return 1;
         case 3:
            return 2;
         case 4:
            return 3;
         case 5:
            return 4;
         case 6:
            return 5;
         case 7:
            return 6;
         case 8:
            return 7;
         case 9:
            return 8;
         default:
            return -1;
      }
   }

   static int n5(byte var0) {
      switch (var0) {
         case 0:
            return 1;
         case 1:
            return 2;
         case 2:
            return 3;
         case 3:
            return 4;
         case 4:
            return 5;
         case 5:
            return 6;
         case 6:
            return 7;
         case 7:
            return 8;
         case 8:
            return 9;
         default:
            throw new NotImplementedException();
      }
   }

   public static void n5(com.aspose.slides.internal.k4y.n0d var0, com.aspose.slides.internal.k0r.a2w var1, d5f var2) {
      if (var1 == null) {
         var2.n5("TimeNodeAtom is not exists.", 0);
      } else {
         if (var1.t2()) {
            var0.n5(l6(n5(var1)));
         }

         if (var1.h0()) {
            var0.l6(l6(var1));
         }

         if (var1.u9()) {
            var0.k5(k5(var1));
         }
      }
   }

   static float n5(com.aspose.slides.internal.k0r.a2w var0) {
      return !var0.t2() ? Float.NaN : var0.a6() / 1000.0F;
   }

   static int n5(float var0) {
      return com.aspose.slides.ms.System.n1.a6(var0) ? -1 : com.aspose.slides.ms.System.z3.h0(var0 * 1000.0F);
   }

   static String l6(float var0) {
      return com.aspose.slides.ms.System.n1.a6(var0)
         ? "indefinite"
         : com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(var0 * 1000.0F), 14));
   }

   private static byte l6(com.aspose.slides.internal.k0r.a2w var0) {
      if (!var0.h0()) {
         return -1;
      }

      switch ((int)var0.l6()) {
         case 0:
         case 3:
            return 2;
         case 1:
            return 0;
         case 2:
            return 1;
         default:
            return -1;
      }
   }

   private static byte k5(com.aspose.slides.internal.k0r.a2w var0) {
      switch ((int)var0.u3()) {
         case 0:
            return -1;
         case 1:
            return 0;
         case 2:
            return 1;
         case 3:
            return 2;
         case 4:
            return 3;
         default:
            return -1;
      }
   }

   public static void n5(com.aspose.slides.internal.k4y.n0d var0, com.aspose.slides.internal.k0r.x5h[] var1) {
      var0.l6(l6(1.0F));
      var0.n5(100.0F);
      var0.l6(0.0F);
      var0.k5(0.0F);
      var0.n5(false);
      if (var1 != null) {
         for (com.aspose.slides.internal.k0r.x5h var5 : var1) {
            n5(var0, var5);
         }
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.n0d var0, com.aspose.slides.internal.k0r.x5h var1) {
      switch ((int)var1.l6()) {
         case 0:
            var0.l6(l6(n5(var1.k5())));
            break;
         case 1:
            var0.k5(l6(com.aspose.slides.ms.System.x8.c8(com.aspose.slides.ms.System.x8.n5(var1.k5()), 0)));
            break;
         case 2:
            var0.n5(com.aspose.slides.ms.System.x8.c8(com.aspose.slides.ms.System.x8.n5(var1.k5()), 0) * 100.0F);
            break;
         case 3:
            var0.l6(com.aspose.slides.ms.System.x8.c8(com.aspose.slides.ms.System.x8.n5(var1.k5()), 0) * 100.0F);
            break;
         case 4:
            var0.k5(com.aspose.slides.ms.System.x8.c8(com.aspose.slides.ms.System.x8.n5(var1.k5()), 0) * 100.0F);
            break;
         case 5:
            var0.n5((var1.k5() & 4294967295L) != 0L);
      }
   }

   private static float n5(long var0) {
      switch ((int)var0) {
         case 0:
            return 0.0F;
         case 1065353216:
            return 1.0F;
         case 1073741824:
            return 2.0F;
         case 1077936128:
            return 3.0F;
         case 1082130432:
            return 4.0F;
         case 1084227584:
            return 5.0F;
         case 1092616192:
            return 10.0F;
         case 2139095039:
            return Float.POSITIVE_INFINITY;
         default:
            return 1.0F;
      }
   }

   private static long k5(float var0) {
      if (var0 == 1.0F) {
         return 1065353216L;
      } else if (com.aspose.slides.ms.System.n1.a6(var0)) {
         return 2139095039L;
      } else if (var0 == 2.0F) {
         return 1073741824L;
      } else if (var0 == 3.0F) {
         return 1077936128L;
      } else if (var0 == 4.0F) {
         return 1082130432L;
      } else if (var0 == 5.0F) {
         return 1084227584L;
      } else if (var0 == 10.0F) {
         return 1092616192L;
      } else {
         return var0 == 0.0F ? 0L : 1065353216L;
      }
   }

   private static byte l6(long var0) {
      switch ((int)var0) {
         case 0:
            return 0;
         case 1:
            return 1;
         case 2:
            return 2;
         default:
            return 0;
      }
   }

   private static long k5(byte var0) {
      switch (var0) {
         case 0:
            return 0L;
         case 1:
            return 1L;
         case 2:
            return 2L;
         default:
            throw new ArgumentOutOfRangeException("type");
      }
   }

   public static void n5(com.aspose.slides.internal.k4y.q3a var0, com.aspose.slides.internal.k0r.a6 var1) {
      if (var0 != null) {
         if (var0.k5() != -1 || var0.u3() != -1 || var0.a6() != -1) {
            com.aspose.slides.internal.k0r.o9i var2 = new com.aspose.slides.internal.k0r.o9i();
            var1.e2().addItem(var2);
            if (var0.k5() != -1) {
               var2.n5(true);
               var2.n5((var0.k5() == 1 ? 1 : 0) & 4294967295L);
            } else {
               var2.n5(false);
               var2.n5(0L);
            }

            if (var0.a6() != -1) {
               var2.l6(true);
               var2.l6((var0.a6() == 0 ? 0 : 1) & 4294967295L);
            } else {
               var2.l6(false);
               var2.l6(0L);
            }

            if (var0.u3() != -1) {
               var2.k5(true);
               var2.k5((var0.u3() == 0 ? 0 : 1) & 4294967295L);
            } else {
               var2.k5(false);
               var2.k5(0L);
            }
         }
      }
   }

   public static void n5(com.aspose.slides.internal.k4y.n0d var0, com.aspose.slides.internal.k0r.a6 var1, int var2) {
      if (var0 != null) {
         com.aspose.slides.internal.k0r.a2w var3 = new com.aspose.slides.internal.k0r.a2w();
         var1.e2().addItem(var3);
         var3.n5(var2);
         if (!com.aspose.slides.ms.System.d1.n5(var0.s7())) {
            var3.u3(true);
            var3.l6(n5(o5.n5(var0.s7())));
         } else {
            var3.u3(false);
            var3.l6(0);
         }

         if (var0.t4() != -1) {
            var3.l6(true);
            switch (var0.t4()) {
               case 0:
                  var3.n5(1L);
                  break;
               case 1:
                  var3.n5(2L);
                  break;
               case 2:
                  var3.n5(3L);
                  break;
               default:
                  throw new NotImplementedException();
            }
         } else {
            var3.l6(false);
            var3.n5(0L);
         }

         if (var0.q0() != -1) {
            var3.n5(true);
            switch (var0.q0()) {
               case 0:
                  var3.l6(1L);
                  break;
               case 1:
                  var3.l6(2L);
                  break;
               case 2:
                  var3.l6(3L);
                  break;
               case 3:
                  var3.l6(4L);
                  break;
               default:
                  throw new NotImplementedException();
            }
         } else {
            var3.n5(false);
            var3.l6(0L);
         }

         if (var2 == 3) {
            var3.k5(true);
         } else {
            var3.k5(false);
         }
      }
   }

   public static void n5(com.aspose.slides.internal.k4y.n0d var0, com.aspose.slides.internal.k0r.a6 var1) {
      if (var0 != null) {
         com.aspose.slides.internal.k0r.y2o var2 = new com.aspose.slides.internal.k0r.y2o();
         var1.e2().addItem(var2);
         if (var0.k7() != -1) {
            com.aspose.slides.internal.k0r.s5r var3 = new com.aspose.slides.internal.k0r.s5r(var0.k7() == 1 ? 0 : 1);
            var3.w1().n5((short)2);
            var2.e2().addItem(var3);
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k0r.c9b.class)) {
            com.aspose.slides.internal.k0r.s5r var4 = new com.aspose.slides.internal.k0r.s5r(1);
            var4.w1().n5((short)6);
            var2.e2().addItem(var4);
         }

         if (var0.h0() != -2147483649L) {
            com.aspose.slides.internal.k0r.s5r var5 = new com.aspose.slides.internal.k0r.s5r((int)var0.h0());
            var5.w1().n5((short)9);
            var2.e2().addItem(var5);
         }

         if (var0.c8() != -1) {
            com.aspose.slides.internal.k0r.s5r var6 = new com.aspose.slides.internal.k0r.s5r(l6(var0.c8()));
            var6.w1().n5((short)11);
            var2.e2().addItem(var6);
         }

         if (var0.t2() != -2147483649L) {
            com.aspose.slides.internal.k0r.s5r var7 = new com.aspose.slides.internal.k0r.s5r((int)var0.t2());
            var7.w1().n5((short)10);
            var2.e2().addItem(var7);
         }

         if ((var0.z8() & 4294967295L) != 4294967295L) {
            com.aspose.slides.internal.k0r.s5r var8 = new com.aspose.slides.internal.k0r.s5r((int)var0.z8());
            var8.w1().n5((short)19);
            var2.e2().addItem(var8);
         }

         if (!com.aspose.slides.ms.System.d1.n5(var0.m1())) {
            com.aspose.slides.internal.k0r.g5d var9 = new com.aspose.slides.internal.k0r.g5d(var0.m1());
            var9.w1().n5((short)17);
            var2.e2().addItem(var9);
         }

         if (!com.aspose.slides.ms.System.d1.n5(var0.z3())) {
            com.aspose.slides.internal.k0r.g5d var10 = new com.aspose.slides.internal.k0r.g5d(var0.z3());
            var10.w1().n5((short)16);
            var2.e2().addItem(var10);
         }

         if (var0.w1() != -1) {
            com.aspose.slides.internal.k0r.s5r var11 = new com.aspose.slides.internal.k0r.s5r(n5(var0.w1()));
            var11.w1().n5((short)20);
            var2.e2().addItem(var11);
         }

         if (var0.j5() != -1) {
            com.aspose.slides.internal.k0r.j3z var12 = new com.aspose.slides.internal.k0r.j3z(var0.j5() == 1);
            var12.w1().n5((short)13);
            var2.e2().addItem(var12);
         }

         if (var0.r4() != -1) {
            com.aspose.slides.internal.k0r.j3z var13 = new com.aspose.slides.internal.k0r.j3z(var0.r4() == 1);
            var13.w1().n5((short)21);
            var2.e2().addItem(var13);
         }

         if (var0.m3() != -1) {
            com.aspose.slides.internal.k0r.s5r var14 = new com.aspose.slides.internal.k0r.s5r(var0.m3() == 2 ? 2 : 0);
            var14.w1().n5((short)5);
            var2.e2().addItem(var14);
         }
      }
   }

   public static void l6(com.aspose.slides.internal.k4y.n0d var0, com.aspose.slides.internal.k0r.a6 var1) {
      if (var0 != null && var0.a0() != null) {
         com.aspose.slides.internal.k4y.b6z var2 = var0.a0();
         com.aspose.slides.internal.k0r.x2y var3 = new com.aspose.slides.internal.k0r.x2y();
         var1.e2().addItem(var3);
         var3.l6(k5(var2.n5()));
         var3.l6(true);
         var3.k5((var2.l6() ? 0 : 1) & 4294967295L);
         var3.n5(true);
         switch (n5.n5(var2.k5().n5())) {
            case 0:
               var3.u3(0L);
               var3.u3(true);
               com.aspose.slides.internal.k4y.q4e var8 = (com.aspose.slides.internal.k4y.q4e)var2.k5().l6();
               float var5 = 0.0F;
               float[] var6 = new float[]{0.0F};
               boolean var7 = com.aspose.slides.ms.System.n1.n5(var8.n5(), var6);
               var5 = var6[0];
               if (var7) {
                  var3.n5(com.aspose.slides.ms.System.x8.l6(com.aspose.slides.ms.System.x8.n5(var5 / 100.0F), 0));
               } else {
                  var3.n5(com.aspose.slides.ms.System.x8.l6(com.aspose.slides.ms.System.x8.l6(10), 0));
                  var3.k5(true);
               }
               break;
            case 1:
               var3.u3(1L);
               var3.u3(true);
               com.aspose.slides.internal.k4y.u6e var4 = (com.aspose.slides.internal.k4y.u6e)var2.k5().l6();
               var3.n5(com.aspose.slides.ms.System.x8.l6(com.aspose.slides.ms.System.x8.n5(var4.n5()), 0));
               var3.k5(true);
               break;
            default:
               var3.l6(0L);
         }
      }
   }

   public static void k5(com.aspose.slides.internal.k4y.n0d var0, com.aspose.slides.internal.k0r.a6 var1) {
      if (var0 != null) {
         if (n5(var0)) {
            if (!com.aspose.slides.ms.System.d1.n5(var0.x8())) {
               com.aspose.slides.internal.k0r.x5h var2 = new com.aspose.slides.internal.k0r.x5h();
               var2.n5(0L);
               var2.l6(k5(o5.n5(var0.x8())));
               var1.e2().addItem(var2);
            }

            if (!com.aspose.slides.ms.System.d1.n5(var0.n3())) {
               com.aspose.slides.internal.k0r.x5h var3 = new com.aspose.slides.internal.k0r.x5h();
               var3.n5(1L);
               var3.l6(com.aspose.slides.ms.System.Xml.f4.q0(var0.n3()));
               var1.e2().addItem(var3);
            }

            if (var0.y4() != 100.0F) {
               com.aspose.slides.internal.k0r.x5h var4 = new com.aspose.slides.internal.k0r.x5h();
               var4.n5(2L);
               var4.l6(com.aspose.slides.ms.System.x8.l6(com.aspose.slides.ms.System.x8.n5(var0.y4() / 100.0F), 0));
               var1.e2().addItem(var4);
            }

            if (var0.e2() != 0.0F) {
               com.aspose.slides.internal.k0r.x5h var5 = new com.aspose.slides.internal.k0r.x5h();
               var5.n5(3L);
               var5.l6(com.aspose.slides.ms.System.x8.l6(com.aspose.slides.ms.System.x8.n5(var0.e2() / 100.0F), 0));
               var1.e2().addItem(var5);
            }

            if (var0.t9() != 0.0F) {
               com.aspose.slides.internal.k0r.x5h var6 = new com.aspose.slides.internal.k0r.x5h();
               var6.n5(4L);
               var6.l6(com.aspose.slides.ms.System.x8.l6(com.aspose.slides.ms.System.x8.n5(var0.t9() / 100.0F), 0));
               var1.e2().addItem(var6);
            }

            if (var0.z1()) {
               com.aspose.slides.internal.k0r.x5h var7 = new com.aspose.slides.internal.k0r.x5h();
               var7.n5(5L);
               var7.l6((var0.z1() ? 1 : 0) & 4294967295L);
               var1.e2().addItem(var7);
            }
         }
      }
   }

   private static boolean n5(com.aspose.slides.internal.k4y.n0d var0) {
      return !"1000".equals(var0.x8())
         || !com.aspose.slides.ms.System.d1.n5(var0.n3())
         || var0.y4() != 100.0F
         || var0.e2() != 0.0F
         || var0.t9() != 0.0F
         || var0.z1();
   }

   static void n5(com.aspose.slides.internal.k4y.u2q var0, com.aspose.slides.internal.k0r.q9u var1, d5t var2) {
      if (var0 == null) {
         throw new ArgumentNullException();
      }

      if (var1 == null) {
         throw new ArgumentNullException();
      }

      r2p.n5(var0, var1);
      r2p.l6(var0, var1);
      y1t.n5(var0.h0(), var1, var2);
   }
}
