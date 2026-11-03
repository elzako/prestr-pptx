package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;

public class x7n extends f1s {
   private List<Integer> l6;
   private List<Integer> k5 = new List<>();
   private List<Integer> u3;
   private List<y9r> a6 = new List<>();

   public x7n(long var1) {
      super(var1);
   }

   public final int[] l6() {
      return t2.l6(this.l6);
   }

   public final int k5() {
      return this.k5.size() + 1;
   }

   public final int[] u3() {
      return t2.l6(this.k5);
   }

   public final int[] a6() {
      return t2.l6(this.u3);
   }

   public final y9r n5(int var1) {
      return this.a6.get_Item(var1);
   }

   @Override
   public void n5(f3c var1) {
      var1.n5(this.n5 & 4294967295L);
      this.l6 = f1s.l6(var1);
      int var2 = var1.n3();

      for (int var3 = 0; var3 < (var2 & 65535) - 1; var3++) {
         this.k5.addItem(var1.n3());
      }

      this.u3 = f1s.l6(var1);
      int var7 = var1.n3() & 65535;

      for (int var4 = 0; var4 < var7; var4++) {
         int var5 = var1.n3();
         int var6 = var1.n3();
         this.a6.addItem(new y9r(var5, var6));
      }

      s0i.n5(this.a6, this.k5());
   }
}
