package com.aspose.slides.internal.k4y;

public class v3o extends b3 {
   private boolean l6;
   private int k5;
   public static final int n5 = t3u.n5("all");
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("embed", "show");

   public v3o(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      v3o$1 var2 = new v3o$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public v3o() {
      this.l6();
   }

   private void l6() {
      this.l6 = false;
      this.k5 = n5;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6) {
         var2.l6("embed", this.l6 ? "1" : "0");
      }

      if (this.k5 != n5) {
         var2.l6("show", t3u.n5(this.k5));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static boolean n5(v3o var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int n5(v3o var0, int var1) {
      return var0.k5 = var1;
   }
}
