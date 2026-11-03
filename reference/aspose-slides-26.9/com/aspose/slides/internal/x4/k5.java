package com.aspose.slides.internal.x4;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class k5 implements Cloneable {
   private y1 n5 = new y1();
   private final n3 l6;
   private final com.aspose.slides.internal.y3.u3 k5;
   private y1 u3 = com.aspose.slides.internal.o9b.y1.n5.y4();
   private int a6;
   private int u9;
   private com.aspose.slides.internal.p1s.n5 h0;
   private com.aspose.slides.internal.p1s.n5 c8;
   private int t2;
   private int s7;
   private int x8;
   private int n3;
   private int y4;
   private int e2;
   private int t9;
   private int z1;
   private int t4;
   private int q0;
   private int z3;
   private int m1;
   private int k7;
   private com.aspose.slides.internal.w0.c8 m3;
   private com.aspose.slides.internal.w0.c8 z8;
   private a0 j5;
   private t2 w1;
   private a6 r4;
   private h0 c4;
   private com.aspose.slides.internal.w0.s7 y2;
   private com.aspose.slides.internal.w0.l6 y1;
   private com.aspose.slides.internal.p1s.l6 a0;
   private f2 d2 = f2.n5.a6();
   private boolean d5;

   public k5(n3 var1, com.aspose.slides.internal.y3.u3 var2) {
      if (var2 == null) {
         throw new ArgumentNullException("metafileInfo");
      }

      this.l6 = var1;
      this.k5 = var2;
      this.m1();
   }

   public final f2 n5(String var1) {
      f2 var2 = this.a6().l6(var1).a6();
      return new f2(var2.l6() + var1.length() * this.s7, var2.k5());
   }

   public final void n5(int var1) {
      l6 var2 = this.l6.c8().n5(var1);
      if (var2 == null) {
         throw new InvalidOperationException(d1.n5("No Gdi object for handle {0}=0x{1:x}.",new Object[]{ var1, var1}));
      }

      switch (var2.n5()) {
         case 1:
            this.r4 = (a6)var2;
            this.k7();
            break;
         case 2:
            this.w1 = (t2)var2;
            this.y2 = null;
            break;
         case 3:
         case 5:
         case 7:
         case 8:
         case 9:
         default:
            throw new InvalidOperationException("Unknown GDI object type.");
         case 4:
         case 10:
         case 11:
            break;
         case 6:
            this.c4 = (h0)var2;
            this.a0 = null;
      }
   }

   public final void n5(w1 var1) {
      this.u3 = new y1(var1.l6(), var1.k5(), this.u3.s7(), this.u3.k5());
   }

   public final void n5(f2 var1) {
      this.u3 = new y1(this.u3.x8(), this.u3.n3(), var1.l6(), var1.k5());
      this.d5 = true;
   }

   public final void l6(f2 var1) {
      k5(var1.a6()).l6(this.d2);
   }

   public final k5 n5() {
      k5 var1 = (k5)this.z3();
      if (this.m3 != null) {
         var1.m3 = this.m3.k5();
      }

      if (this.z8 != null) {
         var1.z8 = this.z8.k5();
      }

      if (this.j5 != null) {
         var1.j5 = this.j5.l6();
      }

      return var1;
   }

   private void m1() {
      com.aspose.slides.internal.y3.u3.n5.a6(this.u3);
      this.a6 = 2;
      this.u9 = 8;
      this.h0 = com.aspose.slides.internal.p1s.n5.b4;
      this.c8 = com.aspose.slides.internal.p1s.n5.c8;
      this.t2 = 0;
      this.s7 = 0;
      this.x8 = 1;
      this.n3 = 1;
      this.y4 = 13;
      this.e2 = 3;
      this.t9 = 0;
      this.z1 = 1;
      this.t4 = 0;
      this.q0 = 0;
      this.z3 = 0;
      this.m1 = 4;
      this.k7 = 1;
      this.m3 = new com.aspose.slides.internal.w0.c8();
      this.j5 = null;
      this.w1 = new t2();
      this.r4 = new a6();
      this.c4 = new h0();
      this.y2 = new com.aspose.slides.internal.w0.s7(this.c8);
      this.y2.l6(2);
      this.y2.k5(2);
      this.y2.u3(2);
      this.y1 = new com.aspose.slides.internal.w0.n3(this.h0);
      this.a0 = com.aspose.slides.internal.e1x.x8.u3().n5("Microsoft Sans Serif", 12.0F, 0);
      this.k5.q0().l6(this.d2);
      this.d5 = false;
   }

   private void k7() {
      if (this.r4 != null && this.r4.k5() == 2) {
         this.r4.l6(this.c8() == 2 ? this.h0 : com.aspose.slides.internal.p1s.n5.b2);
      }

      this.y1 = null;
   }

   public final com.aspose.slides.internal.w0.s7 l6() {
      if (this.y4 == 11) {
         return null;
      }

      if (this.y2 == null) {
         this.y2 = this.w1.n5(this.h0());
      }

      return this.y2;
   }

   public final com.aspose.slides.internal.w0.l6 k5() {
      if (this.y1 == null) {
         this.y1 = this.r4.n5(this.m3());
      }

      return this.y1;
   }

   public final com.aspose.slides.internal.w0.l6 l6(int var1) {
      a6 var2 = (a6)this.l6.c8().n5(var1);
      return var2.n5(this.m3());
   }

   private com.aspose.slides.internal.w0.c8 m3() {
      com.aspose.slides.internal.w0.c8 var1 = new com.aspose.slides.internal.w0.c8();
      switch (this.l6.u3().z1()) {
         case 2:
            float var2 = this.l6.u3().s7() / 96.0F;
            var1.n5(var2, var2, 0);
            break;
         default:
            var1.n5(1.0F / this.z1().u3(), 1.0F / this.z1().h0(), 0);
      }

      return var1;
   }

   public final h0 u3() {
      return this.c4;
   }

   public final com.aspose.slides.internal.p1s.l6 a6() {
      if (this.a0 == null) {
         this.a0 = this.c4.k5();
      }

      return this.a0;
   }

   public final y1 u9() {
      return this.u3;
   }

   public final com.aspose.slides.internal.p1s.n5 h0() {
      return this.a6 == 1 ? new com.aspose.slides.internal.p1s.n5(0, this.h0) : this.h0;
   }

   public final void n5(com.aspose.slides.internal.p1s.n5 var1) {
      this.h0 = var1;
      this.k7();
   }

   public final int c8() {
      return this.a6;
   }

   public final void k5(int var1) {
      this.a6 = var1;
      this.k7();
   }

   public final com.aspose.slides.internal.p1s.n5 t2() {
      return this.c8;
   }

   public final void l6(com.aspose.slides.internal.p1s.n5 var1) {
      this.c8 = var1;
   }

   public final int s7() {
      return this.t2;
   }

   public final void u3(int var1) {
      this.t2 = var1;
   }

   public final void a6(int var1) {
      this.u9 = var1;
      this.k5.q0().l6(this.d2);
      this.d5 = false;
   }

   public final int x8() {
      return this.x8;
   }

   public final void u9(int var1) {
      this.x8 = var1;
   }

   public final void h0(int var1) {
      this.n3 = var1;
   }

   public final int n3() {
      return this.y4;
   }

   public final void c8(int var1) {
      if (var1 != this.y4) {
         this.y4 = var1;
         this.y2 = null;
      }
   }

   public final void t2(int var1) {
      this.e2 = var1;
   }

   public final int y4() {
      return this.s7;
   }

   public final void s7(int var1) {
      this.s7 = var1;
   }

   public final y1 e2() {
      return this.n5.y4();
   }

   public final void n5(y1 var1) {
      this.n5 = var1.y4();
   }

   private com.aspose.slides.internal.w0.c8 z8() {
      if (this.z8 == null) {
         this.t9();
      }

      return this.z8;
   }

   public final void t9() {
      this.z8 = new com.aspose.slides.internal.w0.c8();
      switch (this.u9) {
         case 1:
            break;
         case 2:
            this.z8.n5(com.aspose.slides.internal.n2d.t2.k5(), -com.aspose.slides.internal.n2d.t2.k5(), 0);
            break;
         case 3:
            this.z8.n5(com.aspose.slides.internal.n2d.t2.u3(), -com.aspose.slides.internal.n2d.t2.u3(), 0);
            break;
         case 4:
            this.z8.n5(com.aspose.slides.internal.n2d.t2.n5(), -com.aspose.slides.internal.n2d.t2.n5(), 0);
            break;
         case 5:
            this.z8.n5(com.aspose.slides.internal.n2d.t2.l6(), -com.aspose.slides.internal.n2d.t2.l6(), 0);
            break;
         case 6:
            this.z8.n5(0.05F, -0.05F, 0);
            break;
         case 7:
            this.j5();
            if (this.d5) {
               f2 var1 = k5(this.u3.c8().a6()).a6();
               float var4 = var1.l6() == 0.0F ? 0.0F : this.d2.l6() / var1.l6();
               float var5 = var1.k5() == 0.0F ? 0.0F : this.d2.k5() / var1.k5();
               this.z8.l6(-this.u9().x8() * var4 + this.l6.u9().x8(), -this.u9().n3() * var5 + this.l6.u9().n3(), 0);
               this.z8.n5(var4, var5, 0);
            } else {
               this.z8.n5(com.aspose.slides.internal.n2d.t2.k5(), -com.aspose.slides.internal.n2d.t2.k5(), 0);
            }
            break;
         case 8:
            this.j5();
            float var2 = this.u3.s7() == 0.0F ? 0.0F : this.l6.u9().s7() / this.u3.s7();
            float var3 = this.u3.k5() == 0.0F ? 0.0F : this.l6.u9().k5() / this.u3.k5();
            this.z8.l6(-this.u9().x8() * var2 + this.l6.u9().x8(), -this.u9().n3() * var3 + this.l6.u9().n3(), 0);
            this.z8.n5(var2, var3, 0);
            break;
         default:
            throw new InvalidOperationException("Unknown mapping mode.");
      }
   }

   private void j5() {
      if (this.l6.u9().s7() == 0.0F) {
         throw new InvalidOperationException("Viewport width is invalid.");
      }

      if (this.l6.u9().k5() == 0.0F) {
         throw new InvalidOperationException("Viewport height is invalid.");
      }
   }

   public final com.aspose.slides.internal.w0.c8 z1() {
      com.aspose.slides.internal.w0.c8 var1 = this.z8().k5();
      var1.n5(this.m3, 0);
      return var1;
   }

   public final void n5(com.aspose.slides.internal.w0.c8 var1) {
      this.m3 = var1;
   }

   public final void n5(com.aspose.slides.internal.w0.c8 var1, int var2) {
      switch (var2) {
         case 1:
            this.m3 = new com.aspose.slides.internal.w0.c8();
            break;
         case 2:
            this.m3.n5(var1, 0);
            break;
         case 3:
            this.m3.n5(var1, 1);
            break;
         case 4:
            this.n5(var1);
      }
   }

   private static f2 k5(f2 var0) {
      float var1 = q1.n5(var0.l6());
      float var2 = q1.n5(var0.k5());
      float var3 = var1 < var2 ? var1 : var2;
      var1 = q1.l6(var0.l6()) * var3;
      var2 = q1.l6(var0.k5()) * var3;
      return new f2(var1, var2);
   }

   public final a0 t4() {
      if (this.j5 == null) {
         this.j5 = new a0();
      }

      return this.j5;
   }

   public final void n5(a0 var1) {
      this.j5 = var1;
   }

   public final boolean q0() {
      return this.j5 != null;
   }

   protected Object z3() {
      try {
         return this.clone();
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }
}
