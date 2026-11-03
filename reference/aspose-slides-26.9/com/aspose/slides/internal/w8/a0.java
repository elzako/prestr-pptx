package com.aspose.slides.internal.w8;

import com.aspose.slides.ms.System.d1;

public class a0 extends com.aspose.slides.internal.w5.k5 implements p6 {
   private q0 k5;

   public a0(com.aspose.slides.internal.f5.e2 var1, com.aspose.slides.internal.f5.z1 var2) {
      super(var1, var2);
   }

   public final q0 j9() {
      if (this.k5 == null) {
         this.k5 = this.n5(q0.class);
      }

      return this.k5;
   }

   @Override
   public final void n5(q0 var1) {
      this.k5 = var1;
   }

   public final String z6() {
      return this.t2("accesskey", d1.n5);
   }

   public final void m3(String var1) {
      this.n5("accesskey", var1);
   }

   public final String e9() {
      return this.t2("htmlfor", d1.n5);
   }

   public final void z8(String var1) {
      this.n5("htmlfor", var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.w5.a6 var1) {
      var1.k5(this);
      this.l6(var1);
      var1.u3(this);
   }
}
