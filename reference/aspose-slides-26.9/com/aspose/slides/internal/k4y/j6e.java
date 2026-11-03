package com.aspose.slides.internal.k4y;

public final class j6e extends b3 {
   private String n5;
   private u5b l6;
   private a9t k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("f", "dlblRangeCache", "extLst");

   public j6e(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new j6e$1(this, var1));
   }

   public j6e() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5("c15", var2, "f", this.n5, false);
      if (this.l6 != null) {
         this.l6.n5("c15", var2, "dlblRangeCache");
      }

      if (this.k5 != null) {
         this.k5.n5("c", var2, "extLst");
      }

      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   public final u5b l6() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return u3;
   }

   // $VF: synthetic method
   static String n5(j6e var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(j6e var0) {
      return var0.n5;
   }

   // $VF: synthetic method
   static u5b n5(j6e var0, u5b var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static a9t n5(j6e var0, a9t var1) {
      return var0.k5 = var1;
   }
}
