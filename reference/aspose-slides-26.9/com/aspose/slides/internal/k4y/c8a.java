package com.aspose.slides.internal.k4y;

public class c8a extends b3 {
   private String n5;
   private long l6;
   private char k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9(
      "text:name", "text:display-outline-level", "text:separation-character"
   );

   public c8a(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      c8a$1 var2 = new c8a$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public c8a() {
      this.l6();
   }

   private void l6() {
      this.k5 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("text:name", this.n5);
      var2.l6("text:display-outline-level", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      if (this.k5 != 0) {
         var2.l6("text:separation-character", com.aspose.slides.ms.System.Xml.f4.n5(this.k5));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static String n5(c8a var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static long n5(c8a var0, long var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static char n5(c8a var0, char var1) {
      return var0.k5 = var1;
   }
}
