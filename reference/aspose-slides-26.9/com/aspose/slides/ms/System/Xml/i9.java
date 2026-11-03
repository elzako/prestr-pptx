package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.Collections.Generic.IGenericEqualityComparer;

public class i9 implements IGenericEqualityComparer<String> {
   private int n5 = com.aspose.slides.ms.System.p8.a6();

   public final boolean n5(String var1, String var2) {
      return com.aspose.slides.ms.System.d1.u3(var1, var2, (short)4);
   }

   @Override
   public boolean equals(Object x, Object y) {
      return this.n5((String)x, (String)y);
   }

   public boolean l6(String var1, String var2) {
      return this.n5(var1, var2);
   }

   @Override
   public int hashCode(Object key) {
      return this.n5((String)key);
   }

   public int n5(String var1) {
      int var2 = this.n5;

      for (int var3 = 0; var3 < var1.length(); var3++) {
         var2 += var2 << 7 ^ var1.charAt(var3);
      }

      var2 -= var2 >> 17;
      var2 -= var2 >> 11;
      return var2 - (var2 >> 5);
   }

   public int l6(String var1) {
      return this.n5(var1);
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
