package com.aspose.slides.internal.k4y;

public class e9j extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private String u9;
   private boolean h0;
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9(
      "text:id", "text:key1", "text:key2", "text:string-value-phonetic", "text:key1-phonetic", "text:key2-phonetic", "text:main-entry"
   );

   public e9j(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      e9j$1 var2 = new e9j$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public e9j() {
      this.l6();
   }

   private void l6() {
      this.h0 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("text:id", this.n5);
      if (this.l6 != null) {
         var2.l6("text:key1", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("text:key2", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("text:string-value-phonetic", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("text:key1-phonetic", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("text:key2-phonetic", this.u9);
      }

      if (this.h0) {
         var2.l6("text:main-entry", this.h0 ? "true" : "false");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return c8;
   }

   // $VF: synthetic method
   static String n5(e9j var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(e9j var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(e9j var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(e9j var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String a6(e9j var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String u9(e9j var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean n5(e9j var0, boolean var1) {
      return var0.h0 = var1;
   }
}
