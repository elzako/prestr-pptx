package com.aspose.slides.internal.r1x;

public class u9 extends com.aspose.slides.internal.v6g.h0<u9> {
   public byte[] n5;
   public int l6;
   public int k5;
   public String u3;
   public int a6;

   public void n5(u9 var1) {
      var1 = var1 == null ? new u9() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
   }

   public u9 n5() {
      u9 var1 = new u9();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(u9 var1) {
      return com.aspose.slides.ms.System.j8.n5(var1.n5, this.n5)
         && var1.l6 == this.l6
         && var1.k5 == this.k5
         && com.aspose.slides.ms.System.j8.n5(var1.u3, this.u3)
         && var1.a6 == this.a6;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof u9) ? false : this.l6((u9)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public u9 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(u9 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
