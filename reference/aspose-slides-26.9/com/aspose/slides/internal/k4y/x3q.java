package com.aspose.slides.internal.k4y;

public class x3q extends b3 {
   private boolean l6;
   private boolean k5;
   private boolean u3;
   private boolean a6;
   private boolean u9;
   private int h0;
   private long c8;
   private long t2;
   public static final int n5 = j6s.n5("800x600");
   private static final com.aspose.slides.internal.v6g.u9 s7 = new com.aspose.slides.internal.v6g.u9(
      "css", "thicket", "longFileNames", "vml", "allowPng", "targetScreenSize", "dpi", "codePage"
   );

   public x3q(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      x3q$1 var2 = new x3q$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public x3q() {
      this.l6();
   }

   private void l6() {
      this.l6 = true;
      this.k5 = true;
      this.u3 = true;
      this.a6 = false;
      this.u9 = false;
      this.h0 = n5;
      this.c8 = 96L;
      this.t2 = 4294967295L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!this.l6) {
         var2.l6("css", this.l6 ? "1" : "0");
      }

      if (!this.k5) {
         var2.l6("thicket", this.k5 ? "1" : "0");
      }

      if (!this.u3) {
         var2.l6("longFileNames", this.u3 ? "1" : "0");
      }

      if (this.a6) {
         var2.l6("vml", this.a6 ? "1" : "0");
      }

      if (this.u9) {
         var2.l6("allowPng", this.u9 ? "1" : "0");
      }

      if (this.h0 != n5) {
         var2.l6("targetScreenSize", j6s.n5(this.h0));
      }

      if ((this.c8 & 4294967295L) != 96L) {
         var2.l6("dpi", com.aspose.slides.ms.System.Xml.f4.l6(this.c8));
      }

      if ((this.t2 & 4294967295L) != 4294967295L) {
         var2.l6("codePage", com.aspose.slides.ms.System.Xml.f4.l6(this.t2));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return s7;
   }

   // $VF: synthetic method
   static boolean n5(x3q var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean l6(x3q var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean k5(x3q var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean u3(x3q var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean a6(x3q var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static int n5(x3q var0, int var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static long n5(x3q var0, long var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static long l6(x3q var0, long var1) {
      return var0.t2 = var1;
   }
}
