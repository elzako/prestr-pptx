package com.aspose.slides.internal.l4w;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$ValueCollection$Enumerator;
import com.aspose.slides.internal.b7s.n3;
import com.aspose.slides.internal.b7s.t9;
import com.aspose.slides.internal.b7s.z6;

public class k5 {
   private final Dictionary<Integer, int[]> n5;
   private final t9 l6;

   public k5(t9 var1) {
      this.l6 = var1;
      this.n5 = new Dictionary<>();

      for (n3 var5 : this.l6.u3().l6()) {
         int[] var6 = new int[64];
         this.n5.set_Item(var5.u9() & 255, var6);
         Dictionary$ValueCollection$Enumerator var7 = this.l6.x8().getValues().iterator().Clone();

         while (var7.hasNext()) {
            z6 var8 = ((z6)var7.next()).k5();
            boolean var9 = (var8.l6() & 255) != (var5.x8() & 255);
            if (!var9) {
               System.arraycopy(var8.l6, 0, var6, 0, 64);
               break;
            }
         }
      }
   }

   public final void n5(short[] var1, int var2, byte[] var3, int var4, int var5, int var6, byte[] var7, int var8, int[] var9) {
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;
      int[] var13 = this.n5.get_Item(var2);
      int var14 = var8 + 128;

      for (int var15 = 8; var15 > 0; var15--) {
         if (var1[var10 + 8] == 0
            && var1[var10 + 16] == 0
            && var1[var10 + 24] == 0
            && var1[var10 + 32] == 0
            && var1[var10 + 40] == 0
            && var1[var10 + 48] == 0
            && var1[var10 + 56] == 0) {
            int var35 = var1[var10] * var13[var12] << 2;
            var9[var11] = var35;
            var9[var11 + 8] = var35;
            var9[var11 + 16] = var35;
            var9[var11 + 24] = var35;
            var9[var11 + 32] = var35;
            var9[var11 + 40] = var35;
            var9[var11 + 48] = var35;
            var9[var11 + 56] = var35;
            var10++;
            var12++;
            var11++;
         } else {
            int var16 = var1[var10 + 16] * var13[var12 + 16];
            int var17 = var1[var10 + 48] * var13[var12 + 48];
            int var18 = (var16 + var17) * 4433;
            int var19 = var18 + var17 * -15137;
            int var20 = var18 + var16 * 6270;
            var16 = var1[var10] * var13[var12];
            var17 = var1[var10 + 32] * var13[var12 + 32];
            int var21 = var16 + var17 << 13;
            int var22 = var16 - var17 << 13;
            int var23 = var21 + var20;
            int var24 = var21 - var20;
            int var25 = var22 + var19;
            int var26 = var22 - var19;
            var21 = var1[var10 + 56] * var13[var12 + 56];
            var22 = var1[var10 + 40] * var13[var12 + 40];
            var19 = var1[var10 + 24] * var13[var12 + 24];
            var20 = var1[var10 + 8] * var13[var12 + 8];
            var18 = var21 + var20;
            var16 = var22 + var19;
            var17 = var21 + var19;
            int var27 = var22 + var20;
            int var28 = (var17 + var27) * 9633;
            var21 *= 2446;
            var22 *= 16819;
            var19 *= 25172;
            var20 *= 12299;
            var18 *= -7373;
            var16 *= -20995;
            var17 *= -16069;
            var27 *= -3196;
            var17 += var28;
            var27 += var28;
            var21 += var18 + var17;
            var22 += var16 + var27;
            var19 += var16 + var17;
            var20 += var18 + var27;
            var9[var11] = var23 + var20 + 1024 >> 11;
            var9[var11 + 56] = var23 - var20 + 1024 >> 11;
            var9[var11 + 8] = var25 + var19 + 1024 >> 11;
            var9[var11 + 48] = var25 - var19 + 1024 >> 11;
            var9[var11 + 16] = var26 + var22 + 1024 >> 11;
            var9[var11 + 40] = var26 - var22 + 1024 >> 11;
            var9[var11 + 24] = var24 + var21 + 1024 >> 11;
            var9[var11 + 32] = var24 - var21 + 1024 >> 11;
            var10++;
            var12++;
            var11++;
         }
      }

      byte var30 = 0;
      int var31 = var4 * var6 + var5;

      for (int var36 = 0; var36 < 8; var31 += var6) {
         if (var9[var30 + 1] == 0
            && var9[var30 + 2] == 0
            && var9[var30 + 3] == 0
            && var9[var30 + 4] == 0
            && var9[var30 + 5] == 0
            && var9[var30 + 6] == 0
            && var9[var30 + 7] == 0) {
            byte var44 = var7[var14 + (var9[var30] + 16 >> 5) & 1023];
            var3[var31] = var44;
            var3[var31 + 1] = var44;
            var3[var31 + 2] = var44;
            var3[var31 + 3] = var44;
            var3[var31 + 4] = var44;
            var3[var31 + 5] = var44;
            var3[var31 + 6] = var44;
            var3[var31 + 7] = var44;
         } else {
            int var41 = var9[var30 + 2];
            int var47 = var9[var30 + 6];
            int var54 = (var41 + var47) * 4433;
            int var60 = var54 + var47 * -15137;
            int var67 = var54 + var41 * 6270;
            int var74 = var9[var30] + var9[var30 + 4] << 13;
            int var78 = var9[var30] - var9[var30 + 4] << 13;
            int var82 = var74 + var67;
            int var83 = var74 - var67;
            int var84 = var78 + var60;
            int var87 = var78 - var60;
            var74 = var9[var30 + 7];
            var78 = var9[var30 + 5];
            var60 = var9[var30 + 3];
            var67 = var9[var30 + 1];
            var54 = var74 + var67;
            var41 = var78 + var60;
            var47 = var74 + var60;
            int var88 = var78 + var67;
            int var29 = (var47 + var88) * 9633;
            var74 *= 2446;
            var78 *= 16819;
            var60 *= 25172;
            var67 *= 12299;
            var54 *= -7373;
            var41 *= -20995;
            var47 *= -16069;
            var88 *= -3196;
            var47 += var29;
            var88 += var29;
            var74 += var54 + var47;
            var78 += var41 + var88;
            var60 += var41 + var47;
            var67 += var54 + var88;
            var3[var31] = var7[var14 + (var82 + var67 + 131072 >> 18) & 1023];
            var3[var31 + 7] = var7[var14 + (var82 - var67 + 131072 >> 18) & 1023];
            var3[var31 + 1] = var7[var14 + (var84 + var60 + 131072 >> 18) & 1023];
            var3[var31 + 6] = var7[var14 + (var84 - var60 + 131072 >> 18) & 1023];
            var3[var31 + 2] = var7[var14 + (var87 + var78 + 131072 >> 18) & 1023];
            var3[var31 + 5] = var7[var14 + (var87 - var78 + 131072 >> 18) & 1023];
            var3[var31 + 3] = var7[var14 + (var83 + var74 + 131072 >> 18) & 1023];
            var3[var31 + 4] = var7[var14 + (var83 - var74 + 131072 >> 18) & 1023];
         }

         var36++;
         var30 += 8;
      }
   }

   public final void n5(short[] var1, int var2, byte[] var3, int var4, int var5, int var6, short[] var7, int var8, int[] var9) {
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;
      int[] var13 = this.n5.get_Item(var2);
      int var14 = var8 + 2048;

      for (int var15 = 8; var15 > 0; var15--) {
         if (var1[var10 + 8] == 0
            && var1[var10 + 16] == 0
            && var1[var10 + 24] == 0
            && var1[var10 + 32] == 0
            && var1[var10 + 40] == 0
            && var1[var10 + 48] == 0
            && var1[var10 + 56] == 0) {
            int var36 = var1[var10] * var13[var12] << 2;
            var9[var11] = var36;
            var9[var11 + 8] = var36;
            var9[var11 + 16] = var36;
            var9[var11 + 24] = var36;
            var9[var11 + 32] = var36;
            var9[var11 + 40] = var36;
            var9[var11 + 48] = var36;
            var9[var11 + 56] = var36;
            var10++;
            var12++;
            var11++;
         } else {
            int var16 = var1[var10 + 16] * var13[var12 + 16];
            int var17 = var1[var10 + 48] * var13[var12 + 48];
            int var18 = (var16 + var17) * 4433;
            int var19 = var18 + var17 * -15137;
            int var20 = var18 + var16 * 6270;
            var16 = var1[var10] * var13[var12];
            var17 = var1[var10 + 32] * var13[var12 + 32];
            int var21 = var16 + var17 << 13;
            int var22 = var16 - var17 << 13;
            int var23 = var21 + var20;
            int var24 = var21 - var20;
            int var25 = var22 + var19;
            int var26 = var22 - var19;
            var21 = var1[var10 + 56] * var13[var12 + 56];
            var22 = var1[var10 + 40] * var13[var12 + 40];
            var19 = var1[var10 + 24] * var13[var12 + 24];
            var20 = var1[var10 + 8] * var13[var12 + 8];
            var18 = var21 + var20;
            var16 = var22 + var19;
            var17 = var21 + var19;
            int var27 = var22 + var20;
            int var28 = (var17 + var27) * 9633;
            var21 *= 2446;
            var22 *= 16819;
            var19 *= 25172;
            var20 *= 12299;
            var18 *= -7373;
            var16 *= -20995;
            var17 *= -16069;
            var27 *= -3196;
            var17 += var28;
            var27 += var28;
            var21 += var18 + var17;
            var22 += var16 + var27;
            var19 += var16 + var17;
            var20 += var18 + var27;
            var9[var11] = var23 + var20 + 1024 >> 11;
            var9[var11 + 56] = var23 - var20 + 1024 >> 11;
            var9[var11 + 8] = var25 + var19 + 1024 >> 11;
            var9[var11 + 48] = var25 - var19 + 1024 >> 11;
            var9[var11 + 16] = var26 + var22 + 1024 >> 11;
            var9[var11 + 40] = var26 - var22 + 1024 >> 11;
            var9[var11 + 24] = var24 + var21 + 1024 >> 11;
            var9[var11 + 32] = var24 - var21 + 1024 >> 11;
            var10++;
            var12++;
            var11++;
         }
      }

      byte var31 = 0;
      int var32 = var4 * var6 + var5;

      for (int var37 = 0; var37 < 8; var32 += var6) {
         if (var9[var31 + 1] == 0
            && var9[var31 + 2] == 0
            && var9[var31 + 3] == 0
            && var9[var31 + 4] == 0
            && var9[var31 + 5] == 0
            && var9[var31 + 6] == 0
            && var9[var31 + 7] == 0) {
            short var45 = var7[var14 + (var9[var31] + 16 >> 5) & 16383];
            byte var52 = (byte)(var45 >> 4);
            var3[var32] = var52;
            var3[var32 + 1] = var52;
            var3[var32 + 2] = var52;
            var3[var32 + 3] = var52;
            var3[var32 + 4] = var52;
            var3[var32 + 5] = var52;
            var3[var32 + 6] = var52;
            var3[var32 + 7] = var52;
         } else {
            int var42 = var9[var31 + 2];
            int var48 = var9[var31 + 6];
            int var56 = (var42 + var48) * 4433;
            int var62 = var56 + var48 * -15137;
            int var69 = var56 + var42 * 6270;
            int var76 = var9[var31] + var9[var31 + 4] << 13;
            int var80 = var9[var31] - var9[var31 + 4] << 13;
            int var84 = var76 + var69;
            int var85 = var76 - var69;
            int var86 = var80 + var62;
            int var89 = var80 - var62;
            var76 = var9[var31 + 7];
            var80 = var9[var31 + 5];
            var62 = var9[var31 + 3];
            var69 = var9[var31 + 1];
            var56 = var76 + var69;
            var42 = var80 + var62;
            var48 = var76 + var62;
            int var90 = var80 + var69;
            int var29 = (var48 + var90) * 9633;
            var76 *= 2446;
            var80 *= 16819;
            var62 *= 25172;
            var69 *= 12299;
            var56 *= -7373;
            var42 *= -20995;
            var48 *= -16069;
            var90 *= -3196;
            var48 += var29;
            var90 += var29;
            var76 += var56 + var48;
            var80 += var42 + var90;
            var62 += var42 + var48;
            var69 += var56 + var90;
            int var30 = var14 + (var84 + var69 + 131072 >> 18) & 16383;
            var3[var32] = (byte)(var7[var30] >> 4);
            var30 = var14 + (var84 - var69 + 131072 >> 18) & 16383;
            var3[var32 + 7] = (byte)(var7[var30] >> 4);
            var30 = var14 + (var86 + var62 + 131072 >> 18) & 16383;
            var3[var32 + 1] = (byte)(var7[var30] >> 4);
            var30 = var14 + (var86 - var62 + 131072 >> 18) & 16383;
            var3[var32 + 6] = (byte)(var7[var30] >> 4);
            var30 = var14 + (var89 + var80 + 131072 >> 18) & 16383;
            var3[var32 + 2] = (byte)(var7[var30] >> 4);
            var30 = var14 + (var89 - var80 + 131072 >> 18) & 16383;
            var3[var32 + 5] = (byte)(var7[var30] >> 4);
            var30 = var14 + (var85 + var76 + 131072 >> 18) & 16383;
            var3[var32 + 3] = (byte)(var7[var30] >> 4);
            var30 = var14 + (var85 - var76 + 131072 >> 18) & 16383;
            var3[var32 + 4] = (byte)(var7[var30] >> 4);
         }

         var37++;
         var31 += 8;
      }
   }
}
