package com.aspose.slides.internal.k4y;

public class g3s extends b3 {
   private t5p n5;
   private p8i l6;
   private p8i k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("rubyPr", "rt", "rubyBase");

   public g3s(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new g3s$1(this, var1));
   }

   public g3s() {
      this.n5 = new t5p();
      this.l6 = new p8i();
      this.k5 = new p8i();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("w", var2, "rubyPr");
      this.l6.n5("w", var2, "rt");
      this.k5.n5("w", var2, "rubyBase");
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static t5p n5(g3s var0, t5p var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static p8i n5(g3s var0, p8i var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static p8i l6(g3s var0, p8i var1) {
      return var0.k5 = var1;
   }
}
