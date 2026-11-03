package com.aspose.slides.internal.s6;

public class b3 implements com.aspose.slides.ms.System.v4, Cloneable {
   private r4 n5 = new r4();
   private r4 l6 = new r4();
   private r4 k5 = new r4();
   private int u3;

   public final r4 n5() {
      return this.n5.c8();
   }

   public final void n5(r4 var1) {
      this.n5 = var1.c8();
   }

   public final r4 l6() {
      return this.l6.c8();
   }

   public final void l6(r4 var1) {
      this.l6 = var1.c8();
   }

   public final r4 k5() {
      return this.k5.c8();
   }

   public final void k5(r4 var1) {
      this.k5 = var1.c8();
   }

   public final int u3() {
      return this.u3;
   }

   public final void n5(int var1) {
      this.u3 = var1;
   }

   @Override
   public final Object deepClone() {
      return this.a6();
   }

   protected Object a6() {
      try {
         b3 var1 = (b3)super.clone();
         if (this.l6 != null) {
            var1.l6 = this.l6.c8();
         }

         if (this.n5 != null) {
            var1.n5 = this.n5.c8();
         }

         if (this.k5 != null) {
            var1.k5 = this.k5.c8();
         }

         return var1;
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }
}
