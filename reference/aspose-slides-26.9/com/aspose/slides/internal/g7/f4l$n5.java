package com.aspose.slides.internal.g7;

public class f4l$n5 extends com.aspose.slides.internal.v6g.h0<f4l$n5> {
   public byte n5;
   public byte l6;
   public byte k5;
   public int u3;
   public int a6;
   public boolean u9;
   public boolean h0;

   public void n5(f4l$n5 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
      var1.u9 = this.u9;
      var1.h0 = this.h0;
   }

   public f4l$n5 n5() {
      f4l$n5 var1 = new f4l$n5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(f4l$n5 var1) {
      return var1.n5 == this.n5
         && var1.l6 == this.l6
         && var1.k5 == this.k5
         && var1.u3 == this.u3
         && var1.a6 == this.a6
         && var1.u9 == this.u9
         && var1.h0 == this.h0;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof f4l$n5) ? false : this.l6((f4l$n5)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public f4l$n5 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(f4l$n5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
