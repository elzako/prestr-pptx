package com.aspose.slides.internal.b8n;

import com.aspose.slides.internal.b5j.n3;
import com.aspose.slides.internal.b5j.x8;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.ms.System.d1;

public class a6 extends com.aspose.slides.internal.k2s.u9 {
   private float c8 = 0.0F;
   private n5 t2;
   private u3 s7;
   private com.aspose.slides.internal.e1.t2 x8;

   public final void n5(float var1) {
      this.c8 = var1;
   }

   public final void n5(com.aspose.slides.internal.e1.t2 var1) {
      this.x8 = var1;
   }

   public a6(u3 var1, n5 var2, x8 var3, n3 var4, com.aspose.slides.internal.b5j.u9 var5, com.aspose.slides.internal.b5j.u3 var6) {
      super(var3, var4, var5, var6);
      this.s7 = var1;
      this.t2 = var2;
   }

   @Override
   protected com.aspose.slides.internal.k2s.k5 n5(com.aspose.slides.internal.k2s.a6 var1, com.aspose.slides.internal.k2s.l6 var2) {
      return new c8(this.x8, this.s7, this.a6, var2, var1);
   }

   @Override
   protected com.aspose.slides.internal.k2s.h0 n5(com.aspose.slides.internal.k2s.a6 var1, com.aspose.slides.internal.p1s.l6 var2) {
      if (var1.s7) {
         var1.a6 /= 1.3F;
         var1.c8 = d1.t2(var1.c8);
         var2 = new com.aspose.slides.internal.p1s.l6(var1.a6, var2.l6(), var2.n5());
      }

      return new s7(this.x8, var2, var1, this.t2.n5());
   }

   @Override
   protected void n5(com.aspose.slides.internal.i1k.u9 var1, f2 var2) {
      this.s7.n5(var1, this.x8, var2.a6(), true);
   }
}
