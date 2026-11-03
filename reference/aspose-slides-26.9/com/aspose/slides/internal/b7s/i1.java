package com.aspose.slides.internal.b7s;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class i1 {
   public static byte[][] n5(byte[] var0, int var1, d5 var2, com.aspose.slides.internal.o9b.y2 var3) {
      int var4 = var2.a6();
      int var5 = com.aspose.slides.internal.n5p.h0.k5(var3.t2(), var2.n3() & 255);
      int var6 = com.aspose.slides.internal.n5p.h0.k5(var3.l6(), var2.y4() & 255);
      byte[] var7 = new byte[var5 * var6];
      byte[][] var8 = new byte[var4][];
      var1 += (var3.c8() * var2.n5() + var3.u3()) * var4;
      int var9 = (var2.n5() - var3.t2()) * var4;

      for (int var10 = 0; var10 < var4; var10++) {
         int var11 = var1 + var10;
         int var12 = 0;

         for (int var13 = 0; var13 < var3.l6(); var13++) {
            for (int var14 = 0; var14 < var3.t2(); var14++) {
               var7[var12++] = var0[var11];
               var11 += var4;
            }

            byte var20 = var7[var12 - 1];

            for (int var15 = var3.t2(); var15 < var5; var15++) {
               var7[var12++] = var20;
            }

            var11 += var9;
         }

         int var19 = (var3.l6() - 1) * var5;
         int var21 = var19 + var5;

         for (int var22 = var3.l6(); var22 < var6; var22++) {
            System.arraycopy(var7, var19, var7, var21, var5);
            var21 += var5;
         }

         if (var2.k5() < 8) {
            switch (var2.t2()) {
               case 0:
                  int var23 = 8 - var2.k5();

                  for (int var24 = 0; var24 < var7.length; var24++) {
                     var7[var24] = (byte)((var7[var24] & 255) >> var23);
                  }
                  break;
               case 1:
                  int var16 = (1 << var2.k5()) - 1;

                  for (int var17 = 0; var17 < var7.length; var17++) {
                     var7[var17] = (byte)(var7[var17] & 0xFF & var16);
                  }
                  break;
               default:
                  throw new ArgumentOutOfRangeException();
            }
         }

         var8[var10] = n5(var7, var5, var6, var10, var2);
      }

      return var8;
   }

   public static byte[][] n5(byte[][] var0, d5 var1, com.aspose.slides.internal.o9b.y2 var2) {
      byte[][] var3 = new byte[var1.a6()][];

      for (int var4 = 0; var4 < var1.a6(); var4++) {
         byte[] var5 = new byte[var2.t2() * var2.l6()];
         int var6 = (var1.n3() & 255) / (var1.s7()[var4] & 255);
         int var7 = (var1.y4() & 255) / (var1.x8()[var4] & 255);
         int var8 = com.aspose.slides.internal.n5p.h0.n5(var2.t2() * (var1.s7()[var4] & 255), var1.n3() & 255);

         for (int var9 = 0; var9 < var2.l6(); var9++) {
            int var10 = var9 * var2.t2();
            int var11 = var9 / var7 * var8;

            for (int var12 = 0; var12 < var2.t2(); var12++) {
               var5[var10 + var12] = var0[var4][var11 + var12 / var6];
            }
         }

         var3[var4] = var5;
      }

      return var3;
   }

   private static byte[] n5(byte[] var0, int var1, int var2, int var3, d5 var4) {
      byte[] var5;
      if (var4.s7()[var3] == var4.n3() && var4.x8()[var3] == var4.y4()) {
         var5 = new byte[var0.length];
         System.arraycopy(var0, 0, var5, 0, var0.length);
      } else {
         int var6 = var1 * (var4.s7()[var3] & 255) / (var4.n3() & 255);
         int var7 = var2 * (var4.x8()[var3] & 255) / (var4.y4() & 255);
         var5 = new byte[var6 * var7];
         int var8 = (var4.n3() & 255) / (var4.s7()[var3] & 255);
         int var9 = (var4.y4() & 255) / (var4.x8()[var3] & 255);
         int var10 = var8 * var9;
         int var11 = 0;

         for (int var12 = 0; var12 < var4.t9()[var3]; var12++) {
            int var13 = var12 * var9 * var1;

            for (int var14 = 0; var14 < var4.e2()[var3]; var14++) {
               int var15 = 0;
               int var16 = var13 + var14 * var8;

               for (int var17 = 0; var17 < var9; var17++) {
                  for (int var18 = 0; var18 < var8; var18++) {
                     var15 += var0[var16 + var18] & 255;
                  }

                  var16 += var1;
               }

               var15 /= var10;
               var5[var11++] = (byte)var15;
            }
         }
      }

      return var5;
   }
}
