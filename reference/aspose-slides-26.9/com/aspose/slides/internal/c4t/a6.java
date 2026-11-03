package com.aspose.slides.internal.c4t;

import java.awt.Color;

public final class a6 extends u3 {
   private int n5;
   private Color l6;

   public a6(int var1, Color var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public void n5(com.aspose.slides.internal.o6t.k5 var1) {
      if (var1.q0().k7) {
         var1.z1().setPaint(new u9(this.n5, var1.m3(), var1.k5(this.l6), var1.q0().e2));
      } else {
         var1.z1().setPaint(new u9(this.n5, var1.m3(), var1.k5(this.l6)));
      }
   }

   @Override
   public Object deepClone() {
      return new a6(this.n5, this.l6 == null ? this.l6 : new Color(this.l6.getRed(), this.l6.getGreen(), this.l6.getBlue(), this.l6.getAlpha()));
   }
}
