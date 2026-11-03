package com.aspose.slides.internal.k4y;

public class f3f extends b3 {
   private long n5;
   private String l6;
   private String k5;
   private String u3;
   private int a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "table:field-number", "table:value", "table:operator", "table:case-sensitive", "table:data-type"
   );

   public f3f(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      f3f$1 var2 = new f3f$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public f3f() {
      this.l6();
   }

   private void l6() {
      this.a6 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("table:field-number", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      var2.l6("table:value", this.l6);
      var2.l6("table:operator", this.k5);
      var2.l6("table:case-sensitive", this.u3);
      var2.l6("table:data-type", o3u.n5(this.a6));
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u9;
   }

   // $VF: synthetic method
   static long n5(f3f var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(f3f var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(f3f var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(f3f var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int n5(f3f var0, int var1) {
      return var0.a6 = var1;
   }
}
