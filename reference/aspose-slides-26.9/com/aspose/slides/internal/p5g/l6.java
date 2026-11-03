package com.aspose.slides.internal.p5g;

import java.awt.Paint;
import java.awt.PaintContext;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class l6 implements Paint {
   BufferedImage n5;
   double l6;
   double k5;
   double u3;
   double a6;

   public l6(BufferedImage var1, Rectangle2D var2) {
      this.n5 = var1;
      this.l6 = var2.getX();
      this.k5 = var2.getY();
      this.u3 = var2.getWidth() / this.n5.getWidth();
      this.a6 = var2.getHeight() / this.n5.getHeight();
   }

   @Override
   public PaintContext createContext(ColorModel cm, Rectangle deviceBounds, Rectangle2D userBounds, AffineTransform xform, RenderingHints hints) {
      if (xform == null) {
         xform = new AffineTransform();
      } else {
         xform = (AffineTransform)xform.clone();
      }

      xform.translate(this.l6, this.k5);
      xform.scale(this.u3, this.a6);

      try {
         return this.n5(this.n5, xform, hints, deviceBounds);
      } catch (Exception var7) {
         return com.aspose.slides.internal.p5g.k5.n5(this.n5, xform, hints, deviceBounds);
      }
   }

   private PaintContext n5(BufferedImage var1, AffineTransform var2, RenderingHints var3, Rectangle var4) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
      Class var5 = Class.forName("com.aspose.slides.internal.p5g.n5");
      Method var6 = var5.getMethod("n5", BufferedImage.class, AffineTransform.class, RenderingHints.class, Rectangle.class);
      return (PaintContext)var6.invoke(null, var1, var2, var3, var4);
   }

   @Override
   public int getTransparency() {
      return this.n5.getColorModel().getTransparency();
   }
}
