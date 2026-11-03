package com.aspose.slides.internal.n8e;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.Exception;

public class k7 {
   public static final com.aspose.slides.internal.o9b.c8 n5 = com.aspose.slides.internal.o9b.c8.n5(255, 255, 255, 255).o8();
   private static final byte[] l6 = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};

   public static boolean n5(byte[] var0) {
      return var0 != null && var0.length != 0 ? u3(var0) || a6(var0) || k5(var0) || l6(var0) || u9(var0) : false;
   }

   public static boolean l6(byte[] var0) {
      if (var0.length < 4) {
         return false;
      } else {
         return (var0[0] & 255) == 215 && (var0[1] & 255) == 205 && (var0[2] & 255) == 198 && (var0[3] & 255) == 154
            ? true
            : (var0[0] & 255) == 1 && (var0[1] & 255) == 0 && (var0[2] & 255) == 9 && (var0[3] & 255) == 0;
      }
   }

   public static boolean k5(byte[] var0) {
      return var0.length < 48
         ? false
         : (var0[40] & 255) == 32
            && (var0[41] & 255) == 69
            && (var0[42] & 255) == 77
            && (var0[43] & 255) == 70
            && (var0[44] & 255) == 0
            && (var0[45] & 255) == 0
            && (var0[46] & 255) == 1
            && (var0[47] & 255) == 0;
   }

   public static boolean u3(byte[] var0) {
      byte[] var1 = new byte[8];
      System.arraycopy(var0, 0, var1, 0, 8);
      return var1[0] == l6[0]
         && var1[1] == l6[1]
         && var1[2] == l6[2]
         && var1[3] == l6[3]
         && var1[4] == l6[4]
         && var1[5] == l6[5]
         && var1[6] == l6[6]
         && var1[7] == l6[7];
   }

   public static boolean a6(byte[] var0) {
      return var0.length < 4 ? false : (var0[0] & 255) == 255 && (var0[1] & 255) == 216;
   }

   public static boolean u9(byte[] var0) {
      return var0.length < 4 ? false : (var0[0] & 255) == 73 && (var0[1] & 255) == 73 || (var0[0] & 255) == 77 && (var0[1] & 255) == 77;
   }

   public static com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.j9e.y4 var0, com.aspose.slides.internal.o9b.f2 var1) {
      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2();

      try {
         var0.n5(var2, var0.x8());
         return n5(var2.toArray(), var1.a6());
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   public static com.aspose.slides.internal.o9b.l6 n5(byte[] var0, int var1, int var2) {
      com.aspose.slides.internal.y6.l6 var3 = com.aspose.slides.internal.y6.l6.n5(new com.aspose.slides.internal.z0k.e2(var0));

      try {
         boolean var4 = var1 == Integer.MIN_VALUE || var2 == Integer.MIN_VALUE;
         com.aspose.slides.internal.o1.u3 var5 = var4
            ? com.aspose.slides.internal.o1.u3.l6()
            : new com.aspose.slides.internal.o1.u3(new com.aspose.slides.internal.o9b.p8(var1, var2));
         com.aspose.slides.internal.o1.k5 var6 = com.aspose.slides.internal.o1.k5.n5(var3, var5);
         return var4 ? var6.u3() : var6.n5(var1, var2);
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   public static com.aspose.slides.internal.o9b.l6 n5(byte[] var0, com.aspose.slides.internal.o9b.f2 var1) {
      return n5(var0, null, var1.a6(), new com.aspose.slides.internal.o9b.f2(1.0F, 1.0F));
   }

   public static com.aspose.slides.internal.o9b.l6 n5(byte[] var0, com.aspose.slides.internal.o9b.f2 var1, float var2, boolean var3) {
      return n5(var0, null, var1.a6(), new com.aspose.slides.internal.o9b.f2(1.0F, 1.0F), var2, false, var3);
   }

   public static com.aspose.slides.internal.o9b.l6 n5(
      byte[] var0, com.aspose.slides.internal.o9b.z1 var1, com.aspose.slides.internal.o9b.f2 var2, com.aspose.slides.internal.o9b.f2 var3
   ) {
      return n5(var0, var1, var2.a6(), var3.a6(), 4.0F, false, false);
   }

   public static com.aspose.slides.internal.o9b.l6 n5(
      byte[] var0, com.aspose.slides.internal.o9b.z1 var1, com.aspose.slides.internal.o9b.f2 var2, com.aspose.slides.internal.o9b.f2 var3, boolean var4
   ) {
      return n5(var0, var1, var2.a6(), var3.a6(), 4.0F, false, var4);
   }

   public static com.aspose.slides.internal.o9b.l6 n5(
      byte[] var0,
      com.aspose.slides.internal.o9b.z1 var1,
      com.aspose.slides.internal.o9b.f2 var2,
      com.aspose.slides.internal.o9b.f2 var3,
      float var4,
      boolean var5,
      boolean var6
   ) {
      com.aspose.slides.internal.y6.l6 var7 = com.aspose.slides.internal.y6.l6.n5(new com.aspose.slides.internal.z0k.e2(var0));

      try {
         if (var2.n5()) {
            if (var3.l6() == 1.0F && var3.k5() == 1.0F) {
               var2.n5(Math.abs(var7.k5().t2()));
               var2.l6(Math.abs(var7.k5().l6()));
               if (var2.k5() == 0.0F || var2.l6() == 0.0F) {
                  var2.n5(var7.u9() * var4);
                  var2.l6(var7.h0() * var4);
               }

               if (com.aspose.slides.ms.System.q1.n5(var2.l6() - var7.u9()) < 100.0F && com.aspose.slides.ms.System.q1.n5(var2.k5() - var7.h0()) < 100.0F) {
                  var2.n5(var7.u9() * var4);
                  var2.l6(var7.h0() * var4);
               }
            } else {
               var2.n5(var7.u9() * var4);
               var2.l6(var7.h0() * var4);
            }
         }

         float var8 = 0.95F;
         float var9 = var5 ? 1000.0F : 9000.0F;

         while (var2.l6() > var9 || var2.k5() > var9) {
            var2.n5(var2.l6() * 0.95F);
            var2.l6(var2.k5() * 0.95F);
         }

         com.aspose.slides.internal.o1.u3 var10;
         if (var7.l6() == 1) {
            var10 = new com.aspose.slides.internal.o1.u3(
               com.aspose.slides.internal.o9b.c8.u3.o8(),
               new com.aspose.slides.internal.o9b.p8(com.aspose.slides.internal.v6g.k5.u3(var2.l6(), 13), com.aspose.slides.internal.v6g.k5.u3(var2.k5(), 13))
            );
         } else {
            var10 = new com.aspose.slides.internal.o1.u3(com.aspose.slides.internal.o9b.c8.u3.o8());
         }

         if (var1 != null) {
            var10.n5(new com.aspose.slides.ms.System.o5<>(var1.c8()));
            var10.l6(new com.aspose.slides.ms.System.o5<>(var1.t2()));
            var10.k5(new com.aspose.slides.ms.System.o5<>(var1.n3()));
            var10.u3(new com.aspose.slides.ms.System.o5<>(var1.t9()));
            var10.a6(new com.aspose.slides.ms.System.o5<>(var1.t4()));
            var10.u9(new com.aspose.slides.ms.System.o5<>(var1.z3()));
            var10.h0(new com.aspose.slides.ms.System.o5<>(var1.q0()));
         } else {
            var10.n5(new com.aspose.slides.ms.System.o5<>(0));
            var10.l6(new com.aspose.slides.ms.System.o5<>(0));
            var10.k5(new com.aspose.slides.ms.System.o5<>(3));
            var10.u3(new com.aspose.slides.ms.System.o5<>(0));
            var10.a6(new com.aspose.slides.ms.System.o5<>(3));
            var10.u9(new com.aspose.slides.ms.System.o5<>(3));
            var10.h0(new com.aspose.slides.ms.System.o5<>(4));
            if (var6) {
               var10.a6(new com.aspose.slides.ms.System.o5<>(4));
               var10.k5(new com.aspose.slides.ms.System.o5<>(6));
            }
         }

         var10.n5(var3.a6());
         com.aspose.slides.internal.o9b.l6 var11;
         if (var7.l6() == 2) {
            var11 = new com.aspose.slides.internal.o9b.l6(
               com.aspose.slides.internal.v6g.k5.u3(var2.l6(), 13), com.aspose.slides.internal.v6g.k5.u3(var2.k5(), 13)
            );
            com.aspose.slides.internal.o9b.z1 var12 = com.aspose.slides.internal.o9b.z1.n5(var11);

            try {
               var12.n5(0);
               var12.l6(4);
               var12.k5(7);
               var12.u9(4);
               var12.a6(0);
               var12.c8(4);
               com.aspose.slides.internal.o9b.y1 var13 = new com.aspose.slides.internal.o9b.y1(new com.aspose.slides.internal.o9b.w1(), var2.a6());
               n5(var12, var0, var13.y4());
            } finally {
               if (var12 != null) {
                  var12.dispose();
               }
            }
         } else {
            com.aspose.slides.internal.o1.k5 var22 = com.aspose.slides.internal.o1.k5.n5(var7, var10);
            var11 = var22.n5(var2.l6(), var2.k5());
         }

         return var11;
      } finally {
         if (var7 != null) {
            var7.dispose();
         }
      }
   }

   public static com.aspose.slides.internal.o9b.l6 n5(
      byte[] var0, com.aspose.slides.internal.o9b.f2 var1, com.aspose.slides.internal.o9b.y1 var2, com.aspose.slides.internal.o9b.f2 var3
   ) {
      com.aspose.slides.internal.y6.l6 var4 = com.aspose.slides.internal.y6.l6.n5(new com.aspose.slides.internal.z0k.e2(var0));

      try {
         com.aspose.slides.internal.o1.u3 var5;
         if (var4.l6() == 1) {
            var5 = new com.aspose.slides.internal.o1.u3(
               com.aspose.slides.internal.o9b.c8.u3.o8(),
               new com.aspose.slides.internal.o9b.p8(com.aspose.slides.internal.v6g.k5.u3(var1.l6(), 13), com.aspose.slides.internal.v6g.k5.u3(var1.k5(), 13))
            );
         } else {
            var5 = new com.aspose.slides.internal.o1.u3(com.aspose.slides.internal.o9b.c8.u3.o8());
         }

         var5.n5(new com.aspose.slides.ms.System.o5<>(0));
         var5.l6(new com.aspose.slides.ms.System.o5<>(0));
         var5.k5(new com.aspose.slides.ms.System.o5<>(3));
         var5.u3(new com.aspose.slides.ms.System.o5<>(0));
         var5.a6(new com.aspose.slides.ms.System.o5<>(3));
         var5.u9(new com.aspose.slides.ms.System.o5<>(3));
         var5.h0(new com.aspose.slides.ms.System.o5<>(4));
         var5.n5(var3.a6());
         com.aspose.slides.internal.o9b.l6 var6;
         if (var4.l6() == 2) {
            var6 = new com.aspose.slides.internal.o9b.l6(
               com.aspose.slides.internal.v6g.k5.u3(var1.l6(), 13), com.aspose.slides.internal.v6g.k5.u3(var1.k5(), 13)
            );
            com.aspose.slides.internal.o9b.z1 var7 = com.aspose.slides.internal.o9b.z1.n5(var6);

            try {
               var7.n5(0);
               var7.l6(4);
               var7.k5(7);
               var7.u9(4);
               var7.a6(0);
               var7.c8(4);
               com.aspose.slides.internal.o9b.y1 var8 = new com.aspose.slides.internal.o9b.y1(new com.aspose.slides.internal.o9b.w1(), var1.a6());
               n5(var7, var0, var8.y4());
            } finally {
               if (var7 != null) {
                  var7.dispose();
               }
            }
         } else {
            var6 = new com.aspose.slides.internal.o9b.l6(
               com.aspose.slides.internal.v6g.k5.u3(var2.s7(), 13), com.aspose.slides.internal.v6g.k5.u3(var2.k5(), 13)
            );
            com.aspose.slides.internal.o9b.z1 var24 = com.aspose.slides.internal.o9b.z1.n5(var6);

            try {
               com.aspose.slides.internal.o1.k5 var25 = com.aspose.slides.internal.o1.k5.n5(var4, var5);
               com.aspose.slides.internal.x4g.m1 var9 = new com.aspose.slides.internal.x4g.m1(
                  var1.l6() / var4.u9(), 0.0F, 0.0F, var1.k5() / var4.h0(), -var2.x8(), -var2.n3()
               );
               var9.k5(-var4.E_(), -var4.F_());
               var25.n5(var6);
               var25.n5(var24, var9);
            } finally {
               if (var24 != null) {
                  var24.dispose();
               }
            }
         }

         return var6;
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }
   }

   public static void n5(com.aspose.slides.internal.o9b.z1 var0, byte[] var1, com.aspose.slides.internal.o9b.y1 var2) {
      int var3 = var0.c8();
      int var4 = var0.t2();
      int var5 = var0.n3();
      int var6 = var0.t9();
      int var7 = var0.t4();
      int var8 = var0.z3();
      int var9 = var0.q0();
      com.aspose.slides.internal.y6.l6 var10 = com.aspose.slides.internal.y6.l6.n5(new com.aspose.slides.internal.z0k.e2(var1));

      try {
         com.aspose.slides.internal.x4g.x8 var11 = var0.l6();

         try {
            com.aspose.slides.internal.o1.u3 var12 = var10.l6() == 1
               ? new com.aspose.slides.internal.o1.u3(
                  com.aspose.slides.internal.o9b.c8.u3.o8(),
                  new com.aspose.slides.internal.o9b.p8(
                     com.aspose.slides.internal.v6g.k5.u3(var2.s7(), 13), com.aspose.slides.internal.v6g.k5.u3(var2.k5(), 13)
                  )
               )
               : new com.aspose.slides.internal.o1.u3(com.aspose.slides.internal.o9b.c8.u3.o8());
            var12.n5(new com.aspose.slides.ms.System.o5<>(0));
            var12.l6(new com.aspose.slides.ms.System.o5<>(0));
            var12.k5(new com.aspose.slides.ms.System.o5<>(3));
            var12.u3(new com.aspose.slides.ms.System.o5<>(0));
            var12.a6(new com.aspose.slides.ms.System.o5<>(3));
            var12.u9(new com.aspose.slides.ms.System.o5<>(3));
            var12.h0(new com.aspose.slides.ms.System.o5<>(4));
            com.aspose.slides.internal.o1.k5 var13 = com.aspose.slides.internal.o1.k5.n5(var10, var12);
            n5(var13, var0, var2.y4());
         } finally {
            var0.n5(var3);
            var0.l6(var4);
            var0.k5(var5);
            var0.a6(var6);
            var0.u9(var7);
            var0.c8(var8);
            var0.h0(var9);
            var0.n5(var11);
         }
      } finally {
         if (var10 != null) {
            var10.dispose();
         }
      }
   }

   private static void n5(com.aspose.slides.internal.o1.k5 var0, com.aspose.slides.internal.o9b.z1 var1, com.aspose.slides.internal.o9b.y1 var2) {
      com.aspose.slides.internal.x4g.m1 var3 = var1.m1();
      var1.l6(new com.aspose.slides.internal.x4g.m1());
      com.aspose.slides.internal.x4g.m1 var4 = var3.u9();
      var4.h0();
      com.aspose.slides.internal.o9b.a0 var5 = new com.aspose.slides.internal.o9b.a0();
      var5.l6(var4);
      var5.l6(var2.y4());
      var5.l6(var3);
      com.aspose.slides.internal.o9b.y1 var6 = var5.n5(var1).y4();
      int var7 = com.aspose.slides.internal.v6g.k5.u3(var6.x8(), 13);
      int var8 = com.aspose.slides.internal.v6g.k5.u3(var6.n3(), 13);
      var5.l6(new com.aspose.slides.internal.x4g.m1(1.0F, 0.0F, 0.0F, 1.0F, -var7, -var8));
      var5.l6(var4);
      com.aspose.slides.internal.o9b.y1 var9 = var5.n5(var1).y4();
      com.aspose.slides.internal.o9b.l6 var10 = new com.aspose.slides.internal.o9b.l6(
         3 + com.aspose.slides.internal.v6g.k5.u3(var6.s7(), 13), 3 + com.aspose.slides.internal.v6g.k5.u3(var6.k5(), 13)
      );

      try {
         com.aspose.slides.internal.o9b.z1 var11 = com.aspose.slides.internal.o9b.z1.n5(var10);

         try {
            var11.n5(var1.c8());
            var11.l6(var1.t2());
            var11.k5(var1.n3());
            var11.a6(var1.t9());
            var11.u9(var1.t4());
            var11.c8(var1.z3());
            var11.h0(var1.q0());
            var11.l6(var3);
            var0.n5(var11, var10, var9.y4());
            var1.n5(var10, var7, var8);
            var1.n5(var11.c8());
            var1.l6(var11.t2());
            var1.k5(var11.n3());
            var1.a6(var11.t9());
            var1.u9(var11.t4());
            var1.c8(var11.z3());
            var1.h0(var11.q0());
            var1.l6(var3);
         } finally {
            if (var11 != null) {
               var11.dispose();
            }
         }
      } finally {
         if (var10 != null) {
            var10.dispose();
         }
      }
   }

   public static byte[] n5(byte[] var0, com.aspose.slides.internal.o9b.f2 var1, com.aspose.slides.internal.s5.c8 var2) {
      byte[] var3 = null;
      com.aspose.slides.internal.o9b.l6 var4 = new com.aspose.slides.internal.o9b.l6(
         com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var1.l6()), 14),
         com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var1.k5()), 14)
      );

      try {
         com.aspose.slides.internal.o9b.z1 var5 = com.aspose.slides.internal.o9b.z1.n5(var4);

         try {
            var5.n5(0);
            var5.l6(0);
            var5.k5(3);
            var5.a6(0);
            var5.u9(3);
            var5.h0(4);
            var5.c8(4);
            n5(var5, var0, new com.aspose.slides.internal.o9b.y1(new com.aspose.slides.internal.o9b.w1(0.0F, 0.0F), var1.a6()));
            com.aspose.slides.internal.z0k.e2 var6 = new com.aspose.slides.internal.z0k.e2();

            try {
               var4.n5(var6, com.aspose.slides.internal.j9e.x8.s7());
               var6.setPosition(0L);
               var3 = new byte[(int)var6.getLength()];
               var6.read((byte[])var3, 0, ((byte[])var3).length);
               var6.setLength(0L);
            } finally {
               if (var6 != null) {
                  var6.dispose();
               }
            }
         } finally {
            if (var5 != null) {
               var5.dispose();
            }
         }
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }

      return (byte[])var3;
   }

   public static boolean h0(byte[] var0) {
      if (var0.length < 4) {
         return false;
      } else if ((var0[0] & 255) == 215 && (var0[1] & 255) == 205 && (var0[2] & 255) == 198 && (var0[3] & 255) == 154) {
         return true;
      } else if (var0[0] == 1 && var0[1] == 0 && var0[2] == 9 && var0[3] == 0) {
         return true;
      } else {
         return var0.length < 48
            ? false
            : var0[40] == 32 && var0[41] == 69 && var0[42] == 77 && var0[43] == 70 && var0[44] == 0 && var0[45] == 0 && var0[46] == 1 && var0[47] == 0;
      }
   }

   public static boolean c8(byte[] var0) {
      return var0.length < 6
         ? false
         : (var0[0] & 255) == 71
            && (var0[1] & 255) == 73
            && (var0[2] & 255) == 70
            && (var0[3] & 255) == 56
            && ((var0[4] & 255) == 55 || (var0[4] & 255) == 57)
            && (var0[5] & 255) == 97;
   }

   public static boolean t2(byte[] var0) {
      if (!c8(var0)) {
         return false;
      }

      com.aspose.slides.internal.o9b.t4 var1 = com.aspose.slides.internal.o9b.t4.n5(new com.aspose.slides.internal.z0k.e2(var0, false));
      return var1.n5(new com.aspose.slides.internal.j9e.c8(var1.u9()[0].k5())) > 1;
   }

   public static com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.o9b.l6 var0) {
      com.aspose.slides.internal.j9e.n5 var1 = var0.n5(new com.aspose.slides.internal.o9b.y2(0, 0, var0.e2(), var0.h0()), 3, 2498570);
      int var2 = var0.e2();
      int var3 = var0.e2();
      int var4 = var0.h0();
      int var5 = 0;
      int var6 = 0;

      try {
         int var7 = var1.a6() * var1.n5();
         byte[] var8 = new byte[var7];
         System.arraycopy((byte[])var1.u3().k5().n5(), 0, var8, 0, var7);

         for (int var9 = 0; var9 < var7; var9 += 4) {
            if ((var8[var9 + 3] & 255) != 0) {
               int var10 = var9 / 4 % var2;
               int var11 = var9 / 4 / var2;
               if (var10 < var3) {
                  var3 = var10;
               }

               if (var10 > var5) {
                  var5 = var10;
               }

               if (var11 < var4) {
                  var4 = var11;
               }

               if (var11 > var6) {
                  var6 = var11;
               }
            }
         }
      } finally {
         var0.n5(var1);
      }

      if (var5 == 0 && var6 == 0) {
         return null;
      }

      com.aspose.slides.internal.o9b.l6 var20 = new com.aspose.slides.internal.o9b.l6(var5 - var3 + 1, var6 - var4 + 1, 2498570);
      var20.n5(com.aspose.slides.internal.o9b.c8.w4().o8());
      com.aspose.slides.internal.o9b.z1 var21 = com.aspose.slides.internal.o9b.z1.n5(var20);

      try {
         com.aspose.slides.internal.o9b.y1 var22 = new com.aspose.slides.internal.o9b.y1(var3, var4, var5 - var3 + 1.0F, var6 - var4 + 1.0F);
         com.aspose.slides.internal.o9b.y1 var23 = new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, var20.e2(), var20.h0());
         var21.n5(var0, var23.y4(), var22.y4(), 2);
         return var20;
      } finally {
         if (var21 != null) {
            var21.dispose();
         }
      }
   }

   public static com.aspose.slides.internal.o9b.y2 l6(com.aspose.slides.internal.o9b.l6 var0) {
      com.aspose.slides.internal.j9e.n5 var1 = var0.n5(new com.aspose.slides.internal.o9b.y2(0, 0, var0.e2(), var0.h0()), 3, 2498570);
      int var2 = var0.e2();
      int var3 = var0.e2();
      int var4 = var0.h0();
      int var5 = 0;
      int var6 = 0;

      try {
         int var7 = var1.a6() * var1.n5();
         byte[] var8 = new byte[var7];
         com.aspose.slides.internal.e3m.n5.n5(var1.u3(), var8, 0, var7);

         for (int var9 = 0; var9 < var7; var9 += 4) {
            if ((var8[var9 + 3] & 255) != 0) {
               int var10 = var9 / 4 % var2;
               int var11 = var9 / 4 / var2;
               if (var10 < var3) {
                  var3 = var10;
               }

               if (var10 > var5) {
                  var5 = var10;
               }

               if (var11 < var4) {
                  var4 = var11;
               }

               if (var11 > var6) {
                  var6 = var11;
               }
            }
         }
      } finally {
         var0.n5(var1);
      }

      return var5 == 0 && var6 == 0
         ? com.aspose.slides.internal.o9b.y2.n5
         : new com.aspose.slides.internal.o9b.y2(var3, var4, var5 - var3 + 1, var6 - var4 + 1);
   }

   public static com.aspose.slides.internal.o9b.f2 n5(int var0, com.aspose.slides.internal.o9b.f2 var1) {
      if (var0 < 0) {
         throw new ArgumentException("dpi");
      } else if (var0 != 0 && var0 != 72) {
         int var2 = n5(var0);
         float var3 = 12700.0F / var2;
         return new com.aspose.slides.internal.o9b.f2(var1.l6() * var3, var1.k5() * var3);
      } else {
         return var1;
      }
   }

   public static int n5(float var0, float var1) {
      float var2 = 0.75F;
      float var3 = var0 / 720.0F;
      float var4 = var1 / 540.0F;
      float var5 = 72.0F * var3;
      float var6 = 72.0F * var4;
      float var7 = var6 * 0.75F / var5;
      return com.aspose.slides.internal.v6g.k5.u3(var6 * var7, 13);
   }

   public static com.aspose.slides.internal.o9b.y2 s7(byte[] var0) {
      com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2(var0);

      try {
         com.aspose.slides.internal.y6.l6 var2 = com.aspose.slides.internal.y6.l6.n5(var1);

         try {
            return new com.aspose.slides.internal.o9b.y2(0, 0, var2.u9(), var2.h0());
         } finally {
            if (var2 != null) {
               var2.dispose();
            }
         }
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   public static com.aspose.slides.internal.o9b.t4 x8(byte[] var0) {
      if (var0 == null) {
         throw new ArgumentNullException("bytes");
      }

      if (h0(var0)) {
         return n5(var0, null, new com.aspose.slides.internal.o9b.f2(), new com.aspose.slides.internal.o9b.f2(1.0F, 1.0F), 4.0F, true, false);
      }

      try {
         return com.aspose.slides.internal.o9b.t4.n5(new com.aspose.slides.internal.z0k.e2(var0));
      } catch (Exception var2) {
         v4.n5(var2);
         return n5(var0, new com.aspose.slides.internal.o9b.f2());
      }
   }

   public static byte[] n5(com.aspose.slides.internal.o9b.t4 var0) {
      return n5(var0, com.aspose.slides.internal.j9e.x8.s7());
   }

   public static byte[] n5(com.aspose.slides.internal.o9b.t4 var0, com.aspose.slides.internal.j9e.x8 var1) {
      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2();

      try {
         var0.n5(var2, var1);
         return var2.toArray();
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   public static boolean l6(com.aspose.slides.internal.o9b.t4 var0) {
      com.aspose.slides.ms.System.o0 var1 = new com.aspose.slides.ms.System.o0();

      try {
         var0.x8().n5().k5(var1);
      } catch (RuntimeException var3) {
         v4.n5(var3);
         return false;
      }

      return com.aspose.slides.ms.System.o0.l6(var1, com.aspose.slides.internal.j9e.x8.u9().n5())
         ? false
         : var0.n5(new com.aspose.slides.internal.j9e.c8(var0.u9()[0].k5())) > 1;
   }

   public static boolean k5(com.aspose.slides.internal.o9b.t4 var0) {
      return var0.s7() == 8207;
   }

   private static int n5(int var0) {
      return 914400 / var0;
   }

   public static byte[] n5(byte[] var0, String var1, boolean var2, com.aspose.slides.internal.z0k.t4 var3, int var4) {
      com.aspose.slides.internal.z0k.e2 var5 = new com.aspose.slides.internal.z0k.e2(var0);
      if (var2) {
         com.aspose.slides.internal.o9b.l6 var6;
         if (com.aspose.slides.internal.k4d.a6.n5(var0)) {
            var6 = n5(var0, new com.aspose.slides.internal.o9b.f2(256.0F, 256.0F));
         } else {
            var6 = (com.aspose.slides.internal.o9b.l6)com.aspose.slides.internal.o9b.t4.n5(var5);
         }

         return com.aspose.slides.internal.y6.u9.n5(var6, var1, var3, var4);
      } else {
         return com.aspose.slides.internal.y6.u9.n5(var1, var5, var3, var4);
      }
   }

   public static byte[] n5(byte[] var0, String[] var1) {
      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2(var0);
      return com.aspose.slides.internal.y6.u9.n5(var2, var1);
   }

   public static byte[] l6(byte[] var0, String[] var1) {
      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2(var0);
      return com.aspose.slides.internal.y6.u9.l6(var2, var1);
   }

   public static boolean k5(com.aspose.slides.internal.o9b.l6 var0) {
      if (var0.s7() != 2498570 && var0.s7() != 925707) {
         return false;
      }

      com.aspose.slides.internal.o9b.y2 var1 = new com.aspose.slides.internal.o9b.y2(0, 0, var0.e2(), var0.h0());
      com.aspose.slides.internal.j9e.n5 var2 = var0.n5(var1.n3(), 1, var0.s7());

      try {
         byte var3 = 4;
         int var4 = var2.a6();
         com.aspose.slides.ms.System.x9 var5 = var2.u3();
         byte[] var6 = (byte[])var5.k5().n5();

         for (int var7 = 0; var7 < var0.h0(); var7++) {
            for (int var8 = 0; var8 < var0.e2(); var8++) {
               byte var9 = var6[var7 * var4 + var8 * 4 + 3];
               if ((var9 & 255) < 255) {
                  return true;
               }
            }
         }

         return false;
      } finally {
         var0.n5(var2);
      }
   }
}
