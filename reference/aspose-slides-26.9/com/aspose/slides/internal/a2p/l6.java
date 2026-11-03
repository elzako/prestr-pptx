package com.aspose.slides.internal.a2p;

import com.aspose.slides.internal.b7s.e2;
import com.aspose.slides.internal.b8u.t9;
import com.aspose.slides.internal.r1x.v4;

public class l6 extends e2 {
   private static final int[] k5;

   public l6(t9 var1) {
      this.n5 = var1;
      this.l6 = v4.n3();
   }

   @Override
   protected byte[] n5(int[] var1) {
      int var2 = 0;
      byte[] var3 = new byte[var1.length];
      int[] var4 = k5;

      for (int var5 = 0; var5 < var1.length; var5++) {
         int var6 = var1[var5];
         byte var7 = (byte)(var6 >> 16 & 0xFF);
         byte var8 = (byte)(var6 >> 8 & 0xFF);
         byte var9 = (byte)(var6 & 0xFF);
         var3[var2++] = (byte)(var4[(var7 & 255) + 0] + var4[(var8 & 255) + 256] + var4[(var9 & 255) + 512] >> 16);
      }

      return var3;
   }

   private static int n5(double var0) {
      return com.aspose.slides.internal.v6g.k5.u3(var0 * 65536.0 + 0.5, 14);
   }

   static {
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

      k5 = var0;
   }
}
