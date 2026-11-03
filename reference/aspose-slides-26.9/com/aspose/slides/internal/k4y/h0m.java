package com.aspose.slides.internal.k4y;

public class h0m extends b3 {
   private String n5;
   private boolean l6;
   private w9e k5;
   private e8b u3;
   private l7h a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "macro", "fPublished", "nvGraphicFramePr", "xfrm", "graphic"
   );

   public h0m(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      h0m$1 var2 = new h0m$1(this);
      n5(var1, var2);
      n5(var1, new h0m$2(this, var1));
   }

   public h0m() {
      this.a6();
      this.k5 = new w9e();
      this.u3 = new e8b();
      this.a6 = new l7h();
   }

   private void a6() {
      this.l6 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("macro", this.n5);
      }

      if (this.l6) {
         var2.l6("fPublished", this.l6 ? "1" : "0");
      }

      this.k5.n5("xdr", var2, "nvGraphicFramePr");
      this.u3.n5("xdr", var2, "xfrm");
      this.a6.n5("a", var2, "graphic");
      var2.s7();
   }

   public final w9e n5() {
      return this.k5;
   }

   public final e8b l6() {
      return this.u3;
   }

   public final l7h k5() {
      return this.a6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return u9;
   }

   // $VF: synthetic method
   static String n5(h0m var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(h0m var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static w9e n5(h0m var0, w9e var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static e8b n5(h0m var0, e8b var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static l7h n5(h0m var0, l7h var1) {
      return var0.a6 = var1;
   }
}
