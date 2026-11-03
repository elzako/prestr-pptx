package com.aspose.slides.internal.k4y;

public class l5h extends b3 {
   private long l6;
   private String k5;
   private int u3;
   private String a6;
   public static final int n5 = n7p.n5("visible");
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "table:number-columns-repeated", "table:style-name", "table:visibility", "table:default-cell-style-name"
   );

   public l5h(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      l5h$1 var2 = new l5h$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public l5h() {
      this.k5();
   }

   private void k5() {
      this.l6 = 1L;
      this.u3 = n5;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if ((this.l6 & 4294967295L) != 1L) {
         var2.l6("table:number-columns-repeated", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      }

      if (this.k5 != null) {
         var2.l6("table:style-name", this.k5);
      }

      if (this.u3 != n5) {
         var2.l6("table:visibility", n7p.n5(this.u3));
      }

      if (this.a6 != null) {
         var2.l6("table:default-cell-style-name", this.a6);
      }

      var2.s7();
   }

   public final String n5() {
      return this.k5;
   }

   public final void n5(String var1) {
      this.k5 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return u9;
   }

   // $VF: synthetic method
   static long n5(l5h var0, long var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String n5(l5h var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(l5h var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String l6(l5h var0, String var1) {
      return var0.a6 = var1;
   }
}
