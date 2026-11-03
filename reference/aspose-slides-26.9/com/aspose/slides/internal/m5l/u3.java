package com.aspose.slides.internal.m5l;

import com.aspose.slides.internal.c1x.y2;
import com.aspose.slides.internal.k4o.c8;
import com.aspose.slides.internal.k4o.h0;
import com.aspose.slides.internal.n1g.u9;
import com.aspose.slides.internal.o6t.q0;
import com.aspose.slides.internal.o9b.p8;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.r7n.r4;
import com.aspose.slides.internal.y5s.j5;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D.Float;
import java.io.InputStream;
import java.util.Iterator;

public final class u3 extends k5 {
   private h0 s7;
   private Rectangle x8;
   private Rectangle n3 = null;
   private float y4;
   private float e2;
   private float t9;
   private Rectangle z1;
   private q0 t4;
   private c8 q0;
   private AffineTransform z3;
   private u3$k5 m1;
   private static byte[] k7 = null;

   private u3() {
      this.j5();
   }

   public u3(InputStream var1) throws com.aspose.slides.internal.p7x.l6 {
      this();
      this.l6(var1);
   }

   private void l6(InputStream var1) throws com.aspose.slides.internal.p7x.l6 {
      com.aspose.slides.internal.n9q.n5 var2 = new com.aspose.slides.internal.n9q.n5();
      var2.n5(var1);
      if (var2.k5() == null) {
         throw new com.aspose.slides.internal.p7x.l6("Not WMF metafile");
      }

      this.s7 = new h0(var2.k5(), var2.l6());
      com.aspose.slides.internal.s2b.u3 var3 = null;

      do {
         var3 = var2.n5();
         if (var3 != null) {
            this.s7.n5(var3);
         }
      } while (var3 != null && var3.n5() != 0);

      this.s7.n5();
      this.m1();
   }

   private void m1() {
      if (this.r4()) {
         this.m1 = new u3$l6(this, this.s7.u9());
      } else {
         this.m1 = new u3$n5(this, null);
      }
   }

   private void k7() {
      if (this.x8 == null || this.k5 == null) {
         this.m3();
      }
   }

   private void m3() {
      this.y4 = this.e2;
      this.x8 = null;
      this.k5 = null;
      if (this.l6()) {
         this.x8 = this.w1().n5;
         this.y4 = this.w1().u3;
         this.z1 = this.x8;
      } else if (this.s7.u3() != null) {
         switch (this.s7.u3().n5()) {
            case 1:
            default:
               this.y4 = this.e2;
               break;
            case 2:
               this.y4 = 254.0F;
               break;
            case 3:
            case 7:
            case 8:
               this.y4 = 2540.0F;
               break;
            case 4:
               this.y4 = 100.0F;
               break;
            case 5:
               this.y4 = 1000.0F;
               break;
            case 6:
               this.y4 = 1440.0F;
         }

         this.x8 = new Rectangle(0, 0, Math.abs(this.s7.u3().l6()), Math.abs(this.s7.u3().k5()));
      }

      if (this.x8 == null) {
         this.z8();
      }

      if (this.x8 == null) {
         Rectangle var1 = new Rectangle(this.t2().k5(), this.t2().u3(), this.t2().a6(), this.t2().u9());
         this.k5 = new Float(var1.x, var1.y, var1.width, var1.height);
         this.x8 = new Rectangle(
            Math.round(this.k5.x / this.e2 * this.y4),
            Math.round(this.k5.y / this.e2 * this.y4),
            Math.round(this.k5.width / this.e2 * this.y4),
            Math.round(this.k5.height / this.e2 * this.y4)
         );
      } else {
         this.k5 = new Float(
            this.x8.x / this.y4 * this.e2, this.x8.y / this.y4 * this.e2, this.x8.width / this.y4 * this.e2, this.x8.height / this.y4 * this.e2
         );
      }
   }

   private void z8() {
      j5 var1 = this.t2();
      this.x8 = var1 == null ? new Rectangle(0, 0, 1, 1) : new Rectangle(var1.k5(), var1.u3(), var1.a6(), var1.u9());
      this.n3 = null;
      Dimension var2 = null;
      Iterator var3 = this.s7();

      while (var3.hasNext()) {
         l6 var4 = (l6)var3.next();
         if (var4.n5() == 524) {
            r4 var5 = (r4)var4;
            var2 = var5.l6();
         } else if (var4.n5() == 9) {
            y2 var6 = (y2)var4;
            var2 = var6.l6();
         }
      }

      if (var2 == null || var2.width <= this.z1.width && var2.height <= this.z1.height) {
         if (this.x8.width > this.z1.width) {
            this.z1.x = (int)(this.z1.x - (this.x8.width - this.z1.width) / 2.0F);
            this.x8.width = this.z1.width;
         }

         if (this.x8.height > this.z1.height) {
            this.z1.y = (int)(this.z1.y - (this.x8.height - this.z1.height) / 2.0F);
            this.x8.height = this.z1.height;
         }
      }

      if (this.x8.width == 0 || this.x8.height == 0) {
         this.x8 = null;
      }
   }

   private void j5() {
      this.e2 = this.t9 = 96.0F;
      p8 var1 = com.aspose.slides.internal.r5w.n5.l6();
      this.z1 = new Rectangle(var1.l6(), var1.k5());
   }

   public com.aspose.slides.internal.n1g.a6 n5() {
      return this.s7.l6();
   }

   private u9 w1() {
      return this.s7.k5();
   }

   public boolean l6() {
      return this.w1() != null;
   }

   public boolean k5() {
      return this.s7.u9() != null;
   }

   public boolean u3() {
      return !this.l6() && !this.k5();
   }

   private boolean r4() {
      return !this.l6() && this.k5();
   }

   @Override
   public boolean a6() {
      return true;
   }

   @Override
   public int u9() {
      return this.l6() ? 2 : 1;
   }

   @Override
   public float h0() {
      return this.m1.n5();
   }

   @Override
   public float c8() {
      return this.m1.l6();
   }

   @Override
   public float x8() {
      return this.m1.a6();
   }

   @Override
   public float n3() {
      return this.m1.u9();
   }

   @Override
   public int y4() {
      return this.m1.k5();
   }

   @Override
   public int e2() {
      return this.m1.u3();
   }

   public j5 t2() {
      return this.m1.h0();
   }

   @Override
   public Float t9() {
      return this.m1.c8();
   }

   @Override
   public Iterator<l6> n5(z1 var1) {
      return this.m1.n5(var1);
   }

   @Override
   public void l6(z1 var1) {
      this.m1.l6(var1);
   }

   @Override
   public void n5(int var1, l6 var2, z1 var3) {
      this.m1.n5(var1, var2, var3);
   }

   @Override
   public void n5(z1 var1, AffineTransform var2) throws com.aspose.slides.internal.p7x.l6 {
      this.m1.n5(var1, var2);
   }

   public Iterator<l6> s7() {
      return this.s7.h0();
   }

   @Override
   public void n5(l6 var1) {
      this.s7.l6(var1);
   }

   private Rectangle c4() {
      this.k7();
      return this.x8;
   }

   private Float y2() {
      this.k7();
      return this.k5;
   }

   public float q0() {
      return this.e2;
   }

   public float z3() {
      this.k7();
      return this.y4;
   }

   // $VF: synthetic method
   static Rectangle n5(u3 var0) {
      return var0.c4();
   }

   // $VF: synthetic method
   static Rectangle l6(u3 var0) {
      return var0.n3;
   }

   // $VF: synthetic method
   static Rectangle n5(u3 var0, Rectangle var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static Float k5(u3 var0) {
      return var0.y2();
   }

   // $VF: synthetic method
   static q0 n5(u3 var0, q0 var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static c8 n5(u3 var0, c8 var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static h0 u3(u3 var0) {
      return var0.s7;
   }

   // $VF: synthetic method
   static c8 a6(u3 var0) {
      return var0.q0;
   }

   // $VF: synthetic method
   static q0 u9(u3 var0) {
      return var0.t4;
   }

   // $VF: synthetic method
   static AffineTransform h0(u3 var0) {
      return var0.z3;
   }

   // $VF: synthetic method
   static void c8(u3 var0) {
      var0.k7();
   }

   // $VF: synthetic method
   static Rectangle t2(u3 var0) {
      return var0.z1;
   }

   // $VF: synthetic method
   static float s7(u3 var0) {
      return var0.e2;
   }

   // $VF: synthetic method
   static float x8(u3 var0) {
      return var0.t9;
   }

   // $VF: synthetic method
   static float n3(u3 var0) {
      return var0.y4;
   }
}
