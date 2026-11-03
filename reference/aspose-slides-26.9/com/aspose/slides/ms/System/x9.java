package com.aspose.slides.ms.System;

public class x9 {
   private final com.aspose.slides.internal.l6j.n5 l6;
   public static final x9 n5 = new x9(com.aspose.slides.internal.l6j.n5.n5);

   public boolean n5() {
      return com.aspose.slides.internal.l6j.n5.n5.equals(this.l6);
   }

   public x9(long var1) {
      this.l6 = com.aspose.slides.internal.l6j.n5.n5(var1);
   }

   public x9(com.aspose.slides.internal.l6j.n5 var1) {
      if (var1 == null) {
         var1 = com.aspose.slides.internal.l6j.n5.n5;
      }

      this.l6 = var1;
   }

   @Override
   public boolean equals(Object obj) {
      if (obj instanceof x9) {
         x9 var2 = (x9)obj;
         return n5(this, var2);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.l6 != null ? this.l6.hashCode() : 0;
   }

   public long l6() {
      return (long)this.l6.l6() << 32 | this.l6.k5();
   }

   @Override
   public String toString() {
      return p3.n5(this.l6(), com.aspose.slides.internal.x7n.l6.k5());
   }

   public static boolean n5(x9 var0, x9 var1) {
      return var0.l6.equals(var1.l6);
   }

   public com.aspose.slides.internal.l6j.n5 k5() {
      return this.l6;
   }
}
