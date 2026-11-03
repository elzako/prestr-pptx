package com.aspose.slides.internal.k4y;

public class q6s extends b3 {
   private boolean l6;
   private String k5;
   private byte u3;
   private String a6;
   private long u9;
   private int h0;
   private String c8;
   private boolean t2;
   private boolean s7;
   private boolean x8;
   private z3q n3;
   public static final int n5 = w5j.n5("left");
   private static final com.aspose.slides.internal.v6g.u9 y4 = new com.aspose.slides.internal.v6g.u9(
      "text:number-lines",
      "style:num-format",
      "style:num-letter-sync",
      "text:style-name",
      "text:increment",
      "text:number-position",
      "text:offset",
      "text:count-empty-lines",
      "text:count-in-text-boxes",
      "text:restart-on-page",
      "linenumbering-separator"
   );

   public q6s(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      q6s$1 var2 = new q6s$1(this);
      n5(var1, var2);
      n5(var1, new q6s$2(this, var1));
   }

   public q6s() {
      this.l6();
   }

   private void l6() {
      this.l6 = true;
      this.u3 = -1;
      this.u9 = 4294967295L;
      this.h0 = n5;
      this.t2 = true;
      this.s7 = false;
      this.x8 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!this.l6) {
         var2.l6("text:number-lines", this.l6 ? "true" : "false");
      }

      if (this.k5 != null) {
         var2.l6("style:num-format", this.k5);
      }

      if (this.u3 != -1) {
         var2.l6("style:num-letter-sync", this.u3 == 1 ? "true" : "false");
      }

      if (this.a6 != null) {
         var2.l6("text:style-name", this.a6);
      }

      if ((this.u9 & 4294967295L) != 4294967295L) {
         var2.l6("text:increment", com.aspose.slides.ms.System.Xml.f4.l6(this.u9));
      }

      if (this.h0 != n5) {
         var2.l6("text:number-position", w5j.n5(this.h0));
      }

      if (this.c8 != null) {
         var2.l6("text:offset", this.c8);
      }

      if (!this.t2) {
         var2.l6("text:count-empty-lines", this.t2 ? "true" : "false");
      }

      if (this.s7) {
         var2.l6("text:count-in-text-boxes", this.s7 ? "true" : "false");
      }

      if (this.x8) {
         var2.l6("text:restart-on-page", this.x8 ? "true" : "false");
      }

      if (this.n3 != null) {
         this.n3.n5("text", var2, "linenumbering-separator");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return y4;
   }

   // $VF: synthetic method
   static boolean n5(q6s var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String n5(q6s var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static byte n5(q6s var0, byte var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String l6(q6s var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static long n5(q6s var0, long var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static int n5(q6s var0, int var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String k5(q6s var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static boolean l6(q6s var0, boolean var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static boolean k5(q6s var0, boolean var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static boolean u3(q6s var0, boolean var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static z3q n5(q6s var0, z3q var1) {
      return var0.n3 = var1;
   }
}
