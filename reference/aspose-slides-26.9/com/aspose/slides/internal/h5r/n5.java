package com.aspose.slides.internal.h5r;

import com.aspose.slides.internal.b8u.t9;
import com.aspose.slides.internal.r1x.v4;

public class n5 extends u3 {
   public n5(t9 var1, v4 var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   protected void n5(byte[] var1, byte[] var2) {
   }

   @Override
   protected byte[] n5(int[] var1) {
      byte[] var2 = new byte[var1.length * 4];
      int var3 = 0;

      for (int var4 = 0; var4 < var1.length; var4++) {
         int var5 = var1[var4];
         byte var6 = (byte)(var5 >> 24 & 0xFF);
         byte var7 = (byte)(var5 >> 16 & 0xFF);
         byte var8 = (byte)(var5 >> 8 & 0xFF);
         byte var9 = (byte)(var5 & 0xFF);
         var2[var3++] = var6;
         var2[var3++] = var7;
         var2[var3++] = var8;
         var2[var3++] = var9;
      }

      return var2;
   }
}
