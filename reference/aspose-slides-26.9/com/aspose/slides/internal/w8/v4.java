package com.aspose.slides.internal.w8;

import com.aspose.slides.ms.System.d1;

public class v4 extends com.aspose.slides.internal.w5.k5 {
   private boolean k5;
   private boolean u3;

   public v4(com.aspose.slides.internal.f5.e2 var1, com.aspose.slides.internal.f5.z1 var2) {
      super(var1, var2);
   }

   public final q0 j9() {
      return this.n5(q0.class);
   }

   public final boolean z6() {
      return this.t2("selected");
   }

   public final void n5(boolean var1) {
      this.v3();
      this.k5("selected", var1);
   }

   private void v3() {
      if (!this.k5) {
         this.u3 = this.z6();
         this.k5 = true;
      }
   }

   public final String e9() {
      return this.e5();
   }

   public final int o5() {
      return 0;
   }

   public final boolean j8() {
      return this.t2("disabled");
   }

   public final void k5(boolean var1) {
      this.k5("disabled", var1);
   }

   public final String w2() {
      return this.t2("label", d1.n5);
   }

   public final void m3(String var1) {
      this.n5("label", var1);
   }

   public final boolean s0() {
      this.v3();
      return this.u3;
   }

   public final void u3(boolean var1) {
      this.u3 = var1;
      this.k5 = true;
   }

   public final String v8() {
      return this.t2("value", d1.n5);
   }

   public final void z8(String var1) {
      this.n5("value", var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.w5.a6 var1) {
      var1.n5(this);
      this.l6(var1);
      var1.l6(this);
   }
}
