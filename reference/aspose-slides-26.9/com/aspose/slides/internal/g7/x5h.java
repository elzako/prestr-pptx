package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;

public class x5h<RuleTableType extends s0i> extends f1s {
   private Class<RuleTableType> l6;
   private List<RuleTableType> k5 = new List<>();

   public x5h(Class<RuleTableType> var1, long var2, long var4) {
      super(var2, var4);
      this.l6 = var1;
   }

   public final RuleTableType[] l6() {
      return this.k5.toArray(this.k5());
   }

   private RuleTableType[] k5() {
      com.aspose.slides.ms.System.u3 var1 = com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(this.l6), this.k5.size());
      return (RuleTableType[])((s0i[])com.aspose.slides.ms.System.u3.n5(var1));
   }

   @Override
   public void n5(f3c var1) {
      var1.n5(this.n5 & 4294967295L);
      List var2 = l6(var1);

      for (int var3 = 0; var3 < var2.size(); var3++) {
         s0i var4 = this.u3();
         var4.n5(this.n5 & 4294967295L, (Integer)var2.get_Item(var3) & 65535, var1);
         this.k5.addItem((RuleTableType)var4);
      }
   }

   private RuleTableType u3() {
      try {
         return this.l6.getConstructor().newInstance();
      } catch (Exception var2) {
         throw new RuntimeException(var2);
      }
   }

   public static <RuleTableType extends s0i> List<x5h<RuleTableType>> n5(Class<RuleTableType> var0, long var1, f3c var3, boolean var4) {
      List var5 = new List();
      List var6 = l6(var3);

      for (int var7 = 0; var7 < var6.size(); var7++) {
         int var8 = (Integer)var6.get_Item(var7);
         if (var4) {
            if ((var8 & 65535) == 0) {
               var5.addItem(null);
            } else {
               var5.addItem(f1s.n5(new x5h(var0, var1, var8 & 65535), var3));
            }
         } else {
            var5.addItem(f1s.n5(new x5h(var0, var1, var8 & 65535), var3));
         }
      }

      return var5;
   }
}
