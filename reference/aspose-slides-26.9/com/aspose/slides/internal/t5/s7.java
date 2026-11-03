package com.aspose.slides.internal.t5;

import com.aspose.slides.internal.o9b.i1;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.s3;

public class s7 extends q0 implements Cloneable {
   private int n5;
   private com.aspose.slides.internal.k1.c8 l6;
   private long k5;

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final com.aspose.slides.internal.k1.c8 l6() {
      return this.l6;
   }

   public final void n5(com.aspose.slides.internal.k1.c8 var1) {
      this.l6 = var1;
   }

   public final long k5() {
      return this.k5;
   }

   public final void n5(long var1) {
      this.k5 = var1;
   }

   @Override
   public String toString() {
      return d1.n5(
         "[BrushStyle: {0}, ColorRef: {1}, BrushHatch: {2}]",
         s3.n5(com.aspose.slides.internal.o4.k5.class, this.n5),
         this.l6,
         s3.n5(com.aspose.slides.internal.c5.h0.class, this.k5)
      );
   }

   protected final boolean n5(s7 var1) {
      return this.n5 == var1.n5 && j8.n5(this.l6, var1.l6) && this.k5 == var1.k5;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != j8.n5(this) ? false : this.n5((s7)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.n5 & 65535;
      var1 = var1 * 397 ^ (this.l6 != null ? this.l6.hashCode() : 0);
      return var1 * 397 ^ (int)this.k5;
   }

   public final com.aspose.slides.internal.o9b.u3 n5(com.aspose.slides.internal.r6.u9 var1) {
      if (this.n5() == 0) {
         return new i1(this.l6().u9().o8());
      }

      if (this.n5() == 2) {
         switch ((int)this.k5()) {
            case 0:
            default:
               return new com.aspose.slides.internal.x4g.n3(0, this.l6().u9().o8(), var1.q0().o8());
            case 1:
               return new com.aspose.slides.internal.x4g.n3(1, this.l6().u9().o8(), var1.q0().o8());
            case 2:
               return new com.aspose.slides.internal.x4g.n3(2, this.l6().u9().o8(), var1.q0().o8());
            case 3:
               return new com.aspose.slides.internal.x4g.n3(3, this.l6().u9().o8(), var1.q0().o8());
            case 4:
               return new com.aspose.slides.internal.x4g.n3(4, this.l6().u9().o8(), var1.q0().o8());
            case 5:
               return new com.aspose.slides.internal.x4g.n3(5, this.l6().u9().o8(), var1.q0().o8());
            case 6:
               return new i1(this.l6().u9().o8());
            case 7:
               com.aspose.slides.internal.f8y.n5.k5("EmfHatchStyle.HS_DITHEREDCLR");
               return new i1(this.l6().u9().o8());
            case 8:
               return new i1(var1.z3().o8());
            case 9:
               com.aspose.slides.internal.f8y.n5.k5("EmfHatchStyle.HS_DITHEREDTEXTCLR");
               return new i1(var1.z3().o8());
            case 10:
               return new i1(var1.q0().o8());
            case 11:
               com.aspose.slides.internal.f8y.n5.k5("EmfHatchStyle.HS_DITHEREDTEXTCLR");
               return new i1(var1.q0().o8());
         }
      } else {
         return null;
      }
   }
}
