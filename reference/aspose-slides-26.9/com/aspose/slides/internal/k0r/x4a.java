package com.aspose.slides.internal.k0r;

import com.aspose.slides.IGenericCloneable;

public class x4a extends f3l implements IGenericCloneable<x4a>, Cloneable {
   public final void n5(k4s var1) {
      this.n5 = var1;
      this.n5(1, var1 != null);
   }

   public final com.aspose.slides.ms.System.o5<Integer> n5() {
      return this.n5(2) ? new com.aspose.slides.ms.System.o5<>(this.l6) : new com.aspose.slides.ms.System.o5<>();
   }

   public final void n5(com.aspose.slides.ms.System.o5<Integer> var1) {
      if (var1.l6()) {
         this.l6 = (Integer)var1.n5();
      }

      this.n5(2, var1.l6());
   }

   public final com.aspose.slides.ms.System.o5<Integer> l6() {
      return this.n5(4) ? new com.aspose.slides.ms.System.o5<>(this.k5) : new com.aspose.slides.ms.System.o5<>();
   }

   public final void l6(com.aspose.slides.ms.System.o5<Integer> var1) {
      if (var1.l6()) {
         this.k5 = (Integer)var1.n5();
      }

      this.n5(4, var1.l6());
   }

   public final byte k5() {
      if (this.n5(64)) {
         return (byte)(this.u3 ? 1 : 0);
      } else {
         return -1;
      }
   }

   public final void n5(byte var1) {
      if (var1 != -1) {
         this.u3 = var1 == 1;
      }

      this.n5(64, this.u3);
   }

   public final byte u3() {
      if (this.n5(32)) {
         return (byte)(this.u9 ? 1 : 0);
      } else {
         return -1;
      }
   }

   public final long[] a6() {
      return this.n5(512) ? this.h0 : null;
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      var1.l6("TextSIException");
      var1.n5(super.toString());
      return var1.toString();
   }

   public final x4a u9() {
      return (x4a)this.h0();
   }

   protected Object h0() {
      try {
         x4a var1 = (x4a)super.clone();
         if (this.n5 != null) {
            var1.n5 = this.n5.l6();
         }

         return var1;
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public x4a cloneT() {
      return this.u9();
   }

}
