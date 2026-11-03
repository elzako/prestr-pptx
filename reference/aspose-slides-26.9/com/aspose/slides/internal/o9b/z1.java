package com.aspose.slides.internal.o9b;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.AffineTransform;

public abstract class z1 implements IDisposable {
   public static z1 n5(t4 var0) {
      if (var0 == null) {
         throw new ArgumentNullException("Value of 'image' cannot be null");
      } else if (var0 instanceof com.aspose.slides.internal.j9e.y4) {
         return new k7((com.aspose.slides.internal.j9e.y4)var0);
      } else if (var0 instanceof l6) {
         return com.aspose.slides.internal.r5w.x8.n5((l6)var0);
      } else {
         throw new ArgumentException("Unsupported image type: " + var0.getClass().getName(), "image");
      }
   }

   @Override
   public abstract void dispose();

   public abstract void n5(c8 var1);

   public abstract void n5(m3 var1, y2 var2, float var3, float var4);

   public abstract void n5(m3 var1, y1 var2, float var3, float var4);

   public abstract void n5(m3 var1, float var2, float var3, float var4, float var5, float var6, float var7);

   public abstract void n5(m3 var1, j5[] var2);

   public abstract void n5(m3 var1, w1[] var2);

   public abstract void n5(m3 var1, w1[] var2, float var3, int var4);

   public abstract void l6(m3 var1, j5[] var2);

   public abstract void n5(m3 var1, w1[] var2, int var3, int var4, float var5);

   public abstract void n5(m3 var1, y2 var2);

   public abstract void n5(m3 var1, y1 var2);

   public abstract void n5(t4 var1, j5 var2);

   public abstract void n5(t4 var1, w1 var2);

   public abstract void n5(t4 var1, y2 var2);

   public abstract void n5(t4 var1, y1 var2);

   public abstract void n5(t4 var1, int var2, int var3);

   public abstract void n5(t4 var1, float var2, float var3);

   public abstract void n5(t4 var1, y2 var2, y2 var3, int var4);

   public abstract void n5(t4 var1, y1 var2, y1 var3, int var4);

   public abstract void n5(t4 var1, w1[] var2, y1 var3, int var4);

   public abstract void n5(t4 var1, j5[] var2, y2 var3, int var4, com.aspose.slides.internal.j9e.t2 var5);

   public abstract void n5(t4 var1, w1[] var2, y1 var3, int var4, com.aspose.slides.internal.j9e.t2 var5);

   public abstract void n5(t4 var1, int var2, int var3, int var4, int var5);

   public abstract void n5(t4 var1, float var2, float var3, float var4, float var5);

   public abstract void n5(t4 var1, int var2, int var3, y2 var4, int var5);

   public abstract void n5(t4 var1, y2 var2, float var3, float var4, float var5, float var6, int var7);

   public abstract void n5(t4 var1, y2 var2, int var3, int var4, int var5, int var6, int var7, com.aspose.slides.internal.j9e.t2 var8);

   public abstract void n5(t4 var1, y2 var2, float var3, float var4, float var5, float var6, int var7, com.aspose.slides.internal.j9e.t2 var8);

   public abstract void l6(t4 var1, int var2, int var3);

   public abstract void n5(m3 var1, w1 var2, w1 var3);

   public abstract void n5(m3 var1, j5 var2, j5 var3);

   public abstract void n5(m3 var1, int var2, int var3, int var4, int var5);

   public abstract void n5(m3 var1, float var2, float var3, float var4, float var5);

   public abstract void l6(m3 var1, w1[] var2);

   public abstract void k5(m3 var1, j5[] var2);

   public abstract void n5(m3 var1, com.aspose.slides.internal.x4g.s7 var2);

   public abstract void l6(m3 var1, y2 var2, float var3, float var4);

   public abstract void l6(m3 var1, y1 var2, float var3, float var4);

   public abstract void u3(m3 var1, j5[] var2);

   public abstract void k5(m3 var1, w1[] var2);

   public abstract void l6(m3 var1, y2 var2);

   public abstract void l6(m3 var1, float var2, float var3, float var4, float var5);

   public abstract void n5(m3 var1, y1[] var2);

   public abstract void n5(String var1, n3 var2, u3 var3, y1 var4);

   public abstract void n5(String var1, n3 var2, u3 var3, w1 var4);

   public abstract void n5(String var1, n3 var2, u3 var3, w1 var4, e5 var5);

   public abstract void n5(String var1, n3 var2, u3 var3, y1 var4, e5 var5);

   public abstract void n5(String var1, n3 var2, u3 var3, float var4, float var5, e5 var6);

   public abstract void n5(com.aspose.slides.internal.x4g.t2 var1);

   public abstract com.aspose.slides.internal.x4g.t2 n5();

   public abstract com.aspose.slides.internal.x4g.t2 n5(y1 var1, y1 var2, int var3);

   public abstract com.aspose.slides.internal.x4g.x8 l6();

   public abstract void n5(com.aspose.slides.internal.x4g.x8 var1);

   public abstract void n5(u3 var1, w1[] var2, int var3, float var4);

   public abstract void n5(u3 var1, y2 var2);

   public abstract void n5(u3 var1, y1 var2);

   public abstract void n5(u3 var1, com.aspose.slides.internal.x4g.s7 var2);

   public abstract void n5(u3 var1, y2 var2, float var3, float var4);

   public abstract void n5(u3 var1, float var2, float var3, float var4, float var5, float var6, float var7);

   public abstract void n5(u3 var1, w1[] var2);

   public abstract void n5(u3 var1, j5[] var2, int var3);

   public abstract void n5(u3 var1, w1[] var2, int var3);

   public abstract void l6(u3 var1, y1 var2);

   public abstract void l6(u3 var1, y2 var2);

   public abstract void n5(u3 var1, int var2, int var3, int var4, int var5);

   public abstract void n5(u3 var1, float var2, float var3, float var4, float var5);

   public abstract void n5(u3 var1, y1[] var2);

   public abstract void n5(u3 var1, a0 var2);

   public abstract void k5();

   public abstract void n5(a0 var1);

   public abstract a0[] n5(String var1, n3 var2, y1 var3, e5 var4);

   public abstract f2 n5(String var1, n3 var2);

   public abstract f2 n5(String var1, n3 var2, f2 var3, e5 var4);

   public abstract f2 n5(String var1, n3 var2, int var3, e5 var4);

   public abstract f2 n5(String var1, n3 var2, w1 var3, e5 var4);

   public abstract void n5(com.aspose.slides.internal.x4g.m1 var1);

   public abstract void n5(com.aspose.slides.internal.x4g.m1 var1, int var2);

   public abstract void u3();

   public abstract void a6();

   public abstract void n5(float var1, int var2);

   public abstract void n5(float var1, float var2);

   public abstract void n5(float var1, float var2, int var3);

   public abstract void n5(y1 var1);

   public abstract void l6(a0 var1);

   public abstract void n5(y2 var1, int var2);

   public abstract void n5(y1 var1, int var2);

   public abstract void n5(a0 var1, int var2);

   public abstract void n5(com.aspose.slides.internal.x4g.s7 var1, int var2);

   public abstract void l6(float var1, float var2);

   public abstract void l6(float var1, float var2, int var3);

   public abstract a0 u9();

   public abstract y1 h0();

   public abstract int c8();

   public abstract void n5(int var1);

   public abstract int t2();

   public abstract void l6(int var1);

   public abstract float s7();

   public abstract float x8();

   public abstract int n3();

   public abstract void k5(int var1);

   public abstract float y4();

   public abstract void n5(float var1);

   public abstract int e2();

   public abstract void u3(int var1);

   public abstract int t9();

   public abstract void a6(int var1);

   public abstract j5 z1();

   public abstract void n5(j5 var1);

   public abstract int t4();

   public abstract void u9(int var1);

   public abstract int q0();

   public abstract void h0(int var1);

   public abstract int z3();

   public abstract void c8(int var1);

   public abstract com.aspose.slides.internal.x4g.m1 m1();

   public abstract void l6(com.aspose.slides.internal.x4g.m1 var1);

   public com.aspose.slides.internal.x4g.m1 k7() {
      return com.aspose.slides.internal.x4g.m1.n5(this.z8().getTransform());
   }

   public void k5(com.aspose.slides.internal.x4g.m1 var1) {
      this.z8().setTransform(var1.t2());
   }

   public void n5(AffineTransform var1) {
      this.z8().transform(var1);
   }

   public abstract Shape m3();

   public abstract Graphics2D z8();

   public static Graphics2D n5(z1 var0) {
      return var0 == null ? null : var0.z8();
   }

   public static z1 n5(Graphics2D var0) {
      return com.aspose.slides.internal.r5w.x8.l6(var0);
   }
}
