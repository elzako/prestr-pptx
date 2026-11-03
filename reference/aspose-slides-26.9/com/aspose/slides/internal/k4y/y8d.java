package com.aspose.slides.internal.k4y;

public class y8d extends b3 {
   private g7 n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("extremeValue", "number", "percent");

   public y8d(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new y8d$1(this, var1));
   }

   public y8d() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         switch (l6.n5(this.n5.n5())) {
            case 0:
               ((i4u)this.n5.k5()).n5("cx", var2, this.n5.n5());
               break;
            case 1:
               ((x9f)this.n5.k5()).n5("cx", var2, this.n5.n5());
               break;
            case 2:
               ((m0a)this.n5.k5()).n5("cx", var2, this.n5.n5());
         }
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return l6;
   }

   // $VF: synthetic method
   static g7 n5(y8d var0, g7 var1) {
      return var0.n5 = var1;
   }
}
