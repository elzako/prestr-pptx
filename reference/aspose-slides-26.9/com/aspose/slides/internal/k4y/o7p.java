package com.aspose.slides.internal.k4y;

public class o7p extends b3 {
   private w2i n5;
   private q8g l6;
   private g7 k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9(
      "from", "ext", "sp", "grpSp", "graphicFrame", "cxnSp", "pic"
   );

   public o7p(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new o7p$1(this, var1));
   }

   public o7p() {
      this.n5 = new w2i();
      this.l6 = new q8g();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("cdr", var2, "from");
      this.l6.n5("cdr", var2, "ext");
      if (this.k5 != null) {
         switch (u3.n5(this.k5.n5())) {
            case 2:
               ((p5w)this.k5.k5()).n5("cdr", var2, this.k5.n5());
               break;
            case 3:
               ((u7q)this.k5.k5()).n5("cdr", var2, this.k5.n5());
               break;
            case 4:
               ((g7i)this.k5.k5()).n5("cdr", var2, this.k5.n5());
               break;
            case 5:
               ((a3p)this.k5.k5()).n5("cdr", var2, this.k5.n5());
               break;
            case 6:
               ((d8y)this.k5.k5()).n5("cdr", var2, this.k5.n5());
         }
      }

      var2.s7();
   }

   public final w2i n5() {
      return this.n5;
   }

   public final q8g l6() {
      return this.l6;
   }

   public final g7 k5() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return u3;
   }

   // $VF: synthetic method
   static w2i n5(o7p var0, w2i var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static q8g n5(o7p var0, q8g var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static g7 n5(o7p var0, g7 var1) {
      return var0.k5 = var1;
   }
}
