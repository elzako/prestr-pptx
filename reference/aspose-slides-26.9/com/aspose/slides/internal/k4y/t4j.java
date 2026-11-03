package com.aspose.slides.internal.k4y;

public class t4j extends b3 {
   private String n5;
   private y1g l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("r:id", "extLst");

   public t4j(com.aspose.slides.ms.System.Xml.c7 var1) {
      t4j$1 var2 = new t4j$1(this);
      n5(var1, var2);
      n5(var1, new t4j$2(this, var1));
   }

   public t4j() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
         var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
      }

      var2.l6("r:id", this.n5);
      if (this.l6 != null) {
         this.l6.n5("p", var2, "extLst");
      }

      var2.s7();
   }

   public final void n5(x8 var1) {
      this.l6 = (y1g)var1;
   }

   public final String n5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final x8 l6() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(t4j var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static y1g n5(t4j var0, y1g var1) {
      return var0.l6 = var1;
   }
}
