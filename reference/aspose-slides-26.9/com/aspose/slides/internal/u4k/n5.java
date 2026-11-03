package com.aspose.slides.internal.u4k;

import java.awt.Composite;
import java.awt.CompositeContext;
import java.awt.RenderingHints;
import java.awt.image.ColorModel;

public class n5 implements Composite {
   private com.aspose.slides.internal.w8d.n5 n5;

   public n5(com.aspose.slides.internal.w8d.n5 var1) {
      this.n5 = var1;
   }

   @Override
   public CompositeContext createContext(ColorModel srcColorModel, ColorModel dstColorModel, RenderingHints hints) {
      return new n5$n5(this, srcColorModel, dstColorModel, hints, null);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.w8d.n5 n5(n5 var0) {
      return var0.n5;
   }
}
