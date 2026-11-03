package com.aspose.slides.internal.k4y;

public class c5f extends b3 {
   private j2w n5;
   private String l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("rPr", "t");

   public c5f(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new c5f$1(this, var1));
   }

   public c5f() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("ssml", var2, "rPr");
      }

      this.n5("ssml", var2, "t", this.l6, true);
      var2.s7();
   }

   public final j2w n5() {
      return this.n5;
   }

   public final String l6() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return k5;
   }

   // $VF: synthetic method
   static j2w n5(c5f var0, j2w var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(c5f var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String n5(c5f var0) {
      return var0.l6;
   }
}
