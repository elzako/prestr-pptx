package com.aspose.slides.ms.System.Xml;

class b0$h0 extends com.aspose.slides.internal.v6g.h0<b0$h0> {
   public char[] n5;
   public int l6;
   public int k5;
   public com.aspose.slides.internal.l7h.j5 u3;
   public boolean a6;
   public com.aspose.slides.internal.z0k.t4 u9;
   public com.aspose.slides.internal.l7h.u9 h0;
   public byte[] c8;
   public int t2;
   public int s7;
   public com.aspose.slides.internal.z0k.y1 x8;
   public int n3;
   public int y4;
   public String e2;
   public com.aspose.slides.ms.System.r8 t9;
   public boolean z1;
   public boolean t4;
   public o0 q0;
   public int z3;
   public boolean m1;
   public boolean k7;
   private static final com.aspose.slides.internal.v6g.u9 m3 = new com.aspose.slides.internal.v6g.u9(
      "utf-16", "utf-16BE", "space", "lang", "preserve", "default"
   );

   public b0$h0() {
   }

   public final void n5() {
      this.n5 = null;
      this.l6 = 0;
      this.k5 = 0;
      this.u3 = null;
      this.u9 = null;
      this.h0 = null;
      this.c8 = null;
      this.t2 = 0;
      this.s7 = 0;
      this.x8 = null;
      this.n3 = 1;
      this.y4 = -1;
      this.e2 = com.aspose.slides.ms.System.d1.n5;
      this.t9 = null;
      this.z1 = false;
      this.t4 = false;
      this.m1 = true;
      this.k7 = false;
   }

   public final void n5(boolean var1) {
      if (var1) {
         if (this.u9 != null) {
            this.u9.close();
         } else if (this.x8 != null) {
            this.x8.u3();
         }
      }
   }

   public final int l6() {
      return this.n3;
   }

   public final int k5() {
      return this.l6 - this.y4;
   }

   public void n5(b0$h0 var1) {
      var1 = var1 == null ? new b0$h0() : var1;
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
      var1.t9 = this.t9;
      var1.z1 = this.z1;
      var1.t4 = this.t4;
      var1.q0 = this.q0;
      var1.z3 = this.z3;
      var1.m1 = this.m1;
      var1.k7 = this.k7;
   }

   public b0$h0 u3() {
      b0$h0 var1 = new b0$h0();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.u3();
   }

   private boolean l6(b0$h0 var1) {
      return com.aspose.slides.ms.System.j8.n5(var1.n5, this.n5)
         && var1.l6 == this.l6
         && var1.k5 == this.k5
         && com.aspose.slides.ms.System.j8.n5(var1.u3, this.u3)
         && var1.a6 == this.a6
         && com.aspose.slides.ms.System.j8.n5(var1.u9, this.u9)
         && com.aspose.slides.ms.System.j8.n5(var1.h0, this.h0)
         && com.aspose.slides.ms.System.j8.n5(var1.c8, this.c8)
         && var1.t2 == this.t2
         && var1.s7 == this.s7
         && com.aspose.slides.ms.System.j8.n5(var1.x8, this.x8)
         && var1.n3 == this.n3
         && var1.y4 == this.y4
         && com.aspose.slides.ms.System.j8.n5(var1.e2, this.e2)
         && com.aspose.slides.ms.System.j8.n5(var1.t9, this.t9)
         && var1.z1 == this.z1
         && var1.t4 == this.t4
         && com.aspose.slides.ms.System.j8.n5(var1.q0, this.q0)
         && var1.z3 == this.z3
         && var1.m1 == this.m1
         && var1.k7 == this.k7;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof b0$h0) ? false : this.l6((b0$h0)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public b0$h0 Clone() {
      return this.u3();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(b0$h0 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
