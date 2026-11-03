package com.aspose.slides.internal.k4y;

public class u5h extends b3 {
   private String n5;
   private String l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("name", "value");

   public u5h(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      u5h$1 var2 = new u5h$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public u5h() {
      this.u3();
   }

   private void u3() {
      this.l6 = "ink";
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      com.aspose.slides.internal.f8y.n5.n5(this.n5 != null, "Required property \"Name\" is uninitialized.");
      var2.l6("name", this.n5);
      if (!"ink".equals(this.l6)) {
         var2.l6("value", this.l6);
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

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(u5h var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(u5h var0, String var1) {
      return var0.l6 = var1;
   }
}
