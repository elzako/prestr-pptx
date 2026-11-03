package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.IDisposable;

class y1t {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "sldTgt", "sndTgt", "spTgt", "bg", "txEl", "graphicEl", "oleChartEl", "charRg", "pRg"
   );

   public static void n5(com.aspose.slides.internal.k4y.s2a var0, com.aspose.slides.internal.k0r.a1g var1, t2s var2) {
      if (var1 != null) {
         switch (var1.w1().u3()) {
            case 11003:
               l6(var0, var1, var2);
               break;
            case 11009:
               n5(var0, var1);
               break;
            default:
               throw new NotImplementedException();
         }
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.s2a var0, com.aspose.slides.internal.k0r.a1g var1) {
      com.aspose.slides.internal.k0r.q5v var2 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k0r.q5v.class);
      if (var2 == null) {
         throw new InvalidOperationException();
      }

      var0.n5("sldTgt");
   }

   private static void l6(com.aspose.slides.internal.k4y.s2a var0, com.aspose.slides.internal.k0r.a1g var1, t2s var2) {
      com.aspose.slides.internal.k0r.k0y var3 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k0r.k0y.class);
      if (var3 == null) {
         throw new InvalidOperationException();
      }

      n5(var0, var3, var2);
      l6(var0, var3, var2);
      k5(var0, var3, var2);
   }

   private static boolean n5(com.aspose.slides.internal.k4y.s2a var0, com.aspose.slides.internal.k0r.k0y var1, t2s var2) {
      com.aspose.slides.internal.k0r.v7o var3 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k0r.v7o.class);
      if (var3 == null) {
         return false;
      }

      d5f var4 = var2.a6();
      com.aspose.slides.internal.k0r.d0p var5 = var4.h0().s7();
      if (var5 == null) {
         return false;
      }

      com.aspose.slides.internal.k4y.x7n var6 = (com.aspose.slides.internal.k4y.x7n)var0.n5("sndTgt").l6();
      com.aspose.slides.internal.k0r.x6s var7 = var5.n5((int)var3.l6());
      if (var7 != null && var7.a6() != null) {
         var6.n5(var7.a6().l6());
         if (var7.l6() != null) {
            var6.l6(var7.l6().l6());
         }

         if (var7.u9() != null) {
            var4.n5(var7);
         }
      }

      return true;
   }

   private static boolean l6(com.aspose.slides.internal.k4y.s2a var0, com.aspose.slides.internal.k0r.k0y var1, t2s var2) {
      com.aspose.slides.internal.k0r.t1h var3 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k0r.t1h.class);
      if (var3 == null) {
         return false;
      }

      com.aspose.slides.internal.k4y.h1f var4 = (com.aspose.slides.internal.k4y.h1f)var0.n5("spTgt").l6();
      if (var2.m3().containsKey(var3.l6())) {
         var4.l6(com.aspose.slides.ms.System.Xml.f4.l6(var3.l6()));
      }

      com.aspose.slides.internal.k4y.v4l var5 = (com.aspose.slides.internal.k4y.v4l)var4.n5("oleChartEl").l6();
      var5.n5(n5(var3.k5()));
      if (var3.u3() >= 0) {
         var5.n5(var3.u3() & 4294967295L);
      }

      return true;
   }

   private static boolean k5(com.aspose.slides.internal.k4y.s2a var0, com.aspose.slides.internal.k0r.k0y var1, t2s var2) {
      com.aspose.slides.internal.k0r.i8n var3 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.k0r.i8n.class);
      if (var3 == null) {
         return false;
      }

      com.aspose.slides.internal.k4y.h1f var4 = (com.aspose.slides.internal.k4y.h1f)var0.n5("spTgt").l6();
      if (var2.m3().containsKey(var3.l6())) {
         var4.l6(com.aspose.slides.ms.System.Xml.f4.l6(var3.l6()));
      }

      if (var3.a6() != 0) {
         if (var3.a6() == 6) {
            var4.n5("bg");
         } else if (var3.a6() == 2) {
            com.aspose.slides.internal.k4y.t4n var5 = (com.aspose.slides.internal.k4y.t4n)var4.n5("txEl").l6();
            com.aspose.slides.internal.k4y.v6b var6 = (com.aspose.slides.internal.k4y.v6b)var5.n5("charRg").l6();
            var6.n5(var3.k5() & 4294967295L);
            var6.l6(var3.u3() & 4294967295L);
         }
      }

      return true;
   }

   private static byte n5(int var0) {
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
            throw new NotImplementedException();
      }
   }

   public static void n5(com.aspose.slides.internal.k4y.s2a var0, com.aspose.slides.internal.k0r.v2x var1, d5t var2) {
      if (var0 != null) {
         com.aspose.slides.internal.k0r.z3 var3 = new com.aspose.slides.internal.k0r.z3();
         var1.e2().addItem(var3);
         n5(var0, var3, var2);
      }
   }

   public static void n5(com.aspose.slides.internal.k4y.s2a var0, com.aspose.slides.internal.k0r.q9u var1, d5t var2) {
      if (var0 != null) {
         com.aspose.slides.internal.k0r.z3 var3 = new com.aspose.slides.internal.k0r.z3();
         n5(var0, var3, var2);
         if (var3.e2().size() > 0) {
            var1.e2().addItem(var3);
         }
      }
   }

   public static void n5(com.aspose.slides.internal.k4y.s2a var0, com.aspose.slides.internal.k0r.a6 var1, d5t var2) {
      if (var0 != null) {
         com.aspose.slides.internal.k0r.z3 var3 = new com.aspose.slides.internal.k0r.z3();
         var1.e2().addItem(var3);
         n5(var0, var3, var2);
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.s2a var0, com.aspose.slides.internal.k0r.z3 var1, d5t var2) {
      if (var0 == null || var0.n5() == null) {
         throw new InvalidOperationException();
      }

      if (var1 == null) {
         throw new InvalidOperationException();
      }

      com.aspose.slides.internal.k4y.g7 var3 = var0.n5();
      switch (n5.n5(var3.n5())) {
         case 0:
            com.aspose.slides.internal.k0r.q5v var4 = new com.aspose.slides.internal.k0r.q5v();
            var1.e2().addItem(var4);
            break;
         case 1:
            com.aspose.slides.internal.k0r.v7o var11 = new com.aspose.slides.internal.k0r.v7o();
            var1.e2().addItem(var11);
            com.aspose.slides.internal.k4y.x7n var6 = (com.aspose.slides.internal.k4y.x7n)var3.l6();
            var11.k5(3);
            long var7 = 0L;
            long[] var9 = new long[]{0L};
            boolean var10 = com.aspose.slides.ms.System.l4.n5(var6.n5(), var9);
            var7 = var9[0];
            if (var10) {
               var11.n5(var7);
            } else {
               if (com.aspose.slides.ms.System.d1.n5(var6.n5()) || !com.aspose.slides.ms.System.d1.l6(var6.n5(), "rId")) {
                  throw new InvalidOperationException();
               }

               var11.n5(var2.l6(var6.n5()) & 4294967295L);
            }
            break;
         case 2:
            com.aspose.slides.internal.k4y.h1f var5 = (com.aspose.slides.internal.k4y.h1f)var3.l6();
            n5(var5, var1, var2);
            break;
         default:
            var2.n5("Writing of the animation target failed.", 1);
      }
   }

   private static IShape n5(d5t var0, String var1) {
      Dictionary$Enumerator var2 = var0.n5().iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            if (com.aspose.slides.ms.System.d1.a6(com.aspose.slides.ms.System.Xml.f4.l6(((Long)var3.getValue()).longValue()), var1)) {
               return (IShape)var3.getKey();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return null;
   }

   private static void n5(com.aspose.slides.internal.k4y.h1f var0, com.aspose.slides.internal.k0r.z3 var1, d5t var2) {
      if (var0 == null) {
         throw new InvalidOperationException();
      }

      if (var1 == null) {
         throw new InvalidOperationException();
      }

      if (var0.l6() == null) {
         if (n5(var0.n5(), var2)) {
            com.aspose.slides.internal.k0r.i8n var3 = new com.aspose.slides.internal.k0r.i8n();
            var1.e2().addItem(var3);
            IShape var4 = n5(var2, var0.n5());
            if (com.aspose.slides.internal.v6g.k5.l6(var4, IAudioFrame.class)) {
               var3.k5(3);
            } else if (com.aspose.slides.internal.v6g.k5.l6(var4, IVideoFrame.class)) {
               var3.k5(4);
            } else {
               var3.k5(0);
            }

            var3.n5(l6(var0.n5(), var2));
            var3.n5(-1);
            var3.l6(-1);
         }
      } else {
         switch (n5.n5(var0.l6().n5())) {
            case 3:
               com.aspose.slides.internal.k0r.i8n var9 = new com.aspose.slides.internal.k0r.i8n();
               var1.e2().addItem(var9);
               var9.k5(6);
               var9.n5(l6(var0.n5(), var2));
               var9.n5(-1);
               var9.l6(-1);
               break;
            case 4:
               com.aspose.slides.internal.k4y.t4n var10 = (com.aspose.slides.internal.k4y.t4n)var0.l6().l6();
               if (var10.n5() != null) {
                  com.aspose.slides.internal.k4y.v6b var5 = (com.aspose.slides.internal.k4y.v6b)var10.n5().l6();
                  switch (n5.n5(var10.n5().n5())) {
                     case 7:
                        com.aspose.slides.internal.k0r.i8n var11 = new com.aspose.slides.internal.k0r.i8n();
                        var1.e2().addItem(var11);
                        var11.k5(2);
                        var11.n5(l6(var0.n5(), var2));
                        var11.n5((int)var5.n5());
                        var11.l6((int)var5.l6());
                        break;
                     case 8:
                        com.aspose.slides.internal.k0r.i8n var12 = new com.aspose.slides.internal.k0r.i8n();
                        var1.e2().addItem(var12);
                        var12.k5(2);
                        var12.n5(l6(var0.n5(), var2));
                        IShape var13 = n5(var2, var0.n5());
                        n5(var12, (IAutoShape)var13, var5.n5(), var5.l6());
                        break;
                     default:
                        var2.n5("Writing of the animation target failed.", 1);
                  }
               }
               break;
            case 5:
               com.aspose.slides.internal.k0r.i8n var6 = new com.aspose.slides.internal.k0r.i8n();
               var1.e2().addItem(var6);
               var6.k5(0);
               var6.n5(l6(var0.n5(), var2));
               var6.n5(-1);
               var6.l6(-1);
               break;
            case 6:
               com.aspose.slides.internal.k4y.v4l var7 = com.aspose.slides.internal.v6g.k5.n5(var0.l6().l6(), com.aspose.slides.internal.k4y.v4l.class);
               com.aspose.slides.internal.k0r.t1h var8 = new com.aspose.slides.internal.k0r.t1h();
               var1.e2().addItem(var8);
               var8.k5(5);
               var8.n5(l6(var0.n5(), var2));
               var8.n5(n5(var7.n5()));
               var8.l6((int)var7.l6());
               break;
            default:
               var2.n5("Writing of the animation target failed.", 1);
         }
      }
   }

   private static void n5(com.aspose.slides.internal.k0r.i8n var0, IAutoShape var1, long var2, long var4) {
      int var6 = o5.n5(var1, var2);
      int var7 = o5.l6(var1, var4);
      if (var6 != -1 && var7 != -1) {
         var0.n5(var6);
         var0.l6(var7);
      }
   }

   private static int n5(byte var0) {
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
            return 0;
      }
   }

   public static boolean n5(String var0, d5t var1) {
      if (var0 == null) {
         return false;
      }

      long var2 = com.aspose.slides.ms.System.Xml.f4.q0(var0);
      return var1.l6().containsKey(var2);
   }

   public static long l6(String var0, d5t var1) {
      long var2 = com.aspose.slides.ms.System.Xml.f4.q0(var0);
      if (!var1.l6().containsKey(var2)) {
         throw new InvalidOperationException();
      } else {
         return var1.l6().get_Item(var2).m3().l6();
      }
   }
}
