package com.aspose.slides.internal.c5q;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

public class c8 implements a6 {
   @Override
   public byte[] n5(BufferedImage var1) {
      DataBufferInt var2 = (DataBufferInt)var1.getRaster().getDataBuffer();
      int[] var3 = var2.getData();
      byte[] var4 = new byte[var3.length * 3];

      for (int var5 = 0; var5 < var3.length; var5++) {
         int var6 = var3[var5];
         byte var7 = (byte)(var6 >> 16 & 0xFF);
         byte var8 = (byte)(var6 >> 8 & 0xFF);
         byte var9 = (byte)(var6 >> 0 & 0xFF);
         int var10 = var5 * 3;
         var4[var10] = var7;
         var4[var10 + 1] = var8;
         var4[var10 + 2] = var9;
      }

      return var4;
   }
}
