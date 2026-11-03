package com.aspose.slides.internal.w8;

import com.aspose.slides.ms.System.d1;

public class t2 extends com.aspose.slides.internal.w5.k5 implements p6 {
   private q0 k5 = null;

   public t2(com.aspose.slides.internal.f5.e2 var1, com.aspose.slides.internal.f5.z1 var2) {
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

   public final boolean e9() {
      return this.t2("disabled");
   }

   public final void n5(boolean var1) {
      this.k5("disabled", var1);
   }

   public final String o5() {
      return this.t2("name", d1.n5);
   }

   public final void z8(String var1) {
      this.n5("name", var1);
   }

   public final int j8() {
      return this.n5("tabindex", 0, Integer.class);
   }

   public final void n5(int var1) {
      this.n5("tabindex", var1);
   }

   public final String w2() {
      return this.t2("type", d1.n5);
   }

   public final String s0() {
      return this.t2("value", d1.n5);
   }

   public final void j5(String var1) {
      this.n5("value", var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.w5.a6 var1) {
      var1.n5(this);
   }
}
