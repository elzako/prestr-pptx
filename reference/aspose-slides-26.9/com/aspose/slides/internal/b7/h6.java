package com.aspose.slides.internal.b7;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;

public final class h6 implements IGenericEnumerable<k0> {
   private final List<k0> n5;
   private final int l6;
   private final boolean k5;
   private boolean u3;

   public final k0 n5(int var1) {
      return this.n5.get_Item(var1);
   }

   public final void n5(int var1, k0 var2) {
      this.n5.set_Item(var1, var2.u3());
   }

   public h6(int var1) {
      this.l6 = var1;
      this.n5 = new List<>();
      this.u3 = false;
      this.k5 = true;
   }

   public h6(int var1, boolean var2) {
      this.l6 = var1;
      this.n5 = new List<>();
      this.u3 = false;
      this.k5 = var2;
   }

   public final int n5() {
      return this.n5.size();
   }

   public final boolean l6() {
      return this.u3;
   }

   public final int k5() {
      return this.l6;
   }

   public final boolean u3() {
      return this.k5;
   }

   public final void n5(k0 var1) {
      this.n5.addItem(var1.u3());
   }

   public final void a6() {
      this.u3 = true;
      this.n5.trimExcess();
   }

   public final d4 u9() {
      if (this.n5.size() == 0) {
         return new d4();
      }

      double var1 = Double.MAX_VALUE;
      double var3 = -Double.MAX_VALUE;
      double var5 = Double.MAX_VALUE;
      double var7 = -Double.MAX_VALUE;
      int var9 = this.n5.size();

      for (int var10 = 0; var10 < var9; var10++) {
         k0 var11 = this.n5.get_Item(var10).u3();
         if (var11.n5() < var1) {
            var1 = var11.n5();
         }

         if (var11.l6() < var5) {
            var5 = var11.l6();
         }

         if (var11.n5() > var3) {
            var3 = var11.n5();
         }

         if (var11.l6() > var7) {
            var7 = var11.l6();
         }
      }

      return new d4(var1, var5, var3, var7);
   }

   @Override
   public final IGenericEnumerator<k0> iterator() {
      return this.n5.iterator();
   }
}
