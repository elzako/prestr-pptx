package com.aspose.slides.internal.y8b;

import com.aspose.slides.internal.e3j.u9;
import com.aspose.slides.internal.o9b.p8;
import com.aspose.slides.internal.o9b.u6;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.x4g.m3;
import com.aspose.slides.internal.x4g.s7;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.util.List;

public class u3 {
   private final m3 n5;
   private final m1 l6;
   private final com.aspose.slides.internal.h2v.k5 k5;
   private final RenderingHints u3;

   u3(m3 var1, com.aspose.slides.internal.h2v.k5 var2, AffineTransform var3, RenderingHints var4) {
      this.n5 = var1;
      this.k5 = var2;
      this.l6 = m1.n5(new AffineTransform(var3));
      this.l6.l6(var1.e2());
      this.u3 = var4;
   }

   public u6 n5() {
      s7 var1 = this.n5.h0();
      w1 var2 = this.n5.s7();
      Shape var3 = this.n5(var1);
      Rectangle2D var4 = var3.getBounds2D();
      Rectangle2D var5 = this.n5(var3);
      p8 var6 = this.n5(var4, var5, this.l6);
      m1 var7 = this.n5(var4, var6);
      s7 var8 = com.aspose.slides.internal.y8b.l6.n5(var1, var7);
      w1 var9 = u9.n5(var2, var7);
      Shape var10 = com.aspose.slides.internal.c9b.u3.n5(var7, var3);
      m3 var11 = (m3)this.n5.deepClone();
      var11.n5(new m1());
      var11.n5(var9);
      com.aspose.slides.internal.o9b.l6 var12 = this.n5(var6, var11, var8, this.u3);
      com.aspose.slides.internal.o9b.l6 var13 = this.n5(var6, var10, this.u3);
      this.n5(var12, var13);
      return this.n5(var12, var7, this.l6);
   }

   private Shape n5(s7 var1) {
      Shape var2 = this.k5();
      if (this.n5.t9() != 4) {
         Rectangle2D var3 = var1.getBounds2D();
         Area var4 = new Area(var2);
         var4.intersect(new Area(var3));
         return var4;
      } else {
         return var2;
      }
   }

   private Rectangle2D n5(Shape var1) {
      Shape var2 = com.aspose.slides.internal.c9b.u3.n5(this.l6, var1);
      return var2.getBounds2D();
   }

   private void n5(com.aspose.slides.internal.o9b.l6 var1, com.aspose.slides.internal.o9b.l6 var2) {
      z1 var3 = z1.n5(var1);

      try {
         var3.z8().setComposite(AlphaComposite.DstIn);
         var3.z8().drawImage(var2.k5(), 0, 0, null);
      } finally {
         var3.dispose();
      }
   }

   private p8 n5(Rectangle2D var1, Rectangle2D var2, m1 var3) {
      double var4 = 256.0;
      double var6 = 256.0;
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
         w1 var14 = u9.n5(new w1((float)var1.getMinX(), (float)var1.getMaxY()), var3);
         w1 var15 = u9.n5(new w1((float)var1.getMaxX(), (float)var1.getMaxY()), var3);
         w1 var16 = u9.n5(new w1((float)var1.getMinX(), (float)var1.getMinY()), var3);
         double var17 = u9.n5(var14, var15);
         double var19 = u9.n5(var14, var16);
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

   private com.aspose.slides.internal.o9b.l6 n5(p8 var1, m3 var2, s7 var3, RenderingHints var4) {
      com.aspose.slides.internal.o9b.l6 var5 = new com.aspose.slides.internal.o9b.l6(var1.l6(), var1.k5(), 2498570);
      z1 var6 = z1.n5(var5);
      var6.z8().setPaint(new u3$n5(var2, var3));
      var6.z8().fill(new Rectangle(0, 0, var1.l6(), var1.k5()));
      return var5;
   }

   private com.aspose.slides.internal.o9b.l6 n5(p8 var1, Shape var2, RenderingHints var3) {
      com.aspose.slides.internal.o9b.l6 var4 = new com.aspose.slides.internal.o9b.l6(var1.l6(), var1.k5(), 2498570);
      z1 var5 = z1.n5(var4);
      var5.z8().setRenderingHints(var3);
      var5.z8().setPaint(new Color(0, 0, 0, 255));
      var2 = this.k5.n5(null, var2);
      var5.z8().fill(var2);
      return var4;
   }

   private u6 n5(com.aspose.slides.internal.o9b.l6 var1, m1 var2, m1 var3) {
      m1 var4 = var2.u9();
      var4.h0();
      var4.n5(var3, 1);
      u6 var5 = new u6(var1, this.n5.t9());
      var5.k5(var4);
      return var5;
   }

   private float l6() {
      float var1 = (float)Math.max(this.l6.t2().getScaleX(), this.l6.t2().getScaleY());
      if (var1 <= 0.0F) {
         var1 = 1.0F;
      }

      return 0.25F / var1;
   }

   private Shape k5() {
      s7 var1 = this.n5.h0();
      w1 var2 = this.n5.s7().u3();
      boolean var3 = this.n5(var1, var2);
      var1 = com.aspose.slides.internal.y8b.l6.n5(var1, null, this.l6());
      if (!var3) {
         return var1;
      }

      List var4 = com.aspose.slides.internal.p2n.l6.n5(var1, var2);
      Area var5 = new Area();

      for (Object recoveredElement$var7$5633 : var4) {
         Shape var7 = (Shape)recoveredElement$var7$5633;
         var5.add(new Area(var7));
      }

      return var5;
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
