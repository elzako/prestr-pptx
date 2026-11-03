package com.aspose.slides.internal.k0r;

public final class m5l implements Comparable<m5l> {
   private short l6;
   private int k5;
   k3h n5;

   public m5l(short var1, int var2) {
      this.l6 = var1;
      this.k5 = var2;
   }

   public final short n5() {
      return this.l6;
   }

   final k3h l6() {
      return this.n5;
   }

   final void n5(k3h var1) {
      this.n5 = var1;
   }

   public final int k5() {
      return this.k5;
   }

   m5l(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5(var1);
   }

   final void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.l6 = var1.k7();
      this.k5 = var1.r4() & 65535;
   }

   final void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.l6);
      var1.n5(this.k5 & 65535);
   }

   public final int n5(m5l var1) {
      return com.aspose.slides.ms.System.f0.n5(this.n5(), var1.n5());
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int compareTo(m5l bridgeArg0) {
      return this.n5(bridgeArg0);
   }

}
