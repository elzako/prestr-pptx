package com.aspose.slides.internal.k4y;

public class j2k extends b3 {
   private boolean n5;
   private boolean l6;
   private boolean k5;
   private String u3;
   private String a6;
   private String u9;
   private String h0;
   private String c8;
   private String t2;
   private static final com.aspose.slides.internal.v6g.u9 s7 = new com.aspose.slides.internal.v6g.u9(
      "alignWithMargins", "differentOddEven", "differentFirst", "oddHeader", "oddFooter", "evenHeader", "evenFooter", "firstHeader", "firstFooter"
   );

   public j2k(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      j2k$1 var2 = new j2k$1(this);
      n5(var1, var2);
      n5(var1, new j2k$2(this, var1));
   }

   public j2k() {
      this.l6();
   }

   private void l6() {
      this.n5 = true;
      this.l6 = false;
      this.k5 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!this.n5) {
         var2.l6("alignWithMargins", this.n5 ? "1" : "0");
      }

      if (this.l6) {
         var2.l6("differentOddEven", this.l6 ? "1" : "0");
      }

      if (this.k5) {
         var2.l6("differentFirst", this.k5 ? "1" : "0");
      }

      if (this.u3 != null) {
         this.n5("cx", var2, "oddHeader", this.u3, false);
      }

      if (this.a6 != null) {
         this.n5("cx", var2, "oddFooter", this.a6, false);
      }

      if (this.u9 != null) {
         this.n5("cx", var2, "evenHeader", this.u9, false);
      }

      if (this.h0 != null) {
         this.n5("cx", var2, "evenFooter", this.h0, false);
      }

      if (this.c8 != null) {
         this.n5("cx", var2, "firstHeader", this.c8, false);
      }

      if (this.t2 != null) {
         this.n5("cx", var2, "firstFooter", this.t2, false);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return s7;
   }

   // $VF: synthetic method
   static boolean n5(j2k var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(j2k var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean k5(j2k var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String n5(j2k var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String n5(j2k var0) {
      return var0.u3;
   }

   // $VF: synthetic method
   static String l6(j2k var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String l6(j2k var0) {
      return var0.a6;
   }

   // $VF: synthetic method
   static String k5(j2k var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String k5(j2k var0) {
      return var0.u9;
   }

   // $VF: synthetic method
   static String u3(j2k var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String u3(j2k var0) {
      return var0.h0;
   }

   // $VF: synthetic method
   static String a6(j2k var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String a6(j2k var0) {
      return var0.c8;
   }

   // $VF: synthetic method
   static String u9(j2k var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String u9(j2k var0) {
      return var0.t2;
   }
}
