package com.aspose.slides.internal.k4y;

public class c2m extends b3 {
   private int k5;
   private int u3;
   private String a6;
   private int u9;
   private double h0;
   private double c8;
   private double t2;
   private l8r s7;
   public static final int n5 = k3s.n5("self");
   public static final int l6 = t2e.n5("all");
   private static final com.aspose.slides.internal.v6g.u9 x8 = new com.aspose.slides.internal.v6g.u9(
      "type", "for", "forName", "ptType", "val", "fact", "max", "extLst"
   );

   public c2m(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.c8();
      c2m$1 var2 = new c2m$1(this);
      n5(var1, var2);
      n5(var1, new c2m$2(this, var1));
   }

   public c2m() {
      this.c8();
   }

   private void c8() {
      this.k5 = -1;
      this.u3 = n5;
      this.a6 = "";
      this.u9 = l6;
      this.h0 = Double.NaN;
      this.c8 = Double.NaN;
      this.t2 = Double.NaN;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("type", y5.n5(this.k5));
      if (this.u3 != n5) {
         var2.l6("for", k3s.n5(this.u3));
      }

      if (!"".equals(this.a6)) {
         var2.l6("forName", this.a6);
      }

      if (this.u9 != l6) {
         var2.l6("ptType", t2e.n5(this.u9));
      }

      if (!com.aspose.slides.ms.System.d2.k5(this.h0)) {
         var2.l6("val", com.aspose.slides.ms.System.Xml.f4.n5(this.h0));
      }

      if (!com.aspose.slides.ms.System.d2.k5(this.c8)) {
         var2.l6("fact", com.aspose.slides.ms.System.Xml.f4.n5(this.c8));
      }

      if (!com.aspose.slides.ms.System.d2.k5(this.t2)) {
         var2.l6("max", com.aspose.slides.ms.System.Xml.f4.n5(this.t2));
      }

      if (this.s7 != null) {
         this.s7.n5("dgm", var2, "extLst");
      }

      var2.s7();
   }

   public final int n5() {
      return this.k5;
   }

   public final int l6() {
      return this.u3;
   }

   public final String k5() {
      return this.a6;
   }

   public final int u3() {
      return this.u9;
   }

   public final double a6() {
      return this.h0;
   }

   public final double u9() {
      return this.c8;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 h0() {
      return x8;
   }

   // $VF: synthetic method
   static int n5(c2m var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int l6(c2m var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String n5(c2m var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int k5(c2m var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static double n5(c2m var0, double var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static double l6(c2m var0, double var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static double k5(c2m var0, double var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static l8r n5(c2m var0, l8r var1) {
      return var0.s7 = var1;
   }
}
