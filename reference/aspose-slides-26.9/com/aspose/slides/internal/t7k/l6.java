package com.aspose.slides.internal.t7k;

import com.aspose.slides.internal.r5w.x8;
import java.awt.AlphaComposite;
import java.awt.Graphics2D;

class l6 extends n5 {
   protected l6(x8 var1, com.aspose.slides.internal.o9b.u3 var2) {
      super(var1, var2);
   }

   @Override
   protected void n5(com.aspose.slides.internal.o9b.l6 var1, com.aspose.slides.internal.o9b.l6 var2) {
      Graphics2D var3 = var2.k5().createGraphics();
      var3.setComposite(AlphaComposite.DstIn);
      var3.drawImage(var1.k5(), 0, 0, null);
      this.n5.z8().drawImage(var2.k5(), 0, 0, null);
   }
}
