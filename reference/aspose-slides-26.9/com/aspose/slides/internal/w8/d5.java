package com.aspose.slides.internal.w8;

import com.aspose.slides.ms.System.d1;

public class d5 extends com.aspose.slides.internal.w5.k5 {
   public d5(com.aspose.slides.internal.f5.e2 var1, com.aspose.slides.internal.f5.z1 var2) {
      super(var1, var2);
   }

   public final boolean j9() {
      return this.t2("disabled");
   }

   public final void n5(boolean var1) {
      this.k5("disabled", var1);
   }

   public final String z6() {
      return this.t2("charset", d1.n5);
   }

   public final void m3(String var1) {
      this.n5("charset", var1);
   }

   public final String e9() {
      String var1 = this.t2("href", d1.n5);
      if (var1 != null && d1.c8(var1, "&amp;") != -1) {
         var1 = d1.n5(var1, "&amp;", "&");
      }

      return var1;
   }

   public final void z8(String var1) {
      this.n5("href", var1);
   }

   public final String o5() {
      return this.t2("hreflang", d1.n5);
   }

   public final void j5(String var1) {
      this.n5("hreflang", var1);
   }

   public final String j8() {
      return this.t2("media", d1.n5);
   }

   public final void w1(String var1) {
      this.n5("media", var1);
   }

   public final String w2() {
      return this.t2("rel", d1.n5);
   }

   public final void r4(String var1) {
      this.n5("rel", var1);
   }

   public final String s0() {
      return this.t2("rev", d1.n5);
   }

   public final void c4(String var1) {
      this.n5("rev", var1);
   }

   public final String v8() {
      return this.t2("target", d1.n5);
   }

   public final void y2(String var1) {
      this.n5("target", var1);
   }

   public final String v3() {
      return this.t2("type", d1.n5);
   }

   public final void y1(String var1) {
      this.n5("type", var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.w5.a6 var1) {
   }
}
