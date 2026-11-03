package com.aspose.slides.internal.k4y;

public class u8x extends b3 {
   private String n5;
   private String l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("Identifier", "Description");

   public u8x(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new u8x$1(this, var1));
   }

   public u8x() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5("xd", var2, "Identifier", this.n5, false);
      if (this.l6 != null) {
         this.n5("xd", var2, "Description", this.l6, false);
      }

      var2.s7();
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final void l6(String var1) {
      this.l6 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(u8x var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(u8x var0) {
      return var0.n5;
   }

   // $VF: synthetic method
   static String l6(u8x var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(u8x var0) {
      return var0.l6;
   }
}
