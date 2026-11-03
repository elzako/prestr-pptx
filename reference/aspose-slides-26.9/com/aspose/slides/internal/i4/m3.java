package com.aspose.slides.internal.i4;

public class m3 extends u6 {
   private j9 u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("String", "Number", "Boolean");

   public m3(j9 var1) {
      super(var1);
      this.u3 = var1;
   }

   @Override
   public g7 n5(w2 var1, y1 var2, g7[] var3) {
      switch (a6.n5(var3[0].u3())) {
         case 0:
            var1.l6(this.u3.w1().n5((double)(com.aspose.slides.ms.System.d1.u9(var3[0].toString(), var3[1].toString()))));
            return l5.n5;
         case 1:
            var1.l6(this.u3.w1().n5((double)(com.aspose.slides.ms.System.d2.n5(var3[0].l6(), var3[1].l6()))));
            return l5.n5;
         case 2:
            var1.l6(this.u3.w1().n5((double)(com.aspose.slides.ms.System.n3.n5(var3[0].n5(), var3[1].n5()))));
            return l5.n5;
         default:
            return super.n5(var1, var2, var3);
      }
   }
}
