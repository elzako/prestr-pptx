package com.aspose.slides.internal.u4k;

import java.awt.Composite;
import java.awt.CompositeContext;
import java.awt.RenderingHints;
import java.awt.image.ColorModel;

public final class q0 implements Composite {
   private final q0$n5 n5;

   public q0(q0$n5 var1) {
      this.n5 = var1;
   }

   @Override
   public CompositeContext createContext(ColorModel srcColorModel, ColorModel dstColorModel, RenderingHints hints) {
      return this.n5.n5(srcColorModel, dstColorModel, hints);
   }
}
