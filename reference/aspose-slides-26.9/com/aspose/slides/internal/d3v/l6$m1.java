package com.aspose.slides.internal.d3v;

class l6$m1 extends com.aspose.slides.internal.d3c.u3 {
   private byte x8;
   private byte n3;
   private byte y4;

   public l6$m1(int var1, int var2, int var3, com.aspose.slides.internal.f2i.n5 var4) {
      super(var1, var2, 1, var3, var4);
      this.u9 = var1;
   }

   @Override
   protected void n5(int[] var1, int var2, int var3) {
      boolean var4 = false;
      short var5 = 255;
      int[] var6 = this.u3;
      byte[] var7 = this.h0;
      int var8 = this.c8;
      byte var9 = this.x8;
      byte var10 = this.n3;
      byte var11 = this.y4;

      for (int var12 = 0; var12 < var3; var12++) {
         int var13 = var1[var2++];
         byte var14 = (byte)(var13 >> 16 & 0xFF);
         byte var15 = (byte)(var13 >> 8 & 0xFF);
         byte var16 = (byte)(var13 & 0xFF);
         int var17 = var6[(var14 & 255) + 0] + var6[(var15 & 255) + 256] + var6[(var16 & 255) + 512] >> 16;
         int var18 = var6[(var14 & 255) + 1536] + var6[(var15 & 255) + 1792] + var6[(var16 & 255) + 2048] >> 16;
         int var19 = var6[(var14 & 255) + 768] + var6[(var15 & 255) + 1024] + var6[(var16 & 255) + 1280] >> 16;
         if (var17 < 0) {
            var17 = 0;
         } else if (var17 > 255) {
            var17 = 255;
         }

         if (var18 < 0) {
            var18 = 0;
         } else if (var18 > 255) {
            var18 = 255;
         }

         if (var19 < 0) {
            var19 = 0;
         } else if (var19 > 255) {
            var19 = 255;
         }

         var7[var8++] = (byte)(((byte)var17 & 255) - (var9 & 255));
         var7[var8++] = (byte)(((byte)var18 & 255) - (var10 & 255));
         var7[var8++] = (byte)(((byte)var19 & 255) - (var11 & 255));
         var9 = (byte)var17;
         var10 = (byte)var18;
         var11 = (byte)var19;
      }

      this.c8 = var8;
      if (this.u9 - var3 == 0L) {
         this.x8 = 0;
         this.n3 = 0;
         this.y4 = 0;
      } else {
         this.x8 = var9;
         this.n3 = var10;
         this.y4 = var11;
      }
   }
}
