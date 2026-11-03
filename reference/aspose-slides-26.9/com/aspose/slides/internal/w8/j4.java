package com.aspose.slides.internal.w8;

import com.aspose.slides.ms.System.d1;

public class j4 extends com.aspose.slides.internal.w5.k5 implements p6 {
   private q0 k5;
   private boolean u3;
   private String a6;

   public j4(com.aspose.slides.internal.f5.e2 var1, com.aspose.slides.internal.f5.z1 var2) {
      super(var1, var2);
   }

   public final String j9() {
      return this.e5();
   }

   public final void m3(String var1) {
      this.i9();
      this.t9(var1);
   }

   private void i9() {
      if (!this.u3) {
         this.a6 = this.j9();
         this.u3 = true;
      }
   }

   public final q0 z6() {
      if (this.k5 == null) {
         this.k5 = this.n5(q0.class);
      }

      return this.k5;
   }

   @Override
   public final void n5(q0 var1) {
      this.k5 = var1;
   }

   public final String e9() {
      return this.t2("accesskey", d1.n5);
   }

   public final void z8(String var1) {
      this.n5("accesskey", var1);
   }

   public final int o5() {
      return this.n5("cols", 20, Integer.class);
   }

   public final void n5(int var1) {
      this.n5("cols", var1);
   }

   public final boolean j8() {
      return this.t2("disabled");
   }

   public final void n5(boolean var1) {
      this.k5("disabled", var1);
   }

   public final String w2() {
      return this.t2("name", d1.n5);
   }

   public final void j5(String var1) {
      this.n5("name", var1);
   }

   public final boolean s0() {
      return this.t2("readonly");
   }

   public final void k5(boolean var1) {
      this.k5("readonly", var1);
   }

   public final int v8() {
      return this.n5("rows", 2, Integer.class);
   }

   public final void l6(int var1) {
      this.n5("rows", var1);
   }

   public final int v3() {
      return this.n5("tabindex", 0, Integer.class);
   }

   public final void k5(int var1) {
      this.n5("tabindex", var1);
   }

   public final String g7() {
      return "textarea";
   }

   public final String j4() {
      this.i9();
      return this.a6;
   }

   public final void w1(String var1) {
      this.a6 = var1;
      this.u3 = true;
   }

   @Override
   public void n5(com.aspose.slides.internal.w5.a6 var1) {
      com.aspose.slides.internal.w5.a6 var2 = var1.n5(this);
      var1.n5(this, var2);
   }
}
