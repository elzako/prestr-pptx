package com.aspose.slides.internal.k4y;

public class t4w extends b3 {
   private int l6;
   private String k5;
   private long u3;
   private String a6;
   public static final int n5 = m2u.n5("topLeft");
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9("pane", "activeCell", "activeCellId", "sqref");

   public t4w(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      t4w$1 var2 = new t4w$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public t4w() {
      this.l6();
   }

   private void l6() {
      this.l6 = n5;
      this.u3 = 0L;
      this.a6 = "A1";
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != n5) {
         var2.l6("pane", m2u.n5(this.l6));
      }

      if (this.k5 != null) {
         var2.l6("activeCell", this.k5);
      }

      if ((this.u3 & 4294967295L) != 0L) {
         var2.l6("activeCellId", com.aspose.slides.ms.System.Xml.f4.l6(this.u3));
      }

      if (!"A1".equals(this.a6)) {
         var2.l6("sqref", this.a6);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u9;
   }

   // $VF: synthetic method
   static int n5(t4w var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String n5(t4w var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static long n5(t4w var0, long var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String l6(t4w var0, String var1) {
      return var0.a6 = var1;
   }
}
