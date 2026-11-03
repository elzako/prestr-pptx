package com.aspose.slides.internal.k4y;

public class a3a extends b3 {
   private String n5;
   private int l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("office:target-frame-name", "xlink:show");

   public a3a(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      a3a$1 var2 = new a3a$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public a3a() {
      this.l6();
   }

   private void l6() {
      this.l6 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("office:target-frame-name", this.n5);
      }

      if (this.l6 != 0) {
         var2.l6("xlink:show", h9l.n5(this.l6));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(a3a var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int n5(a3a var0, int var1) {
      return var0.l6 = var1;
   }
}
