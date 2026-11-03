package com.aspose.slides.internal.k4y;

public class c3j extends b3 {
   private com.aspose.slides.ms.System.o0 l6 = new com.aspose.slides.ms.System.o0();
   private boolean k5;
   private int u3;
   private String a6;
   private boolean u9;
   private e3 h0;
   private b9y c8;
   public static final int n5 = t1k.n5("preview");
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "id", "returnToParent", "imageType", "transitionDur", "showBg", "blipFill", "spPr"
   );

   public c3j(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.t2();
      c3j$1 var2 = new c3j$1(this);
      n5(var1, var2);
      n5(var1, new c3j$2(this, var1));
   }

   public c3j() {
      this.t2();
      this.h0 = new e3();
      this.c8 = new b9y();
   }

   private void t2() {
      com.aspose.slides.ms.System.o0.n5.k5(this.l6);
      this.k5 = true;
      this.u3 = n5;
      this.u9 = true;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("id", com.aspose.slides.ms.System.d1.n5(new String[]{"{", com.aspose.slides.ms.System.d1.t2(com.aspose.slides.ms.System.Xml.f4.n5(this.l6.k5())), "}"}));
      if (!this.k5) {
         var2.l6("returnToParent", this.k5 ? "1" : "0");
      }

      if (this.u3 != n5) {
         var2.l6("imageType", t1k.n5(this.u3));
      }

      if (this.a6 != null) {
         var2.l6("transitionDur", this.a6);
      }

      if (!this.u9) {
         var2.l6("showBg", this.u9 ? "1" : "0");
      }

      this.h0.n5("p166", var2, "blipFill");
      this.c8.n5("p166", var2, "spPr");
      var2.s7();
   }

   public final com.aspose.slides.ms.System.o0 n5() {
      return this.l6;
   }

   public final void n5(com.aspose.slides.ms.System.o0 var1) {
      var1.k5(this.l6);
   }

   public final boolean l6() {
      return this.k5;
   }

   public final void n5(boolean var1) {
      this.k5 = var1;
   }

   public final int k5() {
      return this.u3;
   }

   public final void n5(int var1) {
      this.u3 = var1;
   }

   public final String u3() {
      return this.a6;
   }

   public final void n5(String var1) {
      this.a6 = var1;
   }

   public final boolean a6() {
      return this.u9;
   }

   public final void l6(boolean var1) {
      this.u9 = var1;
   }

   public final e3 u9() {
      return this.h0;
   }

   public final b9y h0() {
      return this.c8;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 c8() {
      return t2;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.o0 n5(c3j var0, com.aspose.slides.ms.System.o0 var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(c3j var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(c3j var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String n5(c3j var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean l6(c3j var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static e3 n5(c3j var0, e3 var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static b9y n5(c3j var0, b9y var1) {
      return var0.c8 = var1;
   }
}
