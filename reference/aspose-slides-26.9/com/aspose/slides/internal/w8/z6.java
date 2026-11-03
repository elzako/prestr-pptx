package com.aspose.slides.internal.w8;

import com.aspose.slides.ms.System.d1;

public class z6 extends com.aspose.slides.internal.w5.k5 {
   public z6(com.aspose.slides.internal.f5.e2 var1, com.aspose.slides.internal.f5.z1 var2) {
      super(var1, var2);
   }

   public final int j9() {
      w2 var1 = this.n5(w2.class);
      return var1 != null ? this.l6(var1.e9()) : -1;
   }

   public final String z6() {
      return this.t2("abbr", d1.n5);
   }

   public final void m3(String var1) {
      this.n5("abbr", var1);
   }

   public final String e9() {
      return this.t2("align", d1.n5);
   }

   public final void z8(String var1) {
      this.n5("align", var1);
   }

   public final String o5() {
      return this.t2("axis", d1.n5);
   }

   public final void j5(String var1) {
      this.n5("axis", var1);
   }

   public final String j8() {
      return this.t2("bgcolor", d1.n5);
   }

   public final void w1(String var1) {
      this.n5("bgcolor", var1);
   }

   public final String w2() {
      return this.t2("char", d1.n5);
   }

   public final void r4(String var1) {
      this.n5("char", var1);
   }

   public final String s0() {
      return this.t2("charoff", d1.n5);
   }

   public final void c4(String var1) {
      this.n5("charoff", var1);
   }

   public final int v8() {
      return this.n5("colspan", 1, Integer.class);
   }

   public final void n5(int var1) {
      this.n5("colspan", var1);
   }

   public final String v3() {
      return this.t2("headers", d1.n5);
   }

   public final void y2(String var1) {
      this.n5("headers", var1);
   }

   public final String g7() {
      return this.t2("height", d1.n5);
   }

   public final void y1(String var1) {
      this.n5("height", var1);
   }

   public final boolean j4() {
      return this.t2("nowrap");
   }

   public final void n5(boolean var1) {
      this.k5("nowrap", var1);
   }

   public final int i9() {
      return this.n5("rowspan", 1, Integer.class);
   }

   public final void l6(int var1) {
      this.n5("rowspan", var1);
   }

   public final String f5() {
      return this.t2("scope", d1.n5);
   }

   public final void a0(String var1) {
      this.n5("scope", var1);
   }

   public final String j3() {
      return this.t2("valign", d1.n5);
   }

   public final void d2(String var1) {
      this.n5("valign", var1);
   }

   public final String n1() {
      return this.t2("width", d1.n5);
   }

   public final void d5(String var1) {
      this.n5("width", var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.w5.a6 var1) {
      if ("TH".equals(this.a6())) {
         var1.t9(this);
         this.l6(var1);
         var1.z1(this);
      } else {
         var1.y4(this);
         this.l6(var1);
         var1.e2(this);
      }
   }
}
