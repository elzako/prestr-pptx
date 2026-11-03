package com.aspose.slides.internal.k4y;

public class s8d extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("svg:x", "svg:y", "svg:width", "svg:height");

   public s8d(com.aspose.slides.ms.System.Xml.c7 var1) {
      s8d$1 var2 = new s8d$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public s8d() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("svg:x", this.n5);
      }

      if (this.l6 != null) {
         var2.l6("svg:y", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("svg:width", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("svg:height", this.u3);
      }

      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   public final String l6() {
      return this.l6;
   }

   public final String k5() {
      return this.k5;
   }

   public final String u3() {
      return this.u3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return a6;
   }

   // $VF: synthetic method
   static String n5(s8d var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(s8d var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(s8d var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(s8d var0, String var1) {
      return var0.u3 = var1;
   }
}
