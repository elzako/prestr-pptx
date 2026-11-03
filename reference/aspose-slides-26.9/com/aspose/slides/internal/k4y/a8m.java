package com.aspose.slides.internal.k4y;

public class a8m extends b3 {
   private w7e n5;
   private r2t l6;
   private x9p k5;
   private e9b u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "geoLocationQueryResults", "geoDataEntityQueryResults", "geoDataPointToEntityQueryResults", "geoChildEntitiesQueryResults"
   );

   public a8m(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new a8m$1(this, var1));
   }

   public a8m() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("cx", var2, "geoLocationQueryResults");
      }

      if (this.l6 != null) {
         this.l6.n5("cx", var2, "geoDataEntityQueryResults");
      }

      if (this.k5 != null) {
         this.k5.n5("cx", var2, "geoDataPointToEntityQueryResults");
      }

      if (this.u3 != null) {
         this.u3.n5("cx", var2, "geoChildEntitiesQueryResults");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return a6;
   }

   // $VF: synthetic method
   static w7e n5(a8m var0, w7e var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static r2t n5(a8m var0, r2t var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static x9p n5(a8m var0, x9p var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static e9b n5(a8m var0, e9b var1) {
      return var0.u3 = var1;
   }
}
