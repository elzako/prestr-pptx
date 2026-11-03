package com.aspose.slides.internal.k4y;

public class b9q extends b3 {
   private String n5;
   private String l6;
   private double k5;
   private double u3;
   private double a6;
   private double u9;
   private f4q h0;
   private a9w c8;
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "entityName", "entityId", "east", "west", "north", "south", "geoPolygons", "copyrights"
   );

   public b9q(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      b9q$1 var2 = new b9q$1(this);
      n5(var1, var2);
      n5(var1, new b9q$2(this, var1));
   }

   public b9q() {
      this.l6();
   }

   private void l6() {
      this.k5 = Double.NaN;
      this.u3 = Double.NaN;
      this.a6 = Double.NaN;
      this.u9 = Double.NaN;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("entityName", this.n5);
      var2.l6("entityId", this.l6);
      var2.l6("east", com.aspose.slides.ms.System.Xml.f4.n5(this.k5));
      var2.l6("west", com.aspose.slides.ms.System.Xml.f4.n5(this.u3));
      var2.l6("north", com.aspose.slides.ms.System.Xml.f4.n5(this.a6));
      var2.l6("south", com.aspose.slides.ms.System.Xml.f4.n5(this.u9));
      if (this.h0 != null) {
         this.h0.n5("cx", var2, "geoPolygons");
      }

      if (this.c8 != null) {
         this.c8.n5("cx", var2, "copyrights");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return t2;
   }

   // $VF: synthetic method
   static String n5(b9q var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(b9q var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static double n5(b9q var0, double var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static double l6(b9q var0, double var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static double k5(b9q var0, double var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static double u3(b9q var0, double var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static f4q n5(b9q var0, f4q var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static a9w n5(b9q var0, a9w var1) {
      return var0.c8 = var1;
   }
}
