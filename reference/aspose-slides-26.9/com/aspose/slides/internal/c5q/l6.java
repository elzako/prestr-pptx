package com.aspose.slides.internal.c5q;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;

class l6 implements a6 {
   @Override
   public byte[] n5(BufferedImage var1) {
      DataBufferByte var2 = (DataBufferByte)var1.getRaster().getDataBuffer();
      byte[] var3 = var2.getData();
      byte[] var4 = new byte[var3.length];
      System.arraycopy(var3, 0, var4, 0, var3.length);
      return var4;
   }
}
