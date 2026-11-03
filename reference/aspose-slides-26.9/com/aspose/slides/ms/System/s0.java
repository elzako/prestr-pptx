package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.ArgumentNullException;

final class s0 extends p6 {
   private boolean a6;

   public s0(boolean var1) {
      this.a6 = var1;
   }

   @Override
   public int n5(String var1, String var2) {
      return this.a6 ? var1.compareToIgnoreCase(var2) : var1.compareTo(var2);
   }

   @Override
   public boolean l6(String var1, String var2) {
      return this.a6 ? this.n5(var1, var2) == 0 : d1.a6(var1, var2);
   }

   @Override
   public int l6(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("s");
      } else {
         return this.a6 ? var1.toLowerCase().hashCode() : var1.hashCode();
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int compare(String bridgeArg0, String bridgeArg1) {
      return this.n5(bridgeArg0, bridgeArg1);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int hashCodeT(String bridgeArg0) {
      return this.l6(bridgeArg0);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public boolean equalsT(String bridgeArg0, String bridgeArg1) {
      return this.l6(bridgeArg0, bridgeArg1);
   }

}
