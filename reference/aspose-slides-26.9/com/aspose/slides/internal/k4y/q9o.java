package com.aspose.slides.internal.k4y;

public class q9o extends b3 {
   private String l6;
   private com.aspose.slides.ms.System.j5 k5 = new com.aspose.slides.ms.System.j5();
   public static final com.aspose.slides.ms.System.j5 n5 = com.aspose.slides.ms.System.j5.l6.m3();
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("table:value-type", "table:date-value");

   public q9o(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      q9o$1 var2 = new q9o$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public q9o() {
      this.l6();
   }

   private void l6() {
      this.l6 = "date";
      n5.u3(this.k5);
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!"date".equals(this.l6)) {
         var2.l6("table:value-type", this.l6);
      }

      if (com.aspose.slides.ms.System.j5.c8(this.k5, n5)) {
         var2.l6("table:date-value", com.aspose.slides.ms.System.Xml.f4.n5(this.k5.m3(), "yyyy-MM-ddTHH:mm:ss.fffffffK"));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static String n5(q9o var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.j5 n5(q9o var0) {
      return var0.k5;
   }
}
