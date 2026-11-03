package com.aspose.slides.internal.k4y;

public class o3x extends b3 {
   private String k5;
   private int u3;
   private int a6;
   private String u9;
   private String h0;
   private String c8;
   private String t2;
   private String s7;
   private String x8;
   public static final int n5 = p7e.n5("penDown");
   public static final int l6 = x6p.n5("begin");
   private static final com.aspose.slides.internal.v6g.u9 n3 = new com.aspose.slides.internal.v6g.u9(
      "xml:id", "traceType", "continuation", "priorRef", "contextRef", "brushRef", "duration", "timeOffset"
   );

   public o3x(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.x8();
      o3x$1 var2 = new o3x$1(this);
      n5(var1, var2);
      if (!var1.m1()) {
         var1.u9();
         this.x8 = var1.z1();
      }
   }

   public o3x() {
      this.x8();
   }

   private void x8() {
      this.u3 = n5;
      this.a6 = l6;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.k5 != null) {
         var2.l6("xml:id", this.k5);
      }

      if (this.u3 != n5) {
         var2.l6("traceType", p7e.n5(this.u3));
      }

      if (this.a6 != l6) {
         var2.l6("continuation", x6p.n5(this.a6));
      }

      if (this.u9 != null) {
         var2.l6("priorRef", this.u9);
      }

      if (this.h0 != null) {
         var2.l6("contextRef", this.h0);
      }

      if (this.c8 != null) {
         var2.l6("brushRef", this.c8);
      }

      if (this.t2 != null) {
         var2.l6("duration", this.t2);
      }

      if (this.s7 != null) {
         var2.l6("timeOffset", this.s7);
      }

      var2.l6(this.x8);
      var2.s7();
   }

   public final String n5() {
      return this.k5;
   }

   public final void n5(String var1) {
      this.k5 = var1;
   }

   public final int l6() {
      return this.u3;
   }

   public final void n5(int var1) {
      this.u3 = var1;
   }

   public final int k5() {
      return this.a6;
   }

   public final void l6(int var1) {
      this.a6 = var1;
   }

   public final String u3() {
      return this.u9;
   }

   public final void l6(String var1) {
      this.u9 = var1;
   }

   public final String a6() {
      return this.h0;
   }

   public final void k5(String var1) {
      this.h0 = var1;
   }

   public final String u9() {
      return this.c8;
   }

   public final void u3(String var1) {
      this.c8 = var1;
   }

   public final String h0() {
      return this.t2;
   }

   public final void a6(String var1) {
      this.t2 = var1;
   }

   public final String c8() {
      return this.s7;
   }

   public final void u9(String var1) {
      this.s7 = var1;
   }

   public final String t2() {
      return this.x8;
   }

   public final void h0(String var1) {
      this.x8 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 s7() {
      return n3;
   }

   // $VF: synthetic method
   static String n5(o3x var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(o3x var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int l6(o3x var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String l6(o3x var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String k5(o3x var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String u3(o3x var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String a6(o3x var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String u9(o3x var0, String var1) {
      return var0.s7 = var1;
   }
}
