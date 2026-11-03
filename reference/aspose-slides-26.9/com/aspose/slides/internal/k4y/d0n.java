package com.aspose.slides.internal.k4y;

public class d0n extends b3 {
   private String n5;
   private boolean l6;
   private boolean k5;
   private String u3;
   private long a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9("r", "deleted", "undone", "val", "numFmtId");

   public d0n(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      d0n$1 var2 = new d0n$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public d0n() {
      this.l6();
   }

   private void l6() {
      this.l6 = false;
      this.k5 = false;
      this.a6 = 4294967295L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("r", this.n5);
      if (this.l6) {
         var2.l6("deleted", this.l6 ? "1" : "0");
      }

      if (this.k5) {
         var2.l6("undone", this.k5 ? "1" : "0");
      }

      var2.l6("val", this.u3);
      if ((this.a6 & 4294967295L) != 4294967295L) {
         var2.l6("numFmtId", com.aspose.slides.ms.System.Xml.f4.l6(this.a6));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u9;
   }

   // $VF: synthetic method
   static String n5(d0n var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(d0n var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean l6(d0n var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String l6(d0n var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static long n5(d0n var0, long var1) {
      return var0.a6 = var1;
   }
}
