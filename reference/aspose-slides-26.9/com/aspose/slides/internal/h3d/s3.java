package com.aspose.slides.internal.h3d;

import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.j8;

@j3
public class s3 extends com.aspose.slides.internal.v6g.h0<s3> {
   private int l6;
   private Object k5;
   // $VF: synthetic field
   static final boolean n5 = !s3.class.desiredAssertionStatus();

   public s3() {
   }

   public s3(int var1) {
      this.l6 = var1;
      this.k5 = null;
   }

   public Object n5() {
      return this.k5;
   }

   public int l6() {
      return this.l6;
   }

   @Override
   public int hashCode() {
      return this.l6;
   }

   public void n5(s3 var1) {
      var1.l6 = this.l6;
      var1.k5 = this.k5;
   }

   public s3 k5() {
      s3 var1 = new s3();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.k5();
   }

   private boolean l6(s3 var1) {
      return var1.l6 == this.l6 && j8.n5(var1.k5, this.k5);
   }

   @Override
   public boolean equals(Object obj) {
      assert obj != null;
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof s3) ? false : this.l6((s3)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public s3 Clone() {
      return this.k5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(s3 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
