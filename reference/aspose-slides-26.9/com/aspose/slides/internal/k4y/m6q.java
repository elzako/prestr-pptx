package com.aspose.slides.internal.k4y;

public class m6q extends b3 {
   private int n5;
   private boolean l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("text:key", "text:sort-ascending");

   public m6q(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      m6q$1 var2 = new m6q$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public m6q() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0;
      this.l6 = true;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("text:key", s5n.n5(this.n5));
      if (!this.l6) {
         var2.l6("text:sort-ascending", this.l6 ? "true" : "false");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static int n5(m6q var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(m6q var0, boolean var1) {
      return var0.l6 = var1;
   }
}
