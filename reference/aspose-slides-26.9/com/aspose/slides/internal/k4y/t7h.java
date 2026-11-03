package com.aspose.slides.internal.k4y;

public class t7h extends b3 {
   private int n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private int u9;
   private int h0;
   private int c8;
   private int t2;
   private static final com.aspose.slides.internal.v6g.u9 s7 = new com.aspose.slides.internal.v6g.u9(
      "w_Hint", "w_Ascii", "w_HAnsi", "w_EastAsia", "w_Cs", "w_AsciiTheme", "w_HAnsiTheme", "w_EastAsiaTheme", "w_Cstheme"
   );

   public t7h(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      t7h$1 var2 = new t7h$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public t7h() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0;
      this.u9 = 0;
      this.h0 = 0;
      this.c8 = 0;
      this.t2 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0) {
         var2.l6("w:hint", o0j.n5(this.n5));
      }

      if (this.l6 != null) {
         var2.l6("w:ascii", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("w:hAnsi", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("w:eastAsia", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("w:cs", this.a6);
      }

      if (this.u9 != 0) {
         var2.l6("w:asciiTheme", n1h.n5(this.u9));
      }

      if (this.h0 != 0) {
         var2.l6("w:hAnsiTheme", n1h.n5(this.h0));
      }

      if (this.c8 != 0) {
         var2.l6("w:eastAsiaTheme", n1h.n5(this.c8));
      }

      if (this.t2 != 0) {
         var2.l6("w:cstheme", n1h.n5(this.t2));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return s7;
   }

   // $VF: synthetic method
   static int n5(t7h var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(t7h var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(t7h var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(t7h var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String u3(t7h var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int l6(t7h var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static int k5(t7h var0, int var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static int u3(t7h var0, int var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static int a6(t7h var0, int var1) {
      return var0.t2 = var1;
   }
}
