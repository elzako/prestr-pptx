package com.aspose.slides.internal.k4y;

public class s6m extends b3 {
   private int n5;
   private String l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("type", "val");

   public s6m(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      s6m$1 var2 = new s6m$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public s6m() {
      this.u3();
   }

   private void u3() {
      this.n5 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("type", w3.n5(this.n5));
      var2.l6("val", this.l6);
      var2.s7();
   }

   public final int n5() {
      return this.n5;
   }

   public final String l6() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return k5;
   }

   // $VF: synthetic method
   static int n5(s6m var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(s6m var0, String var1) {
      return var0.l6 = var1;
   }
}
