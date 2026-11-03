package com.aspose.slides.internal.u6;

import com.aspose.slides.internal.h2.b3;
import com.aspose.slides.internal.h2.f2;
import com.aspose.slides.ms.System.d1;

public class y1 extends k7 implements com.aspose.slides.internal.h2.d2 {
   private b3 c8;
   private com.aspose.slides.internal.h2.t2 t2;
   private int s7;
   private int z1;
   private com.aspose.slides.internal.f2.k5 t4;
   private f2 q0;
   private f2 z3;
   private f2 m1;

   public y1(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      this.c8 = var1.u3(17).k_();
      this.t2 = var1.u3();
      this.s7 = var1.u3(58).a6();
      this.z1 = var1.u3(59).a6();
      this.t4 = var1.u3(115).c8();
      this.q0 = var1.u3(131).y4();
      this.z3 = var1.u3(132).y4();
      this.m1 = var1.u3(133).y4();
      super.n5(var1);
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.w2.u9 var2, com.aspose.slides.internal.w2.k5 var3, com.aspose.slides.internal.e5.w1 var4) {
      super.n5(var1, var2, var3, var4);
      if (!this.p_()) {
         y2 var5 = (y2)this.n5;
         this.u9 = var5.u9;
         this.h0 = var5.h0;
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.t2 var1) {
      if (!this.p_()) {
         m1 var2 = (m1)var1;
         y2 var3 = (y2)this.s_();
         this.n5(var2, var3.n5(this));
      }

      super.n5(var1);
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
      if (this.u3 == null) {
         this.l6("(table-cell+)");
      }

      if (!this.p_()) {
         this.u9 = null;
         this.h0 = null;
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.w2.u9 var1, String var2, String var3) {
      if (d1.a6("http://www.w3.org/1999/XSL/Format", var2)) {
         if (d1.a6(var3, "marker")) {
            if (this.u3 != null) {
               this.l6(var1, "fo:marker", "(table-cell+)");
            }
         } else if (!d1.a6(var3, "table-cell")) {
            this.k5(var1, var2, var3);
         }
      }
   }

   @Override
   public y2 b3() {
      return (y2)this.n5;
   }

   @Override
   public final int u6() {
      return this.s7;
   }

   @Override
   public final int t1() {
      return this.z1;
   }

   public final f2 o0() {
      return this.m1;
   }

   public final f2 z7() {
      return this.z3;
   }

   public final f2 v4() {
      return this.q0;
   }

   public final b3 a5() {
      return this.c8;
   }

   @Override
   public com.aspose.slides.internal.h2.t2 x9() {
      return this.t2;
   }

   @Override
   public String z1() {
      return "table-row";
   }

   @Override
   public int z3() {
      return 79;
   }
}
