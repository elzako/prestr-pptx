package com.aspose.slides.internal.h2;

public class n5$n5 extends z7$n5 {
   private static final n5$n5$n5 h0 = new n5$n5$n5(null);

   public n5$n5(int var1) {
      super(var1);
   }

   @Override
   public a5 n5(com.aspose.slides.internal.e5.w1 var1, String var2, com.aspose.slides.internal.e5.t9 var3) {
      a5 var4 = super.n5(var1, var2, var3);
      if (var4.t_().size() == 1) {
         h2 var5 = com.aspose.slides.internal.e5.t9.l6(13);
         var4.t_().insertItem(1, var5.n5(var1, "50%", var3));
      }

      return var4;
   }

   @Override
   public com.aspose.slides.internal.f2.a6 l6(com.aspose.slides.internal.e5.w1 var1) {
      return h0;
   }
}
