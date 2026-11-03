package com.aspose.slides.internal.j2p;

public class f5 extends com.aspose.slides.internal.v6g.h0<f5> {
   private String l6;
   private String k5;
   // $VF: synthetic field
   static final boolean n5 = !f5.class.desiredAssertionStatus();

   public String n5() {
      return this.l6;
   }

   public void n5(String var1) {
      this.l6 = var1;
   }

   public String l6() {
      return this.k5;
   }

   public void l6(String var1) {
      this.k5 = var1;
   }

   public void n5(f5 var1) {
      var1.l6 = this.l6;
      var1.k5 = this.k5;
   }

   public f5 k5() {
      f5 var1 = new f5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.k5();
   }

   private boolean l6(f5 var1) {
      return com.aspose.slides.ms.System.j8.n5(var1.l6, this.l6) && com.aspose.slides.ms.System.j8.n5(var1.k5, this.k5);
   }

   @Override
   public boolean equals(Object obj) {
      assert obj != null;
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof f5) ? false : this.l6((f5)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.l6 != null ? this.l6.hashCode() : 0;
      return 31 * var1 + (this.k5 != null ? this.k5.hashCode() : 0);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public f5 Clone() {
      return this.k5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(f5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
