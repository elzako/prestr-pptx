package com.aspose.slides.internal.v9e;

import com.aspose.slides.Collections.Hashtable;

public class j5 extends com.aspose.slides.internal.v6g.h0<j5> {
   private com.aspose.slides.internal.x6s.a6 n5;
   private Hashtable l6;

   public j5() {
   }

   public j5(com.aspose.slides.internal.x6s.a6 var1, Hashtable var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public final com.aspose.slides.internal.x6s.a6 n5() {
      return this.n5;
   }

   public final Hashtable l6() {
      return this.l6;
   }

   public void n5(j5 var1) {
      var1 = var1 == null ? new j5() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public j5 k5() {
      j5 var1 = new j5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.k5();
   }

   private boolean l6(j5 var1) {
      return com.aspose.slides.ms.System.j8.n5(var1.n5, this.n5) && com.aspose.slides.ms.System.j8.n5(var1.l6, this.l6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof j5) ? false : this.l6((j5)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public j5 Clone() {
      return this.k5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(j5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
