package com.aspose.slides.internal.k4y;

public class y4o extends b3 {
   private String n5;
   private String l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("st", "end");

   public y4o(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      y4o$1 var2 = new y4o$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public y4o() {
      this.u3();
   }

   private void u3() {
      this.n5 = "0";
      this.l6 = "0";
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!"0".equals(this.n5)) {
         var2.l6("st", this.n5);
      }

      if (!"0".equals(this.l6)) {
         var2.l6("end", this.l6);
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

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(y4o var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(y4o var0, String var1) {
      return var0.l6 = var1;
   }
}
