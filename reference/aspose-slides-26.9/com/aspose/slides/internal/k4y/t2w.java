package com.aspose.slides.internal.k4y;

public class t2w extends b3 {
   private e5d n5;
   private String l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("DigestMethod", "DigestValue");

   public t2w(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new t2w$1(this, var1));
   }

   public t2w() {
      this.n5 = new e5d();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("", var2, "DigestMethod");
      this.n5("", var2, "DigestValue", this.l6, false);
      var2.s7();
   }

   public final e5d n5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.l6 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return k5;
   }

   // $VF: synthetic method
   static e5d n5(t2w var0, e5d var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(t2w var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String n5(t2w var0) {
      return var0.l6;
   }
}
