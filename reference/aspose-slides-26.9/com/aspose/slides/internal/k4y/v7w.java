package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class v7w extends b3 {
   private g2u n5;
   private i0a l6;
   private n9s k5;
   private k6n u3;
   private h3 a6;
   private y1g u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "htmlPubPr", "webPr", "prnPr", "showPr", "clrMru", "extLst"
   );

   public v7w(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new v7w$1(this, var1));
   }

   public v7w() {
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
         this.n5.n5("p", var2, "htmlPubPr");
      }

      if (this.l6 != null) {
         this.l6.n5("p", var2, "webPr");
      }

      if (this.k5 != null) {
         this.k5.n5("p", var2, "prnPr");
      }

      if (this.u3 != null) {
         this.u3.n5("p", var2, "showPr");
      }

      if (this.a6 != null) {
         this.a6.n5("p", var2, "clrMru");
      }

      if (this.u9 != null) {
         this.u9.n5("p", var2, "extLst");
      }

      var2.s7();
   }

   public final void n5(k6n var1) {
      this.u3 = var1;
   }

   public final x8 n5() {
      if (this.u9 != null) {
         throw new Exception("Only one <extLst> element can be added.");
      }

      this.u9 = new y1g();
      return this.u9;
   }

   public final k6n l6() {
      return this.u3;
   }

   public final x8 k5() {
      return this.u9;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return h0;
   }

   // $VF: synthetic method
   static g2u n5(v7w var0, g2u var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static i0a n5(v7w var0, i0a var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static n9s n5(v7w var0, n9s var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static k6n n5(v7w var0, k6n var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static h3 n5(v7w var0, h3 var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static y1g n5(v7w var0, y1g var1) {
      return var0.u9 = var1;
   }
}
