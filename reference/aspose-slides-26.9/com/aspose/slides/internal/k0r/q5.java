package com.aspose.slides.internal.k0r;

public class q5 extends g6 {
   private q9 l6 = null;
   p1 n5 = null;
   private r3 k5;
   private m9 u3;
   private a9 a6;
   private c9 u9 = null;
   private d3 h0 = null;
   private static final int[] c8 = new int[]{
      61449,
      Integer.MAX_VALUE,
      61450,
      Integer.MAX_VALUE,
      61725,
      Integer.MAX_VALUE,
      61451,
      Integer.MAX_VALUE,
      61729,
      Integer.MAX_VALUE,
      61730,
      Integer.MAX_VALUE,
      61455,
      Integer.MAX_VALUE,
      61456,
      Integer.MAX_VALUE,
      61457,
      Integer.MAX_VALUE,
      61453,
      Integer.MAX_VALUE,
      61729,
      Integer.MAX_VALUE,
      61730,
      Integer.MAX_VALUE
   };

   public q5() {
      super(61444);
   }

   @Override
   public q9 l6() {
      if (this.l6 != null) {
         return this.l6;
      }

      this.l6 = com.aspose.slides.internal.v6g.k5.n5(this.k5(61449), q9.class);
      if (this.l6 == null && this.n3()) {
         this.l6 = new q9();
         this.n5(this.l6);
      }

      return this.l6;
   }

   @Override
   public p1 u3() {
      if (this.n5 != null) {
         return this.n5;
      }

      this.n5 = com.aspose.slides.internal.v6g.k5.n5(this.k5(61450), p1.class);
      if (this.n5 == null && this.n3()) {
         this.n5 = new p1();
         this.n5(this.n5);
      }

      return this.n5;
   }

   @Override
   public r3 a6() {
      if (this.k5 == null) {
         this.k5 = com.aspose.slides.internal.v6g.k5.n5(this.k5(61451), r3.class);
         if (this.k5 == null && this.n3()) {
            this.k5 = new r3();
            this.n5(this.k5);
         }
      }

      return this.k5;
   }

   public void n5(r3 var1) {
      this.k5 = com.aspose.slides.internal.v6g.k5.n5(this.k5(61451), r3.class);
      if (this.k5 != null) {
         this.e2().removeItem(this.k5);
      }

      this.k5 = var1;
      if (this.k5 != null) {
         this.n5((e6r)this.k5);
      }
   }

   @Override
   public m9 u9() {
      if (this.u3 == null) {
         this.u3 = com.aspose.slides.internal.v6g.k5.n5(this.k5(61729), m9.class);
         if (this.u3 == null && this.n3()) {
            this.u3 = new m9();
            this.n5(this.u3);
         }
      }

      return this.u3;
   }

   @Override
   public a9 h0() {
      if (this.a6 == null) {
         this.a6 = com.aspose.slides.internal.v6g.k5.n5(this.k5(61730), a9.class);
         if (this.a6 == null && this.n3()) {
            this.a6 = new a9();
            this.n5(this.a6);
         }
      }

      return this.a6;
   }

   @Override
   public v7 c8() {
      return com.aspose.slides.internal.v6g.k5.n5(this.k5(61455), v7.class);
   }

   @Override
   public t7 t2() {
      return com.aspose.slides.internal.v6g.k5.n5(this.k5(61456), t7.class);
   }

   @Override
   public c9 s7() {
      if (this.u9 != null) {
         return this.u9;
      }

      this.u9 = com.aspose.slides.internal.v6g.k5.n5(this.k5(61457), c9.class);
      if (this.u9 == null && this.n3()) {
         this.u9 = new c9();
         this.u9.l6(true);
         this.n5(this.u9);
      }

      return this.u9;
   }

   public final d3 x8() {
      if (this.h0 != null) {
         return this.h0;
      }

      this.h0 = com.aspose.slides.internal.v6g.k5.n5(this.k5(61453), d3.class);
      if (this.h0 == null && this.n3()) {
         this.h0 = new d3();
         this.n5(this.h0);
      }

      return this.h0;
   }

   public final int t9() {
      r3 var1 = this.a6();
      if (var1 != null) {
         z5 var2 = com.aspose.slides.internal.v6g.k5.n5(var1.l6().n5(260), z5.class);
         if (var2 != null) {
            return (int)var2.j5();
         }
      }

      return 0;
   }

   @Override
   protected int[] k5() {
      return c8;
   }

   @Override
   public void y4() {
      this.u9 = null;
      this.h0 = null;
   }
}
