package com.aspose.slides.internal.k4y;

public class d6b extends b3 {
   private long k5;
   private int u3;
   private int a6;
   public static final int n5 = k2h.n5("fullwidthKatakana");
   public static final int l6 = l6c.n5("left");
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9("fontId", "type", "alignment");

   public d6b(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      d6b$1 var2 = new d6b$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public d6b() {
      this.l6();
   }

   private void l6() {
      this.u3 = n5;
      this.a6 = l6;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("fontId", com.aspose.slides.ms.System.Xml.f4.l6(this.k5));
      if (this.u3 != n5) {
         var2.l6("type", k2h.n5(this.u3));
      }

      if (this.a6 != l6) {
         var2.l6("alignment", l6c.n5(this.a6));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u9;
   }

   // $VF: synthetic method
   static long n5(d6b var0, long var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(d6b var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int l6(d6b var0, int var1) {
      return var0.a6 = var1;
   }
}
