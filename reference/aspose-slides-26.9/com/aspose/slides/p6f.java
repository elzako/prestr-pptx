package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.InvalidDataException;
import com.aspose.slides.ms.System.IDisposable;

class p6f {
   private Dictionary<Integer, List<k2b>> n5 = new Dictionary<>();

   public p6f() {
   }

   public final int n5(int var1) {
      return this.n5.containsKey(var1) ? this.n5.get_Item(var1).size() : 0;
   }

   public final void n5(ChartDataCell var1, long var2, String var4) {
      int var5 = var1.getChartDataWorksheet().getIndex();
      List var6;
      if (this.n5.containsKey(var5)) {
         var6 = this.n5.get_Item(var5);
      } else {
         var6 = new List();
         this.n5.addItem(var5, var6);
      }

      k2b var7 = new k2b();
      var7.n5 = var1;
      var7.l6 = var2;
      if (com.aspose.slides.ms.System.d1.t2(var4, ":")) {
         int[] var8 = new int[]{var7.k5};
         int[] var9 = new int[]{var7.u3};
         int[] var10 = new int[]{var7.a6};
         int[] var11 = new int[]{var7.u9};
         com.aspose.slides.n5.n5(var4, var8, var9, var10, var11);
         var7.k5 = var8[0];
         var7.u3 = var9[0];
         var7.a6 = var10[0];
         var7.u9 = var11[0];
      } else {
         int[] var12 = new int[]{var7.k5};
         int[] var13 = new int[]{var7.u3};
         com.aspose.slides.n5.n5(var4, var12, var13);
         var7.k5 = var12[0];
         var7.u3 = var13[0];
         var7.a6 = var7.k5;
         var7.u9 = var7.u3;
      }

      var6.addItem(var7);
   }

   public final ChartDataCell n5(ChartDataCell var1, long var2) {
      int var4 = var1.getChartDataWorksheet().getIndex();
      ChartDataCell var5 = null;
      if (!this.n5.containsKey(var4)) {
         return var5;
      }

      List var6 = this.n5.get_Item(var4);
      List$Enumerator var7 = var6.iterator();

      try {
         while (var7.hasNext()) {
            k2b var8 = (k2b)var7.next();
            if (var8.l6 == var2) {
               if (var8.n5(var1.getColumn() + 1, var1.getRow() + 1)) {
                  var5 = var8.n5;
               }
               break;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
            var7.dispose();
         }
      }

      return var5;
   }

   public final long n5(ChartDataCell var1) {
      int var2 = var1.getChartDataWorksheet().getIndex();
      if (this.n5.containsKey(var2)) {
         List var3 = this.n5.get_Item(var2);
         List$Enumerator var4 = var3.iterator();

         try {
            while (var4.hasNext()) {
               k2b var5 = (k2b)var4.next();
               if (var1.t2().z1().u3 == var5.n5.t2().z1()) {
                  return var5.l6;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }
      }

      String var11 = "A master formula cell is not found for the cell {0}.";
      throw new InvalidDataException(com.aspose.slides.ms.System.d1.n5(var11, new Object[]{var1.a6()}));
   }
}
