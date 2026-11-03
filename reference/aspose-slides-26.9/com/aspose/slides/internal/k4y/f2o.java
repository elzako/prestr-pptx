package com.aspose.slides.internal.k4y;

public class f2o extends b3 {
   private double k5;
   private String u3;
   private com.aspose.slides.ms.System.j5 a6 = new com.aspose.slides.ms.System.j5();
   private com.aspose.slides.ms.System.s4 u9 = new com.aspose.slides.ms.System.s4();
   private byte h0;
   private String c8;
   public static final com.aspose.slides.ms.System.j5 n5 = com.aspose.slides.ms.System.j5.l6.m3();
   public static final com.aspose.slides.ms.System.s4 l6 = com.aspose.slides.ms.System.s4.k5.n3();
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "office:value", "office:currency", "office:date-value", "office:time-value", "office:boolean-value", "office:string-value"
   );

   public f2o(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      f2o$1 var2 = new f2o$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public f2o() {
      this.l6();
   }

   private void l6() {
      this.k5 = Double.NaN;
      n5.u3(this.a6);
      l6.u3(this.u9);
      this.h0 = -1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!com.aspose.slides.ms.System.d2.k5(this.k5)) {
         var2.l6("office:value", com.aspose.slides.ms.System.Xml.f4.n5(this.k5));
      }

      if (this.u3 != null) {
         var2.l6("office:currency", this.u3);
      }

      if (com.aspose.slides.ms.System.j5.c8(this.a6, n5)) {
         var2.l6("office:date-value", com.aspose.slides.ms.System.Xml.f4.n5(this.a6.m3(), "yyyy-MM-ddTHH:mm:ss.fffffffK"));
      }

      if (com.aspose.slides.ms.System.s4.a6(this.u9, l6)) {
         var2.l6("office:time-value", n5(this.u9.n3()));
      }

      if (this.h0 != -1) {
         var2.l6("office:boolean-value", this.h0 == 1 ? "true" : "false");
      }

      if (this.c8 != null) {
         var2.l6("office:string-value", this.c8);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return t2;
   }

   // $VF: synthetic method
   static double n5(f2o var0, double var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String n5(f2o var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.j5 n5(f2o var0) {
      return var0.a6;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.s4 l6(f2o var0) {
      return var0.u9;
   }

   // $VF: synthetic method
   static byte n5(f2o var0, byte var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String l6(f2o var0, String var1) {
      return var0.c8 = var1;
   }
}
