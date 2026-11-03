package com.aspose.slides.internal.k4y;

public class q5v extends b3 {
   private String n5;
   private String l6;
   private byte k5;
   private byte u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("typeface", "panose", "pitchFamily", "charset");

   public q5v(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u9();
      q5v$1 var2 = new q5v$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public q5v() {
      this.u9();
   }

   private void u9() {
      this.k5 = 0;
      this.u3 = 1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("typeface", this.n5);
      if (this.l6 != null) {
         var2.l6("panose", this.l6);
      }

      if (this.k5 != 0) {
         var2.l6("pitchFamily", com.aspose.slides.ms.System.Xml.f4.n5(this.k5));
      }

      if (this.u3 != 1) {
         var2.l6("charset", com.aspose.slides.ms.System.Xml.f4.n5(this.u3));
      }

      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final String l6() {
      return this.l6;
   }

   public final void l6(String var1) {
      this.l6 = var1;
   }

   public final byte k5() {
      return this.k5;
   }

   public final void n5(byte var1) {
      this.k5 = var1;
   }

   public final byte u3() {
      return this.u3;
   }

   public final void l6(byte var1) {
      this.u3 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return a6;
   }

   // $VF: synthetic method
   static String n5(q5v var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(q5v var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static byte n5(q5v var0, byte var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static byte l6(q5v var0, byte var1) {
      return var0.u3 = var1;
   }
}
