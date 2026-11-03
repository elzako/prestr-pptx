package com.aspose.slides.internal.k4y;

public class x4j extends b3 {
   private int n5;
   private String l6;
   private String k5;
   private String u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("v:ext", "idsrc", "iddest", "idcntr");

   public x4j(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      x4j$1 var2 = new x4j$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public x4j() {
      this.u3();
   }

   private void u3() {
      this.n5 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0) {
         var2.l6("v:ext", a3n.n5(this.n5));
      }

      if (this.l6 != null) {
         var2.l6("idsrc", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("iddest", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("idcntr", this.u3);
      }

      var2.s7();
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final String n5() {
      return this.l6;
   }

   public final void n5(String var1) {
      this.l6 = var1;
   }

   public final String l6() {
      return this.k5;
   }

   public final void l6(String var1) {
      this.k5 = var1;
   }

   public final void k5(String var1) {
      this.u3 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return a6;
   }

   // $VF: synthetic method
   static int n5(x4j var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(x4j var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(x4j var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(x4j var0, String var1) {
      return var0.u3 = var1;
   }
}
