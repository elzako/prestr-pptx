package com.aspose.slides.internal.k4y;

public class z1f extends b3 {
   private int k5;
   private int u3;
   private com.aspose.slides.ms.System.o0 a6 = new com.aspose.slides.ms.System.o0();
   private com.aspose.slides.ms.System.o0 u9 = new com.aspose.slides.ms.System.o0();
   private int h0;
   private int c8;
   private int t2;
   private String s7;
   private String x8;
   private String n3;
   private String y4;
   private String e2;
   private String t9;
   public static final com.aspose.slides.ms.System.o0 n5 = com.aspose.slides.ms.System.o0.n5.k5();
   public static final com.aspose.slides.ms.System.o0 l6 = com.aspose.slides.ms.System.o0.n5.k5();
   private static final com.aspose.slides.internal.v6g.u9 z1 = new com.aspose.slides.internal.v6g.u9(
      "v:ext",
      "issignatureline",
      "id",
      "provid",
      "signinginstructionsset",
      "allowcomments",
      "showsigndate",
      "o:suggestedsigner",
      "o:suggestedsigner2",
      "o:suggestedsigneremail",
      "signinginstructions",
      "addlxml",
      "sigprovurl"
   );

   public z1f(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      z1f$1 var2 = new z1f$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public z1f() {
      this.l6();
   }

   private void l6() {
      this.k5 = 0;
      this.u3 = 0;
      n5.k5(this.a6);
      l6.k5(this.u9);
      this.h0 = 0;
      this.c8 = 0;
      this.t2 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.k5 != 0) {
         var2.l6("v:ext", a3n.n5(this.k5));
      }

      if (this.u3 != 0) {
         var2.l6("issignatureline", m4w.n5(this.u3));
      }

      if (com.aspose.slides.ms.System.o0.l6(this.a6, n5)) {
         var2.l6("id", com.aspose.slides.ms.System.d1.n5(new String[]{"{", com.aspose.slides.ms.System.d1.t2(com.aspose.slides.ms.System.Xml.f4.n5(this.a6.k5())), "}"}));
      }

      if (com.aspose.slides.ms.System.o0.l6(this.u9, l6)) {
         var2.l6("provid", com.aspose.slides.ms.System.d1.n5(new String[]{"{", com.aspose.slides.ms.System.d1.t2(com.aspose.slides.ms.System.Xml.f4.n5(this.u9.k5())), "}"}));
      }

      if (this.h0 != 0) {
         var2.l6("signinginstructionsset", m4w.n5(this.h0));
      }

      if (this.c8 != 0) {
         var2.l6("allowcomments", m4w.n5(this.c8));
      }

      if (this.t2 != 0) {
         var2.l6("showsigndate", m4w.n5(this.t2));
      }

      if (this.s7 != null) {
         var2.l6("o:suggestedsigner", this.s7);
      }

      if (this.x8 != null) {
         var2.l6("o:suggestedsigner2", this.x8);
      }

      if (this.n3 != null) {
         var2.l6("o:suggestedsigneremail", this.n3);
      }

      if (this.y4 != null) {
         var2.l6("signinginstructions", this.y4);
      }

      if (this.e2 != null) {
         var2.l6("addlxml", this.e2);
      }

      if (this.t9 != null) {
         var2.l6("sigprovurl", this.t9);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return z1;
   }

   // $VF: synthetic method
   static int n5(z1f var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int l6(z1f var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.o0 n5(z1f var0, com.aspose.slides.ms.System.o0 var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.o0 l6(z1f var0, com.aspose.slides.ms.System.o0 var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static int k5(z1f var0, int var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static int u3(z1f var0, int var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static int a6(z1f var0, int var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String n5(z1f var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String l6(z1f var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String k5(z1f var0, String var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String u3(z1f var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String a6(z1f var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static String u9(z1f var0, String var1) {
      return var0.t9 = var1;
   }
}
