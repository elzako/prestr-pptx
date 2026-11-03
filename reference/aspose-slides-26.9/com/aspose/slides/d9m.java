package com.aspose.slides;

class d9m extends y9r {
   public d9m(n1g var1, IChartWall var2) {
      super(var1, var2);
   }

   @Override
   void n5() {
      if (this.l6 != null && this.m1()) {
         l6v var1 = this.q0();
         float var2 = this.h0();
         com.aspose.slides.internal.o9b.y1 var3 = this.n5.o0().y4();
         float var4 = 0.0F;
         if (!this.n5.n3().getRotation3D().getRightAngleAxes()) {
            var4 = this.z3();
         }

         this.n5
            .c8()
            .n5(
               var3.y4(),
               var1,
               new com.aspose.slides.internal.o9b.w1(this.y4(), this.e2()),
               new com.aspose.slides.internal.o9b.w1(this.t9(), this.e2()),
               var2,
               var4
            );
         this.n5
            .c8()
            .n5(
               var3.y4(),
               var1,
               new com.aspose.slides.internal.o9b.w1(this.y4(), this.z1()),
               new com.aspose.slides.internal.o9b.w1(this.t9(), this.z1()),
               var2,
               var4
            );
         this.n5
            .c8()
            .n5(
               var3.y4(),
               var1,
               new com.aspose.slides.internal.o9b.w1(this.y4(), this.e2()),
               new com.aspose.slides.internal.o9b.w1(this.y4(), this.z1()),
               var2,
               var4
            );
         this.n5
            .c8()
            .n5(
               var3.y4(),
               var1,
               new com.aspose.slides.internal.o9b.w1(this.t9(), this.e2()),
               new com.aspose.slides.internal.o9b.w1(this.t9(), this.z1()),
               var2,
               var4
            );
      }
   }
}
