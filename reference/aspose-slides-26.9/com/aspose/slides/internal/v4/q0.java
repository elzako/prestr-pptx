package com.aspose.slides.internal.v4;

import com.aspose.slides.internal.e5.i1;
import com.aspose.slides.ms.System.d1;

public class q0 extends n5 {
   private com.aspose.slides.internal.o9b.w1 u9 = com.aspose.slides.internal.o9b.w1.n5.u3();
   private boolean h0;
   private String c8;
   private com.aspose.slides.internal.f2.k5 t2;

   public q0(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      this.c8 = var1.a6(299).j_();
      super.n5(var1);
   }

   @Override
   public void u9() {
      super.u9();
      this.n_().n5(this);
   }

   @Override
   public void c8() {
      if (this.u3 == null) {
         this.l6("one (1) non-XSL namespace child");
      }

      this.n_().l6(this);
   }

   @Override
   public void n5(com.aspose.slides.internal.w2.u9 var1, String var2, String var3) {
      if (d1.a6("http://www.w3.org/1999/XSL/Format", var2)) {
         this.k5(var1, var2, var3);
      } else if (this.u3 != null) {
         this.n5(var1, new com.aspose.slides.internal.o0.l6(var2, null, var3));
      }
   }

   @Override
   public String z1() {
      return "instream-foreign-object";
   }

   @Override
   public int z3() {
      return 37;
   }

   private void a3() {
      if (!this.h0) {
         i1 var1 = (i1)this.u3;
         com.aspose.slides.internal.o9b.j5 var2 = com.aspose.slides.internal.o9b.j5.n5.k5();
         var1.n5(var2.k5(), this.c8).n5(this.u9);
         this.t2 = var1.j5();
         this.h0 = true;
      }
   }

   @Override
   public int a5() {
      this.a3();
      return !this.u9.n5() ? com.aspose.slides.internal.v6g.k5.u3(this.u9.l6() * 1000.0F, 13) : 0;
   }

   @Override
   public int h2() {
      this.a3();
      return !this.u9.n5() ? com.aspose.slides.internal.v6g.k5.u3(this.u9.k5() * 1000.0F, 13) : 0;
   }

   @Override
   public com.aspose.slides.internal.f2.k5 v0() {
      this.a3();
      return this.t2;
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.t2 var1) {
      super.n5(var1);
   }

   public final i1 f0() {
      return (i1)this.u3;
   }
}
