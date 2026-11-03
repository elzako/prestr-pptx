package com.aspose.slides.internal.y8b;

import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.x4g.m3;
import com.aspose.slides.internal.x4g.s7;
import java.awt.Paint;
import java.awt.PaintContext;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.ColorModel;

class u3$n5 implements Paint {
   private m3 n5;
   private s7 l6;

   u3$n5(m3 var1, s7 var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public PaintContext createContext(ColorModel cm, Rectangle deviceBounds, Rectangle2D userBounds, AffineTransform xform, RenderingHints hints) {
      return new k5(this.n5, new m1(), this.l6);
   }

   @Override
   public int getTransparency() {
      return 3;
   }
}
