package com.aspose.slides.internal.r6;

import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.k1.t2;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.o9b.i1;
import com.aspose.slides.internal.o9b.j5;
import com.aspose.slides.internal.o9b.m3;
import com.aspose.slides.internal.o9b.n3;
import com.aspose.slides.internal.o9b.p8;
import com.aspose.slides.internal.o9b.u6;
import com.aspose.slides.internal.o9b.v4;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.t5.e2;
import com.aspose.slides.internal.t5.t4;
import com.aspose.slides.internal.t5.x8;
import com.aspose.slides.internal.t5.z3;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.x4g.s7;
import com.aspose.slides.ms.System.d5;
import com.aspose.slides.ms.System.q1;

public class u9 {
   private n5 c8;
   private Object t2;
   protected p8 n5 = new p8();
   protected p8 l6 = new p8();
   protected float k5;
   protected float u3;
   private m1 s7 = new m1();
   private m1 x8 = new m1();
   private Stack<h0> n3 = new Stack<>();
   private s7 y4;
   private s7 e2;
   private a0 t9 = null;
   private k5 z1;
   private com.aspose.slides.internal.o9b.c8 t4 = com.aspose.slides.internal.o9b.c8.w4().o8();
   private com.aspose.slides.internal.o9b.c8 q0 = com.aspose.slides.internal.o9b.c8.m3().o8();
   private long z3 = 0L;
   private long m1 = 0L;
   private long k7 = 2147483653L;
   private long m3 = 0L;
   private long z8 = 0L;
   private com.aspose.slides.internal.y6.k5 j5 = null;
   private Object w1 = null;
   private com.aspose.slides.internal.o9b.u3 r4 = null;
   private m3 c4 = null;
   private n3 y2 = null;
   private j5 y1 = new j5();
   private j5 a0 = new j5();
   private int d2;
   private int d5;
   private long s3 = 0L;
   private long p8;
   private float f2 = 10.0F;
   private long i1;
   private int e5 = 13;
   private int b3;
   private y2 o0 = new y2();
   private y2 z7 = new y2();
   private long v4;
   private long u6 = 1L;
   private long t1;
   private long a5;
   private j5 h2 = new j5();
   private com.aspose.slides.internal.t5.l6 v0;
   private long f0;
   private com.aspose.slides.internal.t5.j5 a3;
   private com.aspose.slides.internal.x3.a6 p3;
   public boolean a6 = false;
   public boolean u9;
   private com.aspose.slides.internal.o9b.l6 x9 = null;
   private c8 y0;
   public u9$n5 h0;

   public u9(n5 var1) {
      this.c8 = var1;
      this.p3 = new com.aspose.slides.internal.x3.a6(this, var1);
   }

   public final void n5(Object var1) {
      if (var1 == null) {
         throw new ArgumentNullException("surface");
      }

      this.t2 = var1;
   }

   public final <TSurface> TSurface n5() {
      if (this.t2 == null) {
         throw new InvalidOperationException();
      } else {
         return (TSurface)this.t2;
      }
   }

   public m1 l6() {
      return com.aspose.slides.internal.v6g.k5.l6(this.t2, z1.class) ? this.<z1>n5().m1() : this.x9();
   }

   public final long k5() {
      return this.z3;
   }

   public final void n5(long var1) {
      this.z3 = var1;
      this.j5 = null;
   }

   public final long u3() {
      return this.m1;
   }

   public final void l6(long var1) {
      this.m1 = var1;
      this.w1 = null;
   }

   public final long a6() {
      return this.k7;
   }

   public final void k5(long var1) {
      this.k7 = var1;
      this.r4 = null;
   }

   public final long u9() {
      return this.m3;
   }

   public final void u3(long var1) {
      this.m3 = var1;
      this.c4 = null;
   }

   public final long h0() {
      return this.z8;
   }

   public final void a6(long var1) {
      this.z8 = var1;
      this.y2 = null;
   }

   public final m3 c8() {
      if (this.c4 == null) {
         if ((this.u9() & 4294967295L) == 0L) {
            this.c4 = (m3)this.e2(2147483655L);
         } else if (com.aspose.slides.ms.System.d5.isDefined(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.c5.z1.class), this.u9())) {
            this.c4 = com.aspose.slides.internal.v6g.k5.n5(this.e2(this.u9() & 4294967295L), m3.class);
         } else {
            com.aspose.slides.internal.y6.u3 var1 = this.t4().n5(this.u9());
            if (com.aspose.slides.internal.v6g.k5.l6(var1, t4.class)) {
               this.c4 = ((t4)var1).n5(this);
            } else {
               if (!com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.t5.z1.class)) {
                  throw new ArgumentException("Unknown pen type. Object:" + var1);
               }

               this.c4 = ((com.aspose.slides.internal.t5.z1)var1).n5(this);
            }
         }
      }

      return this.c4;
   }

   public final void n5(m3 var1) {
      this.c4 = var1;
   }

   public final com.aspose.slides.internal.o9b.u3 t2() {
      if (this.r4 == null) {
         if ((this.a6() & 4294967295L) == 0L) {
            this.r4 = (com.aspose.slides.internal.o9b.u3)this.e2(2147483652L);
         } else if (com.aspose.slides.ms.System.d5.isDefined(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.c5.z1.class), this.a6())) {
            this.r4 = com.aspose.slides.internal.v6g.k5.n5(this.e2(this.a6() & 4294967295L), com.aspose.slides.internal.o9b.u3.class);
         } else {
            com.aspose.slides.internal.y6.u3 var1 = this.t4().n5(this.a6());
            if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.t5.s7.class)) {
               this.r4 = ((com.aspose.slides.internal.t5.s7)var1).n5(this);
            } else {
               if (!com.aspose.slides.internal.v6g.k5.l6(var1, t2.class)) {
                  throw new ArgumentException("Unknown brush type. Object:" + var1);
               }

               u6 var2 = new u6(((t2)var1).l6(this.x8()));
               m1 var3 = this.x9().u9();
               var3.h0();
               var2.u3(var3);
               this.r4 = var2;
            }
         }
      }

      return this.r4;
   }

   public final void n5(com.aspose.slides.internal.o9b.u3 var1) {
      this.r4 = var1;
   }

   public final n3 s7() {
      if (this.y2 == null) {
         if ((this.h0() & 4294967295L) == 0L) {
            this.y2 = (n3)this.e2(2147483665L);
         } else if (com.aspose.slides.ms.System.d5.isDefined(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.c5.z1.class), this.h0())) {
            this.y2 = com.aspose.slides.internal.v6g.k5.n5(this.e2(this.h0() & 4294967295L), n3.class);
         } else {
            com.aspose.slides.internal.y6.u3 var1 = this.t4().n5(this.h0());
            if (!com.aspose.slides.internal.v6g.k5.l6(var1, x8.class)) {
               throw new ArgumentException("Unknown font type. Object:" + var1);
            }

            this.y2 = ((x8)var1).z1();
         }
      }

      return this.y2;
   }

   public final void n5(n3 var1) {
      this.y2 = var1;
   }

   public final com.aspose.slides.internal.y6.k5 x8() {
      if (this.j5 == null && (this.k5() & 4294967295L) != 0L) {
         com.aspose.slides.internal.y6.u3 var1 = this.t4().n5(this.k5());
         if (var1 == null) {
            return null;
         }

         if (!com.aspose.slides.internal.v6g.k5.l6(var1, e2.class)) {
            throw new ArgumentException("Unknown palette type. Object:" + var1);
         }

         this.j5 = com.aspose.slides.internal.y6.k5.n5((e2)var1);
      }

      return this.j5;
   }

   public final void n5(com.aspose.slides.internal.y6.k5 var1) {
      this.j5 = var1;
   }

   public final Object n3() {
      if (this.w1 == null && (this.u3() & 4294967295L) != 0L) {
         com.aspose.slides.internal.y6.u3 var1 = this.t4().n5(this.u3());
         if (var1 == null) {
            return null;
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.b9.j5.class)) {
            this.w1 = ((com.aspose.slides.internal.b9.j5)var1).n5(this);
         } else {
            if (!com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.k1.n3.class)) {
               throw new ArgumentException("Unknown color space type. Object:" + var1);
            }

            this.w1 = ((com.aspose.slides.internal.k1.n3)var1).n5(this);
         }
      }

      return this.w1;
   }

   public final void l6(Object var1) {
      this.w1 = var1;
   }

   public final s7 y4() {
      return this.y4;
   }

   public final void n5(s7 var1) {
      this.y4 = var1;
   }

   public final boolean e2() {
      return this.y4 != null;
   }

   public final s7 t9() {
      return this.e2;
   }

   public final void l6(s7 var1) {
      this.e2 = var1;
   }

   public final a0 z1() {
      return this.t9;
   }

   public final void n5(a0 var1) {
      this.t9 = var1;
   }

   public final k5 t4() {
      return this.z1;
   }

   public final void n5(k5 var1) {
      this.z1 = var1;
   }

   public final com.aspose.slides.internal.o9b.c8 q0() {
      return this.t4;
   }

   public final void n5(com.aspose.slides.internal.o9b.c8 var1) {
      var1.n5(this.t4);
   }

   public final com.aspose.slides.internal.o9b.c8 z3() {
      return this.q0;
   }

   public final void l6(com.aspose.slides.internal.o9b.c8 var1) {
      var1.n5(this.q0);
   }

   public final j5 m1() {
      return this.y1;
   }

   public final void n5(j5 var1) {
      var1.k5(this.y1);
   }

   public final j5 k7() {
      return this.a0;
   }

   public final void l6(j5 var1) {
      var1.k5(this.a0);
   }

   public final int m3() {
      return this.d2;
   }

   public final void n5(int var1) {
      this.d2 = var1;
   }

   public final int z8() {
      return this.d5;
   }

   public final void l6(int var1) {
      this.d5 = var1;
   }

   public final long j5() {
      return this.s3;
   }

   public final void u9(long var1) {
      this.s3 = var1;
   }

   public final long w1() {
      return this.p8;
   }

   public final void h0(long var1) {
      this.p8 = var1;
   }

   public final float r4() {
      return this.f2;
   }

   public final void n5(float var1) {
      this.f2 = var1;
   }

   public final long c4() {
      return this.i1;
   }

   public final void c8(long var1) {
      this.i1 = var1;
   }

   public final int y2() {
      return this.e5;
   }

   public final void k5(int var1) {
      this.e5 = var1;
   }

   public final int y1() {
      return this.b3;
   }

   public final void u3(int var1) {
      this.b3 = var1;
   }

   public final y2 a0() {
      return this.o0;
   }

   public final void n5(y2 var1) {
      var1.u3(this.o0);
   }

   public final y2 d2() {
      return this.z7;
   }

   public final void l6(y2 var1) {
      var1.u3(this.z7);
   }

   public final long d5() {
      return this.v4;
   }

   public final void t2(long var1) {
      this.v4 = var1;
   }

   public final long s3() {
      return this.u6;
   }

   public final void s7(long var1) {
      this.u6 = var1;
   }

   public final long p8() {
      return this.t1;
   }

   public final void x8(long var1) {
      this.t1 = var1;
   }

   public final long f2() {
      return this.a5;
   }

   public final void n3(long var1) {
      this.a5 = var1;
   }

   public final j5 i1() {
      return this.h2;
   }

   public final void k5(j5 var1) {
      var1.k5(this.h2);
   }

   public final com.aspose.slides.internal.t5.l6 e5() {
      return this.v0;
   }

   public final void n5(com.aspose.slides.internal.t5.l6 var1) {
      this.v0 = var1;
   }

   public final long b3() {
      return this.f0;
   }

   public final void y4(long var1) {
      this.f0 = var1;
   }

   public final com.aspose.slides.internal.t5.j5 o0() {
      return this.a3;
   }

   public final void n5(com.aspose.slides.internal.t5.j5 var1) {
      this.a3 = var1;
   }

   public final com.aspose.slides.internal.o9b.l6 z7() {
      return this.x9;
   }

   public final void n5(com.aspose.slides.internal.o9b.l6 var1) {
      this.x9 = var1;
      if (this.p3 != null) {
         this.p3.n5(this.x9);
      }
   }

   public final com.aspose.slides.internal.x3.a6 v4() {
      return this.p3;
   }

   public final void n5(com.aspose.slides.internal.x3.a6 var1) {
      this.p3 = var1;
   }

   public final m1 u6() {
      return this.s7.u9();
   }

   public final void n5(m1 var1) {
      this.s7 = var1;
      this.u9 = true;
   }

   public final float t1() {
      return this.k5;
   }

   public final void l6(float var1) {
      this.k5 = var1;
   }

   public final float a5() {
      return this.u3;
   }

   public final void k5(float var1) {
      this.u3 = var1;
   }

   public final void n5(p8 var1) {
      var1.k5(this.n5);
   }

   public final void l6(p8 var1) {
      var1.k5(this.l6);
   }

   public final a0 h2() {
      return this.c8.u3();
   }

   public final void l6(a0 var1) {
      this.c8.l6(var1);
      this.u9 = true;
   }

   public final a0 v0() {
      return this.c8.l6();
   }

   public final void k5(a0 var1) {
      this.c8.n5(var1);
      this.u9 = true;
   }

   public final y2 f0() {
      return this.c8.k5();
   }

   public final void k5(y2 var1) {
      this.c8.n5(var1.n3());
   }

   public final void l6(m1 var1) {
      this.c8.n5(var1);
   }

   public final m1 a3() {
      return this.x8;
   }

   public final void k5(m1 var1) {
      this.x8 = var1;
      this.u9 = true;
   }

   public final void u3(m1 var1) {
      this.c8.l6(var1);
   }

   public final com.aspose.slides.internal.o1.u3 p3() {
      return this.c8.n5();
   }

   public final void n5(com.aspose.slides.internal.o1.u3 var1) {
      this.c8.n5(var1);
   }

   public final m1 x9() {
      m1 var1 = new m1();
      var1.n5(this.a3(), 1);
      var1.n5(this.u6(), 1);
      return var1;
   }

   public final int y0() {
      return this.n3.size();
   }

   public final Object e2(long var1) {
      switch ((int)var1) {
         case Integer.MIN_VALUE:
            return new i1(com.aspose.slides.internal.o9b.c8.w4().o8());
         case -2147483647:
            return new i1(com.aspose.slides.internal.o9b.c8.n5(255, 192, 192, 192).o8());
         case -2147483646:
            return new i1(com.aspose.slides.internal.o9b.c8.n5(255, 128, 128, 128).o8());
         case -2147483645:
            return new i1(com.aspose.slides.internal.o9b.c8.n5(255, 64, 64, 64).o8());
         case -2147483644:
            return new i1(com.aspose.slides.internal.o9b.c8.m3().o8());
         case -2147483643:
            return null;
         case -2147483642:
            m1 var7 = this.x9();
            float var8 = q1.n5(var7.n5()[0]);
            float var9 = q1.n5(var7.n5()[3]);
            float var10 = 2.0F / (var8 + var9);
            return new m3(com.aspose.slides.internal.o9b.c8.w4().o8(), var10);
         case -2147483641:
            m1 var3 = this.x9();
            float var4 = q1.n5(var3.n5()[0]);
            float var5 = q1.n5(var3.n5()[3]);
            float var6 = 2.0F / (var4 + var5);
            return new m3(com.aspose.slides.internal.o9b.c8.m3().o8(), var6);
         case -2147483640:
            return null;
         case -2147483639:
         default:
            return null;
         case -2147483638:
         case -2147483637:
         case -2147483636:
         case -2147483634:
         case -2147483632:
         case -2147483631:
            return com.aspose.slides.internal.b0.l6.n5(com.aspose.slides.internal.o9b.v4.l6().h0(), 12.0F, 0);
         case -2147483635:
            return com.aspose.slides.internal.b0.l6.n5(com.aspose.slides.internal.o9b.v4.l6().h0(), 12.0F, 1);
         case -2147483633:
            throw new NotImplementedException();
         case -2147483630:
            return this.t2();
         case -2147483629:
            return this.c8();
      }
   }

   public final void j9() {
      this.k5(new a0());
      this.k5(com.aspose.slides.internal.o9b.y2.n5.n3());
   }

   public final void z6() {
      float var1 = 0.0F;
      float var2 = 0.0F;
      float var3 = 25.4F;
      float var4;
      float var5;
      switch ((int)this.s3()) {
         case 1:
            var4 = 1.0F;
            var5 = 1.0F;
            break;
         case 2:
            var5 = this.t1() / 10.0F;
            var4 = -this.a5() / 10.0F;
            break;
         case 3:
            var5 = this.t1() / 100.0F;
            var4 = -this.a5() / 100.0F;
            break;
         case 4:
            var5 = this.t1() * var3 / 100.0F;
            var4 = -this.a5() * var3 / 100.0F;
            break;
         case 5:
            var5 = this.t1() * var3 / 1000.0F;
            var4 = -this.a5() * var3 / 1000.0F;
            break;
         case 6:
            var5 = this.t1() * var3 / 1440.0F;
            var4 = -this.a5() * var3 / 1440.0F;
            break;
         case 7:
         case 8:
            var5 = !this.a0().k5() && !this.d2().k5() ? (float)this.a0().t2() / this.d2().t2() : 1.0F;
            var4 = !this.a0().k5() && !this.d2().k5() ? (float)this.a0().l6() / this.d2().l6() : 1.0F;
            break;
         default:
            return;
      }

      var1 = -this.d2().s7() * var5 + this.a0().s7();
      var2 = -this.d2().x8() * var4 + this.a0().x8();
      m1 var6 = new m1();
      var6.k5(var1, var2);
      var6.n5(var5, var4);
      this.n5(var6);
   }

   public final void n5(z3 var1) {
      throw new NotImplementedException();
   }

   public final com.aspose.slides.internal.o9b.u3 t9(long var1) {
      com.aspose.slides.internal.o9b.u3 var3 = null;
      if (com.aspose.slides.ms.System.d5.isDefined(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.c5.z1.class), var1)) {
         var3 = (com.aspose.slides.internal.o9b.u3)this.e2(var1 & 4294967295L);
      } else {
         com.aspose.slides.internal.y6.u3 var4 = this.t4().n5(var1);
         if (com.aspose.slides.internal.v6g.k5.l6(var4, com.aspose.slides.internal.t5.s7.class)) {
            var3 = ((com.aspose.slides.internal.t5.s7)var4).n5(this);
         } else if (com.aspose.slides.internal.v6g.k5.l6(var4, t2.class)) {
            var3 = new u6(((t2)var4).l6(this.x8()));
         }
      }

      return var3;
   }

   public final void e9() {
      h0 var1 = new h0();
      var1.n3(this.f2());
      var1.n5(this.q0().o8());
      var1.c8(this.c4());
      var1.n5(this.m3());
      var1.l6(this.z8());
      var1.l6(this.i1().k5());
      var1.n5(this.e5());
      var1.n5(this.v0().l6());
      var1.n5(this.f0().n3());
      var1.l6(this.z1());
      var1.t2(this.d5());
      var1.y4(this.b3());
      var1.x8(this.p8());
      var1.s7(this.s3());
      var1.n5(this.r4());
      var1.h0(this.w1());
      var1.n5(this.m1().k5());
      var1.k5(this.y2());
      var1.a6(this.u3());
      var1.u3(this.k5());
      var1.n5(this.u9());
      var1.l6(this.a6());
      var1.k5(this.h0());
      var1.n5(this.c8());
      var1.n5(this.t2());
      var1.n5(this.s7());
      var1.n5(this.x8());
      var1.n5(this.n3());
      var1.n5(this.t9());
      var1.u3(this.y1());
      var1.u9(this.j5());
      var1.l6(this.z3().o8());
      var1.n5(this.o0());
      var1.l6(this.a0().n3());
      var1.k5(this.d2().n3());
      var1.n5(this.a3().u9());
      var1.l6(this.u6().u9());
      var1.n5(this.t4().n5());
      var1.n5(this.v4());
      this.n3.push(var1);
   }

   public final void a6(int var1) {
      h0 var2 = null;
      if (var1 >= 0) {
         if (this.y0() <= var1) {
            throw new ArgumentException("savedDc greater than number of elements in the stack");
         }

         while (this.y0() > var1) {
            var2 = this.n3.pop();
         }
      } else if (var1 < 0) {
         while (var1 < 0 && this.y0() > 0) {
            var2 = this.n3.pop();
            var1++;
         }
      }

      if (var2 != null) {
         this.n3(var2.d5());
         this.n5(var2.z1().o8());
         this.c8(var2.j5());
         this.n5(var2.z3());
         this.l6(var2.m1());
         this.k5(var2.s3().k5());
         this.n5(var2.p8());
         this.k5(var2.n3().l6());
         this.n5(var2.y4());
         this.t2(var2.y1());
         this.y4(var2.f2());
         this.x8(var2.d2());
         this.s7(var2.a0());
         this.n5(var2.z8());
         this.h0(var2.m3());
         this.n5(var2.q0().k5());
         this.k5(var2.w1());
         com.aspose.slides.internal.y6.u3 var3 = this.t4().n5(var2.l6());
         com.aspose.slides.internal.y6.u3 var4 = var2.e5().n5(var2.l6());
         if (var4 != null && var4.equals(var3)) {
            this.u3(var2.l6());
            this.n5(var2.h0());
         }

         com.aspose.slides.internal.y6.u3 var5 = this.t4().n5(var2.k5());
         com.aspose.slides.internal.y6.u3 var6 = var2.e5().n5(var2.k5());
         if (var6 != null && var6.equals(var5)) {
            this.k5(var2.k5());
            this.n5(var2.c8());
         }

         this.l6(var2.u9());
         this.n5(var2.a6());
         this.a6(var2.u3());
         this.n5(var2.t2());
         this.n5(var2.s7());
         this.l6(var2.x8());
         this.l6(var2.n5());
         this.u3(var2.r4());
         this.u9(var2.k7());
         this.l6(var2.t4().o8());
         this.n5(var2.i1());
         this.n5(var2.c4().n3());
         this.l6(var2.y2().n3());
         this.k5(var2.e2().u9());
         this.n5(var2.t9().u9());
         this.n5(var2.b3());
      }
   }

   public final c8 o5() {
      if (this.y0 == null) {
         this.y0 = new c8(new u9$1(this));
      }

      return this.y0;
   }

   private void n5(long var1, y2 var3, byte[] var4) {
      u9$n5 var5 = this.h0;
      if (var5 != null) {
         var5.n5(this, var1, var3.n3(), var4);
      }
   }

   // $VF: synthetic method
   static void n5(u9 var0, long var1, y2 var3, byte[] var4) {
      var0.n5(var1, var3, var4);
   }
}
