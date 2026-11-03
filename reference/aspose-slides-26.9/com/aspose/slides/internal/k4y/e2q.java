package com.aspose.slides.internal.k4y;

public class e2q extends b3 {
   private long n5;
   private String l6;
   private byte k5;
   private long u3;
   private String a6;
   private g7 u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "text:level", "text:style-name", "text:continue-numbering", "text:start-value", "number", "p", "h"
   );

   public e2q(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      e2q$1 var2 = new e2q$1(this);
      n5(var1, var2);
      n5(var1, new e2q$2(this, var1));
   }

   public e2q() {
      this.l6();
   }

   private void l6() {
      this.n5 = 1L;
      this.k5 = -1;
      this.u3 = 4294967295L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if ((this.n5 & 4294967295L) != 1L) {
         var2.l6("text:level", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      }

      if (this.l6 != null) {
         var2.l6("text:style-name", this.l6);
      }

      if (this.k5 != -1) {
         var2.l6("text:continue-numbering", this.k5 == 1 ? "true" : "false");
      }

      if ((this.u3 & 4294967295L) != 4294967295L) {
         var2.l6("text:start-value", com.aspose.slides.ms.System.Xml.f4.l6(this.u3));
      }

      if (this.a6 != null) {
         this.n5("text", var2, "number", this.a6, false);
      }

      if (this.u9 != null) {
         switch (h0.n5(this.u9.n5())) {
            case 5:
               ((u1x)this.u9.k5()).n5("text", var2, this.u9.n5());
               break;
            case 6:
               ((m2v)this.u9.k5()).n5("text", var2, this.u9.n5());
         }
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return h0;
   }

   // $VF: synthetic method
   static long n5(e2q var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(e2q var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static byte n5(e2q var0, byte var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static long l6(e2q var0, long var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String l6(e2q var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String n5(e2q var0) {
      return var0.a6;
   }

   // $VF: synthetic method
   static g7 n5(e2q var0, g7 var1) {
      return var0.u9 = var1;
   }
}
