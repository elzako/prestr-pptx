package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class h8v extends b3 {
   private String n5;
   private String l6;
   private y4o k5;
   private e9h u3;
   private b2t a6;
   private y1g u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9("r:embed", "r:link", "trim", "fade", "bmkLst", "extLst");

   public h8v(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.c8();
      h8v$1 var2 = new h8v$1(this);
      n5(var1, var2);
      n5(var1, new h8v$2(this, var1));
   }

   public h8v() {
      this.c8();
   }

   private void c8() {
      this.n5 = "";
      this.l6 = "";
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("p14", var3, "http://schemas.microsoft.com/office/powerpoint/2010/main");
      if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
         var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
      }

      if (var2.n5("http://schemas.openxmlformats.org/presentationml/2006/main") == null) {
         var2.u3("xmlns", "p", null, "http://schemas.openxmlformats.org/presentationml/2006/main");
      }

      if (!"".equals(this.n5)) {
         if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
         }

         var2.l6("r:embed", this.n5);
      }

      if (!"".equals(this.l6)) {
         if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
         }

         var2.l6("r:link", this.l6);
      }

      if (this.k5 != null) {
         this.k5.n5("p14", var2, "trim");
      }

      if (this.u3 != null) {
         this.u3.n5("p14", var2, "fade");
      }

      if (this.a6 != null) {
         this.a6.n5("p14", var2, "bmkLst");
      }

      if (this.u9 != null) {
         this.u9.n5("p14", var2, "extLst");
      }

      var2.s7();
   }

   public final y4o n5() {
      if (this.k5 != null) {
         throw new Exception("Only one <trim> element can be added.");
      }

      this.k5 = new y4o();
      return this.k5;
   }

   public final void n5(y4o var1) {
      this.k5 = var1;
   }

   public final e9h l6() {
      if (this.u3 != null) {
         throw new Exception("Only one <fade> element can be added.");
      }

      this.u3 = new e9h();
      return this.u3;
   }

   public final void n5(e9h var1) {
      this.u3 = var1;
   }

   public final x8 k5() {
      if (this.u9 != null) {
         throw new Exception("Only one <extLst> element can be added.");
      }

      this.u9 = new y1g();
      return this.u9;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final void l6(String var1) {
      this.l6 = var1;
   }

   public final y4o u3() {
      return this.k5;
   }

   public final e9h a6() {
      return this.u3;
   }

   public final x8 u9() {
      return this.u9;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 h0() {
      return h0;
   }

   // $VF: synthetic method
   static String n5(h8v var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(h8v var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static y4o n5(h8v var0, y4o var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static e9h n5(h8v var0, e9h var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static b2t n5(h8v var0, b2t var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static y1g n5(h8v var0, y1g var1) {
      return var0.u9 = var1;
   }
}
