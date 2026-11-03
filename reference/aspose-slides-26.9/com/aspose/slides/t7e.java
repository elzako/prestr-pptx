package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.ms.System.IDisposable;

final class t7e extends e8s {
   public final w1g n5 = new w1g();

   t7e(MathBlock var1, c0e var2, w1g var3) {
      super(var1, var2);
      var3.n5(this.n5);
      int var4 = 0;
      IGenericEnumerator var5 = var1.iterator();

      try {
         while (var5.hasNext()) {
            IMathElement var6 = (IMathElement)var5.next();
            w1g var7 = var3.n5();
            if (var4 > 0 && var7.x8 == 0) {
               var7.x8 = 1;
            }

            if (this.n5.e2 && com.aspose.slides.internal.v6g.k5.l6(var6, MathematicalText.class)) {
               MathematicalText var8 = (MathematicalText)var6;
               String var9 = var8.getValue();
               String[] var10 = com.aspose.slides.ms.System.d1.n5(var9, '&');

               for (int var11 = 0; var11 < var10.length; var11++) {
                  if (!com.aspose.slides.ms.System.d1.n5(var10[var11])) {
                     var8.setValue(var10[var11]);
                     this.n5(var8, var7.n5());
                     var4++;
                  }

                  if (var11 < var10.length - 1) {
                     var8.setValue("&");
                     this.n5(var8, var7.n5());
                     var4++;
                  }
               }

               var8.setValue(var9);
            } else {
               var7.e2 = false;
               this.n5(var6, var7.n5());
               var4++;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }
   }

   @Override
   protected y1m n5(d2k var1) {
      return n5(this.h0, this.n5.n5());
   }

   public static y1m n5(IGenericList<e8s> var0, w1g var1) {
      if (var0.size() == 0) {
         return new y1m();
      }

      if (var0.size() == 1) {
         return ((e8s)var0.get_Item(0)).u9();
      }

      n3y var2 = new n3y();

      for (int var3 = 0; var3 < var0.size(); var3++) {
         e8s var4 = (e8s)var0.get_Item(var3);
         n3y.n5(var2.l6(), var4.u9().l6.l6()).n5(var2);
      }

      y1m var10 = new y1m();
      var2.n5(var10.l6);
      float var11 = 0.0F;

      for (int var5 = 0; var5 < var0.size(); var5++) {
         e8s var6 = (e8s)var0.get_Item(var5);
         y1m var7 = var6.u9().n5();
         if (var1.x8 != 2 && com.aspose.slides.internal.v6g.k5.l6(var6, b4i.class) && var5 > 0) {
            float[] var8 = new float[]{var11};
            boolean var9 = n5((b4i)var6, (e8s)var0.get_Item(var5 - 1), var8);
            var11 = var8[0];
            if (var9 && com.aspose.slides.internal.v6g.k5.l6(var0.get_Item(var5 - 1), g5s.class)) {
               var11 += 7.0F * var1.a6 / 96.0F;
            }
         }

         float var12 = var2.n5 - var7.l6.n5;
         var6.l6(var11, var12);
         var11 += var7.n5;
         var10.n5 = var11;
         if (var1.x8 != 2 && com.aspose.slides.internal.v6g.k5.l6(var6, b4i.class) && var5 + 1 < var0.size()) {
            if (var5 > 0) {
               float[] var13 = new float[]{var11};
               n5((b4i)var6, (e8s)var0.get_Item(var5 - 1), (e8s)var0.get_Item(var5 + 1), var13);
               var11 = var13[0];
            } else {
               float[] var14 = new float[]{var11};
               n5((b4i)var6, null, (e8s)var0.get_Item(var5 + 1), var14);
               var11 = var14[0];
            }
         }

         if (var5 + 1 < var0.size()) {
            if (com.aspose.slides.internal.v6g.k5.l6(var0.get_Item(var5 + 1), w2k.class)
               && ((MathDelimiter)((e8s)var0.get_Item(var5 + 1)).t2).getBeginningCharacter() != '(') {
               var11 += p1e.n5(var1.a6);
            }

            if (com.aspose.slides.internal.v6g.k5.l6(var6, w2k.class)
               && ((MathDelimiter)var6.t2).getEndingCharacter() == ')'
               && !n5((e8s)var0.get_Item(var5 + 1))
               && com.aspose.slides.internal.v6g.k5.l6(var6.h0.get_Item(0), l4i.class)) {
               var11 += p1e.n5(var1.a6);
            }

            if (com.aspose.slides.internal.v6g.k5.l6(var6, k3i.class)
               || com.aspose.slides.internal.v6g.k5.l6(var6, g5s.class)
                  && com.aspose.slides.internal.v6g.k5.l6(var6.t2, MathSubscriptElement.class)
                  && com.aspose.slides.internal.v6g.k5.l6(var0.get_Item(var5 + 1), s7b.class)) {
               var11 += p1e.n5(var1.a6) * 0.8F;
            }
         }
      }

      return var10;
   }

   private static boolean n5(e8s var0) {
      b4i var1 = com.aspose.slides.internal.v6g.k5.n5(var0, b4i.class);
      if (var1 == null) {
         return false;
      }

      String var2 = var1.n5;
      return com.aspose.slides.internal.n2d.u9.d5(var2.charAt(0));
   }

   private static boolean n5(b4i var0, e8s var1, float[] var2) {
      String var3 = var0.n5;
      if (var3.length() < 1) {
         return false;
      }

      if (com.aspose.slides.internal.n2d.u9.d5(var3.charAt(0)) && (!com.aspose.slides.internal.v6g.k5.l6(var1, b4i.class) || !"=".equals(((b4i)var1).n5))) {
         if (com.aspose.slides.internal.v6g.k5.l6(var1, k3i.class)) {
            var2[0] += p1e.n5(var0.l6) * 0.3F;
            return true;
         }

         if (var3.charAt(0) == '=') {
            var2[0] += p1e.n5(var0.l6) * 1.3F;
         } else {
            var2[0] += p1e.n5(var0.l6);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void n5(b4i var0, e8s var1, e8s var2, float[] var3) {
      String var4 = var0.n5;
      if (var4.length() >= 1) {
         char var5 = var4.charAt(var4.length() - 1);
         if (com.aspose.slides.internal.n2d.u9.d5(var5) || var5 == ',') {
            if (com.aspose.slides.internal.v6g.k5.l6(var2, b4i.class)) {
               b4i var6 = (b4i)var2;
               if (!com.aspose.slides.ms.System.d1.n5(var6.n5) && com.aspose.slides.ms.System.t9.t9(var6.n5.charAt(0))) {
                  return;
               }
            }

            if (var4.charAt(0) == '=' && var1 != null) {
               var3[0] += p1e.n5(var0.l6) * 1.3F;
            } else {
               var3[0] += p1e.n5(var0.l6);
            }
         }
      }
   }
}
