package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;

public class f6z extends f1s {
   private int l6;
   private int k5;
   private List<u1s> u3 = new List<>();

   public f6z(long var1, int var3, int var4) {
      super(var1);
      this.l6 = var3;
      this.k5 = var4;
   }

   public final u1s n5(int var1) {
      return this.u3.get_Item(var1);
   }

   @Override
   public void n5(f3c var1) {
      var1.n5(this.n5 & 4294967295L);
      int var2 = var1.n3() & 65535;
      if (var2 != this.l6) {
         throw new r7c(
            com.aspose.slides.ms.System.d1.n5(
               com.aspose.slides.ms.System.d1.n5(new String[]{
                  "incorrect format of BaseArray table, BaseCount = {0}", "differs from BaseCoverage count = {1} but must be the same"
               }),new Object[]{
               var2,
               this.l6
            })
         );
      }

      List var3 = new List();

      for (int var4 = 0; var4 < var2; var4++) {
         List var5 = new List();

         for (int var6 = 0; var6 < this.k5; var6++) {
            int var7 = var1.n3();
            var5.addItem(var7);
            if ((var7 & 65535) == 0) {
               throw new d9m(com.aspose.slides.ms.System.d1.n5("Zero Anchor table offset in BaseArray Table(offset={0})", new Object[]{this.n5}));
            }
         }

         var3.addItem(var5);
      }

      for (int var8 = 0; var8 < var2; var8++) {
         this.u3.addItem(new u1s(this.n5 & 4294967295L, this.k5, (List<Integer>)var3.get_Item(var8), var1));
      }
   }
}
