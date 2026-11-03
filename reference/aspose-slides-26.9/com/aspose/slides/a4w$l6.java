package com.aspose.slides;

import com.aspose.slides.ms.System.IDisposable;

final class a4w$l6 implements IDisposable {
   com.aspose.slides.internal.k9.u9 n5;
   com.aspose.slides.internal.k9.u9 l6;
   com.aspose.slides.internal.o9b.p8 k5 = new com.aspose.slides.internal.o9b.p8();
   com.aspose.slides.internal.o9b.y1 u3 = new com.aspose.slides.internal.o9b.y1();
   boolean a6;
   com.aspose.slides.internal.j9e.x8 u9;

   public a4w$l6(
      com.aspose.slides.internal.k9.u9 var1,
      com.aspose.slides.internal.k9.u9 var2,
      com.aspose.slides.internal.o9b.p8 var3,
      com.aspose.slides.internal.o9b.y1 var4,
      boolean var5,
      com.aspose.slides.internal.j9e.x8 var6
   ) {
      this.n5 = var1;
      this.l6 = var2;
      var3.k5(this.k5);
      var4.a6(this.u3);
      this.u9 = var6;
      this.a6 = var5;
   }

   public final com.aspose.slides.internal.k9.u9 n5() {
      com.aspose.slides.internal.k9.u9 var1 = this.n5;
      if (var1 == null) {
         var1 = this.l6;
      }

      return var1;
   }

   @Override
   public final void dispose() {
      if (this.n5 != null) {
         this.n5.k5().dispose();
      }
   }
}
