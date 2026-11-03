package com.aspose.slides.internal.k4y;

public class j0p extends b3 {
   private String k5;
   private String u3;
   private int a6;
   private String u9;
   private float h0;
   private float c8;
   private int t2;
   private String s7;
   private String x8;
   private p1n n3;
   public static final int n5 = d4i.n5("decimal");
   public static final int l6 = z8t.n5("p_ve");
   private static final com.aspose.slides.internal.v6g.u9 y4 = new com.aspose.slides.internal.v6g.u9(
      "xml:id", "name", "type", "default", "min", "max", "orientation", "respectTo", "units", "mapping"
   );

   public j0p(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.n3();
      j0p$1 var2 = new j0p$1(this);
      n5(var1, var2);
      n5(var1, new j0p$2(this, var1));
   }

   public j0p() {
      this.n3();
   }

   private void n3() {
      this.a6 = n5;
      this.u9 = "0";
      this.h0 = Float.NaN;
      this.c8 = Float.NaN;
      this.t2 = l6;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.k5 != null) {
         var2.l6("xml:id", this.k5);
      }

      var2.l6("name", this.u3);
      if (this.a6 != n5) {
         var2.l6("type", d4i.n5(this.a6));
      }

      if (!"0".equals(this.u9)) {
         var2.l6("default", this.u9);
      }

      if (!com.aspose.slides.ms.System.n1.k5(this.h0)) {
         var2.l6("min", com.aspose.slides.ms.System.Xml.f4.n5(this.h0));
      }

      if (!com.aspose.slides.ms.System.n1.k5(this.c8)) {
         var2.l6("max", com.aspose.slides.ms.System.Xml.f4.n5(this.c8));
      }

      if (this.t2 != l6) {
         var2.l6("orientation", z8t.n5(this.t2));
      }

      if (this.s7 != null) {
         var2.l6("respectTo", this.s7);
      }

      if (this.x8 != null) {
         var2.l6("units", this.x8);
      }

      if (this.n3 != null) {
         this.n3.n5("inkml", var2, "mapping");
      }

      var2.s7();
   }

   public final void n5(p1n var1) {
      this.n3 = var1;
   }

   public final String n5() {
      return this.k5;
   }

   public final void n5(String var1) {
      this.k5 = var1;
   }

   public final String l6() {
      return this.u3;
   }

   public final void l6(String var1) {
      this.u3 = var1;
   }

   public final int k5() {
      return this.a6;
   }

   public final void n5(int var1) {
      this.a6 = var1;
   }

   public final String u3() {
      return this.u9;
   }

   public final void k5(String var1) {
      this.u9 = var1;
   }

   public final float a6() {
      return this.h0;
   }

   public final void n5(float var1) {
      this.h0 = var1;
   }

   public final float u9() {
      return this.c8;
   }

   public final void l6(float var1) {
      this.c8 = var1;
   }

   public final int h0() {
      return this.t2;
   }

   public final void l6(int var1) {
      this.t2 = var1;
   }

   public final String c8() {
      return this.s7;
   }

   public final void u3(String var1) {
      this.s7 = var1;
   }

   public final String t2() {
      return this.x8;
   }

   public final void a6(String var1) {
      this.x8 = var1;
   }

   public final p1n s7() {
      return this.n3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 x8() {
      return y4;
   }

   // $VF: synthetic method
   static String n5(j0p var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String l6(j0p var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int n5(j0p var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String k5(j0p var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static float n5(j0p var0, float var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static float l6(j0p var0, float var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static int l6(j0p var0, int var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String u3(j0p var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String a6(j0p var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static p1n n5(j0p var0, p1n var1) {
      return var0.n3 = var1;
   }
}
