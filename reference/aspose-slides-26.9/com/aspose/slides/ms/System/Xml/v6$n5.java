package com.aspose.slides.ms.System.Xml;

class v6$n5 extends com.aspose.slides.internal.v6g.h0<v6$n5> {
   private int n5;
   private String l6;
   private String k5;
   private String u3;
   private Object a6;

   public v6$n5() {
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final void n5(int var1, String var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public final void n5(int var1, String var2, String var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   public final void n5(int var1, String var2, String var3, String var4) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
   }

   public final void n5(int var1, String var2, String var3, String var4, Object var5) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
      this.a6 = var5;
   }

   public final void n5(int var1, Object var2) {
      this.n5 = var1;
      this.a6 = var2;
   }

   public final int n5() {
      return this.n5;
   }

   public final String l6() {
      return this.l6;
   }

   public final String k5() {
      return this.k5;
   }

   public final String u3() {
      return this.u3;
   }

   public final Object a6() {
      return this.a6;
   }

   public void n5(v6$n5 var1) {
      var1 = var1 == null ? new v6$n5() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
   }

   public v6$n5 u9() {
      v6$n5 var1 = new v6$n5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.u9();
   }

   private boolean l6(v6$n5 var1) {
      return var1.n5 == this.n5
         && com.aspose.slides.ms.System.j8.n5(var1.l6, this.l6)
         && com.aspose.slides.ms.System.j8.n5(var1.k5, this.k5)
         && com.aspose.slides.ms.System.j8.n5(var1.u3, this.u3)
         && com.aspose.slides.ms.System.j8.n5(var1.a6, this.a6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof v6$n5) ? false : this.l6((v6$n5)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public v6$n5 Clone() {
      return this.u9();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(v6$n5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
