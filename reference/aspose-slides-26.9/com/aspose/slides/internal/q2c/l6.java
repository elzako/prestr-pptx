package com.aspose.slides.internal.q2c;

import java.awt.image.BufferedImage;

public class l6 {
   public void n5(BufferedImage var1, BufferedImage var2) {
      l6$n5 var3 = this.l6(var1, var2);
      var3.n5();
   }

   private l6$n5 l6(BufferedImage var1, BufferedImage var2) {
      switch (var1.getType()) {
         case 1:
            return new l6$u9(var1, var2);
         case 2:
            return new l6$a6(var1, var2);
         case 3:
         case 4:
         default:
            return new l6$u3(var1, var2);
         case 5:
            return new l6$l6(var1, var2);
         case 6:
            return new l6$k5(var1, var2);
      }
   }
}
