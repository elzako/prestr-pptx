package com.aspose.slides.internal.r3x;

import java.awt.Graphics2D;
import java.awt.Image;

class a6$u3 extends a6$n5 {
   @Override
   protected com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.o9b.l6 var1, int var2, int var3) {
      Image var4 = com.aspose.slides.internal.o9b.l6.n5(var1).getScaledInstance(var2, var3, 4);
      com.aspose.slides.internal.o9b.l6 var5 = new com.aspose.slides.internal.o9b.l6(var2, var3, 2498570);
      Graphics2D var6 = com.aspose.slides.internal.o9b.l6.n5(var5).createGraphics();
      var6.drawImage(var4, 0, 0, null);
      var6.dispose();
      return var5;
   }
}
