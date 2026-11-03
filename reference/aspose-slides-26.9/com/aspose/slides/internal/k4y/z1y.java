package com.aspose.slides.internal.k4y;

public class z1y extends b3 {
   private int l6;
   private l2q k5;
   private l2q u3;
   private g7 a6;
   private v9y u9;
   public static final int n5 = k0f.n5("twoCell");
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "editAs", "from", "to", "sp", "grpSp", "graphicFrame", "cxnSp", "pic", "clientData"
   );

   public z1y(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      z1y$1 var2 = new z1y$1(this);
      n5(var1, var2);
      n5(var1, new z1y$2(this, var1));
   }

   public z1y() {
      this.a6();
      this.k5 = new l2q();
      this.u3 = new l2q();
      this.u9 = new v9y();
   }

   private void a6() {
      this.l6 = n5;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != n5) {
         var2.l6("editAs", k0f.n5(this.l6));
      }

      this.k5.n5("xdr", var2, "from");
      this.u3.n5("xdr", var2, "to");
      if (this.a6 != null) {
         switch (h0.n5(this.a6.n5())) {
            case 3:
               ((j5z)this.a6.k5()).n5("xdr", var2, this.a6.n5());
               break;
            case 4:
               ((p0q)this.a6.k5()).n5("xdr", var2, this.a6.n5());
               break;
            case 5:
               ((h0m)this.a6.k5()).n5("xdr", var2, this.a6.n5());
               break;
            case 6:
               ((h1z)this.a6.k5()).n5("xdr", var2, this.a6.n5());
               break;
            case 7:
               ((b3w)this.a6.k5()).n5("xdr", var2, this.a6.n5());
         }
      }

      this.u9.n5("xdr", var2, "clientData");
      var2.s7();
   }

   public final l2q n5() {
      return this.k5;
   }

   public final l2q l6() {
      return this.u3;
   }

   public final g7 k5() {
      return this.a6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return h0;
   }

   // $VF: synthetic method
   static int n5(z1y var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static l2q n5(z1y var0, l2q var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static l2q l6(z1y var0, l2q var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static g7 n5(z1y var0, g7 var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static v9y n5(z1y var0, v9y var1) {
      return var0.u9 = var1;
   }
}
