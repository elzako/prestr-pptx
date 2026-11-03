package com.aspose.slides.internal.t5;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

public class n3 extends x8 {
   private byte[] n5;
   private String l6;
   private String k5;
   private String u3;

   public n3(x8 var1) {
      this.n5(var1.n5());
      this.l6(var1.l6());
      this.k5(var1.k5());
      this.u3(var1.u3());
      this.a6(var1.u9());
      this.n5(var1.h0());
      this.l6(var1.c8());
      this.k5(var1.t2());
      this.u3(var1.s7());
      this.a6(var1.x8());
      this.u9(var1.n3());
      this.h0(var1.y4());
      this.n5(var1.e2());
      this.n5(var1.t9());
   }

   public final String t4() {
      return this.l6;
   }

   public final void l6(String var1) {
      this.l6 = var1;
   }

   public final String q0() {
      return this.k5;
   }

   public final void k5(String var1) {
      this.k5 = var1;
   }

   public final String z3() {
      return this.u3;
   }

   public final void u3(String var1) {
      this.u3 = var1;
   }

   public final byte[] m1() {
      return this.n5;
   }

   public final void n5(byte[] var1) {
      this.n5 = var1;
   }

   @Override
   public String toString() {
      return d1.n5("{0}, FullName: {1}, Style: {2}, Script: {3}",new Object[]{ super.toString(), this.t4(), this.q0(), this.z3()});
   }

   protected final boolean n5(n3 var1) {
      return super.n5(var1) && d1.a6(this.l6, var1.l6) && d1.a6(this.k5, var1.k5) && d1.a6(this.u3, var1.u3);
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != j8.n5(this) ? false : this.n5((n3)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      var1 = var1 * 397 ^ (this.l6 != null ? this.l6.hashCode() : 0);
      var1 = var1 * 397 ^ (this.k5 != null ? this.k5.hashCode() : 0);
      return var1 * 397 ^ (this.u3 != null ? this.u3.hashCode() : 0);
   }
}
