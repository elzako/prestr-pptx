package com.aspose.slides.internal.i0;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class e9 extends f2 {
   private int n5;
   private o5 l6;
   private z1 k5;

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      if (var1 != 0) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.n5 = var1;
   }

   public final o5 l6() {
      return this.l6;
   }

   public final void n5(o5 var1) {
      this.l6 = var1;
   }

   public final z1 k5() {
      return this.k5;
   }

   public final void n5(z1 var1) {
      this.k5 = var1;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("{0}, Type: {1}, PenData: [{2}], BrushObject: [{3}]", super.toString(), this.n5, this.l6, this.k5);
   }

   protected final boolean n5(e9 var1) {
      return super.n5(var1) && this.n5 == var1.n5 && com.aspose.slides.ms.System.j8.n5(this.l6, var1.l6) && com.aspose.slides.ms.System.j8.n5(this.k5, var1.k5);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((e9)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      var1 = var1 * 397 ^ this.n5;
      var1 = var1 * 397 ^ (this.l6 != null ? this.l6.hashCode() : 0);
      return var1 * 397 ^ (this.k5 != null ? this.k5.hashCode() : 0);
   }

   @Override
   public int u9() {
      return 8 + this.l6().u9() + this.k5().u9();
   }

   public final com.aspose.slides.internal.o9b.m3 u3() {
      com.aspose.slides.internal.o9b.m3 var1 = new com.aspose.slides.internal.o9b.m3(this.k5().k5());
      var1.k5(this.l6().k5());
      j8 var2 = this.l6().u3();
      if ((this.l6().n5() & 128L) > 0L) {
         var1.n5(var2.t2());
      }

      if ((this.l6().n5() & 1L) > 0L) {
         var1.n5(var2.n5().c8());
      }

      if ((this.l6().n5() & 2L) > 0L) {
         var1.u3((int)var2.l6());
      }

      if ((this.l6().n5() & 4L) > 0L) {
         var1.a6((int)var2.k5());
      }

      if ((this.l6().n5() & 8L) > 0L) {
         var1.u9(var2.u3());
      }

      if ((this.l6().n5() & 16L) > 0L) {
         var1.l6(var2.a6());
      }

      if ((this.l6().n5() & 512L) > 0L) {
         var1.n5(var2.x8());
      }

      if ((this.l6().n5() & 1024L) > 0L) {
         var1.n5(var2.n3().n5());
      }

      if ((this.l6().n5() & 32L) > 0L) {
         var1.k5(var2.h0());
      }

      if ((this.l6().n5() & 256L) > 0L) {
         var1.k5(5);
         var1.l6(var2.s7().n5());
      }

      if ((this.l6().n5() & 64L) > 0L) {
         var1.l6(var2.c8());
      }

      if ((this.l6().n5() & 2048L) > 0L) {
         var1.l6(var2.y4().n5().k5());
      }

      if ((this.l6().n5() & 4096L) > 0L) {
         var1.n5(var2.e2().n5().k5());
      }

      return var1;
   }
}
