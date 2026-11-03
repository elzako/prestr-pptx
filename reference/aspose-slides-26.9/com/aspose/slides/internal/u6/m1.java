package com.aspose.slides.internal.u6;

import com.aspose.slides.internal.h2.b3;
import com.aspose.slides.internal.h2.d5;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class m1 extends w1 implements d5 {
   private com.aspose.slides.internal.h2.c8 u9;
   private com.aspose.slides.internal.h2.t2 h0;
   private b3 c8;
   private int t2;
   private int s7;
   private int z1;
   private int t4;
   private int q0;
   private int z3;
   private int m1;
   private com.aspose.slides.internal.f2.k5 k7;
   private int m3;
   private boolean z8 = false;

   public m1(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      super.n5(var1);
      this.u9 = com.aspose.slides.internal.h2.c8.n5(var1);
      this.h0 = var1.u3();
      this.c8 = var1.u3(17).k_();
      this.s7 = var1.u3(87).a6();
      this.z1 = var1.u3(90).a6();
      this.m1 = var1.u3(235).a6();
      if (this.v0() && this.s_().z3() != 79) {
         ((y2)this.s_()).v4();
      }

      this.t4 = var1.u3(92).a6();
      this.t2 = var1.u3(76).u9().u3();
      this.q0 = var1.u3(165).u9().u3();
      this.z3 = var1.u3(166).u9().u3();
      this.k7 = var1.u3(264).c8();
      this.m3 = var1.u3(257).a6();
   }

   @Override
   public void u9() {
      super.u9();
      this.n_().n5(this);
   }

   @Override
   public void c8() {
      super.c8();
      this.n_().l6(this);
   }

   @Override
   public void r_() {
      if (!this.z8) {
         this.n5("marker* (%block;)+", true);
      }

      if ((this.v0() || this.f0()) && this.s_().z3() == 79) {
         x8 var1 = j5.n5(this.q_().m1());
         var1.l6(this, this.m_());
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.w2.u9 var1, String var2, String var3) {
      if (d1.a6("http://www.w3.org/1999/XSL/Format", var2)) {
         if (d1.a6(var3, "marker")) {
            if (this.z8) {
               this.l6(var1, "fo:marker", "(%block;)");
            }
         } else if (!this.l6(var2, var3)) {
            this.k5(var1, var2, var3);
         } else {
            this.z8 = true;
         }
      }
   }

   @Override
   public boolean j5() {
      return true;
   }

   @Override
   public final com.aspose.slides.internal.h2.c8 i1() {
      return this.u9;
   }

   @Override
   public com.aspose.slides.internal.h2.t2 x9() {
      return this.h0;
   }

   public final int b3() {
      return this.t2;
   }

   public final boolean o0() {
      return this.z1 == 130;
   }

   public final int z7() {
      return q1.n5(this.q0, 1);
   }

   public final void a6(int var1) {
      this.q0 = var1;
   }

   public final int v4() {
      return q1.n5(this.z3, 1);
   }

   public final b3 u6() {
      return this.c8;
   }

   public final int t1() {
      return this.s7;
   }

   public final com.aspose.slides.internal.f2.k5 a5() {
      return this.k7;
   }

   public final int h2() {
      return this.m3;
   }

   public final boolean v0() {
      return this.m1 == 149;
   }

   public final boolean f0() {
      return this.t4 == 149;
   }

   @Override
   public String z1() {
      return "table-cell";
   }

   @Override
   public int z3() {
      return 75;
   }
}
