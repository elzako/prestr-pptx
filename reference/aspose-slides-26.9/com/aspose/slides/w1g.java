package com.aspose.slides;

class w1g extends com.aspose.slides.internal.v6g.h0<w1g> {
   public int n5;
   public int l6;
   public int k5;
   public int u3;
   public float a6;
   public boolean u9;
   public boolean h0;
   public int c8;
   public boolean t2;
   public boolean s7;
   public int x8;
   public float n3;
   public float y4;
   public boolean e2;

   public w1g() {
   }

   public void n5(w1g var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
      var1.u9 = this.u9;
      var1.h0 = this.h0;
      var1.c8 = this.c8;
      var1.t2 = this.t2;
      var1.s7 = this.s7;
      var1.x8 = this.x8;
      var1.n3 = this.n3;
      var1.y4 = this.y4;
      var1.e2 = this.e2;
   }

   public w1g n5() {
      w1g var1 = new w1g();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(w1g var1) {
      return var1.n5 == this.n5
         && var1.l6 == this.l6
         && var1.k5 == this.k5
         && var1.u3 == this.u3
         && var1.a6 == this.a6
         && var1.u9 == this.u9
         && var1.h0 == this.h0
         && var1.c8 == this.c8
         && var1.t2 == this.t2
         && var1.s7 == this.s7
         && var1.x8 == this.x8
         && var1.n3 == this.n3
         && var1.y4 == this.y4
         && var1.e2 == this.e2;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof w1g) ? false : this.l6((w1g)obj);
      }
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.internal.n2d.q0.n5(
         this.n5, this.l6, this.k5, this.u3, this.a6, this.u9, this.h0, this.c8, this.t2, this.s7, this.x8, this.n3, this.y4, this.e2
      );
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public w1g Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(w1g bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
