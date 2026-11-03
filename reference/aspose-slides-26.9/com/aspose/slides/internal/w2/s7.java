package com.aspose.slides.internal.w2;

import com.aspose.slides.ms.System.j8;

public class s7 extends com.aspose.slides.internal.v6g.h0<s7> {
   public String n5;
   public String l6;
   public String k5;
   public String u3;
   public String a6;

   public void n5(s7 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
   }

   public s7 n5() {
      s7 var1 = new s7();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(s7 var1) {
      return j8.n5(var1.n5, this.n5) && j8.n5(var1.l6, this.l6) && j8.n5(var1.k5, this.k5) && j8.n5(var1.u3, this.u3) && j8.n5(var1.a6, this.a6);
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof s7) ? false : this.l6((s7)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public s7 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(s7 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
