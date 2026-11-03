package com.aspose.slides.internal.k4y;

public class s4n extends b3 {
   private int n5;
   private int l6;
   private int k5;
   private int u3;
   private int a6;
   private int u9;
   private int h0;
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9(
      "year", "month", "day", "hour", "minute", "second", "dateTimeGrouping"
   );

   public s4n(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      s4n$1 var2 = new s4n$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public s4n() {
      this.l6();
   }

   private void l6() {
      this.l6 = 0;
      this.k5 = 0;
      this.u3 = 0;
      this.a6 = 0;
      this.u9 = 0;
      this.h0 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("year", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      if ((this.l6 & 65535) != 0) {
         var2.l6("month", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      }

      if ((this.k5 & 65535) != 0) {
         var2.l6("day", com.aspose.slides.ms.System.Xml.f4.l6(this.k5));
      }

      if ((this.u3 & 65535) != 0) {
         var2.l6("hour", com.aspose.slides.ms.System.Xml.f4.l6(this.u3));
      }

      if ((this.a6 & 65535) != 0) {
         var2.l6("minute", com.aspose.slides.ms.System.Xml.f4.l6(this.a6));
      }

      if ((this.u9 & 65535) != 0) {
         var2.l6("second", com.aspose.slides.ms.System.Xml.f4.l6(this.u9));
      }

      var2.l6("dateTimeGrouping", i0t.n5(this.h0));
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return c8;
   }

   // $VF: synthetic method
   static int n5(s4n var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int l6(s4n var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int k5(s4n var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int u3(s4n var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int a6(s4n var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int u9(s4n var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static int h0(s4n var0, int var1) {
      return var0.h0 = var1;
   }
}
