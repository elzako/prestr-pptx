package com.aspose.slides.internal.o9b;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.NotSupportedException;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.nio.charset.Charset;

class k7 extends z1 {
   private com.aspose.slides.internal.j9e.y4 n5;
   private int l6 = 0;
   private AffineTransform k5 = new AffineTransform();
   private int u3 = 2;
   private List<y2> a6 = new List<>();
   private int u9 = 0;
   private int h0 = -1;
   private Color c8 = Color.WHITE;

   public k7(com.aspose.slides.internal.j9e.y4 var1) {
      this.n5 = var1;
      this.a6.add(new y2(0, 0, var1.e2(), var1.h0()));
   }

   @Override
   public void dispose() {
   }

   @Override
   public void n5(c8 var1) {
      this.n5(new i1(var1), -1, -1, this.n5.e2() + 1, this.n5.h0() + 1);
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
      this.n5(new com.aspose.slides.internal.x4a.u9(var1), (int)var2, (int)var3, (int)var4, (int)var5, (int)var6, (int)var7);
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
      this.n5(new com.aspose.slides.internal.x4a.u9(var1), var2, var3, var4, var5);
   }

   public void k5(m3 var1, float var2, float var3, float var4, float var5) {
      this.l6(var1, (int)var2, (int)var3, (int)var4, (int)var5);
   }

   @Override
   public void n5(t4 var1, j5 var2) {
      this.n5(var1, var2.n5(), var2.l6());
   }

   @Override
   public void n5(t4 var1, w1 var2) {
      this.n5(var1, var2.l6(), var2.k5());
   }

   @Override
   public void n5(t4 var1, y2 var2) {
      this.n5(var1, var2.s7(), var2.x8(), var2.t2(), var2.l6());
   }

   @Override
   public void n5(t4 var1, y1 var2) {
      this.n5(var1, var2.x8(), var2.n3(), var2.s7(), var2.k5());
   }

   @Override
   public void n5(t4 var1, int var2, int var3) {
      this.n5(var1, var2, var3, var1.e2(), var1.h0());
   }

   @Override
   public void n5(t4 var1, float var2, float var3) {
      this.n5(var1, (int)var2, (int)var3);
   }

   @Override
   public void n5(t4 var1, y2 var2, y2 var3, int var4) {
      this.n5(var1, y1.n5(var2), y1.n5(var3), var4);
   }

   @Override
   public void n5(t4 var1, y1 var2, y1 var3, int var4) {
      y1 var5 = var3;
      if (var4 != this.e2()) {
         var5 = com.aspose.slides.internal.r5w.n5.n5(var4, this.e2(), var3);
      }

      int var6 = Math.round(var5.x8());
      int var7 = Math.round(var5.n3());
      int var8 = Math.round(var5.s7());
      int var9 = Math.round(var5.k5());
      if (var6 + var8 > var1.e2()) {
         var8 = var1.e2() - var6;
      }

      if (var7 + var9 > var1.h0()) {
         var9 = var1.h0() - var7;
      }

      var7 = var1.h0() - (var7 + var9);
      com.aspose.slides.internal.o5k.a6 var10 = new com.aspose.slides.internal.o5k.a6(
         new com.aspose.slides.internal.c4t.n5((BufferedImage)var1.a6().n5(), true, null),
         new Rectangle(var6, var7, var8, var9),
         new Rectangle((int)var2.x8(), (int)var2.n3(), (int)var2.s7(), (int)var2.k5())
      );
      this.n5.n5(var10);
   }

   @Override
   public void n5(t4 var1, w1[] var2, y1 var3, int var4) {
      throw new NotImplementedException();
   }

   @Override
   public void n5(t4 var1, j5[] var2, y2 var3, int var4, com.aspose.slides.internal.j9e.t2 var5) {
      throw new NotImplementedException();
   }

   @Override
   public void n5(t4 var1, w1[] var2, y1 var3, int var4, com.aspose.slides.internal.j9e.t2 var5) {
      throw new NotImplementedException();
   }

   @Override
   public void n5(t4 var1, int var2, int var3, int var4, int var5) {
      this.n5(var1, new y2(var2, var3, var4, var5), new y2(0, 0, var1.e2(), var1.h0()), this.e2());
   }

   @Override
   public void n5(t4 var1, float var2, float var3, float var4, float var5) {
      this.n5(var1, (int)var2, (int)var3, (int)var4, (int)var5);
   }

   @Override
   public void n5(t4 var1, int var2, int var3, y2 var4, int var5) {
      this.n5(var1, var2, var3, y1.n5(var4), var5);
   }

   public void n5(t4 var1, float var2, float var3, y1 var4, int var5) {
      y1 var6 = com.aspose.slides.internal.r5w.n5.n5(var5, this.u3, var4);
      this.n5(var1, new y1(var2, var3, var6.s7(), var6.k5()), var4, var5);
   }

   @Override
   public void n5(t4 var1, y2 var2, float var3, float var4, float var5, float var6, int var7) {
      this.n5(var1, y1.n5(var2), new y1(var3, var4, var5, var6), var7);
   }

   @Override
   public void n5(t4 var1, y2 var2, int var3, int var4, int var5, int var6, int var7, com.aspose.slides.internal.j9e.t2 var8) {
      throw new NotImplementedException();
   }

   @Override
   public void n5(t4 var1, y2 var2, float var3, float var4, float var5, float var6, int var7, com.aspose.slides.internal.j9e.t2 var8) {
      throw new NotImplementedException();
   }

   @Override
   public void l6(t4 var1, int var2, int var3) {
      this.l6(var1, var2, var3, var1.e2(), var1.h0());
   }

   public void l6(t4 var1, int var2, int var3, int var4, int var5) {
      com.aspose.slides.internal.o5k.a6 var6 = new com.aspose.slides.internal.o5k.a6(
         new com.aspose.slides.internal.c4t.n5((BufferedImage)var1.a6().n5(), true, null),
         new Rectangle(0, 0, var1.e2(), var1.h0()),
         new Rectangle(var2, var3, var4, var5)
      );
      this.n5.n5(var6);
   }

   @Override
   public void n5(m3 var1, w1 var2, w1 var3) {
      this.n5(var1, var2.l6(), var2.k5(), var3.l6(), var3.k5());
   }

   @Override
   public void n5(m3 var1, j5 var2, j5 var3) {
      this.n5(var1, var2.n5(), var2.l6(), var3.n5(), var3.l6());
   }

   @Override
   public void n5(m3 var1, int var2, int var3, int var4, int var5) {
      Point[] var6 = new Point[]{new Point(var2, var3), new Point(var4, var5)};
      this.l6(new com.aspose.slides.internal.x4a.u9(var1), var6);
   }

   @Override
   public void n5(m3 var1, float var2, float var3, float var4, float var5) {
      this.n5(var1, (int)var2, (int)var3, (int)var4, (int)var5);
   }

   @Override
   public void l6(m3 var1, w1[] var2) {
      this.l6(new com.aspose.slides.internal.x4a.u9(var1), this.n5(var2));
   }

   @Override
   public void k5(m3 var1, j5[] var2) {
      this.l6(new com.aspose.slides.internal.x4a.u9(var1), this.n5(var2));
   }

   @Override
   public void n5(m3 var1, com.aspose.slides.internal.x4g.s7 var2) {
      this.n5(new com.aspose.slides.internal.x4a.u9(var1), var2);
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
      this.n5(new com.aspose.slides.internal.x4a.u9(var1), var2, var3, var4, var5, var6, var7);
   }

   @Override
   public void u3(m3 var1, j5[] var2) {
      this.n5(new com.aspose.slides.internal.x4a.u9(var1), this.n5(var2));
   }

   @Override
   public void k5(m3 var1, w1[] var2) {
      this.n5(new com.aspose.slides.internal.x4a.u9(var1), this.n5(var2));
   }

   @Override
   public void l6(m3 var1, y2 var2) {
      this.k5(var1, var2.s7(), var2.x8(), var2.t2(), var2.l6());
   }

   @Override
   public void l6(m3 var1, float var2, float var3, float var4, float var5) {
      this.k5(var1, (int)var2, (int)var3, (int)var4, (int)var5);
   }

   public void k5(m3 var1, int var2, int var3, int var4, int var5) {
      this.n5(new com.aspose.slides.internal.x4a.u9(var1), new Rectangle[]{new Rectangle(var2, var3, var4, var5)});
   }

   @Override
   public void n5(m3 var1, y1[] var2) {
      this.n5(new com.aspose.slides.internal.x4a.u9(var1), this.n5(var2));
   }

   @Override
   public void n5(String var1, n3 var2, u3 var3, y1 var4) {
      this.n5(var1, var2, var3, var4, null);
   }

   @Override
   public void n5(String var1, n3 var2, u3 var3, w1 var4) {
      this.n5(var1, var2, var3, var4, null);
   }

   @Override
   public void n5(String var1, n3 var2, u3 var3, w1 var4, e5 var5) {
      com.aspose.slides.internal.d2n.u3 var6 = new com.aspose.slides.internal.d2n.u3(var2.z1());
      com.aspose.slides.internal.x4a.l6 var7 = new com.aspose.slides.internal.x4a.l6(var6);
      this.n5.n5(var7);
      this.j5();
      this.n5.n5(new com.aspose.slides.internal.r7n.z8(com.aspose.slides.internal.o9b.c8.l6(this.n5(var3))));
      if (var5 != null) {
         this.n5.n5(new com.aspose.slides.internal.r7n.k7(var5));
      }

      this.n5
         .n5(
            new com.aspose.slides.internal.q8g.z3(
               new com.aspose.slides.internal.c4t.y4(var1, Charset.forName("UTF-16LE"), new Point((int)var4.l6(), (int)var4.k5()))
            )
         );
      this.w1();
   }

   @Override
   public void n5(String var1, n3 var2, u3 var3, y1 var4, e5 var5) {
      com.aspose.slides.internal.d2n.u3 var6 = new com.aspose.slides.internal.d2n.u3(var2.z1());
      com.aspose.slides.internal.x4a.l6 var7 = new com.aspose.slides.internal.x4a.l6(var6);
      this.n5.n5(var7);
      this.j5();
      this.n5.n5(new com.aspose.slides.internal.r7n.z8(com.aspose.slides.internal.o9b.c8.l6(this.n5(var3))));
      if (var5 != null) {
         this.n5.n5(new com.aspose.slides.internal.r7n.k7(var5));
      }

      this.n5
         .n5(
            new com.aspose.slides.internal.q8g.z3(
               new com.aspose.slides.internal.c4t.y4(
                  var1, Charset.forName("UTF-16LE"), new Rectangle((int)var4.x8(), (int)var4.n3(), (int)var4.s7(), (int)var4.k5())
               )
            )
         );
      this.w1();
   }

   @Override
   public void n5(String var1, n3 var2, u3 var3, float var4, float var5, e5 var6) {
      this.n5(var1, var2, var3, new w1(var4, var5), var6);
   }

   @Override
   public void n5(com.aspose.slides.internal.x4g.t2 var1) {
   }

   @Override
   public com.aspose.slides.internal.x4g.t2 n5() {
      return null;
   }

   @Override
   public com.aspose.slides.internal.x4g.t2 n5(y1 var1, y1 var2, int var3) {
      return null;
   }

   @Override
   public com.aspose.slides.internal.x4g.x8 l6() {
      return null;
   }

   @Override
   public void n5(com.aspose.slides.internal.x4g.x8 var1) {
   }

   @Override
   public void n5(u3 var1, w1[] var2, int var3, float var4) {
      com.aspose.slides.internal.x4g.s7 var5 = new com.aspose.slides.internal.x4g.s7(var3);
      var5.n5(var2, var4);
      this.n5(var1, var5);
   }

   @Override
   public void n5(u3 var1, y2 var2) {
      this.l6(var1, var2.s7(), var2.x8(), var2.t2(), var2.l6());
   }

   @Override
   public void n5(u3 var1, y1 var2) {
      this.l6(var1, var2.x8(), var2.n3(), var2.s7(), var2.k5());
   }

   public void l6(u3 var1, float var2, float var3, float var4, float var5) {
      this.l6(var1, (int)var2, (int)var3, (int)var4, (int)var5);
   }

   public void l6(u3 var1, int var2, int var3, int var4, int var5) {
      this.n5(com.aspose.slides.internal.x4a.n5.n5(var1), var2, var3, var4, var5);
   }

   @Override
   public void n5(u3 var1, com.aspose.slides.internal.x4g.s7 var2) {
      this.n5(com.aspose.slides.internal.x4a.n5.n5(var1), var2);
   }

   @Override
   public void n5(u3 var1, y2 var2, float var3, float var4) {
      this.n5(var1, var2.s7(), var2.x8(), var2.t2(), var2.l6(), var3, var4);
   }

   @Override
   public void n5(u3 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.n5(com.aspose.slides.internal.x4a.n5.n5(var1), var2, var3, var4, var5, var6, var7);
   }

   @Override
   public void n5(u3 var1, w1[] var2) {
      this.n5(com.aspose.slides.internal.x4a.n5.n5(var1), this.n5(var2));
   }

   @Override
   public void n5(u3 var1, j5[] var2, int var3) {
      this.n5(com.aspose.slides.internal.x4a.n5.n5(var1), this.n5(var2), var3);
   }

   @Override
   public void n5(u3 var1, w1[] var2, int var3) {
      this.n5(com.aspose.slides.internal.x4a.n5.n5(var1), this.n5(var2), var3);
   }

   @Override
   public void l6(u3 var1, y1 var2) {
      this.n5(var1, var2.x8(), var2.n3(), var2.s7(), var2.k5());
   }

   @Override
   public void l6(u3 var1, y2 var2) {
      this.n5(var1, var2.s7(), var2.x8(), var2.t2(), var2.l6());
   }

   @Override
   public void n5(u3 var1, int var2, int var3, int var4, int var5) {
      this.n5(com.aspose.slides.internal.x4a.n5.n5(var1), new Rectangle[]{new Rectangle(var2, var3, var4, var5)});
   }

   @Override
   public void n5(u3 var1, float var2, float var3, float var4, float var5) {
      this.n5(var1, (int)var2, (int)var3, (int)var4, (int)var5);
   }

   @Override
   public void n5(u3 var1, y1[] var2) {
      this.n5(com.aspose.slides.internal.x4a.n5.n5(var1), this.n5(var2));
   }

   @Override
   public void n5(u3 var1, a0 var2) {
   }

   @Override
   public void k5() {
   }

   @Override
   public void n5(a0 var1) {
      throw new NotSupportedException("Operation is not supported by WMF");
   }

   @Override
   public a0[] n5(String var1, n3 var2, y1 var3, e5 var4) {
      throw new NotSupportedException("Operation is not supported by WMF");
   }

   @Override
   public f2 n5(String var1, n3 var2) {
      throw new NotSupportedException("Operation is not supported by WMF");
   }

   @Override
   public f2 n5(String var1, n3 var2, f2 var3, e5 var4) {
      throw new NotSupportedException("Operation is not supported by WMF");
   }

   @Override
   public f2 n5(String var1, n3 var2, int var3, e5 var4) {
      throw new NotSupportedException("Operation is not supported by WMF");
   }

   @Override
   public f2 n5(String var1, n3 var2, w1 var3, e5 var4) {
      throw new NotSupportedException("Operation is not supported by WMF");
   }

   @Override
   public void n5(com.aspose.slides.internal.x4g.m1 var1) {
      throw new NotSupportedException("Operation is not supported by WMF");
   }

   @Override
   public void n5(com.aspose.slides.internal.x4g.m1 var1, int var2) {
      throw new NotSupportedException("Operation is not supported by WMF");
   }

   @Override
   public void u3() {
      this.a6 = new List<>();
      this.a6.add(new y2(0, 0, this.n5.e2(), this.n5.h0()));
      this.n5.n5(new com.aspose.slides.internal.x4a.h0(new com.aspose.slides.internal.d2n.u9(this.n5(this.a6.toArray(new y2[0])))));
      this.h0 = this.u9;
      this.j5();
      this.n5.n5(new com.aspose.slides.internal.q8g.s7(this.h0));
   }

   @Override
   public void a6() {
      this.n5.n5(new com.aspose.slides.internal.r7n.a6((int)(-this.k5.getTranslateX()), (int)(-this.k5.getTranslateY())));
      this.k5.translate((int)(-this.k5.getTranslateX()), (int)(-this.k5.getTranslateY()));
      this.n5.n5(new com.aspose.slides.internal.r7n.x8(1.0F / (float)this.k5.getScaleX(), 1.0F / (float)this.k5.getScaleY()));
      this.k5.scale(1.0F / (float)this.k5.getScaleX(), 1.0F / (float)this.k5.getScaleY());
   }

   @Override
   public void n5(float var1, int var2) {
      throw new NotSupportedException("Operation is not supported by WMF");
   }

   @Override
   public void n5(float var1, float var2) {
      this.n5(var1, var2, 0);
   }

   @Override
   public void n5(float var1, float var2, int var3) {
      if (var3 == 1) {
         throw new NotImplementedException();
      }

      this.n5.n5(new com.aspose.slides.internal.r7n.x8(var1, var2));
      this.k5.scale(var1, var2);
   }

   @Override
   public void n5(y1 var1) {
      this.n5(new y2((int)var1.x8(), (int)var1.n3(), (int)var1.s7(), (int)var1.k5()));
   }

   public void n5(y2 var1) {
      this.a6 = new List<>();
      this.a6.add(var1);
      this.n5.n5(new com.aspose.slides.internal.x4a.h0(new com.aspose.slides.internal.d2n.u9(this.n5(this.a6.toArray(new y2[0])))));
      this.h0 = this.u9;
      this.j5();
      this.n5.n5(new com.aspose.slides.internal.q8g.s7(this.h0));
   }

   @Override
   public void l6(a0 var1) {
      throw new NotSupportedException("Operation is not supported by WMF. Try use setClip(Rectangle) instead");
   }

   @Override
   public void n5(y2 var1, int var2) {
      switch (var2) {
         case 0:
            this.a6.clear();
            this.a6.addItem(var1);
            break;
         case 1:
            List var8 = new List();

            for (y2 var10 : this.a6) {
               var10.n5(var1);
               var8.addItem(var10);
            }

            this.a6 = var8;
            break;
         case 2:
            this.a6.addItem(var1);
            break;
         case 3:
            List var4 = this.n5(var1, this.a6);
            List var5 = new List();
            var5.addItem(var1);

            for (y2 var12 : this.a6) {
               var5 = this.n5(var12, var5);
            }

            this.a6 = var4;
            this.a6.addRange(var5);
            break;
         case 4:
            this.a6 = this.n5(var1, this.a6);
            break;
         case 5:
            List var3 = new List();
            var3.addItem(var1);

            for (y2 var7 : this.a6) {
               var3 = this.n5(var7, var3);
            }

            this.a6 = var3;
            break;
         default:
            throw new ArgumentOutOfRangeException("combineMode");
      }

      this.n5.n5(new com.aspose.slides.internal.x4a.h0(new com.aspose.slides.internal.d2n.u9(this.n5(this.a6.toArray(new y2[0])))));
      this.h0 = this.u9;
      this.j5();
      this.n5.n5(new com.aspose.slides.internal.q8g.s7(this.h0));
   }

   @Override
   public void n5(y1 var1, int var2) {
      this.n5(new y2((int)var1.x8(), (int)var1.n3(), (int)var1.s7(), (int)var1.k5()), var2);
   }

   @Override
   public void n5(a0 var1, int var2) {
      throw new NotSupportedException("Operation is not supported by WMF. Try use setClip(Rectangle, int) instead.");
   }

   @Override
   public void n5(com.aspose.slides.internal.x4g.s7 var1, int var2) {
      throw new NotSupportedException("Operation is not supported by WMF. Try use setClip(Rectangle, int) instead.");
   }

   @Override
   public void l6(float var1, float var2) {
      this.l6(var1, var2, 0);
   }

   @Override
   public void l6(float var1, float var2, int var3) {
      if (var3 == 1) {
         throw new NotImplementedException();
      }

      this.n5.n5(new com.aspose.slides.internal.r7n.a6((int)var1, (int)var2));
      this.k5.translate((int)var1, (int)var2);
   }

   @Override
   public a0 u9() {
      a0 var1 = new a0();

      for (y2 var3 : this.a6) {
         var1.k5(var3);
      }

      return var1;
   }

   @Override
   public y1 h0() {
      y1 var1 = y1.n5(this.a6.get_Item(0));

      for (int var2 = 1; var2 < this.a6.size(); var2++) {
         var1 = y1.l6(var1, y1.n5(this.a6.get_Item(var2)));
      }

      return var1;
   }

   @Override
   public int c8() {
      return this.l6;
   }

   @Override
   public void n5(int var1) {
      if (var1 >= 0 && var1 <= 1) {
         this.l6 = var1;
         byte var2 = 0;
         if (this.l6 == 1) {
            var2 = 13;
         } else {
            var2 = 15;
         }

         this.n5.n5(new com.aspose.slides.internal.r7n.z3(var2));
      } else {
         throw new ArgumentException("invalid compositing mode");
      }
   }

   @Override
   public int t2() {
      return 0;
   }

   @Override
   public void l6(int var1) {
   }

   @Override
   public float s7() {
      return this.n5.c8();
   }

   @Override
   public float x8() {
      return this.n5.y4();
   }

   @Override
   public int n3() {
      throw new NotSupportedException("Operation is not supported by WMF.");
   }

   @Override
   public void k5(int var1) {
      throw new NotSupportedException("Operation is not supported by WMF.");
   }

   @Override
   public float y4() {
      return 0.0F;
   }

   @Override
   public void n5(float var1) {
   }

   @Override
   public int e2() {
      return this.u3;
   }

   @Override
   public void u3(int var1) {
      if (var1 == 0) {
         throw new ArgumentException("Bad argument", "value");
      }

      this.u3 = var1;
   }

   @Override
   public int t9() {
      throw new NotSupportedException("Operation is not supported by WMF.");
   }

   @Override
   public void a6(int var1) {
      throw new NotSupportedException("Operation is not supported by WMF.");
   }

   @Override
   public j5 z1() {
      throw new NotSupportedException("Operation is not supported by WMF.");
   }

   @Override
   public void n5(j5 var1) {
      throw new NotSupportedException("Operation is not supported by WMF.");
   }

   @Override
   public int t4() {
      throw new NotSupportedException("Operation is not supported by WMF.");
   }

   @Override
   public void u9(int var1) {
      throw new NotSupportedException("Operation is not supported by WMF.");
   }

   @Override
   public int q0() {
      throw new NotSupportedException("Operation is not supported by WMF.");
   }

   @Override
   public void h0(int var1) {
      throw new NotSupportedException("Operation is not supported by WMF.");
   }

   @Override
   public int z3() {
      return 0;
   }

   @Override
   public void c8(int var1) {
   }

   @Override
   public com.aspose.slides.internal.x4g.m1 m1() {
      return com.aspose.slides.internal.x4g.m1.n5(this.k5);
   }

   @Override
   public void l6(com.aspose.slides.internal.x4g.m1 var1) {
      throw new NotSupportedException("Operation is not supported by WMF.");
   }

   @Override
   public Graphics2D z8() {
      return null;
   }

   @Override
   public Shape m3() {
      throw new NotImplementedException();
   }

   private void n5(com.aspose.slides.internal.x4a.u9 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.n5.n5(var1);
      this.j5();
      Rectangle var8 = new Rectangle(var2, var3, var4, var5);
      Point[] var9 = this.n5(var2, var3, var4, var5, var6, var7);
      this.n5.n5(new com.aspose.slides.internal.q8g.l6(var8, var9[0], var9[1]));
      this.w1();
   }

   private void n5(com.aspose.slides.internal.x4a.u9 var1, int var2, int var3, int var4, int var5) {
      this.n5.n5(var1);
      this.j5();
      this.n5.n5(new com.aspose.slides.internal.q8g.u3(new Rectangle(var2, var3, var4, var5)));
      this.w1();
   }

   private void n5(com.aspose.slides.internal.x4a.n5 var1, int var2, int var3, int var4, int var5) {
      this.n5.n5(var1);
      this.j5();
      this.n5(var1.k5());
      this.n5(var1.l6(), var2, var3, var4, var5);
      this.r4();
      this.w1();
      this.c4();
   }

   private void n5(com.aspose.slides.internal.x4a.u9 var1, com.aspose.slides.internal.x4g.s7 var2) {
      com.aspose.slides.internal.x4g.s7 var3 = (com.aspose.slides.internal.x4g.s7)var2.deepClone();
      if (var3.l6().n5(null, 25.0F)) {
         this.n5.n5(var1);
         this.j5();
         w1[] var4 = var3.a6();
         Point[] var5 = new Point[var4.length];

         for (int var6 = 0; var6 < var4.length; var6++) {
            var5[var6] = new Point((int)var4[var6].l6(), (int)var4[var6].k5());
         }

         this.n5.n5(new com.aspose.slides.internal.q8g.z1(var5));
         this.w1();
      }
   }

   private void n5(com.aspose.slides.internal.x4a.n5 var1, com.aspose.slides.internal.x4g.s7 var2) {
      com.aspose.slides.internal.x4g.s7 var3 = (com.aspose.slides.internal.x4g.s7)var2.deepClone();
      var3.n3();
      this.n5.n5(var1);
      this.j5();
      this.n5(var1.k5());
      this.n5(var1.l6(), var2);
      this.r4();
      this.w1();
      this.c4();
   }

   private void n5(com.aspose.slides.internal.x4a.u9 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.n5.n5(var1);
      this.j5();
      Rectangle var8 = new Rectangle((int)var2, (int)var3, (int)var4, (int)var5);
      Point[] var9 = this.n5(var2, var3, var4, var5, var6, var7);
      this.n5.n5(new com.aspose.slides.internal.q8g.n3(var8, var9[0], var9[1]));
      this.w1();
   }

   private void n5(com.aspose.slides.internal.x4a.n5 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.n5.n5(var1);
      this.j5();
      this.n5(var1.k5());
      this.n5(var1.l6(), var2, var3, var4, var5, var6, var7);
      this.r4();
      this.w1();
      this.c4();
   }

   private void n5(com.aspose.slides.internal.x4a.u9 var1, Point[] var2) {
      this.n5.n5(var1);
      this.j5();
      this.n5.n5(new com.aspose.slides.internal.q8g.t9(var2));
      this.w1();
   }

   private void n5(com.aspose.slides.internal.x4a.n5 var1, Point[] var2) {
      this.n5.n5(var1);
      this.j5();
      this.n5(var1.k5());
      this.n5(var1.l6(), var2);
      this.r4();
      this.w1();
      this.c4();
   }

   private void n5(com.aspose.slides.internal.x4a.n5 var1, Point[] var2, int var3) {
      if (var3 == 0) {
         this.n5.n5(new com.aspose.slides.internal.r7n.q0((short)1));
      } else if (var3 == 1) {
         this.n5.n5(new com.aspose.slides.internal.r7n.q0((short)2));
      }

      this.n5(var1, var2);
      this.c4();
   }

   private void l6(com.aspose.slides.internal.x4a.u9 var1, Point[] var2) {
      if (var2.length < 2) {
         throw new ArgumentException("Need more points");
      }

      this.n5.n5(var1);
      this.j5();
      this.n5.n5(new com.aspose.slides.internal.r7n.k5(var2[0].x, var2[0].y));

      for (int var3 = 1; var3 < var2.length; var3++) {
         this.n5.n5(new com.aspose.slides.internal.q8g.t2(var2[var3].x, var2[var3].y));
      }

      this.w1();
   }

   private void n5(com.aspose.slides.internal.x4a.u9 var1, Rectangle[] var2) {
      this.n5.n5(var1);
      this.j5();

      for (int var3 = 0; var3 < var2.length; var3++) {
         this.n5.n5(new com.aspose.slides.internal.q8g.t4(var2[var3]));
      }

      this.w1();
   }

   private void n5(com.aspose.slides.internal.x4a.n5 var1, Rectangle[] var2) {
      this.n5.n5(var1);
      this.j5();
      this.n5(var1.k5());
      this.n5(var1.l6(), var2);
      this.r4();
      this.w1();
      this.c4();
   }

   private Rectangle[] n5(y2[] var1) {
      Rectangle[] var2 = new Rectangle[var1.length];

      for (int var3 = 0; var3 < var1.length; var3++) {
         var2[var3] = y2.a6(var1[var3]);
      }

      return var2;
   }

   private Rectangle[] n5(y1[] var1) {
      Rectangle[] var2 = new Rectangle[var1.length];

      for (int var3 = 0; var3 < var1.length; var3++) {
         var2[var3] = new Rectangle((int)var1[var3].x8(), (int)var1[var3].n3());
      }

      return var2;
   }

   private Point[] n5(float var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = var1 + var3 / 2.0F;
      double var8 = var2 + var4 / 2.0F;
      double var10 = Math.min(var3 / 2.0F, var4 / 2.0F);
      float var12;
      float var13;
      if (var6 < 0.0F) {
         var12 = var5;
         var13 = var5 + var6;
      } else {
         var12 = var5 + var6;
         var13 = var5;
      }

      Point var14 = new Point((int)(var7 + var10 * Math.cos(var12 * Math.PI / 180.0)), (int)(var8 + var10 * Math.sin(var12 * Math.PI / 180.0)));
      Point var15 = new Point((int)(var7 + var10 * Math.cos(var13 * Math.PI / 180.0)), (int)(var8 + var10 * Math.sin(var13 * Math.PI / 180.0)));
      return new Point[]{var14, var15};
   }

   private Point[] n5(j5[] var1) {
      Point[] var2 = new Point[var1.length];

      for (int var3 = 0; var3 < var1.length; var3++) {
         var2[var3] = j5.u3(var1[var3]);
      }

      return var2;
   }

   private Point[] n5(w1[] var1) {
      Point[] var2 = new Point[var1.length];

      for (int var3 = 0; var3 < var1.length; var3++) {
         var2[var3] = new Point((int)var1[var3].l6(), (int)var1[var3].k5());
      }

      return var2;
   }

   private void j5() {
      this.n5.n5(new com.aspose.slides.internal.x4a.x8(this.u9++));
   }

   private void w1() {
      this.n5.n5(new com.aspose.slides.internal.x4a.t2(--this.u9));
   }

   private void n5(Color var1) {
      if (var1 != null) {
         this.n5.n5(new com.aspose.slides.internal.r7n.e2((short)2));
         this.n5.n5(new com.aspose.slides.internal.r7n.y4(var1));
         this.c8 = var1;
      }
   }

   private void r4() {
      this.n5.n5(new com.aspose.slides.internal.r7n.e2((short)1));
      this.c8 = Color.WHITE;
   }

   private void c4() {
      this.n5.n5(new com.aspose.slides.internal.x4a.n5(new com.aspose.slides.internal.d2n.n5(this.c8)));
      this.j5();
   }

   private c8 n5(u3 var1) {
      c8 var2 = com.aspose.slides.internal.o9b.c8.m3();
      if (var1 instanceof i1) {
         var2 = ((i1)var1).h0();
      } else if (var1 instanceof com.aspose.slides.internal.x4g.n3) {
         var2 = ((com.aspose.slides.internal.x4g.n3)var1).c8();
      }

      return var2;
   }

   private List<y2> n5(y2 var1, List<y2> var2) {
      List var3 = new List();

      for (y2 var5 : var2) {
         y2 var6 = var5.n3();
         var6.n5(var1);
         if (!var6.k5()) {
            y2[] var7 = new y2[]{
               new y2(var5.u3(), var5.c8(), var6.u3() - var5.u3(), var6.c8() - var5.c8()),
               new y2(var6.u3(), var5.c8(), var6.t2(), var6.c8() - var5.c8()),
               new y2(var6.u9(), var5.c8(), var5.u9() - var6.u9(), var6.c8() - var5.c8()),
               new y2(var5.u3(), var6.c8(), var6.u3() - var5.u3(), var6.l6()),
               new y2(var6.u9(), var6.c8(), var5.u9() - var6.u9(), var6.l6()),
               new y2(var5.u3(), var6.n5(), var6.u3() - var5.u3(), var5.n5() - var6.n5()),
               new y2(var6.u3(), var6.n5(), var6.t2(), var5.n5() - var6.n5()),
               new y2(var6.u9(), var6.n5(), var5.u9() - var6.u9(), var5.n5() - var6.n5())
            };

            for (int var8 = 0; var8 < var7.length; var8++) {
               if (var7[var8].t2() > 0 && var7[var8].l6() > 0) {
                  n5(var3, var7[var8]);
               }
            }
         } else {
            n5(var3, var5);
         }
      }

      return var3;
   }

   private static void n5(List<y2> var0, y2 var1) {
      boolean var2 = false;

      for (y2 var4 : var0) {
         if (var4.l6(var1)) {
            var2 = true;
            break;
         }
      }

      if (!var2) {
         var0.addItem(var1);
      }
   }
}
