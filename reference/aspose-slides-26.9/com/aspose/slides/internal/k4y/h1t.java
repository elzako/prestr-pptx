package com.aspose.slides.internal.k4y;

public class h1t extends b3 {
   private String k5;
   private int u3;
   private double a6;
   private String u9;
   private com.aspose.slides.ms.System.j5 h0 = new com.aspose.slides.ms.System.j5();
   private com.aspose.slides.ms.System.s4 c8 = new com.aspose.slides.ms.System.s4();
   private byte t2;
   private String s7;
   public static final com.aspose.slides.ms.System.j5 n5 = com.aspose.slides.ms.System.j5.l6.m3();
   public static final com.aspose.slides.ms.System.s4 l6 = com.aspose.slides.ms.System.s4.k5.n3();
   private static final com.aspose.slides.internal.v6g.u9 x8 = new com.aspose.slides.internal.v6g.u9(
      "form:property-name",
      "office:value-type",
      "office:value",
      "office:currency",
      "office:date-value",
      "office:time-value",
      "office:boolean-value",
      "office:string-value"
   );

   public h1t(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      h1t$1 var2 = new h1t$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public h1t() {
      this.l6();
   }

   private void l6() {
      this.u3 = 0;
      this.a6 = Double.NaN;
      n5.u3(this.h0);
      l6.u3(this.c8);
      this.t2 = -1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("form:property-name", this.k5);
      var2.l6("office:value-type", z6l.n5(this.u3));
      if (!com.aspose.slides.ms.System.d2.k5(this.a6)) {
         var2.l6("office:value", com.aspose.slides.ms.System.Xml.f4.n5(this.a6));
      }

      if (this.u9 != null) {
         var2.l6("office:currency", this.u9);
      }

      if (com.aspose.slides.ms.System.j5.c8(this.h0, n5)) {
         var2.l6("office:date-value", com.aspose.slides.ms.System.Xml.f4.n5(this.h0.m3(), "yyyy-MM-ddTHH:mm:ss.fffffffK"));
      }

      if (com.aspose.slides.ms.System.s4.a6(this.c8, l6)) {
         var2.l6("office:time-value", n5(this.c8.n3()));
      }

      if (this.t2 != -1) {
         var2.l6("office:boolean-value", this.t2 == 1 ? "true" : "false");
      }

      if (this.s7 != null) {
         var2.l6("office:string-value", this.s7);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return x8;
   }

   // $VF: synthetic method
   static String n5(h1t var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(h1t var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static double n5(h1t var0, double var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String l6(h1t var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.j5 n5(h1t var0) {
      return var0.h0;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.s4 l6(h1t var0) {
      return var0.c8;
   }

   // $VF: synthetic method
   static byte n5(h1t var0, byte var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String k5(h1t var0, String var1) {
      return var0.s7 = var1;
   }
}
