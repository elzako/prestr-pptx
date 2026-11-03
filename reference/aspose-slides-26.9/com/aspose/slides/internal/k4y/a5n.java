package com.aspose.slides.internal.k4y;

public class a5n extends b3 {
   private long n5;
   private w9v l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("builtInGroupCount", "functionGroup");

   public a5n(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      a5n$1 var2 = new a5n$1(this);
      n5(var1, var2);
      n5(var1, new a5n$2(this, var1));
   }

   public a5n() {
      this.l6();
   }

   private void l6() {
      this.n5 = 16L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if ((this.n5 & 4294967295L) != 16L) {
         var2.l6("builtInGroupCount", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      }

      if (this.l6 != null) {
         this.l6.n5("ssml", var2, "functionGroup");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static long n5(a5n var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static w9v n5(a5n var0, w9v var1) {
      return var0.l6 = var1;
   }
}
