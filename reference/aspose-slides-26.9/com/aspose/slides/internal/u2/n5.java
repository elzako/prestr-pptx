package com.aspose.slides.internal.u2;

import com.aspose.slides.internal.v6g.h0;
import com.aspose.slides.ms.System.a7;
import com.aspose.slides.ms.System.c3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.l4;

public class n5 extends h0<n5> {
   private long n5;
   private int l6;
   private int k5;
   private long u3;

   public n5() {
   }

   public n5(long var1, int var3, int var4, long var5) {
      this();
      this.n5(var1);
      this.n5(var3);
      this.l6(var4);
      this.l6(var5);
   }

   public final long n5() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final int l6() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.l6 = var1;
   }

   public final int k5() {
      return this.k5;
   }

   public final void l6(int var1) {
      this.k5 = var1;
   }

   public final long u3() {
      return this.u3;
   }

   public final void l6(long var1) {
      this.u3 = var1;
   }

   @Override
   public String toString() {
      long var1 = 281474976710655L;
      int var3 = (int)(this.u3() >> 12 & 65535L);
      long var4 = this.u3() & 281474976710655L;
      return d1.n5("{{{0}-{1}-{2}-{3}-{4}}}",new Object[]{ l4.n5(this.n5(), "X8"), c3.n5(this.l6(), "X4"), c3.n5(this.k5(), "X4"), c3.n5(var3, "X4"), a7.n5(var4, "X12")});
   }

   public final boolean n5(n5 var1) {
      return this.n5() == var1.n5() && this.l6() == var1.l6() && this.k5() == var1.k5() && this.u3() == var1.u3();
   }

   public void l6(n5 var1) {
   }

   public n5 a6() {
      n5 var1 = new n5();
      this.l6(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.a6();
   }

   private boolean k5(n5 var1) {
      return true;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof n5) ? false : this.k5((n5)obj);
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
      this.l6(bridgeArg0);
   }

}
