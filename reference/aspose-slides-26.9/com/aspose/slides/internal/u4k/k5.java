package com.aspose.slides.internal.u4k;

import java.awt.CompositeContext;
import java.awt.RenderingHints;
import java.awt.image.ColorModel;

public abstract class k5 implements CompositeContext {
   ColorModel n5;
   ColorModel l6;
   RenderingHints k5;
   boolean u3;
   final int a6 = 25;

   k5(ColorModel var1, ColorModel var2, RenderingHints var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      if (var3 != null) {
         Object var4 = var3.get(com.aspose.slides.internal.m5l.k5.n5);
         if (var4 != null && var4 instanceof Boolean) {
            this.u3 = (Boolean)var4;
         } else {
            this.u3 = false;
         }
      } else {
         this.u3 = false;
      }
   }

   @Override
   public void dispose() {
   }
}
