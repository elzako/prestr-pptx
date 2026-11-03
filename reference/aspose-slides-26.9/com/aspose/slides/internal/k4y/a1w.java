package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class a1w extends b3 {
   private String n5;
   private v3c l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("office:version", "settings");

   public a1w(com.aspose.slides.ms.System.Xml.c7 var1) {
      a1w$1 var2 = new a1w$1(this);
      n5(var1, var2);
      n5(var1, new a1w$2(this, var1));
   }

   public a1w() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("office", var3, "urn:oasis:names:tc:opendocument:xmlns:office:1.0");
      var2.u3("xmlns", "ooo", null, "http://openoffice.org/2004/office");
      var2.u3("xmlns", "officeooo", null, "http://openoffice.org/2009/office");
      if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:config:1.0") == null) {
         var2.u3("xmlns", "config", null, "urn:oasis:names:tc:opendocument:xmlns:config:1.0");
      }

      if (this.n5 != null) {
         var2.l6("office:version", this.n5);
      }

      if (this.l6 != null) {
         this.l6.n5("office", var2, "settings");
      }

      var2.s7();
   }

   public final v3c n5() {
      if (this.l6 != null) {
         throw new Exception("Only one <settings> element can be added.");
      }

      this.l6 = new v3c();
      return this.l6;
   }

   public final void n5(v3c var1) {
      this.l6 = var1;
   }

   public final v3c l6() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(a1w var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static v3c n5(a1w var0, v3c var1) {
      return var0.l6 = var1;
   }
}
