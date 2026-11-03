package com.aspose.slides.internal.k4y;

public class a6y extends b3 {
   private String n5;
   private String l6;
   private int k5;
   private String u3;
   private String a6;
   private String u9;
   private String h0;
   private String c8;
   private String t2;
   private String s7;
   private String x8;
   private static final com.aspose.slides.internal.v6g.u9 n3 = new com.aspose.slides.internal.v6g.u9(
      "draw:name",
      "draw:display-name",
      "draw:style",
      "draw:cx",
      "draw:cy",
      "draw:angle",
      "draw:border",
      "draw:start-color",
      "draw:end-color",
      "draw:start-intensity",
      "draw:end-intensity"
   );

   public a6y(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.n3();
      a6y$1 var2 = new a6y$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public a6y() {
      this.n3();
   }

   private void n3() {
      this.k5 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("draw:name", this.n5);
      if (this.l6 != null) {
         var2.l6("draw:display-name", this.l6);
      }

      var2.l6("draw:style", t8e.n5(this.k5));
      if (this.u3 != null) {
         var2.l6("draw:cx", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("draw:cy", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("draw:angle", this.u9);
      }

      if (this.h0 != null) {
         var2.l6("draw:border", this.h0);
      }

      if (this.c8 != null) {
         var2.l6("draw:start-color", this.c8);
      }

      if (this.t2 != null) {
         var2.l6("draw:end-color", this.t2);
      }

      if (this.s7 != null) {
         var2.l6("draw:start-intensity", this.s7);
      }

      if (this.x8 != null) {
         var2.l6("draw:end-intensity", this.x8);
      }

      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final void l6(String var1) {
      this.l6 = var1;
   }

   public final int l6() {
      return this.k5;
   }

   public final void n5(int var1) {
      this.k5 = var1;
   }

   public final String k5() {
      return this.u3;
   }

   public final void k5(String var1) {
      this.u3 = var1;
   }

   public final String u3() {
      return this.a6;
   }

   public final void u3(String var1) {
      this.a6 = var1;
   }

   public final String a6() {
      return this.u9;
   }

   public final void a6(String var1) {
      this.u9 = var1;
   }

   public final String u9() {
      return this.h0;
   }

   public final void u9(String var1) {
      this.h0 = var1;
   }

   public final String h0() {
      return this.c8;
   }

   public final void h0(String var1) {
      this.c8 = var1;
   }

   public final String c8() {
      return this.t2;
   }

   public final void c8(String var1) {
      this.t2 = var1;
   }

   public final String t2() {
      return this.s7;
   }

   public final void t2(String var1) {
      this.s7 = var1;
   }

   public final String s7() {
      return this.x8;
   }

   public final void s7(String var1) {
      this.x8 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 x8() {
      return n3;
   }

   // $VF: synthetic method
   static String n5(a6y var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(a6y var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int n5(a6y var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(a6y var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String u3(a6y var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String a6(a6y var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String u9(a6y var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String h0(a6y var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String c8(a6y var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String t2(a6y var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String s7(a6y var0, String var1) {
      return var0.x8 = var1;
   }
}
