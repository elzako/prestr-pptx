package com.aspose.slides.internal.k4y;

public class z7r extends b3 {
   private u1u n5;
   private f7o l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("geoChildEntitiesQuery", "geoChildEntities");

   public z7r(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new z7r$1(this, var1));
   }

   public z7r() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("cx", var2, "geoChildEntitiesQuery");
      }

      if (this.l6 != null) {
         this.l6.n5("cx", var2, "geoChildEntities");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static u1u n5(z7r var0, u1u var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static f7o n5(z7r var0, f7o var1) {
      return var0.l6 = var1;
   }
}
