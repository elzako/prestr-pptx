package com.aspose.slides.internal.y6;

import com.aspose.slides.ms.System.j8;

public class n5 extends h0 {
   private byte n5;

   public n5(com.aspose.slides.internal.o9b.c8 var1) {
      super(var1.o8());
      this.n5 = var1.s7();
   }

   public n5(byte var1, byte var2, byte var3, byte var4) {
      super(var2, var3, var4);
      this.n5 = var1;
      if ((var1 & 255) == 0) {
         this.n5((byte)0);
         this.l6((byte)0);
         this.k5((byte)0);
      }
   }

   public final byte n5() {
      return this.n5;
   }

   @Override
   public com.aspose.slides.internal.o9b.c8 l6() {
      return com.aspose.slides.internal.o9b.c8.n5(this.n5() & 255, this.k5() & 255, this.u3() & 255, this.a6() & 255);
   }

   protected final boolean n5(n5 var1) {
      return super.n5(var1) && this.n5 == var1.n5;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != j8.n5(this) ? false : this.n5((n5)obj);
      }
   }
}
