package com.aspose.slides.internal.k4y;

public class q4o extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private String u9;
   private u1 h0;
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9("gdRefX", "minX", "maxX", "gdRefY", "minY", "maxY", "pos");

   public q4o(com.aspose.slides.ms.System.Xml.c7 var1) {
      q4o$1 var2 = new q4o$1(this);
      n5(var1, var2);
      n5(var1, new q4o$2(this, var1));
   }

   public q4o() {
      this.h0 = new u1();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("gdRefX", this.n5);
      }

      if (this.l6 != null) {
         var2.l6("minX", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("maxX", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("gdRefY", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("minY", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("maxY", this.u9);
      }

      this.h0.n5("a", var2, "pos");
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

   public final String k5() {
      return this.k5;
   }

   public final void k5(String var1) {
      this.k5 = var1;
   }

   public final String u3() {
      return this.u3;
   }

   public final void u3(String var1) {
      this.u3 = var1;
   }

   public final String a6() {
      return this.a6;
   }

   public final void a6(String var1) {
      this.a6 = var1;
   }

   public final String u9() {
      return this.u9;
   }

   public final void u9(String var1) {
      this.u9 = var1;
   }

   public final u1 h0() {
      return this.h0;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 c8() {
      return c8;
   }

   // $VF: synthetic method
   static String n5(q4o var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(q4o var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(q4o var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(q4o var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String a6(q4o var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String u9(q4o var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static u1 n5(q4o var0, u1 var1) {
      return var0.h0 = var1;
   }
}
