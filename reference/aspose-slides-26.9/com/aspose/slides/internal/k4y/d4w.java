package com.aspose.slides.internal.k4y;

public class d4w extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private String u9;
   private l8r h0;
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9(
      "axis", "ptType", "hideLastTrans", "st", "cnt", "step", "extLst"
   );

   public d4w(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.c8();
      d4w$1 var2 = new d4w$1(this);
      n5(var1, var2);
      n5(var1, new d4w$2(this, var1));
   }

   public d4w() {
      this.c8();
   }

   private void c8() {
      this.n5 = "none";
      this.l6 = "all";
      this.k5 = "true";
      this.u3 = "1";
      this.a6 = "0";
      this.u9 = "1";
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!"none".equals(this.n5)) {
         var2.l6("axis", this.n5);
      }

      if (!"all".equals(this.l6)) {
         var2.l6("ptType", this.l6);
      }

      if (!"true".equals(this.k5)) {
         var2.l6("hideLastTrans", this.k5);
      }

      if (!"1".equals(this.u3)) {
         var2.l6("st", this.u3);
      }

      if (!"0".equals(this.a6)) {
         var2.l6("cnt", this.a6);
      }

      if (!"1".equals(this.u9)) {
         var2.l6("step", this.u9);
      }

      if (this.h0 != null) {
         this.h0.n5("dgm", var2, "extLst");
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

   public final String k5() {
      return this.k5;
   }

   public final String u3() {
      return this.u3;
   }

   public final String a6() {
      return this.a6;
   }

   public final String u9() {
      return this.u9;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 h0() {
      return c8;
   }

   // $VF: synthetic method
   static String n5(d4w var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(d4w var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(d4w var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(d4w var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String a6(d4w var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String u9(d4w var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static l8r n5(d4w var0, l8r var1) {
      return var0.h0 = var1;
   }
}
