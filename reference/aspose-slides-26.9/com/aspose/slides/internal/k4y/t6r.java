package com.aspose.slides.internal.k4y;

public class t6r extends b3 {
   private boolean n5;
   private boolean l6;
   private boolean k5;
   private boolean u3;
   private String a6;
   private String u9;
   private String h0;
   private String c8;
   private String t2;
   private String s7;
   private static final com.aspose.slides.internal.v6g.u9 x8 = new com.aspose.slides.internal.v6g.u9(
      "differentOddEven",
      "differentFirst",
      "scaleWithDoc",
      "alignWithMargins",
      "oddHeader",
      "oddFooter",
      "evenHeader",
      "evenFooter",
      "firstHeader",
      "firstFooter"
   );

   public t6r(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      t6r$1 var2 = new t6r$1(this);
      n5(var1, var2);
      n5(var1, new t6r$2(this, var1));
   }

   public t6r() {
      this.l6();
   }

   private void l6() {
      this.n5 = false;
      this.l6 = false;
      this.k5 = true;
      this.u3 = true;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5) {
         var2.l6("differentOddEven", this.n5 ? "1" : "0");
      }

      if (this.l6) {
         var2.l6("differentFirst", this.l6 ? "1" : "0");
      }

      if (!this.k5) {
         var2.l6("scaleWithDoc", this.k5 ? "1" : "0");
      }

      if (!this.u3) {
         var2.l6("alignWithMargins", this.u3 ? "1" : "0");
      }

      if (this.a6 != null) {
         this.n5("ssml", var2, "oddHeader", this.a6, true);
      }

      if (this.u9 != null) {
         this.n5("ssml", var2, "oddFooter", this.u9, true);
      }

      if (this.h0 != null) {
         this.n5("ssml", var2, "evenHeader", this.h0, true);
      }

      if (this.c8 != null) {
         this.n5("ssml", var2, "evenFooter", this.c8, true);
      }

      if (this.t2 != null) {
         this.n5("ssml", var2, "firstHeader", this.t2, true);
      }

      if (this.s7 != null) {
         this.n5("ssml", var2, "firstFooter", this.s7, true);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return x8;
   }

   // $VF: synthetic method
   static boolean n5(t6r var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(t6r var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean k5(t6r var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean u3(t6r var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String n5(t6r var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String n5(t6r var0) {
      return var0.a6;
   }

   // $VF: synthetic method
   static String l6(t6r var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String l6(t6r var0) {
      return var0.u9;
   }

   // $VF: synthetic method
   static String k5(t6r var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String k5(t6r var0) {
      return var0.h0;
   }

   // $VF: synthetic method
   static String u3(t6r var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String u3(t6r var0) {
      return var0.c8;
   }

   // $VF: synthetic method
   static String a6(t6r var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String a6(t6r var0) {
      return var0.t2;
   }

   // $VF: synthetic method
   static String u9(t6r var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String u9(t6r var0) {
      return var0.s7;
   }
}
