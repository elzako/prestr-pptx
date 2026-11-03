package com.aspose.slides.internal.k4y;

public class w6a extends b3 {
   private String n5;
   private boolean l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("r:id", "collapse");

   public w6a(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      w6a$1 var2 = new w6a$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public w6a() {
      this.u3();
   }

   private void u3() {
      this.l6 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
         var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
      }

      var2.l6("r:id", this.n5);
      if (this.l6) {
         var2.l6("collapse", this.l6 ? "1" : "0");
      }

      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final boolean l6() {
      return this.l6;
   }

   public final void n5(boolean var1) {
      this.l6 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(w6a var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(w6a var0, boolean var1) {
      return var0.l6 = var1;
   }
}
