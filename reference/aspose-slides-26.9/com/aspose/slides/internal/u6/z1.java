package com.aspose.slides.internal.u6;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.h2.b3;
import com.aspose.slides.internal.h2.d5;
import com.aspose.slides.internal.h2.f2;
import com.aspose.slides.internal.h2.i1;
import com.aspose.slides.internal.h2.j9;
import com.aspose.slides.ms.System.d1;

public class z1 extends w1 implements com.aspose.slides.internal.h2.d2, d5, s7, com.aspose.slides.internal.v8.u3 {
   private com.aspose.slides.internal.h2.c8 u9;
   private com.aspose.slides.internal.h2.t2 h0;
   private com.aspose.slides.internal.h2.n3 c8;
   private b3 t2;
   private int s7;
   private i1 z1;
   private int t4;
   private int q0;
   private b3 z3;
   private f2 m1;
   private f2 k7;
   private f2 m3;
   private int z8;
   private int j5;
   private int w1;
   private int r4;
   private com.aspose.slides.internal.v8.y4 c4;
   private com.aspose.slides.internal.f2.k5 y2;
   private com.aspose.slides.internal.f2.k5 y1;
   private List<m3> a0 = new List<>();
   private k5 d2 = new k5();
   private c4 d5 = null;
   private r4 s3 = null;
   private boolean p8 = false;
   private boolean f2 = false;
   private boolean i1 = false;
   private boolean e5 = false;
   private boolean b3 = false;
   private boolean o0 = false;
   private e2 z7;
   private com.aspose.slides.internal.e5.w1 v4;

   public z1(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      super.n5(var1);
      this.u9 = com.aspose.slides.internal.h2.c8.n5(var1);
      this.h0 = var1.u3();
      this.c8 = var1.h0();
      this.t2 = var1.u3(17).k_();
      this.s7 = var1.u3(31).a6();
      this.z1 = var1.u3(45).u_();
      this.t4 = var1.u3(58).a6();
      this.q0 = var1.u3(59).a6();
      this.z3 = var1.u3(127).k_();
      this.m1 = var1.u3(131).y4();
      this.k7 = var1.u3(132).y4();
      this.m3 = var1.u3(133).y4();
      this.z8 = var1.u3(239).a6();
      this.j5 = var1.u3(240).a6();
      this.w1 = var1.u3(241).a6();
      this.r4 = var1.u3(267).a6();
      this.c4 = new com.aspose.slides.internal.v8.y4(
         com.aspose.slides.internal.v8.n3.n5(var1.a6(267).a6()), com.aspose.slides.internal.v8.s7.n5(var1.a6(255).a6())
      );
      this.y2 = var1.u3(271).c8();
      this.y1 = var1.u3(272).c8();
      if (!this.t2.u3(null).t4()) {
      }

      if (!this.s0() && this.x9().n5(com.aspose.slides.internal.f2.x8.n5())) {
         x8 var2 = com.aspose.slides.internal.u6.j5.n5(this.q_().m1());
         var2.n5(this, this.m_());
      }

      this.v4 = var1;
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
            if (this.p8 || this.f2 || this.i1 || this.e5) {
               this.l6(var1, "fo:marker", "(table-column*,table-header?,table-footer?,table-body+)");
            }
         } else if (d1.a6(var3, "table-column")) {
            this.p8 = true;
            if (this.f2 || this.i1 || this.e5) {
               this.l6(var1, "fo:table-column", "(table-header?,table-footer?,table-body+)");
            }
         } else if (d1.a6(var3, "table-header")) {
            if (this.f2) {
               this.n5(var1, "table-header");
            } else {
               this.f2 = true;
               if (this.i1 || this.e5) {
                  this.l6(var1, "fo:table-header", "(table-footer?,table-body+)");
               }
            }
         } else if (d1.a6(var3, "table-footer")) {
            if (this.i1) {
               this.n5(var1, "table-footer");
            } else {
               this.i1 = true;
               if (this.e5) {
                  if (this.q_().z1()) {
                     this.n5(var1, "fo:table-footer", "(table-body+)", true);
                  }

                  if (!this.s0()) {
                     x8 var4 = com.aspose.slides.internal.u6.j5.n5(this.q_().m1());
                     var4.l6(this, this.t9(), this.m_());
                  }
               }
            }
         } else if (d1.a6(var3, "table-body")) {
            this.e5 = true;
         } else {
            this.k5(var1, var2, var3);
         }
      }
   }

   @Override
   public void c8() {
      super.c8();
      this.n_().l6(this);
   }

   @Override
   public void r_() {
      if (!this.e5) {
         this.l6(d1.n5(new String[]{"(marker*,table-column*,table-header?,table-footer?", ",table-body+)"}));
      }

      if (!this.w1()) {
         this.s_().l6(this);
      } else {
         if (!this.p_()) {
            this.z7.k5();
            int var1 = this.a0.size();

            while (--var1 >= 0) {
               m3 var2 = this.a0.get_Item(var1);
               if (var2 != null) {
                  var2.t1();
               }
            }

            this.v4 = null;
            this.z7 = null;
         }
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.t2 var1) {
      int var2 = var1.z3();
      switch (var2) {
         case 73:
         case 77:
         case 78:
            if (!this.p_() && !this.o0) {
               this.o0 = true;
               if (this.b3) {
                  this.f5();
                  this.z7 = new h0(this);
               } else {
                  this.z7 = new d2(this);
               }
            }

            switch (var2) {
               case 77:
                  this.s3 = (r4)var1;
                  return;
               case 78:
                  this.d5 = (c4)var1;
                  return;
               default:
                  super.n5(var1);
                  return;
            }
         case 74:
         case 75:
         default:
            super.n5(var1);
            break;
         case 76:
            this.b3 = true;
            if (!this.p_()) {
               this.n5((m3)var1);
            } else {
               this.a0.addItem((m3)var1);
            }
      }
   }

   private void f5() {
      for (int var1 = 0; var1 < this.a0.size(); var1++) {
         if (this.a0.get_Item(var1) == null) {
            this.a0.set_Item(var1, this.h0(var1 + 1));
         }
      }
   }

   @Override
   public final com.aspose.slides.internal.h2.c8 i1() {
      return this.u9;
   }

   @Override
   public final com.aspose.slides.internal.v8.s7 z6() {
      return this.c4.z6();
   }

   @Override
   public z1 e5() {
      return this;
   }

   public final void a6(int var1) {
      for (int var2 = this.a0.size() + 1; var2 <= var1; var2++) {
         this.a0.addItem(this.h0(var2));
      }
   }

   private m3 h0(int var1) {
      m3 var2 = new m3(this, true);
      com.aspose.slides.internal.e5.a0 var3 = new com.aspose.slides.internal.e5.a0(var2, this.v4);
      var2.n5(var3);
      var2.n5(new j9(1.0, var2));
      var2.a6(var1);
      if (!this.s0()) {
         var2.n5(this.t9);
      }

      return var2;
   }

   private void n5(m3 var1) {
      int var2 = var1.o0();
      int var3 = var1.z7();

      while (this.a0.size() < var2 + var3 - 1) {
         this.a0.addItem(null);
      }

      for (int var4 = var2 - 1; var4 < var2 + var3 - 1; var4++) {
         this.a0.set_Item(var4, var1);
      }

      this.d2.n5(var2, var2 + var3 - 1);
   }

   public final boolean b3() {
      return this.b3;
   }

   public final boolean o0() {
      return this.z8 == 9;
   }

   public final List<m3> z7() {
      return this.a0;
   }

   public final m3 u9(int var1) {
      return this.a0.get_Item(var1);
   }

   public final int v4() {
      return this.a0.size();
   }

   public final c4 a5() {
      return this.d5;
   }

   public final r4 h2() {
      return this.s3;
   }

   public final boolean v0() {
      return this.w1 == 149;
   }

   public final boolean f0() {
      return this.j5 == 149;
   }

   public final b3 a3() {
      return this.z3;
   }

   public final com.aspose.slides.internal.h2.n3 p3() {
      return this.c8;
   }

   @Override
   public com.aspose.slides.internal.h2.t2 x9() {
      return this.h0;
   }

   @Override
   public final int u6() {
      return this.t4;
   }

   @Override
   public final int t1() {
      return this.q0;
   }

   public final f2 y0() {
      return this.k7;
   }

   public final f2 o5() {
      return this.m3;
   }

   public final f2 j8() {
      return this.m1;
   }

   public final int w2() {
      return this.s7;
   }

   public final boolean s0() {
      return this.w2() == 129;
   }

   public final i1 v8() {
      return this.z1;
   }

   @Override
   public final com.aspose.slides.internal.v8.k5 j9() {
      return this.c4.j9();
   }

   @Override
   public final com.aspose.slides.internal.v8.k5 e9() {
      return this.c4.e9();
   }

   public final com.aspose.slides.internal.f2.k5 v3() {
      return this.y2;
   }

   public final com.aspose.slides.internal.f2.k5 g7() {
      return this.y1;
   }

   @Override
   public String z1() {
      return "table";
   }

   @Override
   public int z3() {
      return 71;
   }

   @Override
   public com.aspose.slides.internal.e5.t2 n5(com.aspose.slides.internal.e5.t2 var1, boolean var2) {
      z1 var3 = (z1)super.n5(var1, var2);
      if (var2) {
         var3.a0 = new List<>();
         var3.o0 = false;
         var3.d2 = new k5();
         var3.d5 = null;
         var3.s3 = null;
         var3.z7 = null;
      }

      return var3;
   }

   @Override
   public final k5 n5() {
      return this.d2;
   }

   public final e2 j4() {
      return this.z7;
   }
}
