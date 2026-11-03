package com.aspose.slides.internal.k4y;

public class q7p extends b3 {
   private l6m n5;
   private int l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("i", "annotation");

   public q7p(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      q7p$1 var2 = new q7p$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public q7p() {
      this.l6();
   }

   private void l6() {
      this.l6 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("i", this.n5.n5());
      }

      if (this.l6 != 0) {
         var2.l6("annotation", m4w.n5(this.l6));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static l6m n5(q7p var0, l6m var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int n5(q7p var0, int var1) {
      return var0.l6 = var1;
   }
}
