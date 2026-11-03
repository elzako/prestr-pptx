package com.aspose.slides.internal.k4y;

public class h2g extends b3 {
   private long l6;
   private String k5;
   private int u3;
   public static final int n5 = o4a.n5("ascending");
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("table:field-number", "table:data-type", "table:order");

   public h2g(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      h2g$1 var2 = new h2g$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public h2g() {
      this.l6();
   }

   private void l6() {
      this.u3 = n5;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("table:field-number", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      var2.l6("table:data-type", this.k5);
      if (this.u3 != n5) {
         var2.l6("table:order", o4a.n5(this.u3));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return a6;
   }

   // $VF: synthetic method
   static long n5(h2g var0, long var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String n5(h2g var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(h2g var0, int var1) {
      return var0.u3 = var1;
   }
}
