package com.aspose.slides.internal.k4y;

public class n9a extends b3 {
   private String n5;
   private String l6;
   private p4t k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("txfldGUID", "f", "dlblFieldTableCache");

   public n9a(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new n9a$1(this, var1));
   }

   public n9a() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5("c", var2, "txfldGUID", this.n5, false);
      this.n5("c", var2, "f", this.l6, false);
      if (this.k5 != null) {
         this.k5.n5("c", var2, "dlblFieldTableCache");
      }

      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   public final String l6() {
      return this.l6;
   }

   public final p4t k5() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return u3;
   }

   // $VF: synthetic method
   static String n5(n9a var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(n9a var0) {
      return var0.n5;
   }

   // $VF: synthetic method
   static String l6(n9a var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(n9a var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static p4t n5(n9a var0, p4t var1) {
      return var0.k5 = var1;
   }
}
