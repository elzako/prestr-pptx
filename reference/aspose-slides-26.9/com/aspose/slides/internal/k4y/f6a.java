package com.aspose.slides.internal.k4y;

public class f6a extends b3 {
   private String n5;
   private int l6;
   private String k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("polygonId", "numPoints", "pcaRings");

   public f6a(com.aspose.slides.ms.System.Xml.c7 var1) {
      f6a$1 var2 = new f6a$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public f6a() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("polygonId", this.n5);
      var2.l6("numPoints", com.aspose.slides.ms.System.Xml.f4.n5(this.l6));
      var2.l6("pcaRings", this.k5);
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static String n5(f6a var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int n5(f6a var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(f6a var0, String var1) {
      return var0.k5 = var1;
   }
}
