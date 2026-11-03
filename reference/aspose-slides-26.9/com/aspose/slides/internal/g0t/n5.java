package com.aspose.slides.internal.g0t;

import java.awt.Composite;
import java.awt.CompositeContext;
import java.awt.RenderingHints;
import java.awt.image.ColorModel;

public class n5 implements Composite {
   private Composite n5;

   public n5(Composite var1) {
      this.n5 = var1;
   }

   @Override
   public CompositeContext createContext(ColorModel srcColorModel, ColorModel dstColorModel, RenderingHints hints) {
      return new n5$n5(this.n5.createContext(srcColorModel, dstColorModel, hints), srcColorModel, dstColorModel, hints);
   }
}
