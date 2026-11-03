package com.aspose.slides.internal.r5w;

import com.aspose.slides.internal.o9b.t4;
import com.aspose.slides.internal.o9b.y2;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;

public class h0 {
   public static com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.o9b.l6 var0, int var1) {
      return n5(var0, var1, new y2(0, 0, var0.e2(), var0.h0()));
   }

   public static com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.o9b.l6 var0, int var1, y2 var2) {
      com.aspose.slides.internal.j9e.n5 var3 = var0.n5(var2, 1, var1);
      BufferedImage var4 = com.aspose.slides.internal.v4y.l6.n5(var2.t2(), var2.l6(), var1);
      com.aspose.slides.internal.o9b.l6 var5 = new com.aspose.slides.internal.o9b.l6(var4, var0.x8());
      var5.n5(var2, 1, var1);
      var5.n5(var3);
      return var5;
   }

   public static t4 n5(Image var0, com.aspose.slides.internal.j9e.x8 var1, int var2) {
      if (var0 instanceof BufferedImage) {
         return new com.aspose.slides.internal.o9b.l6(var0, var1);
      }

      BufferedImage var3 = com.aspose.slides.internal.v4y.l6.n5(var0.getWidth(null), var0.getHeight(null), var2);
      Graphics2D var4 = var3.createGraphics();
      var4.drawImage(var0, 0, 0, null);
      var4.dispose();
      return new com.aspose.slides.internal.o9b.l6(var3, var1);
   }
}
