package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;

public class g3y<LookupPart extends p6r> extends f1s {
   private Class<LookupPart> l6;
   private List<LookupPart> k5;

   public g3y(Class<LookupPart> var1, long var2) {
      super(var2);
      this.l6 = var1;
      this.k5 = new List<>();
   }

   public final LookupPart n5(int var1) {
      return this.k5.get_Item(var1);
   }

   @Override
   public void n5(f3c var1) {
      var1.n5(this.n5 & 4294967295L);
      List var2 = l6(var1);

      for (int var3 = 0; var3 < var2.size(); var3++) {
         p6r var4 = this.l6();
         var4.n5((this.n5 & 4294967295L) + ((Integer)var2.get_Item(var3) & 65535) & 4294967295L, var1);
         this.k5.addItem((LookupPart)var4);
      }
   }

   private LookupPart l6() {
      try {
         return this.l6.getConstructor().newInstance();
      } catch (Exception var2) {
         throw new RuntimeException(var2);
      }
   }
}
