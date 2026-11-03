package com.aspose.slides.internal.b7;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.IDisposable;

class w8d implements IGenericCloneable<w8d> {
   private double n5;
   private List<o3i> l6;

   public final double n5() {
      return this.n5;
   }

   public w8d(n7 var1) {
      this.l6 = new List<>();
      com.aspose.slides.internal.o9b.w1[] var2 = var1.c8();
      int[] var3 = var1.t2();
      if (var3.length > 1) {
         k0 var4 = this.n5(var2[0].u3()).u3();
         o3i var5 = null;

         for (int var6 = 1; var6 < var3.length; var6++) {
            if ((var3[var6] & 3) == 3) {
               l8r var7 = com.aspose.slides.internal.v6g.k5.n5(var5, l8r.class);
               var5 = new l8r(var4.u3(), this.n5(var2[var6].u3()).u3(), this.n5(var2[var6 + 1].u3()).u3(), this.n5(var2[var6 + 2].u3()).u3());
               var6 += 2;
               if (var7 != null) {
                  this.l6.removeItem(var7);
                  this.n5 = this.n5 - var7.n5();
                  var5 = var7.n5((l8r)var5);
               }
            } else {
               var5 = new x1f(var4.u3(), this.n5(var2[var6].u3()).u3());
            }

            this.l6.addItem(var5);
            this.n5 = this.n5 + var5.n5();
            if (var6 < var3.length) {
               this.n5(var2[var6].u3()).n5(var4);
            }
         }

         this.l6.trimExcess();
      } else {
         throw new ArgumentException("Path is empty", "path");
      }
   }

   public final w8d l6() {
      List var1 = new List(this.l6.size());
      List$Enumerator var2 = this.l6.iterator();

      try {
         while (var2.hasNext()) {
            o3i var3 = (o3i)var2.next();
            var1.addItem(var3.l6());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return new w8d(this.n5, var1);
   }

   public final w8d n5(double var1) {
      if (var1 == 0.0) {
         return this;
      }

      List var3 = new List(this.l6.size());
      double var4 = 0.0;
      List$Enumerator var6 = this.l6.iterator();

      try {
         while (var6.hasNext()) {
            o3i var7 = (o3i)var6.next();
            o3i var8 = var7.n5(var1);
            var3.addItem(var8);
            var4 += var8.n5();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      return new w8d(var4, var3);
   }

   public final k0 l6(double var1) {
      if (var1 < 0.0) {
         throw new ArgumentException("Offset can not be less than zero", "offset");
      }

      double var3 = this.n5 * var1;
      double var5 = 0.0;
      double[] var7 = new double[]{0.0};
      o3i var8 = this.n5(var3, var7);
      var5 = var7[0];
      return var8.l6(var5);
   }

   public final v2 n5(double var1, double var3, boolean var5) {
      if (var1 < 0.0) {
         throw new ArgumentException("Offset can not be less than zero", "offset");
      }

      if (var3 < 0.0) {
         throw new ArgumentException("Length can not be less than zero", "length");
      }

      double var6 = this.n5 * var1;
      double var8 = 0.0;
      double[] var10 = new double[]{0.0};
      o3i var11 = this.n5(var6, var10);
      var8 = var10[0];
      return var11.n5(var8, var3, var5);
   }

   private o3i n5(double var1, double[] var3) {
      o3i var4 = null;
      double var5 = 0.0;

      for (int var7 = 0; var7 < this.l6.size(); var7++) {
         var5 += this.l6.get_Item(var7).n5();
         if (var1 <= var5) {
            var4 = this.l6.get_Item(var7);
            break;
         }
      }

      if (var4 == null) {
         var4 = this.l6.get_Item(this.l6.size() - 1);
      }

      var3[0] = var4.n5() != 0.0 ? (var4.n5() - (var5 - var1)) / var4.n5() : 0.0;
      return var4;
   }

   private w8d(double var1, List<o3i> var3) {
      this.n5 = var1;
      this.l6 = var3;
   }

   private k0 n5(com.aspose.slides.internal.o9b.w1 var1) {
      return new k0(var1.l6(), var1.k5());
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public w8d cloneT() {
      return this.l6();
   }

}
