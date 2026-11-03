package com.aspose.slides;

import com.aspose.slides.exceptions.InvalidOperationException;

class p0 {
   public static void n5(com.aspose.slides.internal.k4y.m7f var0, com.aspose.slides.internal.k0r.n3 var1, long[] var2, d5t var3) {
      if (var0 != null) {
         if (var0.n5() == null || y1t.n5(var0.n5(), var3)) {
            if (var1 == null) {
               throw new InvalidOperationException();
            }

            com.aspose.slides.internal.k0r.i5 var4 = new com.aspose.slides.internal.k0r.i5();
            var1.e2().addItem(var4);
            com.aspose.slides.internal.k0r.x8 var5 = new com.aspose.slides.internal.k0r.x8();
            var4.e2().addItem(var5);
            var5.l6(var0.l6());
            var5.n5(1L);
            if (var0.n5() != null) {
               var5.k5(y1t.l6(var0.n5(), var3));
            }

            var5.n5((byte)1);
            var5.l6((byte)(var0.k5() ? 1 : 0));
            com.aspose.slides.internal.k0r.g0 var6 = new com.aspose.slides.internal.k0r.g0();
            var4.e2().addItem(var6);
            var6.w1().n5((byte)1);
            if (var0.u3() != 0) {
               var6.n5(n5(var0.u3()));
            } else {
               var6.n5(0L);
            }

            var6.l6(var0.a6());
            var6.n5((byte)(var0.u9() ? 0 : 1));
            var6.l6((byte)(var0.c8() ? 1 : 0));
            var6.k5((byte)(var0.h0() ? 0 : 1));
            var6.u3((byte)0);
         }
      }
   }

   public static void n5(com.aspose.slides.internal.k4y.k8b var0, com.aspose.slides.internal.k0r.n3 var1, d5t var2) {
      if (var0 != null) {
         if (var0.n5() == null || y1t.n5(var0.n5(), var2)) {
            if (var1 == null) {
               throw new InvalidOperationException();
            }

            com.aspose.slides.internal.k0r.p8 var3 = new com.aspose.slides.internal.k0r.p8();
            var1.e2().addItem(var3);
            com.aspose.slides.internal.k0r.x8 var4 = new com.aspose.slides.internal.k0r.x8();
            var3.e2().addItem(var4);
            var4.n5(3L);
            var4.n5((byte)1);
            if (var0.n5() != null) {
               var4.k5(y1t.l6(var0.n5(), var2));
            }

            com.aspose.slides.internal.k0r.s3 var5 = new com.aspose.slides.internal.k0r.s3();
            var3.e2().addItem(var5);
            var5.n5(l6(var0.l6()));
         }
      }
   }

   public static void n5(com.aspose.slides.internal.k4y.m0m var0, com.aspose.slides.internal.k0r.n3 var1, d5t var2) {
      if (var0 != null) {
         if (var0.n5() == null || y1t.n5(var0.n5(), var2)) {
            if (var1 == null) {
               throw new InvalidOperationException();
            }

            com.aspose.slides.internal.k0r.q0 var3 = new com.aspose.slides.internal.k0r.q0();
            var1.e2().addItem(var3);
            com.aspose.slides.internal.k0r.x8 var4 = new com.aspose.slides.internal.k0r.x8();
            var3.e2().addItem(var4);
            var4.n5(2L);
            var4.n5((byte)1);
            if (var0.n5() != null) {
               var4.k5(y1t.l6(var0.n5(), var2));
            }

            com.aspose.slides.internal.k0r.t4 var5 = new com.aspose.slides.internal.k0r.t4();
            var3.e2().addItem(var5);
            var5.n5(k5(var0.l6()));
         }
      }
   }

   private static long n5(int var0) {
      switch (var0) {
         case 1:
            return 0L;
         case 2:
            return 1L;
         case 3:
            return 2L;
         case 4:
            return 3L;
         default:
            return 0L;
      }
   }

   private static long l6(int var0) {
      switch (var0) {
         case 1:
            return 0L;
         case 2:
            return 1L;
         case 3:
            return 2L;
         case 4:
            return 3L;
         case 5:
            return 4L;
         case 6:
            return 5L;
         case 7:
            return 6L;
         case 8:
            return 7L;
         case 9:
            return 8L;
         case 10:
            return 9L;
         case 11:
            return 10L;
         case 12:
            return 11L;
         case 13:
            return 12L;
         case 14:
            return 13L;
         case 15:
            return 14L;
         case 16:
            return 15L;
         case 17:
            return 16L;
         default:
            return 0L;
      }
   }

   private static long k5(int var0) {
      switch (var0) {
         case 1:
            return 0L;
         case 2:
            return 1L;
         case 3:
            return 2L;
         case 4:
            return 3L;
         case 5:
            return 4L;
         default:
            return 0L;
      }
   }
}
