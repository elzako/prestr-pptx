package com.aspose.slides.internal.k4y;

public class l4e extends b3 {
   private String n5;
   private long l6;
   private long k5;
   private long u3;
   private byte a6;
   private byte u9;
   private l0k h0;
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9(
      "name", "xfId", "builtinId", "iLevel", "hidden", "customBuiltin", "extLst"
   );

   public l4e(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      l4e$1 var2 = new l4e$1(this);
      n5(var1, var2);
      n5(var1, new l4e$2(this, var1));
   }

   public l4e() {
      this.l6();
   }

   private void l6() {
      this.k5 = 4294967295L;
      this.u3 = 4294967295L;
      this.a6 = -1;
      this.u9 = -1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("name", this.n5);
      }

      var2.l6("xfId", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      if ((this.k5 & 4294967295L) != 4294967295L) {
         var2.l6("builtinId", com.aspose.slides.ms.System.Xml.f4.l6(this.k5));
      }

      if ((this.u3 & 4294967295L) != 4294967295L) {
         var2.l6("iLevel", com.aspose.slides.ms.System.Xml.f4.l6(this.u3));
      }

      if (this.a6 != -1) {
         var2.l6("hidden", this.a6 == 1 ? "1" : "0");
      }

      if (this.u9 != -1) {
         var2.l6("customBuiltin", this.u9 == 1 ? "1" : "0");
      }

      if (this.h0 != null) {
         this.h0.n5("ssml", var2, "extLst");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return c8;
   }

   // $VF: synthetic method
   static String n5(l4e var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static long n5(l4e var0, long var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static long l6(l4e var0, long var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static long k5(l4e var0, long var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static byte n5(l4e var0, byte var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static byte l6(l4e var0, byte var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static l0k n5(l4e var0, l0k var1) {
      return var0.h0 = var1;
   }
}
