package com.aspose.slides.internal.k4y;

public class h4 extends b3 {
   private int n5;
   private f8y l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("blend", "cont");

   public h4(com.aspose.slides.ms.System.Xml.c7 var1) {
      h4$1 var2 = new h4$1(this);
      n5(var1, var2);
      n5(var1, new h4$2(this, var1));
   }

   public h4() {
      this.l6 = new f8y();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("blend", h6.n5(this.n5));
      this.l6.n5("a", var2, "cont");
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static int n5(h4 var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static f8y n5(h4 var0, f8y var1) {
      return var0.l6 = var1;
   }
}
