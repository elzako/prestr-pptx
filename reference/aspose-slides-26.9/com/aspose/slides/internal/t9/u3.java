package com.aspose.slides.internal.t9;

import com.aspose.slides.internal.j3.z3;
import com.aspose.slides.internal.k5.k7;
import com.aspose.slides.internal.k5.m1;
import com.aspose.slides.internal.k7.e2;
import com.aspose.slides.internal.k7.r4;
import com.aspose.slides.internal.k7.s3;
import com.aspose.slides.internal.k7.t4;
import com.aspose.slides.internal.k7.t9;
import com.aspose.slides.internal.k7.w1;
import com.aspose.slides.internal.k7.x8;
import com.aspose.slides.internal.k7.y2;
import com.aspose.slides.internal.m3.a0;
import com.aspose.slides.internal.m3.a2;
import com.aspose.slides.internal.m3.a7;
import com.aspose.slides.internal.m3.b5;
import com.aspose.slides.internal.m3.d5;
import com.aspose.slides.internal.m3.e0;
import com.aspose.slides.internal.m3.h9;
import com.aspose.slides.internal.m3.i1;
import com.aspose.slides.internal.m3.j5;
import com.aspose.slides.internal.m3.m3;
import com.aspose.slides.internal.m3.m8;
import com.aspose.slides.internal.m3.o2;
import com.aspose.slides.internal.m3.q2;
import com.aspose.slides.internal.m3.q3;
import com.aspose.slides.internal.m3.v6;
import com.aspose.slides.internal.m3.x0;
import com.aspose.slides.internal.m3.y9;
import com.aspose.slides.internal.m3.z7;
import com.aspose.slides.internal.m3.z8;
import com.aspose.slides.internal.q0.n3;
import com.aspose.slides.internal.q0.y4;
import com.aspose.slides.internal.y4.z1;

public class u3 extends a6 {
   private z3 n5;
   private z1 l6;
   private m1 k5;
   private com.aspose.slides.internal.h0.h0 u3;
   private String a6;
   private u3 u9 = null;
   private u3 h0 = null;
   private e2 c8 = null;
   private static final com.aspose.slides.internal.v6g.c8<Integer> t2 = new com.aspose.slides.internal.v6g.c8<>(0);

   public u3(z3 var1) {
      this(var1, 0);
   }

   public u3(z3 var1, int var2) {
      this.n5 = var1;
      this.k5 = com.aspose.slides.internal.v6g.k5.n5(var1.c4(), m1.class);
      this.u3 = (com.aspose.slides.internal.h0.h0)this.k5.n5();
      if (var2 == 0) {
         this.a6 = null;
      } else {
         this.a6 = com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(s7.class), var2);
      }

      this.l6 = ((k7)var1).n5(this.a6);
      if (this.l6 == null) {
         this.l6 = this.u3.n5(var1, this.a6);
         ((k7)var1).n5(this.a6, this.l6);
      }
   }

   public static u3 n5(z3 var0) {
      return new u3(var0);
   }

   public final boolean n5(int var1) {
      int var2 = this.u3.u3(var1);
      return this.l6.n5(var2) != null;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 l6(int var1) {
      int var2 = this.u3.u3(var1);
      return this.u3.n5(com.aspose.slides.internal.v6g.k5.n5(this.n5, k7.class), this.a6, var2);
   }

   public com.aspose.slides.internal.k5.u9 n5(int var1, String var2) {
      int var3 = this.u3.u3(var1);
      return this.u3.n5(com.aspose.slides.internal.v6g.k5.n5(this.n5, k7.class), var2, var3);
   }

   public static int n5() {
      return t2.get();
   }

   public static void k5(int var0) {
      t2.set(var0);
   }

   public final u3 l6() {
      return this.u9 == null ? (this.u9 = this.u9(4)) : this.u9;
   }

   public final u3 k5() {
      return this.h0 == null ? (this.h0 = this.u9(3)) : this.h0;
   }

   public final u3 u3() {
      return this.u9(9);
   }

   private u3 u9(int var1) {
      return new u3(this.n5, var1);
   }

   public final com.aspose.slides.internal.k7.l6 a6() {
      return new com.aspose.slides.internal.k7.l6(this.l6(3));
   }

   public final int u9() {
      return this.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.m3.u9.class), 4);
   }

   public final com.aspose.slides.internal.k7.u3 h0() {
      return new com.aspose.slides.internal.k7.u3(this.l6(15));
   }

   public final com.aspose.slides.internal.q0.n5 c8() {
      return new com.aspose.slides.internal.q0.n5(this);
   }

   public final com.aspose.slides.internal.k7.u9 t2() {
      return new com.aspose.slides.internal.k7.u9(this.l6(26));
   }

   public final com.aspose.slides.internal.q0.l6 s7() {
      return new com.aspose.slides.internal.q0.l6(this);
   }

   public final y2 x8() {
      return new y2(this.l6(65));
   }

   public final int n3() {
      return this.n5(com.aspose.slides.internal.v6g.k5.n5(z8.class), 69);
   }

   public final int y4() {
      return this.n5(com.aspose.slides.internal.v6g.k5.n5(j5.class), 70);
   }

   public final x8 e2() {
      return new x8(this.l6(71));
   }

   public final com.aspose.slides.internal.o9b.c8 t9() {
      return this.u3(72);
   }

   public final e2 z1() {
      return this.c8 == null ? (this.c8 = new e2(this.l6(83), this.n5(216, (java.lang.String)null))) : this.c8;
   }

   public final com.aspose.slides.internal.q0.a6 t4() {
      return new com.aspose.slides.internal.q0.a6(this);
   }

   public final int q0() {
      return this.n5(com.aspose.slides.internal.v6g.k5.n5(m3.class), 291);
   }

   public final int z3() {
      return this.n5(com.aspose.slides.internal.v6g.k5.n5(m3.class), 292);
   }

   public final int m1() {
      return this.n5(com.aspose.slides.internal.v6g.k5.n5(a0.class), 91);
   }

   public final t9 k7() {
      return new t9(this.l6(92));
   }

   public final int m3() {
      return this.n5(com.aspose.slides.internal.v6g.k5.n5(d5.class), 93);
   }

   public final t4 z8() {
      return new t4(this.l6(100));
   }

   public final int j5() {
      return this.n5(com.aspose.slides.internal.v6g.k5.n5(i1.class), 101);
   }

   public final int w1() {
      return this.n5(com.aspose.slides.internal.v6g.k5.n5(z7.class), 111);
   }

   public final com.aspose.slides.internal.q0.h0 r4() {
      return new com.aspose.slides.internal.q0.h0(this);
   }

   public final y2 c4() {
      return new y2(this.l6(142));
   }

   public final y2 y2() {
      return new y2(this.l6(150));
   }

   public final com.aspose.slides.internal.k7.a0 y1() {
      return new com.aspose.slides.internal.k7.a0(this.l6(151));
   }

   public final com.aspose.slides.internal.k7.m3 a0() {
      return new com.aspose.slides.internal.k7.m3(this.l6(153));
   }

   public final com.aspose.slides.internal.q0.t2 d2() {
      return new com.aspose.slides.internal.q0.t2(this);
   }

   public final com.aspose.slides.internal.q0.z1 d5() {
      return new com.aspose.slides.internal.q0.z1(this);
   }

   public final com.aspose.slides.internal.q0.s7 s3() {
      return new com.aspose.slides.internal.q0.s7(this);
   }

   public final com.aspose.slides.internal.k7.z1 p8() {
      return new com.aspose.slides.internal.k7.z1(this.l6(173));
   }

   public final com.aspose.slides.internal.k7.z1 f2() {
      return new com.aspose.slides.internal.k7.z1(this.l6(174));
   }

   public final com.aspose.slides.internal.k7.z1 i1() {
      return new com.aspose.slides.internal.k7.z1(this.l6(175));
   }

   public final com.aspose.slides.internal.k7.z1 e5() {
      return new com.aspose.slides.internal.k7.z1(this.l6(176));
   }

   public final int b3() {
      return com.aspose.slides.internal.v6g.k5.u3(this.a6(187).l6(), 13);
   }

   public final com.aspose.slides.internal.q0.x8 o0() {
      return new com.aspose.slides.internal.q0.x8(this);
   }

   public final n3 z7() {
      return new n3(this);
   }

   public final y4 v4() {
      return new y4(this);
   }

   public final int u6() {
      return this.n5(com.aspose.slides.internal.v6g.k5.n5(a7.class), 203);
   }

   public final int t1() {
      return this.n5(com.aspose.slides.internal.v6g.k5.n5(a7.class), 204);
   }

   public final int a5() {
      return this.n5(com.aspose.slides.internal.v6g.k5.n5(a7.class), 205);
   }

   public final com.aspose.slides.internal.q0.e2 h2() {
      return this.a6(213);
   }

   public final w1 v0() {
      return new w1(this.l6(212));
   }

   public final r4 f0() {
      return new r4(this.l6(214));
   }

   public final int a3() {
      return this.n5(com.aspose.slides.internal.v6g.k5.n5(b5.class), 215);
   }

   public final com.aspose.slides.internal.q0.e2 p3() {
      return this.a6(221);
   }

   public final y2 x9() {
      return new y2(this.l6(222));
   }

   public final int y0() {
      return this.n5(com.aspose.slides.internal.v6g.k5.n5(y9.class), 238);
   }

   public final int j9() {
      return this.n5(com.aspose.slides.internal.v6g.k5.n5(q3.class), 240);
   }

   public final int z6() {
      return this.n5(com.aspose.slides.internal.v6g.k5.n5(q2.class), 241);
   }

   public final com.aspose.slides.internal.q0.t9 e9() {
      return new com.aspose.slides.internal.q0.t9(this);
   }

   public final com.aspose.slides.internal.q0.e2 o5() {
      return this.a6(254);
   }

   public final com.aspose.slides.internal.k7.d5 j8() {
      return new com.aspose.slides.internal.k7.d5(this.l6(258));
   }

   public final int w2() {
      return this.n5(com.aspose.slides.internal.v6g.k5.n5(m8.class), 260);
   }

   public final y2 s0() {
      return new y2(this.l6(262));
   }

   public final int v8() {
      return this.n5(com.aspose.slides.internal.v6g.k5.n5(h9.class), 271);
   }

   public final s3 v3() {
      return new s3(this.l6(272));
   }

   public final int g7() {
      return this.n5(com.aspose.slides.internal.v6g.k5.n5(a2.class), 273);
   }

   public final int j4() {
      return this.n5(com.aspose.slides.internal.v6g.k5.n5(v6.class), 283);
   }

   public final int i9() {
      return com.aspose.slides.internal.v6g.k5.u3(this.a6(284).l6(), 13);
   }

   public final y2 f5() {
      return new y2(this.l6(285));
   }

   public final com.aspose.slides.internal.k7.a0 j3() {
      return new com.aspose.slides.internal.k7.a0(this.l6(287));
   }

   public final int n1() {
      return this.n5(com.aspose.slides.internal.v6g.k5.n5(x0.class), 286);
   }

   public final int p6() {
      return this.n5(com.aspose.slides.internal.v6g.k5.n5(o2.class), 290);
   }

   public final int d1() {
      return this.n5(com.aspose.slides.internal.v6g.k5.n5(e0.class), 288);
   }

   public final y2 s4() {
      return new y2(this.l6(289));
   }

   public final u3$n5 h6() {
      return new u3$n5(this.l6, this.u3);
   }

   public final String y8() {
      return this.l6.toString();
   }
}
