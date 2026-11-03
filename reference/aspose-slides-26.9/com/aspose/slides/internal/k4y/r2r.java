package com.aspose.slides.internal.k4y;

public class r2r extends b3 {
   private int n5;
   private int l6;
   private String k5;
   private String u3;
   private String a6;
   private d1t u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "projectionType", "viewedRegionType", "cultureLanguage", "cultureRegion", "attribution", "geoCache"
   );

   public r2r(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      r2r$1 var2 = new r2r$1(this);
      n5(var1, var2);
      n5(var1, new r2r$2(this, var1));
   }

   public r2r() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0;
      this.l6 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0) {
         var2.l6("projectionType", v6k.n5(this.n5));
      }

      if (this.l6 != 0) {
         var2.l6("viewedRegionType", m1c.n5(this.l6));
      }

      var2.l6("cultureLanguage", this.k5);
      var2.l6("cultureRegion", this.u3);
      var2.l6("attribution", this.a6);
      if (this.u9 != null) {
         this.u9.n5("cx", var2, "geoCache");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return h0;
   }

   // $VF: synthetic method
   static int n5(r2r var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int l6(r2r var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String n5(r2r var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String l6(r2r var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String k5(r2r var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static d1t n5(r2r var0, d1t var1) {
      return var0.u9 = var1;
   }
}
