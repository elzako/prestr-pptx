package com.aspose.slides.internal.c5q;

import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.v4;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

public class n3 implements a6 {
   @Override
   public byte[] n5(BufferedImage var1) {
      int var2 = var1.getWidth();
      int var3 = var1.getHeight();
      DataBufferInt var4 = (DataBufferInt)var1.getRaster().getDataBuffer();
      int[] var5 = var4.getData();
      byte[] var6 = new byte[var5.length * 3];
      y2 var7 = new y2(0, 0, var2, var3);
      v4 var8 = v4.u3();
      v4 var9 = v4.x8();
      k5 var10 = new k5();
      var10.n5(var2, var3, var8.z3() * var2, null, var8, var7, null, var9, var9.z3() * var2, 0, null, null, 0, null);

      for (int var11 = 0; var11 < var5.length; var11++) {
         int var12 = var5[var11];
         byte var13 = (byte)(var12 >> 16 & 0xFF);
         byte var14 = (byte)(var12 >> 8 & 0xFF);
         byte var15 = (byte)(var12 & 0xFF);
         var10.n5(var13, var14, var15, var6, var11 * 3);
      }

      return var6;
   }
}
