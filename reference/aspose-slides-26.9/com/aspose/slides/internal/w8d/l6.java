package com.aspose.slides.internal.w8d;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.IOException;

public final class l6 extends com.aspose.slides.internal.n2z.k5 {
   Rectangle n5;
   Rectangle l6;
   int k5;
   Point u3;
   AffineTransform a6;
   Color u9;
   int h0;
   com.aspose.slides.internal.c4t.n5 c8;

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      int var4 = var2 - 8;
      this.n5 = com.aspose.slides.internal.l1b.k5.u9(var1, var2);
      var2 += 16;
      Point var5 = com.aspose.slides.internal.l1b.k5.c8(var1, var2);
      var2 += 8;
      Dimension var6 = com.aspose.slides.internal.l1b.k5.s7(var1, var2);
      var2 += 8;
      this.l6 = new Rectangle(var5, var6);
      this.k5 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.u3 = com.aspose.slides.internal.l1b.k5.c8(var1, var2);
      var2 += 8;
      this.a6 = com.aspose.slides.internal.l1b.k5.x8(var1, var2);
      var2 += 24;
      this.u9 = com.aspose.slides.internal.l1b.k5.n3(var1, var2);
      var2 += 4;
      this.h0 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      int var7 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      int var8 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      int var9 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      int var10 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      var2 = var4 + var7;
      if (var7 != 0) {
         this.c8 = new com.aspose.slides.internal.c4t.n5();
         this.c8.n5(var1, var2, var8, var4 + var9, var10);
      }
   }

   @Override
   public int n5() {
      return 76;
   }

   @Override
   public void n5(com.aspose.slides.internal.o6t.l6 var1, com.aspose.slides.internal.m5l.k5 var2, int var3) throws com.aspose.slides.internal.p7x.l6 {
      BufferedImage var4 = null;
      if (this.c8 != null) {
         var4 = this.c8.n5();
         Rectangle var5 = this.n5(this.l6);
         var1.n5(this.k5, var4, var5, null);
      } else if (this.k5 == 15728673) {
         var1.u9(this.l6);
      } else if (this.k5 == 5898313) {
         var1.n5(com.aspose.slides.internal.o6t.k5.c8, this.l6);
      } else if (this.k5 == 10485961) {
         var1.n5(com.aspose.slides.internal.o6t.k5.u9, this.l6);
      } else if (this.k5 == 11141161) {
         var1.n5(com.aspose.slides.internal.o6t.k5.t9, this.l6);
      }
   }

   private Rectangle n5(Rectangle var1) {
      int var2 = var1.height;
      int var3 = var1.width;
      if (var2 >= 0 && var3 >= 0) {
         return var1;
      }

      int var4 = var1.x;
      int var5 = var1.y;
      if (var2 < 0) {
         var2 = -var2;
         var5 -= var2;
      }

      if (var3 < 0) {
         var3 = -var3;
         var4 -= var3;
      }

      return new Rectangle(var4, var5, var3, var2);
   }
}
