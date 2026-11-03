package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class r0j extends b3 {
   private String n5;
   private String l6;
   private boolean k5;
   private String u3;
   private double a6;
   private double u9;
   private String h0;
   private g7 c8;
   private a6 t2;
   private static final com.aspose.slides.internal.v6g.u9 s7 = new com.aspose.slides.internal.v6g.u9(
      "spid", "name", "showAsIcon", "r:id", "imgW", "imgH", "progId", "embed", "link", "pic"
   );

   public r0j(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.n3();
      r0j$1 var2 = new r0j$1(this);
      n5(var1, var2);
      n5(var1, new r0j$2(this, var1));
   }

   public r0j() {
      this.n3();
   }

   private void n3() {
      this.l6 = "";
      this.k5 = false;
      this.a6 = Double.NaN;
      this.u9 = Double.NaN;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("p", var3, "http://schemas.openxmlformats.org/presentationml/2006/main");
      if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
         var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
      }

      if (var2.n5("http://schemas.openxmlformats.org/drawingml/2006/main") == null) {
         var2.u3("xmlns", "a", null, "http://schemas.openxmlformats.org/drawingml/2006/main");
      }

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
         var2.l6("progId", this.h0);
      }

      if (this.c8 != null) {
         switch (s7.n5(this.c8.n5())) {
            case 7:
               ((d5m)this.c8.k5()).n5("p", var2, this.c8.n5());
               break;
            case 8:
               ((e7k)this.c8.k5()).n5("p", var2, this.c8.n5());
         }
      }

      if (this.t2 != null) {
         this.t2.n5("p", var2, "pic");
      }

      var2.s7();
   }

   public final a6 n5() {
      if (this.t2 != null) {
         throw new Exception("Only one <pic> element can be added.");
      }

      this.t2 = new a6();
      return this.t2;
   }

   public final g7 n5(String var1) {
      if (this.c8 != null) {
         throw new Exception("OleObject already is initialized.");
      }

      switch (s7.n5(var1)) {
         case 7:
            this.c8 = new g7("embed", new d5m());
            break;
         case 8:
            this.c8 = new g7("link", new e7k());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.c8;
   }

   public final String l6() {
      return this.n5;
   }

   public final void l6(String var1) {
      this.n5 = var1;
   }

   public final String k5() {
      return this.l6;
   }

   public final void k5(String var1) {
      this.l6 = var1;
   }

   public final boolean u3() {
      return this.k5;
   }

   public final void n5(boolean var1) {
      this.k5 = var1;
   }

   public final String a6() {
      return this.u3;
   }

   public final void u3(String var1) {
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

   public final String c8() {
      return this.h0;
   }

   public final void a6(String var1) {
      this.h0 = var1;
   }

   public final g7 t2() {
      return this.c8;
   }

   public final a6 s7() {
      return this.t2;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 x8() {
      return s7;
   }

   // $VF: synthetic method
   static String n5(r0j var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(r0j var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(r0j var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(r0j var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static double n5(r0j var0, double var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static double l6(r0j var0, double var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String u3(r0j var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static g7 n5(r0j var0, g7 var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static a6 n5(r0j var0, a6 var1) {
      return var0.t2 = var1;
   }
}
