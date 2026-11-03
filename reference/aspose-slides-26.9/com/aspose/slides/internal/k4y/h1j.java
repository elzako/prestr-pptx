package com.aspose.slides.internal.k4y;

public class h1j extends b3 {
   private int n5;
   private String l6;
   private String k5;
   private String u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("password", "sqref", "name", "securityDescriptor");

   public h1j(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      h1j$1 var2 = new h1j$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public h1j() {
      this.l6();
   }

   private void l6() {
      this.n5 = 65535;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if ((this.n5 & 65535) != 65535) {
         var2.l6("password", com.aspose.slides.ms.System.a3.n5(this.n5 & 65535 & 65535, "X4"));
      }

      var2.l6("sqref", this.l6);
      var2.l6("name", this.k5);
      if (this.u3 != null) {
         var2.l6("securityDescriptor", this.u3);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return a6;
   }

   // $VF: synthetic method
   static int n5(h1j var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(h1j var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(h1j var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(h1j var0, String var1) {
      return var0.u3 = var1;
   }
}
