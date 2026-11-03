package com.aspose.slides.internal.y4u;

public class w5 extends u8 {
   protected double y2 = 0.299;
   protected double y1 = 0.587;
   protected double a0 = 0.114;
   protected int[] d2;

   public w5() {
      this.l6();
   }

   private void l6() {
      double var1 = 2.0 - 2.0 * this.y2;
      double var3 = this.a0 * (2.0 - 2.0 * this.a0) / this.y1;
      double var5 = this.y2 * (2.0 - 2.0 * this.y2) / this.y1;
      double var7 = 2.0 - 2.0 * this.a0;
      this.d2 = new int[1792];

      for (int var9 = 0; var9 < 256; var9++) {
         this.d2[var9 + 0] = 65536 * var9;
         this.d2[var9 + 256] = 65536 * var9;
         this.d2[var9 + 512] = 65536 * var9;
         this.d2[var9 + 768] = n5(var1) * (var9 - 128);
         this.d2[var9 + 1024] = -n5(var3) * (var9 - 128);
         this.d2[var9 + 1280] = -n5(var5) * (var9 - 128);
         this.d2[var9 + 1536] = n5(var7) * (var9 - 128);
      }
   }

   private static int n5(double var0) {
      return com.aspose.slides.internal.v6g.k5.u3(var0 * 65536.0 + 0.5, 14);
   }

   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8) {
      boolean var9 = false;
      short var10 = 255;

      for (int var11 = 0; var11 < var5; var11++) {
         int var12 = var2 + this.s7 * var11;
         int var13 = var11 * var8 + var7;

         for (int var14 = 0; var14 < var4; var14++) {
            int var15 = var14 * 3 + var12;
            byte var16 = var1[var15++];
            byte var17 = var1[var15++];
            byte var18 = var1[var15++];
            int var19 = this.d2[(var16 & 255) + 0] + this.d2[(var18 & 255) + 768] >> 16;
            int var20 = this.d2[(var16 & 255) + 256] + this.d2[(var17 & 255) + 1024] + this.d2[(var18 & 255) + 1280] >> 16;
            int var21 = this.d2[(var16 & 255) + 512] + this.d2[(var17 & 255) + 1536] >> 16;
            if (var19 < 0) {
               var19 = 0;
            } else if (var19 > 255) {
               var19 = 255;
            }

            if (var20 < 0) {
               var20 = 0;
            } else if (var20 > 255) {
               var20 = 255;
            }

            if (var21 < 0) {
               var21 = 0;
            } else if (var21 > 255) {
               var21 = 255;
            }

            int var22 = 31 & com.aspose.slides.internal.v6g.k5.u3(var21 / 8.225806451612904 + 0.5, 14)
               | (31 & com.aspose.slides.internal.v6g.k5.u3(var20 / 8.225806451612904 + 0.5, 14)) << 5
               | (31 & com.aspose.slides.internal.v6g.k5.u3(var19 / 8.225806451612904 + 0.5, 14)) << 10;
            var6[var13++] = (byte)(var22 & 0xFF);
            var6[var13++] = (byte)((var22 & 0xFF00) >> 8);
         }
      }
   }
}
