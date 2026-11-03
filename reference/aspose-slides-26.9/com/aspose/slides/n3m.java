package com.aspose.slides;

class n3m extends com.aspose.slides.internal.k2s.u9 {
   private final h7g c8;
   private com.aspose.slides.internal.k2s.a6 t2 = null;
   private float s7;
   private float x8;
   private AutoShape n3;

   public n3m(h7g var1) {
      super(var1.n5(), var1.l6(), var1.k5(), var1.u3());
      this.c8 = var1;
   }

   @Override
   protected com.aspose.slides.internal.k2s.k5 n5(com.aspose.slides.internal.k2s.a6 var1, com.aspose.slides.internal.k2s.l6 var2) {
      return new w5g(var2, var1);
   }

   @Override
   protected com.aspose.slides.internal.k2s.h0 n5(com.aspose.slides.internal.k2s.a6 var1, com.aspose.slides.internal.p1s.l6 var2) {
      if (var1.s7) {
         var1.a6 /= 1.3F;
         var1.c8 = com.aspose.slides.ms.System.d1.t2(var1.c8);
         var2 = new com.aspose.slides.internal.p1s.l6(var1.a6, var2.l6(), var2.n5());
      }

      return new com.aspose.slides.internal.n8e.a7(var2, var1);
   }

   @Override
   protected void n5(com.aspose.slides.internal.i1k.u9 var1, com.aspose.slides.internal.o9b.f2 var2) {
   }

   final float n5() {
      return this.n5;
   }

   final float l6() {
      return this.l6;
   }

   @Override
   protected void n5(
      com.aspose.slides.internal.d0e.t2 var1,
      String var2,
      com.aspose.slides.internal.o9b.f2 var3,
      com.aspose.slides.internal.k2s.a6 var4,
      com.aspose.slides.internal.k2s.n5 var5,
      boolean var6
   ) {
      if (!var6) {
         this.n5(var1, var5);
         if (this.n3 != null && this.x8 == this.l6 && this.t2.n5(var4)) {
            this.c8.n5(this.n3, this, var1, com.aspose.slides.ms.System.d1.n5(new String[]{" ", var2}), var4, var5);
         } else {
            this.n3 = this.c8.n5(this, var1, var2, var4, var5);
         }
      }

      this.t2 = var4;
      this.s7 = this.n5;
      this.x8 = this.l6;
   }
}
