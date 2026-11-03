package com.aspose.slides.internal.i4;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.IDisposable;

public final class u3 extends j4 {
   private int n5 = 0;
   private SortedList<Integer, g7> u3 = new SortedList<>();

   private IGenericEnumerable<g7> s7() {
      return super.u9();
   }

   private IGenericEnumerable<String> x8() {
      return super.a6();
   }

   @Override
   public String u3() {
      return "Array";
   }

   @Override
   public boolean n5() {
      return this.k5() > 0;
   }

   @Override
   public int k5() {
      return this.n5;
   }

   @Override
   public void n5(int var1) {
      this.k5(var1);
   }

   @Override
   public g7 n5(String var1) {
      int var2 = 0;
      int[] var3 = new int[]{0};
      boolean var4 = com.aspose.slides.ms.System.a3.n5(var1, var3);
      var2 = var3[0];
      return var4 ? this.l6(var2) : super.n5(var1);
   }

   @Override
   public void n5(String var1, g7 var2) {
      int var3 = 0;
      int[] var4 = new int[]{0};
      boolean var5 = com.aspose.slides.ms.System.a3.n5(var1, var4);
      var3 = var4[0];
      if (var5) {
         this.n5(var3, var2);
      } else {
         super.n5(var1, var2);
      }
   }

   @Override
   public g7 n5(g7 var1) {
      double var2 = var1.l6();
      int var4 = com.aspose.slides.internal.v6g.k5.u3(var2, 14);
      return var4 == var2 && var4 >= 0 ? this.l6(var4) : super.n5(var1.toString());
   }

   @Override
   public void n5(g7 var1, g7 var2) {
      double var3 = var1.l6();
      int var5 = com.aspose.slides.internal.v6g.k5.u3(var3, 14);
      if (var5 == var3 && var5 >= 0) {
         this.n5(var5, var2);
      } else {
         super.n5(var1.toString(), var2);
      }
   }

   @Override
   public void n5(y2 var1) {
      int var2 = 0;
      int[] var3 = new int[]{0};
      boolean var4 = com.aspose.slides.ms.System.a3.n5(var1.n5(), var3);
      var2 = var3[0];
      if (var4) {
         this.n5(var2, var1.n5(this));
      } else {
         super.n5(var1);
      }
   }

   public final g7 l6(int var1) {
      g7 var2 = null;
      g7[] var3 = new g7[]{var2};
      boolean var4 = !this.u3.tryGetValue(var1, var3);
      var2 = var3[0];
      if (var4) {
         return l5.n5;
      } else {
         return var2 != null ? var2 : l5.n5;
      }
   }

   public final g7 n5(int var1, g7 var2) {
      if (var1 >= this.n5) {
         this.n5 = var1 + 1;
      }

      this.u3.set_Item(var1, var2);
      return this.u3.get_Item(var1);
   }

   private void k5(int var1) {
      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("New length is out of range");
      }

      if (var1 < this.n5) {
         int var2 = this.a6(var1);
         if (var2 >= 0) {
            for (int var3 = this.u3.size() - 1; var3 >= var2; var3--) {
               this.u3.removeAt(var3);
            }
         }
      }

      this.n5 = var1;
   }

   @Override
   public boolean n5(String var1, g7[] var2) {
      var2[0] = l5.n5;
      int var3 = 0;
      int[] var4 = new int[]{0};
      boolean var5 = com.aspose.slides.ms.System.a3.n5(var1, var4);
      var3 = var4[0];
      if (var5) {
         this.u3.tryGetValue(com.aspose.slides.ms.System.z3.h0(var3), var2);
      } else {
         super.n5(var1, var2);
      }

      return var2[0] != l5.n5;
   }

   private int a6(int var1) {
      int[] var2 = new int[this.u3.getKeys().size()];
      int var3 = 0;
      IGenericEnumerator var4 = this.u3.getKeys().iterator();

      try {
         while (var4.hasNext()) {
            int var5 = com.aspose.slides.internal.v6g.k5.u3(var4.next(), int.class);
            var2[var3++] = var5;
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      int var11 = 0;
      int var6 = this.u3.size() - 1;

      for (int var7 = 0; var11 <= var6; var7 = (var11 + var6) / 2) {
         int var8 = var2[var7];
         if (var8 == var1) {
            return var7;
         }

         if (var8 > var1) {
            var6 = var7 - 1;
         } else {
            var11 = var7 + 1;
         }
      }

      return var11 < this.u3.size() ? var11 : -1;
   }

   @Override
   public void l6(String var1) {
      int var2 = 0;
      int[] var3 = new int[]{0};
      boolean var4 = com.aspose.slides.ms.System.a3.n5(var1, var3);
      var2 = var3[0];
      if (var4) {
         this.u3.removeItemByKey(var2);
      } else {
         super.l6(var1);
      }
   }

   public final u3 n5(j9 var1, g7[] var2) {
      SortedList var3 = new SortedList<>(this.u3);
      int var4 = this.n5;

      for (g7 var8 : var2) {
         u3 var9 = com.aspose.slides.internal.v6g.k5.n5(var8, u3.class);
         if (var9 == null) {
            if (var1.e2().l6(com.aspose.slides.internal.v6g.k5.n5(var8, j4.class))) {
               j4 var17 = (j4)var8;

               for (int var18 = 0; var18 < var17.k5(); var18++) {
                  Object var12 = null;
                  g7[] var13 = new g7[]{(g7)var12};
                  boolean var14 = var17.n5(com.aspose.slides.ms.System.a3.l6(var18), var13);
                  g7 var19 = var13[0];
                  if (var14) {
                     var3.addItem(var4 + var18, var19);
                  }
               }
            } else {
               var3.addItem(var4, var8);
               var4++;
            }
         } else {
            IGenericEnumerator var10 = var9.u3.iterator();

            try {
               while (var10.hasNext()) {
                  KeyValuePair var11 = (KeyValuePair)var10.next();
                  var3.addItem((Integer)var11.getKey() + var4, var11.getValue());
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
                  var10.dispose();
               }
            }

            var4 += var9.k5();
         }
      }

      return new u3(var3, var4, var1.e2().z1());
   }

   public final i9 n5(j9 var1, g7 var2) {
      if (this.n5 == 0) {
         return var1.c4().s7();
      }

      String var3 = var2 == l5.n5 ? "," : var2.toString();
      String[] var4 = new String[this.n5];
      g7 var5 = null;

      for (int var6 = 0; var6 < this.n5; var6++) {
         g7[] var7 = new g7[]{var5};
         boolean var8 = this.u3.tryGetValue(var6, var7);
         var5 = var7[0];
         if (var8) {
            if (var5 != y5.n5 && var5 != l5.n5) {
               var4[var6] = var5.toString();
            } else {
               var4[var6] = com.aspose.slides.ms.System.d1.n5;
            }
         } else {
            var4[var6] = com.aspose.slides.ms.System.d1.n5;
         }
      }

      return var1.c4().u9(com.aspose.slides.ms.System.d1.n5(var3, var4));
   }

   @Override
   public String toString() {
      List var1 = new List();
      IGenericEnumerator var2 = this.u9().iterator();

      try {
         while (var2.hasNext()) {
            g7 var3 = (g7)var2.next();
            var1.addItem(var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      String[] var7 = new String[var1.size()];

      for (int var4 = 0; var4 < var1.size(); var4++) {
         if (var1.get_Item(var4) != null) {
            var7[var4] = ((g7)var1.get_Item(var4)).toString();
         }
      }

      return com.aspose.slides.ms.System.d1.n5(",", var7);
   }

   @Override
   public IGenericEnumerable<String> a6() {
      return new u3$n5(this);
   }

   @Override
   public IGenericEnumerable<g7> u9() {
      return new u3$l6(this);
   }

   @Override
   public boolean k5(String var1) {
      int var2 = 0;
      int[] var3 = new int[]{0};
      boolean var4 = com.aspose.slides.ms.System.a3.n5(var1, var3);
      var2 = var3[0];
      if (!var4) {
         return super.k5(var1);
      } else {
         return var2 >= 0 && var2 < this.n5 ? this.u3.containsKey(var2) : false;
      }
   }

   @Override
   public double l6() {
      return this.k5();
   }

   @Override
   public boolean equals(Object obj) {
      return this == obj;
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }

   public u3(j4 var1) {
      super(var1);
   }

   private u3(SortedList<Integer, g7> var1, int var2, j4 var3) {
      super(var3);
      this.u3 = var1;
      this.n5 = var2;
   }

   // $VF: synthetic method
   static SortedList n5(u3 var0) {
      return var0.u3;
   }

   // $VF: synthetic method
   static IGenericEnumerable l6(u3 var0) {
      return var0.x8();
   }

   // $VF: synthetic method
   static IGenericEnumerable k5(u3 var0) {
      return var0.s7();
   }
}
