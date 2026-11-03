package com.aspose.slides.internal.k4y;

public class o6m extends b3 {
   private String l6;
   private long k5;
   private String u3;
   private com.aspose.slides.ms.System.j5 a6 = new com.aspose.slides.ms.System.j5();
   private String u9;
   public static final com.aspose.slides.ms.System.j5 n5 = com.aspose.slides.ms.System.j5.l6.m3();
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "xml:id", "time", "timestampRef", "timeString", "timeOffset"
   );

   public o6m(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.h0();
      o6m$1 var2 = new o6m$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public o6m() {
      this.h0();
   }

   private void h0() {
      this.k5 = 0L;
      n5.u3(this.a6);
      this.u9 = "0";
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("xml:id", this.l6);
      if (this.k5 != 0L) {
         var2.l6("time", com.aspose.slides.ms.System.Xml.f4.k5(this.k5));
      }

      if (this.u3 != null) {
         var2.l6("timestampRef", this.u3);
      }

      if (com.aspose.slides.ms.System.j5.c8(this.a6, n5)) {
         var2.l6("timeString", com.aspose.slides.ms.System.Xml.f4.n5(this.a6.m3(), "yyyy-MM-ddTHH:mm:ss.fffffffK"));
      }

      if (!"0".equals(this.u9)) {
         var2.l6("timeOffset", this.u9);
      }

      var2.s7();
   }

   public final String n5() {
      return this.l6;
   }

   public final void n5(String var1) {
      this.l6 = var1;
   }

   public final long l6() {
      return this.k5;
   }

   public final void n5(long var1) {
      this.k5 = var1;
   }

   public final String k5() {
      return this.u3;
   }

   public final void l6(String var1) {
      this.u3 = var1;
   }

   public final com.aspose.slides.ms.System.j5 u3() {
      return this.a6;
   }

   public final void n5(com.aspose.slides.ms.System.j5 var1) {
      var1.u3(this.a6);
   }

   public final String a6() {
      return this.u9;
   }

   public final void k5(String var1) {
      this.u9 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u9() {
      return h0;
   }

   // $VF: synthetic method
   static String n5(o6m var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static long n5(o6m var0, long var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String l6(o6m var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.j5 n5(o6m var0) {
      return var0.a6;
   }

   // $VF: synthetic method
   static String k5(o6m var0, String var1) {
      return var0.u9 = var1;
   }
}
