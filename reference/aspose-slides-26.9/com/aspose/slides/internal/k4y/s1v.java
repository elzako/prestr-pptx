package com.aspose.slides.internal.k4y;

public class s1v extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("draw:name", "draw:display-name", "svg:viewBox", "svg:d");

   public s1v(com.aspose.slides.ms.System.Xml.c7 var1) {
      s1v$1 var2 = new s1v$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public s1v() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("draw:name", this.n5);
      if (this.l6 != null) {
         var2.l6("draw:display-name", this.l6);
      }

      var2.l6("svg:viewBox", this.k5);
      var2.l6("svg:d", this.u3);
      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final String l6() {
      return this.k5;
   }

   public final void l6(String var1) {
      this.k5 = var1;
   }

   public final String k5() {
      return this.u3;
   }

   public final void k5(String var1) {
      this.u3 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return a6;
   }

   // $VF: synthetic method
   static String n5(s1v var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(s1v var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(s1v var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(s1v var0, String var1) {
      return var0.u3 = var1;
   }
}
