package com.aspose.slides;

class n1s {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("tgtEl", "tn", "rtn");

   public static void n5(com.aspose.slides.internal.k4y.d1x var0, com.aspose.slides.internal.k0r.v2x var1, t2s var2) {
      if (var1 != null) {
         if (var1.l6() != null) {
            if (var1.l6().l6() == 1 && var1.u3() != null) {
               com.aspose.slides.internal.k4y.s2a var5 = (com.aspose.slides.internal.k4y.s2a)var0.n5("tgtEl").l6();
               y1t.n5(var5, var1.u3().l6(), var2);
            } else if (var1.l6().l6() == 3) {
               com.aspose.slides.internal.k4y.v0e var3 = (com.aspose.slides.internal.k4y.v0e)var0.n5("rtn").l6();
               var3.n5(3);
            } else if (var1.l6().l6() == 2) {
               com.aspose.slides.internal.k4y.i1s var4 = (com.aspose.slides.internal.k4y.i1s)var0.n5("tn").l6();
               var4.n5((int)var1.l6().u3());
            }

            var0.n5(n5(var1.l6().k5()));
            var0.l6(w7n.l6(var1.l6().a6() / 1000.0F));
         }
      }
   }

   private static byte n5(long var0) {
      switch ((int)var0) {
         case 0:
            return -1;
         case 1:
            return 0;
         case 2:
         case 6:
         case 8:
         default:
            return -1;
         case 3:
            return 2;
         case 4:
            return 3;
         case 5:
            return 4;
         case 7:
            return 6;
         case 9:
            return 8;
         case 10:
            return 9;
         case 11:
            return 10;
      }
   }

   private static long n5(byte var0) {
      switch (var0) {
         case -1:
            return 0L;
         case 0:
            return 1L;
         case 1:
         case 5:
         case 7:
         default:
            return 0L;
         case 2:
            return 3L;
         case 3:
            return 4L;
         case 4:
            return 5L;
         case 6:
            return 7L;
         case 8:
            return 9L;
         case 9:
            return 10L;
         case 10:
            return 11L;
      }
   }

   public static void n5(com.aspose.slides.internal.k4y.d1x var0, com.aspose.slides.internal.k0r.a6 var1, int var2, d5t var3) {
      if (var0 != null) {
         com.aspose.slides.internal.k0r.v2x var4 = new com.aspose.slides.internal.k0r.v2x(var2);
         var1.e2().addItem(var4);
         n5(var0, var4);
         if (var0.k5() != null && "tgtEl".equals(var0.k5().n5())) {
            y1t.n5((com.aspose.slides.internal.k4y.s2a)var0.k5().l6(), var4, var3);
         }
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.d1x var0, com.aspose.slides.internal.k0r.v2x var1) {
      com.aspose.slides.internal.k0r.e2l var2 = new com.aspose.slides.internal.k0r.e2l();
      var1.e2().addItem(var2);
      if (var0.k5() == null) {
         var2.n5(0);
      } else {
         switch (n5.n5(var0.k5().n5())) {
            case 0:
               var2.n5(1);
               break;
            case 1:
               var2.n5(2);
               com.aspose.slides.internal.k4y.i1s var3 = (com.aspose.slides.internal.k4y.i1s)var0.k5().l6();
               var2.l6(var3.n5() & 4294967295L);
               break;
            case 2:
               var2.n5(3);
               var2.l6(2L);
               break;
            default:
               var2.n5(0);
         }
      }

      var2.n5(n5(var0.n5()));
      float var4 = o5.n5(var0.l6());
      var2.l6(com.aspose.slides.ms.System.n1.k5(var4) ? 0 : w7n.n5(var4));
   }
}
