package com.aspose.slides.internal.k4y;

public class p3b extends b3 {
   private String n5;
   private h6l l6;
   private q9u k5;
   private b2v u3;
   private d9m a6;
   private l8r u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9("name", "scene3d", "sp3d", "txPr", "style", "extLst");

   public p3b(com.aspose.slides.ms.System.Xml.c7 var1) {
      p3b$1 var2 = new p3b$1(this);
      n5(var1, var2);
      n5(var1, new p3b$2(this, var1));
   }

   public p3b() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("name", this.n5);
      if (this.l6 != null) {
         this.l6.n5("dgm", var2, "scene3d");
      }

      if (this.k5 != null) {
         this.k5.n5("dgm", var2, "sp3d");
      }

      if (this.u3 != null) {
         this.u3.n5("dgm", var2, "txPr");
      }

      if (this.a6 != null) {
         this.a6.n5("dgm", var2, "style");
      }

      if (this.u9 != null) {
         this.u9.n5("dgm", var2, "extLst");
      }

      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   public final d9m l6() {
      return this.a6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return h0;
   }

   // $VF: synthetic method
   static String n5(p3b var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static h6l n5(p3b var0, h6l var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static q9u n5(p3b var0, q9u var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static b2v n5(p3b var0, b2v var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static d9m n5(p3b var0, d9m var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static l8r n5(p3b var0, l8r var1) {
      return var0.u9 = var1;
   }
}
