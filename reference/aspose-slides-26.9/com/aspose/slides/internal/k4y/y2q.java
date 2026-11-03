package com.aspose.slides.internal.k4y;

public class y2q extends b3 {
   private String n5;
   private g7 l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("text:id", "insertion", "deletion", "format-change");

   public y2q(com.aspose.slides.ms.System.Xml.c7 var1) {
      y2q$1 var2 = new y2q$1(this);
      n5(var1, var2);
      n5(var1, new y2q$2(this, var1));
   }

   public y2q() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("text:id", this.n5);
      if (this.l6 != null) {
         switch (k5.n5(this.l6.n5())) {
            case 1:
               ((u4y)this.l6.k5()).n5("text", var2, this.l6.n5());
               break;
            case 2:
               ((w9f)this.l6.k5()).n5("text", var2, this.l6.n5());
               break;
            case 3:
               ((z3h)this.l6.k5()).n5("text", var2, this.l6.n5());
         }
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(y2q var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static g7 n5(y2q var0, g7 var1) {
      return var0.l6 = var1;
   }
}
