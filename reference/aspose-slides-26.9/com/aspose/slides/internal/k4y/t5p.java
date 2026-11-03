package com.aspose.slides.internal.k4y;

public class t5p extends b3 {
   private u3j n5;
   private l9i l6;
   private l9i k5;
   private l9i u3;
   private c3k a6;
   private a5j u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "rubyAlign", "hps", "hpsRaise", "hpsBaseText", "lid", "dirty"
   );

   public t5p(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new t5p$1(this, var1));
   }

   public t5p() {
      this.n5 = new u3j();
      this.l6 = new l9i();
      this.k5 = new l9i();
      this.u3 = new l9i();
      this.a6 = new c3k();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("w", var2, "rubyAlign");
      this.l6.n5("w", var2, "hps");
      this.k5.n5("w", var2, "hpsRaise");
      this.u3.n5("w", var2, "hpsBaseText");
      this.a6.n5("w", var2, "lid");
      if (this.u9 != null) {
         this.u9.n5("w", var2, "dirty");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return h0;
   }

   // $VF: synthetic method
   static u3j n5(t5p var0, u3j var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static l9i n5(t5p var0, l9i var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static l9i l6(t5p var0, l9i var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static l9i k5(t5p var0, l9i var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static c3k n5(t5p var0, c3k var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static a5j n5(t5p var0, a5j var1) {
      return var0.u9 = var1;
   }
}
