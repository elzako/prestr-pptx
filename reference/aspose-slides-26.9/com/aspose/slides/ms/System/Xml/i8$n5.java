package com.aspose.slides.ms.System.Xml;

public class i8$n5 extends com.aspose.slides.internal.v6g.h0<i8$n5> {
   public String n5;
   public String l6;

   public i8$n5() {
   }

   public i8$n5(String var1, String var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public void n5(i8$n5 var1) {
      var1 = var1 == null ? new i8$n5() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public i8$n5 n5() {
      i8$n5 var1 = new i8$n5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(i8$n5 var1) {
      return com.aspose.slides.ms.System.j8.n5(var1.n5, this.n5) && com.aspose.slides.ms.System.j8.n5(var1.l6, this.l6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof i8$n5) ? false : this.l6((i8$n5)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public i8$n5 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(i8$n5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
