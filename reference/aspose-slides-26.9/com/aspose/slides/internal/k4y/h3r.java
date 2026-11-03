package com.aspose.slides.internal.k4y;

public class h3r extends b3 {
   private boolean n5;
   private boolean l6;
   private boolean k5;
   private boolean u3;
   private boolean a6;
   private boolean u9;
   private boolean h0;
   private l8r c8;
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "noGrp", "noUngrp", "noSelect", "noRot", "noChangeAspect", "noMove", "noResize", "extLst"
   );

   public h3r(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.s7();
      h3r$1 var2 = new h3r$1(this);
      n5(var1, var2);
      n5(var1, new h3r$2(this, var1));
   }

   public h3r() {
      this.s7();
   }

   private void s7() {
      this.n5 = false;
      this.l6 = false;
      this.k5 = false;
      this.u3 = false;
      this.a6 = false;
      this.u9 = false;
      this.h0 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5) {
         var2.l6("noGrp", this.n5 ? "1" : "0");
      }

      if (this.l6) {
         var2.l6("noUngrp", this.l6 ? "1" : "0");
      }

      if (this.k5) {
         var2.l6("noSelect", this.k5 ? "1" : "0");
      }

      if (this.u3) {
         var2.l6("noRot", this.u3 ? "1" : "0");
      }

      if (this.a6) {
         var2.l6("noChangeAspect", this.a6 ? "1" : "0");
      }

      if (this.u9) {
         var2.l6("noMove", this.u9 ? "1" : "0");
      }

      if (this.h0) {
         var2.l6("noResize", this.h0 ? "1" : "0");
      }

      if (this.c8 != null) {
         this.c8.n5("a", var2, "extLst");
      }

      var2.s7();
   }

   public final void n5(x8 var1) {
      this.c8 = (l8r)var1;
   }

   public final boolean n5() {
      return this.n5;
   }

   public final void n5(boolean var1) {
      this.n5 = var1;
   }

   public final boolean l6() {
      return this.l6;
   }

   public final void l6(boolean var1) {
      this.l6 = var1;
   }

   public final boolean k5() {
      return this.k5;
   }

   public final void k5(boolean var1) {
      this.k5 = var1;
   }

   public final boolean u3() {
      return this.u3;
   }

   public final void u3(boolean var1) {
      this.u3 = var1;
   }

   public final boolean a6() {
      return this.a6;
   }

   public final void a6(boolean var1) {
      this.a6 = var1;
   }

   public final boolean u9() {
      return this.u9;
   }

   public final void u9(boolean var1) {
      this.u9 = var1;
   }

   public final boolean h0() {
      return this.h0;
   }

   public final void h0(boolean var1) {
      this.h0 = var1;
   }

   public final x8 c8() {
      return this.c8;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 t2() {
      return t2;
   }

   // $VF: synthetic method
   static boolean n5(h3r var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(h3r var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean k5(h3r var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean u3(h3r var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean a6(h3r var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean u9(h3r var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean h0(h3r var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static l8r n5(h3r var0, l8r var1) {
      return var0.c8 = var1;
   }
}
