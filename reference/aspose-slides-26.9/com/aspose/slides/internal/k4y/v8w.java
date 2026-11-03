package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class v8w extends b3 {
   private long n5;
   private String l6;
   private char k5;
   private String u3;
   private String a6;
   private String u9;
   private j1w h0;
   private j9d c8;
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "text:level",
      "text:style-name",
      "text:bullet-char",
      "style:num-prefix",
      "style:num-suffix",
      "text:bullet-relative-size",
      "list-level-properties",
      "text-properties"
   );

   public v8w(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.c8();
      v8w$1 var2 = new v8w$1(this);
      n5(var1, var2);
      n5(var1, new v8w$2(this, var1));
   }

   public v8w() {
      this.c8();
   }

   private void c8() {
      this.k5 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("text:level", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      if (this.l6 != null) {
         var2.l6("text:style-name", this.l6);
      }

      var2.l6("text:bullet-char", com.aspose.slides.ms.System.Xml.f4.n5(this.k5));
      if (this.u3 != null) {
         var2.l6("style:num-prefix", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("style:num-suffix", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("text:bullet-relative-size", this.u9);
      }

      if (this.h0 != null) {
         this.h0.n5("style", var2, "list-level-properties");
      }

      if (this.c8 != null) {
         this.c8.n5("style", var2, "text-properties");
      }

      var2.s7();
   }

   public final j1w n5() {
      if (this.h0 != null) {
         throw new Exception("Only one <list_level_properties> element can be added.");
      }

      this.h0 = new j1w();
      return this.h0;
   }

   public final j9d l6() {
      if (this.c8 != null) {
         throw new Exception("Only one <text_properties> element can be added.");
      }

      this.c8 = new j9d();
      return this.c8;
   }

   public final long k5() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final char u3() {
      return this.k5;
   }

   public final void n5(char var1) {
      this.k5 = var1;
   }

   public final j1w a6() {
      return this.h0;
   }

   public final j9d u9() {
      return this.c8;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 h0() {
      return t2;
   }

   // $VF: synthetic method
   static long n5(v8w var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(v8w var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static char n5(v8w var0, char var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String l6(v8w var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String k5(v8w var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String u3(v8w var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static j1w n5(v8w var0, j1w var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static j9d n5(v8w var0, j9d var1) {
      return var0.c8 = var1;
   }
}
