package com.aspose.slides.internal.k4y;

public class x4q extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private String u9;
   private String h0;
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9(
      "address1", "countryRegion", "adminDistrict1", "adminDistrict2", "postalCode", "locality", "isoCountryCode"
   );

   public x4q(com.aspose.slides.ms.System.Xml.c7 var1) {
      x4q$1 var2 = new x4q$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public x4q() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("address1", this.n5);
      }

      if (this.l6 != null) {
         var2.l6("countryRegion", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("adminDistrict1", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("adminDistrict2", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("postalCode", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("locality", this.u9);
      }

      if (this.h0 != null) {
         var2.l6("isoCountryCode", this.h0);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return c8;
   }

   // $VF: synthetic method
   static String n5(x4q var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(x4q var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(x4q var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(x4q var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String a6(x4q var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String u9(x4q var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String h0(x4q var0, String var1) {
      return var0.h0 = var1;
   }
}
