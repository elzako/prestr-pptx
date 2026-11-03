package com.aspose.slides.internal.c4t;

import java.awt.Color;

public final class s7 extends u3 {
   static Color n5 = new Color(0, 0, 0, 0);
   Color l6;

   public s7(Color var1) {
      if (var1 == null) {
         var1 = n5;
      }

      this.l6 = var1;
   }

   @Override
   public void n5(com.aspose.slides.internal.o6t.k5 var1) {
      var1.z1().setPaint(var1.k5(this.l6));
   }

   public Color n5() {
      return this.l6;
   }

   @Override
   public Object deepClone() {
      return new s7(new Color(this.l6.getRed(), this.l6.getGreen(), this.l6.getBlue(), this.l6.getAlpha()));
   }
}
