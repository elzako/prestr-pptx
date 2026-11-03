package com.aspose.slides.internal.g7;

public class a6$n5 extends com.aspose.slides.internal.v6g.h0<a6$n5> {
   public short n5;
   public short l6;
   public short k5;
   public short u3;
   public int a6;

   public void n5(a6$n5 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
   }

   public a6$n5 n5() {
      a6$n5 var1 = new a6$n5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(a6$n5 var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6 && var1.k5 == this.k5 && var1.u3 == this.u3 && var1.a6 == this.a6;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof a6$n5) ? false : this.l6((a6$n5)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public a6$n5 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(a6$n5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
