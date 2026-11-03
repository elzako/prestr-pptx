package com.aspose.slides.internal.e8p;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;

public class u3 extends u9 {
   private boolean k5;
   private int[] u3;

   public u3(com.aspose.slides.internal.c5e.x8 var1, BufferedImage var2) {
      super(var1, var2);
      this.k5 = var1.l6().u3() != null;
      if (this.k5) {
         this.u3 = var1.l6().u3().u3();
      }
   }

   @Deprecated
   @Override
   protected void n5(com.aspose.slides.internal.c5e.k5 var1, int[] var2) {
   }

   @Override
   public void n5() {
      int var1 = this.n5.n5.l6;
      this.n5.n5(false);

      for (int var2 = 0; var2 < var1; var2++) {
         com.aspose.slides.internal.c5e.k5 var3 = this.n5.l6(var2);
         this.n5(var3, this.l6);
      }
   }

   @Override
   protected void n5(com.aspose.slides.internal.c5e.k5 var1, BufferedImage var2) {
      DataBufferByte var3 = (DataBufferByte)var2.getRaster().getDataBuffer();
      byte[] var4 = var3.getData();
      int var5 = var1.n5();
      int var6 = this.n5.n5.x8;
      int var7 = var5 * var6;
      byte[] var8 = var1.k5();
      System.arraycopy(var8, 0, var4, var7, var6);
   }
}
