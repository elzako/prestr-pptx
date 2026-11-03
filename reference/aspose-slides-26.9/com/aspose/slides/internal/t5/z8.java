package com.aspose.slides.internal.t5;

import com.aspose.slides.ms.System.c3;
import com.aspose.slides.ms.System.j8;

public class z8 extends q0 {
   private int n5;
   private int l6;
   private int k5;
   private int u3;
   private int a6;
   private int u9;

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final int l6() {
      return this.l6;
   }

   public final void l6(int var1) {
      this.l6 = var1;
   }

   public final int k5() {
      return this.k5;
   }

   public final void k5(int var1) {
      this.k5 = var1;
   }

   public final int u3() {
      return this.u3;
   }

   public final void u3(int var1) {
      this.u3 = var1;
   }

   public final int u9() {
      return this.a6;
   }

   public final void a6(int var1) {
      this.a6 = var1;
   }

   public final int h0() {
      return this.u9;
   }

   public final void u9(int var1) {
      this.u9 = var1;
   }

   protected final boolean n5(z8 var1) {
      return this.n5 == var1.n5 && this.l6 == var1.l6 && this.k5 == var1.k5 && this.u3 == var1.u3 && this.a6 == var1.a6 && this.u9 == var1.u9;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != j8.n5(this) ? false : this.n5((z8)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.n5;
      var1 = var1 * 397 ^ this.l6;
      var1 = var1 * 397 ^ c3.n5(this.k5);
      var1 = var1 * 397 ^ c3.n5(this.u3);
      var1 = var1 * 397 ^ c3.n5(this.a6);
      return var1 * 397 ^ c3.n5(this.u9);
   }
}
