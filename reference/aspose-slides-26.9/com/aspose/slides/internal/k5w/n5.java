package com.aspose.slides.internal.k5w;

import com.aspose.slides.internal.v6g.h0;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.f0;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.p3;

public class n5 extends h0<n5> {
   private int n5;
   private short l6;
   private short k5;
   private long u3;

   public n5() {
   }

   public n5(int var1, short var2, short var3, long var4) {
      this();
      this.n5(var1);
      this.n5(var2);
      this.l6(var3);
      this.n5(var4);
   }

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final short l6() {
      return this.l6;
   }

   public final void n5(short var1) {
      this.l6 = var1;
   }

   public final short k5() {
      return this.k5;
   }

   public final void l6(short var1) {
      this.k5 = var1;
   }

   public final long u3() {
      return this.u3;
   }

   public final void n5(long var1) {
      this.u3 = var1;
   }

   @Override
   public String toString() {
      long var1 = 281474976710655L;
      short var3 = (short)(this.u3() >> 12);
      long var4 = this.u3() & 281474976710655L;
      return d1.n5("{{{0}-{1}-{2}-{3}-{4}}}",new Object[]{ a3.n5(this.n5(), "X8"), f0.n5(this.l6(), "X4"), f0.n5(this.k5(), "X4"), f0.n5(var3, "X4"), p3.n5(var4, "X12")});
   }

   public void n5(n5 var1) {
      if (var1 == null) {
         new n5();
      }
   }

   public n5 a6() {
      n5 var1 = new n5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.a6();
   }

   private boolean l6(n5 var1) {
      return true;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof n5) ? false : this.l6((n5)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public n5 Clone() {
      return this.a6();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(n5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
