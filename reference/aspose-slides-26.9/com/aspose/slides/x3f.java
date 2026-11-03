package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class x3f implements com.aspose.slides.ms.System.a5<x3f>, w1j {
   private int n5;
   private boolean l6;
   private boolean k5;
   private int u3;
   private long a6;
   private final s7u u9;

   @Override
   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   @Override
   public final boolean l6() {
      return this.l6;
   }

   public final void n5(boolean var1) {
      this.l6 = var1;
   }

   @Override
   public final boolean k5() {
      return this.k5;
   }

   public final void l6(boolean var1) {
      this.k5 = var1;
   }

   @Override
   public final int u3() {
      return this.u3;
   }

   public final void l6(int var1) {
      this.u3 = var1;
   }

   @Override
   public final long a6() {
      return this.a6;
   }

   public final void n5(long var1) {
      this.a6 = var1;
   }

   final s7u u9() {
      return this.u9;
   }

   final boolean h0() {
      return d3v.n5(new x3f(), this);
   }

   public x3f() {
      this.u9 = new s7u();
   }

   public x3f(w1j var1) {
      if (var1 == null) {
         throw new ArgumentNullException("properties");
      }

      this.n5(var1.n5());
      this.n5(var1.l6());
      this.l6(var1.k5());
      this.l6(var1.u3());
      this.n5(var1.a6());
      this.u9 = ((x3f)var1).u9();
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.internal.n2d.q0.n5(this.n5, this.l6, this.k5, this.u3, this.a6, this.u9);
   }

   @Override
   public final boolean equals(Object object) {
      if (object == null) {
         return false;
      }

      if (this.getClass() != object.getClass()) {
         return false;
      }

      x3f var2 = (x3f)object;
      return this.n5() == var2.n5()
         && this.l6() == var2.l6()
         && this.k5() == var2.k5()
         && this.u3() == var2.u3()
         && this.a6() == var2.a6()
         && this.u9().n5(var2.u9());
   }
}
