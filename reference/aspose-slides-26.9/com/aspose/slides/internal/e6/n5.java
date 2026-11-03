package com.aspose.slides.internal.e6;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.v2.a6;
import com.aspose.slides.internal.v2.c8;
import com.aspose.slides.internal.v2.e2;
import com.aspose.slides.internal.v2.h0;
import com.aspose.slides.internal.v2.s7;
import com.aspose.slides.internal.v2.t2;
import com.aspose.slides.internal.v2.y4;
import com.aspose.slides.ms.System.z3;

public class n5<T> extends List<T> {
   private boolean n5;
   private com.aspose.slides.internal.v2.k5 l6;
   private c8 k5;
   private com.aspose.slides.internal.v2.n5 u3;

   public final com.aspose.slides.internal.v2.n5 n5() {
      return this.u3;
   }

   private void u3(com.aspose.slides.internal.v2.n5 var1) {
      this.u3 = var1;
   }

   public n5() {
      this.u3(new com.aspose.slides.internal.v2.n5());
   }

   public n5(List<T> var1, com.aspose.slides.internal.v2.n5 var2) {
      super(var1);
      this.u3(var2);
      if (this.size() != this.n5().n5()) {
         this.n5 = true;
      }
   }

   public n5(T var1, s7 var2, com.aspose.slides.internal.v2.k5 var3, c8 var4) {
      this.u3(new com.aspose.slides.internal.v2.n5());
      this.n5().n5(var2);
      this.addItem((T)var1);
      this.l6 = var3;
      this.k5 = var4;
   }

   public static n5<Float> n5(com.aspose.slides.internal.v2.n5 var0) {
      n5 var1 = null;
      if (var0 != null) {
         List var2 = new List(var0.n5());

         for (int var3 = 0; var3 < var0.n5(); var3++) {
            s7 var4 = var0.l6(var3);
            if (com.aspose.slides.internal.v6g.k5.l6(var4, t2.class)) {
               var2.addItem(((t2)var4).u3());
            } else {
               var2.addItem(Float.NaN);
            }
         }

         var1 = new n5(var2, var0);
      }

      return var1;
   }

   public static List<Integer> l6(com.aspose.slides.internal.v2.n5 var0) {
      n5 var1 = null;
      if (var0 != null) {
         n5 var2 = new n5();

         for (int var3 = 0; var3 < var0.n5(); var3++) {
            s7 var4 = var0.l6(var3);
            t2 var5 = com.aspose.slides.internal.v6g.k5.n5(var4, t2.class);
            if (var5 != null) {
               var2.addItem(var5.k5());
            }
         }

         var1 = new n5<>(var2, var0);
      }

      return var1;
   }

   public static <T> com.aspose.slides.internal.v2.n5 k5(List<T> var0) {
      com.aspose.slides.internal.v2.n5 var1 = null;
      if (var0 != null) {
         if (com.aspose.slides.internal.v6g.k5.l6(var0, n5.class)) {
            var1 = ((n5)var0).n5();
         } else {
            var1 = u3(var0);
         }
      }

      return var1;
   }

   public static List<String> k5(com.aspose.slides.internal.v2.n5 var0) {
      n5 var1 = null;
      if (var0 != null) {
         List var2 = new List();

         for (int var3 = 0; var3 < var0.n5(); var3++) {
            s7 var4 = var0.l6(var3);
            String var5 = ((c8)var4).n5();
            var2.addItem(var5);
         }

         var1 = new n5(var2, var0);
      }

      return var1;
   }

   private static <T> com.aspose.slides.internal.v2.n5 u3(List<T> var0) {
      com.aspose.slides.internal.v2.n5 var1 = new com.aspose.slides.internal.v2.n5();

      for (int var2 = 0; var2 < var0.size(); var2++) {
         Object var3 = var0.get_Item(var2);
         if (com.aspose.slides.internal.v6g.k5.l6(var3, String.class)) {
            y4 var4 = new y4((String)var3);
            var1.n5(var4);
         } else if (com.aspose.slides.internal.v6g.k5.l6(var3, Integer.class)) {
            long var5 = z3.t2(com.aspose.slides.internal.v6g.k5.u3(var3, int.class));
            h0 var7 = h0.n5(var5);
            var1.n5(var7);
         } else if (com.aspose.slides.internal.v6g.k5.l6(var3, Long.class)) {
            h0 var9 = h0.n5(com.aspose.slides.internal.v6g.k5.u3(var3, long.class));
            var1.n5(var9);
         } else if (com.aspose.slides.internal.v6g.k5.l6(var3, Float.class)) {
            a6 var10 = new a6(com.aspose.slides.internal.v6g.k5.u3(var3, float.class));
            var1.n5(var10);
         } else if (com.aspose.slides.internal.v6g.k5.l6(var3, Double.class)) {
            float var11 = z3.x8(var3);
            a6 var8 = new a6(var11);
            var1.n5(var8);
         } else if (com.aspose.slides.internal.v6g.k5.l6(var3, e2.class)) {
            e2 var12 = (e2)var3;
            s7 var13 = var12.t2();
            var1.n5(var13);
         } else {
            if (var3 != null) {
               throw new ArgumentException("Illegal converting of type to CosObject");
            }

            var1.n5(s7.c8());
         }
      }

      return var1;
   }
}
