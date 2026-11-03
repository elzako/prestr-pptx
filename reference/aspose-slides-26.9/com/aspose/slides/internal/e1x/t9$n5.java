package com.aspose.slides.internal.e1x;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.p6;
import java.text.Collator;

final class t9$n5 extends p6 {
   private boolean u9;
   private com.aspose.slides.internal.x7n.n5 h0;
   // $VF: synthetic field
   final t9 a6;

   public t9$n5(t9 var1, com.aspose.slides.internal.x7n.l6 var2, boolean var3) {
      this.a6 = var1;
      this.h0 = var2.t9();
      this.u9 = var3;
   }

   @Override
   public int n5(String var1, String var2) {
      Collator var3 = Collator.getInstance();
      var3.setDecomposition(1);
      if (this.u9) {
         var3.setStrength(1);
      } else {
         var3.setStrength(2);
      }

      return var3.compare(var1, var2);
   }

   @Override
   public boolean l6(String var1, String var2) {
      return this.n5(var1, var2) == 0;
   }

   @Override
   public int l6(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("s");
      }

      long var2 = 0L;
      return this.h0.n5(var1, var2).hashCode();
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


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int compare(String bridgeArg0, String bridgeArg1) {
      return this.n5(bridgeArg0, bridgeArg1);
   }

}
