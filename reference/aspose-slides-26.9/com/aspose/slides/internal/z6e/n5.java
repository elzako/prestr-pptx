package com.aspose.slides.internal.z6e;

import java.awt.Point;
import java.awt.geom.Arc2D.Float;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class n5 extends com.aspose.slides.internal.n2z.k5 {
   Point n5;
   int l6;
   float k5;
   float u3;

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      this.n5 = com.aspose.slides.internal.l1b.k5.c8(var1, var2);
      var2 += 8;
      this.l6 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      ByteBuffer var4 = ByteBuffer.wrap(var1, var2, 8).order(ByteOrder.LITTLE_ENDIAN);
      this.k5 = var4.getFloat();
      this.u3 = var4.getFloat();
   }

   @Override
   public int n5() {
      return 41;
   }

   @Override
   public void n5(com.aspose.slides.internal.o6t.l6 var1, com.aspose.slides.internal.m5l.k5 var2, int var3) throws com.aspose.slides.internal.p7x.l6 {
      Float var4 = new Float(this.n5.x - this.l6, this.n5.y - this.l6, this.l6 * 2, this.l6 * 2, this.k5, this.u3, 0);
      var1.u3(var4);
   }
}
