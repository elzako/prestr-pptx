package com.aspose.slides.internal.v9e;

import com.aspose.slides.Collections.ArrayList;

public final class h0 {
   private String n5;
   private i9[] l6;

   private h0(String var1) {
      this.n5 = var1;
   }

   private h0(ArrayList var1) {
      this.l6 = new i9[var1.size()];

      for (int var2 = 0; var2 < var1.size(); var2++) {
         this.l6[var2] = (i9)var1.get_Item(var2);
      }
   }

   public final boolean n5() {
      return this.l6 == null;
   }

   public final String n5(p3 var1, l6 var2) {
      if (this.n5()) {
         return this.n5;
      }

      com.aspose.slides.internal.l7h.a5 var3 = var1.t2();

      for (int var4 = 0; var4 < this.l6.length; var4++) {
         var3.n5(this.l6[var4].l6(var1, var2));
      }

      var1.s7();
      return var3.toString();
   }

   public static h0 n5(z1 var0, String var1) {
      boolean var2 = false;
      boolean[] var3 = new boolean[]{false};
      ArrayList var4 = var0.n5(var1, var3);
      var2 = var3[0];
      return var2 ? new h0(var1) : new h0(var4);
   }
}
