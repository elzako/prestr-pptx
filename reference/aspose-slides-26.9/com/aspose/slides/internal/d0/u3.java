package com.aspose.slides.internal.d0;

import com.aspose.slides.internal.h3k.c8;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.q1;

public class u3 extends com.aspose.slides.internal.l3.n5 {
   private final c8 l6;
   private final byte[] k5 = new byte[1];

   public u3(t4 var1, byte[] var2, int var3, int var4) {
      super(var1);
      this.l6 = new c8();
      this.l6.l6(var2, var3, var4);
   }

   @Override
   public void write(byte[] b, int offset, int length) {
      byte[] var4 = new byte[q1.l6(length, 4192)];

      while (length > 0) {
         int var5 = q1.l6(length, var4.length);
         this.l6.n5(b, offset, var5, var4, 0);
         super.n5.write(var4, 0, var5);
         length -= var5;
         offset += var5;
      }
   }

   @Override
   public void writeByte(byte value) {
      this.k5[0] = value;
      this.write(this.k5, 0, 1);
   }
}
