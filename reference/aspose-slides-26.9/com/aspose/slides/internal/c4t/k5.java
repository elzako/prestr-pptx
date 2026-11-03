package com.aspose.slides.internal.c4t;

import java.awt.Color;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.image.BufferedImage;

public final class k5 extends u3 {
   static int n5 = 0;
   BufferedImage l6;
   Paint k5;

   public k5(BufferedImage var1) {
      this.l6 = var1;
   }

   @Override
   public synchronized void n5(com.aspose.slides.internal.o6t.k5 var1) {
      if (this.k5 == null) {
         this.k5 = new TexturePaint(
            this.l6, new Rectangle(var1.q0().n3, var1.q0().y4, (int)(this.l6.getWidth() * var1.m3() + 0.5), (int)(this.l6.getHeight() * var1.m3() + 0.5))
         );
      }

      var1.z1().setPaint(this.k5);
   }

   @Override
   public Object deepClone() {
      k5 var1 = new k5(this.l6);
      var1.k5 = this.k5;
      if (this.k5 instanceof Color) {
         var1.k5 = new Color(((Color)this.k5).getRed(), ((Color)this.k5).getGreen(), ((Color)this.k5).getBlue(), ((Color)this.k5).getAlpha());
      }

      return var1;
   }
}
