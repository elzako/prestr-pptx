package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.ArgumentNullException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

final class m3 extends p6 {
   private boolean a6;
   private com.aspose.slides.internal.x7n.n5 u9;
   private static CharsetEncoder h0 = Charset.forName("US-ASCII").newEncoder();

   public m3(com.aspose.slides.internal.x7n.l6 var1, boolean var2) {
      this.u9 = var1.t9();
      this.a6 = var2;
   }

   @Override
   public int n5(String var1, String var2) {
      if (n5(var1) && n5(var2)) {
         return this.a6 ? k5.n5(var1, var2) : u3.n5(var1, var2);
      }

      long var3 = this.a6 ? 1L : 0L;
      return this.u9.n5(var1, var2, var3);
   }

   public static boolean n5(String var0) {
      synchronized (h0) {
         h0.reset();
         return h0.canEncode(var0);
      }
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

      long var2 = this.a6 ? 1L : 0L;
      return this.u9.n5(var1, var2).hashCode();
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
