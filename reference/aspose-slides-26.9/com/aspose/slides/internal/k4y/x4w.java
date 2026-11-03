package com.aspose.slides.internal.k4y;

public class x4w extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private l7j a6;
   private c6x u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "form:name", "form:control-implementation", "form:id", "xforms:bind", "properties", "event-listeners"
   );

   public x4w(com.aspose.slides.ms.System.Xml.c7 var1) {
      x4w$1 var2 = new x4w$1(this);
      n5(var1, var2);
      n5(var1, new x4w$2(this, var1));
   }

   public x4w() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("form:name", this.n5);
      }

      if (this.l6 != null) {
         var2.l6("form:control-implementation", this.l6);
      }

      var2.l6("form:id", this.k5);
      if (this.u3 != null) {
         var2.l6("xforms:bind", this.u3);
      }

      if (this.a6 != null) {
         this.a6.n5("form", var2, "properties");
      }

      if (this.u9 != null) {
         this.u9.n5("office", var2, "event-listeners");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return h0;
   }

   // $VF: synthetic method
   static String n5(x4w var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(x4w var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(x4w var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(x4w var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static l7j n5(x4w var0, l7j var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static c6x n5(x4w var0, c6x var1) {
      return var0.u9 = var1;
   }
}
