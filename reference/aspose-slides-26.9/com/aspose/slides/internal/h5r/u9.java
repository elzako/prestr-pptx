package com.aspose.slides.internal.h5r;

import com.aspose.slides.internal.b8u.t9;
import com.aspose.slides.internal.r1x.v4;

public class u9 extends u3 {
   protected static final int[] u3 = l6();

   public u9(t9 var1) {
      this.n5 = var1;
      this.l6 = v4.x8();
   }

   private static int[] l6() {
      int[] var0 = new int[2048];

      for (int var1 = 0; var1 <= 255; var1++) {
         var0[var1 + 0] = n5(0.299) * var1;
         var0[var1 + 256] = n5(0.587) * var1;
         var0[var1 + 512] = n5(0.114) * var1 + 32768;
         var0[var1 + 768] = -n5(0.16874) * var1;
         var0[var1 + 1024] = -n5(0.33126) * var1;
         var0[var1 + 1280] = n5(0.5) * var1 + 8388608 + 32768 - 1;
         var0[var1 + 1536] = -n5(0.41869) * var1;
         var0[var1 + 1792] = -n5(0.08131) * var1;
      }

      return var0;
   }

   private static int n5(double var0) {
      return com.aspose.slides.internal.v6g.k5.u3(var0 * 65536.0 + 0.5, 14);
   }

   @Override
   protected void n5(byte[] var1, byte[] var2) {
      if (var1.length != var2.length) {
         throw new com.aspose.slides.internal.h6t.n5("Cannot convert colors.");
      }

      int var3 = 0;

      for (int var4 = 0; var4 < var1.length; var4++) {
         int var5 = var1[var4] & 255;
         int var6 = var1[var4 + 1] & 255;
         int var7 = var1[var4 + 2] & 255;
         var2[var3++] = (byte)(u3[var5 + 0] + u3[var6 + 256] + u3[var7 + 512] >> 16);
         var2[var3++] = (byte)(u3[var5 + 768] + u3[var6 + 1024] + u3[var7 + 1280] >> 16);
         var2[var3++] = (byte)(u3[var5 + 1280] + u3[var6 + 1536] + u3[var7 + 1792] >> 16);
      }
   }

   @Override
   protected byte[] n5(int[] var1) {
      byte[] var2 = new byte[var1.length * 3];
      int var3 = 0;

      for (int var4 = 0; var4 < var1.length; var4++) {
         int var5 = var1[var4];
         byte var6 = (byte)(var5 >> 16 & 0xFF);
         byte var7 = (byte)(var5 >> 8 & 0xFF);
         byte var8 = (byte)(var5 & 0xFF);
         var2[var3++] = (byte)(u3[(var6 & 255) + 0] + u3[(var7 & 255) + 256] + u3[(var8 & 255) + 512] >> 16);
         var2[var3++] = (byte)(u3[(var6 & 255) + 768] + u3[(var7 & 255) + 1024] + u3[(var8 & 255) + 1280] >> 16);
         var2[var3++] = (byte)(u3[(var6 & 255) + 1280] + u3[(var7 & 255) + 1536] + u3[(var8 & 255) + 1792] >> 16);
      }

      return var2;
   }
}
