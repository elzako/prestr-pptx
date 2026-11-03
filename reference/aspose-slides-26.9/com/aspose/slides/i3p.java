package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericList;

class i3p extends com.aspose.slides.internal.v6g.h0<i3p> {
   public c7n n5 = new c7n();
   public float l6;
   public float k5;
   public float u3;

   public i3p() {
   }

   public static void n5(IGenericList<d2k> var0, float var1) {
      for (int var2 = 0; var2 < var0.size(); var2++) {
         d2k var3 = ((d2k)var0.get_Item(var2)).u3();
         var3.n5 = var1 - var3.n5;
         var0.set_Item(var2, var3.u3());
      }
   }

   public static void n5(IGenericList<d2k> var0, float var1, float var2) {
      for (int var3 = 0; var3 < var0.size(); var3++) {
         d2k var4 = ((d2k)var0.get_Item(var3)).u3();
         var4.n5 *= var1;
         var4.l6 *= var2;
         var0.set_Item(var3, var4.u3());
      }
   }

   public void n5(i3p var1) {
      this.n5.n5(var1.n5);
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
   }

   public i3p n5() {
      i3p var1 = new i3p();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(i3p var1) {
      return com.aspose.slides.ms.System.j8.n5(var1.n5, this.n5) && var1.l6 == this.l6 && var1.k5 == this.k5 && var1.u3 == this.u3;
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.internal.n2d.q0.n5(this.n5, this.l6, this.k5, this.u3);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof i3p) ? false : this.l6((i3p)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public i3p Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(i3p bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
