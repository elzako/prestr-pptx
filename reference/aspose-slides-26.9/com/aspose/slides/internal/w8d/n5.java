package com.aspose.slides.internal.w8d;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.io.IOException;

public final class n5 extends com.aspose.slides.internal.n2z.k5 {
   private AffineTransform n3;
   com.aspose.slides.internal.c4t.n5 n5;
   Rectangle l6;
   Rectangle k5;
   byte u3;
   byte a6;
   byte u9;
   byte h0;
   Rectangle c8;
   AffineTransform t2;
   Color s7;
   int x8;

   @Override
   public int n5() {
      return 114;
   }

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      int var4 = var2;
      this.l6 = com.aspose.slides.internal.l1b.k5.u9(var1, var2);
      var2 += 16;
      this.k5 = new Rectangle(com.aspose.slides.internal.l1b.k5.c8(var1, var2), com.aspose.slides.internal.l1b.k5.s7(var1, var2 + 8));
      var2 += 16;
      this.u3 = var1[var2++];
      this.a6 = var1[var2++];
      this.u9 = var1[var2++];
      this.h0 = var1[var2++];
      Point var5 = com.aspose.slides.internal.l1b.k5.c8(var1, var2);
      var2 += 8;
      this.t2 = com.aspose.slides.internal.l1b.k5.x8(var1, var2);
      var2 += 24;
      this.s7 = com.aspose.slides.internal.l1b.k5.n3(var1, var2);
      var2 += 4;
      this.x8 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      int var6 = com.aspose.slides.internal.l1b.k5.u3(var1, var2) - 8;
      var2 += 4;
      int var7 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      int var8 = com.aspose.slides.internal.l1b.k5.u3(var1, var2) - 8;
      var2 += 4;
      int var9 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      Dimension var10 = com.aspose.slides.internal.l1b.k5.s7(var1, var2);
      var2 += 8;
      this.c8 = new Rectangle(var5, var10);
      var2 = var4 + var6;
      this.n5 = new com.aspose.slides.internal.c4t.n5();
      this.n5.n5(var1, var2, var7, var4 + var8, var9);
      this.u3();
   }

   @Override
   public void n5(com.aspose.slides.internal.o6t.l6 var1, com.aspose.slides.internal.m5l.k5 var2, int var3) throws com.aspose.slides.internal.p7x.l6 {
      if (this.n3 == null) {
         Rectangle var4 = new Rectangle(this.c8);
         Rectangle var5 = this.t2.createTransformedShape(var4).getBounds();
         this.n3 = new AffineTransform(this.k5.getWidth() / var5.width, 0.0, 0.0, this.k5.getHeight() / var5.height, this.k5.x - var5.x, this.k5.y - var5.y);
      }

      var1.n5(new com.aspose.slides.internal.u4k.n5(this));
      var1.n5(this.n5.n5(), this.n3);
      var1.u9(-1);
   }

   private void u3() {
      if (!this.n5.n5().getColorModel().hasAlpha() && this.h0 == 1) {
         this.n5.n5(this.n5(this.n5.n5()));
      }
   }

   private BufferedImage n5(BufferedImage var1) {
      BufferedImage var2 = new BufferedImage(var1.getWidth(), var1.getHeight(), 2);
      DataBufferInt var3 = (DataBufferInt)var2.getRaster().getDataBuffer();
      DataBufferInt var4 = (DataBufferInt)var1.getRaster().getDataBuffer();
      int[] var5 = var3.getData();
      int[] var6 = var4.getData();
      System.arraycopy(var6, 0, var5, 0, var6.length);
      return var2;
   }

   public byte l6() {
      return this.u9;
   }

   public byte k5() {
      return this.h0;
   }
}
