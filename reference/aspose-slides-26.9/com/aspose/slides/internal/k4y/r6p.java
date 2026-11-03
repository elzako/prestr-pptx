package com.aspose.slides.internal.k4y;

public class r6p extends b3 {
   private l2q n5;
   private q8g l6;
   private g7 k5;
   private v9y u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "from", "ext", "sp", "grpSp", "graphicFrame", "cxnSp", "pic", "clientData"
   );

   public r6p(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new r6p$1(this, var1));
   }

   public r6p() {
      this.n5 = new l2q();
      this.l6 = new q8g();
      this.u3 = new v9y();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("xdr", var2, "from");
      this.l6.n5("xdr", var2, "ext");
      if (this.k5 != null) {
         switch (a6.n5(this.k5.n5())) {
            case 2:
               ((j5z)this.k5.k5()).n5("xdr", var2, this.k5.n5());
               break;
            case 3:
               ((p0q)this.k5.k5()).n5("xdr", var2, this.k5.n5());
               break;
            case 4:
               ((h0m)this.k5.k5()).n5("xdr", var2, this.k5.n5());
               break;
            case 5:
               ((h1z)this.k5.k5()).n5("xdr", var2, this.k5.n5());
               break;
            case 6:
               ((b3w)this.k5.k5()).n5("xdr", var2, this.k5.n5());
         }
      }

      this.u3.n5("xdr", var2, "clientData");
      var2.s7();
   }

   public final q8g n5() {
      return this.l6;
   }

   public final g7 l6() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return a6;
   }

   // $VF: synthetic method
   static l2q n5(r6p var0, l2q var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static q8g n5(r6p var0, q8g var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static g7 n5(r6p var0, g7 var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static v9y n5(r6p var0, v9y var1) {
      return var0.u3 = var1;
   }
}
