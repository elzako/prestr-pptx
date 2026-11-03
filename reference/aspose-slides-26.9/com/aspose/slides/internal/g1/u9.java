package com.aspose.slides.internal.g1;

import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.internal.k1.e2;
import com.aspose.slides.internal.k1.s7;
import com.aspose.slides.internal.k1.x8;
import com.aspose.slides.internal.k1.z1;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.o9b.j5;
import com.aspose.slides.internal.o9b.m3;
import com.aspose.slides.internal.o9b.p8;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.ms.System.q1;

public class u9 {
   private com.aspose.slides.internal.o1.a6 n5;
   private float l6;
   private float k5;
   private int u3 = 1;
   private y2 a6 = new y2();
   private y2 u9 = new y2();
   private a0 h0 = new a0();
   private boolean c8 = true;
   private m1 t2 = new m1();
   private m1 s7 = new m1();
   private m1 x8 = new m1();
   private Object[] n3 = new Object[0];
   private com.aspose.slides.internal.o9b.u3 y4;
   private m3 e2;
   private s7 t9;
   private com.aspose.slides.internal.o9b.c8 z1 = com.aspose.slides.internal.o9b.c8.m3().o8();
   private int t4 = 2;
   private com.aspose.slides.internal.o9b.c8 q0 = com.aspose.slides.internal.o9b.c8.w4().o8();
   private int z3;
   private int m1;
   private j5 k7 = new j5(0, 0);
   private int m3 = 13;
   private com.aspose.slides.internal.o9b.l6 z8;
   private com.aspose.slides.internal.o9b.l6 j5;
   private int w1;
   private int r4;
   private com.aspose.slides.internal.y6.k5 c4;
   private int y2 = 3;
   private short y1;
   private Stack<c8> a0 = new Stack<>();
   private a0 d2;
   private int d5;
   private boolean s3;
   private a0 p8 = new a0();
   private m1 f2 = new m1();
   private y2 i1 = new y2(-4194304, -4194304, 8388608, 8388608);
   private boolean e5;
   private com.aspose.slides.internal.o1.u3 b3;

   public u9(boolean var1) {
      this.c8 = var1;
   }

   public u9(com.aspose.slides.internal.o1.a6 var1) {
      this.n5 = var1;
      this.c8 = this.n5.l6().l6() == 2;
   }

   public final int n5() {
      return this.u3;
   }

   public final void n5(int var1) {
      this.u3 = var1;
      this.e5();
      this.i1();
   }

   public final y2 l6() {
      return this.a6;
   }

   public final void n5(y2 var1) {
      var1.u3(this.a6);
   }

   public final void n5(j5 var1) {
      this.a6.n5(var1.k5());
      this.i1();
   }

   public final y2 k5() {
      return this.u9;
   }

   public final void l6(y2 var1) {
      var1.u3(this.u9);
   }

   public final void l6(j5 var1) {
      this.u9.n5(var1.k5());
      this.i1();
   }

   public final void n5(p8 var1) {
      this.u9.l6(var1.u3());
      this.i1();
   }

   public final m1 u3() {
      return this.t2.u9();
   }

   public final void n5(m1 var1) {
      this.t2 = var1;
   }

   public final m1 a6() {
      return this.s7.u9();
   }

   public final void l6(m1 var1) {
      this.s7 = var1;
   }

   public final m1 u9() {
      return this.x8.u9();
   }

   public final void k5(m1 var1) {
      this.x8 = var1;
   }

   public final void u3(m1 var1) {
      this.f2 = var1;
   }

   public final void n5(a0 var1) {
      this.p8 = var1;
   }

   public final Object[] h0() {
      return this.n3;
   }

   public final void n5(Object[] var1) {
      this.n3 = var1;
   }

   public final com.aspose.slides.internal.o9b.u3 c8() {
      return this.y4;
   }

   public final void n5(com.aspose.slides.internal.o9b.u3 var1) {
      this.y4 = var1;
   }

   public final m3 t2() {
      return this.e2;
   }

   public final void n5(m3 var1) {
      this.e2 = var1;
   }

   public final void l6(a0 var1) {
      this.d2 = var1;
   }

   public final s7 s7() {
      return this.t9;
   }

   public final void n5(s7 var1) {
      this.t9 = var1;
   }

   public final com.aspose.slides.internal.y6.k5 x8() {
      return this.c4;
   }

   public final void n5(com.aspose.slides.internal.y6.k5 var1) {
      this.c4 = var1;
   }

   public final com.aspose.slides.internal.o9b.c8 n3() {
      return this.z1;
   }

   public final void n5(com.aspose.slides.internal.o9b.c8 var1) {
      var1.n5(this.z1);
   }

   public final int y4() {
      return this.t4;
   }

   public final void l6(int var1) {
      this.t4 = var1;
   }

   public final com.aspose.slides.internal.o9b.c8 e2() {
      return this.q0;
   }

   public final void l6(com.aspose.slides.internal.o9b.c8 var1) {
      var1.n5(this.q0);
   }

   public final int t9() {
      return this.z3;
   }

   public final void k5(int var1) {
      this.z3 = var1;
   }

   public final int z1() {
      return this.m1;
   }

   public final void u3(int var1) {
      this.m1 = var1;
   }

   public final j5 t4() {
      return this.k7;
   }

   public final void k5(j5 var1) {
      var1.k5(this.k7);
   }

   public final int q0() {
      return this.m3;
   }

   public final void a6(int var1) {
      this.m3 = var1;
   }

   public final com.aspose.slides.internal.o9b.l6 z3() {
      return this.z8;
   }

   public final void n5(com.aspose.slides.internal.o9b.l6 var1) {
      this.z8 = var1;
   }

   public final com.aspose.slides.internal.o9b.l6 m1() {
      return this.j5;
   }

   public final void l6(com.aspose.slides.internal.o9b.l6 var1) {
      this.j5 = var1;
   }

   public final boolean k7() {
      return this.e5;
   }

   public final void n5(boolean var1) {
      this.e5 = var1;
   }

   public final a0 m3() {
      return this.h0;
   }

   public final void k5(a0 var1) {
      this.h0 = var1;
   }

   public final int z8() {
      return this.w1;
   }

   public final void u9(int var1) {
      this.w1 = var1;
   }

   public final int j5() {
      return this.r4;
   }

   public final void h0(int var1) {
      this.r4 = var1;
   }

   public final int w1() {
      return this.y2;
   }

   public final void c8(int var1) {
      this.y2 = var1;
   }

   public final short r4() {
      return this.y1;
   }

   public final void n5(short var1) {
      this.y1 = var1;
   }

   public final int c4() {
      return this.d5;
   }

   public final void t2(int var1) {
      this.d5 = var1;
   }

   public final boolean y2() {
      return this.s3;
   }

   public final void l6(boolean var1) {
      this.s3 = var1;
   }

   public final int y1() {
      return this.n5 != null ? this.n5.l6().u9() : 0;
   }

   public final int a0() {
      return this.n5 != null ? this.n5.l6().h0() : 0;
   }

   public final boolean d2() {
      return this.c8;
   }

   public final y2 d5() {
      return this.i1;
   }

   public final void k5(y2 var1) {
      var1.u3(this.i1);
   }

   public final void s3() {
      c8 var1 = new c8();
      var1.n5(this.n5());
      var1.n5(this.l6().n3());
      var1.l6(this.k5().n3());
      if (this.u3() != null) {
         var1.n5(this.u3().u9());
      }

      if (this.a6() != null) {
         var1.l6(this.a6().u9());
      }

      if (this.u9() != null) {
         var1.k5(this.u9().u9());
      }

      if (this.c8() != null) {
         var1.n5((com.aspose.slides.internal.o9b.u3)this.c8().deepClone());
      }

      if (this.t2() != null) {
         var1.n5((m3)this.t2().deepClone());
      }

      var1.n5(this.s7());
      var1.n5(this.x8());
      var1.n5(this.n3().o8());
      var1.l6(this.y4());
      var1.l6(this.e2().o8());
      var1.k5(this.t9());
      var1.u3(this.z1());
      var1.n5(this.t4().k5());
      var1.a6(this.q0());
      if (this.m3() != null) {
         var1.n5(this.m3().l6());
      }

      var1.k5(this.d5().n3());
      var1.u9(this.z8());
      var1.h0(this.j5());
      var1.c8(this.w1());
      var1.n5(this.r4());
      var1.t2(this.c4());
      var1.n5(this.y2());
      this.a0.push(var1);
   }

   public final void l6(short var1) {
      c8 var2 = null;
      if (var1 >= 0) {
         if (this.a0.size() <= var1) {
            return;
         }

         while (this.a0.size() > var1) {
            var2 = this.a0.pop();
         }
      } else if (var1 < 0) {
         while (var1 < 0) {
            var2 = this.a0.pop();
            var1++;
         }
      }

      if (var2 != null) {
         this.u3 = var2.n5();
         this.t2 = var2.u3();
         this.n5(var2.l6().n3());
         this.l6(var2.k5().n3());
         this.s7 = var2.a6();
         this.x8 = var2.u9();
         this.y4 = var2.h0();
         this.e2 = var2.c8();
         this.t9 = var2.t2();
         this.c4 = var2.s7();
         var2.x8().n5(this.z1);
         this.t4 = var2.n3();
         var2.y4().n5(this.q0);
         this.z3 = var2.e2();
         this.m1 = var2.t9();
         var2.z1().k5(this.k7);
         this.m3 = var2.t4();
         this.h0 = var2.q0();
         this.k5(var2.z3().n3());
         this.w1 = var2.m1();
         this.r4 = var2.k7();
         this.y2 = var2.m3();
         this.y1 = var2.z8();
         this.t2(var2.j5());
         this.l6(var2.w1());
      }
   }

   public final void n5(Object var1) {
      for (int var2 = 0; var2 < this.n3.length; var2++) {
         if (this.n3[var2] == null) {
            this.n3[var2] = var1;
            break;
         }
      }
   }

   public final com.aspose.slides.internal.o9b.u3 s7(int var1) {
      com.aspose.slides.internal.o9b.u3 var2 = null;
      if ((var1 & 65535) >= this.n3.length) {
         throw new IndexOutOfRangeException("object index greater then wmf object table size");
      }

      Object var3 = this.n3[var1 & 65535];
      if (com.aspose.slides.internal.v6g.k5.l6(var3, x8.class)) {
         var2 = com.aspose.slides.internal.v6g.k5.n5(var3, x8.class).u3();
      } else if (com.aspose.slides.internal.v6g.k5.l6(var3, com.aspose.slides.internal.o9b.u3.class)) {
         var2 = (com.aspose.slides.internal.o9b.u3)var3;
      }

      return var2;
   }

   public final a0 x8(int var1) {
      a0 var2 = null;
      if ((var1 & 65535) >= this.n3.length) {
         throw new IndexOutOfRangeException("object index greater then wmf object table size");
      }

      Object var3 = this.n3[var1 & 65535];
      if (com.aspose.slides.internal.v6g.k5.l6(var3, com.aspose.slides.internal.k1.m3.class)) {
         var2 = com.aspose.slides.internal.v6g.k5.n5(var3, com.aspose.slides.internal.k1.m3.class).s7();
      }

      return var2;
   }

   public final void n3(int var1) {
      if ((var1 & 65535) >= this.n3.length) {
         throw new IndexOutOfRangeException("object index greater then wmf object table size");
      }

      Object var2 = this.n3[var1 & 65535];
      if (com.aspose.slides.internal.v6g.k5.l6(var2, x8.class)) {
         this.n5(com.aspose.slides.internal.v6g.k5.n5(var2, x8.class).u3());
      } else if (com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.o9b.u3.class)) {
         this.n5((com.aspose.slides.internal.o9b.u3)var2);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var2, z1.class)) {
         this.n5(com.aspose.slides.internal.v6g.k5.n5(var2, z1.class).u3());
      } else if (com.aspose.slides.internal.v6g.k5.l6(var2, s7.class)) {
         this.n5(com.aspose.slides.internal.v6g.k5.n5(var2, s7.class));
      } else if (com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.k1.m3.class)) {
         this.l6(com.aspose.slides.internal.v6g.k5.n5(var2, com.aspose.slides.internal.k1.m3.class).s7());
      }
   }

   public final void y4(int var1) {
      if ((var1 & 65535) >= this.n3.length) {
         throw new IndexOutOfRangeException("object index is greater then wmf object table size");
      }

      this.n3[var1 & 65535] = null;
   }

   public final void e2(int var1) {
      if ((var1 & 65535) >= this.n3.length) {
         throw new IndexOutOfRangeException("Palette index greater then wmf object table size");
      }

      Object var2 = this.n3[var1 & 65535];
      if (com.aspose.slides.internal.v6g.k5.l6(var2, e2.class)) {
         this.n5(com.aspose.slides.internal.y6.k5.n5(com.aspose.slides.internal.v6g.k5.n5(var2, e2.class)));
      } else {
         throw new ArgumentException("Selected object is not WmfPalette object");
      }
   }

   public final m1 p8() {
      m1 var1 = new m1();
      var1.n5(this.u3(), 1);
      var1.n5(this.u9(), 1);
      var1.n5(this.a6(), 1);
      return var1;
   }

   public final m1 f2() {
      float var1 = 0.0F;
      float var2 = 0.0F;
      float var3 = 25.4F;
      float var4;
      float var5;
      switch (this.n5()) {
         case 1:
            var4 = 1.0F;
            var5 = 1.0F;
            break;
         case 2:
            var5 = this.l6 / 10.0F;
            var4 = -this.k5 / 10.0F;
            break;
         case 3:
            var5 = this.l6 / 100.0F;
            var4 = -this.k5 / 100.0F;
            break;
         case 4:
            var5 = this.l6 * var3 / 100.0F;
            var4 = -this.k5 * var3 / 100.0F;
            break;
         case 5:
            var5 = this.l6 * var3 / 1000.0F;
            var4 = -this.k5 * var3 / 1000.0F;
            break;
         case 6:
            var5 = this.l6 * var3 / 1440.0F;
            var4 = -this.k5 * var3 / 1440.0F;
            break;
         case 7:
         case 8:
            var5 = !this.k5().k5() && !this.l6().k5() ? (float)this.k5().t2() / this.l6().t2() : 1.0F;
            var4 = !this.k5().k5() && !this.l6().k5() ? (float)this.k5().l6() / this.l6().l6() : 1.0F;
            break;
         default:
            return new m1();
      }

      var1 = -this.l6().s7() * var5 + this.k5().s7();
      var2 = -this.l6().x8() * var4 + this.k5().x8();
      m1 var6 = new m1();
      var6.k5(var1, var2);
      var6.n5(var5, var4);
      return var6;
   }

   public final void i1() {
      this.n5(this.f2());
   }

   public final void e5() {
      if (this.n5() == 7) {
         double var1 = (float)this.k5().t2() / this.l6().t2();
         double var3 = (float)this.k5().l6() / this.l6().l6();
         double var5 = q1.k5(q1.n5(var1), q1.n5(var3));
         y2 var7 = this.k5().n3();
         var7.l6(
            new p8(
               com.aspose.slides.internal.v6g.k5.u3(q1.u3(this.l6().t2() * var5 * q1.u9(var1)), 14),
               com.aspose.slides.internal.v6g.k5.u3(q1.u3(this.l6().l6() * var5 * q1.u9(var3)), 14)
            )
         );
         this.l6(var7.n3());
      }
   }

   public final void n5(float var1) {
      this.l6 = var1;
   }

   public final void l6(float var1) {
      this.k5 = var1;
   }

   public final com.aspose.slides.internal.o1.u3 b3() {
      return this.b3;
   }

   public final void n5(com.aspose.slides.internal.o1.u3 var1) {
      this.b3 = var1;
   }
}
