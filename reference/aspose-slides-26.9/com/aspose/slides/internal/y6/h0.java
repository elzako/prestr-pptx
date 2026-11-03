package com.aspose.slides.internal.y6;

import com.aspose.slides.ms.System.j8;

public class h0 {
   private byte n5;
   private byte l6;
   private byte k5;

   public h0(com.aspose.slides.internal.o9b.c8 var1) {
      this.n5 = var1.x8();
      this.l6 = var1.n3();
      this.k5 = var1.y4();
   }

   public h0(byte var1, byte var2, byte var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   public final byte k5() {
      return this.n5;
   }

   public final void n5(byte var1) {
      this.n5 = var1;
   }

   public final byte u3() {
      return this.l6;
   }

   public final void l6(byte var1) {
      this.l6 = var1;
   }

   public final byte a6() {
      return this.k5;
   }

   public final void k5(byte var1) {
      this.k5 = var1;
   }

   public com.aspose.slides.internal.o9b.c8 l6() {
      return com.aspose.slides.internal.o9b.c8.n5(255, this.n5 & 255, this.l6 & 255, this.k5 & 255);
   }

   protected final boolean n5(h0 var1) {
      return this.n5 == var1.n5 && this.l6 == var1.l6 && this.k5 == var1.k5;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != j8.n5(this) ? false : this.n5((h0)obj);
      }
   }
}
