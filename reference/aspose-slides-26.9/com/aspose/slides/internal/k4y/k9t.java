package com.aspose.slides.internal.k4y;

public class k9t extends b3 {
   private int n5;
   private int l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("w_CustomMarkFollows", "w_Id");

   public k9t(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      k9t$1 var2 = new k9t$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public k9t() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0) {
         var2.l6("w:customMarkFollows", h5k.n5(this.n5));
      }

      var2.l6("w:id", com.aspose.slides.ms.System.Xml.f4.n5(this.l6));
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static int n5(k9t var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int l6(k9t var0, int var1) {
      return var0.l6 = var1;
   }
}
