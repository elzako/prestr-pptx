package com.aspose.slides.internal.u4k;

import java.awt.Color;
import java.awt.Composite;
import java.awt.CompositeContext;
import java.awt.RenderingHints;
import java.awt.image.ColorModel;

public final class z3 implements Composite {
   private int n5;

   public z3(Color var1) {
      this.n5 = var1.getRGB();
   }

   @Override
   public CompositeContext createContext(ColorModel srcColorModel, ColorModel dstColorModel, RenderingHints hints) {
      return new u9(this.n5, srcColorModel, dstColorModel, hints);
   }
}
