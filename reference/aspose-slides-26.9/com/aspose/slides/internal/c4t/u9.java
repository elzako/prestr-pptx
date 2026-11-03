package com.aspose.slides.internal.c4t;

import java.awt.Color;
import java.awt.Paint;
import java.awt.PaintContext;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;

final class u9 implements Paint {
   static final ColorModel n5 = new DirectColorModel(24, 16711680, 65280, 255);
   static final ColorModel l6 = ColorModel.getRGBdefault();
   private static final Color c8 = new Color(0.0F, 0.0F, 0.0F, 0.0F);
   int k5;
   float u3;
   Color a6;
   Color u9;
   boolean h0;

   public u9(int var1, float var2, Color var3, Color var4) {
      if (var4 == null) {
         var4 = c8;
      }

      if (var3 == null) {
         var3 = c8;
      }

      if (var3.getAlpha() < 255 || var4.getAlpha() < 255) {
         this.h0 = true;
      }

      this.k5 = var1;
      this.u3 = var2;
      this.a6 = var3;
      this.u9 = var4;
   }

   public u9(int var1, float var2, Color var3) {
      this(var1, var2, var3, null);
   }

   @Override
   public PaintContext createContext(ColorModel cm, Rectangle devBounds, Rectangle2D userBounds, AffineTransform xform, RenderingHints rhints) {
      Object var6 = rhints.get(RenderingHints.KEY_INTERPOLATION);
      boolean var7 = var6 != RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR;
      if (cm == null || this.h0 && !cm.hasAlpha()) {
         cm = this.h0 ? l6 : n5;
      }

      AffineTransform var8 = AffineTransform.getScaleInstance(this.u3, this.u3);
      if (xform != null) {
         var8.preConcatenate(xform);
      }

      return new h0(this.k5, this.a6, this.u9, cm, var7, var8);
   }

   @Override
   public int getTransparency() {
      return this.h0 ? 3 : 1;
   }
}
