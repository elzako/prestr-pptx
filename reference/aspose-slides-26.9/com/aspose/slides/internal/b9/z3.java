package com.aspose.slides.internal.b9;

public class z3 extends s9 {
   private long n5;

   public z3() {
   }

   public z3(s9 var1) {
      super(var1);
   }

   public final long c8() {
      return this.n5;
   }

   public final void u3(long var1) {
      this.n5 = var1;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("{0}, DataSize: {1}", super.toString(), this.n5);
   }

   protected final boolean n5(z3 var1) {
      return super.n5(var1) && this.n5 == var1.n5;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((z3)obj);
      }
   }

   @Override
   public int hashCode() {
      return super.hashCode() * 397 ^ (int)this.n5;
   }
}
