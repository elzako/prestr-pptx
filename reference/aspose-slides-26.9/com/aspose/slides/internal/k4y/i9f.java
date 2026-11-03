package com.aspose.slides.internal.k4y;

public class i9f extends b3 {
   private boolean n5;
   private String l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("uniform", "value");

   public i9f(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      i9f$1 var2 = new i9f$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public i9f() {
      this.u3();
   }

   private void u3() {
      this.n5 = true;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!this.n5) {
         var2.l6("uniform", this.n5 ? "1" : "0");
      }

      var2.l6("value", this.l6);
      var2.s7();
   }

   public final boolean n5() {
      return this.n5;
   }

   public final void n5(boolean var1) {
      this.n5 = var1;
   }

   public final String l6() {
      return this.l6;
   }

   public final void n5(String var1) {
      this.l6 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return k5;
   }

   // $VF: synthetic method
   static boolean n5(i9f var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(i9f var0, String var1) {
      return var0.l6 = var1;
   }
}
