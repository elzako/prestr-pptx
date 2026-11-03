package com.aspose.slides;

class Connector$l6 extends com.aspose.slides.internal.v6g.h0<Connector$l6> {
   private float n5;
   private float l6;
   private float k5;
   private float u3;

   public Connector$l6() {
   }

   public final float n5() {
      return this.n5;
   }

   public final float l6() {
      return this.l6;
   }

   public final float k5() {
      return this.k5;
   }

   public final float u3() {
      return this.u3;
   }

   public final float a6() {
      return com.aspose.slides.ms.System.q1.l6(this.n5(), this.k5());
   }

   public final float u9() {
      return com.aspose.slides.ms.System.q1.l6(this.l6(), this.u3());
   }

   public final float h0() {
      return com.aspose.slides.ms.System.q1.n5(this.k5() - this.n5());
   }

   public final float c8() {
      return com.aspose.slides.ms.System.q1.n5(this.u3() - this.l6());
   }

   public final com.aspose.slides.internal.o9b.w1 t2() {
      return new com.aspose.slides.internal.o9b.w1(this.a6() + this.h0() / 2.0F, this.u9() + this.c8() / 2.0F);
   }

   public final com.aspose.slides.internal.o9b.w1 s7() {
      return new com.aspose.slides.internal.o9b.w1(this.n5(), this.l6());
   }

   public final com.aspose.slides.internal.o9b.w1 x8() {
      return new com.aspose.slides.internal.o9b.w1(this.k5(), this.u3());
   }

   public final float n3() {
      return this.h0() == 0.0F ? 1.0F : this.h0();
   }

   public final float y4() {
      return this.c8() == 0.0F ? 1.0F : this.c8();
   }

   public final double e2() {
      return 100000.0F / this.n3();
   }

   public final double t9() {
      return 100000.0F / this.y4();
   }

   public Connector$l6(com.aspose.slides.internal.o9b.w1 var1, com.aspose.slides.internal.o9b.w1 var2) {
      this.n5 = var1.l6();
      this.l6 = var1.k5();
      this.k5 = var2.l6();
      this.u3 = var2.k5();
   }

   public final Connector$l6 n5(com.aspose.slides.internal.x4g.m1 var1) {
      com.aspose.slides.internal.o9b.w1[] var2 = new com.aspose.slides.internal.o9b.w1[]{this.s7(), this.x8()};
      var1.n5(var2);
      return new Connector$l6(var2[0].u3(), var2[1].u3());
   }

   public void n5(Connector$l6 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
   }

   public Connector$l6 z1() {
      Connector$l6 var1 = new Connector$l6();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.z1();
   }

   private boolean l6(Connector$l6 var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6 && var1.k5 == this.k5 && var1.u3 == this.u3;
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.internal.n2d.q0.n5(this.n5, this.l6, this.k5, this.u3);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof Connector$l6) ? false : this.l6((Connector$l6)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public Connector$l6 Clone() {
      return this.z1();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(Connector$l6 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
