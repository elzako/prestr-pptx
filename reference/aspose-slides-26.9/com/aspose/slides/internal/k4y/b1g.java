package com.aspose.slides.internal.k4y;

public class b1g extends b3 {
   private y1i n5;
   private o3h l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("geoDataPointQuery", "geoDataPointToEntityQuery");

   public b1g(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new b1g$1(this, var1));
   }

   public b1g() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("cx", var2, "geoDataPointQuery");
      }

      if (this.l6 != null) {
         this.l6.n5("cx", var2, "geoDataPointToEntityQuery");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static y1i n5(b1g var0, y1i var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static o3h n5(b1g var0, o3h var1) {
      return var0.l6 = var1;
   }
}
