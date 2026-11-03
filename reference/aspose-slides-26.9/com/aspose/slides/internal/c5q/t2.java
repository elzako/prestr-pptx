package com.aspose.slides.internal.c5q;

import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.v4;
import com.aspose.slides.internal.y4u.v3;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;

class t2 implements a6 {
   @Override
   public byte[] n5(BufferedImage var1) {
      int var2 = var1.getWidth();
      int var3 = var1.getHeight();
      DataBufferByte var4 = (DataBufferByte)var1.getRaster().getDataBuffer();
      byte[] var5 = var4.getData();
      byte[] var6 = new byte[var5.length];
      y2 var7 = new y2(0, 0, var2, var3);
      v4 var8 = v4.u3();
      v4 var9 = v4.x8();
      v3 var10 = new v3();
      var10.n5(var2, var3, var8.z3() * var2, null, var8, var7, null, var9, var9.z3() * var2, 0, null, null, 0, null);
      var10.n5(var7, var5, 0, var6, 0);
      return var6;
   }
}
