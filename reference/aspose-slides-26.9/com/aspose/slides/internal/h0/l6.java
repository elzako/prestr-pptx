package com.aspose.slides.internal.h0;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.d1;

public abstract class l6 implements com.aspose.slides.internal.k5.m3 {
   private List<l6$n5> n5;
   private com.aspose.slides.internal.u3.n5<Integer, Integer> l6;
   private h0 k5;

   protected l6(h0 var1) {
      this.k5 = var1;
      int var2 = var1.a6();
      this.n5 = new List<>(var2);
      this.l6 = new com.aspose.slides.internal.u3.n5<>(Integer.class, Integer.class, -1);
   }

   @Override
   public final IGenericEnumerator<String> iterator() {
      return new l6$n5$n5(this.n5);
   }

   @Override
   public String i2() {
      if (this.x7() == 0) {
         return d1.n5;
      }

      l6$n5 var1 = this.n5.get_Item(0);
      a5 var2 = new a5();
      var2.n5("{0}: {1}", this.l6().l6(var1.l6()), var1.n5());
      if (var1.k5()) {
         var2.n5(" !important");
      }

      var2.n5(";");

      for (int var3 = 1; var3 < this.x7(); var3++) {
         var1 = this.n5.get_Item(var3);
         var2.n5(" {0}: {1}", this.l6().l6(var1.l6()), var1.n5());
         if (var1.k5()) {
            var2.n5(" !important");
         }

         var2.n5(";");
      }

      return var2.toString();
   }

   @Override
   public void x0(String var1) {
      if (!d1.n5(var1)) {
         l6 var2 = this.n5(var1);
         if (var2.x7() != 0) {
            for (int var3 = 0; var3 < var2.x7(); var3++) {
               int var4 = var2.u3(var3);
               this.n5(var4, var2.k5(var3), var2.a6(var3));
            }
         }
      }
   }

   @Override
   public final String o2(String var1) {
      int var2 = this.l6().l6(var1);
      var2 = this.l6.n5(var2);
      return var2 == -1 ? null : this.n5.get_Item(var2).n5().u9();
   }

   public final com.aspose.slides.internal.k5.u9 l6(int var1) {
      int var2 = this.l6().u3(var1);
      var2 = this.l6.n5(var2);
      return var2 == -1 ? null : this.n5.get_Item(var2).n5();
   }

   @Override
   public final com.aspose.slides.internal.k5.u9 e0(String var1) {
      int var2 = this.l6().l6(var1);
      var2 = this.l6.n5(var2);
      return var2 == -1 ? null : this.n5.get_Item(var2).n5();
   }

   @Override
   public String i2(String var1) {
      int var2 = this.l6().l6(var1);
      int var3 = this.l6.n5(var2);
      if (var3 == -1) {
         return null;
      }

      String var4 = this.n5.get_Item(var3).n5().u9();
      this.n5.removeAt(var3);
      this.l6.l6(var2);
      return var4;
   }

   @Override
   public final String x7(String var1) {
      int var2 = this.l6().l6(var1);
      if (var2 == -1) {
         return null;
      } else {
         int var3 = this.l6.n5(var2);
         if (var3 == -1) {
            return d1.n5;
         } else {
            return this.n5.get_Item(var3).k5() ? "important" : d1.n5;
         }
      }
   }

   @Override
   public void n5(String var1, String var2, String var3) {
      int var4 = this.l6().l6(var1);
      if (var4 != -1) {
         if (!d1.n5(var2)) {
            String var5 = var3;
            if (var5 == null) {
               var5 = d1.n5;
            }

            var3 = var5;
            String var6 = d1.n5("{0}: {1} {2}",new Object[]{ var1, var2, var3});
            l6 var7 = this.n5(var6);
            if (var7.x7() != 0) {
               for (int var8 = 0; var8 < var7.x7(); var8++) {
                  int var9 = var7.u3(var8);
                  this.n5(var9, var7.k5(var8), var7.a6(var8));
               }
            }
         }
      }
   }

   protected l6 n5(String var1) {
      return (l6)this.l6().l6(var1, null);
   }

   @Override
   public final int x7() {
      return this.n5.size();
   }

   @Override
   public final String n5(int var1) {
      int var2 = this.l6.n5(var1);
      return var2 == -1 ? null : this.n5.get_Item(var2).n5().u9();
   }

   public n5 n5() {
      return null;
   }

   protected final h0 l6() {
      return this.k5;
   }

   public final com.aspose.slides.internal.k5.u9 k5(int var1) {
      return this.n5.get_Item(var1).n5();
   }

   public final int u3(int var1) {
      return this.n5.get_Item(var1).l6();
   }

   public final boolean a6(int var1) {
      return this.n5.get_Item(var1).k5();
   }

   public void n5(int var1, com.aspose.slides.internal.k5.u9 var2, boolean var3) {
      l6$n5 var4 = new l6$n5(null);
      var4.n5(var3);
      var4.n5(var1);
      var4.n5(var2);
      if (!this.l6.k5(var1)) {
         this.n5.addItem(var4);
         this.l6.n5(var1, this.n5.size() - 1);
      } else {
         int var5 = this.l6.n5(var1);
         this.n5.set_Item(var5, var4);
      }
   }

   public final void n5(String var1, com.aspose.slides.internal.k5.u9 var2, boolean var3) {
      this.n5(this.l6().l6(var1), var2, var3);
   }

   @Override
   public String toString() {
      return this.i2();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public n5 z0() {
      return this.n5();
   }

}
