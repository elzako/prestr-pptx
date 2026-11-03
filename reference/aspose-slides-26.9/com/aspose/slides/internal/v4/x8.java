package com.aspose.slides.internal.v4;

import com.aspose.slides.ms.System.d1;

public class x8 extends com.aspose.slides.internal.e5.t9 {
   private int u9;
   private com.aspose.slides.internal.h2.f2 h0;
   private com.aspose.slides.internal.h2.f2 c8;
   private com.aspose.slides.internal.h2.f2 t2;

   public x8(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      super.n5(var1);
      this.u9 = var1.u3(95).a6();
      this.h0 = var1.u3(133).y4();
      this.c8 = var1.u3(131).y4();
      this.t2 = var1.u3(132).y4();
   }

   public final com.aspose.slides.internal.h2.f2 i1() {
      return this.h0;
   }

   public final com.aspose.slides.internal.h2.f2 e5() {
      return this.c8;
   }

   public final com.aspose.slides.internal.h2.f2 b3() {
      return this.t2;
   }

   @Override
   public void n5(com.aspose.slides.internal.w2.u9 var1, String var2, String var3) {
      if (d1.a6("http://www.w3.org/1999/XSL/Format", var2) && !this.l6(var2, var3)) {
         this.k5(var1, var2, var3);
      }
   }

   @Override
   public void c8() {
      if (this.u3 == null) {
         this.l6("(%block;)+");
      }
   }

   @Override
   public String z1() {
      return "float";
   }

   @Override
   public int z3() {
      return 15;
   }

   public final int o0() {
      return this.u9;
   }
}
