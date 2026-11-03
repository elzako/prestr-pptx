package com.aspose.slides.internal.t1;

import com.aspose.slides.ms.System.d1;

public class k5 extends com.aspose.slides.internal.e5.t9 {
   private String u9;
   private z8 h0;
   private int c8;
   private int t2;
   private int s7;

   public k5(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      this.u9 = var1.a6(154).j_();
      this.c8 = var1.a6(185).a6();
      this.t2 = var1.a6(167).a6();
      this.s7 = var1.a6(16).a6();
      if (d1.n5(this.u9)) {
         this.k5("master-reference");
      }
   }

   @Override
   public void u9() {
      this.b3().n5(this);
   }

   private z3 b3() {
      return (z3)this.n5;
   }

   @Override
   public void n5(com.aspose.slides.internal.w2.u9 var1, String var2, String var3) {
      this.k5(var1, var2, var3);
   }

   public final boolean n5(boolean var1, boolean var2, boolean var3, boolean var4) {
      return (this.c8 == 8 || this.c8 == 50 && var2 || this.c8 == 72 && var3 || this.c8 == 186 && var2 && var3 || this.c8 == 117 && !var2 && !var3)
         && (this.t2 == 8 || this.t2 == 99 && var1 || this.t2 == 43 && !var1)
         && (this.s7 == 8 || this.s7 == 16 && var4 || this.s7 == 98 && !var4);
   }

   public final z8 i1() {
      return this.h0;
   }

   public final int e5() {
      return this.c8;
   }

   @Override
   public String z1() {
      return "conditional-page-master-reference";
   }

   @Override
   public int z3() {
      return 12;
   }

   public final void n5(h0 var1) {
      this.h0 = var1.a6(this.u9);
      if (this.h0 == null) {
         com.aspose.slides.internal.p3.n3.n5(this.q_().m1()).n5(this, this.n5.t9(), this.u9, this.m_());
      }
   }
}
