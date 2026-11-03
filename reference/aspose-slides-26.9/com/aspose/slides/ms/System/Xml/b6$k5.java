package com.aspose.slides.ms.System.Xml;

class b6$k5 extends com.aspose.slides.internal.v6g.h0<b6$k5> {
   public int n5;
   public String l6;
   public String k5;
   public String u3;
   public int a6;
   public String u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9("space", "lang");

   public b6$k5() {
   }

   public final void n5(String var1, String var2, String var3, int var4) {
      this.n5 = var4;
      this.l6 = var1;
      this.u3 = var3;
      this.k5 = var2;
      this.a6 = -1;
      this.u9 = null;
   }

   public final void n5(v9 var1) {
      var1.l6(this.l6, this.k5, this.u3);
   }

   public final void l6(v9 var1) {
      var1.k5(this.l6, this.k5, this.u3);
   }

   public void n5(b6$k5 var1) {
      var1 = var1 == null ? new b6$k5() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
      var1.u9 = this.u9;
   }

   public b6$k5 n5() {
      b6$k5 var1 = new b6$k5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(b6$k5 var1) {
      return var1.n5 == this.n5
         && com.aspose.slides.ms.System.j8.n5(var1.l6, this.l6)
         && com.aspose.slides.ms.System.j8.n5(var1.k5, this.k5)
         && com.aspose.slides.ms.System.j8.n5(var1.u3, this.u3)
         && var1.a6 == this.a6
         && com.aspose.slides.ms.System.j8.n5(var1.u9, this.u9);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof b6$k5) ? false : this.l6((b6$k5)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public b6$k5 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(b6$k5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
