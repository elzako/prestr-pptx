package com.aspose.slides.internal.q9r;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class u3 {
   private int n5;
   private final String l6;
   private final Map<Integer, k5> k5;

   public u3(String var1) {
      this.l6 = var1;
      this.k5 = new TreeMap<>(new a6(this));
   }

   public final int n5() {
      return this.k5.size();
   }

   public final void n5(k5 var1) {
      this.k5.put(var1.k5(), var1);
      this.n5 = this.n5 | var1.u3();
   }

   public final k5 n5(int var1, boolean var2) {
      k5 var3 = this.k5.get(var1);
      if (var3 != null) {
         return var3;
      }

      if (!var2) {
         for (Entry var5 : this.k5.entrySet()) {
            if ((var1 | (Integer)var5.getKey()) == var1) {
               return (k5)var5.getValue();
            }
         }
      }

      return null;
   }

   public int l6() {
      return this.n5;
   }
}
