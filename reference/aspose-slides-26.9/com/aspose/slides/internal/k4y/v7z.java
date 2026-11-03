package com.aspose.slides.internal.k4y;

public class v7z extends b3 {
   private String n5;
   private int l6;
   private boolean k5;
   private boolean u3;
   private boolean a6;
   private boolean u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9("r", "i", "s", "l", "t", "a");

   public v7z(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      v7z$1 var2 = new v7z$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public v7z() {
      this.l6();
   }

   private void l6() {
      this.l6 = 0;
      this.k5 = false;
      this.u3 = false;
      this.a6 = false;
      this.u9 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("r", this.n5);
      if (this.l6 != 0) {
         var2.l6("i", com.aspose.slides.ms.System.Xml.f4.n5(this.l6));
      }

      if (this.k5) {
         var2.l6("s", this.k5 ? "1" : "0");
      }

      if (this.u3) {
         var2.l6("l", this.u3 ? "1" : "0");
      }

      if (this.a6) {
         var2.l6("t", this.a6 ? "1" : "0");
      }

      if (this.u9) {
         var2.l6("a", this.u9 ? "1" : "0");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return h0;
   }

   // $VF: synthetic method
   static String n5(v7z var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int n5(v7z var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(v7z var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(v7z var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean k5(v7z var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean u3(v7z var0, boolean var1) {
      return var0.u9 = var1;
   }
}
