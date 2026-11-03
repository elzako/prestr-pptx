package com.aspose.slides.internal.k4y;

public class q6c extends b3 {
   private boolean n5;
   private x7n l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("loop", "snd");

   public q6c(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      q6c$1 var2 = new q6c$1(this);
      n5(var1, var2);
      n5(var1, new q6c$2(this, var1));
   }

   public q6c() {
      this.u3();
      this.l6 = new x7n();
   }

   private void u3() {
      this.n5 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5) {
         var2.l6("loop", this.n5 ? "1" : "0");
      }

      this.l6.n5("p", var2, "snd");
      var2.s7();
   }

   public final boolean n5() {
      return this.n5;
   }

   public final void n5(boolean var1) {
      this.n5 = var1;
   }

   public final x7n l6() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return k5;
   }

   // $VF: synthetic method
   static boolean n5(q6c var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static x7n n5(q6c var0, x7n var1) {
      return var0.l6 = var1;
   }
}
