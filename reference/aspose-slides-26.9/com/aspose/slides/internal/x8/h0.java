package com.aspose.slides.internal.x8;

import com.aspose.slides.ms.System.d1;

public class h0 extends n5 {
   private boolean n5 = d1.c8(this.k5(), " ") == -1;

   public h0(String var1, String var2) {
      super(var1, "class", var2);
   }

   @Override
   public boolean n5(com.aspose.slides.internal.j3.z3 var1, String var2) {
      if (!this.n5) {
         return false;
      }

      if (!this.l6(var1)) {
         return false;
      }

      int var3 = this.u9().a_().u3().k5().k5().l6() ? 4 : 5;
      String var4 = this.n5(var1);
      String var5 = this.k5();
      int var6 = var4.length();
      int var7 = var5.length();

      for (int var8 = d1.u9(var4, var5, (short)var3); var8 != -1; var8 = d1.l6(var4, var5, var8 + var7, (short)var3)) {
         if ((var8 == 0 || com.aspose.slides.ms.System.t9.n3(var4.charAt(var8 - 1)))
            && (var8 + var7 == var6 || com.aspose.slides.ms.System.t9.n3(var4.charAt(var8 + var7)))) {
            return true;
         }
      }

      return false;
   }

   @Override
   public String a6() {
      return d1.n5(new String[]{".", this.k5()});
   }
}
