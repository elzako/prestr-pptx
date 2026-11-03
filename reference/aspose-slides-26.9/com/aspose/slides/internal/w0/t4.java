package com.aspose.slides.internal.w0;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.q1;

public class t4 extends com.aspose.slides.internal.v6g.h0<t4> {
   public static final t4 n5 = new t4(0, 0);
   public static final t4 l6 = new t4(1, 1);
   public int k5;
   public int u3;

   public t4() {
   }

   public t4(int var1, int var2) {
      this.k5 = var1;
      this.u3 = var2;
   }

   @Override
   public String toString() {
      return d1.n5("X:{0}, Y:{1}",new Object[]{ this.k5, this.u3});
   }

   public static t4 n5(t4 var0, t4 var1) {
      return new t4(var0.k5 + var1.k5, var0.u3 + var1.u3);
   }

   public static t4 l6(t4 var0, t4 var1) {
      return new t4(var0.k5 - var1.k5, var0.u3 - var1.u3);
   }

   public static t4 k5(t4 var0, t4 var1) {
      return new t4(q1.l6(var0.k5, var1.k5), q1.l6(var0.u3, var1.u3));
   }

   public static t4 u3(t4 var0, t4 var1) {
      return new t4(q1.n5(var0.k5, var1.k5), q1.n5(var0.u3, var1.u3));
   }

   public static t4 n5(t4 var0, t4 var1, t4 var2) {
      return k5(u3(var0.n5(), var1.n5()).n5(), var2.n5());
   }

   public void n5(t4 var1) {
      var1.k5 = this.k5;
      var1.u3 = this.u3;
   }

   public t4 n5() {
      t4 var1 = new t4();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(t4 var1) {
      return var1.k5 == this.k5 && var1.u3 == this.u3;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof t4) ? false : this.l6((t4)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public t4 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(t4 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
