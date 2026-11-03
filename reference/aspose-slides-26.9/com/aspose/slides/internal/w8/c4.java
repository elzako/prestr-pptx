package com.aspose.slides.internal.w8;

import com.aspose.slides.ms.System.d1;

public class c4 extends com.aspose.slides.internal.w5.k5 implements p6 {
   private q0 k5;
   private boolean u3;
   private boolean a6;
   private boolean u9;
   private String h0;
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9(
      "checkbox",
      "button",
      "file",
      "color",
      "date",
      "datetime",
      "datetime-local",
      "email",
      "hidden",
      "image",
      "month",
      "number",
      "password",
      "radio",
      "range",
      "reset",
      "search",
      "submit",
      "tel",
      "text",
      "time",
      "url",
      "week"
   );

   public c4(com.aspose.slides.internal.f5.e2 var1, com.aspose.slides.internal.f5.z1 var2) {
      super(var1, var2);
   }

   private void h6() {
      if (!this.a6) {
         this.h0 = this.j9();
         this.a6 = true;
      }
   }

   public final String j9() {
      return this.t2("value", d1.n5);
   }

   public final void m3(String var1) {
      this.h6();
      this.n5("value", var1);
   }

   private void y8() {
      if (!this.u3) {
         this.u9 = this.z6();
         this.u3 = true;
      }
   }

   public final boolean z6() {
      return this.t2("checked");
   }

   public final void n5(boolean var1) {
      this.y8();
      this.k5("checked", var1);
   }

   public final q0 e9() {
      if (this.k5 == null) {
         this.k5 = this.n5(q0.class);
      }

      return this.k5;
   }

   @Override
   public final void n5(q0 var1) {
      this.k5 = var1;
   }

   public final String o5() {
      return this.t2("accept", d1.n5);
   }

   public final void z8(String var1) {
      this.n5("accept", var1);
   }

   public final String j8() {
      return this.t2("accesskey", d1.n5);
   }

   public final void j5(String var1) {
      this.n5("accesskey", var1);
   }

   public final String w2() {
      return this.t2("align", d1.n5);
   }

   public final void w1(String var1) {
      this.n5("align", var1);
   }

   public final String s0() {
      return this.t2("alt", d1.n5);
   }

   public final void r4(String var1) {
      this.n5("alt", var1);
   }

   public final boolean v8() {
      this.y8();
      return this.u9;
   }

   public final void k5(boolean var1) {
      this.u9 = var1;
      this.u3 = true;
   }

   public final boolean v3() {
      return this.t2("disabled");
   }

   public final void u3(boolean var1) {
      this.k5("disabled", var1);
   }

   public final int g7() {
      return this.n5("maxlength", Short.valueOf((short)32767), Short.class);
   }

   public final void n5(int var1) {
      this.n5("maxlength", var1);
   }

   public final String j4() {
      return this.t2("name", d1.n5);
   }

   public final void c4(String var1) {
      this.n5("name", var1);
   }

   public final boolean i9() {
      return this.t2("readonly");
   }

   public final void a6(boolean var1) {
      this.k5("readonly", var1);
   }

   public final int f5() {
      return this.n5("size", 20, Integer.class);
   }

   public final void l6(int var1) {
      this.n5("size", var1);
   }

   public final String j3() {
      return this.t2("src", d1.n5);
   }

   public final void y2(String var1) {
      this.n5("src", var1);
   }

   public final int n1() {
      return this.n5("tabindex", 0, Integer.class);
   }

   public final void k5(int var1) {
      this.n5("tabindex", var1);
   }

   public final String p6() {
      return this.t2("type", d1.n5);
   }

   public final void y1(String var1) {
      this.n5("type", var1);
   }

   public final String d1() {
      return this.t2("usemap", d1.n5);
   }

   public final void a0(String var1) {
      this.n5("usemap", var1);
   }

   public final String s4() {
      this.h6();
      return this.h0;
   }

   public final void d2(String var1) {
      this.h0 = var1;
      this.a6 = true;
   }

   @Override
   public void n5(com.aspose.slides.internal.w5.a6 var1) {
      switch (c8.n5(d1.u9(this.p6()))) {
         case 0:
            var1.l6(this);
            break;
         case 1:
         case 2:
            var1.n5(this);
            break;
         case 3:
            var1.t9(this);
            break;
         case 4:
            var1.t2(this);
            break;
         case 5:
            var1.c8(this);
            break;
         case 6:
            var1.y4(this);
            break;
         case 7:
            var1.h0(this);
         case 8:
         case 9:
         default:
            break;
         case 10:
            var1.s7(this);
            break;
         case 11:
            var1.e2(this);
            break;
         case 12:
            var1.z1(this);
            break;
         case 13:
            var1.t4(this);
            break;
         case 14:
            var1.k5(this);
            break;
         case 15:
            var1.n5(this);
            break;
         case 16:
            var1.a6(this);
            break;
         case 17:
            var1.n5(this);
            break;
         case 18:
            var1.u3(this);
            break;
         case 19:
            var1.z1(this);
            break;
         case 20:
            var1.n3(this);
            break;
         case 21:
            var1.u9(this);
            break;
         case 22:
            var1.x8(this);
      }
   }
}
