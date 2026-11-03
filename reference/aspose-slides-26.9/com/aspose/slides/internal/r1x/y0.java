package com.aspose.slides.internal.r1x;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.d1;

public class y0 extends q0 implements com.aspose.slides.internal.b8u.x8 {
   private final com.aspose.slides.internal.b8u.x8 n5;
   private final f0 l6;

   public y0(f0 var1, com.aspose.slides.internal.b8u.x8 var2) {
      this.n5 = var2;
      this.l6 = var1;
      this.n5();
   }

   @Override
   public final void n5(com.aspose.slides.internal.o9b.y2 var1, int[] var2, com.aspose.slides.internal.o9b.j5 var3, com.aspose.slides.internal.o9b.j5 var4) {
      if (var2 == null) {
         throw new ArgumentNullException("pixels");
      }

      if (com.aspose.slides.internal.o9b.j5.n5(var3, var1.a6())) {
         throw new ArgumentOutOfRangeException("start", "Start point should correspond to rectangle location. Other values currently not supported.");
      }

      if (com.aspose.slides.internal.o9b.j5.n5(var4, new com.aspose.slides.internal.o9b.j5(var1.u9(), var1.n5()))) {
         throw new ArgumentOutOfRangeException("end", "End point should correspond to rectangle right bottom point. Other values currently not supported.");
      }

      int var5 = var1.t2() * var1.l6();
      if (var2.length < var5) {
         throw new ArgumentOutOfRangeException(
            "pixels",
            d1.n5(new String[]{
               "The pixels array cannot have less values than specified rectangle. Expected at least ",
               com.aspose.slides.ms.System.a3.l6(var5),
               " integer values."
            })
         );
      }

      com.aspose.slides.internal.b8u.x8 var6 = this.n5;

      while (com.aspose.slides.internal.v6g.k5.l6(var6, y0.class)) {
         var6 = com.aspose.slides.internal.v6g.k5.n5(var6, y0.class).n5;
      }

      var6.n5(var1.n3(), var2, var3.k5(), var4.k5());
   }

   @Override
   protected void a6() {
      super.a6();
   }

   private void n5() {
   }
}
