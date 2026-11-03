package com.aspose.slides.internal.k6r;

import com.aspose.slides.internal.o9b.p8;
import com.aspose.slides.internal.o9b.u6;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.o9b.z1;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Rectangle2D.Double;

public class c8 extends n5 {
   @Override
   protected com.aspose.slides.internal.o9b.l6 n5(k5 var1, y2 var2) {
      com.aspose.slides.internal.o9b.l6 var3 = super.n5(var1, var2);
      com.aspose.slides.internal.o9b.l6 var4 = this.l6(var1, var2);
      z1 var5 = z1.n5(var4);

      try {
         var5.z8().setComposite(AlphaComposite.DstIn);
         var5.z8().drawImage(var3.k5(), 0, 0, null);
      } finally {
         var5.dispose();
      }

      return var4;
   }

   private com.aspose.slides.internal.o9b.l6 l6(k5 var1, y2 var2) {
      com.aspose.slides.internal.o9b.l6 var3 = this.n5(var2);
      z1 var4 = z1.n5(var3);

      try {
         RenderingHints var5 = (RenderingHints)var1.l6.getRenderingHints().clone();
         var4.z8().setRenderingHints(var5);
         var4.z8().setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
         var4.z8().setPaint(new Color(-16777216));
         u6 var6 = (u6)var1.u3;
         p8 var7 = var6.s7();
         Double var8 = new Double(0.0, 0.0, var7.l6(), var7.k5());
         Shape var9 = com.aspose.slides.internal.c9b.u3.n5(var1.u3.k5(), var8);
         var4.z8().fill(var9);
         return var3;
      } finally {
         var4.dispose();
      }
   }
}
