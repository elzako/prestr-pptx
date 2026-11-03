package com.aspose.slides.internal.k4y;

public class e3x extends b3 {
   private String n5;
   private e7n l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("table:id", "change-track-table-cell");

   public e3x(com.aspose.slides.ms.System.Xml.c7 var1) {
      e3x$1 var2 = new e3x$1(this);
      n5(var1, var2);
      n5(var1, new e3x$2(this, var1));
   }

   public e3x() {
      this.l6 = new e7n();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("table:id", this.n5);
      }

      this.l6.n5("table", var2, "change-track-table-cell");
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(e3x var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static e7n n5(e3x var0, e7n var1) {
      return var0.l6 = var1;
   }
}
