package com.aspose.slides.internal.k4y;

public class q8h extends b3 {
   private f2z n5;
   private String l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("f", "v");

   public q8h(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new q8h$1(this, var1));
   }

   public q8h() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("cx", var2, "f");
      }

      if (this.l6 != null) {
         this.n5("cx", var2, "v", this.l6, false);
      }

      var2.s7();
   }

   public final void n5(f2z var1) {
      this.n5 = var1;
   }

   public final f2z n5() {
      return this.n5;
   }

   public final String l6() {
      return this.l6;
   }

   public final void n5(String var1) {
      this.l6 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return k5;
   }

   // $VF: synthetic method
   static f2z n5(q8h var0, f2z var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(q8h var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String n5(q8h var0) {
      return var0.l6;
   }
}
