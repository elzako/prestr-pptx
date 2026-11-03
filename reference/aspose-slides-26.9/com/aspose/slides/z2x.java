package com.aspose.slides;

class z2x implements IPresentationComponent, r0g {
   private r0g n5;
   private IPresentationComponent l6;
   private v0e k5 = new v0e();
   private c4p u3;
   private x6q a6;
   private x6q u9;
   private x6q h0;
   private x6q c8;
   private x6q t2;
   private x6q s7;
   private x6q x8;
   private x6q n3;
   private x6q y4;
   private x6q e2;
   private x6q t9;
   private x6q z1;
   private x6q t4;
   private c7e q0;
   private c7e z3;
   private c7e m1;
   private c7e k7;
   private c7e m3;
   private c7e z8;
   private c7e j5;
   private c7e w1;
   private c7e r4;
   private c7e c4;
   private c7e y2;
   private c7e y1;
   private c7e a0;

   z2x(r0g var1, com.aspose.slides.ms.System.o0 var2, String var3) {
      this.n5 = var1;
      this.n5().n5(var2.k5());
      this.n5().n5(var3);
      this.u3 = new c4p(this);
      this.a6 = new x6q(this);
      this.u9 = new x6q(this);
      this.h0 = new x6q(this);
      this.c8 = new x6q(this);
      this.t2 = new x6q(this);
      this.s7 = new x6q(this);
      this.x8 = new x6q(this);
      this.n3 = new x6q(this);
      this.y4 = new x6q(this);
      this.e2 = new x6q(this);
      this.t9 = new x6q(this);
      this.z1 = new x6q(this);
      this.t4 = new x6q(this);
      this.q0 = new c7e(this);
      this.z3 = new c7e(this);
      this.m1 = new c7e(this);
      this.k7 = new c7e(this);
      this.m3 = new c7e(this);
      this.z8 = new c7e(this);
      this.j5 = new c7e(this);
      this.w1 = new c7e(this);
      this.r4 = new c7e(this);
      this.c4 = new c7e(this);
      this.y2 = new c7e(this);
      this.y1 = new c7e(this);
      this.a0 = new c7e(this);
   }

   final v0e n5() {
      return this.k5;
   }

   @Override
   public final IPresentation getPresentation() {
      return this.y1().getPresentation();
   }

   final c4p l6() {
      return this.u3;
   }

   final x6q k5() {
      return this.a6;
   }

   final x6q u3() {
      return this.u9;
   }

   final x6q a6() {
      return this.h0;
   }

   final x6q u9() {
      return this.c8;
   }

   final x6q h0() {
      return this.t2;
   }

   final x6q c8() {
      return this.s7;
   }

   final x6q t2() {
      return this.x8;
   }

   final x6q s7() {
      return this.n3;
   }

   final x6q x8() {
      return this.y4;
   }

   final x6q n3() {
      return this.e2;
   }

   final x6q y4() {
      return this.t9;
   }

   final x6q e2() {
      return this.z1;
   }

   final x6q t9() {
      return this.t4;
   }

   final c7e z1() {
      return this.q0;
   }

   final c7e t4() {
      return this.z3;
   }

   final c7e q0() {
      return this.m1;
   }

   final c7e z3() {
      return this.k7;
   }

   final c7e m1() {
      return this.m3;
   }

   final c7e k7() {
      return this.z8;
   }

   final c7e m3() {
      return this.j5;
   }

   final c7e z8() {
      return this.w1;
   }

   final c7e j5() {
      return this.r4;
   }

   final c7e w1() {
      return this.c4;
   }

   final c7e r4() {
      return this.y2;
   }

   final c7e c4() {
      return this.y1;
   }

   final c7e y2() {
      return this.a0;
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.n5;
   }

   final IPresentationComponent y1() {
      if (this.l6 == null) {
         IPresentationComponent[] var1 = new IPresentationComponent[]{this.l6};
         d0u.n5(IPresentationComponent.class, this.n5, var1);
         this.l6 = var1[0];
      }

      return this.l6;
   }
}
