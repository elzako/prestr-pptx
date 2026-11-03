package com.aspose.slides.internal.l4w;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.b7s.n3;
import com.aspose.slides.internal.b7s.z1;
import com.aspose.slides.internal.b7s.z6;
import com.aspose.slides.ms.System.u3;

public class n5 {
   private final z1 n5;
   private final int[][] l6 = new int[4][];
   private final z6[] k5 = (z6[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(z6.class), 10));
   private boolean u3 = false;

   public n5(z1 var1) {
      this.n5 = var1;
   }

   public final boolean n5() {
      return this.u3;
   }

   public final void n5(boolean var1) {
      this.u3 = var1;
   }

   public final void l6() {
      int var1 = 0;

      for (int var2 = 0; var2 < this.n5.a6().l6().length; var2++) {
         n3 var3 = this.n5.a6().l6()[var2];
         byte var4 = var3.x8();
         z6 var5 = this.n5.h0().get_Item(var4).k5();
         if (this.l6[var4 & 0xFF] == null) {
            this.l6[var4 & 0xFF] = new int[64];

            for (int var6 = 0; var6 < 64; var6++) {
               this.l6[var4 & 0xFF][var6] = (var5.l6[var6] & 65535) << 3;
            }
         }

         for (int var8 = 0; var8 < (var3.u3() & 255); var8++) {
            for (int var7 = 0; var7 < (var3.n3() & 255); var7++) {
               var5.n5(this.k5[var1]);
               var1++;
            }
         }
      }

      this.n5(true);
   }

   public final short[][] n5(short[][] var1) {
      byte var2 = 8;
      if (this.n5.u9() != null) {
         var2 = this.n5.u9().t4();
      }

      int[][] var3 = this.l6;

      for (int var4 = 0; var4 < var1.length; var4++) {
         short[] var5 = var1[var4];
         int[] var6 = new int[64];
         if ((var2 & 255) == 8) {
            for (int var12 = 0; var12 < 64; var12++) {
               var6[var12] = (byte)(var5[var12] - 128);
            }
         } else {
            if ((var2 & 255) != 12) {
               throw new NotSupportedException("Jpeg DCT supports only 8 or 12-bit per sample.");
            }

            for (int var7 = 0; var7 < 64; var7++) {
               var6[var7] = (short)(var5[var7] - 2048);
            }
         }

         byte var13 = this.k5[var4].l6();
         var6 = n5(var6);

         for (int var8 = 0; var8 < 64; var8++) {
            int var9 = var3[var13 & 0xFF][var8];
            int var10 = var6[var8];
            if (var10 < 0) {
               var10 = -var10;
               var10 += var9 >> 1;
               if (var10 >= var9) {
                  var10 /= var9;
               } else {
                  var10 = 0;
               }

               var10 = -var10;
            } else {
               var10 += var9 >> 1;
               if (var10 >= var9) {
                  var10 /= var9;
               } else {
                  var10 = 0;
               }
            }

            var5[var8] = (short)var10;
         }
      }

      return var1;
   }

   private static int[] n5(int[] var0) {
      int var1 = 0;

      for (int var2 = 7; var2 >= 0; var2--) {
         int var3 = var0[var1 + 0] + var0[var1 + 7];
         int var4 = var0[var1 + 0] - var0[var1 + 7];
         int var5 = var0[var1 + 1] + var0[var1 + 6];
         int var6 = var0[var1 + 1] - var0[var1 + 6];
         int var7 = var0[var1 + 2] + var0[var1 + 5];
         int var8 = var0[var1 + 2] - var0[var1 + 5];
         int var9 = var0[var1 + 3] + var0[var1 + 4];
         int var10 = var0[var1 + 3] - var0[var1 + 4];
         int var11 = var3 + var9;
         int var12 = var3 - var9;
         int var13 = var5 + var7;
         int var14 = var5 - var7;
         var0[var1 + 0] = var11 + var13 << 2;
         var0[var1 + 4] = var11 - var13 << 2;
         int var15 = (var14 + var12) * 4433;
         var0[var1 + 2] = var15 + var12 * 6270 + 1024 >> 11;
         var0[var1 + 6] = var15 + var14 * -15137 + 1024 >> 11;
         var15 = var10 + var4;
         int var16 = var8 + var6;
         int var17 = var10 + var6;
         int var18 = var8 + var4;
         int var19 = (var17 + var18) * 9633;
         var10 *= 2446;
         var8 *= 16819;
         var6 *= 25172;
         var4 *= 12299;
         var15 *= -7373;
         var16 *= -20995;
         var17 *= -16069;
         var18 *= -3196;
         var17 += var19;
         var18 += var19;
         var0[var1 + 7] = var10 + var15 + var17 + 1024 >> 11;
         var0[var1 + 5] = var8 + var16 + var18 + 1024 >> 11;
         var0[var1 + 3] = var6 + var16 + var17 + 1024 >> 11;
         var0[var1 + 1] = var4 + var15 + var18 + 1024 >> 11;
         var1 += 8;
      }

      var1 = 0;

      for (int var21 = 7; var21 >= 0; var21--) {
         int var22 = var0[var1] + var0[var1 + 56];
         int var24 = var0[var1] - var0[var1 + 56];
         int var26 = var0[var1 + 8] + var0[var1 + 48];
         int var28 = var0[var1 + 8] - var0[var1 + 48];
         int var30 = var0[var1 + 16] + var0[var1 + 40];
         int var32 = var0[var1 + 16] - var0[var1 + 40];
         int var34 = var0[var1 + 24] + var0[var1 + 32];
         int var36 = var0[var1 + 24] - var0[var1 + 32];
         int var38 = var22 + var34;
         int var39 = var22 - var34;
         int var40 = var26 + var30;
         int var41 = var26 - var30;
         var0[var1] = var38 + var40 + 2 >> 2;
         var0[var1 + 32] = var38 - var40 + 2 >> 2;
         int var44 = (var41 + var39) * 4433;
         var0[var1 + 16] = var44 + var39 * 6270 + 16384 >> 15;
         var0[var1 + 48] = var44 + var41 * -15137 + 16384 >> 15;
         var44 = var36 + var24;
         int var48 = var32 + var28;
         int var52 = var36 + var28;
         int var57 = var32 + var24;
         int var60 = (var52 + var57) * 9633;
         var36 *= 2446;
         var32 *= 16819;
         var28 *= 25172;
         var24 *= 12299;
         var44 *= -7373;
         var48 *= -20995;
         var52 *= -16069;
         var57 *= -3196;
         var52 += var60;
         var57 += var60;
         var0[var1 + 56] = var36 + var44 + var52 + 16384 >> 15;
         var0[var1 + 40] = var32 + var48 + var57 + 16384 >> 15;
         var0[var1 + 24] = var28 + var48 + var52 + 16384 >> 15;
         var0[var1 + 8] = var24 + var44 + var57 + 16384 >> 15;
         var1++;
      }

      return var0;
   }

   static {
      com.aspose.slides.internal.v6g.k5.n5(z6.class, new l6());
   }
}
