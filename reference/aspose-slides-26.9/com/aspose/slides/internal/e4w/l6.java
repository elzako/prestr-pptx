package com.aspose.slides.internal.e4w;

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

class l6 implements s7 {
   private final BufferedImage n5;
   private final z8 l6;

   public l6(BufferedImage var1, com.aspose.slides.internal.d7u.n5 var2) {
      this.n5 = var1;
      this.l6 = new z8();
      this.l6.n5(var2.n5());
      this.l6.n5(q0.l6());
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

      for (int var6 = 0; var6 < var5.length; var6 += 3) {
         byte var7 = var5[var6];
         byte var8 = var5[var6 + 1];
         byte var9 = var5[var6 + 2];
         var5[var6] = var9;
         var5[var6 + 1] = var8;
         var5[var6 + 2] = var7;
      }

      try {
         var3.n5(var1, var5, new z3(), new z3());
      } finally {
         for (int var11 = 0; var11 < var5.length; var11 += 3) {
            byte var16 = var5[var11];
            byte var15 = var5[var11 + 1];
            byte var14 = var5[var11 + 2];
            var5[var11] = var14;
            var5[var11 + 1] = var15;
            var5[var11 + 2] = var16;
         }
      }
   }
}
