package com.aspose.slides.internal.b6;

import com.aspose.slides.exceptions.NotSupportedException;

public abstract class z1 extends com.aspose.slides.internal.g1.u3 {
   @Override
   public void n5(com.aspose.slides.internal.i3.v4 var1, com.aspose.slides.internal.o9b.z1 var2, com.aspose.slides.internal.g1.u9 var3) {
      com.aspose.slides.internal.x4g.x8 var4 = var2.l6();

      try {
         var2.a6();
         var2.l6(var3.m3().l6());
         var2.n5(var3.p8(), 0);
         if (var3.q0() != 11) {
            if (var3.q0() != 13 && (var3.t2() != null || var3.c8() != null)) {
               if (var3.z3() == null) {
                  throw new NotSupportedException("Unable to apply ROP2. RasterImage is null");
               }

               this.k5(var1, var2, var3);
            } else {
               this.l6(var1, var2, var3);
            }
         }
      } finally {
         var2.n5(var4);
      }
   }

   public abstract void l6(com.aspose.slides.internal.i3.v4 var1, com.aspose.slides.internal.o9b.z1 var2, com.aspose.slides.internal.g1.u9 var3);

   public static void n5(com.aspose.slides.internal.g1.u9 var0) {
      try {
         n5(var0.m1(), var0.q0(), var0);
      } finally {
         var0.m1().dispose();
         var0.l6((com.aspose.slides.internal.o9b.l6)null);
         var0.n5(false);
      }
   }

   private static void n5(com.aspose.slides.internal.o9b.l6 var0, int var1, com.aspose.slides.internal.g1.u9 var2) {
      int var3 = var2.z3().e2();
      int var4 = var2.z3().h0();
      com.aspose.slides.internal.j9e.n5 var5 = var0.n5(new com.aspose.slides.internal.o9b.y2(0, 0, var3, var4), 1, 2498570);
      com.aspose.slides.internal.j9e.n5 var6 = var2.z3().n5(new com.aspose.slides.internal.o9b.y2(0, 0, var3, var4), 3, 2498570);
      com.aspose.slides.ms.System.x9 var7 = var5.u3();
      com.aspose.slides.ms.System.x9 var8 = var6.u3();
      int var9 = var3 * var4;
      int[] var10 = new int[var9];
      int[] var11 = new int[var9];
      com.aspose.slides.internal.e3m.n5.n5(var7, var10, 0, var9);
      com.aspose.slides.internal.e3m.n5.n5(var8, var11, 0, var9);
      int var12 = var2.b3().k5().h0();

      for (int var13 = 0; var13 < var4; var13++) {
         for (int var14 = 0; var14 < var3; var14++) {
            int var15 = var13 * var3 + var14;
            int var16 = n5(var10[var15], var11[var15], var1, var12);
            var11[var15] = var16;
         }
      }

      com.aspose.slides.internal.e3m.n5.n5(var11, 0, var8, var9);
      var0.n5(var5);
      var2.z3().n5(var6);
   }

   private void k5(com.aspose.slides.internal.i3.v4 var1, com.aspose.slides.internal.o9b.z1 var2, com.aspose.slides.internal.g1.u9 var3) {
      com.aspose.slides.internal.x4g.x8 var4 = var2.l6();

      try {
         com.aspose.slides.internal.o9b.z1 var5 = com.aspose.slides.internal.o9b.z1.n5(var3.m1());

         try {
            var5.l6(var3.m3().l6());
            var5.l6(var2.m1());
            this.l6(var1, var5, var3);
            var3.n5(true);
         } finally {
            if (var5 != null) {
               var5.dispose();
            }
         }
      } finally {
         var2.n5(var4);
      }
   }

   public static int n5(int var0, int var1, int var2, int var3) {
      if (var0 == 0) {
         return var1;
      }

      var1 = var1 == 0 && var3 != 0 ? var3 : var1;
      long var4 = var0 & 4294967295L;
      switch (var2) {
         case 1:
            var4 = 4278190080L;
            break;
         case 2:
            var4 = (0xFF000000 & var1 | ~(var1 | var0) & 16777215) & 4294967295L;
            break;
         case 3:
            var4 = (0xFF000000 & var1 | var1 & ~var0 & 16777215) & 4294967295L;
            break;
         case 4:
            var4 = (0xFF000000 & var1 | ~var0 & 16777215) & 4294967295L;
            break;
         case 5:
            var4 = (0xFF000000 & var1 | ~var1 & var0 & 16777215) & 4294967295L;
            break;
         case 6:
            var4 = (0xFF000000 & var1 | ~var1 & 16777215) & 4294967295L;
            break;
         case 7:
            var4 = (0xFF000000 & var1 | (var1 ^ var0) & 16777215) & 4294967295L;
            break;
         case 8:
            var4 = (0xFF000000 & var1 | ~(var1 & var0) & 16777215) & 4294967295L;
            break;
         case 9:
            var4 = (0xFF000000 & var1 | var1 & var0 & 16777215) & 4294967295L;
            break;
         case 10:
            var4 = (0xFF000000 & var1 | ~(var1 ^ var0) & 16777215) & 4294967295L;
            break;
         case 11:
            var4 = var1 & 4294967295L;
            break;
         case 12:
            var4 = (0xFF000000 & var1 | (var1 | ~var0) & 16777215) & 4294967295L;
            break;
         case 13:
            var4 = var0 & 4294967295L;
            break;
         case 14:
            var4 = (0xFF000000 & var1 | (~var1 | var0) & 16777215) & 4294967295L;
            break;
         case 15:
            var4 = (0xFF000000 & var1 | (var1 | var0) & 16777215) & 4294967295L;
            break;
         case 16:
            var4 = 4294967295L;
      }

      return (int)var4;
   }
}
