package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.IDisposable;

class f1m {
   public final int n5;
   public int l6;
   public int k5;

   public f1m(int var1) {
      this.n5 = var1;
      this.l6 = -1;
      this.k5 = -1;
   }

   public f1m(int var1, int var2) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = -1;
   }

   public f1m(int var1, int var2, int var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   public static com.aspose.slides.internal.x4g.s7 n5(IGenericEnumerable<f1m> var0, IGenericList<d2k> var1) {
      com.aspose.slides.internal.x4g.s7 var2 = new com.aspose.slides.internal.x4g.s7();
      d2k var3 = d2k.k5.u3();
      d2k var4 = d2k.k5.u3();
      IGenericEnumerator var5 = var0.iterator();

      try {
         while (var5.hasNext()) {
            f1m var6 = (f1m)var5.next();
            switch (var6.n5) {
               case 0:
                  ((d2k)var1.get_Item(var6.l6)).n5(var3);
                  break;
               case 1:
                  d2k var16 = ((d2k)var1.get_Item(var6.l6)).u3();
                  d2k var18 = ((d2k)var1.get_Item(var6.k5)).u3();
                  d2k[] var20 = new d2k[]{var3};
                  d2k[] var21 = new d2k[]{var16};
                  d2k[] var22 = new d2k[]{var18};
                  n5(var2, var20, var21, var22, var22);
                  var20[0].n5(var3);
                  var21[0].n5(var16);
                  var22[0].n5(var18);
                  var18.n5(var3);
                  var16.n5(var4);
                  break;
               case 2:
               case 5:
               case 6:
                  d2k var15 = ((d2k)var1.get_Item(var6.l6)).u3();
                  d2k[] var17 = new d2k[]{var3};
                  d2k[] var19 = new d2k[]{var15};
                  n5(var2, var17, var19);
                  var17[0].n5(var3);
                  var19[0].n5(var15);
                  var15.n5(var3);
                  break;
               case 3:
                  d2k var7 = var4.u3();
                  var7.n5 = var7.n5 + 2.0F * (var3.n5 - var7.n5);
                  var7.l6 = var7.l6 + 2.0F * (var3.l6 - var7.l6);
                  d2k var8 = ((d2k)var1.get_Item(var6.l6)).u3();
                  d2k[] var9 = new d2k[]{var3};
                  d2k[] var10 = new d2k[]{var7};
                  d2k[] var11 = new d2k[]{var8};
                  n5(var2, var9, var10, var11, var11);
                  var9[0].n5(var3);
                  var10[0].n5(var7);
                  var11[0].n5(var8);
                  var8.n5(var3);
                  var7.n5(var4);
                  break;
               case 4:
                  var2.n3();
                  break;
               default:
                  throw new NotImplementedException();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      return var2;
   }

   private static void n5(com.aspose.slides.internal.x4g.s7 var0, d2k[] var1, d2k[] var2) {
      var0.n5(new com.aspose.slides.internal.o9b.w1(var1[0].n5, var1[0].l6), new com.aspose.slides.internal.o9b.w1(var2[0].n5, var2[0].l6));
   }

   private static void n5(com.aspose.slides.internal.x4g.s7 var0, d2k[] var1, d2k[] var2, d2k[] var3, d2k[] var4) {
      var0.n5(
         new com.aspose.slides.internal.o9b.w1(var1[0].n5, var1[0].l6),
         new com.aspose.slides.internal.o9b.w1(var2[0].n5, var2[0].l6),
         new com.aspose.slides.internal.o9b.w1(var3[0].n5, var3[0].l6),
         new com.aspose.slides.internal.o9b.w1(var4[0].n5, var4[0].l6)
      );
   }
}
