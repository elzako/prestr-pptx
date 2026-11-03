package com.aspose.slides;

class x5e implements Comparable<x5e> {
   private String n5;
   private int l6;
   private int k5;

   x5e(String var1, int var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   final String n5() {
      return this.n5;
   }

   final int l6() {
      return this.l6;
   }

   final void n5(int var1) {
      this.l6 = var1;
   }

   final int k5() {
      return this.k5;
   }

   final void l6(int var1) {
      this.k5 = var1;
   }

   public final int n5(x5e var1) {
      if (var1.l6() == this.l6()) {
         return 0;
      } else {
         return var1.l6() > this.l6() ? 1 : -1;
      }
   }

   @Override
   public boolean equals(Object obj) {
      if (obj == null) {
         return false;
      }

      if (!(obj instanceof x5e)) {
         return false;
      }

      x5e var2 = (x5e)obj;
      return com.aspose.slides.ms.System.d1.a6(this.n5(), var2.n5());
   }

   @Override
   public int hashCode() {
      return this.n5.hashCode();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int compareTo(x5e bridgeArg0) {
      return this.n5(bridgeArg0);
   }

}
