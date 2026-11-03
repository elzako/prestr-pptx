package com.aspose.slides.internal.k4y;

public class r3p extends b3 {
   private String n5;
   private String l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("Format", "Value");

   public r3p(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new r3p$1(this, var1));
   }

   public r3p() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("mdssi", var3, "http://schemas.openxmlformats.org/package/2006/digital-signature");
      this.n5("mdssi", var2, "Format", this.n5, false);
      this.n5("mdssi", var2, "Value", this.l6, false);
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

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(r3p var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(r3p var0) {
      return var0.n5;
   }

   // $VF: synthetic method
   static String l6(r3p var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(r3p var0) {
      return var0.l6;
   }
}
