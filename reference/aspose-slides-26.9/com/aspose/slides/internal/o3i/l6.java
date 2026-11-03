package com.aspose.slides.internal.o3i;

import com.aspose.slides.internal.n2z.k5;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.io.IOException;

public class l6 extends k5 {
   public Rectangle n5;
   public Rectangle l6;
   public int k5;
   public int u3;
   public int a6;
   public short u9;
   public String h0;
   public int c8;
   public Dimension t2;
   public Dimension s7;
   byte[] x8 = null;
   byte[] n3 = null;
   String[] y4 = new String[3];

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      int var4 = var2 - 8;
      if (var3 < 80) {
         throw new com.aspose.slides.internal.p7x.l6("This is not EMF file");
      }

      int var5 = var3;
      this.n5 = com.aspose.slides.internal.l1b.k5.u9(var1, var2);
      var2 += 16;
      this.l6 = com.aspose.slides.internal.l1b.k5.u9(var1, var2);
      var2 += 16;
      int var6 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      if (var6 != 1179469088) {
         throw new com.aspose.slides.internal.p7x.l6("This is not EMF file");
      }

      this.k5 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.u3 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.a6 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.u9 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 4;
      int var7 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      int var8 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      int var9 = var5;
      if (var7 > 0 && var8 >= 88 && var8 + var4 + var7 * 2 <= var3) {
         this.h0 = new String(var1, var8 + var4, var7 * 2, "UTF-16LE");
         var5 = var8 + var4;
         var9 = var8 + var4 + var7 * 2;
      }

      this.c8 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.t2 = com.aspose.slides.internal.l1b.k5.s7(var1, var2);
      var2 += 8;
      this.s7 = com.aspose.slides.internal.l1b.k5.s7(var1, var2);
      var2 += 8;
      if (var2 < var5) {
         this.x8 = new byte[var5 - var2];
         System.arraycopy(var1, var2, this.x8, 0, this.x8.length);
      }

      if (var9 < var3) {
         this.n3 = new byte[var3 - var9];
         System.arraycopy(var1, var9, this.n3, 0, this.n3.length);
      }
   }

   @Override
   public int n5() {
      return 1;
   }

   @Override
   protected void n5(com.aspose.slides.internal.o6t.l6 var1, com.aspose.slides.internal.m5l.k5 var2, int var3) throws com.aspose.slides.internal.p7x.l6 {
      var1.q0().n5(new Rectangle(0, 0, this.t2.width, this.t2.height));
      var1.q0().l6((Rectangle)var1.q0().l6().clone());
      var1.n5(this.t2.getWidth() / this.s7.getWidth());
      var1.l6(this.t2.getHeight() / this.s7.getHeight());
      var1.k5(this.t2);
      var1.u3(this.s7);
   }
}
