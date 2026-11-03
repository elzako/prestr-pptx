package com.aspose.slides.internal.g7;

public class r7 extends com.aspose.slides.internal.v6g.h0<r7> {
   private int n5;
   private int l6;

   public final int n5() {
      return this.n5;
   }

   private void n5(int var1) {
      this.n5 = var1;
   }

   public final int l6() {
      return this.l6;
   }

   private void l6(int var1) {
      this.l6 = var1;
   }

   public static r7 n5(long var0) {
      r7 var2 = new r7();
      var2.l6((int)(var0 & 65535L));
      var2.n5((int)((var0 & 4294967295L) >> 16 & 4294967295L & 65535L));
      return var2;
   }

   public void n5(r7 var1) {
      var1.n5(this.n5());
      var1.l6(this.l6());
   }

   public r7 k5() {
      r7 var1 = new r7();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.k5();
   }

   private boolean l6(r7 var1) {
      return var1.n5() == this.n5() && var1.l6() == this.l6();
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof r7) ? false : this.l6((r7)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public r7 Clone() {
      return this.k5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(r7 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
