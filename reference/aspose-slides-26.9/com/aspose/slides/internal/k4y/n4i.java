package com.aspose.slides.internal.k4y;

public class n4i extends b3 {
   private String n5;
   private boolean l6;
   private boolean k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("prst", "invX", "invY");

   public n4i(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      n4i$1 var2 = new n4i$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public n4i() {
      this.u3();
   }

   private void u3() {
      this.l6 = false;
      this.k5 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("prst", this.n5);
      }

      if (this.l6) {
         var2.l6("invX", this.l6 ? "1" : "0");
      }

      if (this.k5) {
         var2.l6("invY", this.k5 ? "1" : "0");
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
      return u3;
   }

   // $VF: synthetic method
   static String n5(n4i var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(n4i var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean l6(n4i var0, boolean var1) {
      return var0.k5 = var1;
   }
}
