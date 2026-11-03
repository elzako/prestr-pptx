package com.aspose.slides.internal.k4y;

public class v8s extends b3 {
   private String l6;
   private com.aspose.slides.ms.System.j5 k5 = new com.aspose.slides.ms.System.j5();
   private int u3;
   public static final com.aspose.slides.ms.System.j5 n5 = com.aspose.slides.ms.System.j5.l6.m3();
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("w_Author", "w_Date", "w_Id");

   public v8s(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      v8s$1 var2 = new v8s$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public v8s() {
      this.l6();
   }

   private void l6() {
      n5.u3(this.k5);
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("w:author", this.l6);
      if (com.aspose.slides.ms.System.j5.c8(this.k5, n5)) {
         var2.l6("w:date", com.aspose.slides.ms.System.Xml.f4.n5(this.k5.m3(), "yyyy-MM-ddTHH:mm:ss.fffffffK"));
      }

      var2.l6("w:id", com.aspose.slides.ms.System.Xml.f4.n5(this.u3));
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return a6;
   }

   // $VF: synthetic method
   static String n5(v8s var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.j5 n5(v8s var0) {
      return var0.k5;
   }

   // $VF: synthetic method
   static int n5(v8s var0, int var1) {
      return var0.u3 = var1;
   }
}
