package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEqualityComparer;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.InvalidOperationException;

class p2b implements IGenericEqualityComparer<KeyValuePair<TextParam, String>> {
   public final boolean n5(KeyValuePair<TextParam, String> var1, KeyValuePair<TextParam, String> var2) {
      if (var1.getKey() != null && var2.getKey() != null && var1.getValue() != null && var2.getValue() != null) {
         return this.n5((TextParam)var1.getKey(), (TextParam)var2.getKey())
            && com.aspose.slides.ms.System.d1.a6((String)var1.getValue(), (String)var2.getValue());
      } else {
         throw new InvalidOperationException();
      }
   }

   @Override
   public boolean equals(Object x, Object y) {
      return com.aspose.slides.ms.System.j8.l6(x, y);
   }

   public final int n5(KeyValuePair<TextParam, String> var1) {
      int var2 = -324743029 + this.n5((TextParam)var1.getKey());
      return var2 * 486187739 + ((String)var1.getValue()).hashCode();
   }

   @Override
   public int hashCode(Object obj) {
      return obj.hashCode();
   }

   private boolean n5(TextParam var1, TextParam var2) {
      return var1.e2() == var2.e2()
         && com.aspose.slides.internal.n8e.v4.n5(var1.q0(), var2.q0())
         && com.aspose.slides.internal.n8e.v4.n5(var1.c4(), var2.c4())
         && com.aspose.slides.ms.System.d1.a6(var1.z3(), var2.z3())
         && var1.z1() == var2.z1()
         && var1.m1() == var2.m1()
         && var1.e5() == var2.e5();
   }

   private int n5(TextParam var1) {
      int var2 = -324743029 + com.aspose.slides.ms.System.s3.n5(var1.e2());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.n1.n5(var1.q0());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.n1.n5(var1.c4());
      var2 = var2 * 486187739 + var1.z3().hashCode();
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.f0.n5(var1.z1());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.s3.l6(var1.m1());
      return var2 * 486187739 + com.aspose.slides.ms.System.s3.n5(var1.e5());
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int hashCodeT(KeyValuePair<TextParam, String> bridgeArg0) {
      return this.n5(bridgeArg0);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public boolean equalsT(KeyValuePair<TextParam, String> bridgeArg0, KeyValuePair<TextParam, String> bridgeArg1) {
      return this.n5(bridgeArg0, bridgeArg1);
   }

}
