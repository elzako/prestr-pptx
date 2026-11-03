package com.aspose.slides.internal.k4y;

public class j5s extends b3 {
   private w2z n5;
   private b7i l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("geoLocationQuery", "geoLocations");

   public j5s(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new j5s$1(this, var1));
   }

   public j5s() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("cx", var2, "geoLocationQuery");
      }

      if (this.l6 != null) {
         this.l6.n5("cx", var2, "geoLocations");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static w2z n5(j5s var0, w2z var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static b7i n5(j5s var0, b7i var1) {
      return var0.l6 = var1;
   }
}
