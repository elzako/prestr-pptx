package com.aspose.slides.internal.k4y;

public class o4u extends b3 {
   private int n5;
   private String l6;
   private int k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("table:sort-mode", "table:data-field", "table:order");

   public o4u(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      o4u$1 var2 = new o4u$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public o4u() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0;
      this.k5 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("table:sort-mode", e5y.n5(this.n5));
      if (this.l6 != null) {
         var2.l6("table:data-field", this.l6);
      }

      var2.l6("table:order", o4a.n5(this.k5));
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static int n5(o4u var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(o4u var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int l6(o4u var0, int var1) {
      return var0.k5 = var1;
   }
}
