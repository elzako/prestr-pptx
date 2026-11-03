package com.aspose.slides.internal.k6r;

import com.aspose.slides.internal.o9b.p8;
import com.aspose.slides.internal.o9b.u6;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.x4g.m3;
import com.aspose.slides.internal.x4g.s7;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.util.List;

public class u9 extends n5 {
   @Override
   protected com.aspose.slides.internal.o9b.l6 n5(k5 var1, y2 var2) {
      com.aspose.slides.internal.o9b.l6 var3 = this.n5(var2);
      z1 var4 = z1.n5(var3);

      try {
         Graphics2D var5 = var4.z8();
         RenderingHints var6 = var1.l6.getRenderingHints();
         var5.setRenderingHints(var6);
         var5.setPaint(new Color(0, 0, 0, 255));
         m3 var7 = (m3)var1.u3;
         if (var7.t9() == 4) {
            Shape var8 = this.u9(var1);
            Area var9 = new Area(var8);
            var9.intersect(new Area(var1.h0));
            var5.fill(var9);
         } else {
            u6 var13 = this.u3(var1);
            var5.setPaint(var13);
            var5.fill(var1.h0);
         }

         return var3;
      } finally {
         var4.dispose();
      }
   }

   private u6 u3(k5 var1) {
      m3 var2 = (m3)var1.u3;
      m1 var3 = var2.e2();
      s7 var4 = var2.h0();
      Shape var5 = this.a6(var1);
      Rectangle2D var6 = var4.getBounds2D();
      Area var7 = new Area(var6);
      var7.intersect(new Area(var5));
      Shape var8 = com.aspose.slides.internal.c9b.u3.n5(var3, var7);
      Rectangle2D var9 = var8.getBounds2D();
      p8 var10 = this.n5(var6, var9, var3);
      m1 var11 = this.n5(var6, var10);
      Shape var12 = com.aspose.slides.internal.c9b.u3.n5(var11, var5);
      com.aspose.slides.internal.o9b.l6 var13 = this.n5(var1, var10, var12);
      return this.n5(var2.t9(), var13, var11, var3);
   }

   private u6 n5(int var1, com.aspose.slides.internal.o9b.l6 var2, m1 var3, m1 var4) {
      m1 var5 = var3.u9();
      var5.h0();
      var5.n5(var4, 1);
      u6 var6 = new u6(var2, var1);
      var6.k5(var5);
      return var6;
   }

   private p8 n5(Rectangle2D var1, Rectangle2D var2, m1 var3) {
      double var4 = 512.0;
      double var6 = 512.0;
      double var8 = var1.getWidth() / var1.getHeight();
      if (var8 > 1.0) {
         var6 /= var8;
      } else {
         var4 *= var8;
      }

      double var10 = var4 * var6;
      double var12 = 0.0;
      if (var3.t2().getShearX() == 0.0 && var3.t2().getShearY() == 0.0) {
         var12 = var2.getWidth() * var2.getHeight();
      } else {
         w1 var14 = com.aspose.slides.internal.e3j.u9.n5(new w1((float)var1.getMinX(), (float)var1.getMaxY()), var3);
         w1 var15 = com.aspose.slides.internal.e3j.u9.n5(new w1((float)var1.getMaxX(), (float)var1.getMaxY()), var3);
         w1 var16 = com.aspose.slides.internal.e3j.u9.n5(new w1((float)var1.getMinX(), (float)var1.getMinY()), var3);
         double var17 = com.aspose.slides.internal.e3j.u9.n5(var14, var15);
         double var19 = com.aspose.slides.internal.e3j.u9.n5(var14, var16);
         var12 = var17 * var19;
      }

      if (var10 > var12) {
         double var21 = var10 / var12;
         var4 /= Math.sqrt(var21);
         var6 /= Math.sqrt(var21);
      }

      return new p8(Math.max(1, (int)Math.round(var4)), Math.max(1, (int)Math.round(var6)));
   }

   private m1 n5(Rectangle2D var1, p8 var2) {
      double var3 = Math.max(var2.l6(), var2.k5()) / Math.max(var1.getWidth(), var1.getHeight());
      double var5 = -var1.getX();
      double var7 = -var1.getY();
      m1 var9 = new m1();
      var9.n5((float)var3, (float)var3);
      var9.k5((float)var5, (float)var7);
      return var9;
   }

   private com.aspose.slides.internal.o9b.l6 n5(k5 var1, p8 var2, Shape var3) {
      com.aspose.slides.internal.o9b.l6 var4 = new com.aspose.slides.internal.o9b.l6(var2.l6(), var2.k5(), 2498570);
      z1 var5 = z1.n5(var4);
      var5.z8().setRenderingHints(var1.l6.getRenderingHints());
      var5.z8().setPaint(new Color(0, 0, 0, 255));
      var5.z8().fill(var1.c8.n5(null, var3));
      return var4;
   }

   private Shape a6(k5 var1) {
      m3 var2 = (m3)var1.u3;
      m1 var3 = var2.e2();
      s7 var4 = var2.h0();
      boolean var5 = this.n5(var4, var2.s7());
      float var6 = (float)Math.max(var3.t2().getScaleX(), var3.t2().getScaleY());
      if (var6 <= 0.0F) {
         var6 = 1.0F;
      }

      float var7 = 0.25F / var6;
      var4 = com.aspose.slides.internal.y8b.l6.n5(var4, null, var7);
      if (!var5) {
         return var4;
      }

      List var8 = com.aspose.slides.internal.p2n.l6.n5(var4, var2.s7());
      Area var9 = new Area();

      for (Object recoveredElement$var11$4885 : var8) {
         Shape var11 = (Shape)recoveredElement$var11$4885;
         var9.add(new Area(var11));
      }

      return var9;
   }

   private Shape u9(k5 var1) {
      m3 var2 = (m3)var1.u3;
      m1 var3 = var2.e2();
      s7 var4 = var2.h0();
      boolean var5 = this.n5(var4, var2.s7());
      s7 var6 = com.aspose.slides.internal.y8b.l6.n5(var4, var3);
      w1 var7 = com.aspose.slides.internal.e3j.u9.n5(var2.s7(), var3);
      if (var5) {
         List var8 = com.aspose.slides.internal.p2n.l6.n5(var6, var7);
         Area var9 = new Area();

         for (Object recoveredElement$var11$5412 : var8) {
            Shape var11 = (Shape)recoveredElement$var11$5412;
            Shape var12 = var1.c8.n5(null, var11);
            if (var8.size() == 1) {
               return var12;
            }

            var9.add(new Area(var12));
         }

         return var9;
      } else {
         return var1.c8.n5(null, var6);
      }
   }

   private boolean n5(s7 var1, w1 var2) {
      if (!var1.contains(var2.l6(), var2.k5())) {
         return true;
      }

      Area var3 = new Area(var1.l6());

      for (Shape var6 : com.aspose.slides.internal.p2n.l6.l6(var1, var2)) {
         var3.exclusiveOr(new Area(var6));
      }

      return !this.n5(var3);
   }

   private boolean n5(Area var1) {
      double var2 = 1.0E-5;
      Rectangle2D var4 = var1.getBounds2D();
      return var1.isEmpty() || var4.getWidth() < 1.0E-5 || var4.getHeight() < 1.0E-5;
   }
}
