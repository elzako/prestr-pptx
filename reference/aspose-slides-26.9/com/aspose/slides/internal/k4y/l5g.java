package com.aspose.slides.internal.k4y;

public class l5g extends b3 {
   private int l6;
   private boolean k5;
   private boolean u3;
   private boolean a6;
   private a3z u9;
   public static final int n5 = m9o.n5("sum");
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9("function", "leftLabels", "topLabels", "link", "dataRefs");

   public l5g(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      l5g$1 var2 = new l5g$1(this);
      n5(var1, var2);
      n5(var1, new l5g$2(this, var1));
   }

   public l5g() {
      this.l6();
   }

   private void l6() {
      this.l6 = n5;
      this.k5 = false;
      this.u3 = false;
      this.a6 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != n5) {
         var2.l6("function", m9o.n5(this.l6));
      }

      if (this.k5) {
         var2.l6("leftLabels", this.k5 ? "1" : "0");
      }

      if (this.u3) {
         var2.l6("topLabels", this.u3 ? "1" : "0");
      }

      if (this.a6) {
         var2.l6("link", this.a6 ? "1" : "0");
      }

      if (this.u9 != null) {
         this.u9.n5("ssml", var2, "dataRefs");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return h0;
   }

   // $VF: synthetic method
   static int n5(l5g var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(l5g var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(l5g var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean k5(l5g var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static a3z n5(l5g var0, a3z var1) {
      return var0.u9 = var1;
   }
}
