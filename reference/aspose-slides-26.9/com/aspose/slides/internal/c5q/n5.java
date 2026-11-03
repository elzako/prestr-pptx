package com.aspose.slides.internal.c5q;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;

class n5 implements a6 {
   @Override
   public byte[] n5(BufferedImage var1) {
      DataBufferByte var2 = (DataBufferByte)var1.getRaster().getDataBuffer();
      byte[] var3 = var2.getData();
      byte[] var4 = new byte[var3.length];

      for (int var5 = 0; var5 < var3.length; var5++) {
         int var6 = 255 - (var3[var5] & 255);
         var4[var5] = (byte)(var6 & 0xFF);
      }

      return var4;
   }
}
