package com.aspose.slides.internal.y8b;

import com.aspose.slides.internal.o9b.u6;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.r5w.c8;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.x4g.m3;
import com.aspose.slides.internal.x4g.s7;
import java.awt.PaintContext;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.ColorModel;

public class n5 {
   private final m3 n5;

   public n5(m3 var1) {
      this.n5 = var1;
   }

   public PaintContext n5(ColorModel var1, Rectangle var2, Rectangle2D var3, AffineTransform var4, RenderingHints var5) {
      return var5.containsKey(c8.u3) ? this.l6(var1, var2, var3, var4, var5) : this.k5(var1, var2, var3, var4, var5);
   }

   private PaintContext l6(ColorModel var1, Rectangle var2, Rectangle2D var3, AffineTransform var4, RenderingHints var5) {
      m1 var6 = m1.n5(new AffineTransform(var4));
      var6.l6(this.n5.e2());
      s7 var7 = this.n5.h0();
      s7 var8 = l6.n5(var7, var6);
      if (var5.containsKey(c8.k5)) {
         z1 var9 = (z1)var5.get(c8.k5);
         Rectangle var10 = var9.m3().getBounds();
         Rectangle var11 = var10.intersection(var2);
         if (var11.getWidth() * var11.getHeight() <= 1048576.0) {
            return new k5(this.n5, var6, var8);
         }
      }

      return var8.a6().length <= 512 ? new k5(this.n5, var6, var8) : this.k5(var1, var2, var3, var4, var5);
   }

   private PaintContext k5(ColorModel var1, Rectangle var2, Rectangle2D var3, AffineTransform var4, RenderingHints var5) {
      z1 var6 = null;
      if (var5.containsKey(c8.k5)) {
         var6 = (z1)var5.get(c8.k5);
      }

      com.aspose.slides.internal.h2v.k5 var7 = null;
      if (var5.containsKey(c8.u3)) {
         var7 = (com.aspose.slides.internal.h2v.k5)var5.get(c8.u3);
      } else {
         var7 = new com.aspose.slides.internal.h2v.k5(var6);
      }

      u3 var8 = new u3(this.n5, var7, var4, var5);
      u6 var9 = var8.n5();
      return var9.createContext(var1, var2, var3, new AffineTransform(), var5);
   }
}
