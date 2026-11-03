package com.aspose.slides.ms.System;

import com.aspose.slides.Collections.Generic.IGenericEqualityComparer;
import com.aspose.slides.exceptions.ArgumentNullException;
import java.util.Comparator;

public abstract class p6 implements IGenericEqualityComparer<String>, Comparator<String> {
   static p6 n5 = new m3(com.aspose.slides.internal.x7n.l6.k5(), true);
   static p6 l6 = new m3(com.aspose.slides.internal.x7n.l6.k5(), false);
   static p6 k5 = new s0(true);
   static p6 u3 = new s0(false);

   protected p6() {
   }

   public static p6 n5() {
      return new m3(com.aspose.slides.internal.x7n.l6.u3(), true);
   }

   public static p6 l6() {
      return n5;
   }

   public static p6 k5() {
      return u3;
   }

   public static p6 u3() {
      return k5;
   }

   @Override
   public boolean equals(Object x, Object y) {
      if (x == y) {
         return true;
      }

      if (x != null && y != null) {
         String var3 = com.aspose.slides.internal.v6g.k5.n5(x, String.class);
         if (var3 != null) {
            String var4 = com.aspose.slides.internal.v6g.k5.n5(y, String.class);
            if (var4 != null) {
               return this.l6(var3, var4);
            }
         }

         return x.equals(y);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode(Object obj) {
      if (obj == null) {
         throw new ArgumentNullException("obj");
      }

      String var2 = com.aspose.slides.internal.v6g.k5.n5(obj, String.class);
      return var2 != null ? this.l6(var2) : obj.hashCode();
   }

   public abstract int n5(String var1, String var2);

   public abstract boolean l6(String var1, String var2);

   public abstract int l6(String var1);

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
