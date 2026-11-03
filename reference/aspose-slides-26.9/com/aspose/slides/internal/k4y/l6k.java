package com.aspose.slides.internal.k4y;

public class l6k extends b3 {
   private String n5;
   private int l6;
   private String k5;
   private String u3;
   private long a6;
   private n7e u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "text:table-name", "text:table-type", "text:database-name", "text:condition", "text:row-number", "connection-resource"
   );

   public l6k(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      l6k$1 var2 = new l6k$1(this);
      n5(var1, var2);
      n5(var1, new l6k$2(this, var1));
   }

   public l6k() {
      this.l6();
   }

   private void l6() {
      this.l6 = 0;
      this.a6 = 4294967295L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("text:table-name", this.n5);
      if (this.l6 != 0) {
         var2.l6("text:table-type", c5p.n5(this.l6));
      }

      if (this.k5 != null) {
         var2.l6("text:database-name", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("text:condition", this.u3);
      }

      if ((this.a6 & 4294967295L) != 4294967295L) {
         var2.l6("text:row-number", com.aspose.slides.ms.System.Xml.f4.l6(this.a6));
      }

      if (this.u9 != null) {
         this.u9.n5("form", var2, "connection-resource");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return h0;
   }

   // $VF: synthetic method
   static String n5(l6k var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int n5(l6k var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(l6k var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(l6k var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static long n5(l6k var0, long var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static n7e n5(l6k var0, n7e var1) {
      return var0.u9 = var1;
   }
}
