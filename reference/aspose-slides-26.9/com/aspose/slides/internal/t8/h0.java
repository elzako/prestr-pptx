package com.aspose.slides.internal.t8;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$ValueCollection$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.e7.s7;
import com.aspose.slides.internal.h7.a0;
import com.aspose.slides.internal.h7.a5;
import com.aspose.slides.internal.h7.c4;
import com.aspose.slides.internal.h7.d2;
import com.aspose.slides.internal.h7.e2;
import com.aspose.slides.internal.h7.e5;
import com.aspose.slides.internal.h7.e9;
import com.aspose.slides.internal.h7.f0;
import com.aspose.slides.internal.h7.f2;
import com.aspose.slides.internal.h7.f5;
import com.aspose.slides.internal.h7.g7;
import com.aspose.slides.internal.h7.h2;
import com.aspose.slides.internal.h7.i9;
import com.aspose.slides.internal.h7.j4;
import com.aspose.slides.internal.h7.j5;
import com.aspose.slides.internal.h7.j8;
import com.aspose.slides.internal.h7.k7;
import com.aspose.slides.internal.h7.m3;
import com.aspose.slides.internal.h7.n3;
import com.aspose.slides.internal.h7.o5;
import com.aspose.slides.internal.h7.p8;
import com.aspose.slides.internal.h7.q0;
import com.aspose.slides.internal.h7.r4;
import com.aspose.slides.internal.h7.s0;
import com.aspose.slides.internal.h7.s3;
import com.aspose.slides.internal.h7.t1;
import com.aspose.slides.internal.h7.t4;
import com.aspose.slides.internal.h7.t9;
import com.aspose.slides.internal.h7.v3;
import com.aspose.slides.internal.h7.v8;
import com.aspose.slides.internal.h7.w1;
import com.aspose.slides.internal.h7.w2;
import com.aspose.slides.internal.h7.y0;
import com.aspose.slides.internal.h7.y1;
import com.aspose.slides.internal.h7.y2;
import com.aspose.slides.internal.h7.y4;
import com.aspose.slides.internal.h7.z1;
import com.aspose.slides.internal.h7.z3;
import com.aspose.slides.internal.h7.z6;
import com.aspose.slides.internal.h7.z7;
import com.aspose.slides.internal.h7.z8;
import com.aspose.slides.internal.v2.x8;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.ms.System.IDisposable;

public class h0 implements k5, n5 {
   private com.aspose.slides.internal.e7.u9 n5;
   private final com.aspose.slides.internal.k0.l6 l6 = new com.aspose.slides.internal.k0.u9();
   private final com.aspose.slides.internal.k0.k5 k5 = new com.aspose.slides.internal.k0.h0(this.l6);
   private final com.aspose.slides.internal.k0.n5 u3 = new com.aspose.slides.internal.k0.a6(this.l6);
   private final com.aspose.slides.internal.k0.u3 a6 = new com.aspose.slides.internal.k0.c8();
   private final l6 u9 = new u9();
   private final Stack<com.aspose.slides.internal.e7.t2> h0 = new Stack<>();
   private final Dictionary<String, t9> c8 = new Dictionary<>();

   @Override
   public final float n5() {
      return this.n5 != null ? this.n5.l6().a6() : 0.0F;
   }

   public h0() {
      this.l6();
   }

   public final t2 n5(com.aspose.slides.internal.e7.u9 var1) {
      this.n5 = var1;
      com.aspose.slides.internal.e7.t2 var2 = var1.k5();
      x8 var3 = null;
      if (var1.u3() != null) {
         s7 var4 = var1.u3();
         var3 = var4.l6();
      }

      if (var3 == null) {
         return new t2();
      }

      this.k5();
      m1 var11 = this.u3();
      if (!var11.l6()) {
         a6 var5 = this.u9.n5();
         var11.n5(var5.n5(), 1);
         var5.n5(var11);
      }

      this.n5(var2, var3);
      List var12 = new List();
      Dictionary$ValueCollection$Enumerator var6 = var2.l6().getValues().iterator();

      try {
         while (var6.hasNext()) {
            com.aspose.slides.internal.u1.u3 var7 = (com.aspose.slides.internal.u1.u3)var6.next();
            var12.addItem(var7);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      t2 var13 = new t2();
      var13.k5(this.k5.n5());
      var13.n5(this.u3.n5());
      var13.l6(this.a6.u3());
      var13.u3(var12);
      return var13;
   }

   @Override
   public final void n5(x8 var1) {
      List var2 = new List();
      com.aspose.slides.internal.m6.u3 var3 = new com.aspose.slides.internal.m6.u3(var1);
      IGenericEnumerator var4 = var3.k5();

      while (var4.hasNext()) {
         Object var5 = var4.next();
         if (com.aspose.slides.internal.v6g.k5.l6(var5, com.aspose.slides.internal.v2.s7.class)) {
            com.aspose.slides.internal.v2.s7 var6 = com.aspose.slides.internal.v6g.k5.n5(var5, com.aspose.slides.internal.v2.s7.class);
            var2.addItem(var6);
         } else if (com.aspose.slides.internal.v6g.k5.l6(var5, com.aspose.slides.internal.h7.m1.class)) {
            com.aspose.slides.internal.h7.m1 var7 = com.aspose.slides.internal.v6g.k5.n5(var5, com.aspose.slides.internal.h7.m1.class);
            this.n5(var7, var2);
            var2 = new List();
         } else {
            var2.addItem((com.aspose.slides.internal.v2.s7)var5);
         }
      }
   }

   private void l6() {
      this.c8.addItem("Do", new z1(this.u9, this.h0, this, this.u3, this.k5, this));
      this.c8.addItem("gs", new w1(this.u9, this.h0));
      this.c8.addItem("w", new d2(this.u9));
      this.c8.addItem("J", new c4(this.u9));
      this.c8.addItem("j", new y1(this.u9));
      this.c8.addItem("d", new y2(this.u9));
      this.c8.addItem("M", new a0(this.u9));
      this.c8.addItem("cm", new com.aspose.slides.internal.h7.t2(this.u9));
      this.c8.addItem("q", new m3(this.u9));
      this.c8.addItem("Q", new k7(this.u9));
      this.c8.addItem("BT", new com.aspose.slides.internal.h7.a6(this.a6));
      this.c8.addItem("ET", new y4(this.a6));
      this.c8.addItem("Tc", new z8(this.u9));
      this.c8.addItem("Tw", new s0(this.u9));
      this.c8.addItem("Ts", new w2(this.u9));
      this.c8.addItem("Tz", new r4(this.u9));
      this.c8.addItem("Tf", new z6(this.u9, this.h0));
      this.c8.addItem("Tj", new j4(this.u9, this, this.a6));
      this.c8.addItem("TJ", new i9(this.u9, this, this.a6));
      this.c8.addItem("Tm", new o5(this.a6));
      this.c8.addItem("Td", new t4(this.a6));
      this.c8.addItem("T*", new z3(this.c8, this.u9));
      this.c8.addItem("TL", new e9(this.u9));
      this.c8.addItem("TD", new q0(this.c8));
      this.c8.addItem("Tr", new j8(this.u9));
      this.c8.addItem("'", new g7(this.c8));
      this.c8.addItem("\"", new v3(this.c8));
      this.c8.addItem("CS", new h2(this.u9));
      this.c8.addItem("i", new j5(this.u9));
      this.c8.addItem("cs", new f2(this.u9));
      this.c8.addItem("SC", new a5(this.u9, this.h0));
      this.c8.addItem("SCN", new a5(this.u9, this.h0));
      this.c8.addItem("sc", new p8(this.u9, this.h0, this));
      this.c8.addItem("scn", new p8(this.u9, this.h0, this));
      this.c8.addItem("rg", new z7(this.u9));
      this.c8.addItem("RG", new y0(this.u9));
      this.c8.addItem("g", new e5(this.u9));
      this.c8.addItem("G", new f0(this.u9));
      this.c8.addItem("K", new t1(this.u9));
      this.c8.addItem("k", new s3(this.u9));
      this.c8.addItem("m", new f5(this.u9, this.k5, this));
      this.c8.addItem("l", new com.aspose.slides.internal.h7.l6(this.u9, this.k5, this));
      this.c8.addItem("re", new com.aspose.slides.internal.h7.k5(this.u9, this.k5, this));
      this.c8.addItem("c", new com.aspose.slides.internal.h7.n5(this.u9, this.k5, this));
      this.c8.addItem("y", new com.aspose.slides.internal.h7.s7(this.u9, this.k5, this));
      this.c8.addItem("h", new com.aspose.slides.internal.h7.c8(this.k5));
      this.c8.addItem("n", new n3(this.k5, this.u9));
      this.c8.addItem("f*", new e2(this.u9, this.k5, false, new com.aspose.slides.ms.System.o5<>(0), true));
      this.c8.addItem("f", new e2(this.u9, this.k5, false, new com.aspose.slides.ms.System.o5<>(1), true));
      this.c8.addItem("F", new e2(this.u9, this.k5, false, new com.aspose.slides.ms.System.o5<>(1), true));
      this.c8.addItem("S", new e2(this.u9, this.k5, true, null, false));
      this.c8.addItem("s", new e2(this.u9, this.k5, true, null, true));
      this.c8.addItem("B*", new e2(this.u9, this.k5, true, new com.aspose.slides.ms.System.o5<>(0), false));
      this.c8.addItem("B", new e2(this.u9, this.k5, true, new com.aspose.slides.ms.System.o5<>(1), false));
      this.c8.addItem("b", new e2(this.u9, this.k5, true, new com.aspose.slides.ms.System.o5<>(1), true));
      this.c8.addItem("b*", new e2(this.u9, this.k5, true, new com.aspose.slides.ms.System.o5<>(0), true));
      this.c8.addItem("W", new com.aspose.slides.internal.h7.h0(this.k5));
      this.c8.addItem("W*", new com.aspose.slides.internal.h7.u9(this.k5));
      this.c8.addItem("BDC", new com.aspose.slides.internal.h7.u3(this.u9, this, this.a6));
      this.c8.addItem("sh", new v8(this.u9, this.h0, this.k5, this));
   }

   private void k5() {
      this.k5.u3();
      this.l6.l6();
      this.u9.a6();
      this.u3.l6();
      this.a6.u9();
   }

   private void n5(com.aspose.slides.internal.e7.t2 var1, x8 var2) {
      if (var1 != null) {
         this.h0.push(var1);
         this.n5(var2);
         this.h0.pop();
      } else {
         this.n5(var2);
      }
   }

   private void n5(com.aspose.slides.internal.h7.m1 var1, List<com.aspose.slides.internal.v2.s7> var2) {
      String var3 = var1.n5;
      t9 var4 = this.n5(var3);
      if (var4 != null) {
         var4.n5(var1, var2);
      }
   }

   private t9 n5(String var1) {
      return this.c8.containsKey(var1) ? this.c8.get_Item(var1) : null;
   }

   private m1 u3() {
      if (this.n5 == null) {
         return new m1();
      }

      float var1 = this.n5.l6().u3();
      float var2 = this.n5.l6().a6();
      int var3 = com.aspose.slides.internal.v6g.k5.u3(this.n5.a6(), 13);
      var3 %= 360;
      if (var3 < 0) {
         var3 += 360;
      }

      switch (var3) {
         case 90:
            return new m1(0.0F, -1.0F, 1.0F, 0.0F, 0.0F, var2);
         case 180:
            return new m1(-1.0F, 0.0F, 0.0F, -1.0F, var1, var2);
         case 270:
            return new m1(0.0F, 1.0F, -1.0F, 0.0F, var1, 0.0F);
         default:
            return new m1();
      }
   }
}
