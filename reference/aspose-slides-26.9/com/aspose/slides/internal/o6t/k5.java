package com.aspose.slides.internal.o6t;

import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.u4k.z3;
import com.aspose.slides.internal.x4g.m1;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.GeneralPath;
import java.awt.geom.NoninvertibleTransformException;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D.Float;
import java.awt.geom.Rectangle2D.Double;
import java.awt.image.BufferedImage;
import java.awt.image.RasterFormatException;
import java.awt.image.RenderedImage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public abstract class k5 {
   static final Object[] n5 = new Object[]{
      new com.aspose.slides.internal.c4t.s7(Color.WHITE),
      new com.aspose.slides.internal.c4t.s7(Color.LIGHT_GRAY),
      new com.aspose.slides.internal.c4t.s7(Color.GRAY),
      new com.aspose.slides.internal.c4t.s7(Color.DARK_GRAY),
      new com.aspose.slides.internal.c4t.s7(Color.BLACK),
      new com.aspose.slides.internal.c4t.s7(null),
      new com.aspose.slides.internal.c4t.t2(com.aspose.slides.internal.c4t.t2.n5(0, 0), Color.WHITE),
      new com.aspose.slides.internal.c4t.t2(com.aspose.slides.internal.c4t.t2.n5(0, 0), Color.BLACK),
      new com.aspose.slides.internal.c4t.t2(com.aspose.slides.internal.c4t.t2.n5(5, 0), null),
      null,
      new com.aspose.slides.internal.d2n.l6("Tahoma", 0, 12),
      new com.aspose.slides.internal.d2n.l6("Tahoma", 0, 12),
      new com.aspose.slides.internal.d2n.l6("Tahoma", 0, 12),
      new com.aspose.slides.internal.d2n.l6("Tahoma", 1, 12),
      new com.aspose.slides.internal.d2n.l6("Tahoma", 0, 12),
      null,
      new com.aspose.slides.internal.d2n.l6("Tahoma", 0, 12),
      new com.aspose.slides.internal.d2n.l6("Tahoma", 0, 12),
      null,
      null
   };
   static final String[] l6 = new String[]{"Wingdings", "Wingdings 1", "Wingdings 2", "Symbol", "Webdings", "MT Extra"};
   public static final Composite k5 = new com.aspose.slides.internal.u4k.q0(new u3());
   public static final Composite u3 = new com.aspose.slides.internal.u4k.q0(new t2());
   public static final Composite a6 = new com.aspose.slides.internal.u4k.q0(new s7());
   public static final Composite u9 = new com.aspose.slides.internal.u4k.q0(new x8());
   public static final Composite h0 = new com.aspose.slides.internal.u4k.q0(new n3());
   public static final Composite c8 = new com.aspose.slides.internal.u4k.q0(new y4());
   public static final Composite t2 = new com.aspose.slides.internal.u4k.q0(new e2());
   public static final Composite s7 = new com.aspose.slides.internal.u4k.q0(new t9());
   public static final Composite x8 = new com.aspose.slides.internal.u4k.q0(new z1());
   public static final Composite n3 = new com.aspose.slides.internal.u4k.q0(new a6());
   public static final Composite y4 = new com.aspose.slides.internal.u4k.q0(new u9());
   public static final Composite e2 = new com.aspose.slides.internal.u4k.q0(new h0());
   public static final Composite t9 = new com.aspose.slides.internal.u4k.q0(new c8());
   public static final Composite z1 = AlphaComposite.SrcOver;
   public static final Composite t4 = null;
   private static final Composite[] v4 = new Composite[]{null, null, a6, s7, u3, h0, n3, c8, x8, u9, y4, t9, k5, z1, e2, t2, null};
   private static final boolean[] u6 = new boolean[]{false, false, true, true, false, true, true, true, true, true, true, false, true, false, true, true, true};
   static byte[][] q0 = new byte[][]{
      {114, 51, -77, 86, -46, -66, 13, -33, -100, 34, 90, -50, 90, -83, -60, -68, 33, -117, 118, 56, 30, -11, 51, 109, -7, -110, 78, 117, -36, -30, -106, 117},
      {116, 51, -79, 86, -46, -66, 4, -33, -112, 34, 95, -50, 78, -83, -99, -68, 112, -117, 105, 56, 77, -11, 96, 109, -80, -110},
      {23, 51},
      {25, 51},
      {
            116,
            51,
            -84,
            86,
            -38,
            -66,
            9,
            -33,
            -114,
            34,
            85,
            -50,
            65,
            -83,
            -42,
            -68,
            59,
            -117,
            35,
            56,
            66,
            -11,
            126,
            109,
            -8,
            -110,
            74,
            117,
            -33,
            -30,
            -52,
            117,
            0,
            -21
      },
      {23, 51, -31, 86, -9, -66, 3, -33, -102, 34, 82, -50, 89, -83, -100, -68, 87, -117, 83, 56, 93, -11, 37, 109, -108, -110, 116, 117, -39, -30, -117, 117}
   };
   private static Map<String, Boolean> t1 = new HashMap<>();
   public List<com.aspose.slides.internal.c4t.t9> z3 = null;
   t4 m1 = new t4();
   Stack<t4> k7 = new Stack<>();
   Point m3 = new Point(0, 0);
   boolean z8;
   ArrayList<Object> j5;
   Object w1;
   Object r4;
   Object c4;
   Object y2;
   double y1;
   double a0;
   float d2 = 1.0F;
   Dimension d5;
   Dimension s3;
   boolean p8 = false;
   com.aspose.slides.internal.l1b.u3 f2;
   private Collection<com.aspose.slides.internal.m5l.l6> a5;
   private int h2 = 0;
   private int v0 = 0;
   private com.aspose.slides.internal.l1b.l6 f0 = null;
   private Composite[] a3 = null;
   protected AffineTransform i1 = new AffineTransform();
   protected AffineTransform e5;
   protected AffineTransform b3;
   protected Graphics2D o0;
   protected com.aspose.slides.internal.o9b.z1 z7;
   private n5 p3;
   private com.aspose.slides.internal.x4g.x8 x9;

   protected k5(com.aspose.slides.internal.o9b.z1 var1, m1 var2) {
      if (var1.k7() != null) {
         this.i1.concatenate(var1.k7().t2());
      }

      if (var2 != null) {
         this.i1.preConcatenate(var2.t2());
      }

      this.z7 = var1;
      this.o0 = var1.z8();
      this.x9 = new com.aspose.slides.internal.x4g.x8(this.z7, com.aspose.slides.internal.x4g.m1.n5, false);
      this.p3 = new n5(this.z7.z8(), this.i1);
      this.z7.l6(com.aspose.slides.internal.x4g.m1.n5(this.i1));
      this.z7.k5(com.aspose.slides.internal.x4g.m1.n5.u9());
      this.e5 = new AffineTransform(this.i1);
      this.b3 = new AffineTransform();
      if (this.i1.getShearX() == 0.0 && this.i1.getShearY() == 0.0) {
         this.o0.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_DEFAULT);
      }

      this.j5 = new ArrayList<>();
      if (this.o0 instanceof com.aspose.slides.internal.g1p.n5) {
         this.z3 = new ArrayList<>();
      }

      Object var3 = this.o0.getRenderingHint(com.aspose.slides.internal.l1b.l6.n5);
      if (var3 != null) {
         if (var3 instanceof com.aspose.slides.internal.l1b.l6) {
            this.f0 = (com.aspose.slides.internal.l1b.l6)var3;
         } else if (var3 instanceof Map) {
            try {
               this.f0 = new com.aspose.slides.internal.l1b.l6((Map)var3);
            } catch (com.aspose.slides.internal.p7x.l6 var7) {
               this.f0 = null;
            }
         }
      }

      if (this.f0 == null) {
         this.f0 = new com.aspose.slides.internal.l1b.l6(1);
      }

      this.a3 = (Composite[])v4.clone();
      this.a3[1] = new z3(this.k5(Color.black));
      this.a3[16] = new z3(this.k5(Color.white));
      this.f2 = com.aspose.slides.internal.l1b.u3.e2;
      Object var4 = this.o0.getRenderingHint(com.aspose.slides.internal.l1b.u3.n5);
      if (var4 != null && var4 instanceof com.aspose.slides.internal.l1b.u3) {
         this.f2 = (com.aspose.slides.internal.l1b.u3)var4;
      }

      if (System.getProperty("os.name").indexOf("win") >= 0) {
         this.y2 = RenderingHints.VALUE_TEXT_ANTIALIAS_GASP;
      } else {
         this.y2 = RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB;
      }

      RenderingHints var5 = this.o0.getRenderingHints();
      this.w1 = var5.get(RenderingHints.KEY_ANTIALIASING);
      if (this.w1 == null) {
         this.w1 = RenderingHints.VALUE_ANTIALIAS_ON;
      }

      this.r4 = var5.get(RenderingHints.KEY_TEXT_ANTIALIASING);
      if (this.r4 == null) {
         this.r4 = RenderingHints.VALUE_TEXT_ANTIALIAS_DEFAULT;
      }

      this.c4 = var5.get(RenderingHints.KEY_TEXT_LCD_CONTRAST);
      int var6 = Integer.MIN_VALUE;
      this.t4(var6 | 0);
      this.t4(var6 | 7);
      this.t4(var6 | 13);
      this.n5(Color.WHITE);
      this.l6(Color.BLACK);
      this.o0.setComposite(z1);
   }

   private static double k5(double var0) {
      if (var0 < 0.0) {
         return -1.0;
      } else {
         return var0 > 0.0 ? 1.0 : 0.0;
      }
   }

   public void u3() {
      this.x9.n5(this.z7);
      this.p3.n5(this.z7.z8());
   }

   public void a6() {
      this.k7.push(this.m1);
      this.m1 = (t4)this.m1.clone();
   }

   public void u9(int var1) {
      this.h2 = 0;
      this.v0 = 0;

      while (var1++ < 0 && !this.k7.isEmpty()) {
         this.m1 = this.k7.pop();
      }

      this.e2();
   }

   public void n5(AffineTransform var1, int var2) {
      AffineTransform var3 = null;
      switch (var2) {
         case 1:
            var3 = new AffineTransform();
            break;
         case 2:
            if (this.m1.q0 != null) {
               var3 = (AffineTransform)this.m1.q0.clone();
               var3.concatenate(var1);
            } else {
               var3 = (AffineTransform)var1.clone();
            }
            break;
         case 3:
            var3 = (AffineTransform)var1.clone();
            if (this.m1.q0 != null) {
               var3.concatenate(this.m1.q0);
            }
            break;
         default:
            var3 = (AffineTransform)var1.clone();
      }

      this.l6(var3);
   }

   void n5(int var1, int var2) {
      this.m1.z3.setLocation(var1, var2);
      this.a0();
   }

   public void l6(int var1, int var2) {
      this.n5(this.m1.z3.x + var1, this.m1.z3.y + var2);
   }

   void k5(int var1, int var2) {
      this.m1.m1.setLocation(var1, var2);
      this.a0();
   }

   public void u3(int var1, int var2) {
      this.k5(this.m1.m1.x + var1, this.m1.m1.y + var2);
   }

   public void n5(Point var1) {
      this.m1.z3.setLocation(var1);
      this.a0();
   }

   public void n5(Dimension var1) {
      this.m1.z3.setSize(var1);
      this.a0();
   }

   public void l6(Point var1) {
      this.m1.m1.setLocation(var1);
      this.a0();
   }

   public void l6(Dimension var1) {
      this.m1.m1.setSize(var1);
      this.a0();
   }

   public void n5(int var1, int var2, int var3, int var4) {
      this.n5(this.m1.z3, var1, var2, var3, var4);
      this.d5();
      this.a0();
   }

   public void l6(int var1, int var2, int var3, int var4) {
      this.n5(this.m1.m1, var1, var2, var3, var4);
      this.d5();
      this.a0();
   }

   public void h0(int var1) {
      if (var1 != this.m1.u9 && !this.p8) {
         switch (var1) {
            case 7:
               this.m1.m1.setSize(this.d5.width, -this.d5.height);
               this.m1.z3.setSize(this.s3.width * 10, this.s3.height * 10);
               break;
            case 8:
               this.m1.m1.setSize(1, 1);
               this.m1.z3.setSize(1, 1);
         }
      }

      this.m1.u9 = var1;
      this.d5();
      this.a0();
   }

   public void n5(AffineTransform var1) {
      if (var1 != null) {
         this.l6((AffineTransform)var1.clone());
      } else {
         this.l6(new AffineTransform());
      }
   }

   public void n5(Shape var1) {
      this.t2(var1);
   }

   public void n5(Shape var1, int var2) throws com.aspose.slides.internal.p7x.l6 {
      if (this.m1.z1 != null) {
         this.l6(this.m1.z1.createTransformedShape(var1), var2);
      } else {
         this.l6(var1, var2);
      }
   }

   public void l6(Shape var1, int var2) throws com.aspose.slides.internal.p7x.l6 {
      Shape var3 = this.m1.j5;
      switch (var2) {
         case 1:
            if (var3 != null) {
               if (var1 == null) {
                  return;
               }

               Area var7 = new Area(var3);
               var7.intersect(new Area(var1));
               this.t2(var7);
            } else {
               this.t2(var1);
            }
            break;
         case 2:
            if (var3 != null) {
               if (var1 == null) {
                  this.t2(null);
                  return;
               }

               Area var6 = new Area(var3);
               var6.add(new Area(var1));
               this.t2(var6);
            }
            break;
         case 3:
            if (var3 == null) {
               var3 = new Rectangle(new Point(0, 0), this.d5);
            }

            if (var1 == null) {
               var1 = new Rectangle(new Point(0, 0), this.d5);
            }

            Area var5 = new Area(var3);
            var5.exclusiveOr(new Area(var1));
            this.t2(var5);
            break;
         case 4:
            if (var3 == null) {
               var3 = new Rectangle(new Point(0, 0), this.d5);
            }

            if (var1 == null) {
               var1 = new Rectangle(new Point(0, 0), this.d5);
            }

            Area var4 = new Area(var3);
            var4.subtract(new Area(var1));
            this.t2(var4);
            break;
         case 5:
            this.t2(var1);
            break;
         default:
            throw new com.aspose.slides.internal.p7x.l6("Unknown region operation");
      }
   }

   public void c8(int var1) throws com.aspose.slides.internal.p7x.l6 {
      if (this.m1.n5 != null) {
         this.l6(this.m1.n5, var1);
         this.m1.n5 = null;
      }
   }

   public void a6(int var1, int var2) {
      if (this.m1.j5 != null) {
         Shape var3 = AffineTransform.getTranslateInstance(var1, var2).createTransformedShape(this.m1.j5);
         this.t2(var3);
      }
   }

   public void t2(int var1) {
      this.m1.k7 = var1 == 2;
      this.h2 = 0;
   }

   public void s7(int var1) {
      this.m1.c8 = var1;
   }

   public void n5(Color var1) {
      this.m1.e2 = this.k5(var1);
      this.h2 = 0;
   }

   public void l6(Color var1) {
      this.m1.t9 = this.k5(var1);
      if (this.h2 == 4) {
         this.h2 = 0;
      }
   }

   public void x8(int var1) {
      this.m1.t2 = var1;
   }

   public void n3(int var1) {
      this.m1.s7 = var1;
   }

   public void n5(float var1) {
      if (var1 < 1.0F) {
         var1 = 1.0F;
      }

      if (var1 > 100.0F) {
         var1 = 100.0F;
      }

      this.m1.w1 = var1;
   }

   Shape u9() {
      if (this.m1.z1 != null) {
         try {
            return this.m1.z1.createInverse().createTransformedShape(this.m1.n5);
         } catch (NoninvertibleTransformException var2) {
         }
      }

      return this.m1.n5;
   }

   public void h0() {
      if (this.m1.n5 != null) {
         this.s7(this.u9());
      }
   }

   public void c8() {
      if (this.m1.n5 != null) {
         this.c4();
         this.x8(this.u9());
      }
   }

   public void t2() {
      if (this.m1.n5 != null) {
         try {
            GeneralPath var1 = new GeneralPath(this.m1.n5.getWindingRule());
            Rectangle var2 = this.m1.n5.getBounds();
            double var3 = (var2.getWidth() + var2.getHeight()) / 1000.0;
            PathIterator var5 = this.m1.n5.getPathIterator(null, var3);
            var1.append(var5, false);
            this.m1.n5 = var1;
         } catch (Exception var6) {
         }
      }
   }

   void u9(int var1, int var2) {
      if (this.m1.z1 != null) {
         Float var3 = new Float(var1, var2);
         this.m1.z1.transform(var3, var3);
         this.m1.n5.moveTo(var3.x, var3.y);
      } else {
         this.m1.n5.moveTo(var1, var2);
      }
   }

   void h0(int var1, int var2) {
      if (this.m1.z1 != null) {
         Float var3 = new Float(var1, var2);
         this.m1.z1.transform(var3, var3);
         this.m1.n5.lineTo(var3.x, var3.y);
      } else {
         this.m1.n5.lineTo(var1, var2);
      }
   }

   void n5(Point[] var1) {
      Point2D var2 = this.m1.n5.getCurrentPoint();
      if (this.m1.z1 != null) {
         Point2D[] var3 = new Point2D[var1.length];
         this.m1.z1.transform(var1, 0, var3, 0, var1.length);
         this.m1.n5.moveTo((float)var3[0].getX(), (float)var3[0].getY());

         for (int var4 = 1; var4 < var3.length; var4++) {
            this.m1.n5.lineTo((float)var3[0].getX(), (float)var3[0].getY());
         }
      } else {
         this.m1.n5.moveTo(var1[0].x, var1[0].y);

         for (int var5 = 1; var5 < var1.length; var5++) {
            this.m1.n5.lineTo(var1[var5].x, var1[var5].y);
         }
      }

      if (var2 != null) {
         this.m1.n5.moveTo((float)var2.getX(), (float)var2.getY());
      }
   }

   void n5(Point[] var1, int var2, int var3) {
      if (this.m1.z1 != null) {
         Point2D[] var4 = new Point2D[var1.length];
         this.m1.z1.transform(var1, 0, var4, 0, var1.length);

         for (int var5 = var2; var5 < var3; var5++) {
            this.m1.n5.lineTo((float)var4[var5].getX(), (float)var4[var5].getY());
         }
      } else {
         for (int var6 = var2; var6 < var3; var6++) {
            this.m1.n5.lineTo(var1[var6].x, var1[var6].y);
         }
      }

      if (var2 < var3) {
         this.x8(var1[var3 - 1].x, var1[var3 - 1].y);
      }
   }

   void l6(Point[] var1) {
      Point2D var2 = this.m1.n5.getCurrentPoint();
      if (this.m1.z1 != null) {
         Point2D[] var3 = new Point2D[var1.length];
         this.m1.z1.transform(var1, 0, var3, 0, var1.length);
         this.m1.n5.moveTo((float)var3[0].getX(), (float)var3[0].getY());

         for (int var4 = 1; var4 < var1.length; var4 += 3) {
            this.m1
               .n5
               .curveTo(
                  (float)var3[var4].getX(),
                  (float)var3[var4].getY(),
                  (float)var3[var4 + 1].getX(),
                  (float)var3[var4 + 1].getY(),
                  (float)var3[var4 + 2].getX(),
                  (float)var3[var4 + 2].getY()
               );
         }
      } else {
         this.m1.n5.moveTo(var1[0].x, var1[0].y);

         for (int var5 = 1; var5 < var1.length; var5 += 3) {
            this.m1.n5.curveTo(var1[var5].x, var1[var5].y, var1[var5 + 1].x, var1[var5 + 1].y, var1[var5 + 2].x, var1[var5 + 2].y);
         }
      }

      if (var2 != null) {
         this.m1.n5.moveTo((float)var2.getX(), (float)var2.getY());
      }
   }

   void l6(Point[] var1, int var2, int var3) {
      if (this.m1.z1 != null) {
         Point2D[] var4 = new Point2D[var1.length];
         this.m1.z1.transform(var1, 0, var4, 0, var1.length);

         for (int var5 = var2; var5 < var3; var5 += 3) {
            this.m1
               .n5
               .curveTo(
                  (float)var4[var5].getX(),
                  (float)var4[var5].getY(),
                  (float)var4[var5 + 1].getX(),
                  (float)var4[var5 + 1].getY(),
                  (float)var4[var5 + 2].getX(),
                  (float)var4[var5 + 2].getY()
               );
         }
      } else {
         for (int var6 = var2; var6 < var3; var6 += 3) {
            this.m1.n5.curveTo(var1[var6].x, var1[var6].y, var1[var6 + 1].x, var1[var6 + 1].y, var1[var6 + 2].x, var1[var6 + 2].y);
         }
      }

      if (var2 < var3) {
         this.x8(var1[var3 - 1].x, var1[var3 - 1].y);
      }
   }

   void l6(Shape var1) {
      Point2D var2 = this.m1.n5.getCurrentPoint();
      if (this.m1.z1 != null) {
         var1 = this.m1.z1.createTransformedShape(var1);
      }

      this.m1.n5.append(var1, false);
      if (var2 != null) {
         this.m1.n5.moveTo((float)var2.getX(), (float)var2.getY());
      }
   }

   void k5(Shape var1) {
      if (this.m1.z1 != null) {
         var1 = this.m1.z1.createTransformedShape(var1);
      }

      this.m1.n5.append(var1, true);
      Point2D var2 = this.m1.n5.getCurrentPoint();
      if (this.m1.z1 != null) {
         try {
            this.m1.z1.inverseTransform(var2, var2);
         } catch (NoninvertibleTransformException var4) {
         }
      }

      this.c8((int)var2.getX(), (int)var2.getY());
   }

   void n5(Point[][] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         Point[] var3 = var1[var2];
         if (var3 != null && var3.length >= 1) {
            if (this.m1.z1 != null) {
               Float[] var8 = new Float[var3.length];
               this.m1.z1.transform(var3, 0, var8, 0, var3.length);
               this.m1.n5.moveTo((float)var8[0].getX(), (float)var8[0].getY());

               for (int var5 = 1; var5 < var3.length; var5++) {
                  this.m1.n5.lineTo((float)var8[var5].getX(), (float)var8[var5].getY());
               }

               this.m1.n5.closePath();
            } else {
               this.m1.n5.moveTo(var3[0].x, var3[0].y);

               for (int var4 = 1; var4 < var3.length; var4++) {
                  this.m1.n5.lineTo(var3[var4].x, var3[var4].y);
               }

               this.m1.n5.closePath();
            }
         }
      }

      Point2D var7 = this.m1.n5.getCurrentPoint();
      if (var7 != null) {
         if (this.m1.z1 != null) {
            try {
               this.m1.z1.inverseTransform(var7, var7);
            } catch (NoninvertibleTransformException var6) {
            }
         }

         this.x8((int)var7.getX(), (int)var7.getY());
      }
   }

   public void c8(int var1, int var2) {
      if (this.z8) {
         this.u9(var1, var2);
      }

      this.x8(var1, var2);
   }

   public void t2(int var1, int var2) {
      if (this.z8) {
         this.h0(var1, var2);
      } else {
         this.s7(new java.awt.geom.Line2D.Float(this.z8(), this.j5(), var1, var2));
      }

      this.x8(var1, var2);
   }

   public void s7() {
      if (this.z8) {
         try {
            this.m1.n5.closePath();
         } catch (Exception var2) {
         }
      }
   }

   public void x8() {
      this.z8 = true;
      this.m1.n5 = new GeneralPath(this.m1.n5());
      this.m1.n5.moveTo(0.0F, 0.0F);
   }

   public void n3() {
      this.z8 = false;
      this.m1.n5 = null;
   }

   public void y4() {
      this.z8 = false;
   }

   public void k5(Point[] var1) {
      if (var1.length >= 2) {
         if (this.z8) {
            this.n5(var1);
         } else {
            GeneralPath var2 = new GeneralPath(this.m1.n5());
            var2.moveTo(var1[0].x, var1[0].y);

            for (int var3 = 1; var3 < var1.length; var3++) {
               Point var4 = var1[var3];
               var2.lineTo(var4.x, var4.y);
            }

            this.c8(var1[var1.length - 1].x, var1[var1.length - 1].y);
            this.s7(var2);
         }
      }
   }

   public void k5(Point[] var1, int var2, int var3) {
      int var4 = var2 + var3;
      if (var4 > var1.length) {
         var4 = var1.length;
      }

      if (this.z8) {
         this.n5(var1, var2, var4);
      } else {
         GeneralPath var5 = new GeneralPath(this.m1.n5());
         var5.lineTo(this.z8(), this.j5());

         for (int var6 = var2; var6 < var4; var6++) {
            Point var7 = var1[var6];
            var5.lineTo(var7.x, var7.y);
         }

         this.c8(var1[var4 - 1].x, var1[var4 - 1].y);
         this.s7(var5);
      }
   }

   public void l6(Point[][] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         this.k5(var1[var2]);
      }
   }

   public void u3(Point[] var1) {
      this.k5(var1, 0, var1.length);
   }

   public void a6(Point[] var1) {
      if (var1.length >= 4) {
         if (this.z8) {
            this.l6(var1);
         } else {
            GeneralPath var2 = new GeneralPath(this.m1.n5());
            var2.moveTo(var1[0].x, var1[0].y);

            for (int var3 = 1; var3 < var1.length; var3 += 3) {
               Point var4 = var1[var3];
               Point var5 = var1[var3 + 1];
               Point var6 = var1[var3 + 2];
               var2.curveTo(var4.x, var4.y, var5.x, var5.y, var6.x, var6.y);
            }

            this.c8(var1[var1.length - 1].x, var1[var1.length - 1].y);
            this.s7(var2);
         }
      }
   }

   public void u3(Point[] var1, int var2, int var3) {
      int var4 = var2 + var3 * 3;
      if (var4 > var1.length) {
         var4 = var1.length - var2;
         var4 -= var4 % 3;
      }

      if (this.z8) {
         this.l6(var1, var2, var4);
      } else {
         GeneralPath var5 = new GeneralPath(this.m1.n5());
         var5.moveTo(this.z8(), this.j5());

         for (int var6 = var2; var6 < var4; var6 += 3) {
            Point var7 = var1[var6];
            Point var8 = var1[var6 + 1];
            Point var9 = var1[var6 + 2];
            var5.curveTo(var7.x, var7.y, var8.x, var8.y, var9.x, var9.y);
            this.x8(var9.x, var9.y);
         }

         this.s7(var5);
      }
   }

   public void u9(Point[] var1) {
      this.u3(var1, 0, var1.length / 3);
   }

   public void u3(Shape var1) {
      if (this.z8) {
         this.l6(var1);
      } else {
         this.s7(var1);
      }
   }

   public void a6(Shape var1) {
      if (this.z8) {
         this.k5(var1);
      } else {
         this.s7(var1);
         PathIterator var2 = var1.getPathIterator(null);
         if (var2.isDone()) {
            return;
         }

         float var3 = this.z8();
         float var4 = this.j5();
         float[] var5 = new float[6];

         while (!var2.isDone()) {
            switch (var2.currentSegment(var5)) {
               case 0:
               case 1:
                  var3 = var5[0];
                  var4 = var5[1];
                  break;
               case 2:
                  var3 = var5[2];
                  var4 = var5[3];
                  break;
               case 3:
                  var3 = var5[4];
                  var4 = var5[5];
            }
         }

         this.x8((int)var3, (int)var4);
      }
   }

   public void u9(Shape var1) {
      if (!this.z8) {
         this.c4();
         this.x8(var1);
      }
   }

   public void n5(Composite var1, Shape var2) {
      this.c4();
      Composite var3 = this.o0.getComposite();
      this.o0.setComposite(var1);
      this.x8(var2);
      this.o0.setComposite(var3);
   }

   public void k5(Point[][] var1) {
      if (this.z8) {
         this.n5(var1);
      } else {
         GeneralPath var2 = new GeneralPath(this.m1.n5());

         for (int var3 = 0; var3 < var1.length; var3++) {
            Point[] var4 = var1[var3];
            if (var4 != null && var4.length >= 1) {
               var2.moveTo(var4[0].x, var4[0].y);

               for (int var5 = 1; var5 < var4.length; var5++) {
                  var2.lineTo(var4[var5].x, var4[var5].y);
               }

               var2.closePath();
            }
         }

         Point2D var6 = var2.getCurrentPoint();
         if (var6 != null) {
            this.x8((int)var6.getX(), (int)var6.getY());
         }

         this.c4();
         this.x8(var2);
         this.s7(var2);
      }
   }

   public void h0(Point[] var1) {
      Point[][] var2 = new Point[][]{var1};
      this.k5(var2);
   }

   private void c8(Shape var1) {
      Stroke var2 = this.o0.getStroke();
      this.r4();
      if (this.m1.l6.n5()) {
         this.o0.draw(var1);
      } else {
         AffineTransform var3 = this.m1.z1 != null ? this.m1.z1 : new AffineTransform();
         boolean var4 = (var3.getType() & 64) != 0;
         if (var4 && var1 instanceof Rectangle) {
            Rectangle var5 = (Rectangle)((Rectangle)var1).clone();
            if (var3.getScaleX() < 0.0) {
               var5.x = var5.x + var5.width;
               var5.width = -var5.width;
            }

            if (var3.getScaleY() < 0.0) {
               var5.y = var5.y + var5.height;
               var5.height = -var5.height;
            }

            var1 = var5;
         }

         Shape var7 = var3.createTransformedShape(var1);
         AffineTransform var6 = this.o0.getTransform();
         this.o0.setTransform(this.e5);
         this.o0.draw(var7);
         this.o0.setTransform(var6);
         if (this.h2 == 1 && !(this.o0.getStroke() instanceof BasicStroke)) {
            this.o0.setStroke(var2);
         }
      }
   }

   public void u3(Point[][] var1) {
      if (this.z8) {
         this.n5(var1);
      } else {
         GeneralPath var2 = new GeneralPath(this.m1.n5());

         for (int var3 = 0; var3 < var1.length; var3++) {
            Point[] var4 = var1[var3];
            if (var4 != null && var4.length >= 1) {
               var2.moveTo(var4[0].x, var4[0].y);

               for (int var5 = 1; var5 < var4.length; var5++) {
                  var2.lineTo(var4[var5].x, var4[var5].y);
               }

               var2.closePath();
            }
         }

         Point2D var6 = var2.getCurrentPoint();
         if (var6 != null) {
            this.x8((int)var6.getX(), (int)var6.getY());
         }

         this.c4();
         this.x8(var2);
         this.c8(var2);
      }
   }

   public void c8(Point[] var1) {
      Point[][] var2 = new Point[][]{var1};
      this.u3(var2);
   }

   public void n5(RenderedImage var1, AffineTransform var2) {
      this.o0.drawRenderedImage(var1, var2);
   }

   public void n5(Composite var1) {
      this.o0.setComposite(var1);
   }

   public void n5(RenderedImage var1, Point2D[] var2, Point2D[] var3) {
      com.aspose.slides.internal.c4t.x8 var4 = new com.aspose.slides.internal.c4t.x8(3);
      com.aspose.slides.internal.c4t.x8 var5 = new com.aspose.slides.internal.c4t.x8(3);
      double var6 = var3[0].getX();
      double var8 = var3[0].getY();
      var4.n5[0][0] = var6;
      var4.n5[0][1] = var8;
      var4.n5[0][2] = 1.0;
      var4.l6[0] = var2[0].getX();
      var5.n5[0][0] = var6;
      var5.n5[0][1] = var8;
      var5.n5[0][2] = 1.0;
      var5.l6[0] = var2[0].getY();
      var6 = var3[1].getX();
      var8 = var3[1].getY();
      var4.n5[1][0] = var6;
      var4.n5[1][1] = var8;
      var4.n5[1][2] = 1.0;
      var4.l6[1] = var2[1].getX();
      var5.n5[1][0] = var6;
      var5.n5[1][1] = var8;
      var5.n5[1][2] = 1.0;
      var5.l6[1] = var2[1].getY();
      var6 = var3[2].getX();
      var8 = var3[2].getY();
      var4.n5[2][0] = var6;
      var4.n5[2][1] = var8;
      var4.n5[2][2] = 1.0;
      var4.l6[2] = var2[2].getX();
      var5.n5[2][0] = var6;
      var5.n5[2][1] = var8;
      var5.n5[2][2] = 1.0;
      var5.l6[2] = var2[2].getY();

      try {
         var4.n5();
         var5.n5();
         AffineTransform var10 = new AffineTransform(var4.l6[0], var5.l6[0], var4.l6[1], var5.l6[1], var4.l6[2], var5.l6[2]);
         this.o0.drawRenderedImage(var1, var10);
      } catch (com.aspose.slides.internal.p7x.n5 var11) {
      }
   }

   public void n5(int var1, BufferedImage var2, Rectangle var3, Rectangle var4) {
      int var5 = var1 >> 16;
      BufferedImage var6 = null;
      Composite var7 = this.o0.getComposite();
      switch (var5) {
         case 0:
         case 255:
            Paint var25 = this.o0.getPaint();
            this.o0.setComposite(z1);
            this.o0.setPaint(this.k5(var5 == 0 ? Color.BLACK : Color.WHITE));
            this.o0.fill(var3);
            this.o0.setPaint(var25);
            break;
         case 17:
            this.o0.setComposite(a6);
            var6 = var2;
            break;
         case 51:
            this.o0.setComposite(u3);
            var6 = var2;
            break;
         case 68:
            this.o0.setComposite(h0);
            var6 = var2;
            break;
         case 85:
            Paint var8 = this.o0.getPaint();
            this.o0.setComposite(c8);
            this.o0.setPaint(Color.WHITE);
            this.o0.fill(var3);
            this.o0.setPaint(var8);
            break;
         case 90:
            this.n5(c8, var3);
            break;
         case 102:
            this.o0.setComposite(c8);
            var6 = var2;
            break;
         case 136:
            this.o0.setComposite(u9);
            var6 = var2;
            break;
         case 192:
            this.n5(z1, var3);
            this.o0.setComposite(u9);
         case 187:
            this.o0.setComposite(k5);
            var6 = var2;
            break;
         case 204:
         default:
            this.o0.setComposite(z1);
            var6 = var2;
            break;
         case 238:
            this.o0.setComposite(t2);
            var6 = var2;
            break;
         case 240:
            this.n5(z1, var3);
            break;
         case 251:
            this.n5(t2, var3);
            this.o0.setComposite(k5);
            var6 = var2;
      }

      if (var6 != null) {
         try {
            Object[] var26 = this.n5(var6, var3, var4);
            var6 = (BufferedImage)var26[0];
            var3 = (Rectangle)var26[1];
            if (var6 != null) {
               double var9 = 1.0;
               double var11 = 1.0;
               AffineTransform var13 = AffineTransform.getTranslateInstance(var3.x * var9, var3.y * var11);
               var13.scale(var3.getWidth() / var6.getWidth(), var3.getHeight() / var6.getHeight());

               try {
                  this.o0.drawRenderedImage(var6, var13);
               } catch (RasterFormatException var21) {
                  if (!var21.getMessage().equals("(x + width) is outside of Raster")) {
                     throw var21;
                  }

                  Shape var15 = this.o0.getClip();
                  this.h0(this.o0.getClipBounds());

                  try {
                     this.o0.drawRenderedImage(var6, var13);
                  } finally {
                     this.h0(var15);
                  }
               }
            }
         } catch (Exception var22) {
         }
      }

      this.o0.setComposite(var7);
   }

   Object[] n5(BufferedImage var1, Rectangle var2, Rectangle var3) {
      float var4 = 0.0F;
      float var5 = 0.0F;
      float var6 = 0.0F;
      float var7 = 0.0F;
      Dimension var8 = new Dimension(var1.getWidth(), var1.getHeight());
      if (var3 != null) {
         int var9 = var3.x;
         int var10 = var3.x + var3.width;
         int var11 = var3.y;
         int var12 = var3.y + var3.height;
         if (var9 >= var8.width || var11 >= var8.height || var10 < 0 || var12 < 0) {
            return new Object[]{null, null};
         }

         if (var9 < 0) {
            var4 = (float)(-var9 / var3.getWidth());
            var9 = 0;
         }

         if (var11 < 0) {
            var6 = (float)(-var9 / var3.getHeight());
            var9 = 0;
         }

         if (var10 > var8.width) {
            var5 = (float)((var10 - var8.width) / var3.getWidth());
            var10 = var8.width;
         }

         if (var12 > var8.height) {
            var7 = (float)((var12 - var8.height) / var3.getHeight());
            var10 = var8.width;
         }

         var3 = new Rectangle(var9, var11, var10 - var9, var12 - var11);
      }

      if (var4 + var5 + var6 + var7 > 1.0E-6) {
         var2 = new Rectangle(
            (int)(var2.x + var4 * var2.width + 0.5),
            (int)(var2.y + var6 * var2.height + 0.5),
            (int)(var2.width - (var4 + var5) * var2.width + 0.5),
            (int)(var2.height - (var6 + var7) * var2.height + 0.5)
         );
      }

      return var3 == null || var3.x == 0 && var3.y == 0 && var3.width >= var8.width && var3.height >= var8.height
         ? new Object[]{var1, var2}
         : new Object[]{var1.getSubimage(var3.x, var3.y, var3.width, var3.height), var2};
   }

   public void y4(int var1) {
      if (var1 != 2) {
         var1 = 1;
      }

      this.m1.h0 = var1;
   }

   public void e2(int var1) {
      this.m1.x8 = var1;
   }

   private void n5() {
      if (this.m1.x8 > 0 && this.m1.x8 < this.a3.length) {
         this.o0.setComposite(this.a3[this.m1.x8]);
         if (u6[this.m1.x8]) {
            this.o0.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
            this.o0.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
         } else if (this.m1.u3.c8()) {
            this.o0.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
         } else if (this.m1.u3.s7()) {
            this.o0.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
            if (this.c4 == null) {
               this.o0.setRenderingHint(RenderingHints.KEY_TEXT_LCD_CONTRAST, 140);
            } else {
               this.o0.setRenderingHint(RenderingHints.KEY_TEXT_LCD_CONTRAST, this.c4);
            }
         } else if (this.m1.u3.t2()) {
            if (this.c4 == null) {
               this.o0.setRenderingHint(RenderingHints.KEY_TEXT_LCD_CONTRAST, 140);
            } else {
               this.o0.setRenderingHint(RenderingHints.KEY_TEXT_LCD_CONTRAST, this.c4);
            }

            this.o0.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
         } else {
            this.o0.setRenderingHint(RenderingHints.KEY_ANTIALIASING, this.w1);
            this.o0.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, this.r4);
            if (this.c4 != null) {
               this.o0.setRenderingHint(RenderingHints.KEY_TEXT_LCD_CONTRAST, this.c4);
            }
         }
      } else {
         this.o0.setComposite(z1);
         this.o0.setRenderingHint(RenderingHints.KEY_ANTIALIASING, this.w1);
         this.o0.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, this.r4);
         if (this.c4 != null) {
            this.o0.setRenderingHint(RenderingHints.KEY_TEXT_LCD_CONTRAST, this.c4);
         }
      }
   }

   private void l6() {
      if (this.m1.x8 > 0 && this.m1.x8 < this.a3.length) {
         this.o0.setComposite(z1);
         if (u6[this.m1.x8]) {
            this.o0.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
            this.o0.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
         } else if (this.m1.u3.c8()) {
            this.o0.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
         } else if (this.m1.u3.s7()) {
            this.o0.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
            if (this.c4 == null) {
               this.o0.setRenderingHint(RenderingHints.KEY_TEXT_LCD_CONTRAST, 140);
            } else {
               this.o0.setRenderingHint(RenderingHints.KEY_TEXT_LCD_CONTRAST, this.c4);
            }
         } else if (this.m1.u3.t2()) {
            if (this.c4 == null) {
               this.o0.setRenderingHint(RenderingHints.KEY_TEXT_LCD_CONTRAST, 140);
            } else {
               this.o0.setRenderingHint(RenderingHints.KEY_TEXT_LCD_CONTRAST, this.c4);
            }

            this.o0.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
         } else {
            this.o0.setRenderingHint(RenderingHints.KEY_ANTIALIASING, this.w1);
            this.o0.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, this.r4);
            if (this.c4 != null) {
               this.o0.setRenderingHint(RenderingHints.KEY_TEXT_LCD_CONTRAST, this.c4);
            }
         }
      } else {
         this.o0.setComposite(z1);
         this.o0.setRenderingHint(RenderingHints.KEY_ANTIALIASING, this.w1);
         this.o0.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, this.r4);
         if (this.c4 != null) {
            this.o0.setRenderingHint(RenderingHints.KEY_TEXT_LCD_CONTRAST, this.c4);
         }
      }
   }

   private String k5() {
      if (this.a5 != null) {
         for (com.aspose.slides.internal.m5l.l6 var2 : this.a5) {
            if (var2 instanceof com.aspose.slides.internal.x4a.l6) {
               com.aspose.slides.internal.x4a.l6 var3 = (com.aspose.slides.internal.x4a.l6)var2;
               String var4 = var3.n5(this);
               if (var4 != null) {
                  return var4;
               }
            }
         }
      }

      return com.aspose.slides.internal.o9b.y4.k5().a6();
   }

   public void n5(com.aspose.slides.internal.m5l.k5 var1, com.aspose.slides.internal.c4t.n3 var2, int var3, float var4, float var5) {
      this.n5(var1, new com.aspose.slides.internal.c4t.n3[]{var2}, var3, var4, var5);
   }

   public void n5(com.aspose.slides.internal.m5l.k5 var1, com.aspose.slides.internal.c4t.n3[] var2, int var3, float var4, float var5) {
      if (var2 != null) {
         String var6 = this.m1.u3 != null ? this.m1.u3.n5() : null;
         boolean var7 = false;
         if (var6 != null) {
            for (int var8 = 0; var8 < l6.length; var8++) {
               if (l6[var8].compareToIgnoreCase(var6) == 0) {
                  var7 = true;
                  break;
               }
            }
         }

         int var45 = this.p8 ? 2 : var3;
         if (var1.a6()
            && var1 instanceof com.aspose.slides.internal.m5l.u3
            && ((com.aspose.slides.internal.m5l.u3)var1).u3()
            && this.m1.u3.l6() != 2
            && this.n5(var6)) {
            var7 = false;
            Font var9 = var45 == 2 ? this.m1.u3.u3() : this.m1.u3.k5();
            Font var10 = com.aspose.slides.internal.o9b.n3.n5(this.k5(), var9.getSize(), var9.getStyle()).z1();
            Font var11 = var10.deriveFont(var9.getStyle(), var9.getSize());
            com.aspose.slides.internal.d2n.u3 var12 = new com.aspose.slides.internal.d2n.u3(var11);
            com.aspose.slides.internal.d2n.l6 var13 = new com.aspose.slides.internal.d2n.l6(this, var12);
            var6 = var13.n5();
            this.n5(var45, var13);
         } else {
            this.l6(var45);
         }

         AffineTransform var46 = this.m1.q0;
         new Float();
         AffineTransform var47 = null;
         FontMetrics var48 = this.o0.getFontMetrics();
         int var49 = var48.getMaxAscent();
         int var14 = var48.getHeight();

         for (int var15 = 0; var15 < var2.length; var15++) {
            com.aspose.slides.internal.c4t.n3 var16 = var2[var15];
            String var17 = var16.l6();
            int var18 = 1;
            if (var17 == null) {
               int var19;
               if (this.m1.u3 != null) {
                  var19 = this.m1.u3.l6();
               } else {
                  var19 = 1;
               }

               var17 = this.f2.n5(var19).n5(var16.u3());
               var18 = this.f2.n5(var19).n5();
            }

            Shape var50 = null;
            if (var17 != null && var17.length() != 0) {
               if ((var16.a6() & com.aspose.slides.internal.k2p.n5.n5) != 0) {
                  this.y1();
                  this.x8(var16.k5());
               }

               if ((var16.a6() & com.aspose.slides.internal.k2p.n5.l6) != 0) {
                  var50 = this.o0.getClip();
                  this.o0.clip(var16.k5());
               }

               double var20 = var16.n5().x;
               double var22 = var16.n5().y;
               float var24 = 1.0F;
               if (var3 == 2) {
                  AffineTransform var25 = var46;
                  if (var25 != null) {
                     var25 = (AffineTransform)var25.clone();
                  } else {
                     var25 = new AffineTransform();
                  }

                  if ((float)this.m1.m1.width * this.m1.z3.width < 0.0F || (float)this.m1.m1.height * this.m1.z3.height < 0.0F) {
                     var25.translate(var16.n5().x, var16.n5().y);
                     var25.scale(
                        (float)this.m1.m1.width * this.m1.z3.width < 0.0F ? -1.0 : 1.0, (float)this.m1.m1.height * this.m1.z3.height < 0.0F ? -1.0 : 1.0
                     );
                     var25.rotate(
                        -this.m1.u3.a6() / 180.0F
                           * Math.PI
                           * ((float)this.m1.m1.width * this.m1.z3.width * this.m1.m1.height * this.m1.z3.height < 0.0F ? -1 : 1)
                     );
                     var25.translate(-var16.n5().x, -var16.n5().y);
                  }

                  var25.rotate(-(this.m1.u3.a6() * Math.PI / 180.0), var16.n5().x, var16.n5().y);
                  this.l6(var25);
               } else {
                  AffineTransform var52 = null;
                  double var26 = -this.m1.u3.a6() / 180.0F * Math.PI;
                  var52 = var46 == null ? new AffineTransform() : (AffineTransform)var46.clone();
                  var52.translate(var16.n5().x, var16.n5().y);
                  var52.rotate(var26);
                  if (Math.abs(var4) > 0.0F && Math.abs(var5) > 0.0F) {
                     var52.scale(var4 / Math.abs(var5), var5 < 0.0F ? -1.0 : 1.0);
                  }

                  var52.translate(-var16.n5().x, -var16.n5().y);
                  this.l6(var52);
               }

               boolean var54 = this.p8 && !((com.aspose.slides.internal.m5l.u3)var1).l6() && !this.m1.u3.n5().equals("");
               if (var54) {
                  if (this.m1.t4 != null) {
                     var47 = this.m1.t4;
                     double var55 = var47.getScaleY();
                     this.m1.t4 = new AffineTransform(var55, var47.getShearY(), var47.getShearX(), var55, var47.getTranslateX(), var47.getTranslateY());
                  }

                  this.e2();
               }

               if (var7) {
                  char[] var28 = var17.toCharArray();

                  for (int var29 = 0; var29 < var28.length; var29++) {
                     if ((var28[var29] & '\uff00') == 0) {
                        var28[var29] = (char)(var28[var29] | 61440);
                     }
                  }

                  var17 = new String(var28);
               }

               GlyphVector var30;
               if ((var16.a6() & com.aspose.slides.internal.k2p.n5.k5) != 0) {
                  var30 = this.n5(var16.u3());
               } else if ((var16.a6() & com.aspose.slides.internal.k2p.n5.u3) != 0) {
                  char[] var56 = var17.toCharArray();
                  var30 = this.o0.getFont().layoutGlyphVector(this.o0.getFontRenderContext(), var56, 0, var56.length, 1);
               } else {
                  var30 = this.o0.getFont().createGlyphVector(this.o0.getFontRenderContext(), var17);
               }

               float var57 = -1.0F;
               if (var16.u9() != null) {
                  int[] var58 = var16.u9();
                  if ((var16.a6() & com.aspose.slides.internal.k2p.n5.u3) != 0) {
                     int[] var31 = new int[var58.length];

                     for (int var32 = 0; var32 < var58.length; var32++) {
                        var31[var32] = var58[var58.length - 1 - var32];
                     }

                     var58 = var31;
                  }

                  int var61 = var30.getNumGlyphs();
                  int[] var64 = var30.getGlyphCharIndices(0, var61, null);
                  if (var64[0] > var64[var64.length - 1]) {
                     int var33 = var64.length / 2;

                     for (int var34 = 0; var34 < var33; var34++) {
                        int var35 = var64[var34];
                        var64[var34] = var64[var64.length - 1 - var34];
                        var64[var64.length - 1 - var34] = var35;
                     }
                  }

                  float var67 = 0.0F;
                  int var69 = 0;
                  int var70 = 0;

                  while (var69 < var61) {
                     float var36 = 0.0F;
                     int var37 = var17.charAt(var64[var69]) > 127 ? var18 : 1;

                     for (int var38 = 0; var38 < var37; var38++) {
                        if (var70 < var58.length) {
                           var36 += var58[var70];
                        }

                        var70++;
                     }

                     double var39 = var47 != null ? var47.getScaleX() / var47.getScaleY() : 1.0;
                     if (var54 && var18 > 1) {
                        double var41 = var30.getGlyphMetrics(var69).getAdvanceX();
                        AffineTransform var43 = var54 ? AffineTransform.getScaleInstance(var36 / var41 * var39, 1.0) : new AffineTransform();
                        var30.setGlyphTransform(var69, var43);
                     }

                     var30.setGlyphPosition(var69, new Float(var67, 0.0F));
                     var67 = (float)(var67 + var36 * var39);
                     var57 = (float)var30.getGlyphPosition(var69).getX() + (float)var30.getGlyphLogicalBounds(var61 - 1).getBounds2D().getWidth();
                     var69++;
                  }
               } else if (this.m1.s7 != 0) {
                  int var59 = var30.getNumGlyphs();
                  float var62 = this.m1.s7;

                  for (int var65 = 1; var65 < var59; var65++) {
                     var30.setGlyphPosition(var65, new Float((float)var30.getGlyphPosition(var65).getX() + var62 * var65, 0.0F));
                  }

                  var30.setGlyphPosition(var59, new Float((float)var30.getGlyphPosition(var59).getX() + var62 * var59, 0.0F));
               }

               int var60 = this.m1.t2;
               Rectangle2D var63 = var30.getLogicalBounds();
               Dimension var66 = new Dimension((int)(var57 >= 0.0F ? var57 : var63.getWidth() + 0.5), var14);
               if (this.n5(var1, var60)) {
                  var20 = this.z8();
                  var22 = this.j5();
               }

               if (var47 != null) {
                  var20 = var20 * var47.getScaleX() / this.m1.t4.getScaleX();
                  var22 = var22 * var47.getScaleY() / this.m1.t4.getScaleY();
               }

               switch (var60 & 6) {
                  case 0:
                  default:
                     break;
                  case 2:
                     var20 -= var66.width;
                     break;
                  case 6:
                     var20 -= var66.width / 2;
               }

               switch (var60 & 24) {
                  case 0:
                  default:
                     break;
                  case 8:
                     var22 -= var66.height;
                     break;
                  case 24:
                     var22 -= var49;
               }

               if (this.m1.k7) {
                  this.y1();
                  this.o0.fill(new Double(var20, var22, var66.width, var66.height));
               }

               this.y2();
               this.o0.drawGlyphVector(var30, (float)var20, (float)var22 + var49);
               if (this.z3 != null) {
                  this.z3
                     .add(
                        new com.aspose.slides.internal.c4t.t9(
                           (float)var20, (float)var22 + var49, var17, this.o0.getFont(), this.o0.getColor(), this.o0.getTransform()
                        )
                     );
               }

               if (this.m1.u3.u9() || this.m1.u3.h0()) {
                  float var68 = var14 / 22.0F;
                  this.o0.setStroke(new BasicStroke(var68));
                  if (this.m1.u3.u9()) {
                     this.o0
                        .draw(
                           new java.awt.geom.Line2D.Float(
                              (float)var20 + var68,
                              (float)var22 + var66.height - var68,
                              (float)var20 + var66.width - var68,
                              (float)var22 + var66.height - var68
                           )
                        );
                  }

                  if (this.m1.u3.h0()) {
                     this.o0
                        .draw(
                           new java.awt.geom.Line2D.Float(
                              (float)var20 + var68,
                              (float)var22 + var66.height - var49 / 2.0F,
                              (float)var20 + var66.width - var68,
                              (float)var22 + var66.height - var49 / 2.0F
                           )
                        );
                  }
               }

               if (this.n5(var60)) {
                  this.x8((int)Math.round(var20) + var66.width, this.j5());
               }

               this.l6(var46);
               if ((var16.a6() & com.aspose.slides.internal.k2p.n5.l6) != 0) {
                  this.h0(var50);
               }
            }
         }

         if (var47 != null) {
            this.m1.t4 = var47;
            this.l6(this.m1.q0);
         }
      }
   }

   private boolean n5(String var1) {
      Boolean var2 = t1.get(var1);
      if (var2 != null) {
         return var2;
      }

      var2 = com.aspose.slides.internal.f3l.k5.n5(var1);
      t1.put(var1, var2);
      return var2;
   }

   private boolean n5(com.aspose.slides.internal.m5l.k5 var1, int var2) {
      return this.p8 && !((com.aspose.slides.internal.m5l.u3)var1).l6() ? false : (var2 & 1) == 1;
   }

   private boolean n5(int var1) {
      return (var1 & 1) == 1;
   }

   public void n5(int var1, Object var2) {
      if (var1 >= 0 && var1 < this.j5.size()) {
         this.j5.set(var1, var2);
      } else {
         this.j5.ensureCapacity(var1 + 1);

         for (int var3 = this.j5.size(); var3 < var1; var3++) {
            this.j5.add(null);
         }

         this.j5.add(var2);
      }
   }

   Object t9(int var1) {
      return var1 >= 0 && var1 < this.j5.size() ? this.j5.get(var1) : null;
   }

   public com.aspose.slides.internal.d2n.u9 z1(int var1) throws com.aspose.slides.internal.p7x.l6 {
      Object var2 = this.t9(var1);
      return var2 instanceof com.aspose.slides.internal.d2n.u9 ? (com.aspose.slides.internal.d2n.u9)var2 : null;
   }

   public int n5(Object var1) {
      for (int var2 = 0; var2 < this.j5.size(); var2++) {
         if (this.j5.get(var2) == null) {
            this.j5.set(var2, var1);
            return var2;
         }
      }

      this.j5.add(var1);
      return this.j5.size() - 1;
   }

   public void t4(int var1) {
      Object var2;
      if (var1 < 0) {
         var1 &= Integer.MAX_VALUE;
         if (var1 < n5.length) {
            var2 = n5[var1];
         } else {
            var2 = null;
         }
      } else {
         if (var1 >= this.j5.size()) {
            return;
         }

         var2 = this.j5.get(var1);
      }

      if (var2 != null) {
         if (var2 instanceof com.aspose.slides.internal.c4t.t2) {
            this.m1.l6 = (com.aspose.slides.internal.c4t.t2)var2;
            if (this.h2 == 1) {
               this.h2 = 0;
            }
         } else if (var2 instanceof com.aspose.slides.internal.c4t.u3) {
            this.m1.k5 = (com.aspose.slides.internal.c4t.u3)var2;
            if (this.h2 == 2) {
               this.h2 = 0;
            }
         } else if (var2 instanceof com.aspose.slides.internal.d2n.l6) {
            this.m1.u3 = (com.aspose.slides.internal.d2n.l6)var2;
            this.v0 = 0;
         } else if (var2 instanceof com.aspose.slides.internal.d2n.u9) {
            this.n5((com.aspose.slides.internal.d2n.u9)var2);
         }
      }
   }

   public void q0(int var1) {
      if (var1 >= 0 && var1 < this.j5.size()) {
         this.j5.set(var1, null);
      }
   }

   private void x8(int var1, int var2) {
      this.m3.move(var1, var2);
   }

   private int z8() {
      return this.m3.x;
   }

   private int j5() {
      return this.m3.y;
   }

   private void w1() {
      if (this.h2 != 1) {
         this.h2 = 1;
         if (this.m1.l6 != null) {
            this.m1.l6.n5(this);
         }

         this.n5();
      }
   }

   private void r4() {
      if (this.h2 != 1) {
         this.h2 = 1;
         if (this.m1.l6 != null) {
            this.m1.l6.n5(this);
         }

         this.l6();
      }
   }

   private void c4() {
      if (this.h2 != 2) {
         this.h2 = 2;
         if (this.m1.k5 != null) {
            this.m1.k5.n5(this);
         }

         this.n5();
      }
   }

   private void y2() {
      if (this.h2 != 4) {
         this.h2 = 4;
         if (this.m1.t9 != null) {
            this.o0.setPaint(this.m1.t9);
         }
      }
   }

   private void y1() {
      if (this.h2 != 3) {
         this.h2 = 3;
         if (this.m1.e2 != null) {
            this.o0.setPaint(this.m1.e2);
         }
      }
   }

   private void l6(int var1) {
      this.n5(var1, this.m1.u3);
   }

   private void n5(int var1, com.aspose.slides.internal.d2n.l6 var2) {
      int var3 = var1 == 1 ? 2 : 1;
      if (this.v0 != var3) {
         this.v0 = var3;
         if (var2 != null) {
            var2.n5(this, var1);
         }

         this.n5();
      }
   }

   private void l6(AffineTransform var1) {
      if (var1 == null) {
         var1 = new AffineTransform();
      }

      this.m1.q0 = var1;
      var1 = (AffineTransform)var1.clone();
      if (this.m1.t4 != null) {
         var1.preConcatenate(this.m1.t4);
      }

      this.m1.z1 = new AffineTransform(var1);
      if (this.e5 != null) {
         var1.preConcatenate(this.e5);
      }

      this.o0.setTransform(var1);
      this.m1.m3 = null;
      this.d2();
   }

   protected void e2() {
      this.l6(this.m1.q0);
   }

   private void a0() {
      double var1 = 0.0;
      double var3 = 0.0;
      double var5 = 25.4;
      double var7;
      double var9;
      switch (this.m1.u9) {
         case 1:
            var7 = 1.0;
            var9 = 1.0;
            var3 = 0.0;
            var1 = 0.0;
            break;
         case 2:
            var9 = this.y1 / 10.0;
            var7 = -this.a0 / 10.0;
            break;
         case 3:
            var9 = this.y1 / 100.0;
            var7 = -this.a0 / 100.0;
            break;
         case 4:
            var9 = this.y1 * var5 / 100.0;
            var7 = -this.a0 * var5 / 100.0;
            break;
         case 5:
            var9 = this.y1 * var5 / 1000.0;
            var7 = -this.a0 * var5 / 1000.0;
            break;
         case 6:
            var9 = this.y1 * var5 / 1440.0;
            var7 = -this.a0 * var5 / 1440.0;
            break;
         case 7:
         case 8:
            var9 = this.m1.m1.getWidth() / this.m1.z3.getWidth();
            var7 = this.m1.m1.getHeight() / this.m1.z3.getHeight();
            break;
         default:
            return;
      }

      var1 = -this.m1.z3.x * var9 + this.m1.m1.x;
      var3 = -this.m1.z3.y * var7 + this.m1.m1.y;
      AffineTransform var11 = AffineTransform.getTranslateInstance(var1, var3);
      var11.scale(var9, var7);
      this.m1.t4 = var11;
      this.e2();
   }

   private void t2(Shape var1) {
      this.m1.m3 = null;
      this.m1.z8 = null;
      this.m1.j5 = var1;
      this.d2();
   }

   void h0(Shape var1) {
      if (var1 == null) {
         this.o0.setClip(null);
      } else {
         Shape var2 = com.aspose.slides.internal.r5w.n5.n5(var1);
         if (var2 instanceof Double) {
            Rectangle var3 = new a0().getBounds();
            if (!(((Double)var2).getWidth() >= var3.width) && !(((Double)var2).getHeight() >= var3.height)) {
               this.o0.setClip(var2);
            } else {
               this.o0.setClip(null);
            }
         } else {
            this.o0.setClip(var1);
         }
      }
   }

   private void d2() {
      if (this.m1.m3 == null && (this.p3.n5() != null || this.m1.j5 != null)) {
         if (this.m1.z8 == null) {
            if (this.p3.n5() != null) {
               if (this.m1.j5 != null) {
                  Area var1 = new Area(this.m1.j5);
                  var1.intersect(new Area(this.p3.n5()));
                  this.m1.z8 = var1;
               } else {
                  this.m1.z8 = this.p3.n5();
               }
            } else {
               this.m1.z8 = this.m1.j5;
            }
         }

         if (this.m1.z1 != null) {
            try {
               AffineTransform var3 = this.m1.z1.createInverse();
               this.m1.m3 = var3.createTransformedShape(this.m1.z8);
            } catch (NoninvertibleTransformException var2) {
               this.m1.m3 = this.m1.z8;
            }
         } else {
            this.m1.m3 = this.m1.z8;
         }

         this.h0(this.m1.m3);
      } else {
         this.h0(this.m1.m3);
      }
   }

   private void s7(Shape var1) {
      this.w1();
      if (this.m1.l6.n5()) {
         this.o0.draw(var1);
      } else {
         AffineTransform var2 = this.m1.z1 != null ? this.m1.z1 : new AffineTransform();
         boolean var3 = (var2.getType() & 64) != 0;
         if (var3 && var1 instanceof Rectangle) {
            Rectangle var4 = (Rectangle)((Rectangle)var1).clone();
            if (var2.getScaleX() < 0.0) {
               var4.x = var4.x + var4.width;
               var4.width = -var4.width;
            }

            if (var2.getScaleY() < 0.0) {
               var4.y = var4.y + var4.height;
               var4.height = -var4.height;
            }

            var1 = var4;
         }

         Shape var6 = var2.createTransformedShape(var1);
         AffineTransform var5 = this.o0.getTransform();
         this.o0.setTransform(this.e5);
         this.o0.draw(var6);
         this.o0.setTransform(var5);
      }
   }

   private void x8(Shape var1) {
      AffineTransform var2 = this.m1.z1 != null ? this.m1.z1 : new AffineTransform();
      AffineTransform var3 = new AffineTransform(this.e5);
      var3.concatenate(var2);
      AffineTransform var4 = this.o0.getTransform();

      try {
         this.o0.setTransform(var3);
         this.o0.fill(var1);
      } finally {
         this.o0.setTransform(var4);
      }
   }

   public void s7(int var1, int var2) {
      this.m1.n3 = var1;
      this.m1.y4 = var2;
   }

   private void d5() {
      if (this.m1.u9 == 7) {
         double var1 = this.m1.m1.getWidth() / this.m1.z3.getWidth();
         double var3 = this.m1.m1.getHeight() / this.m1.z3.getHeight();
         double var5 = k5(var1);
         double var7 = k5(var3);
         double var9 = Math.min(Math.abs(var1), Math.abs(var3));
         this.m1.m1.setSize((int)(this.m1.z3.width * var9 * var5 + 0.5), (int)(this.m1.z3.height * var9 * var7 + 0.5));
      }
   }

   private void n5(Rectangle var1, int var2, int var3, int var4, int var5) {
      Dimension var6 = var1.getSize();
      var1.setSize((int)(var6.getWidth() * var2 / var3 + 0.5), (int)(var6.getHeight() * var4 / var5 + 0.5));
   }

   public final String n5(int var1, byte[] var2) {
      return this.f2.n5(var1).n5(var2);
   }

   public final Color k5(Color var1) {
      return this.f0.n5(var1);
   }

   private GlyphVector n5(byte[] var1) {
      int[] var2 = new int[var1.length / 2];

      for (int var3 = 0; var3 < var2.length; var3++) {
         var2[var3] = (var1[var3 * 2 + 1] & 255) << 8 | var1[var3 * 2] & 255;
      }

      return this.m1.u3.k5().createGlyphVector(this.o0.getFontRenderContext(), var2);
   }

   public boolean t9() {
      boolean var1 = true;
      com.aspose.slides.internal.c4t.u3 var2 = this.m1.k5;
      if (var2 instanceof com.aspose.slides.internal.c4t.s7) {
         if (this.m1.l6 != null && this.m1.l6.l6() != null) {
            var1 = !this.m1.l6.l6().equals(((com.aspose.slides.internal.c4t.s7)var2).n5());
         } else {
            var1 = ((com.aspose.slides.internal.c4t.s7)var2).n5() != null;
         }
      }

      return var1;
   }

   public Graphics2D z1() {
      return this.o0;
   }

   public com.aspose.slides.internal.o9b.z1 t4() {
      return this.z7;
   }

   public t4 q0() {
      return this.m1;
   }

   public void n5(double var1) {
      this.y1 = var1;
   }

   public void l6(double var1) {
      this.a0 = var1;
   }

   public Dimension z3() {
      return this.d5;
   }

   public void k5(Dimension var1) {
      this.d5 = var1;
   }

   public Dimension m1() {
      return this.s3;
   }

   public void u3(Dimension var1) {
      this.s3 = var1;
   }

   public boolean k7() {
      return this.p8;
   }

   public void n5(boolean var1) {
      this.p8 = var1;
   }

   public float m3() {
      return this.d2;
   }

   public void l6(float var1) {
      this.d2 = var1;
   }

   public void n5(Collection<com.aspose.slides.internal.m5l.l6> var1) {
      this.a5 = var1;
   }
}
