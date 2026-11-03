package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class x8m extends b3 {
   private long n5;
   private String l6;
   private String k5;
   private byte u3;
   private String a6;
   private String u9;
   private long h0;
   private long c8;
   private j1w t2;
   private j9d s7;
   private static final com.aspose.slides.internal.v6g.u9 x8 = new com.aspose.slides.internal.v6g.u9(
      "text:level",
      "text:style-name",
      "style:num-format",
      "style:num-letter-sync",
      "style:num-prefix",
      "style:num-suffix",
      "text:display-levels",
      "text:start-value",
      "list-level-properties",
      "text-properties"
   );

   public x8m(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.x8();
      x8m$1 var2 = new x8m$1(this);
      n5(var1, var2);
      n5(var1, new x8m$2(this, var1));
   }

   public x8m() {
      this.x8();
   }

   private void x8() {
      this.u3 = -1;
      this.h0 = 1L;
      this.c8 = 1L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("text:level", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      if (this.l6 != null) {
         var2.l6("text:style-name", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("style:num-format", this.k5);
      }

      if (this.u3 != -1) {
         var2.l6("style:num-letter-sync", this.u3 == 1 ? "true" : "false");
      }

      if (this.a6 != null) {
         var2.l6("style:num-prefix", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("style:num-suffix", this.u9);
      }

      if ((this.h0 & 4294967295L) != 1L) {
         var2.l6("text:display-levels", com.aspose.slides.ms.System.Xml.f4.l6(this.h0));
      }

      if ((this.c8 & 4294967295L) != 1L) {
         var2.l6("text:start-value", com.aspose.slides.ms.System.Xml.f4.l6(this.c8));
      }

      if (this.t2 != null) {
         this.t2.n5("style", var2, "list-level-properties");
      }

      if (this.s7 != null) {
         this.s7.n5("style", var2, "text-properties");
      }

      var2.s7();
   }

   public final j1w n5() {
      if (this.t2 != null) {
         throw new Exception("Only one <list_level_properties> element can be added.");
      }

      this.t2 = new j1w();
      return this.t2;
   }

   public final j9d l6() {
      if (this.s7 != null) {
         throw new Exception("Only one <text_properties> element can be added.");
      }

      this.s7 = new j9d();
      return this.s7;
   }

   public final long k5() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final String u3() {
      return this.k5;
   }

   public final void n5(String var1) {
      this.k5 = var1;
   }

   public final String a6() {
      return this.a6;
   }

   public final void l6(String var1) {
      this.a6 = var1;
   }

   public final String u9() {
      return this.u9;
   }

   public final void k5(String var1) {
      this.u9 = var1;
   }

   public final long h0() {
      return this.c8;
   }

   public final void l6(long var1) {
      this.c8 = var1;
   }

   public final j1w c8() {
      return this.t2;
   }

   public final j9d t2() {
      return this.s7;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 s7() {
      return x8;
   }

   // $VF: synthetic method
   static long n5(x8m var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(x8m var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(x8m var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static byte n5(x8m var0, byte var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String k5(x8m var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String u3(x8m var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static long l6(x8m var0, long var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static long k5(x8m var0, long var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static j1w n5(x8m var0, j1w var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static j9d n5(x8m var0, j9d var1) {
      return var0.s7 = var1;
   }
}
