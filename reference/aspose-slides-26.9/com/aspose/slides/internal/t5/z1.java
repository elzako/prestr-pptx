package com.aspose.slides.internal.t5;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.q1;
import com.aspose.slides.ms.System.s3;

public class z1 extends n5 implements Cloneable {
   private long n5;
   private com.aspose.slides.internal.k1.q0 l6;
   private com.aspose.slides.internal.k1.c8 k5;

   public long n5() {
      return this.n5;
   }

   public void n5(long var1) {
      this.n5 = var1;
   }

   public final com.aspose.slides.internal.k1.q0 l6() {
      return this.l6;
   }

   public final void n5(com.aspose.slides.internal.k1.q0 var1) {
      this.l6 = var1;
   }

   public int k5() {
      return this.l6.n5();
   }

   public com.aspose.slides.internal.k1.c8 u3() {
      return this.k5;
   }

   public void n5(com.aspose.slides.internal.k1.c8 var1) {
      this.k5 = var1;
   }

   @Override
   public String toString() {
      return d1.n5(
         "PenStyle: {0}, Width: {1}, ActualWidth: {2}, ColorRef: {3}",
         s3.n5(com.aspose.slides.internal.c5.n3.class, this.n5()),
         this.l6(),
         this.k5(),
         this.u3()
      );
   }

   protected final boolean n5(z1 var1) {
      return this.n5 == var1.n5 && j8.n5(this.l6, var1.l6) && j8.n5(this.k5, var1.k5);
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != j8.n5(this) ? false : this.n5((z1)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = (int)this.n5;
      var1 = var1 * 397 ^ (this.l6 != null ? this.l6.hashCode() : 0);
      return var1 * 397 ^ (this.k5 != null ? this.k5.hashCode() : 0);
   }

   public com.aspose.slides.internal.o9b.m3 n5(com.aspose.slides.internal.r6.u9 var1) {
      if (this.n5() == 5L) {
         return null;
      }

      com.aspose.slides.internal.o9b.m3 var2 = new com.aspose.slides.internal.o9b.m3(this.u3().u9().o8());
      switch ((int)((int)this.n5() & 983040 & 4294967295L)) {
         case 0:
            if (this.l6().n5() == 1) {
               com.aspose.slides.internal.x4g.m1 var3 = var1.x9();
               float var4 = q1.n5(var3.n5()[0]);
               float var5 = q1.n5(var3.n5()[3]);
               float var6 = 2.0F / (var4 + var5);
               var2 = new com.aspose.slides.internal.o9b.m3(this.u3().u9().o8(), var6);
            } else {
               var2.k5((float)this.l6().n5());
            }
            break;
         case 65536:
            var2.k5((float)this.l6().n5());
      }

      switch ((int)((int)this.n5() & 15 & 4294967295L)) {
         case 0:
            var2.k5(0);
            break;
         case 1:
            var2.k5(1);
            break;
         case 2:
            var2.k5(2);
            break;
         case 3:
            var2.k5(3);
            break;
         case 4:
            var2.k5(4);
         case 5:
         default:
            break;
         case 6:
            var2.k5(0);
            break;
         case 7:
            com.aspose.slides.internal.f8y.n5.k5("Warning: EmfPenStyle.PS_USERSTYLE for EmfLogPen");
            var2.k5(0);
            break;
         case 8:
            if (((int)this.n5() & 983040 & 4294967295L) == 0L) {
               var2.k5(2);
            }
      }

      switch ((int)((int)this.n5() & 3840 & 4294967295L)) {
         case 0:
            var2.a6(2);
            var2.u3(2);
            break;
         case 256:
            var2.a6(1);
            break;
         case 512:
            var2.a6(0);
      }

      switch ((int)((int)this.n5() & 61440 & 4294967295L)) {
         case 0:
            var2.u9(2);
            break;
         case 4096:
            var2.u9(1);
            break;
         case 8192:
            var2.u9(0);
      }

      var2.l6(var1.r4());
      return var2;
   }
}
