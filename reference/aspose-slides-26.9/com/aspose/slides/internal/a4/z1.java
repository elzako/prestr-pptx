package com.aspose.slides.internal.a4;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.d1;

public class z1 extends m1 {
   private long n5;

   public z1() {
      this.l6((short)16405);
   }

   public z1(b3 var1) {
      super(var1);
   }

   public final byte k5() {
      return this.m3();
   }

   public final void n5(byte var1) {
      this.u3(var1);
   }

   public final long u3() {
      return this.n5;
   }

   public final void n5(long var1) {
      if ((var1 & 4294967295L) > 63L) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.n5 = var1;
   }

   @Override
   public String toString() {
      return d1.n5("{0}, PenId: {1}", super.toString(), this.n5);
   }

   protected final boolean n5(z1 var1) {
      return this.n5 == var1.n5;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((z1)obj);
      }
   }

   @Override
   public int hashCode() {
      return (int)this.n5;
   }

   @Override
   public int u9() {
      return 4;
   }
}
