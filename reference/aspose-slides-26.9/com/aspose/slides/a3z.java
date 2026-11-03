package com.aspose.slides;

class a3z extends v6g {
   private boolean n5;
   private w3 l6;
   private boolean k5;

   public a3z(w3 var1, boolean var2) {
      this.k5 = com.aspose.slides.internal.v6g.k5.l6(var1, l5n.class)
         || com.aspose.slides.internal.v6g.k5.l6(var1, i2z.class)
         || com.aspose.slides.internal.v6g.k5.l6(var1, v3o.class)
         || com.aspose.slides.internal.v6g.k5.l6(var1, i2t.class);
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   protected void n5(z5 var1) {
      if (this.n5) {
         if (this.k5) {
            this.k5(p4.n5(this.l6.n5().k5().c8()));
            this.u3(1.0F);
         } else {
            this.k5(1.0F);
            this.u3(p4.n5(this.l6.n5().k5().c8()));
         }
      } else if (this.k5) {
         this.k5(p4.l6(this.l6.n5().k5().c8()));
         this.u3(1.0F);
      } else {
         this.k5(1.0F);
         this.u3(p4.l6(this.l6.n5().k5().c8()));
      }
   }

   @Override
   protected void l6() {
      if (this.k5) {
         this.l6.n5().n5(this.p8(), this.f2(), this.p8() + this.d2(), this.f2());
      } else {
         this.l6.n5().n5(this.p8(), this.f2(), this.p8(), this.f2() + this.d5());
      }
   }

   public final boolean u3() {
      return this.n5;
   }

   @Override
   protected void u3(z5 var1) {
   }
}
