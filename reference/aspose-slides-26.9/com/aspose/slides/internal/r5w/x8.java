package com.aspose.slides.internal.r5w;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.internal.j9e.y4;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.o9b.e5;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.j5;
import com.aspose.slides.internal.o9b.m3;
import com.aspose.slides.internal.o9b.n3;
import com.aspose.slides.internal.o9b.t4;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.o9b.z1$n5;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.ms.System.n1;
import com.aspose.slides.ms.System.q1;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.NoninvertibleTransformException;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class x8 extends z1 {
   Graphics2D n5;
   com.aspose.slides.internal.o9b.l6 l6;
   private float k5;
   private float u3;
   private Rectangle a6;
   private com.aspose.slides.internal.g0t.l6 u9;
   private Integer h0 = 3;
   private float c8 = 1.0F;
   private int t2 = 1;
   private int s7 = 0;
   private j5 x8 = new j5(0, 0);
   private int n3 = 0;
   private int y4 = 4;
   private int e2 = 0;
   private m1 t9;
   private AffineTransform z1 = new AffineTransform();
   private com.aspose.slides.internal.x4g.x8 t4 = null;
   private final com.aspose.slides.internal.h0y.a6 q0 = new com.aspose.slides.internal.h0y.a6(this);
   private final com.aspose.slides.internal.h0y.u3 z3 = new com.aspose.slides.internal.h0y.u3(this, this.q0);
   private final u3 m1 = new u3(this);

   private x8(com.aspose.slides.internal.o9b.l6 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("Value of 'image' cannot be null");
      }

      if (com.aspose.slides.internal.o9b.t4.l6(var1.s7())) {
         throw new RuntimeException("Cannot create graphic object from indexed image format");
      }

      if (var1.s7() != 397319 && var1.s7() != 1052676) {
         this.n5 = (Graphics2D)var1.a6().n5().getGraphics();
         this.l6 = var1;
         this.k5 = this.l6.c8();
         this.u3 = this.l6.y4();
         this.a6 = new Rectangle(this.l6.e2(), this.l6.h0());
         this.u9 = new com.aspose.slides.internal.g0t.l6(this, 0, 0);
         this.k5(3);
         this.a6(0);
         this.u9(3);
         this.h0(4);
         this.c8(0);
         this.t9 = new m1();
         this.n5.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
         this.n5.setRenderingHint(com.aspose.slides.internal.r5w.c8.k5, this);
         this.n5.setRenderingHint(com.aspose.slides.internal.r5w.c8.n5, this.k5);
         this.n5.setRenderingHint(com.aspose.slides.internal.r5w.c8.l6, this.u3);
      } else {
         throw new OutOfMemoryException("");
      }
   }

   @Override
   public Graphics2D z8() {
      return this.n5;
   }

   @Override
   public void dispose() {
      this.z8().dispose();
      this.n5 = null;
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.c8 var1) {
      int var2 = this.c8();

      try {
         if (com.aspose.slides.internal.o9b.t4.k5(this.l6.s7()) && (var1.s7() & 255) < 255) {
            int var3 = var1.s7() & 255;
            double var4 = 255.0 / var3;
            var1 = com.aspose.slides.internal.o9b.c8.n5(
               var3,
               (int)(Math.round((var1.x8() & 0xFF) / var4) * var4),
               (int)(Math.round((var1.n3() & 0xFF) / var4) * var4),
               (int)(Math.round((var1.y4() & 0xFF) / var4) * var4)
            );
            this.n5(1);
         }

         Shape var16 = this.z8().getClip();
         this.z8().setClip(null);
         Area var6 = new Area(var16 == null ? new a0().n5() : var16);
         Paint var7 = this.z8().getPaint();

         try {
            this.z8().setPaint(var1.n5());
            this.z8().fill(var6);
         } finally {
            this.z8().setPaint(var7);
            this.z8().setClip(var16);
         }
      } finally {
         this.n5(var2);
      }
   }

   @Override
   public void n5(m3 var1, y2 var2, float var3, float var4) {
      this.n5(var1, var2.s7(), var2.x8(), var2.t2(), var2.l6(), var3, var4);
   }

   @Override
   public void n5(m3 var1, y1 var2, float var3, float var4) {
      this.n5(var1, var2.x8(), var2.n3(), var2.s7(), var2.k5(), var3, var4);
   }

   @Override
   public void n5(m3 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      com.aspose.slides.internal.x4g.s7 var8 = new com.aspose.slides.internal.x4g.s7();
      var8.n5(var2, var3, var4, var5, var6, var7);
      this.n5(var1, var8);
   }

   @Override
   public void n5(m3 var1, j5[] var2) {
      com.aspose.slides.internal.x4g.s7 var3 = new com.aspose.slides.internal.x4g.s7();
      var3.n5(var2);
      this.n5(var1, var3);
   }

   @Override
   public void n5(m3 var1, w1[] var2) {
      com.aspose.slides.internal.x4g.s7 var3 = new com.aspose.slides.internal.x4g.s7();
      var3.n5(var2);
      this.n5(var1, var3);
   }

   @Override
   public void n5(m3 var1, w1[] var2, float var3, int var4) {
      com.aspose.slides.internal.x4g.s7 var5 = new com.aspose.slides.internal.x4g.s7(var4);
      var5.n5(var2, var3);
      this.n5(var1, var5);
   }

   @Override
   public void l6(m3 var1, j5[] var2) {
      this.n5(var1, var2, 0.5F);
   }

   public void n5(m3 var1, j5[] var2, float var3) {
      if (var2 == null) {
         throw new ArgumentNullException("Value 'points' cannot be null");
      }

      this.n5(var1, var2, 0, var2.length - 1, var3);
   }

   public void n5(m3 var1, j5[] var2, int var3, int var4, float var5) {
      com.aspose.slides.internal.x4g.s7 var6 = new com.aspose.slides.internal.x4g.s7();
      var6.n5(var2, var3, var4, var5);
      this.n5(var1, var6);
   }

   @Override
   public void n5(m3 var1, w1[] var2, int var3, int var4, float var5) {
      com.aspose.slides.internal.x4g.s7 var6 = new com.aspose.slides.internal.x4g.s7();
      var6.n5(var2, var3, var4, var5);
      this.n5(var1, var6);
   }

   @Override
   public void n5(m3 var1, y2 var2) {
      this.l6(var1, var2.s7(), var2.x8(), var2.t2(), var2.l6());
   }

   @Override
   public void n5(m3 var1, y1 var2) {
      this.k5(var1, var2.x8(), var2.n3(), var2.s7(), var2.k5());
   }

   public void l6(m3 var1, int var2, int var3, int var4, int var5) {
      this.k5(var1, (float)var2, (float)var3, (float)var4, (float)var5);
   }

   public void k5(m3 var1, float var2, float var3, float var4, float var5) {
      com.aspose.slides.internal.x4g.s7 var6 = new com.aspose.slides.internal.x4g.s7();
      var6.n5(var2, var3, var4, var5);
      this.n5(var1, var6);
   }

   @Override
   public void n5(t4 var1, j5 var2) {
      this.m1.n5(var1, var2);
   }

   @Override
   public void n5(t4 var1, w1 var2) {
      this.m1.n5(var1, var2);
   }

   @Override
   public void n5(t4 var1, y2 var2) {
      this.m1.n5(var1, var2);
   }

   @Override
   public void n5(t4 var1, y1 var2) {
      this.m1.n5(var1, var2);
   }

   @Override
   public void n5(t4 var1, int var2, int var3) {
      this.m1.n5(var1, var2, var3);
   }

   @Override
   public void n5(t4 var1, float var2, float var3) {
      this.m1.n5(var1, var2, var3);
   }

   @Override
   public void n5(t4 var1, y2 var2, y2 var3, int var4) {
      this.m1.n5(var1, var2, var3, var4);
   }

   @Override
   public void n5(t4 var1, y1 var2, y1 var3, int var4) {
      this.m1.n5(var1, var2, var3, var4);
   }

   @Override
   public void n5(t4 var1, w1[] var2, y1 var3, int var4) {
      this.m1.n5(var1, var2, var3, var4);
   }

   @Override
   public void n5(t4 var1, int var2, int var3, int var4, int var5) {
      this.m1.n5(var1, var2, var3, var4, var5);
   }

   @Override
   public void n5(t4 var1, float var2, float var3, float var4, float var5) {
      this.m1.n5(var1, var2, var3, var4, var5);
   }

   @Override
   public void n5(t4 var1, j5[] var2, y2 var3, int var4, com.aspose.slides.internal.j9e.t2 var5) {
      this.m1.n5(var1, var2, var3, var4, var5);
   }

   @Override
   public void n5(t4 var1, w1[] var2, y1 var3, int var4, com.aspose.slides.internal.j9e.t2 var5) {
      this.m1.n5(var1, var2, var3, var4, var5);
   }

   @Override
   public void n5(t4 var1, int var2, int var3, y2 var4, int var5) {
      this.m1.n5(var1, var2, var3, var4, var5);
   }

   @Override
   public void n5(t4 var1, y2 var2, float var3, float var4, float var5, float var6, int var7) {
      this.m1.n5(var1, var2, var3, var4, var5, var6, var7);
   }

   @Override
   public void n5(t4 var1, y2 var2, int var3, int var4, int var5, int var6, int var7, com.aspose.slides.internal.j9e.t2 var8) {
      this.m1.n5(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   public void n5(t4 var1, y2 var2, float var3, float var4, float var5, float var6, int var7, com.aspose.slides.internal.j9e.t2 var8) {
      this.m1.n5(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   public void l6(t4 var1, int var2, int var3) {
      if (var1 == null) {
         throw new ArgumentNullException("Value of 'image' cannot be null");
      }

      this.n5(var1, var2, var3);
   }

   @Override
   public void n5(m3 var1, w1 var2, w1 var3) {
      this.n5(var1, var2.l6(), var2.k5(), var3.l6(), var3.k5());
   }

   @Override
   public void n5(m3 var1, j5 var2, j5 var3) {
      this.n5(var1, (float)var2.n5(), (float)var2.l6(), (float)var3.n5(), (float)var3.l6());
   }

   @Override
   public void n5(m3 var1, int var2, int var3, int var4, int var5) {
      this.n5(var1, (float)var2, (float)var3, (float)var4, (float)var5);
   }

   @Override
   public void n5(m3 var1, float var2, float var3, float var4, float var5) {
      if (var2 != var4 || var3 != var5) {
         com.aspose.slides.internal.x4g.s7 var6 = new com.aspose.slides.internal.x4g.s7();
         var6.l6(var2, var3, var4, var5);
         this.n5(var1, var6);
      }
   }

   @Override
   public void l6(m3 var1, w1[] var2) {
      com.aspose.slides.internal.x4g.s7 var3 = new com.aspose.slides.internal.x4g.s7();
      var3.l6(var2);
      this.n5(var1, var3);
   }

   @Override
   public void k5(m3 var1, j5[] var2) {
      com.aspose.slides.internal.x4g.s7 var3 = new com.aspose.slides.internal.x4g.s7();
      var3.l6(var2);
      this.n5(var1, var3);
   }

   @Override
   public void n5(m3 var1, com.aspose.slides.internal.x4g.s7 var2) {
      if (var1 == null) {
         throw new ArgumentNullException("Value of 'pen' cannot be null");
      }

      if (var2 == null) {
         throw new ArgumentNullException("Value of 'path' cannot be null");
      }

      if (!Float.isNaN(var1.q0())) {
         this.z3.n5(var1, var2);
      }
   }

   @Override
   public void l6(m3 var1, y2 var2, float var3, float var4) {
      this.l6(var1, var2.s7(), var2.x8(), var2.t2(), var2.l6(), var3, var4);
   }

   @Override
   public void l6(m3 var1, y1 var2, float var3, float var4) {
      this.l6(var1, var2.x8(), var2.n3(), var2.s7(), var2.k5(), var3, var4);
   }

   public void l6(m3 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      com.aspose.slides.internal.x4g.s7 var8 = new com.aspose.slides.internal.x4g.s7();
      var8.l6(var2, var3, var4, var5, var6, var7);
      this.n5(var1, var8);
   }

   @Override
   public void u3(m3 var1, j5[] var2) {
      com.aspose.slides.internal.x4g.s7 var3 = new com.aspose.slides.internal.x4g.s7();
      if (var2 == null) {
         throw new ArgumentNullException("points");
      }

      if (var2.length < 2) {
         throw new ArgumentException("Invalid parameter used.");
      }

      for (int var4 = 0; var4 < var2.length - 1; var4++) {
         var3.n5(var2[var4], var2[var4 + 1]);
      }

      var3.n3();
      this.n5(var1, var3);
   }

   @Override
   public void k5(m3 var1, w1[] var2) {
      com.aspose.slides.internal.x4g.s7 var3 = new com.aspose.slides.internal.x4g.s7();
      if (var2 == null) {
         throw new ArgumentNullException("points");
      }

      if (var2.length < 2) {
         throw new ArgumentException("Invalid parameter used.");
      }

      for (int var4 = 0; var4 < var2.length - 1; var4++) {
         var3.n5(var2[var4], var2[var4 + 1]);
      }

      var3.n3();
      this.n5(var1, var3);
   }

   @Override
   public void l6(m3 var1, y2 var2) {
      this.k5(var1, var2.u3(), var2.c8(), var2.t2(), var2.l6());
   }

   @Override
   public void l6(m3 var1, float var2, float var3, float var4, float var5) {
      com.aspose.slides.internal.x4g.s7 var6 = new com.aspose.slides.internal.x4g.s7();
      var6.k5(var2, var3, var4, var5);
      this.n5(var1, var6);
   }

   public void k5(m3 var1, int var2, int var3, int var4, int var5) {
      this.l6(var1, (float)var2, (float)var3, (float)var4, (float)var5);
   }

   @Override
   public void n5(m3 var1, y1[] var2) {
      for (y1 var6 : var2) {
         this.l6(var1, var6.a6(), var6.t2(), var6.s7(), var6.k5());
      }
   }

   @Override
   public void n5(String var1, n3 var2, com.aspose.slides.internal.o9b.u3 var3, y1 var4) {
      this.n5(var1, var2, var3, var4.x8(), var4.n3(), var4.s7(), var4.k5(), null);
   }

   @Override
   public void n5(String var1, n3 var2, com.aspose.slides.internal.o9b.u3 var3, w1 var4) {
      this.n5(var1, var2, var3, var4.l6(), var4.k5(), Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, null);
   }

   @Override
   public void n5(String var1, n3 var2, com.aspose.slides.internal.o9b.u3 var3, w1 var4, e5 var5) {
      this.n5(var1, var2, var3, var4.l6(), var4.k5(), Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, var5);
   }

   @Override
   public void n5(String var1, n3 var2, com.aspose.slides.internal.o9b.u3 var3, y1 var4, e5 var5) {
      this.n5(var1, var2, var3, var4.x8(), var4.n3(), var4.s7(), var4.k5(), var5);
   }

   @Override
   public void n5(String var1, n3 var2, com.aspose.slides.internal.o9b.u3 var3, float var4, float var5, e5 var6) {
      this.n5(var1, var2, var3, var4, var5, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, var6);
   }

   private void n5(String var1, n3 var2, com.aspose.slides.internal.o9b.u3 var3, float var4, float var5, float var6, float var7, e5 var8) {
      if (var3 == null) {
         throw new ArgumentNullException("brush");
      }

      if (var2 == null) {
         throw new ArgumentNullException("font");
      }

      n3 var9 = var2;
      if (var8 != null) {
         com.aspose.slides.internal.v6g.a6 var10 = new com.aspose.slides.internal.v6g.a6<>(var2);
         var1 = this.n5(var1, var8, var10);
         var2 = (n3)var10.n5;
      }

      var1 = com.aspose.slides.internal.f3l.k5.n5(var2.h0(), var1);
      var1 = com.aspose.slides.internal.f3l.k5.n5(var2, var1);
      var2 = com.aspose.slides.internal.f3l.k5.l6(var2, var1);
      String var20 = var2.h0();
      var2 = n5(var2);
      boolean var11 = !var20.equalsIgnoreCase(var2.h0());
      if (var11) {
         var2 = com.aspose.slides.internal.f3l.k5.n5(var2, var1, 1);
      }

      var1 = l6(var1);
      var1 = this.n5(var1);
      var2 = com.aspose.slides.internal.r5w.k5.n5(var2, var8, this.z3());
      boolean var12 = this.n5(var2, var8, this.z3());
      if (var1.contains("\t") && var8 == null) {
         var8 = (e5)e5.c8().deepClone();
         var8.n5(0.0F, com.aspose.slides.internal.r5w.k5.l6(this, var2));
      }

      this.n5(var1, var2, var9, var3, var4, var5, var6, var7, var8);
      if (var12) {
         this.c8(this.z3());
      }
   }

   private void n5(String var1, n3 var2, n3 var3, com.aspose.slides.internal.o9b.u3 var4, float var5, float var6, float var7, float var8, e5 var9) {
      if (var7 == 0.0F) {
         var7 = Float.POSITIVE_INFINITY;
      }

      float var10 = var7;
      float var11 = var8;
      float var12 = var5;
      float var13 = var6;
      if (var9 != null && var9.l6() != 0) {
         f2 var14 = this.n5(var1, var2, var9, var9.x8() ? 2.1474836E9F : var7, var9.x8() ? var8 : 2.1474836E9F, null);
         float var15 = var7;
         float var16 = var8;
         if (n1.a6(var7)) {
            var16 = 0.0F;
            var15 = 0.0F;
         }

         float var17 = var9.x8() ? var15 - var14.l6() : var16 - var14.k5();
         float var18 = var9.l6() == 1 ? var17 / 2.0F : var17;
         if (var9.x8()) {
            if (!var9.t9() || var9.l6() != 2) {
               var5 += var18;
            }

            if (!n1.a6(var7)) {
               var7 -= var18;
            }
         } else {
            var6 += var18;
            if (!n1.a6(var8)) {
               var8 -= var18;
            }
         }
      }

      Paint var36 = this.z8().getPaint();
      AffineTransform var37 = this.z8().getTransform();

      try {
         this.z8().setPaint(var4);
         this.z8().setTransform(this.j5());
         boolean var38 = n1.a6(var7) || var9 != null && var9.e2();
         Shape var39 = null;
         if (!var38 && var7 != 0.0F && var8 != 0.0F) {
            var39 = this.z8().getClip();
            this.z8().clip(new java.awt.geom.Rectangle2D.Float(var12, var13, var10, var11));
         }

         try {
            var2 = com.aspose.slides.internal.r5w.k5.n5(this, var2);
            var3 = var3 == null ? var3 : com.aspose.slides.internal.r5w.k5.n5(this, var3);
            com.aspose.slides.internal.o6x.u3 var40 = new com.aspose.slides.internal.o6x.u3(
               this, var1, var2, var3, this.z8().getFontRenderContext(), var9, var7, var8, false
            );
            this.z8().transform(var40.e2());

            for (com.aspose.slides.internal.o6x.l6 var19 = var40.c8(); var19 != null; var19 = var40.c8()) {
               AffineTransform var20 = this.z8().getTransform();
               m1 var21 = new m1();
               var21.l6(com.aspose.slides.internal.x4g.m1.n5(var20));
               float var22 = 0.0F;
               if (var2.u9() && com.aspose.slides.internal.o9b.n3.n5(var2).getItalicAngle() == 0.0F && !com.aspose.slides.internal.f3l.k5.n5(var2.l6())) {
                  var21.t2().concatenate(AffineTransform.getShearInstance(-0.17, 0.0));
                  this.z8().setTransform(var21.t2());
                  com.aspose.slides.internal.x4g.s7 var23 = new com.aspose.slides.internal.x4g.s7();
                  f2 var24 = this.n5(var1, var2, new w1(var5, var6), var9).a6();
                  var23.k5(var5, var6, var24.l6(), var24.k5());
                  var23.l6(com.aspose.slides.internal.x4g.m1.n5(AffineTransform.getShearInstance(-0.17, 0.0)));
                  FontMetrics var25 = this.z8().getFontMetrics(com.aspose.slides.internal.o9b.n3.n5(var2));
                  if (var23.h0() > 0) {
                     var22 = var5 - (var23.a6()[0].l6() + (var23.c8().l6() - var23.a6()[0].l6()) * var25.getAscent() / var25.getHeight());
                  }
               }

               var19.n5(this, var5 + var22, var6);
               this.z8().setTransform(var20);
            }
         } finally {
            if (!var38 && var7 != 0.0F && var8 != 0.0F) {
               this.z8().setTransform(this.j5());
               this.z8().setClip(var39);
            }
         }
      } finally {
         this.z8().setTransform(var37);
         this.z8().setPaint(var36);
      }
   }

   private void n5(String var1, com.aspose.slides.internal.v6g.a6<List<String>> var2, com.aspose.slides.internal.v6g.a6<List<Integer>> var3) {
      short var4 = 235;
      String var5 = "((-|\\+:?)?[0-9]+((,|\\.:?)[0-9]+:?)?)";
      Pattern var6 = Pattern.compile(var5, var4);
      Matcher var7 = var6.matcher(var1);
      var7.reset();

      while (var7.find()) {
         ((List)var2.n5).add(var7.group(1));
         ((List)var3.n5).add(var7.start(1));
      }
   }

   private String n5(String var1, e5 var2, com.aspose.slides.internal.v6g.a6<n3> var3) {
      int var4 = var2.u9();
      if (var4 > 0 && (var2.h0() == 3 || var2.h0() == 2)) {
         com.aspose.slides.internal.x7n.l6 var5 = new com.aspose.slides.internal.x7n.l6(var4);
         String var6 = var1;
         if (var5.s7().endsWith("IN")) {
            if (var2.h0() == 2) {
               var5 = new com.aspose.slides.internal.x7n.l6("en-IN");
            } else {
               var5 = new com.aspose.slides.internal.x7n.l6("mr-IN");
            }
         }

         com.aspose.slides.internal.v6g.a6 var7 = new com.aspose.slides.internal.v6g.a6<>(new ArrayList());
         com.aspose.slides.internal.v6g.a6 var8 = new com.aspose.slides.internal.v6g.a6<>(new ArrayList());
         this.n5(var6, var7, var8);
         ArrayList var9 = new ArrayList();
         if (var5.s7().startsWith("ar")) {
            int var10 = 0;
            int var11 = var10;

            for (int var12 = 0; var12 < ((List)var8.n5).size() - 1; var12++) {
               String var13 = var6.substring(
                  (Integer)((List)var8.n5).get(var12) + ((String)((List)var7.n5).get(var12)).length(), (Integer)((List)var8.n5).get(var12 + 1)
               );
               String[] var14 = var13.split("[\\s]+");
               if (var14.length == 1 && var14[0].length() > 0 || var14.length > 1) {
                  var9.add(new int[]{var10, var11});
                  var10 = var12 + 1;
               }

               var11 = var12 + 1;
            }

            var9.add(new int[]{var10, var11});
            var5.e2().n5(var4);

            for (Object recoveredElement$var23$21964 : var9) {
               int[] var23 = (int[])recoveredElement$var23$21964;
               StringBuilder var24 = new StringBuilder();

               for (int var15 = 0; var15 <= var23[1] - var23[0]; var15++) {
                  String var16 = (String)((List)var7.n5).get(var23[1] - var15);
                  var16 = var16.replaceFirst("[\\.,]", var5.e2().q0());

                  for (int var17 = 0; var17 < 10; var17++) {
                     var16 = var16.replaceAll(Integer.toString(var17), var5.e2().y4()[var17]);
                  }

                  if (var23[1] > var23[0] && (var16.startsWith("+") || var16.startsWith("-"))) {
                     var16 = var16.substring(1) + var16.charAt(0);
                  }

                  var24.append(var16);
                  if (var15 < var23[1] - var23[0]) {
                     var24.append(
                        var6.substring(
                           (Integer)((List)var8.n5).get(var23[1] - var15 - 1) + ((String)((List)var7.n5).get(var23[1] - var15 - 1)).length(),
                           (Integer)((List)var8.n5).get(var23[1] - var15)
                        )
                     );
                  }
               }

               var6 = var6.substring(0, (Integer)((List)var8.n5).get(var23[0]))
                  + var24
                  + var6.substring((Integer)((List)var8.n5).get(var23[1]) + ((String)((List)var7.n5).get(var23[1])).length());
            }
         } else {
            for (int var18 = 0; var18 < ((List)var7.n5).size(); var18++) {
               String var19 = (String)((List)var7.n5).get(var18);
               var19 = var19.replaceFirst("[\\.,]", var5.e2().q0());

               for (int var22 = 0; var22 < 10; var22++) {
                  var19 = var19.replaceAll(Integer.toString(var22), var5.e2().y4()[var22]);
               }

               var6 = var6.substring(0, (Integer)((List)var8.n5).get(var18))
                  + var19
                  + var6.substring((Integer)((List)var8.n5).get(var18) + ((String)((List)var7.n5).get(var18)).length());
            }
         }

         return var6;
      } else {
         return var1;
      }
   }

   private String n5(String var1) {
      String var2 = null;
      String[] var3 = new String[]{"҃҃", "҄҄", "҅҅", "҆҆"};

      for (String var7 : var3) {
         do {
            var2 = var1;
            var1 = var2.replaceAll(var7, var7.substring(1));
         } while (var1.length() != var2.length());
      }

      return var1;
   }

   private boolean n5(n3 var1, e5 var2, int var3) {
      if (var1.h0().equalsIgnoreCase("Arial") && (var2 == null || !var2.q0()) && var3 == 2 && var1.x8() != 0) {
         RenderingHints var4 = this.z8().getRenderingHints();
         var4.put(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
         this.z8().setRenderingHints(var4);
         return true;
      } else {
         return false;
      }
   }

   private void l6(com.aspose.slides.internal.x4g.x8 var1) {
      var1.n5(this.t4);
      this.t4 = var1;
   }

   private com.aspose.slides.internal.x4g.x8 y2() {
      com.aspose.slides.internal.x4g.x8 var1 = this.t4;
      this.t4 = this.t4.n5();
      return var1;
   }

   private boolean k5(com.aspose.slides.internal.x4g.x8 var1) {
      com.aspose.slides.internal.x4g.x8 var2 = this.t4;

      while (var2 != var1) {
         var2 = var2.n5();
         if (var2 == null) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void n5(com.aspose.slides.internal.x4g.t2 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("Value of 'container' cannot be null");
      }

      this.n5(var1.n5());
   }

   @Override
   public com.aspose.slides.internal.x4g.t2 n5() {
      return new com.aspose.slides.internal.x4g.t2(this.n5(com.aspose.slides.internal.x4g.m1.n5, true));
   }

   @Override
   public com.aspose.slides.internal.x4g.t2 n5(y1 var1, y1 var2, int var3) {
      m1 var4 = new m1(var2.y4(), new w1[]{new w1(var1.x8(), var1.n3()), new w1(var1.x8() + var1.s7(), var1.n3()), new w1(var1.x8(), var1.n3() + var1.k5())});
      float var5 = (float)com.aspose.slides.internal.r5w.n5.n5(2, var3, com.aspose.slides.internal.r5w.n5.n5(this.e2(), 2, 1.0));
      var4.n5(var5, var5);
      return new com.aspose.slides.internal.x4g.t2(this.n5(var4, true));
   }

   private com.aspose.slides.internal.x4g.x8 n5(m1 var1, boolean var2) {
      com.aspose.slides.internal.x4g.x8 var3 = new com.aspose.slides.internal.x4g.x8(this, var1, var2);
      this.l6(var3);
      return var3;
   }

   @Override
   public com.aspose.slides.internal.x4g.x8 l6() {
      return this.n5(com.aspose.slides.internal.x4g.m1.n5, false);
   }

   @Override
   public void n5(com.aspose.slides.internal.x4g.x8 var1) {
      if (this.k5(var1)) {
         com.aspose.slides.internal.x4g.x8 var2 = this.y2();

         while (var2 != var1) {
            var2 = this.y2();
         }

         var1.n5(this);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.u3 var1, w1[] var2, int var3, float var4) {
      com.aspose.slides.internal.x4g.s7 var5 = new com.aspose.slides.internal.x4g.s7(var3);
      var5.n5(var2, var4);
      this.n5(var1, var5);
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.u3 var1, y2 var2) {
      this.l6(var1, var2.s7(), var2.x8(), var2.t2(), var2.l6());
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.u3 var1, y1 var2) {
      this.l6(var1, var2.x8(), var2.n3(), var2.s7(), var2.k5());
   }

   public void l6(com.aspose.slides.internal.o9b.u3 var1, float var2, float var3, float var4, float var5) {
      com.aspose.slides.internal.x4g.s7 var6 = new com.aspose.slides.internal.x4g.s7();
      var6.n5(var2, var3, var4, var5);
      this.n5(var1, var6);
   }

   public void l6(com.aspose.slides.internal.o9b.u3 var1, int var2, int var3, int var4, int var5) {
      com.aspose.slides.internal.x4g.s7 var6 = new com.aspose.slides.internal.x4g.s7();
      var6.n5(var2, var3, var4, var5);
      this.n5(var1, var6);
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.u3 var1, com.aspose.slides.internal.x4g.s7 var2) {
      if (var1 == null) {
         throw new ArgumentNullException("Value of 'brush' cannot be null");
      }

      if (var2 == null) {
         throw new ArgumentNullException("Value of 'path' cannot be null");
      }

      this.q0.n5(var1, var2);
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.u3 var1, y2 var2, float var3, float var4) {
      this.n5(var1, var2.s7(), var2.x8(), var2.t2(), var2.l6(), var3, var4);
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.u3 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      com.aspose.slides.internal.x4g.s7 var8 = new com.aspose.slides.internal.x4g.s7();
      var8.l6(var2, var3, var4, var5, var6, var7);
      this.n5(var1, var8);
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.u3 var1, w1[] var2) {
      this.n5(var1, var2, 0);
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.u3 var1, j5[] var2, int var3) {
      com.aspose.slides.internal.x4g.s7 var4 = new com.aspose.slides.internal.x4g.s7(var3);
      var4.l6(var2);
      var4.n3();
      this.n5(var1, var4);
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.u3 var1, w1[] var2, int var3) {
      com.aspose.slides.internal.x4g.s7 var4 = new com.aspose.slides.internal.x4g.s7(var3);
      var4.l6(var2);
      var4.n3();
      this.n5(var1, var4);
   }

   @Override
   public void l6(com.aspose.slides.internal.o9b.u3 var1, y1 var2) {
      this.n5(var1, var2.x8(), var2.n3(), var2.s7(), var2.k5());
   }

   @Override
   public void l6(com.aspose.slides.internal.o9b.u3 var1, y2 var2) {
      this.n5(var1, var2.s7(), var2.x8(), var2.t2(), var2.l6());
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.u3 var1, int var2, int var3, int var4, int var5) {
      this.n5(var1, (float)var2, (float)var3, (float)var4, (float)var5);
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.u3 var1, float var2, float var3, float var4, float var5) {
      com.aspose.slides.internal.x4g.s7 var6 = new com.aspose.slides.internal.x4g.s7();
      var6.k5(var2, var3, var4, var5);
      this.n5(var1, var6);
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.u3 var1, y1[] var2) {
      if (var2 == null) {
         throw new ArgumentNullException("Value of 'rects' cannot be null");
      }

      if (var2.length == 0) {
         throw new ArgumentException("Value of 'rects' cannot be empty");
      }

      for (y1 var6 : var2) {
         com.aspose.slides.internal.x4g.s7 var7 = new com.aspose.slides.internal.x4g.s7();
         var7.l6(var6);
         this.n5(var1, var7);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.u3 var1, a0 var2) {
      this.n5(var1, com.aspose.slides.internal.x4g.s7.n5((Object)(var2)));
   }

   @Override
   public void k5() {
      this.t2(0);
   }

   public void t2(int var1) {
      if (this.l6 != null) {
         this.l6.a6().n5().flush();
      }
   }

   private void n5(Area var1) {
      this.n5(var1, 1);
   }

   @Override
   public void n5(a0 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("region");
      }

      if (!var1.k5(this)) {
         this.n5(var1.n5());
      }
   }

   @Override
   public a0[] n5(String var1, n3 var2, y1 var3, e5 var4) {
      if (var1 == null || var1.length() == 0) {
         return new a0[0];
      }

      if (var2 == null) {
         throw new ArgumentNullException("Value of 'font' cannot be null");
      }

      if (var4 == null) {
         throw new ArgumentException("Value of 'stringFormat' is invalid");
      }

      a0 var5 = new a0();
      if (var3.s7() <= 0.0) {
         if (var3.k5() < 0.0) {
            a0[] var32 = new a0[var4.t4().length];

            for (int var34 = 0; var34 < var4.t4().length; var34++) {
               var32[var34] = var5;
            }

            return var32;
         }

         var3.l6(var5.getBounds().width);
      }

      if (var3.k5() <= 0.0) {
         var3.n5(var5.getBounds().height);
      }

      com.aspose.slides.internal.o9b.u9[] var6 = var4.t4();
      if (var6 != null && var6.length != 0) {
         for (com.aspose.slides.internal.o9b.u9 var10 : var4.t4()) {
            if (var10.n5() + var10.l6() > var1.length() || var10.n5() < 0) {
               throw new ArgumentException("Value of 'stringFormat' is invalid");
            }
         }

         com.aspose.slides.internal.x4g.s7[] var33 = new com.aspose.slides.internal.x4g.s7[var6.length];

         for (int var35 = 0; var35 < var33.length; var35++) {
            var33[var35] = new com.aspose.slides.internal.x4g.s7();
         }

         n3 var36 = var2;
         var1 = com.aspose.slides.internal.f3l.k5.n5(var2.h0(), var1);
         var1 = com.aspose.slides.internal.f3l.k5.n5(var2, var1);
         var2 = com.aspose.slides.internal.f3l.k5.l6(var2, var1);
         String var38 = var2.h0();
         var2 = n5(var2);
         boolean var39 = !var38.equalsIgnoreCase(var2.h0());
         if (var39) {
            var2 = com.aspose.slides.internal.f3l.k5.n5(var2, var1, 1);
         }

         var1 = l6(var1);
         var1 = this.n5(var1);
         var2 = com.aspose.slides.internal.r5w.k5.n5(this, var2);
         var36 = com.aspose.slides.internal.r5w.k5.n5(this, var36);
         var2 = com.aspose.slides.internal.r5w.k5.n5(var2, var4, this.z3());
         com.aspose.slides.internal.o6x.u3 var11 = new com.aspose.slides.internal.o6x.u3(
            this, var1, var2, var36, this.z8().getFontRenderContext(), var4, var3.s7(), var3.k5(), true
         );

         for (com.aspose.slides.internal.o6x.l6 var12 = var11.c8(); var12 != null; var12 = var11.c8()) {
            for (int var13 = 0; var13 < var6.length; var13++) {
               int var14 = var6[var13].n5();
               int var15 = var6[var13].l6();
               if (var1.substring(var14, var14 + var15).contains("&") && var4.u3() != 0) {
                  var15--;
               }

               int var16 = var14 + var15;
               int var17 = var12.n5();
               if (var14 < var12.l6() && var16 > var17) {
                  float var18;
                  if (var14 > var17) {
                     var18 = var12.n5(var17, var14);
                  } else {
                     var18 = 0.0F;
                     var14 = var17;
                  }

                  float var19 = var16 < var12.l6() ? var12.n5(var14, var16) : var12.k5() - var18;
                  float var20 = var12.a6() + var12.u9();
                  float var21 = var12.h0();
                  float var22 = var12.c8();
                  if (var4.x8()) {
                     var22 += var18;
                     var21 -= var12.u9();
                  } else {
                     var21 += var18;
                     if (var4.l6() == 0) {
                        var22 -= var12.a6();
                     }
                  }

                  if (var12.u3() + var20 > var11.y4()) {
                     float var23 = var11.y4() - var12.u3();
                     if (var4.x8() && var4.t9()) {
                        var21 += var23;
                        var20 -= var23;
                     } else {
                        var20 = var23;
                     }
                  }

                  if (var4.x8()) {
                     var33[var13].k5((int)(var21 + var3.x8()), (int)(var22 + var3.n3()), (float)Math.ceil(var20), (float)Math.ceil(var19));
                  } else {
                     var33[var13].k5((int)(var21 + var3.x8()), (int)(var22 + var3.n3()), (float)Math.ceil(var19), (float)Math.ceil(var20));
                  }
               }
            }
         }

         AffineTransform var40 = var11.t9();
         if (var40 != null) {
            for (int var41 = 0; var41 < var33.length; var41++) {
               var33[var41].l6().n5(var40);
            }
         }

         a0[] var42 = new a0[var6.length];

         for (int var43 = 0; var43 < var42.length; var43++) {
            if (!(var3.s7() < 0.0F) && !(var3.k5() < 0.0F)) {
               var42[var43] = new a0(var33[var43]);
            } else {
               var42[var43] = this.u9();
            }
         }

         return var42;
      } else {
         return new a0[0];
      }
   }

   @Override
   public f2 n5(String var1, n3 var2) {
      return this.n5(var1, var2, (e5)null, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, (int[])null);
   }

   @Override
   public f2 n5(String var1, n3 var2, f2 var3, e5 var4) {
      return this.n5(var1, var2, var4, var3.l6(), var3.k5(), null);
   }

   @Override
   public f2 n5(String var1, n3 var2, int var3, e5 var4) {
      return this.n5(var1, var2, var4, var3, 2.1474836E9F, null);
   }

   @Override
   public f2 n5(String var1, n3 var2, w1 var3, e5 var4) {
      return this.n5(var1, var2, var4, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, null);
   }

   private f2 n5(String var1, n3 var2, e5 var3, float var4, float var5, int[] var6) {
      if (var1 == null || var1.isEmpty()) {
         return f2.n5.a6();
      }

      if (var2 == null) {
         throw new ArgumentNullException("font");
      }

      n3 var7 = var2;
      if (var4 <= 0.0F) {
         var4 = 2.1474836E9F;
      }

      if (var5 <= 0.0F) {
         var5 = 2.1474836E9F;
      }

      if (var6 != null) {
         var6[0] = 0;
         var6[1] = 0;
      }

      int var8 = this.z3();

      try {
         var1 = com.aspose.slides.internal.f3l.k5.n5(var2.h0(), var1);
         var1 = com.aspose.slides.internal.f3l.k5.n5(var2, var1);
         var2 = com.aspose.slides.internal.f3l.k5.l6(var2, var1);
         String var9 = var2.h0();
         var2 = n5(var2);
         boolean var10 = !var9.equalsIgnoreCase(var2.h0());
         if (var10) {
            var2 = com.aspose.slides.internal.f3l.k5.n5(var2, var1, 1);
         }

         var1 = l6(var1);
         var1 = this.n5(var1);
         var2 = com.aspose.slides.internal.r5w.k5.n5(this, var2);
         var7 = com.aspose.slides.internal.r5w.k5.n5(this, var7);
         var2 = com.aspose.slides.internal.r5w.k5.n5(var2, var3, this.z3());
         com.aspose.slides.internal.o6x.u3 var11 = new com.aspose.slides.internal.o6x.u3(
            this, var1, var2, var7, this.z8().getFontRenderContext(), var3, var4, var5, true
         );
         int var12 = var11.a6();
         float var13 = var11.u9();
         float var14 = var11.h0();
         if (var3 != null && var3.x8()) {
            float var15 = var14;
            var14 = var13;
            var13 = var15;
         }

         if (var6 != null) {
            var6[0] = var12;
            var6[1] = var11.u3();
         }

         if (var3 == null || !var3.e2()) {
            if (var13 > var4) {
               var13 = var4;
            }

            if (var14 > var5) {
               var14 = var5;
            }
         }

         return new f2(var13, var14);
      } finally {
         this.c8(var8);
      }
   }

   @Override
   public void n5(m1 var1) {
      this.n5(var1, 0);
   }

   @Override
   public void n5(m1 var1, int var2) {
      if (var1 == null) {
         throw new ArgumentNullException("Value of 'matrix' cannot be null");
      }

      if (!var1.k5()) {
         throw new ArgumentException("Value of 'matrix' is invalid");
      }

      this.n5(var1.t2(), var2);
      this.z1 = u3(this.m1());
   }

   @Override
   public void u3() {
      this.z1 = new AffineTransform();
      this.n5((Shape)null);
   }

   @Override
   public void a6() {
      this.y1().c8();
      this.z1 = new AffineTransform();
   }

   @Override
   public void n5(float var1, int var2) {
      AffineTransform var3 = AffineTransform.getRotateInstance(Math.toRadians(var1));
      this.n5(var3, var2);
      this.z1 = u3(this.m1());
   }

   @Override
   public void n5(float var1, float var2) {
      this.n5(var1, var2, 0);
   }

   @Override
   public void n5(float var1, float var2, int var3) {
      if (var1 != 0.0F && var2 != 0.0F) {
         AffineTransform var4 = AffineTransform.getScaleInstance(var1, var2);
         this.n5(var4, var3);
         this.z1 = u3(this.m1());
      } else {
         throw new ArgumentException("Value of 'sx' or 'sy' is invalid");
      }
   }

   @Override
   public void n5(y1 var1) {
      this.n5(var1.y4(), 0);
   }

   public void n5(com.aspose.slides.internal.x4g.s7 var1) {
      this.n5(var1, 0);
   }

   @Override
   public void l6(a0 var1) {
      this.n5(var1, 0);
   }

   @Override
   public void n5(y2 var1, int var2) {
      this.n5(y1.n5(var1), var2);
   }

   @Override
   public void n5(y1 var1, int var2) {
      java.awt.geom.Rectangle2D.Float var3 = y1.u9(var1.y4());
      if (var3.getWidth() < 0.0) {
         var3.x = var3.x + var3.width;
         var3.width = (float)q1.n5(var3.getWidth());
      }

      if (var3.getHeight() < 0.0) {
         var3.y = var3.y + var3.height;
         var3.height = (float)q1.n5(var3.getHeight());
      }

      this.n5(new Area(var3), var2);
   }

   @Override
   public void n5(a0 var1, int var2) {
      if (var1 == null) {
         throw new ArgumentNullException("region");
      }

      if (var1.k5(this)) {
         this.l6(var1, var2);
      } else {
         this.n5((Area)var1.n5().clone(), var2);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.x4g.s7 var1, int var2) {
      if (var1 == null) {
         throw new ArgumentNullException("path");
      }

      this.n5(new Area(com.aspose.slides.internal.c9b.l6.k5(var1.l6())), var2);
   }

   private void l6(a0 var1, int var2) {
      Area var3 = (Area)var1.n5().clone();
      boolean var4 = this.u9().k5(this);
      switch (var2) {
         case 0:
            this.n5((Shape)null);
            break;
         case 1:
            if (var4) {
               this.n5((Shape)null);
            } else {
               this.n5(var3, var2);
            }
            break;
         case 2:
            this.n5((Shape)null);
            break;
         case 3:
         case 4:
         case 5:
            this.n5(var3, var2);
            break;
         default:
            throw new ArgumentException();
      }
   }

   private void n5(Area var1, int var2) {
      Shape var3 = com.aspose.slides.internal.r5w.n5.n5(var1, this.m1().t2());
      var3 = com.aspose.slides.internal.r5w.n5.n5(var3, l6(this));
      var3 = com.aspose.slides.internal.r5w.n5.l6(var3);
      if (var2 == 0) {
         this.z1 = u3(this.m1());
         this.n5(var3);
      } else {
         Shape var4 = this.z8().getClip();
         Shape var5 = var4 == null ? new a0().n5() : var4;
         Area var6 = new Area(com.aspose.slides.internal.r5w.n5.l6(var5));
         Area var7 = new Area(var3);
         switch (var2) {
            case 1:
               var6.intersect(var7);
               this.n5((Shape)var6);
               break;
            case 2:
               var6.add(var7);
               this.n5((Shape)var6);
               break;
            case 3:
               var6.exclusiveOr(var7);
               this.n5((Shape)var6);
               break;
            case 4:
               var6.subtract(var7);
               this.n5((Shape)var6);
               break;
            case 5:
               var7.subtract(var6);
               this.n5((Shape)var7);
               this.z1 = u3(this.m1());
               break;
            default:
               throw new ArgumentException();
         }
      }
   }

   private static AffineTransform u3(m1 var0) {
      m1 var1 = var0.u9();
      var1.h0();
      return var1.t2();
   }

   private void n5(Shape var1) {
      if (var1 == null) {
         this.z8().setClip(null);
      } else {
         Shape var2 = com.aspose.slides.internal.r5w.n5.n5(var1);
         if (var2 instanceof Double) {
            Rectangle var3 = new a0().getBounds();
            Double var4 = (Double)var2;
            if (!(var4.getWidth() >= var3.width) && !(var4.getHeight() >= var3.height)) {
               this.z8().setClip(var4);
            } else {
               this.z8().setClip(null);
            }
         } else {
            this.z8().setClip(var1);
         }
      }
   }

   private static AffineTransform l6(z1 var0) {
      AffineTransform var1 = new AffineTransform();
      if (!com.aspose.slides.internal.r5w.n5.n5(var0.e2())) {
         AffineTransform var2 = new AffineTransform();
         var2.scale(var0.s7() / com.aspose.slides.internal.r5w.n5.u3(), var0.x8() / com.aspose.slides.internal.r5w.n5.a6());
         var1.concatenate(var2);
      }

      if (var0.e2() != 1) {
         AffineTransform var5 = new AffineTransform();
         var5.scale(var0.y4(), var0.y4());
         var1.concatenate(var5);
      }

      AffineTransform var6 = new AffineTransform();
      double var3 = com.aspose.slides.internal.r5w.n5.n5(var0.e2(), 1, 1.0);
      var6.scale(var3, var3);
      var1.concatenate(var6);
      return var1;
   }

   private static AffineTransform k5(z1 var0) {
      AffineTransform var1 = l6(var0);

      try {
         return var1.createInverse();
      } catch (NoninvertibleTransformException var3) {
         com.aspose.slides.internal.f8y.n5.l6(var3.getMessage());
         return new AffineTransform();
      }
   }

   @Override
   public void l6(float var1, float var2) {
      this.l6(var1, var2, 0);
   }

   @Override
   public void l6(float var1, float var2, int var3) {
      AffineTransform var4 = AffineTransform.getTranslateInstance(var1, var2);
      this.n5(var4, var3);
      this.z1 = u3(this.m1());
   }

   @Override
   public a0 u9() {
      Shape var1 = this.z8().getClip();
      if (var1 == null) {
         return new a0();
      } else {
         Area var2 = new Area(var1);
         if (var2.isEmpty()) {
            a0 var3 = new a0();
            var3.u3();
            return var3;
         } else {
            var2 = var2.createTransformedArea(k5(this));
            var2 = var2.createTransformedArea(this.z1);
            return this.l6(var2);
         }
      }
   }

   private a0 l6(Shape var1) {
      if (var1 == null) {
         return null;
      }

      com.aspose.slides.internal.x4g.s7 var2 = com.aspose.slides.internal.x4g.s7.n5((Object)(var1));
      return new a0(var2);
   }

   @Override
   public y1 h0() {
      Shape var1 = this.z8().getClip();
      Area var2;
      if (var1 == null) {
         var2 = new a0().n5();
      } else {
         var2 = new Area(var1.getBounds2D());
      }

      var2 = var2.createTransformedArea(k5(this));
      Area var3 = new Area(var2).createTransformedArea(u3(this.m1()));
      Rectangle2D var4 = var3.getBounds2D();
      double var5 = var4.getX();
      double var7 = var4.getY();
      double var9 = var4.getWidth();
      double var11 = var4.getHeight();
      return new y1((float)var5, (float)var7, (float)var9, (float)var11);
   }

   @Override
   public int c8() {
      return this.u9.n5();
   }

   @Override
   public void n5(int var1) {
      this.u9.n5(var1);
   }

   @Override
   public int t2() {
      return this.u9.l6();
   }

   @Override
   public void l6(int var1) {
      this.u9.l6(var1);
      RenderingHints var2 = this.z8().getRenderingHints();
      switch (var1) {
         case 0:
         case 1:
         case 4:
            var2.put(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_SPEED);
            break;
         case 2:
         case 3:
            var2.put(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
      }

      this.z8().setRenderingHints(var2);
   }

   @Override
   public float s7() {
      return this.k5;
   }

   @Override
   public float x8() {
      return this.u3;
   }

   @Override
   public int n3() {
      return this.h0;
   }

   @Override
   public void k5(int var1) {
      this.h0 = var1;
      RenderingHints var2 = this.z8().getRenderingHints();
      switch (var1) {
         case -1:
         default:
            throw new ArgumentException();
         case 0:
         case 1:
         case 3:
         case 6:
            var2.put(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            break;
         case 2:
         case 4:
         case 7:
            var2.put(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);
            break;
         case 5:
            var2.put(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR);
      }

      this.z8().setRenderingHints(var2);
   }

   @Override
   public float y4() {
      return this.c8;
   }

   @Override
   public void n5(float var1) {
      if (var1 <= 0.0F) {
         throw new ArgumentException("PageScale property's value can not be less or equal to zero");
      }

      this.c8 = var1;
   }

   @Override
   public int e2() {
      return this.t2;
   }

   @Override
   public void u3(int var1) {
      if (var1 == 0) {
         throw new ArgumentException("Bad argument", "value");
      }

      this.t2 = var1;
   }

   @Override
   public int t9() {
      return this.s7;
   }

   @Override
   public void a6(int var1) {
      this.s7 = var1;
   }

   @Override
   public j5 z1() {
      return this.x8;
   }

   @Override
   public void n5(j5 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("Argument cannot be null");
      }

      this.x8 = var1;
   }

   @Override
   public int t4() {
      RenderingHints var1 = this.z8().getRenderingHints();
      if (var1.containsKey(RenderingHints.KEY_ANTIALIASING)) {
         Object var2 = var1.get(RenderingHints.KEY_ANTIALIASING);
         if (var2 == RenderingHints.VALUE_ANTIALIAS_ON) {
            if (var1.containsKey(RenderingHints.KEY_RENDERING)) {
               Object var3 = var1.get(RenderingHints.KEY_RENDERING);
               if (var3 == RenderingHints.VALUE_RENDER_QUALITY) {
                  return 4;
               }

               if (var3 == RenderingHints.VALUE_RENDER_SPEED) {
                  return 3;
               }
            }

            return 4;
         }

         if (var2 == RenderingHints.VALUE_ANTIALIAS_DEFAULT) {
            return 3;
         }
      }

      return 3;
   }

   @Override
   public void u9(int var1) {
      this.n3 = var1;
      RenderingHints var2 = this.z8().getRenderingHints();
      switch (var1) {
         case -1:
         default:
            throw new ArgumentException("Invalid parameter used.");
         case 0:
         case 1:
         case 3:
            var2.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_SPEED);
            var2.put(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
            break;
         case 2:
         case 4:
            var2.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
            var2.put(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      }

      this.z8().setRenderingHints(var2);
   }

   @Override
   public int q0() {
      return this.y4;
   }

   @Override
   public void h0(int var1) {
      if (var1 >= 0 && var1 <= 12) {
         this.y4 = var1;
      } else {
         throw new ArgumentException();
      }
   }

   @Override
   public int z3() {
      return this.e2;
   }

   @Override
   public void c8(int var1) {
      this.e2 = var1;
      RenderingHints var2 = this.z8().getRenderingHints();
      switch (var1) {
         case 0:
            var2.put(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            var2.put(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
            break;
         case 1:
            var2.put(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
            var2.put(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
            break;
         case 2:
            var2.put(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            var2.put(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
            break;
         case 3:
            var2.put(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
            var2.put(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
            break;
         case 4:
            var2.put(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            var2.put(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
            break;
         case 5:
            var2.put(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            var2.put(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
      }

      this.z8().setRenderingHints(var2);
   }

   @Override
   public m1 m1() {
      return this.y1().u9();
   }

   @Override
   public void l6(m1 var1) {
      if (var1 == null) {
         throw new NullPointerException("Value of 'value' cannot be null");
      }

      if (!var1.k5()) {
         throw new ArgumentException("Value of 'value' is invalid");
      }

      var1.n5(this.y1());
      this.z1 = u3(this.m1());
   }

   @Override
   public Shape m3() {
      return this.a6;
   }

   private static String l6(String var0) {
      return var0.replaceAll("\u0000", "");
   }

   private static n3 n5(n3 var0) {
      return com.aspose.slides.internal.r5w.k5.n5(var0) ? new n3("Times New Roman", var0.c8(), var0.x8(), var0.y4(), var0.k5(), var0.u3()) : var0;
   }

   public void n5(y4 var1, w1[] var2, y1 var3, int var4, z1$n5 var5) {
      byte var6 = 2;
      y1 var7 = com.aspose.slides.internal.r5w.n5.n5(var4, 2, var3);
      m1 var8 = new m1(var7, var2);
      if (var8.k5() && !java.lang.Double.isNaN(var8.t2().getDeterminant())) {
         AffineTransform var9 = var8.t2();
         AffineTransform var10 = this.n5(var1, var4);
         if (var10 != null) {
            var9.concatenate(var10);
         }

         a0 var11 = this.u9();
         com.aspose.slides.internal.x4g.s7 var12 = this.n5(var2);
         this.n5(var12);
         this.n5(var1, var5, var9);
         this.l6(var11);
      }
   }

   private void n5(y4 var1, z1$n5 var2, AffineTransform var3) {
      AffineTransform var4 = this.z8().getTransform();
      float var5 = this.k5;
      float var6 = this.u3;

      try {
         var3.preConcatenate(this.t9.t2());
         if (var4 != null) {
            var3.preConcatenate(var4);
         }

         this.z8().setTransform(var3);
         com.aspose.slides.internal.m5l.k5 var7 = var1.k5();
         int var8 = var7.u9();
         if (var8 == 4 || var8 == 5) {
            com.aspose.slides.internal.m5l.n5 var9 = (com.aspose.slides.internal.m5l.n5)var7;
            this.k5 = var9.k5();
            this.u3 = var9.u3();
         }

         try {
            IEnumerator var20 = var1.n5(this);
            int var10 = 0;

            while (var20.hasNext()) {
               var10++;
               com.aspose.slides.internal.m5l.l6 var11 = (com.aspose.slides.internal.m5l.l6)var20.next();
               var2.n5(var1, var11, this, null);
            }
         } finally {
            var1.l6(this);
         }
      } finally {
         this.k5 = var5;
         this.u3 = var6;
         this.z8().setTransform(var4);
      }
   }

   @Override
   public boolean equals(Object obj) {
      return n5(this, obj);
   }

   public static boolean n5(x8 var0, Object var1) {
      if (var0 == var1) {
         return true;
      }

      if (var1 == null) {
         return false;
      }

      if (!(var1 instanceof x8)) {
         return false;
      }

      x8 var2 = (x8)var1;
      if (var0.z8().getClip() == null) {
         if (var2.z8().getClip() != null) {
            return false;
         }
      } else if (!var0.z8().getClip().equals(var2.z8().getClip())) {
         com.aspose.slides.internal.x4g.s7 var3 = com.aspose.slides.internal.x4g.s7.n5((Object)(var0.z8().getClip()));
         com.aspose.slides.internal.x4g.s7 var4 = com.aspose.slides.internal.x4g.s7.n5((Object)(var2.z8().getClip()));
         if (!Arrays.equals(var3.a6(), var4.a6())) {
            return false;
         }
      }

      if (var0.t2() != var2.t2()) {
         return false;
      }

      if (var0.h0 == null) {
         if (var2.h0 != null) {
            return false;
         }
      } else if (!var0.h0.equals(var2.h0)) {
         return false;
      }

      if (var0.n5 == null) {
         if (var2.n5 != null) {
            return false;
         }
      } else if (!var0.n5.equals(var2.n5)) {
         return false;
      }

      if (var0.t4 == null) {
         if (var2.t4 != null) {
            return false;
         }
      } else if (!var0.t4.equals(var2.t4)) {
         return false;
      }

      if (Float.floatToIntBits(var0.c8) != Float.floatToIntBits(var2.c8)) {
         return false;
      }

      if (var0.t2 != var2.t2) {
         return false;
      }

      if (var0.s7 != var2.s7) {
         return false;
      }

      if (var0.x8 == null) {
         if (var2.x8 != null) {
            return false;
         }
      } else if (!var0.x8.equals(var2.x8)) {
         return false;
      }

      if (var0.y4 != var2.y4) {
         return false;
      }

      if (var0.e2 != var2.e2) {
         return false;
      }

      if (var0.t9 == null) {
         if (var2.t9 != null) {
            return false;
         }
      } else if (!var0.t9.equals(var2.t9)) {
         return false;
      }

      if (var0.a6 == null) {
         if (var2.a6 != null) {
            return false;
         }
      } else if (!var0.a6.equals(var2.a6)) {
         return false;
      }

      return true;
   }

   private void n5(AffineTransform var1, int var2) {
      AffineTransform var3 = this.y1().t2();
      com.aspose.slides.internal.x4g.m1.n5(var3, var1, var2);
   }

   private AffineTransform n5(y4 var1, int var2) {
      if (var2 != 2) {
         float var3 = this.s7() / var1.c8();
         float var4 = this.x8() / var1.y4();
         return AffineTransform.getScaleInstance(var3, var4);
      } else {
         return null;
      }
   }

   private com.aspose.slides.internal.x4g.s7 n5(w1[] var1) {
      w1 var2 = new w1((var1[1].l6() + var1[2].l6()) / 2.0F, (var1[1].k5() + var1[2].k5()) / 2.0F);
      return new com.aspose.slides.internal.x4g.s7(
         new w1[]{var1[0], var1[1], new w1(2.0F * var2.l6() - var1[0].l6(), 2.0F * var2.k5() - var1[0].k5()), var1[2]}, new byte[]{0, 1, 1, 1}
      );
   }

   private m1 y1() {
      return this.t9;
   }

   public AffineTransform j5() {
      return com.aspose.slides.internal.r5w.n5.n5(this.m1().t2(), this.e2(), this.y4());
   }

   public m1 w1() {
      m1 var1 = this.m1();
      float var2 = com.aspose.slides.internal.r5w.n5.n5(2, this.e2(), this.x8());
      if (Math.abs(var2 - 1.0F) > 0.001 && !com.aspose.slides.internal.r5w.n5.n5(this.e2())) {
         float var3 = com.aspose.slides.internal.r5w.n5.n5(2, this.e2(), this.s7());
         float var4 = com.aspose.slides.internal.r5w.n5.n5(2, this.e2(), this.x8());
         this.n5(new m1(var3, 0.0F, 0.0F, var4, 0.0F, 0.0F), 1);
      }

      return var1;
   }

   public boolean r4() {
      return this.t9() != 4 && this.t9() != 2;
   }

   public boolean c4() {
      return this.n3 == 4 || this.n3 == 2;
   }

   public static x8 n5(com.aspose.slides.internal.o9b.l6 var0) {
      return new x8(var0);
   }

   public static x8 l6(Graphics2D var0) {
      com.aspose.slides.internal.o9b.l6 var1 = new com.aspose.slides.internal.o9b.l6(1, 1);
      x8 var2 = new x8(var1);
      var2.n5 = var0;
      return var2;
   }
}
