package com.aspose.slides.internal.k4y;

public class u7v extends b3 {
   private String n5;
   private String l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("Id");

   public u7v(com.aspose.slides.ms.System.Xml.c7 var1) {
      u7v$1 var2 = new u7v$1(this);
      n5(var1, var2);
      if (!var1.m1()) {
         var1.u9();
         this.l6 = var1.z1();
      }
   }

   public u7v() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("Id", this.n5);
      }

      var2.l6(this.l6);
      var2.s7();
   }

   public final void n5(String var1) {
      this.l6 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(u7v var0, String var1) {
      return var0.n5 = var1;
   }
}
