package com.aspose.slides.internal.g7;

public class e6a$n5 extends com.aspose.slides.internal.v6g.h0<e6a$n5> {
   private int n5;
   private short l6;

   public e6a$n5() {
   }

   public e6a$n5(int var1, short var2) {
      this.n5(var2);
      this.n5(var1);
   }

   public final int n5() {
      return this.n5;
   }

   private void n5(int var1) {
      this.n5 = var1;
   }

   public final short l6() {
      return this.l6;
   }

   private void n5(short var1) {
      this.l6 = var1;
   }

   public void n5(e6a$n5 var1) {
      var1.n5(this.n5());
      var1.n5(this.l6());
   }

   public e6a$n5 k5() {
      e6a$n5 var1 = new e6a$n5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.k5();
   }

   private boolean l6(e6a$n5 var1) {
      return var1.n5() == this.n5() && var1.l6() == this.l6();
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof e6a$n5) ? false : this.l6((e6a$n5)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public e6a$n5 Clone() {
      return this.k5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(e6a$n5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
