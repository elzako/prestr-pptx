package com.aspose.slides.internal.t1;

import com.aspose.slides.internal.h2.a5;
import com.aspose.slides.ms.System.d1;

public class m1 extends com.aspose.slides.internal.e5.t9 implements u9 {
   private String u9;
   private z8 h0;
   private a5 c8;
   private int t2 = 0;

   public m1(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      this.u9 = var1.a6(154).j_();
      this.c8 = var1.a6(156);
      if (d1.n5(this.u9)) {
         this.k5("master-reference");
      }
   }

   @Override
   public void u9() {
      s7 var1 = (s7)this.n5;
      if (this.u9 == null) {
         this.k5("master-reference");
      } else {
         var1.n5((com.aspose.slides.internal.t1.u9)(this));
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.w2.u9 var1, String var2, String var3) {
      this.k5(var1, var2, var3);
   }

   @Override
   public final z8 n5(boolean var1, boolean var2, boolean var3, boolean var4) {
      if (this.i1() != -1 && this.t2 >= this.i1()) {
         return null;
      }

      this.t2++;
      return this.h0;
   }

   public final int i1() {
      if (this.c8.a6() == 89) {
         return -1;
      }

      int var1 = this.c8.u9().u3();
      if (var1 < 0) {
         var1 = 0;
      }

      return var1;
   }

   @Override
   public final void n5() {
      this.t2 = 0;
   }

   @Override
   public final boolean l6() {
      if (this.t2 == 0) {
         return false;
      }

      this.t2--;
      return true;
   }

   @Override
   public final boolean k5() {
      return false;
   }

   @Override
   public String z1() {
      return "repeatable-page-master-reference";
   }

   @Override
   public int z3() {
      return 63;
   }

   @Override
   public final void n5(h0 var1) {
      this.h0 = var1.a6(this.u9);
      if (this.h0 == null) {
         com.aspose.slides.internal.p3.n3.n5(this.q_().m1()).n5(this, this.n5.t9(), this.u9, this.m_());
      }
   }

   @Override
   public final boolean n5(String var1) {
      return d1.a6(this.h0.h0(58).b3(), var1);
   }

   @Override
   public final boolean u3() {
      return this.i1() == -1;
   }

   @Override
   public final boolean a6() {
      return false;
   }
}
