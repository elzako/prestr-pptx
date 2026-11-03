package com.aspose.slides.internal.w3u;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$ValueCollection$Enumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.o9b.c8;
import com.aspose.slides.internal.r1x.s7;
import com.aspose.slides.ms.System.IDisposable;

class u9 extends k5 {
   private Dictionary<Integer, a6> n5;

   public u9() {
   }

   @Override
   public com.aspose.slides.internal.b8u.a6 n5(int[] var1, int var2) {
      this.n5(var1);
      return this.u3(var2);
   }

   @Override
   public void n5(int[] var1) {
      super.n5(var1);
      if (this.n5 == null) {
         this.n5 = new Dictionary<>();
      }

      for (int var5 : var1) {
         byte var6 = (byte)(var5 >> 24);
         byte var7 = (byte)(var5 >> 16 & 0xFF);
         byte var8 = (byte)(var5 >> 8 & 0xFF);
         byte var9 = (byte)(var5 & 0xFF);
         int var10 = a6.n5(var7 & 255, var8 & 255, var9 & 255);
         a6 var11 = null;
         a6[] var12 = new a6[]{var11};
         boolean var13 = this.n5.tryGetValue(var10, var12);
         var11 = var12[0];
         if (var13) {
            var11.n5(var6 & 255, var7 & 255, var8 & 255, var9 & 255);
         } else {
            this.n5.addItem(var10, new a6(var6 & 255, var7 & 255, var8 & 255, var9 & 255));
         }
      }
   }

   public com.aspose.slides.internal.b8u.a6 u3(int var1) {
      List var2 = new List();
      Dictionary$ValueCollection$Enumerator var3 = this.n5.getValues().iterator();

      try {
         while (var3.hasNext()) {
            a6 var4 = (a6)var3.next();
            var2.addItem(var4);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      var2.sort();
      List var15 = new List();
      int var5 = var1 == 256 ? var1 - 4 : var1;
      List$Enumerator var6 = var2.iterator();

      try {
         while (var6.hasNext()) {
            a6 var7 = (a6)var6.next();
            if (var15.size() >= var5) {
               break;
            }

            var15.addItem(var7.n5().o8());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      for (int var16 = var15.size(); var16 < var1; var16++) {
         var15.addItem(((c8)var15.get_Item(0)).o8());
      }

      return new s7((c8[])var15.toArray(new c8[0]), false);
   }
}
