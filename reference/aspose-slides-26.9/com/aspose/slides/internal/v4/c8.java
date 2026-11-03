package com.aspose.slides.internal.v4;

import com.aspose.slides.internal.h2.b3;
import com.aspose.slides.ms.System.d1;

public class c8 extends com.aspose.slides.internal.e5.t9 implements com.aspose.slides.internal.h2.d2, com.aspose.slides.internal.v8.u3 {
   private com.aspose.slides.internal.h2.h0 u9;
   private com.aspose.slides.internal.h2.t2 h0;
   private com.aspose.slides.internal.h2.e2 c8;
   private com.aspose.slides.internal.h2.n3 t2;
   private b3 s7;
   private int x8;
   private int n3;
   private int y4;
   private b3 e2;
   private com.aspose.slides.internal.h2.f2 t9;
   private com.aspose.slides.internal.h2.f2 z1;
   private com.aspose.slides.internal.h2.f2 t4;
   private int q0;
   private com.aspose.slides.internal.f2.u3 z3;
   private int m1;
   private int k7;
   private com.aspose.slides.internal.v8.y4 m3;
   private com.aspose.slides.internal.f2.u3 z8;
   private int j5;
   private com.aspose.slides.internal.h2.a6 w1;
   private boolean r4;
   private boolean c4;
   private boolean y2 = false;

   public c8(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      super.n5(var1);
      this.u9 = var1.s7();
      this.h0 = var1.u3();
      this.c8 = var1.a6();
      this.t2 = var1.h0();
      this.s7 = var1.a6(17).k_();
      this.x8 = var1.a6(58).a6();
      this.n3 = var1.a6(59).a6();
      this.w1 = var1.y4();
      this.y4 = var1.a6(87).a6();
      this.e2 = var1.a6(127).k_();
      this.t9 = var1.a6(131).y4();
      this.z1 = var1.a6(132).y4();
      this.t4 = var1.a6(133).y4();
      this.q0 = var1.a6(169).a6();
      this.z3 = var1.a6(197).u9();
      this.m1 = var1.a6(226).a6();
      this.m3 = new com.aspose.slides.internal.v8.y4(
         com.aspose.slides.internal.v8.n3.n5(var1.a6(267).a6()), com.aspose.slides.internal.v8.s7.n5(var1.a6(255).a6())
      );
      this.k7 = var1.a6(273).a6();
      this.z8 = var1.u3(269).u9();
      this.j5 = var1.u3(257).a6();
      this.r4 = var1.u3(298).a6() == 149;
      this.c4 = var1.u3(301).a6() == 149;
   }

   @Override
   public void u9() {
      super.u9();
      this.n_().n5(this);
   }

   @Override
   public void n5(com.aspose.slides.internal.w2.u9 var1, String var2, String var3) {
      if (d1.a6("http://www.w3.org/1999/XSL/Format", var2)) {
         if (d1.a6(var3, "marker")) {
            if (this.u9.n5 == 1 || this.u9.n5 == 51) {
               this.y4().n5(this, this.k5);
            }

            if (this.y2) {
               this.l6(var1, "fo:marker", "(%block;)");
            }
         } else if (!this.l6("http://www.w3.org/1999/XSL/Format", var3)) {
            this.k5(var1, "http://www.w3.org/1999/XSL/Format", var3);
         } else {
            this.y2 = true;
         }
      }
   }

   @Override
   public void c8() {
      if (!this.y2) {
         this.l6("marker* (%block;)+");
      }

      this.n_().l6(this);
   }

   @Override
   public boolean j5() {
      return true;
   }

   public final com.aspose.slides.internal.h2.h0 i1() {
      return this.u9;
   }

   public final com.aspose.slides.internal.h2.n3 e5() {
      return this.t2;
   }

   public final com.aspose.slides.internal.h2.t2 b3() {
      return this.h0;
   }

   public final com.aspose.slides.internal.h2.e2 o0() {
      return this.c8;
   }

   public final b3 z7() {
      return this.s7;
   }

   public final int v4() {
      return this.y4;
   }

   @Override
   public final int u6() {
      return this.x8;
   }

   @Override
   public final int t1() {
      return this.n3;
   }

   public final com.aspose.slides.internal.h2.f2 a5() {
      return this.z1;
   }

   public final com.aspose.slides.internal.h2.f2 h2() {
      return this.t4;
   }

   public final com.aspose.slides.internal.h2.f2 v0() {
      return this.t9;
   }

   public final b3 f0() {
      return this.e2;
   }

   public final int a3() {
      return this.q0;
   }

   public final int p3() {
      return this.z3.u3();
   }

   public final int x9() {
      return this.m1;
   }

   public final int y0() {
      return this.k7;
   }

   @Override
   public final com.aspose.slides.internal.v8.k5 j9() {
      return this.m3.j9();
   }

   @Override
   public final com.aspose.slides.internal.v8.s7 z6() {
      return this.m3.z6();
   }

   @Override
   public final com.aspose.slides.internal.v8.k5 e9() {
      return this.m3.e9();
   }

   public final com.aspose.slides.internal.v8.n3 o5() {
      return this.m3.n5();
   }

   @Override
   public String z1() {
      return "block-container";
   }

   @Override
   public int z3() {
      return 4;
   }

   public final com.aspose.slides.internal.f2.u3 j8() {
      return this.z8;
   }

   public final int w2() {
      return this.j5;
   }

   public final boolean s0() {
      return this.r4;
   }

   public final boolean v8() {
      return this.c4;
   }

   public final com.aspose.slides.internal.f2.c8 v3() {
      if (this.w1 == null) {
         return null;
      } else {
         return this.w1.t4() ? null : this.w1.s7();
      }
   }
}
