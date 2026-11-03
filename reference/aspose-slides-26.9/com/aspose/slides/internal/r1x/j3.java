package com.aspose.slides.internal.r1x;

public class j3 implements com.aspose.slides.internal.b8u.n3, com.aspose.slides.internal.b8u.x8 {
   private final int n5;
   private final com.aspose.slides.internal.b8u.x8 l6;
   private final int k5;

   public j3(int var1, int var2, com.aspose.slides.internal.b8u.x8 var3) {
      this.k5 = var1;
      this.n5 = var2;
      this.l6 = var3;
   }

   @Override
   public final void n5(com.aspose.slides.internal.o9b.y2 var1, int[] var2, com.aspose.slides.internal.o9b.j5 var3, com.aspose.slides.internal.o9b.j5 var4) {
      for (int var5 = 0; var5 < var2.length; var5++) {
         if (var2[var5] == this.k5 || var2[var5] == 0) {
            var2[var5] = this.n5;
         }
      }

      this.l6.n5(var1.n3(), var2, var3.k5(), var4.k5());
   }

   @Override
   public final long n5(long var1) {
      long var3 = 0L;
      com.aspose.slides.internal.b8u.n3 var5 = com.aspose.slides.internal.v6g.k5.n5(this.l6, com.aspose.slides.internal.b8u.n3.class);
      if (var5 != null) {
         var3 += var5.n5(var1);
      }

      return var3;
   }
}
