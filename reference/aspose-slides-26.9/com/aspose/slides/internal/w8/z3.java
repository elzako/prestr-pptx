package com.aspose.slides.internal.w8;

import com.aspose.slides.ms.System.d1;

public class z3 extends com.aspose.slides.internal.w5.k5 {
   private t9 k5;

   public z3(com.aspose.slides.internal.f5.e2 var1, com.aspose.slides.internal.f5.z1 var2) {
      super(var1, var2);
   }

   public final String j9() {
      return this.t2("frameborder", d1.n5);
   }

   public final void m3(String var1) {
      this.n5("frameborder", var1);
   }

   public final String z6() {
      return this.t2("longdesc", d1.n5);
   }

   public final void z8(String var1) {
      this.n5("longdesc", var1);
   }

   public final String e9() {
      return this.t2("marginheight", d1.n5);
   }

   public final void j5(String var1) {
      this.n5("marginheight", var1);
   }

   public final String o5() {
      return this.t2("marginwidth", d1.n5);
   }

   public final void w1(String var1) {
      this.n5("marginwidth", var1);
   }

   public final String j8() {
      return this.t2("name", d1.n5);
   }

   public final void r4(String var1) {
      this.n5("name", var1);
   }

   public final boolean w2() {
      return this.t2("noresize");
   }

   public final void n5(boolean var1) {
      this.k5("noresize", var1);
   }

   public final String s0() {
      return this.t2("scrolling", d1.n5);
   }

   public final void c4(String var1) {
      this.n5("scrolling", var1);
   }

   public final String v8() {
      return this.t2("src", d1.n5);
   }

   public final void y2(String var1) {
      this.n5("src", var1);
   }

   public final t9 v3() {
      if (this.k5 == null) {
         if (d1.n5(this.v8())) {
            return null;
         }

         String var1 = com.aspose.slides.internal.z0k.z1.l6(this.y4().r4().c8().n5(), this.v8());
         com.aspose.slides.internal.j4.a6 var2 = this.y4().r4().u9().n5(this, new com.aspose.slides.internal.j4.u3(var1));
         if (var2.l6() != null || var2.n5() == null) {
            return null;
         }

         String var3 = this.y4().r4().h0().l6(var2.n5());
         com.aspose.slides.internal.f5.k5 var4 = new com.aspose.slides.internal.f5.k5(this.y4().r4().u9(), this.y4().r4().c8(), this.y4().r4().t2());
         this.k5 = com.aspose.slides.internal.v6g.k5.n5(var4.n5(var3), t9.class);
      }

      return this.k5;
   }

   @Override
   public void n5(com.aspose.slides.internal.w5.a6 var1) {
      var1.n5(this);
   }
}
