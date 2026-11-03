package com.aspose.slides.internal.y4u;

public class z6 extends s7 {
   private int[] z8;

   @Override
   protected void n5() {
      this.z8 = new int[2048];

      for (int var1 = 0; var1 <= 255; var1++) {
         this.z8[var1 + 0] = n5(0.299) * var1;
         this.z8[var1 + 256] = n5(0.587) * var1;
         this.z8[var1 + 512] = n5(0.114) * var1 + 32768;
         this.z8[var1 + 768] = -n5(0.16874) * var1;
         this.z8[var1 + 1024] = -n5(0.33126) * var1;
         this.z8[var1 + 1280] = n5(0.5) * var1 + 8388608 + 32768 - 1;
         this.z8[var1 + 1536] = -n5(0.41869) * var1;
         this.z8[var1 + 1792] = -n5(0.08131) * var1;
      }
   }

   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8) {
      for (int var9 = 0; var9 < var5; var9++) {
         int var10 = var2 + this.s7 * var9;
         int var11 = var9 * var8 + var7;
         int var12 = var10;

         for (int var13 = 0; var13 < var4; var13++) {
            byte var14 = var1[var12++];
            byte var15 = var1[var12++];
            byte var16 = var1[var12++];
            var6[var11++] = (byte)(this.z8[(var14 & 255) + 0] + this.z8[(var15 & 255) + 256] + this.z8[(var16 & 255) + 512] >> 16);
            var6[var11++] = (byte)(this.z8[(var14 & 255) + 768] + this.z8[(var15 & 255) + 1024] + this.z8[(var16 & 255) + 1280] >> 16);
            var6[var11++] = (byte)(this.z8[(var14 & 255) + 1280] + this.z8[(var15 & 255) + 1536] + this.z8[(var16 & 255) + 1792] >> 16);
         }
      }
   }

   private static int n5(double var0) {
      return com.aspose.slides.internal.v6g.k5.u3(var0 * 65536.0 + 0.5, 14);
   }
}
