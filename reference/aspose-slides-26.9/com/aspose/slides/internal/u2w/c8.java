package com.aspose.slides.internal.u2w;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.d2;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.l4;

public class c8 {
   private long n5;
   private long l6;

   public c8() {
   }

   public c8(long var1) {
      this.l6 = var1;
      this.n5 = 1L;
   }

   public c8(long var1, long var3) {
      this.l6 = var1;
      this.n5 = var3;
   }

   public final long n5() {
      return this.n5;
   }

   public final long l6() {
      return this.l6;
   }

   public final float k5() {
      return (float)(this.l6 & 4294967295L) / (float)(this.n5 & 4294967295L);
   }

   public final double u3() {
      return (double)(this.l6 & 4294967295L) / (this.n5 & 4294967295L);
   }

   @Override
   public String toString() {
      return d1.n5(new Object[]{d2.n5(this.u3(), "F2"), " (", l4.l6(this.l6), "/", l4.l6(this.n5), ')'});
   }

   public static boolean n5(c8 var0, c8 var1) {
      boolean var2;
      if (!j8.l6(var0, null) && !j8.l6(var1, null)) {
         var2 = var0.l6 == var1.l6 && var0.n5 == var1.n5;
      } else {
         var2 = j8.l6(var0, null) && j8.l6(var1, null);
      }

      return var2;
   }

   @Override
   public boolean equals(Object obj) {
      return n5(this, com.aspose.slides.internal.v6g.k5.n5(obj, c8.class));
   }

   @Override
   public int hashCode() {
      return (int)(this.l6 ^ this.n5);
   }
}
