package com.aspose.slides.internal.c5q;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;

class h0 implements a6 {
   @Override
   public byte[] n5(BufferedImage var1) {
      DataBufferByte var2 = (DataBufferByte)var1.getRaster().getDataBuffer();
      byte[] var3 = var2.getData();
      byte[] var4 = new byte[var3.length];

      for (int var5 = 0; var5 < var3.length; var5 += 3) {
         byte var6 = var3[var5];
         byte var7 = var3[var5 + 1];
         byte var8 = var3[var5 + 2];
         var4[var5] = var8;
         var4[var5 + 1] = var7;
         var4[var5 + 2] = var6;
      }

      return var4;
   }
}
