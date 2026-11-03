package com.aspose.slides.internal.k4y;

public class d0d extends b3 {
   private int h0;
   private int c8;
   private String t2;
   private int s7;
   private int x8;
   private int n3;
   private String y4;
   private int e2;
   private int t9;
   private double z1;
   private double t4;
   private l8r q0;
   public static final int n5 = k3s.n5("self");
   public static final int l6 = t2e.n5("all");
   public static final int k5 = y5.n5("none");
   public static final int u3 = k3s.n5("self");
   public static final int a6 = t2e.n5("all");
   public static final int u9 = m0d.n5("none");
   private static final com.aspose.slides.internal.v6g.u9 z3 = new com.aspose.slides.internal.v6g.u9(
      "type", "for", "forName", "ptType", "refType", "refFor", "refForName", "refPtType", "op", "val", "fact", "extLst"
   );

   public d0d(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.y4();
      d0d$1 var2 = new d0d$1(this);
      n5(var1, var2);
      n5(var1, new d0d$2(this, var1));
   }

   public d0d() {
      this.y4();
   }

   private void y4() {
      this.h0 = -1;
      this.c8 = n5;
      this.t2 = "";
      this.s7 = l6;
      this.x8 = k5;
      this.n3 = u3;
      this.y4 = "";
      this.e2 = a6;
      this.t9 = u9;
      this.z1 = 0.0;
      this.t4 = 1.0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("type", y5.n5(this.h0));
      if (this.c8 != n5) {
         var2.l6("for", k3s.n5(this.c8));
      }

      if (!"".equals(this.t2)) {
         var2.l6("forName", this.t2);
      }

      if (this.s7 != l6) {
         var2.l6("ptType", t2e.n5(this.s7));
      }

      if (this.x8 != k5) {
         var2.l6("refType", y5.n5(this.x8));
      }

      if (this.n3 != u3) {
         var2.l6("refFor", k3s.n5(this.n3));
      }

      if (!"".equals(this.y4)) {
         var2.l6("refForName", this.y4);
      }

      if (this.e2 != a6) {
         var2.l6("refPtType", t2e.n5(this.e2));
      }

      if (this.t9 != u9) {
         var2.l6("op", m0d.n5(this.t9));
      }

      if (this.z1 != 0.0) {
         var2.l6("val", com.aspose.slides.ms.System.Xml.f4.n5(this.z1));
      }

      if (this.t4 != 1.0) {
         var2.l6("fact", com.aspose.slides.ms.System.Xml.f4.n5(this.t4));
      }

      if (this.q0 != null) {
         this.q0.n5("dgm", var2, "extLst");
      }

      var2.s7();
   }

   public final int n5() {
      return this.h0;
   }

   public final int l6() {
      return this.c8;
   }

   public final String k5() {
      return this.t2;
   }

   public final int u3() {
      return this.s7;
   }

   public final int a6() {
      return this.x8;
   }

   public final int u9() {
      return this.n3;
   }

   public final String h0() {
      return this.y4;
   }

   public final int c8() {
      return this.e2;
   }

   public final int t2() {
      return this.t9;
   }

   public final double s7() {
      return this.z1;
   }

   public final double x8() {
      return this.t4;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n3() {
      return z3;
   }

   // $VF: synthetic method
   static int n5(d0d var0, int var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static int l6(d0d var0, int var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String n5(d0d var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static int k5(d0d var0, int var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static int u3(d0d var0, int var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static int a6(d0d var0, int var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String l6(d0d var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static int u9(d0d var0, int var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static int h0(d0d var0, int var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static double n5(d0d var0, double var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static double l6(d0d var0, double var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static l8r n5(d0d var0, l8r var1) {
      return var0.q0 = var1;
   }
}
