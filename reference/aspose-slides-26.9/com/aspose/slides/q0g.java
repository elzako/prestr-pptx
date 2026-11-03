package com.aspose.slides;

class q0g extends v6g {
   private final z4d n5 = new z4d();
   private final z4d l6 = new z4d();
   private final g3y k5;

   q0g(g3y var1) {
      this.k5 = var1;
   }

   @Override
   protected void n5(z5 var1) {
      this.k5(var1.n5());
      this.u3(var1.l6());
      this.n5.n3(var1);
      this.l6.n3(var1);
   }

   @Override
   protected void l6(z5 var1) {
      for (v6g var5 : this.a0()) {
         var5.t1();
      }
   }

   @Override
   protected void l6() {
      com.aspose.slides.internal.x4g.s7 var1 = new com.aspose.slides.internal.x4g.s7();

      try {
         var1.n5(
            new com.aspose.slides.internal.o9b.w1(this.p8() + this.n5.p8(), this.f2() + this.n5.f2()),
            new com.aspose.slides.internal.o9b.w1(this.p8() + this.l6.p8(), this.f2() + this.l6.f2())
         );
         com.aspose.slides.internal.x4g.s7 var2 = (com.aspose.slides.internal.x4g.s7)var1.deepClone();
         this.k5.t2().d2().n5(var2, this.c8(), new a1v(com.aspose.slides.internal.o9b.c8.u3.o8()));
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   public final z4d u3() {
      return this.n5;
   }

   public final z4d a6() {
      return this.l6;
   }

   private com.aspose.slides.internal.o9b.c8 h0() {
      com.aspose.slides.internal.o9b.c8 var1 = this.k5.t2().n3().n5((byte)0).o8();
      w5k.n5(var1.o8(), 0.75).n5(var1);
      return com.aspose.slides.internal.o9b.c8.n5(255, var1.o8());
   }

   private l6v c8() {
      float var1 = 0.1F;
      LineFormat var2 = (LineFormat)this.k5.u9().getFormat().getLine();
      if (var2 == null) {
         return new l6v(this.h0().o8(), 0.1F);
      } else if (var2.getFillFormat().getFillType() == -1) {
         return new l6v(this.h0().o8(), 0.1F);
      } else {
         return var2.getFillFormat().getFillType() == 0 ? new l6v(this.h0().o8(), 0.1F) : w5k.l6(this.h0().o8(), var2, this.k5.t2(), 0.1F);
      }
   }
}
