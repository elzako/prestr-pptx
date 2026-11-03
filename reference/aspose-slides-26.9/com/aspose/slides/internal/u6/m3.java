package com.aspose.slides.internal.u6;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.h2.j9;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.d1;

public class m3 extends w1 {
   private com.aspose.slides.internal.h2.t2 z1;
   private int t4;
   private com.aspose.slides.internal.f2.k5 q0;
   private com.aspose.slides.internal.v8.u9 z3;
   private int m1;
   private int k7;
   public boolean u9 = true;
   public boolean h0 = true;
   private boolean m3;
   private com.aspose.slides.internal.e5.w1 z8 = null;
   public int c8 = 0;
   public Dictionary<Integer, Integer> t2 = new Dictionary<>();
   public int s7 = 0;

   public m3(com.aspose.slides.internal.e5.t2 var1) {
      this(var1, false);
   }

   public m3(com.aspose.slides.internal.e5.t2 var1, boolean var2) {
      super(var1);
      this.m3 = var2;
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      this.z1 = var1.u3();
      this.t4 = var1.u3(76).u9().u3();
      this.q0 = var1.u3(77).c8();
      this.m1 = var1.u3(164).u9().u3();
      this.k7 = var1.u3(165).u9().u3();
      super.n5(var1);
      if (this.m1 <= 0) {
         x8 var2 = j5.n5(this.q_().m1());
         var2.n5(this, "number-columns-repeated", this.m1, this.m_());
      }

      if (this.k7 <= 0) {
         x8 var3 = j5.n5(this.q_().m1());
         var3.n5(this, "number-columns-spanned", this.k7, this.m_());
      }

      if (this.q0.a6() == 9) {
         if (!this.m3 && !this.e5().o0()) {
            x8 var4 = j5.n5(this.q_().m1());
            var4.u3(this, this.m_());
         }

         this.q0 = new j9(1.0, this);
      }

      if (!this.m3) {
         this.z8 = var1;
      }
   }

   @Override
   public void u9() {
      super.u9();
      this.n_().n5(this);
   }

   public final void n5(com.aspose.slides.internal.j9.k5 var1) {
      this.t9 = var1;
      this.i9();
   }

   @Override
   public void c8() {
      this.n_().l6(this);
   }

   @Override
   public void n5(com.aspose.slides.internal.w2.u9 var1, String var2, String var3) {
      if (d1.a6("http://www.w3.org/1999/XSL/Format", var2)) {
         this.k5(var1, var2, var3);
      }
   }

   @Override
   public com.aspose.slides.internal.h2.t2 x9() {
      return this.z1;
   }

   public final com.aspose.slides.internal.f2.k5 i1() {
      return this.q0;
   }

   public final com.aspose.slides.internal.v8.u9 b3() {
      return this.z3;
   }

   public final void n5(com.aspose.slides.internal.v8.u9 var1) {
      this.z3 = var1;
   }

   public final void n5(com.aspose.slides.internal.f2.k5 var1) {
      this.q0 = var1;
   }

   public final int o0() {
      return this.t4;
   }

   public final void a6(int var1) {
      this.t4 = var1;
   }

   public final int z7() {
      return this.m1;
   }

   public final int v4() {
      return this.k7;
   }

   @Override
   public String z1() {
      return "table-column";
   }

   @Override
   public int z3() {
      return 76;
   }

   public final boolean u6() {
      return this.m3;
   }

   @Override
   public String toString() {
      a5 var1 = new a5("fo:table-column");
      var1.n5(" column-number=").k5(this.o0());
      if (this.z7() > 1) {
         var1.n5(" number-columns-repeated=").k5(this.z7());
      }

      if (this.v4() > 1) {
         var1.n5(" number-columns-spanned=").k5(this.v4());
      }

      var1.n5(" column-width=").n5(((com.aspose.slides.internal.h2.a5)this.i1()).j_());
      return var1.toString();
   }

   public final com.aspose.slides.internal.h2.a5 u9(int var1) {
      return this.z8.u3(var1);
   }

   public final void t1() {
      this.z8 = null;
   }

   public final boolean a5() {
      return com.aspose.slides.internal.v6g.k5.l6(this.i1(), j9.class);
   }
}
