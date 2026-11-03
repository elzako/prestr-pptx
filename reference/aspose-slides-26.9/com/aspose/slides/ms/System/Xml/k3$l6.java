package com.aspose.slides.ms.System.Xml;

class k3$l6 extends com.aspose.slides.internal.v6g.h0<k3$l6> {
   public String n5;
   public String l6;
   public String k5;
   public int u3;
   public int a6;
   public String u9;
   public int h0;
   public int c8;
   public boolean t2;

   public k3$l6() {
   }

   public final void n5(int var1) {
      this.n5 = null;
      this.k5 = com.aspose.slides.ms.System.d1.n5;
      this.u3 = 0;
      this.a6 = 0;
      this.u9 = null;
      this.h0 = var1;
      this.c8 = 0;
      this.t2 = false;
   }

   public void n5(k3$l6 var1) {
      var1 = var1 == null ? new k3$l6() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
      var1.u9 = this.u9;
      var1.h0 = this.h0;
      var1.c8 = this.c8;
      var1.t2 = this.t2;
   }

   public k3$l6 n5() {
      k3$l6 var1 = new k3$l6();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(k3$l6 var1) {
      return com.aspose.slides.ms.System.j8.n5(var1.n5, this.n5)
         && com.aspose.slides.ms.System.j8.n5(var1.l6, this.l6)
         && com.aspose.slides.ms.System.j8.n5(var1.k5, this.k5)
         && var1.u3 == this.u3
         && var1.a6 == this.a6
         && com.aspose.slides.ms.System.j8.n5(var1.u9, this.u9)
         && var1.h0 == this.h0
         && var1.c8 == this.c8
         && var1.t2 == this.t2;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof k3$l6) ? false : this.l6((k3$l6)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public k3$l6 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(k3$l6 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
