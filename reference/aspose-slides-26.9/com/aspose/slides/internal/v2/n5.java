package com.aspose.slides.internal.v2;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.IDisposable;

public class n5 extends s7 implements IGenericEnumerable<s7> {
   private final List<s7> n5 = new List<>();

   public final int n5() {
      return this.n5.size();
   }

   public final void n5(s7 var1) {
      this.n5.addItem(var1);
   }

   public final void n5(int var1) {
      this.n5.removeAt(var1);
   }

   public final s7 l6(int var1) {
      Object var2 = this.n5.get_Item(var1);
      if (com.aspose.slides.internal.v6g.k5.l6(var2, u9.class)) {
         var2 = ((u9)var2).k5();
      }

      if (var2 != null && var2.equals(c8())) {
         var2 = null;
      }

      return (s7)var2;
   }

   public final s7 k5(int var1) {
      return this.n5.size() > var1 ? this.n5.get_Item(var1) : null;
   }

   public final int u3(int var1) {
      return this.n5(var1, -1);
   }

   public final int n5(int var1, int var2) {
      int var3 = var2;
      if (var1 < this.n5()) {
         s7 var4 = this.n5.get_Item(var1);
         if (com.aspose.slides.internal.v6g.k5.l6(var4, t2.class)) {
            var3 = ((t2)var4).k5();
         }
      }

      return var3;
   }

   public final String a6(int var1) {
      return this.n5(var1, null);
   }

   public final String n5(int var1, String var2) {
      String var3 = var2;
      if (var1 < this.n5()) {
         s7 var4 = this.n5.get_Item(var1);
         if (com.aspose.slides.internal.v6g.k5.l6(var4, c8.class)) {
            var3 = ((c8)var4).n5();
         }
      }

      return var3;
   }

   public final float[] l6() {
      float[] var1 = new float[this.n5()];

      for (int var2 = 0; var2 < this.n5(); var2++) {
         s7 var3 = this.l6(var2);
         var1[var2] = com.aspose.slides.internal.v6g.k5.l6(var3, t2.class) ? ((t2)var3).u3() : 0.0F;
      }

      return var1;
   }

   public final void n5(float[] var1) {
      this.n5.clear();

      for (float var5 : var1) {
         this.n5(new a6(var5));
      }
   }

   @Override
   public String toString() {
      a5 var1 = new a5();
      var1.n5("[ ");
      List$Enumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            s7 var3 = (s7)var2.next();
            var1.n5(var3);
            var1.n5(' ');
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      var1.n5("]");
      return var1.toString();
   }

   public final y4 u9(int var1) {
      y4 var2 = null;
      s7 var3 = this.l6(var1);
      if (var3 != null && com.aspose.slides.internal.v6g.k5.l6(var3, y4.class)) {
         var2 = com.aspose.slides.internal.v6g.k5.n5(var3, y4.class);
      }

      return var2;
   }

   @Override
   public final IGenericEnumerator<s7> iterator() {
      return this.n5.iterator();
   }

   public final <T> List<T> n5(Class<T> var1) {
      List var2 = new List();

      for (int var3 = 0; var3 < this.n5.size(); var3++) {
         if (com.aspose.slides.internal.v6g.k5.l6(this.n5.get_Item(var3), var1)) {
            Object var4 = com.aspose.slides.internal.v6g.k5.n5(this.n5.get_Item(var3), var1);
            var2.addItem(var4);
         }
      }

      return var2;
   }
}
