package com.aspose.slides.internal.k4y;

public class u7c extends b3 {
   private String n5;
   private f1c l6;
   private t5g k5;
   private v7u u3;
   private j2 a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "name", "fillStyleLst", "lnStyleLst", "effectStyleLst", "bgFillStyleLst"
   );

   public u7c(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.h0();
      u7c$1 var2 = new u7c$1(this);
      n5(var1, var2);
      n5(var1, new u7c$2(this, var1));
   }

   public u7c() {
      this.h0();
      this.l6 = new f1c();
      this.k5 = new t5g();
      this.u3 = new v7u();
      this.a6 = new j2();
   }

   private void h0() {
      this.n5 = "";
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!"".equals(this.n5)) {
         var2.l6("name", this.n5);
      }

      this.l6.n5("a", var2, "fillStyleLst");
      this.k5.n5("a", var2, "lnStyleLst");
      this.u3.n5("a", var2, "effectStyleLst");
      this.a6.n5("a", var2, "bgFillStyleLst");
      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final f1c l6() {
      return this.l6;
   }

   public final t5g k5() {
      return this.k5;
   }

   public final v7u u3() {
      return this.u3;
   }

   public final j2 a6() {
      return this.a6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u9() {
      return u9;
   }

   // $VF: synthetic method
   static String n5(u7c var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static f1c n5(u7c var0, f1c var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static t5g n5(u7c var0, t5g var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static v7u n5(u7c var0, v7u var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static j2 n5(u7c var0, j2 var1) {
      return var0.a6 = var1;
   }
}
