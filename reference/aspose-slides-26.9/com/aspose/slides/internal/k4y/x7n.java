package com.aspose.slides.internal.k4y;

public class x7n extends b3 {
   private String n5;
   private String l6;
   private boolean k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("r:embed", "name", "builtIn");

   public x7n(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      x7n$1 var2 = new x7n$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public x7n() {
      this.a6();
   }

   private void a6() {
      this.l6 = "";
      this.k5 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
         var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
      }

      var2.l6("r:embed", this.n5);
      if (!"".equals(this.l6)) {
         var2.l6("name", this.l6);
      }

      if (this.k5) {
         var2.l6("builtIn", this.k5 ? "1" : "0");
      }

      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final String l6() {
      return this.l6;
   }

   public final void l6(String var1) {
      this.l6 = var1;
   }

   public final boolean k5() {
      return this.k5;
   }

   public final void n5(boolean var1) {
      this.k5 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return u3;
   }

   // $VF: synthetic method
   static String n5(x7n var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(x7n var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(x7n var0, boolean var1) {
      return var0.k5 = var1;
   }
}
