package com.aspose.slides;

import com.aspose.slides.exceptions.NotSupportedException;

class f0w {
   private final IPortionFormat n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("t");

   public f0w() {
      this.n5 = null;
   }

   public f0w(IPortionFormat var1) {
      this.n5 = var1;
   }

   public final y0v n5(com.aspose.slides.internal.k4y.g7 var1) {
      String var2 = var1.n5();
      int var3 = com.aspose.slides.ms.System.d1.k5(var1.n5(), ':');
      if (var3 != -1) {
         var2 = com.aspose.slides.ms.System.d1.k5(var1.n5(), var3 + 1);
      }

      switch (l6.n5(var2)) {
         case 0:
            com.aspose.slides.internal.k4y.t9f var4 = (com.aspose.slides.internal.k4y.t9f)var1.k5();
            return k2n.n5(var4);
         default:
            throw new NotSupportedException(com.aspose.slides.ms.System.d1.n5("The type {0} not yet supported", new Object[]{var1.n5()}));
      }
   }

   public final com.aspose.slides.internal.k4y.g7 n5(y0v var1) {
      String var2 = e5m.n5((o6z)var1);
      switch (l6.n5(var2)) {
         case 0:
            String var3 = com.aspose.slides.ms.System.d1.n5("m:{0}", new Object[]{var2});
            o6z var4 = (o6z)var1;
            return new com.aspose.slides.internal.k4y.g7(var3, k2n.n5(var4, this.n5));
         default:
            throw new NotSupportedException(com.aspose.slides.ms.System.d1.n5("The type {0} not yet supported", new Object[]{var2}));
      }
   }
}
