package com.aspose.slides.internal.e4w;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.j3b.c8;
import com.aspose.slides.internal.j3b.s7;
import com.aspose.slides.internal.j3b.u9;
import com.aspose.slides.internal.y5s.j5;
import com.aspose.slides.internal.y5s.q0;
import com.aspose.slides.internal.y5s.z3;
import com.aspose.slides.internal.y5s.z8;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;

class u3 implements s7 {
   private final BufferedImage n5;
   private final z8 l6;

   u3(BufferedImage var1, com.aspose.slides.internal.d7u.n5 var2) {
      this.n5 = var1;
      this.l6 = new z8();
      this.l6.n5(var2.n5());
      this.l6.n5(this.n5(var2));
   }

   private q0 n5(com.aspose.slides.internal.d7u.n5 var1) {
      switch (var1.h0() & 0xFF) {
         case 1:
            return q0.u9();
         case 2:
            return q0.a6();
         case 3:
         case 5:
         case 6:
         case 7:
         default:
            throw new ArgumentOutOfRangeException("bitDepth", "Must be one of (1, 2, 4, 8)");
         case 4:
            return q0.u3();
         case 8:
            return q0.k5();
      }
   }

   @Override
   public void n5(j5 var1, u9 var2) {
      throw new NotImplementedException("Aspose PNG load pixels is not supported");
   }

   @Override
   public boolean n5() {
      return true;
   }

   @Override
   public z8 l6() {
      return this.l6;
   }

   @Override
   public void n5(j5 var1, z8 var2, c8 var3) {
      DataBufferByte var4 = (DataBufferByte)this.n5.getRaster().getDataBuffer();
      byte[] var5 = var4.getData();
      var3.n5(var1, var5, new z3(), new z3());
   }
}
