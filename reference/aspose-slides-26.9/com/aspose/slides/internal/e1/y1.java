package com.aspose.slides.internal.e1;

import com.aspose.slides.ms.System.j8;

public class y1 extends com.aspose.slides.internal.v6g.h0<y1> {
   private com.aspose.slides.internal.o9b.w1 n5 = new com.aspose.slides.internal.o9b.w1();
   private com.aspose.slides.internal.o9b.w1 l6 = new com.aspose.slides.internal.o9b.w1();
   private com.aspose.slides.internal.o9b.w1 k5 = new com.aspose.slides.internal.o9b.w1();

   public final void n5(com.aspose.slides.internal.o9b.w1 var1) {
      var1.n5(this.n5);
   }

   public final com.aspose.slides.internal.o9b.w1 n5() {
      return this.l6;
   }

   public final void l6(com.aspose.slides.internal.o9b.w1 var1) {
      var1.n5(this.l6);
   }

   public final com.aspose.slides.internal.o9b.w1 l6() {
      return this.k5;
   }

   public final void k5(com.aspose.slides.internal.o9b.w1 var1) {
      var1.n5(this.k5);
   }

   public void n5(y1 var1) {
      this.n5.n5(var1.n5);
      this.l6.n5(var1.l6);
      this.k5.n5(var1.k5);
   }

   public y1 k5() {
      y1 var1 = new y1();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.k5();
   }

   private boolean l6(y1 var1) {
      return j8.n5(var1.n5, this.n5) && j8.n5(var1.l6, this.l6) && j8.n5(var1.k5, this.k5);
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof y1) ? false : this.l6((y1)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public y1 Clone() {
      return this.k5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(y1 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
