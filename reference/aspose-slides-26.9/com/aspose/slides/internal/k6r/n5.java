package com.aspose.slides.internal.k6r;

import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.x4g.n3;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

class n5 implements u3 {
   @Override
   public final void n5(k5 var1) {
      if (var1.u3 instanceof n3) {
         this.u3(var1);
      } else {
         this.a6(var1);
      }
   }

   private void u3(k5 var1) {
      y2 var2 = this.l6(var1);
      this.n5(var1, var2, 0, 0);
   }

   private void a6(k5 var1) {
      com.aspose.slides.internal.o9b.u3 var2 = var1.u3;
      m1 var3 = var1.u3.k5();

      try {
         y2 var4 = this.k5(var1);
         int var5 = Math.max(0, var4.s7());
         int var6 = Math.max(0, var4.x8());
         m1 var7 = new m1();
         var7.k5(-var5, -var6);
         m1 var8 = var3.u9();
         var8.n5(var7, 1);
         var2.n5(var8);
         m1 var9 = var1.k5.u9();
         var9.n5(var7, 1);
         Shape var10 = com.aspose.slides.internal.c9b.u3.n5(var7, var1.h0);
         var1 = new k5(var1.n5, var9, var2, var1.a6, var1.u9, var10, var1.c8);
         y2 var11 = this.l6(var1);
         y2 var12 = y2.n5(var11, var4);
         if (var12.t2() > 0 && var12.l6() > 0) {
            this.n5(var1, var12, var5, var6);
            return;
         }
      } finally {
         var2.n5(var3);
      }
   }

   private void n5(k5 var1, y2 var2, int var3, int var4) {
      com.aspose.slides.internal.o9b.l6 var5 = this.n5(var1, var2);
      com.aspose.slides.internal.o9b.l6 var6 = this.l6(var1, var2);
      z1 var7 = z1.n5(var6);

      try {
         var7.z8().setComposite(AlphaComposite.DstIn);
         var7.z8().drawImage(var5.k5(), 0, 0, null);
      } finally {
         var7.dispose();
      }

      var1.l6.drawImage(var6.k5(), var3, var4, null);
   }

   protected com.aspose.slides.internal.o9b.l6 n5(k5 var1, y2 var2) {
      com.aspose.slides.internal.o9b.l6 var3 = this.n5(var2);
      z1 var4 = z1.n5(var3);

      try {
         RenderingHints var5 = var1.l6.getRenderingHints();
         var4.z8().setRenderingHints(var5);
         var4.z8().setPaint(new Color(0, 0, 0, 255));
         var4.z8().fill(var1.h0);
         return var3;
      } finally {
         var4.dispose();
      }
   }

   private com.aspose.slides.internal.o9b.l6 l6(k5 var1, y2 var2) {
      com.aspose.slides.internal.o9b.l6 var3 = this.n5(var2);
      z1 var4 = z1.n5(var3);

      try {
         RenderingHints var5 = var1.l6.getRenderingHints();
         var4.z8().setRenderingHints(var5);
         var4.z8().setPaint(var1.u3);
         var4.z8().fill(this.n5(var1.h0));
         return var3;
      } finally {
         var4.dispose();
      }
   }

   protected final com.aspose.slides.internal.o9b.l6 n5(y2 var1) {
      return new com.aspose.slides.internal.o9b.l6(var1.t2(), var1.l6(), 2498570);
   }

   protected final y2 l6(k5 var1) {
      return y2.n5(new Rectangle(var1.n5.m3().getBounds()));
   }

   protected final y2 k5(k5 var1) {
      Rectangle2D var2 = var1.h0.getBounds2D();
      int var3 = (int)Math.floor(var2.getX() - 0.5);
      int var4 = (int)Math.floor(var2.getY() - 0.5);
      int var5 = (int)Math.ceil(var2.getMaxX() + 0.5);
      int var6 = (int)Math.ceil(var2.getMaxY() + 0.5);
      return new y2(var3, var4, var5 - var3, var6 - var4);
   }

   protected final Rectangle2D n5(Shape var1) {
      Rectangle2D var2 = var1.getBounds2D();
      y1 var3 = new y1((float)var2.getX(), (float)var2.getY(), (float)var2.getWidth(), (float)var2.getHeight());
      var3.n5(1.0F, 1.0F);
      return y1.u9(var3);
   }
}
