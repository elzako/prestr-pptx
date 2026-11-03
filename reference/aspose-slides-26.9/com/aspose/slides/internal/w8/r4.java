package com.aspose.slides.internal.w8;

import com.aspose.slides.ms.System.d1;

public class r4 extends com.aspose.slides.internal.w5.k5 implements p6 {
   private q0 k5;

   public r4(com.aspose.slides.internal.f5.e2 var1, com.aspose.slides.internal.f5.z1 var2) {
      super(var1, var2);
   }

   public final String j9() {
      return this.t2("name", d1.n5);
   }

   public final void m3(String var1) {
      this.n5("name", var1);
   }

   @Override
   public final void n5(q0 var1) {
      this.k5 = var1;
   }

   public final String z6() {
      return this.t2("align", d1.n5);
   }

   public final void z8(String var1) {
      this.n5("align", var1);
   }

   public final String e9() {
      return this.t2("alt", d1.n5);
   }

   public final void j5(String var1) {
      this.n5("alt", var1);
   }

   public final String o5() {
      return this.t2("border", d1.n5);
   }

   public final void w1(String var1) {
      this.n5("border", var1);
   }

   public final float j8() {
      return this.n5("height", 0.0F, Float.class, "\\d+(.\\d+)?");
   }

   public final void n5(float var1) {
      this.n5("height", (float)var1);
   }

   public final int w2() {
      return this.n5("hspace", 0, Integer.class);
   }

   public final void n5(int var1) {
      this.n5("hspace", var1);
   }

   public final boolean s0() {
      return this.t2("ismap");
   }

   public final void n5(boolean var1) {
      this.k5("ismap", var1);
   }

   public final String v8() {
      return this.t2("longdesc", d1.n5);
   }

   public final void r4(String var1) {
      this.n5("longdesc", var1);
   }

   public final String v3() {
      return this.t2("src", d1.n5);
   }

   public final void c4(String var1) {
      this.n5("src", var1);
   }

   public final String g7() {
      return this.t2("usemap", d1.n5);
   }

   public final void y2(String var1) {
      this.n5("usemap", var1);
   }

   public final int j4() {
      return this.n5("vspace", 0, Integer.class);
   }

   public final void l6(int var1) {
      this.n5("vspace", var1);
   }

   public final float i9() {
      return this.n5("width", 0.0F, Float.class, "\\d+(.\\d+)?");
   }

   public final void l6(float var1) {
      this.n5("width", (float)var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.w5.a6 var1) {
      var1.n5(this);
   }
}
