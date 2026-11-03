package com.aspose.slides.internal.t1;

import com.aspose.slides.ms.System.d1;

public class j5 extends com.aspose.slides.internal.e5.t9 implements u9 {
   private String u9;
   private z8 h0;
   private int c8 = 0;

   public j5(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      this.u9 = var1.a6(154).j_();
      if (d1.n5(this.u9)) {
         this.k5("master-reference");
      }
   }

   @Override
   public void u9() {
      s7 var1 = (s7)this.n5;
      var1.n5((com.aspose.slides.internal.t1.u9)(this));
   }

   @Override
   public void n5(com.aspose.slides.internal.w2.u9 var1, String var2, String var3) {
      if (d1.a6("http://www.w3.org/1999/XSL/Format", var2)) {
         this.k5(var1, var2, var3);
      }
   }

   @Override
   public final z8 n5(boolean var1, boolean var2, boolean var3, boolean var4) {
      if (this.c8 == 0) {
         this.c8 = 1;
         return this.h0;
      } else {
         return null;
      }
   }

   @Override
   public final void n5() {
      this.c8 = 0;
   }

   @Override
   public final boolean l6() {
      if (this.c8 == 0) {
         return false;
      }

      this.c8 = 0;
      return true;
   }

   @Override
   public final boolean k5() {
      return false;
   }

   @Override
   public String z1() {
      return "single-page-master-reference";
   }

   @Override
   public int z3() {
      return 69;
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
      return false;
   }

   @Override
   public final boolean a6() {
      return true;
   }
}
