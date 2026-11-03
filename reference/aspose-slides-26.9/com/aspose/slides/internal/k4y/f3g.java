package com.aspose.slides.internal.k4y;

public class f3g extends b3 {
   private String n5;
   private com.aspose.slides.ms.System.j5 l6 = new com.aspose.slides.ms.System.j5();
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("w_Author", "w_Date");

   public f3g(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      f3g$1 var2 = new f3g$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public f3g() {
      this.l6();
   }

   private void l6() {
      com.aspose.slides.ms.System.j5.l6.u3(this.l6);
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("w:author", this.n5);
      var2.l6("w:date", com.aspose.slides.ms.System.Xml.f4.n5(this.l6.m3(), "yyyy-MM-ddTHH:mm:ss.fffffffK"));
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(f3g var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.j5 n5(f3g var0) {
      return var0.l6;
   }
}
