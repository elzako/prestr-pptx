package com.aspose.slides.internal.b6;

public class k5 extends u3 {
   @Override
   public void l6(com.aspose.slides.internal.i3.v4 var1, com.aspose.slides.internal.o9b.z1 var2, com.aspose.slides.internal.g1.u9 var3) {
      com.aspose.slides.internal.i3.u3 var4 = (com.aspose.slides.internal.i3.u3)var1;
      com.aspose.slides.internal.o9b.y2 var5 = new com.aspose.slides.internal.o9b.y2(var4.k5(), var4.l6(), var4.t2(), var4.t2());
      com.aspose.slides.internal.o9b.y2 var6 = new com.aspose.slides.internal.o9b.y2(var4.u9(), var4.u3(), var4.t2(), var4.t2());
      long var7 = var4.n5();
      com.aspose.slides.internal.o9b.l6 var9 = this.l6(var4.x8(), var4.s7(), var3);
      this.n5(var7, var9, var5.n3(), var6.n3(), var4.x8(), var2, var3);
   }

   private com.aspose.slides.internal.o9b.l6 l6(boolean var1, com.aspose.slides.internal.k1.l6 var2, com.aspose.slides.internal.g1.u9 var3) {
      if (var1) {
         return var2.t2();
      }

      com.aspose.slides.internal.o9b.l6 var4 = new com.aspose.slides.internal.o9b.l6(var3.y1(), var3.a0());
      com.aspose.slides.internal.o9b.z1 var5 = com.aspose.slides.internal.o9b.z1.n5(var4);

      try {
         var5.a6(1);
         var5.k5(7);
         var5.n5(var3.z3(), new com.aspose.slides.internal.o9b.y2(0, 0, var3.y1(), var3.a0()));
      } finally {
         if (var5 != null) {
            var5.dispose();
         }
      }

      return var4;
   }
}
