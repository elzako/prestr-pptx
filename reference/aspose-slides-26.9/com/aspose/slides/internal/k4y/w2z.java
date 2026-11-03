package com.aspose.slides.internal.k4y;

public class w2z extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private int a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "countryRegion", "adminDistrict1", "adminDistrict2", "postalCode", "entityType"
   );

   public w2z(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      w2z$1 var2 = new w2z$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public w2z() {
      this.l6();
   }

   private void l6() {
      this.a6 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("countryRegion", this.n5);
      }

      if (this.l6 != null) {
         var2.l6("adminDistrict1", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("adminDistrict2", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("postalCode", this.u3);
      }

      var2.l6("entityType", u7o.n5(this.a6));
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u9;
   }

   // $VF: synthetic method
   static String n5(w2z var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(w2z var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(w2z var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(w2z var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int n5(w2z var0, int var1) {
      return var0.a6 = var1;
   }
}
