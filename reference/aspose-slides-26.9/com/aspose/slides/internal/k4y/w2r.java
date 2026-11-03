package com.aspose.slides.internal.k4y;

public class w2r extends b3 {
   private int n5;
   private int l6;
   private int k5;
   private g7 u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "w_FldCharType", "w_FldLock", "w_Dirty", "fldData", "ffData", "numberingChange"
   );

   public w2r(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      w2r$1 var2 = new w2r$1(this);
      n5(var1, var2);
      n5(var1, new w2r$2(this, var1));
   }

   public w2r() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0;
      this.l6 = 0;
      this.k5 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("w:fldCharType", s1s.n5(this.n5));
      if (this.l6 != 0) {
         var2.l6("w:fldLock", h5k.n5(this.l6));
      }

      if (this.k5 != 0) {
         var2.l6("w:dirty", h5k.n5(this.k5));
      }

      if (this.u3 != null) {
         switch (a6.n5(this.u3.n5())) {
            case 3:
               ((t5l)this.u3.k5()).n5("w", var2, this.u3.n5());
               break;
            case 4:
               ((h6e)this.u3.k5()).n5("w", var2, this.u3.n5());
               break;
            case 5:
               ((d6a)this.u3.k5()).n5("w", var2, this.u3.n5());
         }
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return a6;
   }

   // $VF: synthetic method
   static int n5(w2r var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int l6(w2r var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int k5(w2r var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static g7 n5(w2r var0, g7 var1) {
      return var0.u3 = var1;
   }
}
