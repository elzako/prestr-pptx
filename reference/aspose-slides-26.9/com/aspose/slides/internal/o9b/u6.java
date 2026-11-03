package com.aspose.slides.internal.o9b;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidEnumArgumentException;
import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.internal.j9e.t2$n5;
import java.awt.Image;
import java.awt.Paint;
import java.awt.PaintContext;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public final class u6 extends u3 {
   private final y1 l6 = new y1();
   private l6 k5 = null;
   private l6 u3 = null;
   private boolean a6 = true;
   private int u9;
   private com.aspose.slides.internal.j9e.t2 h0 = null;
   private int c8 = 0;

   public u6(t4 var1) {
      this(var1, 0);
   }

   public u6(t4 var1, int var2) {
      this(var1, var2, n5(var1));
   }

   public u6(t4 var1, y1 var2) {
      this(var1, 0, var2.y4());
   }

   public u6(t4 var1, y1 var2, com.aspose.slides.internal.j9e.t2 var3) {
      this(var1, var3 != null ? 4 : 0, var2.y4(), var3);
   }

   public u6(t4 var1, int var2, y2 var3) {
      this(var1, var2, new y1(var3.s7(), var3.x8(), var3.t2(), var3.l6()));
   }

   public u6(t4 var1, int var2, y1 var3) {
      this(var1, var2, var3, null);
   }

   private u6(t4 var1, int var2, y1 var3, com.aspose.slides.internal.j9e.t2 var4) {
      if (var1 == null) {
         throw new ArgumentNullException("image");
      }

      if (var3 == null) {
         throw new ArgumentNullException("image");
      }

      if (var3.u3() || !n5(var1).l6(var3)) {
         throw new OutOfMemoryException("Out of memory");
      }

      if (!com.aspose.slides.ms.System.d5.isDefined(com.aspose.slides.internal.x4g.c4.class, var2)) {
         throw new InvalidEnumArgumentException("wrapMode");
      }

      var3.a6(this.l6);
      if (var1 instanceof l6) {
         this.k5 = ((l6)var1).n5(y2.l6(var3));
      } else {
         if (!(var1 instanceof com.aspose.slides.internal.j9e.y4)) {
            throw new IllegalArgumentException("Image neither Bitmap nor Metafile");
         }

         this.k5 = this.n5((com.aspose.slides.internal.j9e.y4)var1, y2.l6(var3));
      }

      this.u9 = var2;
      this.h0 = var4;
   }

   @Override
   public Paint n5() {
      this.t9();
      return this;
   }

   @Override
   public PaintContext createContext(ColorModel cm, Rectangle deviceBounds, Rectangle2D userBounds, AffineTransform xform, RenderingHints hints) {
      if (this.k5().k5()) {
         com.aspose.slides.internal.x4g.m1.n5(xform, this.k5().t2(), 1);
      }

      RenderingHints var6 = this.a6 ? this.x8() : hints;
      this.y4();
      return this.t2() == 4 ? this.n5(cm, deviceBounds, userBounds, xform, var6) : this.n5(this.u3, cm, deviceBounds, userBounds, xform, var6);
   }

   private RenderingHints x8() {
      z1 var1 = z1.n5(new l6(1, 1));
      return var1.z8().getRenderingHints();
   }

   @Override
   public int getTransparency() {
      return this.a6() ? 1 : 3;
   }

   public t4 h0() {
      this.t9();
      return (t4)this.k5.deepClone();
   }

   public com.aspose.slides.internal.x4g.m1 c8() {
      this.t9();
      return this.k5();
   }

   public void k5(com.aspose.slides.internal.x4g.m1 var1) {
      this.t9();
      this.n5(var1);
   }

   public int t2() {
      this.t9();
      return this.u9;
   }

   public void n5(int var1) {
      this.t9();
      if (!com.aspose.slides.ms.System.d5.isDefined(com.aspose.slides.internal.x4g.c4.class, var1)) {
         throw new InvalidEnumArgumentException("wrapMode");
      }

      this.u9 = var1;
   }

   @Override
   public Object deepClone() {
      this.t9();
      u6 var1 = (u6)this.l6();
      if (this.k5 != null) {
         var1.k5 = (l6)this.k5.deepClone();
      }

      return var1;
   }

   public void u3(com.aspose.slides.internal.x4g.m1 var1) {
      this.t9();
      super.l6(var1);
   }

   public void l6(com.aspose.slides.internal.x4g.m1 var1, int var2) {
      this.t9();
      if (var1 == null) {
         throw new ArgumentNullException("Value of 'matrix' cannot be null");
      }

      if (!var1.k5()) {
         throw new ArgumentException("Value of 'matrix' is invalid");
      }

      com.aspose.slides.internal.x4g.m1 var3 = this.k5();
      com.aspose.slides.internal.x4g.m1 var4 = var1.u9();
      if (var2 == 0) {
         var4.t2().concatenate(var3.t2());
         super.n5(var4);
      } else {
         var3.t2().preConcatenate(var4.t2());
         super.n5(var3);
      }
   }

   public void l6(float var1, int var2) {
      this.t9();
      super.n5(var1, var2);
   }

   public void k5(float var1, float var2) {
      this.t9();
      super.l6(var1, var2);
   }

   public void k5(float var1, float var2, int var3) {
      this.t9();
      super.l6(var1, var2, var3);
   }

   public void u3(float var1, float var2) {
      this.t9();
      super.n5(var1, var2);
   }

   public void u3(float var1, float var2, int var3) {
      this.t9();
      super.n5(var1, var2, var3);
   }

   @Override
   public void dispose() {
      this.k5 = null;
      this.u9();
   }

   public p8 s7() {
      return this.k5.n3();
   }

   public void l6(int var1) {
      this.c8 = var1;
   }

   private int n3() {
      return this.c8;
   }

   public void l6(boolean var1) {
      this.a6 = var1;
   }

   private void y4() {
      if (this.u3 == null) {
         if (this.u9 != 0) {
            this.u3 = this.n5(this.k5, this.u9, this.l6);
         } else {
            this.u3 = (l6)this.k5.deepClone();
         }

         this.e2();
      }
   }

   private l6 n5(l6 var1, int var2, y1 var3) {
      l6 var4 = null;
      z1 var5 = null;
      int var6 = (int)var3.s7();
      int var7 = (int)var3.k5();
      switch (var2) {
         case 1:
            if (var6 != 1) {
               var6 *= 2;
            }

            var4 = new l6(var6, var7, true);
            var5 = z1.n5(var4);
            this.n5(var5, var1, new com.aspose.slides.internal.x4g.m1());
            if (var6 != 1) {
               this.n5(var5, var1, new com.aspose.slides.internal.x4g.m1(-1.0F, 0.0F, 0.0F, 1.0F, var6, 0.0F));
            }
            break;
         case 2:
            if (var7 != 1) {
               var7 *= 2;
            }

            var4 = new l6(var6, var7, true);
            var5 = z1.n5(var4);
            this.n5(var5, var1, new com.aspose.slides.internal.x4g.m1());
            if (var7 != 1) {
               this.n5(var5, var1, new com.aspose.slides.internal.x4g.m1(1.0F, 0.0F, 0.0F, -1.0F, 0.0F, var7));
            }
            break;
         case 3:
            if (var6 != 1) {
               var6 *= 2;
            }

            if (var7 != 1) {
               var7 *= 2;
            }

            var4 = new l6(var6, var7, true);
            var5 = z1.n5(var4);
            this.n5(var5, var1, new com.aspose.slides.internal.x4g.m1());
            if (var6 != 1) {
               this.n5(var5, var1, new com.aspose.slides.internal.x4g.m1(-1.0F, 0.0F, 0.0F, 1.0F, var6, 0.0F));
            }

            if (var7 != 1) {
               this.n5(var5, var1, new com.aspose.slides.internal.x4g.m1(1.0F, 0.0F, 0.0F, -1.0F, 0.0F, var7));
            }

            if (var6 != 1 && var7 != 1) {
               this.n5(var5, var1, new com.aspose.slides.internal.x4g.m1(-1.0F, 0.0F, 0.0F, -1.0F, var6, var7));
            }
            break;
         default:
            var4 = var1;
      }

      return var4;
   }

   private void n5(z1 var1, t4 var2, com.aspose.slides.internal.x4g.m1 var3) {
      new com.aspose.slides.internal.r5w.u3((com.aspose.slides.internal.r5w.x8)var1).n5(var2, var3, false);
   }

   private void e2() {
      if (this.h0 != null) {
         t2$n5 var1 = this.h0.n5(1);
         if (var1 != null) {
            com.aspose.slides.internal.j9e.k5 var2 = var1.n5;
            if (var2 != null) {
               BufferedImage var3 = (BufferedImage)this.u3.a6().n5();

               for (int var4 = 0; var4 < var3.getWidth(); var4++) {
                  for (int var5 = 0; var5 < var3.getHeight(); var5++) {
                     int var6 = var3.getRGB(var4, var5);
                     int var7 = var6 >> 24 & 0xFF;
                     int var8 = var6 >> 16 & 0xFF;
                     int var9 = var6 >> 8 & 0xFF;
                     int var10 = var6 >> 0 & 0xFF;
                     float var11 = 1.0F;
                     var8 = (int)(Math.abs(var2.n5() * var11) * var8 > 255.0F ? 255.0F : var8 * Math.abs(var2.n5() * var11));
                     var9 = (int)(Math.abs(var2.u9() * var11) * var9 > 255.0F ? 255.0F : var9 * Math.abs(var2.u9() * var11));
                     var10 = (int)(Math.abs(var2.x8() * var11) * var10 > 255.0F ? 255.0F : var10 * Math.abs(var2.x8() * var11));
                     var7 = (int)(Math.abs(var2.z1() * var11) * var7 > 255.0F ? 255.0F : var7 * Math.abs(var2.z1() * var11));
                     var8 = (int)(Math.abs(var2.t4() * var11) + var8 > 255.0F ? 255.0F : var8 + Math.abs(var2.t4() * var11));
                     var9 = (int)(Math.abs(var2.q0() * var11) + var9 > 255.0F ? 255.0F : var9 + Math.abs(var2.q0() * var11));
                     var10 = (int)(Math.abs(var2.z3() * var11) + var10 > 255.0F ? 255.0F : var10 + Math.abs(var2.z3() * var11));
                     var7 = (int)(Math.abs(var2.m1() * var11) + var7 > 255.0F ? 255.0F : var7 + Math.abs(var2.m1() * var11));
                     var6 = (var7 & 0xFF) << 24 | (var8 & 0xFF) << 16 | (var9 & 0xFF) << 8 | (var10 & 0xFF) << 0;
                     var3.setRGB(var4, var5, var6);
                  }
               }
            }
         }
      }
   }

   private PaintContext n5(l6 var1, ColorModel var2, Rectangle var3, Rectangle2D var4, AffineTransform var5, RenderingHints var6) {
      return new com.aspose.slides.internal.p5g.l6((BufferedImage)var1.a6().n5(), new Double(0.0, 0.0, var1.e2(), var1.h0()))
         .createContext(var2, var3, var4, var5, var6);
   }

   private PaintContext n5(ColorModel var1, Rectangle var2, Rectangle2D var3, AffineTransform var4, RenderingHints var5) {
      int var6 = (int)Math.ceil(var2.getMaxX());
      int var7 = (int)Math.ceil(var2.getMaxY());
      if (var6 >= 1 && var7 >= 1) {
         long var8 = (long)var6 * var7;
         if (var8 < 2147483647L) {
            l6 var15 = new l6(var6, var7, true);
            z1 var16 = z1.n5(var15);
            if (this.n3() == 4) {
               var16.a6(this.n3());
            }

            new com.aspose.slides.internal.r5w.u3((com.aspose.slides.internal.r5w.x8)var16).n5(this.u3, com.aspose.slides.internal.x4g.m1.n5(var4), true);
            return this.n5(var15, var1, var2, var3, new AffineTransform(), var5);
         } else {
            com.aspose.slides.internal.x4g.m1 var10 = com.aspose.slides.internal.x4g.m1.n5(var4);
            PaintContext var11 = this.n5(this.u3, var1, var2, var3, var4, var5);
            if (var4.getShearX() == 0.0 && var4.getShearY() == 0.0) {
               j5 var17 = new j5(0, 0);
               j5 var13 = new j5(this.k5.e2(), this.k5.h0());
               var10.n5(new j5[]{var17, var13});
               y2 var14 = y2.n5(var17.n5(), var17.l6(), var13.n5(), var13.l6());
               return new c4(var14, var11);
            } else {
               com.aspose.slides.internal.x4g.s7 var12 = new com.aspose.slides.internal.x4g.s7();
               var12.k5(0.0F, 0.0F, this.k5.e2(), this.k5.h0());
               var12.l6(var10);
               return new h0(var12, var11);
            }
         }
      } else {
         return new x8();
      }
   }

   private void t9() {
      if (this.a6()) {
         throw new ArgumentException("TextureBrush object already disposed.");
      }
   }

   private static y1 n5(t4 var0) {
      if (var0 == null) {
         throw new ArgumentNullException("image");
      } else if (var0 instanceof com.aspose.slides.internal.j9e.y4) {
         Image var1 = ((com.aspose.slides.internal.j9e.y4)var0).a6().n5();
         return new y1(0.0F, 0.0F, var1.getWidth(null), var1.getHeight(null));
      } else {
         return new y1(0.0F, 0.0F, var0.e2(), var0.h0());
      }
   }

   private l6 n5(com.aspose.slides.internal.j9e.y4 var1, y2 var2) {
      BufferedImage var3 = (BufferedImage)var1.a6().n5();
      BufferedImage var4 = com.aspose.slides.internal.t5g.u3.n5(var3, var2.s7(), var2.x8(), var2.t2(), var2.l6());
      com.aspose.slides.internal.j9e.z3 var5 = new com.aspose.slides.internal.j9e.z3(
         var4,
         null,
         com.aspose.slides.internal.j9e.x8.t2(),
         com.aspose.slides.internal.r5w.n5.n5(),
         com.aspose.slides.internal.r5w.n5.n5(),
         com.aspose.slides.internal.j9e.c8.l6()
      );
      return new l6(var5);
   }
}
