package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class z9c extends b3 {
   private String n5;
   private String l6;
   private boolean k5;
   private String u3;
   private double a6;
   private double u9;
   private y1g h0;
   private a6 c8;
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "spid", "name", "showAsIcon", "r:id", "imgW", "imgH", "extLst", "pic"
   );

   public z9c(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.s7();
      z9c$1 var2 = new z9c$1(this);
      n5(var1, var2);
      n5(var1, new z9c$2(this, var1));
   }

   public z9c() {
      this.s7();
   }

   private void s7() {
      this.l6 = "";
      this.k5 = false;
      this.a6 = Double.NaN;
      this.u9 = Double.NaN;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("spid", this.n5);
      }

      if (!"".equals(this.l6)) {
         var2.l6("name", this.l6);
      }

      if (this.k5) {
         var2.l6("showAsIcon", this.k5 ? "1" : "0");
      }

      if (this.u3 != null) {
         if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
         }

         var2.l6("r:id", this.u3);
      }

      if (!com.aspose.slides.ms.System.d2.k5(this.a6)) {
         var2.l6("imgW", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.a6 * 12700.0), 14)));
      }

      if (!com.aspose.slides.ms.System.d2.k5(this.u9)) {
         var2.l6("imgH", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.u9 * 12700.0), 14)));
      }

      if (this.h0 != null) {
         this.h0.n5("p", var2, "extLst");
      }

      if (this.c8 != null) {
         this.c8.n5("p", var2, "pic");
      }

      var2.s7();
   }

   public final a6 n5() {
      if (this.c8 != null) {
         throw new Exception("Only one <pic> element can be added.");
      }

      this.c8 = new a6();
      return this.c8;
   }

   public final String l6() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final String k5() {
      return this.l6;
   }

   public final void l6(String var1) {
      this.l6 = var1;
   }

   public final boolean u3() {
      return this.k5;
   }

   public final String a6() {
      return this.u3;
   }

   public final void k5(String var1) {
      this.u3 = var1;
   }

   public final double u9() {
      return this.a6;
   }

   public final void n5(double var1) {
      this.a6 = var1;
   }

   public final double h0() {
      return this.u9;
   }

   public final void l6(double var1) {
      this.u9 = var1;
   }

   public final a6 c8() {
      return this.c8;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 t2() {
      return t2;
   }

   // $VF: synthetic method
   static String n5(z9c var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(z9c var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(z9c var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(z9c var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static double n5(z9c var0, double var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static double l6(z9c var0, double var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static y1g n5(z9c var0, y1g var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static a6 n5(z9c var0, a6 var1) {
      return var0.c8 = var1;
   }
}
