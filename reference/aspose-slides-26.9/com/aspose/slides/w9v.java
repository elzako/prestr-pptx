package com.aspose.slides;

class w9v {
   static void n5(GroupShape var0, com.aspose.slides.internal.k0r.g6 var1) {
      e4c var2 = new e4c();
      e4c var3 = new e4c();
      x4t var4 = new x4t();
      e4c[] var5 = new e4c[]{var2};
      e4c[] var6 = new e4c[]{var3};
      x4t[] var7 = new x4t[]{var4};
      n5(var1, var5, var6, var7);
      var5[0].l6(var2);
      var6[0].l6(var3);
      var7[0].n5(var4);
      com.aspose.slides.internal.k0r.q9 var8 = var1.l6();
      e4c var9 = new e4c();
      if (var8 != null) {
         double var10 = var8.k5() / 12700.0;
         double var12 = var8.u3() / 12700.0;
         double var14 = var8.a6() / 12700.0;
         var0.n5(new e4c(var8.l6() / 12700.0, var10));
         var9 = new e4c(var12, var14);
      } else {
         var0.n5(e4c.k5.u9());
         e4c.k5.l6(var9);
      }

      var0.n5(var2.u9(), var3.u9(), var4.n5(), var9.u9());
   }

   static void n5(com.aspose.slides.internal.k0r.g6 var0, e4c[] var1, e4c[] var2, x4t[] var3) {
      float var4 = 0.0F;
      byte var5 = -1;
      byte var6 = -1;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      com.aspose.slides.internal.k0r.v7 var11 = var0.c8();
      if (var11 != null) {
         var7 = var11.l6();
         var8 = var11.k5();
         var9 = var11.u3();
         var10 = var11.a6();
      } else {
         com.aspose.slides.internal.k0r.t7 var27 = var0.t2();
         var7 = var27.l6() * 3175;
         var8 = var27.k5() * 3175;
         var9 = var27.u3() * 3175;
         var10 = var27.a6() * 3175;
         var9 = var9 + ((var7 ^ 1) & var9 & 1) >> 1;
         var10 = var10 + ((var8 ^ 1) & var10 & 1) >> 1;
         var7 = var7 + (var7 & 1) >> 1;
         var8 = var8 + (var8 & 1) >> 1;
      }

      if (var0.u3() != null) {
         var5 = (byte)(var0.u3().a6() ? 1 : 0);
         var6 = (byte)(var0.u3().u9() ? 1 : 0);
      }

      if (var0.a6() != null) {
         com.aspose.slides.internal.k0r.z5 var12 = com.aspose.slides.internal.v6g.k5.n5(var0.a6().l6().n5(4), com.aspose.slides.internal.k0r.z5.class);
         if (var12 != null) {
            long var13 = (var12.j5() & 4294967295L) >> 16 & 4294967295L;
            if ((var13 & 4294967295L & 32768L & 4294967295L) != 0L) {
               var13 = 360L - ((65535L - (var13 & 4294967295L) & 4294967295L) + 1L & 4294967295L) & 4294967295L;
            }

            var4 = (int)var13;
            var4 %= 360.0F;
            if (var4 < 0.0F) {
               var4 += 360.0F;
            }

            if (var4 >= 45.0F && var4 < 135.0F || var4 >= 225.0F && var4 < 315.0F) {
               int var15 = var9 + (var9 & 1) >> 1;
               int var16 = var10 + (var10 & 1) >> 1;
               var7 += var15 - var16;
               var8 += var16 - var15;
               var9 ^= var10;
               var10 ^= var9;
               var9 ^= var10;
            }

            if (var5 != var6) {
               var4 = -var4;
            }

            if (var4 < 0.0F) {
               var4 += 360.0F;
            }
         }
      }

      var3[0] = new x4t();
      var3[0].l6 = var4;
      var3[0].u3 = var5 == 1;
      var3[0].k5 = var6 == 1;
      var1[0] = new e4c(var7 / 12700.0, var8 / 12700.0);
      var2[0] = new e4c(var9 / 12700.0, var10 / 12700.0);
   }
}
