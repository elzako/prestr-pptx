package com.aspose.slides.internal.k4y;

public class n4z extends b3 {
   private long n5;
   private long l6;
   private long k5;
   private long u3;
   private q8g a6;
   private f9y u9;
   private c4t h0;
   private k2p c8;
   private l7h t2;
   private static final com.aspose.slides.internal.v6g.u9 s7 = new com.aspose.slides.internal.v6g.u9(
      "distT", "distB", "distL", "distR", "extent", "effectExtent", "docPr", "cNvGraphicFramePr", "graphic"
   );

   public n4z(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      n4z$1 var2 = new n4z$1(this);
      n5(var1, var2);
      n5(var1, new n4z$2(this, var1));
   }

   public n4z() {
      this.l6();
      this.a6 = new q8g();
      this.h0 = new c4t();
      this.t2 = new l7h();
   }

   private void l6() {
      this.n5 = 4294967295L;
      this.l6 = 4294967295L;
      this.k5 = 4294967295L;
      this.u3 = 4294967295L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if ((this.n5 & 4294967295L) != 4294967295L) {
         var2.l6("distT", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      }

      if ((this.l6 & 4294967295L) != 4294967295L) {
         var2.l6("distB", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      }

      if ((this.k5 & 4294967295L) != 4294967295L) {
         var2.l6("distL", com.aspose.slides.ms.System.Xml.f4.l6(this.k5));
      }

      if ((this.u3 & 4294967295L) != 4294967295L) {
         var2.l6("distR", com.aspose.slides.ms.System.Xml.f4.l6(this.u3));
      }

      this.a6.n5("wp", var2, "extent");
      if (this.u9 != null) {
         this.u9.n5("wp", var2, "effectExtent");
      }

      this.h0.n5("wp", var2, "docPr");
      if (this.c8 != null) {
         this.c8.n5("wp", var2, "cNvGraphicFramePr");
      }

      this.t2.n5("a", var2, "graphic");
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return s7;
   }

   // $VF: synthetic method
   static long n5(n4z var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static long l6(n4z var0, long var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static long k5(n4z var0, long var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static long u3(n4z var0, long var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static q8g n5(n4z var0, q8g var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static f9y n5(n4z var0, f9y var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static c4t n5(n4z var0, c4t var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static k2p n5(n4z var0, k2p var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static l7h n5(n4z var0, l7h var1) {
      return var0.t2 = var1;
   }
}
