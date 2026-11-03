package com.aspose.slides.Collections;

import com.aspose.slides.internal.v6g.h0;
import com.aspose.slides.ms.System.j8;

class Hashtable$Bucket extends h0<Hashtable$Bucket> {
   public Object n5;
   public Object l6;
   public int k5;
   // $VF: synthetic field
   static final boolean u3 = !Hashtable.class.desiredAssertionStatus();

   public Hashtable$Bucket() {
   }

   public void n5(Hashtable$Bucket var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
   }

   public Hashtable$Bucket n5() {
      Hashtable$Bucket var1 = new Hashtable$Bucket();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(Hashtable$Bucket var1) {
      return j8.n5(var1.n5, this.n5) && j8.n5(var1.l6, this.l6) && var1.k5 == this.k5;
   }

   @Override
   public boolean equals(Object obj) {
      assert obj != null;
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof Hashtable$Bucket) ? false : this.l6((Hashtable$Bucket)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.n5 != null ? this.n5.hashCode() : 0;
      var1 = 31 * var1 + (this.l6 != null ? this.l6.hashCode() : 0);
      return 31 * var1 + this.k5;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public Hashtable$Bucket Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(Hashtable$Bucket bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
